package br.com.impacta.aplicacao;

import br.com.impacta.threads.ProcessoArquivos;

public class AppProcessoArquivos {
	
	public static void main(String[] args) {
		
		ProcessoArquivos proc = new ProcessoArquivos();
		
		Thread t1 = new Thread(proc);
		t1.start();
		Thread t2 = new Thread(proc);
		t2.start();
		
		
		
	}
}
