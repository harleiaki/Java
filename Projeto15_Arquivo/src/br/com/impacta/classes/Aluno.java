package br.com.impacta.classes;

import java.util.List;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public class Aluno extends Pessoa {
  
	private int matricula;
	private List<Curso> cursos;
	
	public Aluno () {
		super();		
	}
	public  Aluno(String nome, 
			int idade, 
			Sexo sexo, 
			int matricula, Documento documento
		    ) throws IllegalAccessException {
		
		super(nome, idade, sexo, documento);
		this.setMatricula(matricula);
	}
	
	
	
	

	public int getMatricula() {
		this.setMatricula(matricula);
		 
		
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	@Override
	public String mostrar() {
		return 		super.mostrar()	+	"\nMatricula:" + this.getMatricula();
				
				
		
			//		((this.getCurso() == null) ? "\nNenhum curso atribuido." :
						
					
						
			//	"\n\nDados do Curso:\n\n" + this.getCurso().mostrar()); //Execução em cadeia normal de acontecer.//
				
				
	}
	
	
	
	
}