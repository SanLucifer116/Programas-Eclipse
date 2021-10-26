package Principal;
import Conexion.Conexion;
public class Main {

	public static void main(String[] args) {
		for(int num=0; num<5; num++)
        {
		System.out.println("Usuario: "+ (num+1));
		
		//INSTANCIACION POR CONSTRUCTOR PROHIBIDO POR SER PRIVATE
		//Conexion c = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.Conectar();
		c.Desconectar();
		
		 System.out.println("============================");
		//Conexion c1 = new Conexion();
		//c1.Conectar();
	    //c1.Desconectar();
        }
	}

}
