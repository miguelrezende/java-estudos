package br.com.bytebank.modelo;

public class Stringtestes {
	
	public static void main(String[] args) {
		
		String nome = "Miguel";
				
		String nulo = " ";
		String naoNuloTrim = nulo.trim();
		
		String teste = nome.substring(2);
		
		String texto = "Socorram";
		System.out.println(texto);
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto); 
		
//		System.out.println(naoNuloTrim.isEmpty());
//		System.out.println(teste.contains("guel"));
//		
//		for(int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
//	}

	}
}
