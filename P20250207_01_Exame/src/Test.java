
public class Test {

	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone("A001", "Iphone 13", "Smartphone IOS", 750.0, "Iphone 13 128GB Red", 16);
		smartphone.aggiungiNegozio("Euronics");
		smartphone.aggiungiNegozio("MediaWorld");
		smartphone.aggiungiNegozio("Apple Store");
		
		Televisore tv = new Televisore("T007", "SAMSUNG", "TV 16K", 999.9, 55);
		tv.aggiungiNegozio("Euronics");
		tv.aggiungiNegozio("MediaWorld");
		tv.aggiungiNegozio("Amazon");
		
		Cliente cliente1 = new Cliente("C01", "Mario", "Rossi", "rossoMarietto", "mariorossi@example.it");
		Cliente cliente2 = new Cliente("C09", "Anna", "Bianchi", "bianchetta", "biancana@email.by");
		
		cliente1.acquistaProdotto(tv);
		cliente1.acquistaProdotto(smartphone);
		
		cliente2.acquistaProdotto(smartphone);
		
		stampa();
		cliente1.prodottiAcquistati();
		stampa();
		cliente2.prodottiAcquistati();
	}
	public static void stampa() {
		System.out.println("--------------------------------------------");
	}
}
