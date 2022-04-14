package br.com.impacta.aplicacao;

public class AppThread04 {
	public static void main(String[] args) {
		
		Thread t = new Thread(
				
		() -> {
			
			System.out.println
			("Nome de Thread: " + Thread.currentThread().getName());
			
			
		}
					
	);
		t.start();
		
	}
}
