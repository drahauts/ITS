import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(GeneraStringaRandom(5));
		System.out.println(GeneraStringaRandom(12));
		System.out.println(GeneraStringaRandom(7));
		System.out.println(GeneraStringaRandom(4));
	}
	
	
	
	static public String  GeneraStringaRandom(int len) {
		String minuscole= "abcdefghijklmnopqrstuvwxyz";
		String maiuscole= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numeri = "0123456789";
		
		String all = minuscole+maiuscole +numeri;
		String res = "";
		
		
		for (int i = 0; i < len; i++) {
			res += all.charAt((int)(Math.random()*all.length()));
		}
		return res;
	}
	
	
	public static void StapaConCornice() {
		System.out.println("+------------------------------+");
	}
}
