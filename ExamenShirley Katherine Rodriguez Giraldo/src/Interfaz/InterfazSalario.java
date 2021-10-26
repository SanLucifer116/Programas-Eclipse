package Interfaz;

import javax.swing.JOptionPane;
import Mundo.Mundo;

// Shirley Katherine Rodriguez Giraldo

public class InterfazSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seguir;
		int pEstado, pNumhijos, pAnti;
		double pSueldo, acsalario = 0 , salario;
		
		
		do {
		
			pEstado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Estado 1 = Casado / 2 = Soltero:" ));
			pNumhijos = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de Hijos"));
			pAnti = Integer.parseInt(JOptionPane.showInputDialog(null, "Años en la Empresa"));
			
			pSueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Sueldo"));
			
			
			Mundo obj = new Mundo(pEstado,pNumhijos,pAnti,pSueldo );
			salario = obj.bonificacion(pEstado, pNumhijos,pAnti,pSueldo);
			
			acsalario = acsalario+ salario;
			
			
			JOptionPane.showMessageDialog(null, "Sueldo A Pagar : " + salario );
			seguir = Integer.parseInt(JOptionPane.showInputDialog(null, " Inresar Otro Empleado 1 : Si / 2: No"));
			  	
			
		 
		 	
		}while( (seguir == 1));
			
		JOptionPane.showMessageDialog(null, "Nomina Total : " + acsalario);
	
	
	
	
	
	}


	
	

}
