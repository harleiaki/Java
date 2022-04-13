package br.com.impacta.aplicacao;

import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AppLeituraArquivo03 {
/**
 * @param args
 */
public static void main(String[] args) {
		
	
		try {
			
			
			JFileChooser chooser = new JFileChooser();
			
			if(chooser.showOpenDialog(null) == JFileChooser.CANCEL_OPTION) {
				return;
			}
			
			
			
			
			
			//classe FileReader
			FileReader reader =
					new FileReader
					(chooser.getSelectedFile());
		
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


