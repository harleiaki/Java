package br.com.impacta.aplica��o;

import java.util.Arrays;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppArray06 {
	public static void main(String[] args) {
		
		
		//criando uma cole��o de objetos automovel.
		Automovel[] automoveis = new Automovel[3];
		
		//instanciar a classe Automovel para cada posi��o.
		
		automoveis[0] = new Automovel ( "VW", "Fusca", 1970, "ASD3201");
		automoveis[1] = new Automovel ( "Honda", "Civic", 2020, "ASA4324");
		automoveis[2] = new Automovel ( "Toyota", "Yaris", 2021, "BDS4562");
		
		Arrays.sort(automoveis);
		
	
		
		for (Automovel automovel : automoveis) {
			JOptionPane.showMessageDialog(null, automovel.mostrar());
		}
	}

}
