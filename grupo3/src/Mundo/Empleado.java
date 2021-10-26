package Mundo;

public class Empleado {


	//Especificación de la Clase Empleado. Este módulo debe ser creado en el paquete "mundo"
	
	/*----------------------------
	Datos o Atributos
	------------------------------*/
	//Declare el atributo que modela la cédula del empleado
	
		//Especificación de la Clase Empleado. Este módulo debe ser creado en el paquete "mundo"
		
		/*----------------------------
		Datos o Atributos
		------------------------------*/
		//Declare el atributo que modela la cédula del empleado
		private String cedula;
		private String nombre;
		private double Salario;
		private String email;
		
		

		/*----------------------------
		Métodos u operaciones
		------------------------------*/
		// Método constructor
		public Empleado(String pCedula, String pNombre, double pSalario,  String pEmail)
		{
		cedula = pCedula;
		nombre= pNombre;
		Salario= pSalario;
		email=pEmail;
		}
		
		public String getCedula()
		{
		return cedula;
		}
		
		
		public String getNombre() {
			return nombre;
		}
	
		public double getSalario() {
			return Salario;
		}
		public  String getEmail() {
			return email;
		}
		
		public void setSalario( double pSalario )
		{
		
		Salario=pSalario;
		}
		
		public double duplicarSalario()
		{
		//Se escribe el cuerpo teniendo en cuenta la descripción del método
		return Salario * 2 ;
		}
		public double bonificacion()
		{
		//Se escribe el cuerpo teniendo en cuenta la descripción del método
		return Salario * 0.04 ;
		}
		public double aporte()
		{
		//Se escribe el cuerpo teniendo en cuenta la descripción del método
		return (Salario * 0.07) ;
		}
		public double salarioneto()
		{
		//Se escribe el cuerpo teniendo en cuenta la descripción del método
		return Salario= (Salario - (aporte() + bonificacion())) ;
		}
		
		
		
		
		
		
		
		
		
		}
	
