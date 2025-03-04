import java.lang.reflect.InvocationTargetException;

public class Esempio5Reflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		
		try {
			Class data = Class.forName("java.util.Date");
		 	
			Object oggetto = data.getDeclaredConstructor().newInstance();
			
			System.out.println("Nome della classe = " + data.getName());
			
			System.out.println("Nome dell'oggetto = " + oggetto.toString());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
