package IntEmpleados;

import Metodos.Metodos;
import javax.swing.JOptionPane;


public class IntEmpleados {
	
			public static void main(String[] args) {
			
			
int continuar,pEcivil, pAntiguo, pCanthijos;
double   salario,pSueldobase, bonificacion, todnomina=0;
	
	do {
		
pEcivil = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Estado Civil 1 --> Casado / 2--> Soltero:" ));
pCanthijos = Integer.parseInt(JOptionPane.showInputDialog(null, "Tiempo en la Compañia"));
pAntiguo = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de Hijos"));
pSueldobase = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Salario Base"));


Metodos obj = new Metodos(pEcivil, pAntiguo,  pCanthijos,  pSueldobase);
bonificacion= obj.bonisalario( pEcivil, pAntiguo, pCanthijos);
salario = pSueldobase + bonificacion;
todnomina = todnomina+ salario;

		JOptionPane.showMessageDialog(null, "Sueldo a Pagar : " + salario );
		continuar = Integer.parseInt(JOptionPane.showInputDialog(null, " Desea Continuar? 1 : Si / 2: No"));
	 	
		 
			 	
			}while( (continuar == 1));
				
			JOptionPane.showMessageDialog(null, "Total Pagado en Nomina: " + todnomina);
	
	
	
	
	}

}
