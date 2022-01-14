package br.com.dio;

import br.com.dio.calculadora.Calculadora;
import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato ();
		Livros livros = new Livros();
		Calculadora calculadora = new Calculadora ();
		
		System.out.println(gato);
		System.out.println(livros);
		System.out.println(calculadora);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/

	}

}

class Livros {
	private String nome;
	private String npag;
	
}

