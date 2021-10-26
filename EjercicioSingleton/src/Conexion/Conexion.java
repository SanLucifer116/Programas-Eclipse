package Conexion;

public class Conexion {
	// SE DELCARA
	private static Conexion instancia;
	
	private Conexion() { //CLAVE PARA EVITAR INSTANCIAS ADICIOANLES 
		 
	 }
	//METODO PARA OBETENER LA INSTANCIA
	public static Conexion getInstancia() {
		
		
		if (instancia ==null) {
			
			instancia=new Conexion();
			 System.out.println("El objeto ha sido creado");
		}else {          
		System.out.println("Ya existe el objeto");
		}
		return instancia;
	
		
	}
	
	//METODO DE PRUEBA PARA PODER VER QUE SE ACCEDIO A LOS METODOS DEFINDIOS DE LA CLASE 
	public void Conectar() {
		
        System.out.println("Concetando con la Base de Datos");

		
	}
	//METODO DE PRUEBA PARA PODER VER QUE SE ACCEDIO A LOS METODOS DEFINDIOS DE LA CLASE 

	public void Desconectar() {
		
        System.out.println("Desconectando con la Base de Datos");

		
	}

}
