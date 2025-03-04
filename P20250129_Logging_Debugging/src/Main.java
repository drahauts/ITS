import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcolatrice c = new Calcolatrice();
		
		int somma = c.Somma(10, 12);
		System.out.println(somma);
		
		int sottrazione = c.Sottrazione(12, 7);
		System.out.println(sottrazione);
		
		double divisione = c.Divisione(somma, sottrazione);
		System.out.println(divisione);
		
		int multi = c.Moltiplicazione(11, 12);
		System.out.println(multi);
		
		
		
	}
	
	

}
