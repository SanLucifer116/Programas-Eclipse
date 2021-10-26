package poo_java;

import javax.swing.JOptionPane;

public class Ejemplo {

	public static void main(String[] args) {
		
		
		Mago mago1 = new Mago();
		mago1.nombre = " Merlin ";
		mago1.mover();
		mago1.atacar();
		mago1.boladefuego();
		
		
		Guerrero guerrero1 = new Guerrero();
		guerrero1.nombre = " Leoindas ";
		guerrero1.mover();
		guerrero1.atacar();
		guerrero1.supergolpe();
		
		
	

	}

}
