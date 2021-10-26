package Fabricas;
import AbstractFactory.ServicioVuelos;
import AbstractFactory.VueloFactoy;
public class FabricaVuelos {

	public static void crearFabricaDeVuelos(VueloFactoy factory) {
		
		ServicioVuelos objetoVuelo =  factory.crearVuelos();
		objetoVuelo.asignarVuelo();
	
	}
	
	
	
}
