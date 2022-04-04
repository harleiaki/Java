package br.com.impacta.EstruturaWhile;

public class EstruturaWhile02 {
	
	public static void main(String[] args) {
		
		int numero = (int)(Math.random() * 20);
		
		do {
			
			System.out.println(numero++);
		}
		
		while(numero<10); 
		
		System.out.println("--FIM DO Programa--");
	}

}

