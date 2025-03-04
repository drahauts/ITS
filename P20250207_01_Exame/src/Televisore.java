public class Televisore extends Prodotto{
	private int pollici;

	public Televisore(String id, String nome, String descrizione, Double prezzo, int pollici) {
		super(id, nome, descrizione, prezzo);
		this.pollici = pollici;
	}

	@Override
	public String toString() {
		return "Televisore [pollici = " + pollici + ", id = " + getId() + ",nome = " + getNome()
				+ ", descrizione = " + getDescrizione() + ", prezzo = " + getPrezzo();
	}

}
