public class Smartphone extends Prodotto{
	private String modello;
	private int RAM;
	public Smartphone(String id, String nome, String descrizione, Double prezzo, String modello, int RAM) {
		super(id, nome, descrizione, prezzo);
		this.modello = modello;
		this.RAM = RAM;
	}
	@Override
	public String toString() {
		return "Smartphone [modello = " + modello + ", RAM = " + RAM + ", id = " + getId() + ", nome = " + getNome()
				+ ", descrizione = " + getDescrizione() + ", prezzo = " + getPrezzo();
	}



}
