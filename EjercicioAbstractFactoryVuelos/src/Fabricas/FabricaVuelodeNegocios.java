package Fabricas;
//FABRICA CONCRETA
import javax.swing.JOptionPane;

import AbstractFactory.ServicioVuelos;
import AbstractFactory.VueloFactoy;
import Clases.VuelodeNegocios;

public class FabricaVuelodeNegocios implements VueloFactoy {

	public ServicioVuelos crearVuelos() {
		
		VuelodeNegocios Ne = new VuelodeNegocios();
		Ne.setCodigo(Ne.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha Generado Codigo para Vuelo de NEGOCIOS Nacional");
		return Ne;
		
	}



}
