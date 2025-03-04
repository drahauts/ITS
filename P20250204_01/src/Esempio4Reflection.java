import java.lang.reflect.Field;

public class Esempio4Reflection {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Persona p = new Persona();
		try {
			Field campoNome = Persona.class.getDeclaredField("nome");
			campoNome.setAccessible(true);
			
			System.out.println("Valore campo nome = " + campoNome.get(p));
			
			campoNome.set(p, "Luigi");
			
			System.out.println("Valore campo nome = " + campoNome.get(p));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
