package Fabricas;

import Clases.MatriculadeHonor;
import Interfaces.Beca;
import Interfaces.BecadeUniversidad;
import javax.swing.JOptionPane;
//ESTA SE ENCAGRA DE IMPLEMENTAR A LA FACTORIA ABSTRACTA LLAMADA "BecadeUniversidad"
public class FabricaMatriculasdeH implements BecadeUniversidad{
    
    public Beca crearBeca() {
    	//LO UNICO QUE HACE ES INSTANCIAR EL PRODUCTO CONCRETO QUE LE CORRESPONDE 
    	// DE ESTA MANERALA FACTORYA MATRICULA DE HONOR VA A DEVOLVER UNA BECA DE HONOR
        MatriculadeHonor mHonor = new MatriculadeHonor();
        mHonor.setCodigo(mHonor.generarCodigo());
        JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Beca Matricula de Honor  ");
        return mHonor;
    }

}
