package br.com.impacta.classes;

public class Circulo extends Figura{
	
	private double raio;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		
		
		//PI * RAIO AO QUADRADO.
		
		return				//BASE        //EXPOENTE
		Math.PI * Math.pow(this.getRaio(), 2);
		
	}

}
