package DAO;

import java.util.ArrayList;
import java.util.List;


import Modelo.Jugador;
import Idao.IJugadorDao;

//public class ClienteDaoImpl implements IClienteDao {


public class JugadorDaolmpI  implements  IJugadorDao {


	//lista de tipo cliente
	List<Jugador> jugadores;
	
	public  JugadorDaolmpI() {
	jugadores = new ArrayList<>();
	Jugador cliente1 = new Jugador(0,"Brasil", "James Rodriguez");
	Jugador cliente2 = new Jugador(1,"Brasil","Neymar Jn");
	jugadores.add(cliente1);
	jugadores.add(cliente2);
	}
	//obtener todos los clientes
	
	public List<Jugador> obtenerJugadores() {
	return jugadores;
	}
	
	
	//actualizar un cliente
	
	public void actualizarJugador(Jugador jugador) {
	jugadores.get(jugador.getGoles()).setPais(jugador.getPais());

	System.out.println("Jugador con Goles: "+jugador.getGoles()+" actualizado satisfactoriamente");
	}
	//eliminar un cliente por el id
	
	public void eliminarJugador(Jugador jugador) {
	jugadores.remove(jugador.getGoles());
	System.out.println("Cliente con id: "+jugador.getGoles()+" elimnado satisfactoriamente");
	}
	//obtener un cliente por el id
	@Override
	public Jugador obtenerJugadores(int Goles) {
		// TODO Auto-generated method stub
		return jugadores.get(Goles);
	}

	
	
	}

























