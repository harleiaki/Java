package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Calculo;

public class AppCalculo {
	public static void main(String[] args) {
		
		Calculo c1 = (double x,double y) -> x + y + 2 * y;
		
		double resultado = c1.calcular(2 , 7);
		
		
		
	}
	
	

}
