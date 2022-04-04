package br.com.impacta.aplicação;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		
		
		
	
		String des;
		String cat;
		double preço;
		
		Produto celular;
		

		
		while (true) {
			des = (JOptionPane.showInputDialog("Informe a descrição:"));
			cat = (JOptionPane.showInputDialog("Informe o categoria:"));
			preço = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço:"));
			celular = new Produto(des, cat, preço);
			System.out.println(celular.mostrar());
			JOptionPane.showMessageDialog(null, celular.mostrar());
			
			int opção = JOptionPane.
			showConfirmDialog(null, "Deseja continuar?","CONFIRMAÇÃO", 
					JOptionPane.YES_NO_OPTION);
			
			if(opção == JOptionPane.NO_OPTION) {
				break;
			}
		}
//	
//	//	des = (JOptionPane.showInputDialog("Informe a descrição:"));
//		cat = (JOptionPane.showInputDialog("Informe o categoria:"));
//		preço = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço:"));
//		
//		celular = new Produto(des,cat,preço);
//		
//
//		
//		System.out.println(celular.mostrar());
//		JOptionPane.showMessageDialog(null,celular.mostrar());
//		
	}
}
	