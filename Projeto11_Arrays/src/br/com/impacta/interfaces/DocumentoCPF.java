package br.com.impacta.interfaces;

import br.com.impacta.interfaces.Documento;

public class DocumentoCPF implements Documento {

	private String cpf;
	
	public DocumentoCPF(String cpf) {
		super();
	
		this.setNumero(cpf);
	}
	
	public void setNumero(String numero) {
		

		//expressao regular.
		if(!numero.matches("[0-9]{11}")) { 
			throw new NumberFormatException("CPF" + "deve ter 11 digitos");
		}
		this.cpf = numero;
	}
	

	@Override
	public String getNumero() {
		return this.cpf;
	}
	

}
