
public class Lettore extends Thread{
	private CasellaPosta casella;
	
	public Lettore(CasellaPosta casella) {
		this.casella = casella;
	}
	
	@Override
	public void run() {
		while(true) {
			String messaggio = casella.leggiMessaggio();
			System.out.println("Lettore ha ricevuto: " + messaggio);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
