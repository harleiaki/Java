package br.com.impacta.OperadoresExercicios;

import javax.swing.JOptionPane;

public class Ex04_Soma {
	public static void main(String[] args) {

		//Perguntar para o usuario quantos numeros
		// ele deseja;

		//Esta quantidade dever� ser armazenada em uma
		//variavel.

		int numero = 
				Integer.parseInt(JOptionPane.showInputDialog
				("Quantos n�meros voc� deseja"));

		//perguntar para o usuario quantos irmaos ele possui,
		//armazenas esse valor em uma variavel chamada irmaos
		int irmaos = 
				Integer.parseInt(JOptionPane.showInputDialog
				("Quantos irm�os voc� tem?"));

		//perguntar em qual cidade ele mora e armazenar em
		//uma variavel chamada cidade

		String cidade = JOptionPane.showInputDialog
				("Em qual cidade voc� mora?");


		//Perguntar qual � o sal�rio, incluindo os centavos.
		//armazenar em uma variavel chamada salario

		double salario = Double.parseDouble(JOptionPane.showInputDialog
				("Qual o seu sal�rio?"));


		//Declarar um variavel do tipo String chamada Status.
		//Se o salario informado for maior que R$6.000,00 , 
		//esta variavel deve aramazenar: "Voc� est� acima da media."
		//Caso contrario, a variavel deve armazenar:
		          // Voc� est� dentro da m�dia.

		String status;

		if(salario > 6000) {
			status = "Voc� est� acima da media.";			
		}
		else {
			status = "Voc� est� dentro da m�dia.";		
		}


		String resposta = "N�mero informado: " + numero + 
				"\nQuant. de irm�os: " + irmaos + 
				"\nCidade onde mora: " + cidade + 
				"\nSal�rio: " + salario + 
				"\nStatus: " + status;

		JOptionPane.showMessageDialog(null,resposta);



	}

}