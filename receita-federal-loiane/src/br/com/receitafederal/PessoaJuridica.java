package br.com.receitafederal;

public class PessoaJuridica extends Contribuinte {

	public PessoaJuridica(String nome, double renda, String profissao) {
		super(nome,renda,profissao);
	}
	
	
	public double calculaImposto() {
		double impostoDeRenda = this.renda * 0.1;
		return impostoDeRenda;
	}
}
