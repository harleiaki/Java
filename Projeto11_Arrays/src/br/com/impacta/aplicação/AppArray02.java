package br.com.impacta.aplicação;

public class AppArray02 {
	public static void main(String[] args) {
		

	//definindo um array de inteiros implicitamente.
	
	int[] numeros = {17,12,54,23,17,31};
	
	//Apresentar os dados do array utilizando a 
	//Estrutura for aprimorada(Java5.0)
	
	//elemento da coleção : coleção
	//foreach 
	//for (int i : numeros) {}
	
	for( int elemento : numeros) {
		
		System.out.println(elemento);
		
	}
		
	}
	
}

