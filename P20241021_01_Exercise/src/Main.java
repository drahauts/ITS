public class Main {

	public static void main(String[] args) {
		for (int i = 0;i<10;i++) {
			Double num_random = Math.random();
			//System.out.println("Numero " + i + ": " + num_random + " ");
			System.out.println(((i < 9)?" ":"") + (i + 1) + ") " + num_random);
		}
		for (int i = 0;i<10;i++) {
			Double num_random = Math.random();
			System.out.printf("%2d)\t%4.3g\n", i+1, num_random);
		}
		/*
		 * System.out.printf è un metodo che vuolevcome parametri
		 * 1) una stringa di formato
		 * 2) un elenco di variabili i cui valori
		 *    saranno inseriti nella stringa risultante
		 *    in corrispondenza dei caratteri %<dgcs..> dove
		 *    d: intero
		 *    c: char
		 *    g: float
		 *    s: string
		 *    ...
		 *    Inoltre nella stringa di formato
		 *    \n => vai a capo a nuova riga
		 *    \r => vai a capo sulla riga corrente
		 *    \t => inserisci un tab
		 *    Tutto quello che non è %<...> oppure \.
		 *    viene riportato in stampa così com'è 
		 */
		int ni = 10;
		System.out.printf("Il numero è: %d\n", ni);
		
		int n2=44;
		System.out.printf("I numeri sono: %d, %d\n", ni, n2);
		
		System.out.printf("I numeri sono: (%d, %d)\n", ni, n2);
		
		/*
		 * Subito dopo il % e prima dei modificatori (d, f, g, s, b, ...)
		 * è possibile mettere un valore intero che indica la dimensione
		 * del campo
		 * se il valore è decimale allora posso scrivere
		 * <dimensioni totali>.<dimensioni dopo la virgola>
		 * esempio %7.3g => in totale 7 digit di cui 3 dopo la virgola
		 */
		
		System.out.printf("Numero libero: %07d\n", 987);
		System.out.printf("Numero libero: %07d\n", 1123987);
	}	
}