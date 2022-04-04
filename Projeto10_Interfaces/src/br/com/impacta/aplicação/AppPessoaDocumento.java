package br.com.impacta.aplicação;


import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumerações.Sexo;
import br.com.impacta.interfaces.DocumentoCNPJ;

public class AppPessoaDocumento {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("h");
		funcionario.setIdade(10);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Professor");
		funcionario.setSalario(40000);
		//funcionario.setDocumento( new DocumentoCPF()("4343434123"));
		funcionario.setDocumento( new DocumentoCNPJ("12313313000000"));
		
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
	}

}
