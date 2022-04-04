package br.com.impacta.relacionais_logicos;

import javax.swing.JOptionPane;

public class OperadoresLogicos01 {
	
	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informar idade:"));
		
		boolean b1 = (idade < 18) || ( idade > 59);
		System.out.println("b1: " + b1);
		
		boolean b2 = (idade >= 18) && ( idade <= 59);
		System.out.println("b2: " + b2);
		
	}

}
