package poo_java;

import javax.swing.JOptionPane;

public class Barco extends Vehiculo {

	int potencia;
	
	
	void encender_motor() {
		
		JOptionPane.showMessageDialog(null, "El barco " + nombre +  " a encendido el motor");
		
		
		
	}
	
	void apagar_motor () {
		
		JOptionPane.showMessageDialog(null, "El barco " + nombre +  " a apagado el motor");
		
		
	}
	
	
	
}
