package br.com.impacta.Operadores;

public class OperadoresAritmeticos02 {
	public static void main(String[] args) {
		
		int a = 10,
				b = 3,
				c = 5;
		double d1 = 10, d2 = 3;
		double divisao1= d1/d2;
		//divisao real com base denumeros inteiros.	
		double divisao2 = d1/b;
		// para termos uma divisao real.
		//basta que apenas um dos operadores seja real.
		// typecast do a(int) para double.
		double divisao3 = (double)a/b;
		double x = c;
		double divisao4 = x/a;
		
		System.out.println("divisao1:" + divisao1);
		System.out.println("divisao1:" + divisao2);
		System.out.println("divisao3:" + divisao3);
		System.out.println("divisao4:" + divisao4);
	
	}
}
