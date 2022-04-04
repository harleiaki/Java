package br.com.impacta.OperadoresExercicios;

import javax.swing.JOptionPane;

public class Ex05_AdivinhaNumero {
	public static void main(String[] args) {

		int numero = (int)(Math.random()* 100)+ 1;
		int min = 1, max = 100;
		int tentativas = 0;

		while(true) {

		   int valor = Integer.parseInt(JOptionPane.
				   showInputDialog("Informe um número entre " + min + " e " + 
		        max));	


		   if(valor > max || valor < min ) {
			   JOptionPane.showMessageDialog(null,"Informe um número válido.");
			   continue;  //volta pro comeco  e pergunta de novo.

		   }

		   tentativas++;

		   if(valor < numero) {
			   min = valor + 1;
		   }
		   else if (valor == numero) {
			   break;
		   }		   
		   else {
			   max = valor -1;
		   }		

		}

		String resposta = 
				"Você acertou em " + tentativas + " tentativas";
		JOptionPane.showMessageDialog(null,resposta);

	}

}