package br.com.impacta.aplica��o;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.interfaces.Figura;

public class AppClasseInterna {
	public static void main(String[] args) {
		//uso de classe interna an�nima - COMPLEMENTO
		
		Figura figura = new Figura() {

			@Override
			public int compareTo(Figura arg0) {
				
				return 0;
			}

			@Override
			public double calcularArea() {
				
				return 0;
			} //classe implementa a interface figura
			
		};
		
		
		Pessoa p = new Pessoa() {
			
		};//sempre sera subclasse de pessoa.
		
		
	}

}
