
public class Calcolatrice {
	public static void main(String[] args) {
		Calcolatrice c = new Calcolatrice();
		System.out.println("La somma è: " + c.somma(3,2));
		System.out.println("La sottrazione è: " + c.sottrazione(10, 5));
		System.out.println("La moltiplicazione è:" + c.moltiplicazione(10, 11));
		System.out.println("La divisione è: " + c.divisione(21, 3));
	}
	
	public int somma(int a, int b) {
		return a + b;		
	}
	
	public int sottrazione(int a, int b) {
		return a - b;
	}
	
	public int moltiplicazione(int a, int b) {
		return a * b;
	}
	
	public double divisione(double a, double b) {
		return a / b;
	}
}
