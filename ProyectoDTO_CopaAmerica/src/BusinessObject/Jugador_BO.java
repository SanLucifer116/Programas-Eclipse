package BusinessObject;

import java.util.ArrayList;
import java.util.List;
import ValueObject.Jugador_VO;


public class Jugador_BO {
	
	List<Jugador_VO> jugadores;
	
	public Jugador_BO() {
	
		
		jugadores= new ArrayList<>();
		Jugador_VO jugador1 = new Jugador_VO(0," Italia ", " Radamel Falcao");
		Jugador_VO jugador2 = new Jugador_VO(9," Brasil ", " Luiz Diaz");
       	jugadores.add(jugador1);
		jugadores.add(jugador2);
       
     
    }
						
		//elimina el cliente que se le pasa como paraámetro
    	public void eliminarUsuario(Jugador_VO jugador) {
    	jugadores.remove(jugador.getGoles());
        System.out.println("Usuario con goles " + jugador.getGoles() + " eliminado satisfactoriamente");
        }
    
    

    	public List<Jugador_VO> obtenerUsuario() {
    		return jugadores;
        }


    	public Jugador_VO ObtenerUsuario(int Goles) {
           return jugadores.get(Goles);
        }
     		
    	public void actualizarCliente(Jugador_VO cliente) {
    	jugadores.get(cliente.getGoles()).setPais(cliente.getPais());
        jugadores.get(cliente.getGoles()).setNombreJug(cliente.getNombreJug());
    	System.out.println("Jugador con Goles :"+ cliente.getGoles()+" actualizado satisfactoriamente");
    	}




		
		
		
		
		
		
		
		
		
		
		
		
		
	}


