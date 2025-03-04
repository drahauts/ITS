import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calcolatrice {
	//Costruire una classe calcolatrice con 4 metodi
	// somma, sottrazione, divisione e moltiplicazione
	//e inserire i log nei vari metodi con le varie priorità.
	
	private static Logger logger = Logger.getLogger(LogConsole.class.getName());

	static {
		logger.setUseParentHandlers(false);
		logger.setLevel(Level.ALL);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINEST);
		logger.addHandler(handler);
		
	}
	
	public int Somma(int a, int b) {
		logger.info("La somma e stata eseguita"	);
		return a + b;
	}
	
	public int Sottrazione(int a, int b) {
		logger.info("La sottrazione e stata eseguita");
		return a - b;
	}
	
	public double Divisione(int a, int b) {
		logger.info("La divisione e stata eseguita");
		return a / b;
	}
	
	public int Moltiplicazione(int a, int b) {
		logger.info("La moltiplicazione e stata eseguita");
		return a * b;
	}
	
}
