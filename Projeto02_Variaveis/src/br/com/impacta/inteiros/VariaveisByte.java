package br.com.impacta.inteiros;

public class VariaveisByte {
	public static void main(String[] args) {
		
		//tipo nome da variavel
		// = atribuição
		byte idade = 80; // -128 a 127
		byte idade2 = 48;
		
		//somando as duas idades, e armazenando em uma
		//terceira variavel
		byte soma = (byte)(idade + idade2); // type cast
		
		System.out.println("soma das idades: " + soma);
		
		System.out.println(idade2);
		
	}

}
