package br.com.impacta.aplica��o;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;
import br.com.impacta.classes.ProdutoImportado;

public class AppPolimorfismo03 {
	public static void main(String[] args) {
		Produto prod = new Produto("Alimenta��o","Batata Frita", 50);
		Produto prod2 = new ProdutoImportado("Transporte", "Bicicleta", 100, 6.0);
		
		if(prod2 instanceof ProdutoImportado) {
			((ProdutoImportado) prod2).setTaxaImporta��o(7.0);
		}
		
		
		
		
		JOptionPane.showMessageDialog(null, prod.mostrar());
		JOptionPane.showMessageDialog(null, prod2.mostrar());
	}


}
