package br.com.impacta.aplicacao;

import br.com.impacta.threads.Processo01;

public class AppThread02 {

	public static void main(String[] args) {
		
		
		
		//o objeto p representa apenas a tarefa a ser executada
		Processo01 p = new Processo01();
		
		// agora . vamos criar a Thread que executara a atarefa acima
		Thread t1 = new Thread (p);
		t1.start();
		
		
		
		
	}
}
