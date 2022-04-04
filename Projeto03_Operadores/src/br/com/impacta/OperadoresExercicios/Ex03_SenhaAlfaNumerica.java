package br.com.impacta.OperadoresExercicios;

import javax.swing.JOptionPane;

public class Ex03_SenhaAlfaNumerica {
	
	public static void main(String[] args) {
		
		/* esta programa deve gerar uma 
		 * senha com 6 digitos, onde cada digito
		 * é um numero entra 0 e 9. A senha final é uma String 
		 * 
		 */
		
		
		String senha = "";
		
		for (int i = 0; i < 6; i++) {
			
			int numeroatual = (int)(Math.random()* 10);
			
			
			senha += (int)(Math.random() * 10);
			
			System.out.println("Numero atual:--" + numeroatual);
			
		}
		
		JOptionPane.showMessageDialog(null, senha);
		
		
	}

}
