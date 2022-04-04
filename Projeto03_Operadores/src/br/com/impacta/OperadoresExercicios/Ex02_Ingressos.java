package br.com.impacta.OperadoresExercicios;

import javax.swing.JOptionPane;

public class Ex02_Ingressos {
	public static void main(String[] args) {
	

	/*
	 * Em um clube, o valor do ingresso é cobrado de acordo com a idade do
	 * participante.
	 *
	 * -Se a aidade for menor que 18: R$20,00 -Entre 19 e 59 anos: R$ 30,00 -Acima
	 * de 59 anos: R$ 15,00
	 *
	 * Com base nestas informações, escreva o programa que solicite a idade ao
	 * usuário, em sguida apresente:
	 *
	 * - A idade - O valor do ingresso
	 */
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do usuário?"));
	
     double ingresso;
     

	if(idade<18)
	{
		ingresso = 20;
	}else  if(idade > 59) {
		ingresso=15;
	} else {
		ingresso = 15;
    }

     System.out.println("ingresso:"+ingresso);
}
}