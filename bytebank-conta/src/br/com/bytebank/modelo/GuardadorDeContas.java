package br.com.bytebank.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int contadorElementos;
	
	public GuardadorDeContas() {
		contadorElementos = 0;
		this.referencias = new Conta[10];
	}

	public void adicionaConta(Conta ref) {
		referencias[this.contadorElementos] = ref;
		contadorElementos++;
		
	}
	
	public Conta retornaConta(int pos) {
		return this.referencias[pos];
	}
	
	public int getElementosCadastrados() {
		return this.contadorElementos;
	}
}
