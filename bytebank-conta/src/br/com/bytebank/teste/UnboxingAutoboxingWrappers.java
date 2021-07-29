package br.com.bytebank.teste;

public class UnboxingAutoboxingWrappers {

	public static void main(String[] args) {
		
		int idades[] = new int[5];
		String nome[] = new String[5];
		
		String teste = "20";
		
		int idade = 29;
		Integer idadeRef = Integer.valueOf(idade); //autoboxing
		int idadePrimitivo = idadeRef.intValue();
		System.out.println(idadePrimitivo);
		System.out.println(idadeRef);
		
		int convertido = Integer.parseInt(teste);
		
		System.out.println(convertido);
		/*int numero = Integer.parseInt(s);  Faz o parsing de uma string para um tipo primitivo INT */
		
		

	}

}
