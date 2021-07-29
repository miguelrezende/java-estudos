package br.com.bytebank.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	
	public ContaCorrente(int agencia, int conta) {
		super(agencia,conta);
	}
	
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		
		double valorComTaxaSaque = valor + 0.20;
		super.saca(valorComTaxaSaque);
		//super.saca(valor + 0.20);
	}


	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.05;
	}
	
	@Override
	public String toString() {
		
		return "ContaCorrente " +  super.toString();
	}
	
}
