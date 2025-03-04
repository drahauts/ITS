import java.lang.module.ModuleDescriptor.Exports.Modifier;
import java.lang.reflect.Constructor;

public class Reflection_ex_9 {
	public static void main(String [] args) {
		try {
			Class animaleClass = Class.forName("Animale");
			
			Constructor[] costruttori = animaleClass.getDeclaredConstructors();
			
			for(Constructor costruttore : costruttori) {
				int modificatori = costruttore.getModifiers();
				String modificatoriStr = Modifier.toString();
			}
		}
	}
}
