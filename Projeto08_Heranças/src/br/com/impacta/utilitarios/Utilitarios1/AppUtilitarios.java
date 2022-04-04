package br.com.impacta.utilitarios.Utilitarios1;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	
	public static void main(String[] args) {
		double soma = Utilitarios.somar(2,4.5);
		
		System.out.println(soma);
		
		
		String novaFrase = Utilitarios.removerEspaços("Está chovendo muito");
		
		System.out.println(novaFrase);
	
	     
	    String novoNome = Utilitarios.gerarEmail(" harlei "," aki ");
	    
	    System.out.println(novoNome);
	    
	    
	    
	    
	    

}
}
