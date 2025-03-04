import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Creazione delle liste
        List<Motociclo> motocicli = new ArrayList<>();
        List<Autovettura> autovetture = new ArrayList<>();

        // Inserimento di 10 elementi per lista
        motocicli.add(new Motociclo(2, "Benzina", 100.0, 6.0));
        motocicli.add(new Motociclo(2, "Elletrico", 150.0, 7.0)); 
        motocicli.add(new Motociclo(2, "Diesel", 110.0, 6.4));
        motocicli.add(new Motociclo(2, "Benzina", 120.0, 5.4));
        motocicli.add(new Motociclo(2, "Benzina", 125.0, 5.0));
        motocicli.add(new Motociclo(2, "Benzina", 100.0, 7.4));
        motocicli.add(new Motociclo(2, "Benzina", 113.0, 6.3));
        motocicli.add(new Motociclo(2, "Benzina", 142.0, 8.0));
        motocicli.add(new Motociclo(2, "Benzina", 118.0, 5.4));
        motocicli.add(new Motociclo(2, "Benzina", 157.0, 6.0));
        Collections.sort(motocicli);
        System.out.println("Motocicli ordinati:");
        for (Motociclo moto : motocicli) {
            System.out.println("Cilindrata: " + moto.getCilinrdata() +
                               ", Max Speed: " + moto.getMaxSpeed() +
                               ", Consumo: " + moto.getConsumo() +
                               ", Carburante: " + moto.getCarburante() +
                               ", Numero ruote: " + moto.getNum_ruote());
        }
        
        autovetture.add(new Autovettura(4, "Metano", 120.0, 11.5));
        autovetture.add(new Autovettura(4, "Benzina", 115.0, 10.9));
        autovetture.add(new Autovettura(4, "GPL", 110.0, 12.0));
        autovetture.add(new Autovettura(4, "Diesel", 123.0, 12.1));
        autovetture.add(new Autovettura(4, "Metano", 118.7, 11.4));
        autovetture.add(new Autovettura(4, "GPL", 121.4, 12.7));
        autovetture.add(new Autovettura(4, "Benzina", 125.3, 11.5));
        autovetture.add(new Autovettura(4, "Diesel", 142.2, 11.4));
        autovetture.add(new Autovettura(4, "Diesel", 178.5, 12.2));
        autovetture.add(new Autovettura(4, "Benzina", 112.4, 12.4));
        Collections.sort(autovetture);
        System.out.println("Autovetture ordinati: ");
        for (Autovettura auto : autovetture) {
        	System.out.println("Cilindrata: " + auto.getCilinrdata() +
        			", Max Speed: " + auto.getMaxSpeed() + 
        			", Consumo: " + auto.getConsumo() + 
        			", Carburante: "+ auto.getCarburante() + 
        			", Numero ruote: " + auto.getNum_ruote());
        }
        List<Automezzo> automezzo = new ArrayList<>();
        
        automezzo.add(new Autovettura(4, "Metano", 120.0, 11.5));
        automezzo.add(new Autovettura(4, "GPL", 110.0, 12.0));
        automezzo.add(new Autovettura(4, "Benzina", 125.3, 11.5));
        automezzo.add(new Autovettura(4, "Diesel", 142.2, 11.4));
        automezzo.add(new Autovettura(4, "Benzina", 115.0, 10.9));
        automezzo.add(new Motociclo(2, "Benzina", 142.0, 8.0));
        automezzo.add(new Motociclo(2, "Benzina", 100.0, 7.4));
        automezzo.add(new Motociclo(2, "Elletrico", 150.0, 7.0));
        automezzo.add(new Motociclo(2, "Benzina", 142.0, 8.0));
        automezzo.add(new Autovettura(1, "Benzina", 112.4, 12.4));
        Collections.shuffle(automezzo);
	}
}