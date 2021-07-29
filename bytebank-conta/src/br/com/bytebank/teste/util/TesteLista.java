package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteLista {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(10, 30);
		Conta cc2 = new ContaCorrente(11,22);
		
		lista.add(cc1);
		lista.add(cc2);
		
		lista.remove(1);
		
		Conta ref =  lista.get(0);
		
		boolean teste = cc1.equals(cc2);
		System.out.println(teste);
		
		for(Conta cref : lista) {
			System.out.println(ref);
		}

	}

}
