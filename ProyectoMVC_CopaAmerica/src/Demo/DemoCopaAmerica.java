package Demo;



import Controlador.JugadorController;
import Modelo.Jugador;
import Vista.JugadorView;

public class DemoCopaAmerica {

	public static void main (String [] args){ 
   
	Jugador modelo= llenarJugador();
    JugadorView vista= new  JugadorView();
    
    JugadorController controlador= new  JugadorController(modelo, vista);
    
    //METODOS QUE ACTUALIZARA Y SALDRA 2DO EN PANTALLA 
	    controlador.actualizarVista();
	    controlador.setPais("Colombia");
	    controlador.setNombreJug("James Rodriguez");
	    controlador.setGoles(6);
	    controlador.actualizarVista();
	}
	
	//DATOS QUE SE MOSTRARAN EN PANTALLA PRIMERO 
	private static Jugador llenarJugador() {
	     
		Jugador jugador = new Jugador();
	    jugador.setPais(" España ");
	    jugador.setNombreJug(" James Benedeti");
	    jugador.setGoles(4);
	 
	    return jugador;       
	    
	    }  
	
	
	
	

}


