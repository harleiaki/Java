package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//&& todas as condições devem ser TRUE
		
		boolean b1 = (a < 10) && (b % 2 == 0);
		
		boolean b2 = (a == 10) && (a == b) || (b>20);
		
		System.out.println("b1:" + b1);
		System.out.println("b2: " + b2);
		
		// || vai comparar até ter um true
		// | vai comparar todas as condições mesmo que tenha true.
		
		// && vai comparar até ter um false
		// & vai comparar a todas as condições mesmo que tem false.
	}

}
