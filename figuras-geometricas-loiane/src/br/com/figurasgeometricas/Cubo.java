package br.com.figurasgeometricas;

public class Cubo extends Figura3D implements DimensaoSuperficial,DimensaoVolumetrica {

	
	private double aresta;
	
	public Cubo(double aresta, String nome, String cor) {
		this.aresta = aresta;
		setCor(cor);
		setNome(nome);
	}
	
	@Override
	public double calcularVolume() {
		setVolumeTotal(Math.pow(aresta,3));
		return getVolumeTotal();
	}

	@Override
	public double calcularArea() {
		setAreaTotal(6 * (Math.pow(aresta,2)));
		return getAreaTotal();
	}

}
