
import Modelo.Jugador;

import Idao.IJugadorDao;

import DAO.JugadorDaolmpI;
import DAO.JugadorDaolmpI;




	public class Demo {
		
		
		public static void main(String[] args) {
		
			IJugadorDao JugadorDao = new JugadorDaolmpI();
		

			// imprimir los clientes
			JugadorDao.obtenerJugadores().forEach(System.out::println);
			 
			// obtner un cliente
			Jugador jugador = JugadorDao.obtenerJugadores(0);
			jugador.setPais(" Colombia");
			//actualizar cliente
			JugadorDao.actualizarJugador(jugador);
			
			// imprimir los clientes
			System.out.println("*****");
			JugadorDao.obtenerJugadores().forEach(System.out::println);
			
			System.out.println("*****");

			//Eliminar un cliente 
			jugador =JugadorDao.obtenerJugadores(0);
			JugadorDao.eliminarJugador(jugador);
			
			 System.out.println("*****");
			 System.out.println("Usuarios Actuales");
			 JugadorDao.obtenerJugadores().forEach(System.out::println);
			
		
			
		}
		
		
		
		
		
		

	}
