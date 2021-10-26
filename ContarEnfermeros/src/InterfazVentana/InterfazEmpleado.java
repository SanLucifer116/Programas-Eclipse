package InterfazVentana;

import Mundo.Empleado;
import javax.swing.*;
import Mundo.Empleado;

public class InterfazEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numempleados,pCargo=0, empleados = 0,  numenferemros = 0;
		
		numempleados = Integer.parseInt(JOptionPane.showInputDialog(null, " Cantidad de empleados"));
		
			
			Empleado emp = new Empleado (pCargo );	
			
			numenferemros = emp.contadorenfermero(numempleados );
			
			
		JOptionPane.showMessageDialog(null, " El numero de enfermeros es : " + numenferemros);
	
	}
		
	     
		
		
		
		
			
	}
	
	
	
	
	


