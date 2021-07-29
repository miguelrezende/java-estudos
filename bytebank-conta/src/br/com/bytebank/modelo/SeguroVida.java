package br.com.bytebank.modelo;

public class SeguroVida implements Tributavel {

	ContaCorrente conta;
	
	
	
	public SeguroVida(ContaCorrente conta){
		this.conta = conta;
	}
	
	
	@Override
	public double getValorImposto() {
		return conta.getSaldo() * 0.1;
	}
	
	
}
