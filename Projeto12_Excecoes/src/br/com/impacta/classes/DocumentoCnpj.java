package br.com.impacta.classes;

public class DocumentoCnpj implements Documento {

		private String cnpj;
		
		public DocumentoCnpj(String cnpj) {
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
