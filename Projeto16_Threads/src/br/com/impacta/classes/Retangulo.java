package br.com.impacta.classes;

import br.com.impacta.interfaces.Figura;

public class Retangulo implements Figura {
	
	private double base;
	private double altura;
	
	
	public Retangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	
	
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


	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
