package poo_java;

import javax.swing.JOptionPane;

public class Barcos {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, " Barco: ");
		Barco barco1 = new Barco ();
		barco1.nombre= "La santa maria";
		barco1.encender_motor();
		barco1.apagar_motor();
		
		
		
		JOptionPane.showMessageDialog(null, " Velero: ");
		
		Velero velero1 = new Velero ();
		velero1.nombre = " La niña";
		velero1.desplegar_velas();
		velero1.recoger_velas();
		
		
		
		JOptionPane.showMessageDialog(null, " De Vapor: ");
		DeVapor devap = new DeVapor();
		devap.nombre = " La pinta";
		devap.us_rueda();
		
		
		JOptionPane.showMessageDialog(null, " De Turbina: ");
		DeTurbinas detur = new DeTurbinas();
		detur.nombre = " Sevanes ";
		detur.impulso();
		
		
		
			
		
		

	}

}
