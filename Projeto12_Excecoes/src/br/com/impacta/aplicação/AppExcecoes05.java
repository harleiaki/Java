package br.com.impacta.aplica��o;

import javax.swing.JOptionPane;

public class AppExcecoes05 {
	public static void main(String[] args) {
		
	try {

		String nome = JOptionPane.showInputDialog("Informe seu nome:");

		JOptionPane.showMessageDialog(null, "Nome Informada:" + nome.toUpperCase());

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

		JOptionPane.showMessageDialog(null, "Idade Informada:" + idade);

	} 
	catch (Exception e) {
		
		String classe = e.getClass().getSimpleName();
		
		if(e instanceof NullPointerException) {
			e.initCause(new NullPointerException(" Referencias nula n�o acessam metodos"));
		}
		
		e.printStackTrace();
		
		JOptionPane.showMessageDialog
			(null,"Classe:" + classe + "\nErro Geral:" +
					e.getMessage());

	}		
}
}

