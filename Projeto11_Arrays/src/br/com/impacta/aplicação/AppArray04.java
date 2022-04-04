package br.com.impacta.aplicação;

import javax.swing.JOptionPane;

public class AppArray04 {
	
	public static void main(String[] args) {
		
		//o usuario fornece alguns nomes de pessoas para uma lista.
		
		String[] pessoas = new String [4];
		
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = JOptionPane.showInputDialog("informe o nome" + (i+1));
		
		}
		
		for (int i = 0; i < pessoas.length; i++) {
			
			JOptionPane.showMessageDialog(null, "\nPosição do Array:" + i +
					"\nValor da Posição:" + pessoas[i]);
		}
		
		for (String elemento : pessoas) {
			System.out.println(elemento);
			
			
		
		}
			
		}
		
	}

