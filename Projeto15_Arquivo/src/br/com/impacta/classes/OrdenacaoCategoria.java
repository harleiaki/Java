package br.com.impacta.classes;

import java.util.Comparator;

public class OrdenacaoCategoria implements Comparator<Produto>{

	@Override
	public int compare(Produto prod1, Produto prod2) {
		
		return prod1.getCategoria().compareTo(prod2.getCategoria());
	}
	

}
