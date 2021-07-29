package br.com.receitafederal;

public class PessoaFisica extends Contribuinte {

	public PessoaFisica(String nome, double salario, String profissao) {
		super(nome,salario,profissao);
	}
	
	
	public double calculaImposto() {
		double impostoDeRenda = 0;
		if(renda >= 0 && renda <= 1400) {
			impostoDeRenda = 0;
		} else if (renda >= 1400.01 && renda <= 2100) {
			impostoDeRenda = (renda * 0.1) - 100;
		} else if (renda >= 2100.01 && renda <= 2800) {
			impostoDeRenda = (renda * 0.15) - 270;
		} else if (renda >= 2800.01 && renda <= 3600) {
			impostoDeRenda = (renda * 0.25) - 500;
		} else if (renda >= 3600.01)  {
			impostoDeRenda = (renda * 0.3) - 700;
		}
		
		return impostoDeRenda;
	}

	
}
