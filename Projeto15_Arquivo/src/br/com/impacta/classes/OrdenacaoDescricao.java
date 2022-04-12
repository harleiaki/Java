package br.com.impacta.classes;

import java.util.Comparator;

public class OrdenacaoDescricao implements Comparator<Produto>{
	
	@Override
	public int compare(Produto prod1, Produto prod2) {
		
		return prod1.getDescri��o().compareTo(prod2.getDescri��o());
	}
}
