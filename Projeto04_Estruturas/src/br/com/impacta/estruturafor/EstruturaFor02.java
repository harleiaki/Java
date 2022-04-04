package br.com.impacta.estruturafor;

import javax.swing.JOptionPane;

public class EstruturaFor02 {
	public static void main(String[] args) {

		int quantidade = Integer.parseInt( JOptionPane.showInputDialog("Quantas pessoas estão na sala?"));

		/*variavel para receber a maior idade 
		 */
 int maior = 0;
 int posição = 0;

		for (int i = 1; i < quantidade ; i++) {
			/* pergunta sera repetida enquanto o for 
			 * estiver sendo repetido
			 * 
			 */

			String pergunta = "Pessoa"  + i +
					"\n Qual a idade da pessoa" + i + "?";
			
			// idade vai receber um novo valor
			//para cada pessoa
			int idade = Integer.parseInt(JOptionPane.showInputDialog(pergunta));
   
			//System.out.println("a idade atual:" + idade
			
			//caso a idade atual for maior 
			//qua a variavel de fora
			

			System.out.println("a idade atual:" );

			if(idade > maior) {
				
				System.out.println("Variavel maior:" + maior);
				
				maior = idade;// atualizamos a variavel de fora
				posição = i; // posição atual.
			}	
			
			}
		String resposta = "Maior idade :" + maior+
				"\n Pessoa:" + posição;
		JOptionPane.showMessageDialog(null,  resposta);
		
		

		}

	}

