package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.interfaces.Operacao02;

public class AppOperacao02 {
	public static void main(String[] args) {
		
		Operacao02 op1 = () -> Math.random();
		
		Operacao02 op2 = () -> Double.parseDouble("123.4");
		
		Operacao02 op3 = () -> {
			
			double n =
			Double.parseDouble(
					JOptionPane.showInputDialog("Informe um numero"));
			
			return n;
			
			
			
		};
		
		System.out.println("op1: " + op1.executar());
		System.out.println("op2: " + op2.executar());
		System.out.println("op3: " + op3.executar());
		
	}

}
