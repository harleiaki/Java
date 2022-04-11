package br.com.impacta.aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class AppSet02 {
	public static void main(String[] args) {
		
		Set<String> nomes = new TreeSet<>();
		nomes.add("Amendoin");
		nomes.add("Chocolate");
		nomes.add("Coxinha");
		nomes.add("Sorvete");
		nomes.add("Churros");
		nomes.add("Bacon");
		nomes.add("Sorvete");
		
		
		nomes.forEach(s -> System.out.println(s));
		
	}

}
