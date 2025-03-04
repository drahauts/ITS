
public class AnimaleAcquatico extends Animale{
	private Integer num_pinne;
	private String genere;
	
	@Override
	String Verso() {
		switch (genere.toLowerCase()) {
		case "pesce":
			return "Glub";
		case "mammifero":
			return "Canto";
		default:
			return "Verso sconosciuto";
	}
}

	public AnimaleAcquatico() {
		super();
	}

	public AnimaleAcquatico(Integer num_pinne, String genere) {
		super();
		this.num_pinne = num_pinne;
		this.genere = genere;
	}
	
	

	@Override
	public String toString() {
		return "AnimaleAcquatico [num_pinne=" + num_pinne + ", genere=" + genere + ", Verso()=" + Verso() + "]";
	}

	public Integer getNum_pinne() {
		return num_pinne;
	}

	public void setNum_pinne(Integer num_pinne) {
		this.num_pinne = num_pinne;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

}
