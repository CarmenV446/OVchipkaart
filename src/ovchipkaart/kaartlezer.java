package ovchipkaart;

public class kaartlezer {
	private double sumsaldo;
	private int reisKM;
	private int nieuwKM;
	
	
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
		if (pas.getPasnummer() == 1 && pas.getVervaljaar() > 2015); {
			return true;
		}
	}
	
	public double saldoBerekening(OVpas pas) {
		sumsaldo = pas.getSaldo() - (reisKM * 0.65);
		pas.setSaldo(sumsaldo);
		return sumsaldo;
	}
	public int KMBerekening(OVpas pas) {
		nieuwKM = pas.getHuidigKM() - reisKM;
		pas.setHuidigeKM(nieuwKM);
		return nieuwKM;
	}
	
	
	public void uitchecken(OVpas pas) {
		if (pas.getStatus() == true) {
			KMBerekening(pas);
			saldoBerekening(pas);
			pas.setStatus(false);
			
		}	
		else inchecken(pas);
	}
	public void inchecken(OVpas pas) {
		if (statusCheck(pas) == true) {
			uitchecken(pas);
		}
		else if (saldoCheck(pas) == true && pasCheck(pas) == true) {
			System.out.println("Je bent ingecheckt");
			pas.setStatus(true);
		}
		else System.out.println("Er is iets mis gegaan met inchecken");
	}
	// KMBerekening kunnen pas bemaakt worden als uitcheck ook is gemaakt
	
	
	
	
	
	
	
}
