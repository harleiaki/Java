package br.com.impacta.classes;

public class ProdutoImportado extends Produto {
	
	@Override
	public String mostrar() {
		
		return super.mostrar() + "\nTaxa de Importação:" 
				+ this.getTaxaImportação();
	}
	
	
	
	

	private double taxaImportação;
	
	public ProdutoImportado(String descrição, 
							String categoria,
							double preço) {
		super(descrição, categoria, preço); //Constru da superclasse.Produto//
		
	}
	
	public ProdutoImportado(String descrição, 		
							String categoria,
							double preço, 
							double taxaImportação) {
		
		this(descrição ,categoria, preço); // this comunicação com a sobrecarga do construtor
		
		
		this.setTaxaImportação(taxaImportação);//acionando o metodo //setTaxaImportação
	}
	
	
	
	
	public double getTaxaImportação() {
		return taxaImportação;
	}

	public void setTaxaImportação(double taxaImportação) {
		this.taxaImportação = taxaImportação;
	}

	

}
