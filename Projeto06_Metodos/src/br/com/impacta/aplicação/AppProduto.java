package br.com.impacta.aplicação;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo:"));
		String des = (JOptionPane.showInputDialog("Informe a descrição:"));
		String cat = (JOptionPane.showInputDialog("Informe o categoria:"));
		double preço = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço:"));
		
		celular.setCodigo(cod);
		celular.setDescrição(des);
		celular.setCategoria(cat);
		celular.setPreço(preço);
		
		System.out.println(celular.mostrar());
		JOptionPane.showMessageDialog(null,celular.mostrar());
		
		
		
		
		
		
	}
}
	