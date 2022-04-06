package br.com.impacta.aplicação;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
//		Pessoa pessoa = new Pessoa();
//		pessoa.setNome("Lucas");
//		pessoa.setIdade(28);
//		pessoa.setSexo(Sexo.MASCULINO);
//		JOptionPane.showMessageDialog(null,pessoa.mostrar());
//		
		
		//instancia da  classe funcionario
		Pessoa funcionario = new Funcionario();
		funcionario.setNome("Joel");
		try {
			funcionario.setIdade(29);
		} catch (IllegalAccessException e) {			
			e.printStackTrace();
		}
		funcionario.setSexo(Sexo.MASCULINO);
		((Funcionario)funcionario).setCargo("Vendedor");
		((Funcionario)funcionario).setSalario(5000);
		JOptionPane.showMessageDialog(null,funcionario.mostrar());
		
		
		//instancia da classe Aluno
		Pessoa aluno = new Aluno();
		aluno.setNome("Luana");
		try {
			aluno.setIdade(32);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		aluno.setSexo(Sexo.FEMININO);
		((Aluno)aluno).setMatricula(12345);
		
//		Curso novoCurso = new Curso();
//		novoCurso.setCodigo(222);
//		novoCurso.setDescricao("Java Programmer");,r
//		novoCurso.setCargaHoraria(100);
//		novoCurso.setPreco(1000);
		
		((Aluno)aluno).setCurso( new Curso(222,"Java Programmer", 100,1000));
		JOptionPane.showMessageDialog(null,aluno.mostrar());
		
		
	
		
		
	}
	
}