package br.com.impacta.classes;

public class Produto {
	
	private final int codigo;
	private String descri��o;
	private String categoria;
	private double pre�o;

	private static int CONTADOR =  1;
		
	public Produto(String categoria, String descri��o, double pre�o) {	
		this.codigo = CONTADOR++;
		this.setCategoria(categoria);
		this.setDescri��o(descri��o);
		this.setPre�o(pre�o);
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
		
	
	//metodo mostrar() - retorna todos os dados do objeto
	
	public String mostrar() {
		
		
		return "Codigo:" + this.getCodigo() +
				"\nDescri��o:" + this.getDescri��o() +
				"\nCategoria:" + this.getCategoria() +
				"\nPre�o:" + this.getPre�o();
		
		
	}



	@Override
	public String toString() {
		
		return   "(" + this.getCodigo() + " , " 
				   + this.getDescri��o() + ", " 
				   + this.getCategoria() + ", "
				   + this.getPre�o() + ")";
}



	
	}
	


