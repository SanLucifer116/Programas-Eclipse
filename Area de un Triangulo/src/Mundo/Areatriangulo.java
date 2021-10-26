package Mundo;


import javax.swing.*;

public class Areatriangulo {
	
	
	private int base;
	private int altura;
	private double area;
	public Areatriangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	
	
	
	public double CalculoArea(){
		return area=((getBase()*getAltura())/2);
	}
	
	
	
	
	

}
