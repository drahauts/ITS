
public class AnimaleTerrestre extends Animale{
	private Integer num_zampe;
	private String genere;
	
	
	public AnimaleTerrestre(Integer num_zampe, String genere) {
		super();
		this.num_zampe = num_zampe;
		this.genere = genere;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	String Verso() {
		switch (genere.toLowerCase()) {
			case "mammifero": 
				return "Ruggito";S
			case "rettile" :
				return "Sibilo";
			default:
				return "Verso sconosciuto";
		}
	}
	public AnimaleTerrestre() {
		super();
	}
	@Override
	public String toString() {
		return "AnimaleTerrestre [num_zampe=" + num_zampe + ", genere=" + genere + ", Verso()=" + Verso() + "]";
	}
	public Integer getNum_zampe() {
		return num_zampe;
	}
	public void setNum_zampe(Integer num_zampe) {
		this.num_zampe = num_zampe;
	}

}
