package Pba;
import javax.swing.JOptionPane;
import Pba.Ingreso_Empleados;

public class Interfaz {
	public static void main (String [] args) {
		String P_Cedula,P_Nombre;
		int P_Tipo_Cargo, control_Ingreso=1;
		int P_cantidad_Funcionarios;
		boolean control = false;
		int contador = 0;
		
		P_cantidad_Funcionarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Cantidad Funcionarios"));
		
		for (int i= 0; i < P_cantidad_Funcionarios; i++) {
			P_Cedula =JOptionPane.showInputDialog("Cedula del empleado? " + (i + 1));
			P_Nombre =JOptionPane.showInputDialog("Nombre del empleado? " + (i + 1));
			P_Tipo_Cargo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Tipo Cargo: \n 1 Enfermero \n 2 Medico"));
			
			Ingreso_Empleados Obj_Empleados = new Ingreso_Empleados(P_Cedula,P_Nombre,P_Tipo_Cargo, P_cantidad_Funcionarios);
			control = Obj_Empleados.Contar_Enfermeros_Hospital();
			
			if (control) {
				contador++;
			}
		}
		JOptionPane.showMessageDialog(null, "La cantidad de enfermeros que reistro es: " + contador + " gracias por utilizar este servicio.");
				

	}

}