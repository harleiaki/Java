package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais01 {
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		boolean b1= (a > 0);
		boolean b2= (b > a) ;
		boolean b3= (b++ == 20);
		boolean b4= (--a == 10);
			
		//Quando o incremento está depois da variavel
		//ele é realizado por ultimo.
		
		System.out.println("valor de b1:" +b1);
		System.out.println("valor de b2:" +b2);
		System.out.println("B3:" + b3);
		System.out.println("B4:" + b4);
			
	}

}
