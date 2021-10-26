package Interfaz;
// Sebastian Aragon Mondol y Cesar Luis Sanchez
import javax.swing.JOptionPane;

import Mundo.Pelicula;

public class InterfazPelicula {

	public static void main(String[] args) {
		
		
		String pTitulo, pProtagonista, pGenero;
		int pDuracion;
		double pCostoProduccion;
		String pTresD = " ";
		boolean bolstatus;
		
		
		
		pTitulo = JOptionPane.showInputDialog(null, "Ingresar Nombre  Pelicula");
		pProtagonista = JOptionPane.showInputDialog(null, "Ingresar Nombre  Protagonista");
		pGenero = JOptionPane.showInputDialog(null, "Ingresar Genero");
		pDuracion = Integer.parseInt(JOptionPane.showInputDialog(null, "Duracion Pelicula"));
		pCostoProduccion=Double.parseDouble(JOptionPane.showInputDialog("Costo Produccion"));
		do {
			pTresD = JOptionPane.showInputDialog(null, " La pelicula es 3D S/N");
		  	
			 bolstatus =! ((pTresD.equalsIgnoreCase("S")) || (pTresD.equalsIgnoreCase("N")));
		  
		   	}while ( bolstatus);
		
		Pelicula pel = new Pelicula (pTitulo,pProtagonista,pGenero, pDuracion, pCostoProduccion, pTresD );
		
		JOptionPane.showMessageDialog(null, "Titulo: "+pel.getTitulo()+"\nProtagonista: "+pel.getProtagonista()+"\nGenero: "+pel.getGenero()+"\n Duracion: "+pel. getDuracion() 
		+ "\nCosto de Produccion: "+pel.getCostoProduccion()+"\nPelicula en 3D: "+pel.isTresD()+"\nCalculo del Impuesto"+ pel.calcularImpuesto()+"\n Impuesto Adiccional"+ pel.calcularAumentoCostoProd());
		
		
		  	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
