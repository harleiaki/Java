package br.com.impacta.interfaces;

import br.com.impacta.interfaces.Documento;

public class DocumentoCNPJ implements Documento {

		private String cnpj;
		
		public DocumentoCNPJ(String cnpj) {
			super();
			this.setNumero(cnpj);
		}
		
		public void setNumero(String numero) {
			
			//expressao regular.
			if(!numero.matches("[0-9]{14}")) { 
				throw new NumberFormatException("CNPJ" + "deve ter 14 digitos");
			}
			this.cnpj = numero;
		}
		public String getNumero() {
			return this.cnpj;
		}

}
