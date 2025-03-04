import java.lang.reflect.Field;

public class ReflectionNomePersona {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Persona p = new Persona();
		

		try {
			Field campoNome = Persona.class.getDeclaredField("nome");
			campoNome.setAccessible(true);
			
			System.out.println("Nome della Persona = " + campoNome.get(p));
			
			campoNome.set(p, "Vladimir");
			System.out.println("Nome della persona dopo il set = " + campoNome.get(p));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
