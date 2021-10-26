package com.ecodeup.idao;
 

 
import com.ecodeup.model.Jugador;
 
public interface IJugadorDao {
	public List <Jugador>obtenerJugadores();
	public Jugador obtenerJugador(String pais);
	public void actualizarJugador(Jugador jugador);
	public void eliminarJugador(Jugador jugador);
}
