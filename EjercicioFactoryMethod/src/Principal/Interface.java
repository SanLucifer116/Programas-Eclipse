package Principal;

import Pizza.CreadorAbstracto;
import Pizza.Fabrica;
import Pizza.Pizza;

public class Interface {

	public static void main(String[] args) {
		
		
		 CreadorAbstracto creator = new Fabrica();
		 Pizza ppi�a = creator.crear(Fabrica.PIZZACONPI�A);
		 ppi�a.preparar();
		 ppi�a.cocinar();
	     System.out.println("========================");

		 Pizza ppicante = creator.crear(Fabrica.PIZZAPICANTE);
		 ppicante.preparar();
		 ppicante.cocinar();
	     System.out.println("========================");

		 Pizza pranchera = creator.crear(Fabrica.PIZZARANCHERA);
		 pranchera.cocinar(); // ASI COMO ESTEN ORDENAOS, ASI SE IMPRIMIRA 
		 pranchera.preparar();
		

		
		
		
		
		
	}

}
