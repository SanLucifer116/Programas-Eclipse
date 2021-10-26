package poo_java;

import javax.swing.JOptionPane;

public class Personaje {
	
	//ATRIBUTOS 
	String nombre;
	int nivel=1, fuerza=15, magia=10 ;
	
	
	//METODOS
	void mover () {
		JOptionPane.showMessageDialog(null, " Se movio el personaje" + nombre);
	}
 void atacar () {
	 
	 
	 
	 JOptionPane.showMessageDialog(null, " Ataco el personaje" + nombre);
	 
	 
	 
 }
}
