import java.lang.reflect.Method;


public class Esempio2Reflection {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("Calcolatrice");
			
			Method [] metodi = c.getDeclaredMethods();
			
			System.out.println("Nome della classe " + c.getName());
			
			for(Method metodo : metodi) {
				System.out.println("Metodo = " + metodo.getName());
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
