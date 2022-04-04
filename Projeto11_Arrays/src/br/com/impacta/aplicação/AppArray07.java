package br.com.impacta.aplicação;

import javax.swing.JOptionPane;
import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;
import br.com.impacta.interfaces.Figura;

public class AppArray07 {
	public static void main(String[] args) {
		
		//definindo um array de "FIGURAS"
		Figura[] figuras = new Figura[3];
		
		figuras[0] = new Retangulo(20,40);
		figuras[1] = new Circulo(70);
		figuras[2] = new Retangulo(1,1);
		
		//apresentando as figuras
		for (Figura figura : figuras) {
			JOptionPane.showMessageDialog(null, figura.apresentarFigura());
		}
	}
}
