package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteSort {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);


        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        

        for (Conta conta : lista) {
                System.out.println(conta + " Nome:" + conta.getTitular().getNome() );
        }

        //NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        
        lista.sort(null);
        
        
       //Collections.sort(lista, new stringComparator());
       //Collections.sort(lista);  
       //lista.sort(comparator);
       //Collections.reverse(lista);

        System.out.println("---------");

        for (Conta conta : lista) {
        	System.out.println(conta + " Nome:" + conta.getTitular().getNome() );
        }


 }

}
class stringComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		String contaNome1 = c1.getTitular().getNome();
		String contaNome2 = c2.getTitular().getNome();
		return contaNome1.compareTo(contaNome2);
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		if(c1.getConta() < c2.getConta()) {
			return -1;
		}

		if(c1.getConta() > c2.getConta()) {
			return 1;
		}

		return 0;
	}

 }



