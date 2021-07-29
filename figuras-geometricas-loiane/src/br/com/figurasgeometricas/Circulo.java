package br.com.figurasgeometricas;

public class Circulo extends Figura2D {

	private double raio;
	
	public Circulo(double raio, String cor, String nome) {
		this.raio = raio;
		setCor(cor);
		setNome(nome);
	}


	@Override
	public double calcularArea() {
		setArea(Math.PI * (Math.pow(raio, 2)));
		return getArea();
	}

	
}
