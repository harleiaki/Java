package br.com.impacta.classes;

import java.util.Comparator;

public class OrdenacaoDescricao implements Comparator<Produto>{
	
	@Override
	public int compare(Produto prod1, Produto prod2) {
		
		return prod1.getDescrição().compareTo(prod2.getDescrição());
	}
}
