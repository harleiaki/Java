package br.com.impacta.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.impacta.classes.Produto;

public class AppSet03 {
	public static void main(String[] args) {
		
		Set<Produto> produtos = new LinkedHashSet<>();
		
		produtos.add(new Produto("Informatica", "Lapop", 4500));
		produtos.add(new Produto("Limpeza", "Sabonete", 3));
		produtos.add(new Produto("Alimentação", "Macarrão", 5));
		produtos.add(new Produto("Informatica", "Webcam", 389));
		
		
		//produtos.add(new Produto("Transporte", "Bicicleta", 2000));
		
		Produto p = new Produto("Transporte", "Bicicleta", 2000);
		produtos.add(p);
		produtos.add(p);
		produtos.add(p);
		
		
		produtos.forEach(produto -> System.out.println(produto));
		
		
		
		
		
	}

}
