package br.com.impacta.aplica��o;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumera��es.Sexo;

public class AppPolimorfismo01 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("J", 12, Sexo.MASCULINO, "Dev", 2000);
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		//QUEM EXECUTA O METODO � O OBJETO! NUNCA A VARIAVEL.
		
		//P1 � APENAS UMA VARIAVEL DE REFERENCIA.
		
		p1 = new Aluno("H",20,Sexo.MASCULINO,123, 
				new Curso(12,"C#", 13,321));
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		
		
		
		
		
		
	}

}
