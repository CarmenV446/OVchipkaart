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
			//dus dan krijgt hij een false terug want dan mag hij niet verder
		}
		else {
			return true;
		}
	}
	
	public boolean pasCheck(OVpas pas) {
		if (pas.getPasnummer() == 1); {
			return true;
		}
	}
	
	
	
	
	
	
	
}
