package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteCasting {
	
	public static void main(String[] args) {
	
		Object[] referencias = new Object[5];

		referencias[0] = new ContaPoupanca(22,11);
		referencias[1] = new ContaCorrente(33,11);
		
		// não é possível chamar os metodos da conta corrente System.out.println(referencias[0]);

		ContaCorrente corrente = (ContaCorrente) referencias[0];
		ContaPoupanca poupanca = (ContaPoupanca) referencias[1];
		
		

	}
	
	

}
