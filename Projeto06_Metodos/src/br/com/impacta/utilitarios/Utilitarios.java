package br.com.impacta.utilitarios;

public class Utilitarios {
	
		//Static dispensa o uso de objeto, e não ocupa espaço na memoria Heap.
	
		//Static não precisa de nenhum objeto para ser executado.
		
		//pelo fato de ser static o this não funciona.
	
	public static double somar(double x, double y) {
		
		return x+y;
	}
	
		// escrever um metodo que recebe como parametro um texto
	 	// e retorne este texto sem espaços.
	
	public static String removerEspaços(String texto) {
		
		
		//trocar             //antigo //novo
		return texto.replace(" ", "");
	}
	
	//escrever um metodo que receba como parametro um nome e um
	//sobrenome e retorne email no formato : nome.sobrenome@impacta.com.br
	
	public static String gerarEmail(String nome, String sobrenome) {
		
		
		
		String email= nome +"." + sobrenome + "@impacta.com.br";
		
		return removerEspaços(email);
	
		 
		       
		      
	}

}
