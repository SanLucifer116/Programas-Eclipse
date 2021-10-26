package Fabricas;

import Clases.Calamidad;
import Interfaces.Beca;
import Interfaces.BecadeUniversidad;
import javax.swing.JOptionPane;

// ESTA SE ENCAGRA DE IMPLEMENTAR A LA FACTORIA ABSTRACTA LLAMADA "BecadeUniversidad"
public class FabricadeCalamidades implements BecadeUniversidad{
    
     @Override
    public Beca crearBeca() {
    	//LO UNICO QUE HACE ES INSTANCIAR EL PRODUCTO CONCRETO QUE LE CORRESPONDE 
     	// DE ESTA MANERA LA FACTORYA  DE CALAMIDADES VA A DEVOLVER UNA BECA DE CALAMIDADES
        Calamidad  bCalamidad = new Calamidad();
        bCalamidad.setCodigo(bCalamidad.generarCodigo());
        JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Beca por Calamidad");
        return bCalamidad;
    }

}
