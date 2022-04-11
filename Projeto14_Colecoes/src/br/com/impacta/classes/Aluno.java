package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public class Aluno extends Pessoa {
  
	private int matricula;
	private Curso curso;
	
	public Aluno () {
		super();		
	}
	public  Aluno(String nome, 
			int idade, 
			Sexo sexo, 
			int matricula, Documento documento,
			Curso curso) throws IllegalAccessException {
		
		super(nome, idade, sexo, documento);
		this.setMatricula(matricula);
		this.setCurso(curso);
		this.setDocumento((DocumentoCnpj) documento);
	}
	
	@Override
	public String mostrar() {
		return 		super.mostrar()	+	"\nMatricula:" + this.getMatricula() +
				
				
		
					((this.getCurso() == null) ? "\nNenhum curso atribuido." :
						
					
						
				"\n\nDados do Curso:\n\n" + this.getCurso().mostrar()); //Execução em cadeia normal de acontecer.//
				
				
	}
	
	

	public int getMatricula() {
		this.setMatricula(matricula);
		 
		
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
	
}