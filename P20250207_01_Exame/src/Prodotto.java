import java.util.ArrayList;
import java.util.List;

public class Prodotto {
	private String id;
	private String nome;
	private String descrizione;
	private Double prezzo;
	private List<String> negozi;
	
	
	public Prodotto(String id, String nome, String descrizione, Double prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.negozi = new ArrayList<>();
	}


	public String getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public Double getPrezzo() {
		return prezzo;
	}
	
	public void aggiungiNegozio(String negozio) {
		negozi.add(negozio);
	}


	public List<String> getNegozi() {
		return negozi;
	}


	@Override
	public String toString() {
		return "Prodotto [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", negozi=" + negozi + "]";
	}
	
	
}
