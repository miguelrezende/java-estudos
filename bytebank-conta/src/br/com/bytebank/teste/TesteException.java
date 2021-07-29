package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteException {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(1555, 1545);
		
		cc.deposita(500);
		try {
			cc.saca(550);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(cc.getSaldo());
	}
}
