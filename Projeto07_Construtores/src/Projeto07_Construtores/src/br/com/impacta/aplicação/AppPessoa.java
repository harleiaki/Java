package br.com.impacta.aplica��o;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumera��es.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Lucas";
		pessoa.idade = 28;
		pessoa.sexo = Sexo.MASCULINO;
		
		
		
	}
	
}