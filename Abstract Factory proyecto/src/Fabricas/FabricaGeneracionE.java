package Fabricas;

import javax.swing.JOptionPane;
import Clases.GeneracionE;
import Interfaces.Beca;
import Interfaces.BecadeUniversidad;

public class FabricaGeneracionE implements BecadeUniversidad {

	@Override
	public Beca crearBeca() {
		//LO UNICO QUE HACE ES INSTANCIAR EL PRODUCTO CONCRETO QUE LE CORRESPONDE 
    	// DE ESTA MANERALA FACTORYA MATRICULA DE HONOR VA A DEVOLVER UNA BECA DE HONOR
		GeneracionE gE = new GeneracionE();
        gE.setCodigo(gE.generarCodigo());
        JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Beca Generacion E ");
        return gE;
	}

}
