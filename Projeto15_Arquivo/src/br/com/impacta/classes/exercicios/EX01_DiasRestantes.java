package br.com.impacta.classes.exercicios;

import javax.swing.JOptionPane;

public class EX01_DiasRestantes {
	public static void main(String[] args) {
		
		
		/*
		 * Neste capitulo exercicios, o usuario deve fornecer:
		 * dia 
		 * mes
		 * ano
		 * 
		 * Como base nestas informações, determinar quantos 
		 * dias restam para o ano informado terminar.
		 */
		
			int dia = Integer.parseInt
					(JOptionPane.showInputDialog
							("Informe um dia:"));
			
			int mes = Integer.parseInt
					(JOptionPane.showInputDialog
							("Informe um mes:"));
			
			int ano = Integer.parseInt
					(JOptionPane.showInputDialog
							("Informe um ano:"));
			
			if(mes < 1 || mes > 12) {
				JOptionPane.showMessageDialog(null, "Mês inválido:");
				return;
			}
			
			
			//ano % 4==0?29:28
			int[]meses = {31,28,31,30,31,30,31,31,30,31,30,31};
			
			//dividimos o ano por 4 
			//pegamos o resto da divisao.
			
			//se for 0 o ano é bissexto.
			if(ano % 4==0) {
				meses[1] = 29;
			}
					
			
			if(dia < 1 || dia > meses[mes-1]) {
				JOptionPane.showMessageDialog(null, "Dia inválido:");
				return;
			}	
			
			//calculo do numero de dias restantes.
			int diasRestantes = meses[mes-1]- dia;
			
			for(int i = mes; i<meses.length; i++) {
				diasRestantes += meses[i];
			}
			
			String resposta ="Faltam" + diasRestantes + 
					"Dias para terminar o ano";
			
			JOptionPane.showMessageDialog(null, resposta);
			
			
			
	}
	
}
