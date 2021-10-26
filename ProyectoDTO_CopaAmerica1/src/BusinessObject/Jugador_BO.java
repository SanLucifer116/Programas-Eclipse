package BusinessObject;
import ValueObject.Jugador_VO;
import java.util.ArrayList;
import java.util.List;

public class Jugador_BO {

// PREGUNTAR A MAMA SI ESTO ES UNA LISTA, ANTES DE MOSTRAR AL PROFESOR OCULTAR ESTO 
	List<Jugador_VO> jugadores;
    
    public Jugador_BO(){
    
    	jugadores= new ArrayList<>();
    	Jugador_VO jugador1 = new Jugador_VO(4, "Brasil" , " Neymar Jn");
    	Jugador_VO jugador2 = new Jugador_VO(3, " Brasil", " Lionel Messi");
        jugadores.add(jugador1);
        jugadores.add(jugador2);



    }
  
         
    
    public void EliminarJugador(Jugador_VO jugador ) {	
    	jugadores.remove(jugador.getGoles());
        System.out.println("Juagdor " + jugador.getGoles() + " eliminado satisfactoriamente");

    	
    	}
	
    public List<Jugador_VO> obtenerUsuario() {
    	return jugadores;
   	      	
    	}

     public Jugador_VO ObtenerUsuario(int Goles) {
       return jugadores.get(Goles);
         }
    
     public void ActualizarUsuario(Jugador_VO jugador) {
         jugadores.get(jugador.getGoles()).setPais(jugador.getPais());
         //enfermos.get(enfermo.getId()).setEdad(enfermo.getEdad());
         


         System.out.println("Usuario con id: " + jugador.getGoles() + " actualizado satisfactoriamente");
     }
    
    
    
    
    
    
}
