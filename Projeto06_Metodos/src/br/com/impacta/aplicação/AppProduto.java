package br.com.impacta.aplica��o;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo:"));
		String des = (JOptionPane.showInputDialog("Informe a descri��o:"));
		String cat = (JOptionPane.showInputDialog("Informe o categoria:"));
		double pre�o = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o:"));
		
		celular.setCodigo(cod);
		celular.setDescri��o(des);
		celular.setCategoria(cat);
		celular.setPre�o(pre�o);
		
		System.out.println(celular.mostrar());
		JOptionPane.showMessageDialog(null,celular.mostrar());
		
		
		
		
		
		
	}
}
	