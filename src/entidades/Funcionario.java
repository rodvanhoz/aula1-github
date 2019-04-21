package entidades;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario() {
		
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		
		return id
				+ ", "
				+ nome
				+ ", "
				+ String.format("%.2f", salario);
	}

	public void aumentarSalario(double porc) {
		
		salario += salario * (porc / 100);
	}
	
}
