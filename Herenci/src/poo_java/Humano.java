package poo_java;

import javax.swing.JOptionPane;

public class Humano  extends Personaje{
	
	
	// ATRIBUTO ADICCIONAL
	
	String Desendencia;
	
	//METODOS ADICIONALES
	
	
	void diplomacia() {
		JOptionPane.showMessageDialog(null, " El jugador" + nombre + " Uso diplomacia");
	}

}
