
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CasellaPosta casella = new CasellaPosta();
		
		Lettore lettore = new Lettore(casella);
		Scrittore scrittore = new Scrittore(casella);
		
		scrittore.start();
		lettore.start();
	}

}
