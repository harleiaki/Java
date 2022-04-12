package br.com.impacta.classes;

public class ProdutoImportado extends Produto {
	
	@Override
	public String mostrar() {
		
		return super.mostrar() + "\nTaxa de Importa��o:" 
				+ this.getTaxaImporta��o();
	}
	
	
	
	

	private double taxaImporta��o;
	
	public ProdutoImportado(String descri��o, 
							String categoria,
							double pre�o) {
		super(descri��o, categoria, pre�o); //Constru da superclasse.Produto//
		
	}
	
	public ProdutoImportado(String descri��o, 		
							String categoria,
							double pre�o, 
							double taxaImporta��o) {
		
		this(descri��o ,categoria, pre�o); // this comunica��o com a sobrecarga do construtor
		
		
		this.setTaxaImporta��o(taxaImporta��o);//acionando o metodo //setTaxaImporta��o
	}
	
	
	
	
	public double getTaxaImporta��o() {
		return taxaImporta��o;
	}

	public void setTaxaImporta��o(double taxaImporta��o) {
		this.taxaImporta��o = taxaImporta��o;
	}

	

}
