package br.com.impacta.aplica��o;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {			
		
		while (true) {
			String cat = JOptionPane.showInputDialog("Informe a categoria");
			String desc = JOptionPane.showInputDialog("Informe a descri��o");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o"));
			Produto celular = new Produto(cat, desc, preco);
			System.out.println(celular.mostrar());
			JOptionPane.showMessageDialog(null, celular.mostrar());
			
			int opcao = JOptionPane
			.showConfirmDialog(null,"Deseja continuar?", "Confirma��o", 
					JOptionPane.YES_NO_OPTION);
			
			 if( opcao == JOptionPane.NO_OPTION) {				 
				 break;				 
			 }			
		}
		
	    
	    
		
	}

}
	