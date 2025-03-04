import org.apache.logging.log4j.*;
public class Log4jDemo {
	
	private static Logger log4logger = LogManager.getLogger(Log4jDemo.class.getName());
	
	public static void main(String[] args) {
		System.out.println("Demo Log4j");
		log4logger.info("Log4j Info");
		log4logger.debug("Log4j Debug");
		log4logger.warn("Log4j Warning");
		log4logger.error("Log4j Error");
		log4logger.fatal("Log4j Fatal");
	}
}
