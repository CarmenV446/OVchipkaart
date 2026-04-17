package ovchipkaart;

public class ovchipkaart {

	public static void main(String[] args) {
		kaartlezer kaartlezer = new kaartlezer();
        OVpas OVpas = new OVpas();
		kaartlezer.inchecken(OVpas);
		kaartlezer.uitchecken(OVpas);

	}

}
