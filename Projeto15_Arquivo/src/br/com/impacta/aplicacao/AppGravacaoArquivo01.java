package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppGravacaoArquivo01 {
	
	public static void main(String[] args) {
		
		
		try {
			//Classe FileWriter
			FileWriter writer = new FileWriter("C:\\Users\\21no0728\\Documents\\Curso_Java\\Arquivos\\arquivo1.txt");
			
			
		String texto = JOptionPane.showInputDialog("Escreva um texto: ");
		writer.write(texto);
		writer.close();
		
		JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
			
			
			
			
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		
	}
}
