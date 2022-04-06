package br.com.impacta.aplicação;

import javax.swing.JOptionPane;
import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;

public class AppFiguras {
	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo(10,15);
		//ret.setBase(10);
		//ret.setAltura(15);
				
		Circulo cir = new Circulo(5);
		//cir.setRaio(5);
		
		//apresentar os dados
		JOptionPane.showMessageDialog(null, ret.apresentarFigura());
		JOptionPane.showMessageDialog(null, cir.apresentarFigura());
					
	}
}