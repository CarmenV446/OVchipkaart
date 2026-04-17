package ovchipkaart;

public class OVpas {
	private double saldo;
	private boolean status;
	private int huidigeKM;
	private int pasnummer;
	private int vervaljaar;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getHuidigKM() {
		return huidigeKM;
	}
	public void setHuidigeKM(int nieuwKM) {
		this.huidigeKM = nieuwKM;
	}
	
	public int getPasnummer() {
		return pasnummer;
	}
	public int getVervaljaar() {
		return vervaljaar;
		
	}

	 // Constructor
    public OVpas(int n, int h, int j, double s, boolean st) {
    	pasnummer = n;
    	huidigeKM = h;
    	vervaljaar = j;
    	saldo = s;
    	status = st;

    }


	
}
