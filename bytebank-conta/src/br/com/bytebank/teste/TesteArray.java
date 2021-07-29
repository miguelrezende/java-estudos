package br.com.bytebank.teste;

import br.com.bytebank.modelo.GuardadorDeContas;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArray {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(02, 01);
		Conta cc2 = new ContaCorrente(11,22);
		
		guardador.adicionaConta(cc1);
		guardador.adicionaConta(cc2);
		
		guardador.getElementosCadastrados();
		
		Conta ref1 = guardador.retornaConta(0);
		Conta ref2 = guardador.retornaConta(1);
		
		System.out.println(ref1);
		System.out.println(ref2);
		

	}

	private static GuardadorDeContas GuardadorDeContas() {
		
		return null;
	}

}
