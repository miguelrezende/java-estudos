package br.com.figurasgeometricas;

public class Piramide extends Figura3D implements DimensaoSuperficial,DimensaoVolumetrica {

	
	
	public Piramide(double areaLateral, double AreaBase, String nome, String cor, double altura) {
		setAreaLateral(areaLateral);
		setAreaBase(AreaBase);
		setAltura(altura);
		setCor(cor);
		setNome(nome);
	}
	
	@Override
	public double calcularVolume() {
		setVolumeTotal((getAreaBase() * getAltura()) / 3);
		return getVolumeTotal();
	}

	@Override
	public double calcularArea() {
		setAreaTotal(getAreaLateral() + getAreaBase());
		return getAreaTotal();
	}

}
