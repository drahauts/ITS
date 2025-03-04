
public class Esercizio {

	public static void main(String[] args) {
/*
* Realizzare una classe Computer con i seguenti attributi
	* - Prezzo	- type (double)
	* - Peso	- type (double)
	* - Dimensioni (larghezza, altezza, profondità) type(?)
	* - Produttore - type( Stringa)
	* - Anno di produzione - type (Int)
	* 
	* Nel main creare degli oggetti di tipo Computer
	* e stampare il loro contenuto
	* 
	* NB: ricordate di utilizzare getter, setter e costruttore
	* generati da eclipse
	* 
	* Bonus: aggiungere un metodo alla classe Computer 
	* che stampi quanti oggetti (di tipo Computer) sono stati creati
*/

		
		Dimensioni dimensioni1 = new Dimensioni(10.1, 5.0, 3);
		Dimensioni dimensioni2 = new Dimensioni(8, 3, 3);
		Dimensioni dimensioni3 = new Dimensioni(12, 7, 5);
		Dimensioni dimensioni4 = new Dimensioni(11, 4, 9);
        
		Computer computer1 = new Computer(1200.99, 1.5, "Dell", dimensioni1, 2023);
		Computer computer2 = new Computer(599.99, 2, "HP", dimensioni2, 2020);
		Computer computer3 = new Computer(1499.99, 1.3, "Apple", dimensioni3, 2024);
		Computer computer4 = new Computer(120, 50, "HP", dimensioni4, 2004);
		
		
		System.out.println("Prezzo random: " + computer1.getPrezzo());
		System.out.println("Prezzo random: " + computer1.getPrezzo());
		System.out.println("Prezzo random: " + computer1.getPrezzo());
		System.out.println("Prezzo random: " + computer1.getPrezzo());
		System.out.println("Oggeti creati di tipo Computer: "+ Computer.num_pc);
        System.out.println("Oggeti creati di tipo Dimensioni: "+ Dimensioni.n);
        
	}
	
	public static void new_line() {
		System.out.println("-".repeat(30));
	}
}

