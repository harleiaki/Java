package br.com.impacta.threads;

public class Processo03 implements Runnable{

	
	public int total;
	
	@Override
	public void run() {
		
		for(int i = 0; i<200; i++) {
			total += i;
			
		}	
	}
}
