package br.com.figurasgeometricas;

public class Triangulo extends Figura2D {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura, String nome, String cor) {
		this.base = base;
		this.altura = altura;
		setCor(cor);
		setNome(nome);
	}
	
	
	@Override
	public double calcularArea() {
		setArea((base * altura) / 2);
		return getArea();
	}

}
