package br.com.impacta.aplicacao;

import br.com.impacta.threads.Processo02;

public class AppThread03 {
	public static void main(String[] args) {
		
		//criando a tarefa 
		Processo02 p = new Processo02();
		
		
		//criando as Threads
		Thread t1 = new Thread(p);
		t1.setName("Saturno");
		
		Thread t2 = new Thread(p);
		t2.setName("Marte");
		t2.setPriority(Thread.MAX_PRIORITY);
		
		Thread t3 = new Thread(p, "Plutão");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

	}	

