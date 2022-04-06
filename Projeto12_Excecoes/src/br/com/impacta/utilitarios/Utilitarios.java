package br.com.impacta.utilitarios;

public class Utilitarios {
	
		//Static dispensa o uso de objeto, e n�o ocupa espa�o na memoria Heap.
	
		//Static n�o precisa de nenhum objeto para ser executado.
		
		//pelo fato de ser static o this n�o funciona.
	
	public static double somar(double x, double y) {
		
		return x+y;
	}
	
		// escrever um metodo que recebe como parametro um texto
	 	// e retorne este texto sem espa�os.
	
	public static String removerEspa�os(String texto) {
		
		
		//trocar             //antigo //novo
		return texto.replace(" ", "");
	}
	
	//escrever um metodo que receba como parametro um nome e um
	//sobrenome e retorne email no formato : nome.sobrenome@impacta.com.br
	
	public static String gerarEmail(String nome, String sobrenome) {
		
		
		
		String email= nome +"." + sobrenome + "@impacta.com.br";
		
		return removerEspa�os(email);
	
		 
		       
		      
	}
	
	// escreva um metodo que recebe como parametro 
	//um array de numeros reais, e retorna a media
	//dos elementos do array.
	
	public static double calcularMediaArray(double... numeros) {
		double soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			soma += numeros[i];
		}
		return  numeros.length >0? soma / numeros. length : soma;
		
		
	}
			//varags(...) dentro do metodo � considerado um array parametro //
	
	public static double calcularMediaNumeros(double... numeros) {
				
		return calcularMediaArray(numeros);
	}
}

