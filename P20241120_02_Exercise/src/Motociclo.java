class Motociclo extends Automezzo implements Comparable<Motociclo>{
	private Double cilinrdata;
	private Double consumo;
	
	
	@Override
	public String toString() {
		return "Motociclo [cilinrdata=" + cilinrdata + ", consumo=" + consumo + ", toString()=" + super.toString()
				+ "]";
	}
	public Motociclo() {
		super();
	}
	public Motociclo(Integer num_ruote, String carburante, Double cilinrdata, Double consumo) {
		super(num_ruote, carburante);
		this.cilinrdata = cilinrdata;
		this.consumo = consumo;
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
		return 250.0;
	}
	@Override
	public int compareTo(Motociclo o) {
		// TODO Auto-generated method stub
		return consumo.compareTo(o.getConsumo());
	}
	
}
