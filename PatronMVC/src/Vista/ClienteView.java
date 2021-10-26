package Vista;

import javax.swing.JOptionPane;

public class ClienteView {
public void imprimirDatosCliente(int id,String nombre, String apellido) {
JOptionPane.showMessageDialog(null,"**** DATOS CLIENTE ****"+
        "\n Id: "+id+"\nNombre: "+nombre+"\nApellido: "+apellido );


}
}