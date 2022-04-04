package br.com.impacta.classes;

import br.com.impacta.enumerações.Sexo;
import br.com.impacta.interfaces.Documento;


//EXTENDS = HERANCA (SUBCLASSE DE PESSOA)
public class Funcionario extends Pessoa {
	
	private String cargo;
	private double salario;
	
	public Funcionario() {
	super();
	}
	
	public  Funcionario(String nome, 
						int idade, 
						Sexo sexo, 
						String cargo, Documento documento,
						double salario) {
	super(nome, idade, sexo, documento);
	this.setCargo(cargo);
	this.setSalario(salario);
}
	
	
	//OVERRIDE = METODO QUE SOBRESCREVE 
	
	
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
	

}