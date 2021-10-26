package Clases;

import Interfaces.Beca;
import javax.swing.JOptionPane;
//SE IMPLEMENTA EL PRODUCRO ABSTRACTO "BECAS" VOLVIENDO CONCRETA A LA CLASE 
// PRODUCTO CONCRETO 1 O SERVICIO 1
public class Calamidad implements Beca{
    
    private int codigo;
    
     public int generarCodigo() {
    	 return  (int) (Math.random() * 99);
        
    }
     
      public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public void codigoDeBeca() {
        JOptionPane.showMessageDialog(null, "El Codigo que se genero para la beca fue : " + getCodigo()
       + "\n El estudiante presento el caso por el cual no puede costear la matricula "
       + "\n El beneficio que obtuvo fue de ,  exoneracion de pago de matricula", "Beca Calamidad",JOptionPane.INFORMATION_MESSAGE );
    }

}
