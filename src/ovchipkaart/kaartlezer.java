package ovchipkaart;

import java.util.Scanner;

public class kaartlezer {
	private double sumsaldo;
	private int reisKM;
	private int nieuwKM;
	
	
	public int inputKM() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how  many km did u travel?");
    int KM = sc.nextInt();
    reisKM = KM;
    return reisKM;
	}
	
	public boolean saldoCheck(OVpas pas) {
		if (pas.getSaldo() < 15) {
		return false;
		}
		else {
			return true;
		}

	}
	public boolean statusCheck(OVpas pas) {
		if  (pas.getStatus() == true) {
			return false;
			//als status op true staat dan betekent dat hij ingecheckt is 
		}
		else {
			return true;
		}
	}
	
	public boolean pasCheck(OVpas pas) {
		if (pas.getPasnummer() >= 1 && pas.getVervaljaar() > 2015); {
			return true;
		}
	}
	
	public double saldoBerekening(OVpas pas) {
		sumsaldo = pas.getSaldo() - (reisKM * 0.65);
		pas.setSaldo(sumsaldo);
		System.out.println("Saldo: " + sumsaldo);
		return sumsaldo;
	}
	public int KMBerekening(OVpas pas) {
		nieuwKM = pas.getHuidigKM() - reisKM;
		pas.setHuidigeKM(nieuwKM);
		return nieuwKM;
	}
	
	
	public void uitchecken(OVpas pas) {
		if (statusCheck(pas) == true) {
			inputKM();
			KMBerekening(pas);
			saldoBerekening(pas);
			System.out.println("je bent uitgecheckt");
			pas.setStatus(false);
		}
		else System.out.println("Er is iets mis gegaan met uitchecken");
			
			
			
		
	}
	
	public void inchecken(OVpas pas) {
		if (saldoCheck(pas) == true && pasCheck(pas) == true && statusCheck(pas) == false) {
			System.out.println("Je bent ingecheckt");
			pas.setStatus(true);
		}
		else System.out.println("Er is iets mis gegaan met inchecken");
	}
	
	
	public void opwaarderen(OVpas pas) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("hoeveel euro wil je op je kaart zetten?");
	    double opwaardering = sc.nextInt();
	    sumsaldo = pas.getSaldo() + opwaardering;
	    pas.setSaldo(sumsaldo);
	    System.out.println("Nieuwe saldo: " + sumsaldo);

	    

	}
	
	public void reis(OVpas pas) {
    	System.out.println("pasnummer: " + pas.getPasnummer());
		Scanner sc = new Scanner(System.in);
        boolean terug;        
        do {
        terug = false;
        System.out.println("Kies uit the volgende keuzes: 1 voor inchecken, 2 voor uitchecken, 3 voor opwaarderen en druk op een andere getal als je wilt stoppen");
        switch(sc.nextInt()) {
        case 1:
        	inchecken(pas);
          break;
        case 2:
        	uitchecken(pas);
        	break;
        case 3:
        	opwaarderen(pas);
        	break;
        default:
        	System.out.println("Je stopt nu");
        	terug = true;
        	
      }
        } while (terug == false);

		
	}
	
	
	
	
	
}
