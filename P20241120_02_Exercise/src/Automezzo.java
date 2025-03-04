abstract class Automezzo {
	  /*
     * Definire la classe astratta Automezzo con attributi
     * - numero di ruote
     * - carburante
     * e con il metodo astratto getMaxSpeed()
     * Definire due classi figlie di Automezzo: Motociclo e Autovettura
     * che aggiungono gli attributi cilindrata e consumo
     * 1) Creare una lista di Motociclo e una lista di Autovettura
     * 2) inserire almeno 10 elementi per lista
     * 3) Stampare le liste ordinate (per velocità e poi per consumo)
     * 4) Costruire una nuova lista che contiene contemporaneamente Motocicli e Autovetture
     * 6) Stampare la nuova lista ordinata (per velocità e poi per consumo)
     */
	Integer num_ruote;
	String carburante;
	public Automezzo(Integer num_ruote, String carburante) {
		super();
		this.num_ruote = num_ruote;
		this.carburante = carburante;
	}
	public Automezzo() {
		super();
	}
	public Integer getNum_ruote() {
		return num_ruote;
	}
	public void setNum_ruote(Integer num_ruote) {
		this.num_ruote = num_ruote;
	}
	public String getCarburante() {
		return carburante;
	}
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
	public abstract Double getMaxSpeed();
	
}
