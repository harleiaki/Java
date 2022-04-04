package br.com.impacta.classes;

public class Retangulo extends Figura {
	
	private double base;
	private double altura;
	
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		
		return this.getBase() * this.getAltura();
	}
	

}
