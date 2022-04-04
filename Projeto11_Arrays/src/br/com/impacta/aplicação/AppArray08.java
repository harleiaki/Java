package br.com.impacta.aplicação;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import java.util.Arrays;
import br.com.impacta.classes.Curso;

public class AppArray08 {
	public static void main(String[] args) {
		
		int quantidade = parseInt
				(showInputDialog
						("Informe a quantidade de cursos:"));
		
		Curso[] cursos = new Curso[quantidade];
		
		for (int i=0; i < cursos.length ; i++) {
			int codigo = parseInt
					(showInputDialog
					("Informe o codigo do curso:" + (i+1)));
			
			String descrição = 
					showInputDialog
					("Descrição o codigo do curso" + (i+1));
			
			int ch= parseInt
					(showInputDialog
					("Carga horária do curso" + (i+1)));
			
			double preço= parseDouble
					(showInputDialog
					("Preço do curso:" +(i+1)));
			cursos[i] = new Curso(codigo, descrição, ch, preço);
			
		}
		
		Arrays.sort(cursos);
		
		//Necessita do compareTo na classe curso, para ordenar o atributo.
		
		
		//apresenta os dados do usuario//
		for(Curso curso : cursos) {
			System.out.println(curso.mostrar());
			System.out.println();
		}		
	}
}
