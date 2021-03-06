package br.com.figurasgeometricas.teste;

import br.com.figurasgeometricas.*;

public class TesteFiguras {

	public static void main(String[] args) {
	
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		
		figuras[0] = (Circulo) new Circulo(5, "Vermelho", "Circulo");
		figuras[1] = new Quadrado(10,5,"Quadrado", "Amarelo");
		figuras[2] = new Triangulo(5,10,"Triangulo","Verde");
		figuras[3] = new Cilindro(10, 5, "Cilindro", "Azul", 10);
		figuras[4] = new Cubo(5,"Cubo","Roxo");
		figuras[5] = new Piramide(10, 5, "Pir?mide", "Cinza", 3);
		
		for (FiguraGeometrica figura : figuras) {
			if(figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura;
				System.out.println("--------------------");
				System.out.println(f2d.getNome());
				System.out.println(f2d.getCor());
				System.out.println(f2d.calcularArea());
			} else {
				Figura3D f3d = (Figura3D) figura;
				System.out.println("--------------------");
				System.out.println(f3d.getNome());
				System.out.println(f3d.getCor());
				System.out.println(f3d.calcularVolume());
				System.out.println(f3d.calcularArea());
			}
		}
		
		System.out.println("\nFim do Programa");
		
		
	}

}
