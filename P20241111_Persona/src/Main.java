
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Studente> lstud = new LinkedList<Studente>();
		lstud.add(new Studente("pippo", 34, "altro",9));
		lstud.add(new Studente("pippo", 84, "altro",9));
		lstud.add(new Studente("pluto", 334, "altro",123239));
		lstud.add(new Studente("aaa cercasi", 24, "altro",9));
		//lstud.add((Studente)ParseClass.Parse(Studente.class));
		
		System.out.println("Studenti creati finora: " + lstud.getFirst().studentiCreati);
		System.out.println(lstud);
		
		 
		
		
		
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(1);
		System.out.println(li);
		
		//ORDINIAMO LA COLLECTIONS		
		Collections.sort(li);
		System.out.println(li);
				
		Collections.reverse(li);
		System.out.println(li);
		
		Collections.shuffle(li);
		System.out.println(li);
		
		System.out.println(Collections.max(li));
			
		System.out.println(Collections.min(li));
		

		Collections.sort(lstud);
		System.out.println(lstud);
		
		System.out.println(li.get(0));
		
		
		
		if (false) {
			Studente s1 = (Studente)ParseClass.Parse(Studente.class);
			System.out.println(s1);
		
			System.exit(-2);
			String s;
			Studente[] studenti = new Studente[4];
			studenti[0] = new Studente("pino",60, "cloud",1);
		
			Paziente[] pazienti = new Paziente[4];
			pazienti[0] = new Paziente("Marco", 215, "tutto", true);
		
		
			Persona[] persone = new Persona[8];
		
			persone[0] = studenti[0];
			persone[1] = pazienti[0];
			System.out.println(persone[0]);
		
		
			for(int i=0; i<persone.length; i++){
				
			}
			EssereVivente[] ev = new EssereVivente[8];
			<aList<EssereVivente> lev = new LinkedList<EssereVivente>();
		
		
	}

}
}
