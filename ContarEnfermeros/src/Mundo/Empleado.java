package Mundo;

import javax.swing.JOptionPane;

public class Empleado {

	private int cargo;

	public Empleado(int pCargo) {
		
		cargo = pCargo;
		
	}

	public int getCargo() {
		return cargo;
	}
	
	public int contadorenfermero(int empleados) {
     int x=0, contador=0 , pCargo;
	 for (x=1; x<=empleados; x++) {
	
	     pCargo = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite Cargo del Empleado 1= Enfdermero, 2= XXX"));
					
		 if (pCargo == 1)
		  	 contador++;

	}
	return contador;
	
}	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

