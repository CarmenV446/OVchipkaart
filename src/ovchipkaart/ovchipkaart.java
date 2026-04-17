package ovchipkaart;

public class ovchipkaart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kaartlezer kaartlezer = new kaartlezer();
		OVpas OVpas = new OVpas();
		kaartlezer.statusCheck(OVpas);
		kaartlezer.saldoCheck(OVpas);
		kaartlezer.pasCheck(OVpas);

	}

}
