package Principal;

import Fabricas.FabricaVuelodeNegocios;
import Fabricas.FabricaVuelos;
import javax.swing.JOptionPane;
import AbstractFactory.ServicioVuelos;
import AbstractFactory.VueloFactoy;
import Fabricas.FabricaVueloPrimeraClase;
import Fabricas.FabricaVuelosEconomicos;
import Clases.VueloEconomico;

public class Main {
	private static int cont = 0;
	public static void main(String[] args) 
	{
		
		FabricaVuelodeNegocios Ne =new FabricaVuelodeNegocios();
		FabricaVueloPrimeraClase Pr =new FabricaVueloPrimeraClase();
		FabricaVuelosEconomicos Eco =new FabricaVuelosEconomicos();
		String salida;
		 
		 try {
			 do {
			  try 
		     {
			  int opcion=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese Vuelo a Comprar \n" + 
					  "\n************************\n" + "1. Vuelo Economico\n" + "2. Vuelo de Negocios\n" +
					  "3. Vuelo de Primera Clase\n\n" ));
			  switch (opcion)
				  {
			  		
				   case 1:
					   FabricaVuelos.crearFabricaDeVuelos(Eco);
					   break;
				   case 2:
					   FabricaVuelos.crearFabricaDeVuelos(Ne);
					   break;
				   case 3:
					   FabricaVuelos.crearFabricaDeVuelos(Pr);
					   break;
				   default:
					   	JOptionPane.showMessageDialog(null,"⚠   Error ⚠  ↓↓↓ " + 
					   	"\n¡Por Favor Ingrese un Numero del Menu!");
				  		break;
				   }
			  } catch (Exception e) {
			 JOptionPane.showMessageDialog(null,"No es un parametro de consulta valido");
			  }
			  salida=JOptionPane.showInputDialog("Desea Comprar otro vuelo? S/N");

			 } while (salida.toUpperCase().equals("S"));
		 
			     } catch (Exception e) {
			    JOptionPane.showMessageDialog(null,"Bye!!!");
			  // 	JOptionPane.showMessageDialog(null,"Cantidad de Vuelos Comprados: " + cont++ );

			     }

		 
	}
	
	
}