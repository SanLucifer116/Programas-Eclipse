import javax.swing.JOptionPane;

import Mundo.Tablas;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
		 int pNumFinal, numfinal;
		 String cadena;
		 
		 pNumFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero Final"));
		 
		
		
		Tablas tabla = new Tablas (pNumFinal);	
		
		 cadena= tabla.generarTablaNumeros(pNumFinal);
		
		
	JOptionPane.showMessageDialog(null, cadena);

}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


