package br.com.receitafederal;

public abstract class Contribuinte {

	protected String nome;
	protected double renda;
	protected String cargo;
	
	public Contribuinte(String nome, double salario, String profissao) {
		this.nome = nome;
		this.renda = salario;
		this.cargo = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return renda;
	}

	public void setSalario(double salario) {
		this.renda = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
