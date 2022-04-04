package br.com.impacta.EstruturaWhile;

public class EstruturaWhile01 {
	
	public static void main(String[] args) {
		
		int numero = (int)(Math.random() * 20);
		
		System.out.println("numero gerado:" + numero);
		while(numero<10) {
			System.out.println(numero++);
		}
		
		System.out.println("--FIM DO Programa--");
	}

}
