package br.com.impacta.OperadoresExercicios;

import javax.swing.JOptionPane;

public class ComandoIF02 {
	public static void main(String[] args) {
		
		/*Um funcionari otera um valor de 10% de desconto,
		 * Se o salario bruto for superior de 5000 reais.
		 * O desconto setá calculado sobre a diferença
		 * entre o valor do salario e o valor base de 5000.
		 * 
		 */
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("informe o salario"));
		
		double desconto = 0;
		
		if (salario > 5000); {
			desconto = (salario - 5000) * 10 / 100;
		}
		
		String resposta = "Salário Bruto:" + salario +
				"\nDesconto:" + desconto + 
				"\nSalário líquido" + ( salario - desconto);
		
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}

}
