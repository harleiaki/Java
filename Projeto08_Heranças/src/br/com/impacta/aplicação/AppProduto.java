package br.com.impacta.aplica��o;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		
		
		
	
		String des;
		String cat;
		double pre�o;
		
		Produto celular;
		

		
		while (true) {
			des = (JOptionPane.showInputDialog("Informe a descri��o:"));
			cat = (JOptionPane.showInputDialog("Informe o categoria:"));
			pre�o = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o:"));
			celular = new Produto(des, cat, pre�o);
			System.out.println(celular.mostrar());
			JOptionPane.showMessageDialog(null, celular.mostrar());
			
			int op��o = JOptionPane.
			showConfirmDialog(null, "Deseja continuar?","CONFIRMA��O", 
					JOptionPane.YES_NO_OPTION);
			
			if(op��o == JOptionPane.NO_OPTION) {
				break;
			}
		}
//	
//	//	des = (JOptionPane.showInputDialog("Informe a descri��o:"));
//		cat = (JOptionPane.showInputDialog("Informe o categoria:"));
//		pre�o = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o:"));
//		
//		celular = new Produto(des,cat,pre�o);
//		
//
//		
//		System.out.println(celular.mostrar());
//		JOptionPane.showMessageDialog(null,celular.mostrar());
//		
	}
}
	