package Clases;
//CLASE DIRECTOR, SE ENCARGA DE GESTIONAR  LA PRODUCCION DEL PRODUCTO 
public class Director {
 

	public Director() {
		
		
	}
	
	public void construir(PizzaBuilder build) {
		//SE OBLIGA A QUE ESTOS METODOS SEAN IMPLEMENTADOS
		build.crearPizza();
		build.buildMasa();
		build.buildSalsa();
		build.buildRelleno();
	}

}
