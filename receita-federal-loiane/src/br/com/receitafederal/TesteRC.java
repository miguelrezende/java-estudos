package br.com.receitafederal;

public class TesteRC {

	public static void main(String[] args) {
		
		PessoaFisica pf1 = new PessoaFisica("Miguel", 1500, "Social Media");
		PessoaFisica pf2 = new PessoaFisica("Matheus", 3000, "Social Media");
		PessoaFisica pf3 = new PessoaFisica("Alicia", 2800, "Analista");
		
		PessoaJuridica pj1 = new PessoaJuridica("MLK", 5000, "Empreendedor");
		PessoaJuridica pj2 = new PessoaJuridica("NGK", 10000, "Empreendedor");
		PessoaJuridica pj3 = new PessoaJuridica("DELTA", 30000, "Empreendedor");
		
//		PessoaJuridica pj[] = new PessoaJuridica[3];
//		PessoaFisica pf[] = new PessoaFisica[3];
		
		System.out.println(pf1.calculaImposto());
		System.out.println(pf2.calculaImposto());
		System.out.println(pf3.calculaImposto());
		System.out.println(pj1.calculaImposto());
		System.out.println(pj2.calculaImposto());
		System.out.println(pj3.calculaImposto());
		
		

	}

}
