package br.com.impacta.aplicação;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumerações.Sexo;

public class AppPolimorfismo04 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("J", 12, Sexo.MASCULINO, "Dev", 2000);
		//Desejamos alterar o valor do salario no objeto.
		
		Funcionario func = (Funcionario) p1;  //typecast de salario
		func.setSalario(12300);					
														
												//Duas formas de typecast Salario.
		
		((Funcionario)p1).setSalario(12300);  //typecast de salario
		
		
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		
		
		p1 = new Aluno("H",20,Sexo.MASCULINO,123, 
				new Curso(12,"C#", 1321,34));
		
		//Desejamos alterar o curso para Java;
		
		Curso curso = new Curso(10,"Java", 12, 1000);
		
		if(p1 instanceof Aluno) {			//typecast com if instanceof'
			p1.setIdade(12);
			((Aluno) p1).setCurso(curso);
		}
		
		
		((Aluno)p1).setCurso(curso);  // força o typecast curso.
				
										//DUAS FORMAS DE TYPECAST;
		
		Aluno aluno = (Aluno)p1;      
		aluno.setCurso(curso);        // força o typecast curso.
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		
		
		
		
	}

}
