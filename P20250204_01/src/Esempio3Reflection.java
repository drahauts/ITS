import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Esempio3Reflection {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		String str = "Hello, world!";
		
		try {
			Method metodo = String.class.getMethod("toUpperCase");
			String risultato = (String) metodo.invoke(str);
			
			System.out.println("Risultato: " + risultato);
		
		
		}catch (NoSuchMethodException e) {
			e.printStackTrace();
		}catch (SecurityException e) {
			e.printStackTrace();
		}

	}

}
