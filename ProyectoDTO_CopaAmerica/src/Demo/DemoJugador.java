package Demo;


import  BusinessObject.Jugador_BO;

import ValueObject.Jugador_VO;

public class DemoJugador {

	 public static void main(String[] args) {
		 
		 
		System.out.println("USUARIOS EN EL SISTEMA");
		Jugador_BO jugadoresBO = new Jugador_BO();
     	jugadoresBO.obtenerUsuario().forEach(System.out::println);
    
     	
     	Jugador_VO jugador = jugadoresBO.ObtenerUsuario(0);
	
      	
     	//ACTUALIZAR  //segundo acutaliza 
     	jugador=jugadoresBO.ObtenerUsuario(0);
     	jugador.setPais("Colombia");
    	jugadoresBO.actualizarCliente(jugador);
     	
     	
    	//OBTENER       //primero obtiene 
    	System.out.println("_________________");
     	System.out.println(" Obtenemos Jugador");
     	
     	jugador=jugadoresBO.ObtenerUsuario(0);
     	System.out.println(jugador);
     	
     	
     	
     	     	    	
     	
     	//ELIMINAR // tercero elimina
    	System.out.println("______________________");
     	System.out.println("Eliminamos jugador");
     	jugador=jugadoresBO.ObtenerUsuario(0);
     	jugadoresBO.eliminarUsuario(jugador);

		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
}


