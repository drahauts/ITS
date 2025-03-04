import java.util.ArrayList;
import java.util.List;


public class CasellaPosta{
	private final List<String> messaggi = new ArrayList<>();
	private final int max_mess = 10;
	
	public synchronized void scriviMessaggio(String messaggio) {
		while(messaggi.size() == max_mess) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		messaggi.add(messaggio);
		System.out.println("Messaggio scritto: " + messaggio);
		notify();
	}
	
	public synchronized String leggiMessaggio() {
		while(messaggi.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String messagio = messaggi.remove(0);
		notify();
		return messagio;
	}
}
