import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		
		// Create una lista con 10 elementi Wifi casuali
		LinkedList<WiFi> lwifi = new LinkedList<WiFi>();
		for (int i = 0; i < 10; i++) {
			lwifi.add(WiFi.MakeWifi());
		}

		System.out.println(lwifi);

		// Domanda:La potreste stampare in formato CSV poiché
		// dobbiamo passarla al vostro collega Onisa?
		for (var x : lwifi) {
			String a = String.format("%s,%s,%s,%f\n", x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			System.out.print(a);
			
			System.out.printf("%s,%s,%s,%f\n", x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
		}
		
		// Scrittura della lista sul FILE!!
		var fou = Util.OpenFileForWriting("wifi.dat");
		for (var x : lwifi) {
			String a = String.format("%s,%s,%s,%f\n", x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			fou.write(a);
		}
		fou.close();
		
		// Svuoto la lista
		lwifi.clear();
	
		//Rileggo la lista da file
		BufferedReader fin = Util.OpenFileForReading("wifi.dat");
		String riga = fin.readLine();
		while(riga != null) {
			// Uso la riga e poi leggo la successiva
			// Come posso modificare in <.> la <,> del
			// numero reale (nel mio caso l'ultima virgola della stringa)
			
//riga = new StringBuilder(new StringBuilder(riga).reverse().toString().replaceFirst(",", ".")).reverse()
//			.toString();
			String[] items = riga.split(",");
			WiFi it = new WiFi(items[0], items[1], items[2], Double.parseDouble(items[3]));
					
			//aggiungo elemtno nella lista!
			lwifi.add(it); 		
			System.out.println(riga);
			riga = fin.readLine();
		}
		fin.close();
		// Ora ho letto la lista e la ho ricostruita!
		
		WiFi appo = WiFi.MakeWifi();
		
		// Dichiaro la stringa che conterra la descrizione in formato JSON
		String jsonString;
		ObjectMapper objectMapper = new ObjectMapper();
		jsonString = objectMapper.writeValueAsString(appo);
		
		System.out.println(jsonString);
		
		
		
		WiFi nuovo = objectMapper.readValue(jsonString, WiFi.class);
		System.out.println(nuovo);
		
		
		// Salvate su File la wifi ma stavolta in formato JSON
		// e non in formato CSV e poi la rileggete da capo
		fou = Util.OpenFileForWriting("wifi.txt");
		for (var x : lwifi) {
			// Converto x in JSON e poi faccio la write sul file
			String a = objectMapper.writeValueAsString(x);
			fou.write(a+"\n");
		}
		fou.close();
		
		
		// Contrario
		lwifi.clear();
		fin = Util.OpenFileForReading("wifi.txt");
		riga = fin.readLine();
		while(riga != null) {
			WiFi it = objectMapper.readValue(riga, WiFi.class);
			lwifi.add(it);
			riga = fin.readLine();
		}
		fin.close();
		
		// Per verifica la stampa
		System.out.println(lwifi);
		
		
		// Si potrebbe fare meglio di cosi????
		
		String listaJson = objectMapper.writeValueAsString(lwifi);
		System.out.println(listaJson);
		
		lwifi.clear();
		
		lwifi = objectMapper.readValue(listaJson, lwifi.getClass());
		System.out.println(lwifi);

	}
}