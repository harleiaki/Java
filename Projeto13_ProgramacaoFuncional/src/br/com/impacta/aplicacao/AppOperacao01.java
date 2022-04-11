package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Operacao01;

public class AppOperacao01 {
	
	public static int contarPalavras(String l) {
		
			String texto = l.trim();
			String[] itens = texto.split("");
			int contador = 0;
			
			for (String elemento : itens) {
				
				
				if(elemento.length() > 0)
				contador++;
			}
			
			return contador;	
	
	}
	public static void main(String[] args) {
							//Pela interface sera tipo string.
							//Temos todos os metodos String.
		Operacao01 op1 = l -> {return l.length(); };// quando for executada;
									//devolve o num de caracter
						
			
										//atribuido para "L"
		int retorno = op1.executar("Curso Java");
							//executar recebe resultado da expressa lambda. 
		
		System.out.println("op1: " + retorno);
		
		//parametro: um texto
		//retorno: numero de palavras
		
		Operacao01 op2 = s->	{
			
			//trim( = remove os espaços
			//da esquerda e da direita
			//do texto
			
			String texto = s.trim();
			String[] itens = texto.split("");
			int contador = 0;
			
			for (String elemento : itens) {
				
				
				if(elemento.length() > 0)
				contador++;
			}
			return contador;
			
			
		};
		
		String texto = "O curso de Java termina dia 14"	;
		
		int resultado = op2.executar(texto);
		
		System.out.println("O texto possui" + resultado);
		
		System.out.println("O resultado é " + "\"" + resultado + "\"");
		
		
		Operacao01 op3 = l -> contarPalavras(l);
		op3.executar("Esse exemplo é muito comum");
		
	}						
	

}
