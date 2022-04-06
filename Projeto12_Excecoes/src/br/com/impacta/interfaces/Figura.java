package br.com.impacta.interfaces;

//INTERFACE É ABSTRATO POR DEFINIÇÃO.
//ABSTRATO NUNCA VAI TER CÓDIGO.

public interface Figura extends Comparable <Figura> {
	
	//TODOS OS METODOS DE UMA INTERFACE SÃO,
	//PUBLICOS E ABSTRATOS POR DEFINIÇÃO.
	
	//public abstract
	 double calcularArea();

	//TODOS OS ATRIBUTOS DE UMA INTERFACE,
	//SÃO PUBLICOS, ESTATICOS E CONSTANTES ( FINAL)
	//POR DEFINIÇÃO.
	
	
	//public static final
	String AUTOR = "Equipe Impacta";
	
	//método default = método definido na interface,
	//acessivel por todos os objetos de todas as classes
	//que implementarem.
	
		default String apresentarFigura() {
		
		String resposta = "Classe: " + this.getClass()
									.getSimpleName() +
				"\nArea: " + this.calcularArea();
		
		
		return resposta;
		
		//this é uma referencia ao objeto da classe que vai implementar.
		
	
	
}
}
