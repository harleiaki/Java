package br.com.impacta.aplica��o;

import javax.swing.JOptionPane;

public class AppArray04 {
	
	public static void main(String[] args) {
		
		//o usuario fornece alguns nomes de pessoas para uma lista.
		
		String[] pessoas = new String [4];
		
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = JOptionPane.showInputDialog("informe o nome" + (i+1));
		
		}
		
		for (int i = 0; i < pessoas.length; i++) {
			
			JOptionPane.showMessageDialog(null, "\nPosi��o do Array:" + i +
					"\nValor da Posi��o:" + pessoas[i]);
		}
		
		for (String elemento : pessoas) {
			System.out.println(elemento);
			
			
		
		}
			
		}
		
	}

