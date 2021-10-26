package Fabricas;

import Interfaces.Beca;
import Interfaces.BecadeUniversidad;

/*Esta clase sera la Fabrica Principal cuenta con un método estático que permitirá la creación
        de los diferentes tipos de Becas, aplicamos el concepto de polimorfismo para ejecutar el 
                llamado a la Fabrica correspondiente y crear el objeto concreto solicitado  por el cliente.*/

public class FabricadeBecas {
    
    // El metodo crearFabricaDeBecas recibe una  fabrica abstracta 
    
    // Factory es una referencia, de que puede recibir objetos de cualquiera de las fabricas concretas que implementan la fabrica abstracta
    
    /*  Como esas fabricas implementan la interfaz BecaDeUniversidad se tiene la certeza de que van a implementar 
        su metodo correspondiente que en este caso seria el metodo  crearBeca.
    */
    
  public static void crearFabricaDeBecas(BecadeUniversidad factory) {
        // En esta parte Aplicamos Polimorfismo, ya que como factory recibe obejtos
	    //de cualquiera de las fabricas concretas que implementan la fabrica abstracta
        /* Se crea una beca, esta es la interfaz del producto abstracto, por lo tanto puede contener objetos
            de cualquiera de los productos concretos que en este caso serian las diferentes becas 
        */
        Beca objetoBeca = factory.crearBeca();
        objetoBeca.codigoDeBeca();
    }
}
