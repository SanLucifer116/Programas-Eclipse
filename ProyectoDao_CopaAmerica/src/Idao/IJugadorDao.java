package Idao;


import java.util.List;


import Modelo.Jugador;


	public interface  IJugadorDao {
		//declaración de métodos para acceder a la base de datos
		public List<Jugador> obtenerJugadores();
		public Jugador obtenerJugadores(int Goles);
		public void actualizarJugador(Jugador jugador);
		public void eliminarJugador(Jugador Jugador);
		}
		





