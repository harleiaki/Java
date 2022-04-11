package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.impacta.classes.OrdenacaoCategoria;
import br.com.impacta.classes.OrdenacaoDescricao;
import br.com.impacta.classes.Produto;

public class AppList02 {
	public static void main(String[] args) {
		
		
		//Interface					//tipo
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(new Produto("Informatica", "Lapop", 4500));
		produtos.add(new Produto("Limpeza", "Sabonete", 3));
		produtos.add(new Produto("Alimentação", "Macarrão", 5));
		produtos.add(new Produto("Informatica", "Webcam", 389));
		produtos.add(new Produto("Transporte", "Bicicleta", 2000));
		
		//apresentando os dados, usando o metodo forEach()
		System.out.println("Lista Original: ");
		produtos.forEach(produto -> System.out.println(produto));
		
		Collections.sort(produtos, new OrdenacaoCategoria());
		
		System.out.println();
		System.out.println("Lista Ordenada pela Categoria: ");
		produtos.forEach(produto -> System.out.println(produto));
		
		Collections.sort(produtos, new OrdenacaoDescricao());
		
		System.out.println();
		System.out.println("Lista Ordenada pela Descrição: ");
		produtos.forEach(produto -> System.out.println(produto));

		
		
	}

}
