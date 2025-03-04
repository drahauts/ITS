import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String id;
	private String nome;
	private String cognome;
	private String password;
	private String email;
	private List<Prodotto> prodottiAcquistati;
	
	
	public Cliente(String id, String nome, String cognome, String password, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.password = password;
		this.email = email;
		this.prodottiAcquistati = new ArrayList<>();
	}
	
	public void acquistaProdotto(Prodotto prodotto) {
        prodottiAcquistati.add(prodotto);
    }
	
	public void prodottiAcquistati() {
		System.out.println("Prodotti acquistati da " + nome + " " + cognome + ":");
		for(Prodotto prodotto : prodottiAcquistati) {
			System.out.println(prodotto);
		}
	}
}
