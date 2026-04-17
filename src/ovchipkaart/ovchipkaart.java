package ovchipkaart;

public class ovchipkaart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kaartlezer kaartlezer = new kaartlezer();
		OVpas OVpas = new OVpas();
		if (kaartlezer.statusCheck(OVpas) == false && kaartlezer.saldoCheck(OVpas) && kaartlezer.pasCheck(OVpas))
				{
			System.out.println("je gaat nu inchecken");
			OVpas.setStatus(true);
		}


	}

}
