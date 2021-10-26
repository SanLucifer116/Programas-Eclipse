package Fabricas;
//FABRICA CONCRETA

import javax.swing.JOptionPane;

import AbstractFactory.ServicioVuelos;
import AbstractFactory.VueloFactoy;
import Clases.VueloEconomico;

public class FabricaVuelosEconomicos implements VueloFactoy {
	public ServicioVuelos crearVuelos() {
		VueloEconomico Eco = new  VueloEconomico();
		Eco.setCodigo(Eco.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha Generado Codigo para Vuelo ECONOMICO ");
		return Eco;
	}

	
}
