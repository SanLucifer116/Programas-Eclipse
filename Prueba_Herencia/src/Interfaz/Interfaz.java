package Interfaz;
import javax.swing.*;
import mundo.Empleado;
import mundo.Medico;

public class Interfaz {
	public static void main (String [] args) {
		String P_Cedula, P_Nombre, P_Ciudad, P_Especialidad, p_Hospital;
		double P_Salario,P_Aumento_Especialidad=2;
		
		P_Cedula=JOptionPane.showInputDialog("Cedula del empleado?");
		P_Nombre=JOptionPane.showInputDialog("Nombre del empleado?");
		P_Ciudad=JOptionPane.showInputDialog("Ciudad del empleado?");
		P_Salario=Double.parseDouble(JOptionPane.showInputDialog("Salario del empleado?"));
		P_Especialidad=JOptionPane.showInputDialog("Especialidad del empleado?");
		p_Hospital=JOptionPane.showInputDialog("Hospital del empleado?");
		
		Medico Obj_Herencia = new Medico (P_Cedula, P_Nombre, P_Ciudad, P_Salario, P_Especialidad, p_Hospital, P_Aumento_Especialidad);
		
		
		JOptionPane.showMessageDialog(null, "Nombre: " + Obj_Herencia.getCedula() +"\n Nombre: "+ Obj_Herencia.getNombre() + "\nHospital: "+ Obj_Herencia.getHospital());
	}

}
