package br.com.bytebank.teste;

import br.com.bytebank.modelo.CalculadoraImposto;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.SeguroVida;

public class Teste {

	public static void main(String[] args) {
		
		ContaPoupanca pp = new ContaPoupanca(1552,123);
		
		pp.deposita(200);
		
		ContaCorrente cc = new ContaCorrente(1123,444);
		
		cc.deposita(300);
		System.out.println(cc.getSaldo());
		SeguroVida seguro = new SeguroVida(cc);
		
		Conta[] contas = new Conta[5];
		
		contas[0] = (ContaCorrente) cc;
		
		Object referenciaGenerica = (ContaCorrente) contas[0];
		
	
		CalculadoraImposto calc = new CalculadoraImposto();
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		System.out.println(cc);
		System.out.println(pp);
		
	}
}
