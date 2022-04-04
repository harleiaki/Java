package br.com.impacta.classes;

public class Produto {
	private final int codigo;
	private String categoria;
	private String descricao;
	private double preco;
	
	private static int contador = 1;
	
	public Produto(String categoria, String descricao, double preco) {
		this.codigo = contador++;
		this.setCategoria(categoria);
		this.setDescricao(descricao);
		this.setPreco(preco);	
	}
	
	
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//metodo mostrar() - retorna todos os dados do objeto.
	public String mostrar() {	
		
		
		return "Código: " + this.getCodigo() +
			   "\nDescrição: " + this.getDescricao() +
			   "\nCategoria: " + this.getCategoria() + 
			   "\nPreço: " + this.getPreco();
	}
	
	
	
	
	
	
	
	

}