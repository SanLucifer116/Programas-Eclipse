package Clases;

import Interfaces.Beca;
import javax.swing.JOptionPane;

// PRODUCTO CONCRETO 3 O SERVICIO 3
public class MeritoDeportivo implements Beca{
    
       private int codigo;
    
     public int generarCodigo() {
        int codigoMDeportivo = (int) (Math.random() * 999999999);
        return codigoMDeportivo;
    }
     
      public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void codigoDeBeca() {
        JOptionPane.showMessageDialog(null, "El Codigo de la beca que obtuvo por merito deportivo es : " + getCodigo()
        + "\n El estudiante gano medalla en juegos nacionales o departamentales"
                + " \n El beneficio que obtuvo el estudiante fue  de un salario minimo vigente ", "Beca Deportiva",JOptionPane.INFORMATION_MESSAGE);
    }

}




