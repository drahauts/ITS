
public class Contatore implements Runnable {

	private int contatore = 0;
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Contatore " + i);
		}
		incrementa();
	}
	public void incrementa() {
		contatore++;
		System.out.println("Contatore: " + contatore);
	}
}
