package com.ecodeup.daodemo;
 
import com.ecodeup.dao.JugadorDaoImpl;
import com.ecodeup.idao.IJugadorDao;
import com.ecodeup.model.Jugador;
 
public class DaoDemo {

	public static void main (String[]args) {
		//para manipular el ejercicio
		IJugadorDao jugadorDao = new JugadorDaolmpl();
		//imprimir los jugadores
		jugadorDao.obtenerJugadores().forEach(System.out::println);
	//obtener jugador
		Jugador jugador = jugadorDao.obtenerJugador(0);
		jugador.setApellido("Torres");
		//actualizar jugador
		jugadorDao.actualizarJugador(jugador);
		//mostrar jugadores
		System.out.println("****");
		jugadorDao.obtenerJugadores().forEach(System.out::println);
	}
}
