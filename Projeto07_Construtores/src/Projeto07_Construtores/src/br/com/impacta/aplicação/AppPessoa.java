package br.com.impacta.aplicação;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumerações.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Lucas";
		pessoa.idade = 28;
		pessoa.sexo = Sexo.MASCULINO;
		
		
		
	}
	
}