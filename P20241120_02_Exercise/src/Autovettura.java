class Autovettura extends Automezzo implements Comparable<Autovettura>{
	private Double cilinrdata;
	private Double consumo;
	
	public Autovettura(Integer num_ruote, String carburante, Double cilinrdata, Double consumo) {
		super(num_ruote, carburante);
		this.cilinrdata = cilinrdata;
		this.consumo = consumo;
	}
	public Autovettura() {
		super();
	}
	public Double getCilinrdata() {
		return cilinrdata;
	}
	public void setCilinrdata(Double cilinrdata) {
		this.cilinrdata = cilinrdata;
	}
	public Double getConsumo() {
		return consumo;
	}
	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}
	
	@Override
	public Double getMaxSpeed() {
		return 300.0;
	}
	@Override
	public String toString() {
		return "Autovettura [cilinrdata=" + cilinrdata + ", consumo=" + consumo + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public int compareTo(Autovettura o) {
		return consumo.compareTo(o.getConsumo());
	}
	
	
}
