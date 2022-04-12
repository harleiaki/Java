package br.com.impacta.aplicacao;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class AppLeituraArquivo02 {
public static void main(String[] args) {
		
		try {
			
			//classe FileReader
			FileReader reader =
					new FileReader
					("C:\\Users\\21no0728\\Documents\\Curso_Java\\Arquivos\\nomes.txt");
		
			//leitura do arquivo um caractere por vez
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int caractere = reader.read();
			//System.out.println(caractere);
			
			//EOF = END OF FILE.
			if(caractere == -1)
				break;
			
			
			char ch = (char) caractere;
			sb.append(ch);
		}
		
		System.out.println(sb);
		reader.close();
		
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		}
}
		

