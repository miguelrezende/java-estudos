package br.com.figurasgeometricas;

public class Quadrado extends Figura2D{

	private double altura;
	private double base;
	
	public Quadrado(double altura, double base, String nome, String cor) {
		this.altura = altura;
		this.base = base;
		setNome(nome);
		setCor(cor);
	}
	
	
	
	@Override
	public double calcularArea() {
		setArea(base * altura);
		return getArea();
	}

	
}
