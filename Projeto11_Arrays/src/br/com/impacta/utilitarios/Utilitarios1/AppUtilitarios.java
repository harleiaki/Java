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
	    
	    
	    //executando o metodo calcularMediaArray()
	    double[] lista = {2.3,4.5,9.1,10,8};
	    double media = Utilitarios.calcularMediaArray(lista);
	    
	    System.out.println("Média dos elementos do array:" + media);
	    
	    
	    //executando o método CalcularMediaNumeros()
	    double m1=Utilitarios.calcularMediaNumeros();
	    double m2=Utilitarios.calcularMediaNumeros(2,3);
	    double m3=Utilitarios.calcularMediaNumeros(9,8,4,6,1,7,6,0);
	    double m4=Utilitarios.calcularMediaNumeros(lista);
	    
	    System.out.println("m1:" + m1);
	    System.out.println("m2:" + m2);
	    System.out.println("m3:" + m3);
	    System.out.println("m4:" + m4);
	       
}
}
