import java.io.IOException;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) {
		new Filatrice(1).start();
		new Filatrice(2).start();
	}
}
class Filatrice extends Thread {
	int id;
	public Filatrice(int id) {
		this.id=id;
	}

	public void run() {
		String nomeFile = "/tmp/filatrice_" + id + ".dat";
		String[] tessuti = {"Cotone", "Lino", "Lana", "Seta", "Poliestere", "Nylon"};
		Random rng = new Random();
 
		//Creo l'object mapper per convertire in json al di fuori del ciclo
		ObjectMapper om = new ObjectMapper();
		
		while (true) {
			try {
				Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			//Genera tessuto e quantità
			String tessuto = tessuti[rng.nextInt(0, tessuti.length)];
			int metri = rng.nextInt(20, 60);
 
			//Per comodità utilizzo una classe produzione che contiene tessuto e metraggio
			Produzione prodotto = new Produzione(tessuto, metri);
 
			//Ora converto in stringa JSON
			String js;
			try {
				js = om.writeValueAsString(prodotto);
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					continue; //Riparto con il loop!! non posso scrivere
			}
 
			//Ora salvo su file
 
			var toAppend = Util.OpenFileForAppend(nomeFile);
 			try {
 				toAppend.write(js);
 				} catch (IOException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 					continue; //Riparto con il loop, non sono riuscito a aprire il file
 					}
 			try {
 				toAppend.close();
 				} catch (IOException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 					}
 			}
		}
	}

class Produzione{
	String prodotto;
	int metraggio;
	public Produzione(String prodotto, int metraggio) {
		super();
		this.prodotto = prodotto;
		this.metraggio = metraggio;
	}
}