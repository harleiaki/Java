package br.com.impacta.aplicação;

public class AppArray01 {
	public static void main(String[] args) {

		int[] numeros = new int[5];

		numeros[0] = 20;
		numeros[1] = 10;
		numeros[2] = -15;
		numeros[3] = 0;
		numeros[4] = 8;

		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros[i]);
		}
		for ( int i=numeros.length-1; i>=0; i--) {
			System.out.println(numeros[i]);
		}
	}
}
