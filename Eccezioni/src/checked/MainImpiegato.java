package checked;

public class MainImpiegato {

	public static void main(String[] args) {
		Impiegato imp = new Impiegato("Mario", 1000);
		System.out.println(imp);
		
		try {
			imp.incrementaSalario(-500);
		} catch (incrementoNegativoException e) {
			System.out.println("Hai inserito un valore negativo o null");
		}
		System.out.println(imp);
	}

}
