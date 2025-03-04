import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionPrintData {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		try {
			Class persona = Class.forName("Persona");
			
			Object oggetto = persona.getDeclaredConstructor().newInstance();
			
			Method printDataMethod = persona.getDeclaredMethod("printData");
			printDataMethod.setAccessible(true);
			
			System.out.println("Nome della classe = " + persona.getName() + " con il suo metodo = " + printDataMethod);
			
			
			printDataMethod.invoke(oggetto);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
