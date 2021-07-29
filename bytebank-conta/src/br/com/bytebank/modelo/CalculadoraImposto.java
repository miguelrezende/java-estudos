package br.com.bytebank.modelo;

public class CalculadoraImposto {

	private double totalImposto;
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
	public void registra(Tributavel imposto) {
		this.totalImposto += imposto.getValorImposto();
	}
}
