package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {

	public static void main(String[] args) {

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade"));

		// if = condi��o SE
		if (idade < 18) {// se a condi��o for verdadeira.
			System.out.println("Menor de idade");
		
		}else// senao.
			System.out.println("Maior de idade");
		    System.out.println("idade fornecida:" + idade);
		    

	}

}
