package br.com.bytebank.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int conta) {
		super(agencia,conta);
	}
	
	@Override
	public String toString() {
		
		return "ContaPoupança " +  super.toString();
	}

}
