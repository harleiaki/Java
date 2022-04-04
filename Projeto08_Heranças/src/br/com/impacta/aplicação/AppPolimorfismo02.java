package br.com.impacta.aplicação;


import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumerações.Sexo;

public class AppPolimorfismo02 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("J", 12, Sexo.MASCULINO, "Dev", 2000);
		
		
		Aluno p2 = new Aluno("H",20,Sexo.MASCULINO,1233, 
				new Curso(12,"C#", 13,890));
	
		mostrarPessoa(p1);
		mostrarPessoa(p2);
		
		
	}
	
	private static void mostrarPessoa(Pessoa p) {
		
		String nomeClasse = p.getClass().getSimpleName();
		String resposta = p.mostrar();
		
		JOptionPane.showMessageDialog(null, "Classe:" +nomeClasse +
				"\n" + resposta);
	}

}
