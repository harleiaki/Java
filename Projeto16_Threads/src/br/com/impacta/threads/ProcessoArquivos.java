package br.com.impacta.threads;

import java.io.FileReader;

public class ProcessoArquivos implements Runnable{

	@Override
	public void run() {
		
		lerArquivo();
		
	}
	
	public synchronized void lerArquivo() {
		try {
			
			//classe FileReader
			FileReader reader =
					new FileReader("C:\\Users\\21no0728\\Documents\\Curso_Java\\Arquivos\\nomes.txt");
		
			
		System.out.println(Thread.currentThread().getName());
		
		while (true) {
			int caractere = reader.read();
			//System.out.print(caractere);
			
			//EOF = END OF FILE.
			if(caractere == -1)
				break;
			
			
			char ch = (char) caractere;
			System.out.print(ch);
			Thread.sleep(200);
		}
		
		
		reader.close();
		
				
		} catch (Exception e) {
			
		}
	}
}
