package br.com.impacta.threads;

public class ContadorThread extends Thread {

	@Override
	public void run() {
		
		try {
			
			for(int i=0; i< 20; i++) {
				System.out.println("*********");
				Thread.sleep(500);
				
				
			}
			
			
			
		} catch (Exception e) {
			
		}
	}
	
	
	
	

}
