package br.com.impacta.aplicação;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArray05 {
	
	public static void main(String[] args) {
		
		//o usuario fornece alguns nomes de pessoas para uma lista.
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma quantidade de nomes:"));
		
		if(quantidade <= 0) {
			JOptionPane.showMessageDialog(null, "A quantidade deve ser maior que zero!", "ERRO", 
											JOptionPane.ERROR_MESSAGE);
			
			//sair do metodo 
			return;
		}
		
		
		String[] nomes = new String [quantidade];
		
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("informe o nome" + (i+1));
		
		}
		
		for (int i = 0; i < nomes.length; i++) {
			
			JOptionPane.showMessageDialog(null, "\nPosição do Array:" + i +
					"\nValor da Posição:" + nomes[i]);
		}
		
		Arrays.sort(nomes);
		
		for (String nome_posicao_array : nomes) {
			System.out.println(nome_posicao_array);
		
		}
		
		
		
			
		}
			
		
		}
		
	
