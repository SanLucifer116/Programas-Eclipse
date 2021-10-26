package poo_java;

import javax.swing.JOptionPane;

public class Velero extends Vehiculo {
	
	
	
	int numvelas;
	
	
	void desplegar_velas() {
		
		
		JOptionPane.showMessageDialog(null, "El Velero" + nombre +  " a desplegado velas");
		
	
	}
	
	void recoger_velas() {
		
		
		JOptionPane.showMessageDialog(null, "El Velero " + nombre +  " a recogido velas");
		
	
	}
}
