
package adasdad;

//Este programa permite definir la configuraci�n b�sica de una ventana
import java.awt.*;
import javax.swing.*;

/**
*
* @author Viejo Gus
*/
public class adasdad extends JFrame{
public adasdad(){
setTitle("Peng�inSoft");
setSize(290,300);
Color c=Color.YELLOW;
getContentPane().setBackground(c);
setVisible(true);
setResizable(false);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String[] args){
new adasdad();
}
}