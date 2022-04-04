package br.com.impacta.incdec;

public class OperadoresIncrementais {
	public static void main(String[] args) {

		int numero = 10;
		System.out.println("numero" + numero);

		numero++;
		System.out.println("numero" + numero);

		++numero;
		System.out.println("numero" + numero);

		// instrução (;)
		// Operação = Operação como --, +, ++

		
		int x = numero++;

		System.out.println();
		System.out.println("x:" + x);
		System.out.println("numero:" + numero);

		x = ++numero;

		System.out.println("x:" + x); // 13
	

		int x2 = numero--;

		System.out.println();
		System.out.println("x:" + x2);
		System.out.println("numero:" + numero);

		x2 = --numero;

		System.out.println("x:" + x2); // 13

	}

}
