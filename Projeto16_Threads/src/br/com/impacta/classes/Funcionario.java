package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;


//EXTENDS = HERANCA (SUBCLASSE DE PESSOA)
public class Funcionario extends Pessoa {
	
	private String cargo;
	private double salario;
	
	public Funcionario(String itens, int i, Object object, Object object2, int i2, double d) {
	super();
	}
	
	public  Funcionario(String nome, 
						int idade, 
						Sexo sexo, 
						String cargo, Documento documento,
						double salario) throws IllegalAccessException {
	super(nome, idade, sexo, documento);
	this.setCargo(cargo);
	this.setSalario(salario);
}
	
	
	//OVERRIDE = METODO QUE SOBRESCREVE 
	
	
	public Funcionario(String string, int parseInt, Object object, Object object2) {
		
	}


	public Funcionario(String string, int parseInt, Object object, Object object2, String string2, double parseDouble) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrar() {
		return super.mostrar() +
				"\nCargo:" + this.getCargo() +
				"\nSalario:" + this.getSalario();
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", salario=" + salario + "]";
	}
	

}