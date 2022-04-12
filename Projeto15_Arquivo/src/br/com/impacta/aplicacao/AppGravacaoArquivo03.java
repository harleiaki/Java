package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppGravacaoArquivo03 {
	public static void main(String[] args) {

		try {
		FileWriter writer =
				new FileWriter("C:\\Users\\21no0728\\Documents\\Curso_Java\\Arquivos\\nomes.txt", true);

			
			while (true) {
				
			String texto = JOptionPane.showInputDialog("Escreva um nome: ");
			writer.write(texto + "\r\n");
			
			int opcao = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Confirmção", JOptionPane.YES_NO_OPTION);
			

			if (opcao == JOptionPane.NO_OPTION) {
				break;
			}
			}
		
			writer.close();
			JOptionPane.showInputDialog(null,"Arquivo criado com sucesso! ");
	
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		
}
}
}