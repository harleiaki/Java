package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppList01 {
	public static void main(String[] args) { //List se ordena por natureza
											//set não se ordena por natureza
		List<String> nomes = new ArrayList<>(); //Collections PLURAL FEITO PARA LISTA
		
		nomes.add("H");
		nomes.add("Amendoin");
		nomes.add("Lucas");
		nomes.add(0,"R");
		
		// cuidado com remove
		//nomes.remove(1);
		
		
		//analise de todos os nomes da lista, para remover todos os 
		//que terminam com "s". 
		//nomes.removeIf(parametro_do_metodo -> parametro_do_metodo.endsWith("s"));
		
		
		//Apresentando os elementos usando a propria lista.
		System.out.println(nomes);
		
		System.out.println();
		//usando a estrutura forEach
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		//Ordenação da coleção
		Collections.sort(nomes);
		
		System.out.println();
		//Usando o metodo forEach()	
		nomes.forEach(s -> System.out.println(s));
		
	}
}
