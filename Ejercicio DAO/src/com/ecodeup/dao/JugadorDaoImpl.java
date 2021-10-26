package com.ecodeup.dao;
 
import java.util.ArrayList;
import java.util.List;
 
import com.ecodeup.idao.*;
import com.ecodeup.model.Jugador;

public class JugadorDaoImpl implements IJugadorDao {

	List<Jugador> jugadores;
	public JugadorDaoImpl();{
		jugadores = new ArrayList<>();
		Jugador jugador1 = new Jugador("Colombia" , " Juan" , " Cuadrado" , 2);
		Jugador jugador2 = new Jugador("Argentina" , "Kun" , " Aguero" , 1);	
		Jugador jugador3 = new Jugador("Brasil" , " Neymar ", " Junior ", 3);
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
	}
	//obtener todos los jugadores
	public List <Jugador> obtenerJugadores(){
		return jugadores;
	}
	//obtener por pais
	
	public Jugador obtenerJugador(String pais) {
		return jugadores.get(pais);
	}
	//actualizar jugador
	public void actualizarJugador (Jugador jugador) {
		jugadores.get(jugador.getPais()).setPais(jugador.getPais());
		jugadores.get(jugador.getNombre()).setNombre(jugador.getNombre());
		jugadores.get(jugador.getApellido()).setApellido(jugador.getApellido());
		jugadores.get(jugador.getGoles()).setGoles(jugador.getGoles());
	System.out.println(Jugador con pais: " + jugador.getPais()+ "Eliminado satisfactoriamente");
	}

	@Override
	public void eliminarJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		
	}
}
