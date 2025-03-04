
public class Mutaforma {

	public static void main(String[] args) {
		int a = Somma(10, 20);
		System.out.println(a);
		
		double b = Somma(10.1, 20.0);
		System.out.println(b);
	}

	private static double Somma(double d, double e) {
		return  d + e;
	}

	private static int Somma(int i, int j) {
		return i + j;
	}

}
