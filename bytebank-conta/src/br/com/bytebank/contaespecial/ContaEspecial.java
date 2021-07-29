package br.com.bytebank.contaespecial;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int conta) {
		super(agencia, conta);
	}
	
	public void recebe(double valor) {
		super.saldo += valor;
	}

	
	
}
