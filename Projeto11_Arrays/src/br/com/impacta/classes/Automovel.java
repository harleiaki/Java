
package br.com.impacta.classes;

public class Automovel implements Comparable<Automovel> {

	// FINALIZED

	// STATIC FINAL TEMOS QUE IFORMAR UM VALOR INICIAL
	// POR OBRIGAÇÃO. FINAL TEMOS QUE INFORMAR ALGO.

	// Quando criamos uma constante (STATIC + FINAL)
	// O nome deve ser maisculo.

	public static final String PAIS_ORIGEM = "Brasil";

	// atributos.
	private String marca;
	private String modelo;
	private int ano;
	private String placa;

	private final int chassi;

	// construtores
	public Automovel(String marca, String modelo) {
		this.chassi = (int) (Math.random() * 1000);
		this.setMarca(marca);
		this.setModelo(modelo);
	}

	public Automovel(String marca, String modelo, int ano) {
		this(marca, modelo);
		this.setAno(ano);	
	}

	public Automovel(String marca, String modelo, int ano, String placa) {
		this(marca,modelo,ano);
		this.setPlaca(placa);
	}

	// public Automovel(String marca, String modelo, int ano, String placa) {
	// super();
	// this.marca = marca;       //THIS.ATRIBUTO; THIS. METODO(); 
									//THIS() <<< SÓ PODEMOS UTILIZA 1X NA VIDA DENTRO DO CONSTRUTOR.
	// this.modelo = modelo;
	// this.ano = ano;
	// this.placa = placa;
	// }

	public String mostrar() {

		String titulo = "DADOS DO AUTOMÓVEL";

		String resposta = titulo + "\n\nMarca:" + this.getMarca() + "\nModelo:" + this.getModelo() + "\nChassi:"
				+ this.getChassi();

		if (this.getAno() > 0) {

			resposta += "\nAno:" + this.getAno();

		}

		if (this.getPlaca() != null) {

			resposta += "\nPlaca:" + this.getPlaca();
		}

		resposta += "\nPaísOrigem:" + PAIS_ORIGEM;

		return resposta;
	}

	public String mostrar(String titulo) {

		String resposta = titulo +

				"\n\nMarca:" + this.getMarca() + "\nModelo:" + this.getModelo() + "\nChassi:" + this.getChassi()
				+ "\ntAno:" + this.getAno() + "\nPaís Origem:" + PAIS_ORIGEM + "\nPlaca:" + this.getPlaca();
		return resposta;
	}
	// THIS REFERENCIA A PROPRIA CLASSE
	// é uma referencia que serve para termos acesso a todods
	// os atributos da classe. ( atributos e metodos)

	// TODA CLASSE POSSUI UM THIS. ( identifica info que fazem parte da classe

	public int getChassi() {
		return chassi;
	}

	public void lerDados(String marca, String modelo, int ano, String placa) {
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

		if (ano < 1970) {
			throw new NumberFormatException("O ano não pode ser menor que 1970.");
		}
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	public int compareTo(Automovel automovel_atual) {
		
		//Se MARCA for igual, compare com MODELO.//
		if(this.getMarca().compareTo(automovel_atual.getMarca())==0) { 
		return this.getModelo().compareTo(automovel_atual.getModelo());
	}
	
		return this.getMarca().compareTo(automovel_atual.getMarca());
	}
	
}

// Static dispensa o uso de objeto, e não ocupa espaço na memoria Heap.

// Static não precisa de nenhum objeto para ser executado.

// pelo fato de ser static o this não funciona.
