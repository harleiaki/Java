package br.com.impacta.interfaces;

//INTERFACE � ABSTRATO POR DEFINI��O.
//ABSTRATO NUNCA VAI TER C�DIGO.

public interface Figura extends Comparable <Figura> {
	
	//TODOS OS METODOS DE UMA INTERFACE S�O,
	//PUBLICOS E ABSTRATOS POR DEFINI��O.
	
	//public abstract
	 double calcularArea();

	//TODOS OS ATRIBUTOS DE UMA INTERFACE,
	//S�O PUBLICOS, ESTATICOS E CONSTANTES ( FINAL)
	//POR DEFINI��O.
	
	
	//public static final
	String AUTOR = "Equipe Impacta";
	
	//m�todo default = m�todo definido na interface,
	//acessivel por todos os objetos de todas as classes
	//que implementarem.
	
		default String apresentarFigura() {
		
		String resposta = "Classe: " + this.getClass()
									.getSimpleName() +
				"\nArea: " + this.calcularArea();
		
		
		return resposta;
		
		//this � uma referencia ao objeto da classe que vai implementar.
		
	
	
}
}
