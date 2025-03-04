
public class Computer {
	
	private double prezzo;
	private double peso;
	private int anno_produzione;
	private String produttore;
	private Dimensioni dimensioni;
	
	static int num_pc = 0;
	
	public Computer(double prezzo, double peso, String produttore, Dimensioni dimensioni, int anno_produzione) {
		this.prezzo = prezzo;
		this.peso = peso;
		this.produttore = produttore;
		this.dimensioni = dimensioni;
		this.anno_produzione = anno_produzione;
		num_pc ++;
	}
	public Computer() {}
	
	public void stampa() {
		System.out.println("Prezzo: " + prezzo + " $");
		System.out.println("Peso: " + peso + " gr");
		System.out.println("Produttore " + produttore);
		System.out.println("Dimensioni del pc. Larghezza x altezza x profondita\n" + dimensioni.getLarghezza() + " x " + dimensioni.getAltezza() + " x " + dimensioni.getProfondita());
		System.out.println("Anno di produzione: " + anno_produzione);
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getAnno_produzione() {
		return anno_produzione;
	}
	public void setAnno_produzione(int anno_produzione) {
		this.anno_produzione = anno_produzione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = Math.random()*(2000-1000)+1000;
	}
	public String getProduttore() {
		return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}

}

class Dimensioni{
	double larghezza;
	double altezza;
	double profondita;
	static int n = 0;
	
	public Dimensioni(double larghezza, double altezza, double profondita) {
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.profondita = profondita;
		n++;
		
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getProfondita() {
		return profondita;
	}

	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}
	
}
