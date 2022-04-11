package br.com.impacta.aplicacao;

import br.com.impacta.classes.Curso;
import br.com.impacta.interfaces.Operacao04;

public class AppOperacao04 {
	public static void main(String[] args) {
		
		Operacao04<Curso,Integer> op1 = p -> p.getCargaHoraria();
		
		System.out.println
		(op1.executar(new Curso(10,"Java",100,850.0)));
		
	}

}
