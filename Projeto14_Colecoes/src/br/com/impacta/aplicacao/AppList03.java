package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.classes.Produto;

public class AppList03 {
	public static void main(String[] args) {
		
List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(new Produto("Informatica", "Lapop", 4500));
		produtos.add(new Produto("Limpeza", "Sabonete", 3));
		produtos.add(new Produto("Alimentação", "Macarrão", 5));
		produtos.add(new Produto("Informatica", "Webcam", 389));
		produtos.add(new Produto("Transporte", "Bicicleta", 2000));
		
		//apresentando os dados, usando o metodo forEach()
		System.out.println("Lista Original: ");
		produtos.forEach(produto -> System.out.println(produto));
		
		//ordenação pela categoria
		produtos.sort((a,b) -> a.getCategoria().compareTo(b.getCategoria()));
		
		System.out.println();
		System.out.println("Lista Ordenada pela Categoria:");
		produtos.forEach(produto -> System.out.println(produto));
		
		
		
	}

}
