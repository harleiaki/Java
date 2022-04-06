package br.com.impacta.aplicação;

import javax.swing.JOptionPane;

public class AppExcecoes02 {
	public static void main(String[] args) {

		try {

			String nome = JOptionPane.showInputDialog("Informe seu nome:");

			JOptionPane.showMessageDialog(null, "Nome Informada:" + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

			JOptionPane.showMessageDialog(null, "Idade Informada:" + idade);

		} catch (NumberFormatException | NullPointerException e) {
			
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

		}		
	}
}
