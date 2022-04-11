package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public abstract class Pessoa implements Comparable <Pessoa>{  //Abstrata n�o pode ser instanciada. Elas servem exclusivamente como superclasses.
	
	private	String nome;
	private	int idade;
	private	Sexo sexo;
	
	private Documento documento;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, int idade, Sexo sexo, Documento documento) 
	throws IllegalAccessException
	{
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setDocumento((DocumentoCnpj) documento);
		
	}
	
	public String mostrar() {
		return 
				"\nNome:" + this.getNome() +
				"\nIdade:" + this.getIdade() +
				"\nSexo:" + this.getSexo() +
				
		(this.getDocumento() instanceof DocumentoCpf ? 
											"\nCPF: " : "\nCNPJ: ") +
											this.getDocumento().getNumero(); 
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(DocumentoCnpj documentoCnpj) {
		this.documento = (Documento) documentoCnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() ==0) {
			throw new IllegalArgumentException("O nome foi fornecido incorretamente.");
		}
		this.nome = nome;
	}
	public int getIdade() {	
		return idade;
	}
	public void setIdade(int idade) throws IllegalAccessException{
		if(idade < 0) {
			throw new IllegalAccessException("A idade n�o pode ser negativa");
		}
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

public int compareTo(Pessoa nome_atual) {
		
		return this.getNome().compareTo(nome_atual.getNome());
	}

	
}