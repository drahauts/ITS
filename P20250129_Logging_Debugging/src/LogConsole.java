import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LogConsole{
	private static Logger logger = Logger.getLogger(LogConsole.class.getName());
	
	static {
		logger.setUseParentHandlers(false);
		logger.setLevel(Level.ALL);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINEST);
		logger.addHandler(handler);
		
	}
	public static void main(String[] args) {
		logger.severe("This is a SEVERE error message");
		logger.warning("This is a WARNING message");
		logger.info("This is a INFO message");
		logger.config("This is a CONFIG message");
		logger.fine("This is a FINE debug message");
		logger.finer("This is a FINER debug message");
		logger.finest("This is a FINEST debug message");
		
	}
	
}
