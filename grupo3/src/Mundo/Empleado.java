package Mundo;

public class Empleado {


	//Especificaci�n de la Clase Empleado. Este m�dulo debe ser creado en el paquete "mundo"
	
	/*----------------------------
	Datos o Atributos
	------------------------------*/
	//Declare el atributo que modela la c�dula del empleado
	
		//Especificaci�n de la Clase Empleado. Este m�dulo debe ser creado en el paquete "mundo"
		
		/*----------------------------
		Datos o Atributos
		------------------------------*/
		//Declare el atributo que modela la c�dula del empleado
		private String cedula;
		private String nombre;
		private double Salario;
		private String email;
		
		

		/*----------------------------
		M�todos u operaciones
		------------------------------*/
		// M�todo constructor
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
		//Se escribe el cuerpo teniendo en cuenta la descripci�n del m�todo
		return Salario * 2 ;
		}
		public double bonificacion()
		{
		//Se escribe el cuerpo teniendo en cuenta la descripci�n del m�todo
		return Salario * 0.04 ;
		}
		public double aporte()
		{
		//Se escribe el cuerpo teniendo en cuenta la descripci�n del m�todo
		return (Salario * 0.07) ;
		}
		public double salarioneto()
		{
		//Se escribe el cuerpo teniendo en cuenta la descripci�n del m�todo
		return Salario= (Salario - (aporte() + bonificacion())) ;
		}
		
		
		
		
		
		
		
		
		
		}
	
