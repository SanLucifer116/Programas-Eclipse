package Fabricas;

import Clases.MeritoDeportivo;
import Interfaces.Beca;
import Interfaces.BecadeUniversidad;
import javax.swing.JOptionPane;
//ESTA SE ENCAGRA DE IMPLEMENTAR A LA FACTORIA ABSTRACTA LLAMADA "BecadeUniversidad"
public class FabricadeMDeportivos implements BecadeUniversidad{
    
       @Override
    public Beca crearBeca() {
    	//LO UNICO QUE HACE ES INSTANCIAR EL PRODUCTO CONCRETO QUE LE CORRESPONDE 
       	// DE ESTA MANERA  LA FACTORYA MATRICULA DEPORTIVA VA A DEVOLVER UNA BECA DEPORTIVA
           MeritoDeportivo  mDeportivo = new MeritoDeportivo();
        mDeportivo.setCodigo(mDeportivo.generarCodigo());
        JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Beca por Merito Deportivo  ");
        return mDeportivo;
    }

}
