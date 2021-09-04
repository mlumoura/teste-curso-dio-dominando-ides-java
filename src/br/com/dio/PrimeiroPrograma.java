package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Import o objeto usando CTRL + SHIFT + O
		Gato gato = new Gato(null, null, null);
		System.out.println(gato);
		
		Livros livros = new Livros();
		System.out.println(livros);
	}
}
class Livros {
 	private String nome;
 	private Integer npags;		
}
