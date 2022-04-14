package br.com.impacta.threads;

public class ContadorThread extends Thread {

	@Override
	public void run() {
		
		try {
			
			for(int i=0; i< 20; i++) {
				
				System.out.print("*");
				Thread.sleep(250);
				
				
			}
			
			
		} catch (Exception e) {
			
		}
	}
	
	
	
	

}
