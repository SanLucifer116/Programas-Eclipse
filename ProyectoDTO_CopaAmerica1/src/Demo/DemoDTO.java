package Demo;
import BusinessObject.Jugador_BO;
import ValueObject.Jugador_VO;



	public class DemoDTO {

        public static void main(String[] args) {
        	
        	
        	Jugador_BO jug= new Jugador_BO();
        	jug.obtenerUsuario().forEach(System.out::println);
        	
        	
        	
            System.out.println("**");
        	Jugador_VO jug2 = jug.ObtenerUsuario(0);
        	jug2.setPais("Argentina");
        	jug.ActualizarUsuario(jug2);
        
        	
        	
        	 System.out.println("**");
             jug2= jug.ObtenerUsuario(0);
             System.out.println(jug2);
        	
        	
             System.out.println("*******");
             jug2 = jug.ObtenerUsuario(0);
             jug.EliminarJugador(jug2);
        	
        	
        	
        	
        }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
