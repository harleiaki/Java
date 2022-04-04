package br.com.impacta.OperadoresExercicios;

import javax.swing.JOptionPane;

public class Ex04_Soma {
	public static void main(String[] args) {

		//Perguntar para o usuario quantos numeros
		// ele deseja;

		//Esta quantidade deverá ser armazenada em uma
		//variavel.

		int numero = 
				Integer.parseInt(JOptionPane.showInputDialog
				("Quantos números você deseja"));

		//perguntar para o usuario quantos irmaos ele possui,
		//armazenas esse valor em uma variavel chamada irmaos
		int irmaos = 
				Integer.parseInt(JOptionPane.showInputDialog
				("Quantos irmãos você tem?"));

		//perguntar em qual cidade ele mora e armazenar em
		//uma variavel chamada cidade

		String cidade = JOptionPane.showInputDialog
				("Em qual cidade você mora?");


		//Perguntar qual é o salário, incluindo os centavos.
		//armazenar em uma variavel chamada salario

		double salario = Double.parseDouble(JOptionPane.showInputDialog
				("Qual o seu salário?"));


		//Declarar um variavel do tipo String chamada Status.
		//Se o salario informado for maior que R$6.000,00 , 
		//esta variavel deve aramazenar: "Você está acima da media."
		//Caso contrario, a variavel deve armazenar:
		          // Você está dentro da média.

		String status;

		if(salario > 6000) {
			status = "Você está acima da media.";			
		}
		else {
			status = "Você está dentro da média.";		
		}


		String resposta = "Número informado: " + numero + 
				"\nQuant. de irmãos: " + irmaos + 
				"\nCidade onde mora: " + cidade + 
				"\nSalário: " + salario + 
				"\nStatus: " + status;

		JOptionPane.showMessageDialog(null,resposta);



	}

}