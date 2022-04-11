package br.com.impacta.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.impacta.classes.Curso;

public class AppSet04 {

	public static void main(String[] args) {
		
		Set<Curso> cursos = new LinkedHashSet<>();
		cursos.add(new Curso(100, "PHP", 100, 1200));
		cursos.add(new Curso(100, "Ingles", 100, 1500));
		cursos.add(new Curso(100, "Frances", 8, 2000));
		cursos.add(new Curso(100, "PHP", 100, 1200));
		
		//verificacoes realizadas pelo Set
		//Se os objetos possuem a mesma identidade
		//Se os objetos possuem o mesmo codigo Hash|
		
		cursos.forEach(s -> System.out.println(s.mostrar() + "\n"));
	
}

	}	


