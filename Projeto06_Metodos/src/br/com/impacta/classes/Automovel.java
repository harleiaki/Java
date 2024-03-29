package br.com.impacta.classes;

public class Automovel {
	
	//FINALIZED
	
	//STATIC FINAL TEMOS QUE IFORMAR UM VALOR INICIAL
	//POR OBRIGA��O. FINAL TEMOS QUE INFORMAR ALGO.
	
	
	//Quando criamos uma constante (STATIC + FINAL)
	//O nome deve ser maisculo.
	
	public static final String PAIS_ORIGEM = "Brasil";

	// atributos.
	private String marca;
	private String modelo;
    private int ano;
	private String placa;

	public String mostrar() {
		
		String titulo = "\n\t\tDADOS DO AUTOM�VEL";
		
	    return  titulo + "\n\n\tMarca:" + this.getMarca() +  
				"\n\tModelo:" + this.getModelo() +
				"\n\tAno:" + this.getAno() +
				"\n\tPa�sOrigem:" + PAIS_ORIGEM +
				"\n\tPlaca:"+ this.getPlaca();
	}

public String mostrar(String titulo) {
		
	     String resposta= titulo +
	
	            "\n\n\tMarca:" + this.getMarca() +  
				"\n\tModelo:" + this.getModelo() +
				"\n\tAno:" + this.getAno() +
				"\nPa�s Origem" +PAIS_ORIGEM +
				"\n\tPlaca:"+ this.getPlaca();
return resposta;
}
	//THIS REFERENCIA A PROPRIA CLASSE
	//� uma referencia que serve para termos acesso a todods 
	// os atributos da classe. ( atributos e metodos)
	
	//TODA CLASSE POSSUI UM THIS. ( identifica info que fazem parte da classe

	public void lerDados(String marca, String modelo,int ano, String placa) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
	
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		
		if(ano<1970) {
			throw new NumberFormatException("O ano n�o pode ser menor que 1970.");
		}
		
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	//Static dispensa o uso de objeto, e n�o ocupa espa�o na memoria Heap.
	
	//Static n�o precisa de nenhum objeto para ser executado.
	
	//pelo fato de ser static o this n�o funciona.
	

	
		
	}

