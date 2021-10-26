package Fabricas;
//FABRICA CONCRETA

import javax.swing.JOptionPane;

import AbstractFactory.ServicioVuelos;
import AbstractFactory.VueloFactoy;
import Clases.VueloPrimeraClase;

public class FabricaVueloPrimeraClase implements VueloFactoy {
		public ServicioVuelos crearVuelos() {
		VueloPrimeraClase Pr = new VueloPrimeraClase();
		JOptionPane.showMessageDialog(null, "Se ha Generado Codigo para Vuelo PRIMERA CLASE ");
		Pr.setCodigo(Pr.generarCodigo());
		
		return Pr;
	}

	


}
