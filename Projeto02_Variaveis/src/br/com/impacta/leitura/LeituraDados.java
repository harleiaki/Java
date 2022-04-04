package br.com.impacta.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {
	
	public static void main(String[] args) {
		
		String usuario = JOptionPane.showInputDialog("Qual é o seu nome?");
		
	//obter  a idade da usuario
		
		int idade = Integer.parseInt (JOptionPane.showInputDialog("Qual a sua idade?"));
		
		//obtendo a altura do usuario
		double altura = Double.parseDouble (JOptionPane.showInputDialog("Qual a sua altura?"));
		
		JOptionPane.showMessageDialog(null, "Seu nome:" + usuario);

		JOptionPane.showMessageDialog(null, "Sua idade:" + idade);
		
		//gerando uma resposta unificada
		
		String resposta = "Seu nome:" + usuario+
				"\nSua idade: " + idade +
				"\nSua altura: " + altura;
		
		JOptionPane.showMessageDialog(null, resposta);
		

	}

}
