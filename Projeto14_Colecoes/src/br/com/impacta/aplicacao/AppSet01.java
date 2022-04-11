package br.com.impacta.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {
	
	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<>();
		nomes.add("Amendoin");
		nomes.add("Chocolate");
		nomes.add("Coxinha");
		nomes.add("Sorvete");
		nomes.add("Churros");
		nomes.add("Bacon");
		nomes.add("Sorvete");//Não exibe duplicados.
		
		//HASHSET COLEÇÃO MAIS EFICIENTE 
		//POREM não garante ordem nada, ele decode a ORDEM
		//HashSet remove itens duplicados
		nomes.forEach(s -> System.out.println(s));
		
		
	}

	}

