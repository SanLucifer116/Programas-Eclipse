package Interfaz;


		// TODO Auto-generated method stub
		// Implementaci�n (InterfazEmpleado). Este m�dulo debe ser creado en el paquete "interfaz"
		import Mundo.Empleado; // importa una clase del paquete mundo
		import javax.swing.JOptionPane; // importa una clase del paquete javax.swing
		// Clase principal
		public class InterfazEmpleado
		{
		public static void main(String[] args) // Inicio del programa
		{
		String pCedula, pNombre, pEmail;
		double pSalario;
		// Entrada y conversi�n de datos
		pCedula=JOptionPane.showInputDialog("Cedula del empleado?");
		pNombre=JOptionPane.showInputDialog("Nombre?");
		pSalario=Double.parseDouble(JOptionPane.showInputDialog("Salario?"));
		pEmail=(JOptionPane.showInputDialog("Email?"));
		// Creaci�n de un Objeto o una Instancia de la Clase y paso de mensaje con par�metros al m�todo constructor
		Empleado emp = new Empleado(pCedula, pNombre, pSalario,pEmail);
		// Salida de datos
		JOptionPane.showMessageDialog(null, "Cedula: "+emp.getCedula()+"\nNombre: "+emp.getNombre()+"\nSalario: "+emp.getSalario()+"\nEmail: $"+emp.getEmail()+ "\nBonificacion: " + emp.bonificacion() + "\nAporte a la EPS: "+ emp.aporte()+"\nSalario Neto: " + emp.salarioneto());
		
		}
		} // Fin del programa

	


