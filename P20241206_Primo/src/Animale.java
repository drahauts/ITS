
abstract class Animale {
	public Animale() {
		super();
	}

	abstract String Verso();

	@Override
	public String toString() {
		return "Animale [Verso()=" + Verso() + "]";
	}
}
