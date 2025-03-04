
public class Main {

	public static void main(String[] args) {
		int [] vint;
		vint = new int[100];
		
		double [] vdou;
		vdou = new double[100];
		// inserire in vint i numeri da 1 a 100
		// in posizione 0 metto 1, poi 2, poi 3
		for (int i = 0; i < vint.length; i++) {
			vint[i] = i+1;
		}
		
		//StampaVint(vint);
		
		for (int i = 0; i < vint.length; i++) {
			vint[i] = (i+1)*2;
		}
		//StampaVint(vint);
		
		for (int i = 0; i < vint.length; i++) {
			vint[i] = (i+1)*2-1;
		}
		//StampaVint(vint);
		for (int i = 1; i <= vdou.length; i++) {
			vdou[i -1] = 1.0/i;
		}
		//StampaVdou(vdou);
		
		vint[0] = 1;
		vint[1] = 1;
		for (int i = 2; i < vint.length; i++) {
			vint[i] = vint[i - 1] + vint[i-2];
		}
		//StampaVint(vint);
		
		// Inserire in vint i numeri primi in sequenza: 2, 3, 5, 7, 11, 13, 17, 19 , 23, ...
		// Crivello di Eratostene
		// Implementare il crivello di eratostene e stampare i primi 10000 numeri primi
		
		
		//Eratostene(10000);
		
		
		// Stampare il Fattoriale di un numero n
		// System.out.println(Fattoriale(20));
		// System.out.println(Fact(20));
		
		
		
		// Inserire nel vettore vdou la seguente serie geometrica
		// 1, 1/2, 1/(2*2), 1/(2*2*2)
		for (int i = 0; i<100; i++) {
			vdou[i] = 1.0 / Math.pow(2, i);
		}
		// StampaVdou(vdou);
		
		
		// la stessa cosa ma senza Math.pow
		for (int i = 0; i<100; i++) {
			// Calcolo 2^i
			double dueAllaI = CalcolaDueAllaI(i);
			vdou[i] = 1. / dueAllaI;
		}
		// StampaVdou(vdou);
		
						
	}
	
	private static double CalcolaDueAllaI(int i) {
		double res = 1.0;
		for (int k = 1; k < i; k++) {
			res = res * 2.0;
		}
		return res;
	}
	
	
	// Soluzione ricorsiva
	private static int Fact(int N) {
		if (N == 0)
			return 1;
		else
			return N * Fact(N-1);
	}
	
	// Soluzione Iterativa
	private static int Fattoriale(int N) {
		int p = 1;
		for (int i = 2; i <= N; i++) {
			p *= i;
		}
		return p;
	}

	private static void Eratostene(int N) {
		boolean [] V = new boolean[1000000000];
		for (int i = 2; i < V.length; i++) {
			V[i] = true;
		}
		// dato che la creazione di un vettore inizializza i suoi valori
		// al valore di default, tutti gli elementi di V sono stati messi a "false"
		// con for abbiamo messo a "True" gli elemnti da 2 in poi.
		// o non e primo, e anche 1 non lo consideriamo primo
		
		
		// Ora il ciclo per determinare i primi
		int numeriprimi = 0;
		
		for (int i = 2; i < V.length; i++) {
			if (V[i] == true) {
				System.out.println(i + " e il " + ++numeriprimi + "-esimo numero primo");
				
				// tolgo tutti i suoi multipli( metto a false)
				for (int k = i + i; k < V.length; k+= i) {
					V[k]=false;
				}
			}
		}
	}


	private static void StampaVdou(double[] vdou) {
		for (double v: vdou) {
			System.out.print(v + " ");
		}
		System.out.println();
	}

	private static void StampaVint(int[] vint) {
		for (int v: vint) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
}
