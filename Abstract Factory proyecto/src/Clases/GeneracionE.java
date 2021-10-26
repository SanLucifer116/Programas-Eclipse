package Clases;
import javax.swing.JOptionPane;

import Interfaces.Beca;
public class GeneracionE implements Beca {
	  
    private int codigo;
    
     public int generarCodigo() {
        int codigoCalamidad = (int) (Math.random() * 99);
        return codigoCalamidad;
    }
     
      public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void codigoDeBeca() {
        JOptionPane.showMessageDialog(null, "El Codigo que se genero para la beca fue : " + getCodigo()
       + "\n El estudiante tendra esta beca durante toda su carerra"
       + "\n El beneficio que obtuvo fue de ,  exoneracion de pago de matricula", "Beca Generación E",JOptionPane.INFORMATION_MESSAGE );
    }

}



