package checked;

public class Impiegato {
	
	private String nome;
	private int salario;
	public Impiegato(String nome, int salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	@Override
	public String toString() {
		return "Impiegato [nome=" + nome + ", salario=" + salario + "]";
	}
	
	public void incrementaSalario(int incremeneto) throws incrementoNegativoException {
		if (incremeneto > 0)
			salario += incremeneto;
		else
			throw new incrementoNegativoException();
	}
	
	
	
	
}