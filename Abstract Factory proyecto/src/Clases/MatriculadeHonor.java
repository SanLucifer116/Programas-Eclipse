package Clases;

import Interfaces.Beca;
import javax.swing.JOptionPane;

// PRODUCTO CONCRETO 2 O SERVICIO 2
public class MatriculadeHonor implements Beca{
    
       private int codigo;
    
     public int generarCodigo() {
        int codigoMHonor = (int) (Math.random() * 999999999);
        return codigoMHonor;
    }
     
      public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void codigoDeBeca() {
        JOptionPane.showMessageDialog(null, "El Codigo de la beca que obtuvo por matricula de honor es : " + getCodigo()
         + "\n El estudiante obtuvo un promedio suoperior a 4,8 "
         + "\n El beneficio que obtuvo fue de ,  exoneracion de pago de matricula", "Beca Honor",JOptionPane.INFORMATION_MESSAGE);
    }


}
