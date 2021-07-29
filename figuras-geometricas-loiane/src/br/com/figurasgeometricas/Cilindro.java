package br.com.figurasgeometricas;

public class Cilindro extends Figura3D implements DimensaoSuperficial,DimensaoVolumetrica {
	
	public Cilindro(double areaLateral, double areaBase, String nome, String cor, double altura) {
		setAreaBase(areaBase);
		setAreaLateral(areaLateral);
		setAltura(altura);
		setCor(cor);
		setNome(nome);
	}
	
	@Override
	public double calcularVolume() {
		setVolumeTotal(getAltura() * getAreaBase());
		return getVolumeTotal();
	}

	@Override
	public double calcularArea() {
		setAreaTotal((2 * getAreaBase() ) + getAreaLateral());
		return getAreaTotal();
	}

}
