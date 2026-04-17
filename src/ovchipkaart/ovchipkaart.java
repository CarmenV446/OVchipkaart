package ovchipkaart;


public class ovchipkaart {

	public static void main(String[] args) {
		kaartlezer kaartlezer = new kaartlezer();
        OVpas OVpas = new OVpas(1, 20, 2017, 20.00, true);
        OVpas OVpas2 = new OVpas(2, 24, 2020, 15.00, false);

        
        kaartlezer.reis(OVpas);     
        kaartlezer.reis(OVpas2);        

	}
        
}
