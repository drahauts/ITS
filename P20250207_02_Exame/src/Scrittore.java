
public class Scrittore extends Thread{
	private CasellaPosta casella;

	public Scrittore(CasellaPosta casella) {
		this.casella = casella;
	}
	
	@Override
	public void run() {
		int i = 1;
		while(i <= 10) {
			String messaggio = "Messaggio " + i;
			casella.scriviMessaggio(messaggio);
			i++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
