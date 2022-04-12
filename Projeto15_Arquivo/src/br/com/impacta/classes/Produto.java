package br.com.impacta.classes;

public class Produto {
	
	private final int codigo;
	private String descrição;
	private String categoria;
	private double preço;

	private static int CONTADOR =  1;
		
	public Produto(String categoria, String descrição, double preço) {	
		this.codigo = CONTADOR++;
		this.setCategoria(categoria);
		this.setDescrição(descrição);
		this.setPreço(preço);
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
		
	
	//metodo mostrar() - retorna todos os dados do objeto
	
	public String mostrar() {
		
		
		return "Codigo:" + this.getCodigo() +
				"\nDescrição:" + this.getDescrição() +
				"\nCategoria:" + this.getCategoria() +
				"\nPreço:" + this.getPreço();
		
		
	}



	@Override
	public String toString() {
		
		return   "(" + this.getCodigo() + " , " 
				   + this.getDescrição() + ", " 
				   + this.getCategoria() + ", "
				   + this.getPreço() + ")";
}



	
	}
	


