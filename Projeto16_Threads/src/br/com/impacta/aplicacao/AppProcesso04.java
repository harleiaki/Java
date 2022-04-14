package br.com.impacta.aplicacao;

import br.com.impacta.threads.Processo04;

public class AppProcesso04 {
		
		public static void main(String[] args) {

			Processo04 p4 = new Processo04();
			Thread t = new Thread(p4);
			t.start();
			
			synchronized(t) {
				try {
					
					System.out.println("Estou esperando... : " );
					t.wait();
					
					
				} catch (Exception e) {
					
				}
					
				System.out.println("Total é igual a : " + p4.total);
				
			}

}
}