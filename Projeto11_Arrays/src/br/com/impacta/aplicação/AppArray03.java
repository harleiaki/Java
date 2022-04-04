package br.com.impacta.aplicação;

public class AppArray03 {
	public static void main(String[] args) {
	
	
		//quando declaramos e atribuimos um valor
		//new int[] se torna opcional.
		
	int[] numeros = {17,12,54,23,17,31};

	for( int elemento : numeros) {
		
		System.out.println("\t" + elemento);
		
	}
	
	//vamos fazer o array "numeros" referenciar outro objeto.
	
	numeros = new int[]{2,5,7,1,0};
	
	System.out.println("\n");
	for (int elemento : numeros) {
		System.out.println("\t" + elemento);
		
	}
	
	}	
}
