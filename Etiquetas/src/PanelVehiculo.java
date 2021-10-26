
import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
/**
*
* @author Viejo Gus
*/
class PanelVehiculo extends JPanel{
private JTextField txtMarca;
private JTextField txtLinea;
private JTextField txtModelo;
private JTextField txtValor;
private JLabel labMarca;
private JLabel labLinea;
private JLabel labModelo;
private JLabel labValor;

public PanelVehiculo(){
	
setLayout(new GridLayout(5,2));
setPreferredSize(new Dimension(0,130));
TitledBorder border = BorderFactory.createTitledBorder( "Datos del Vehiculo");
border.setTitleColor(Color.BLUE);
setBorder(border);

labMarca = new JLabel( "Marca ");
labLinea = new JLabel( "Linea ");
labModelo = new JLabel( "Modelo ");
labValor = new JLabel( "Valor ");
txtLinea = new JTextField();
txtModelo = new JTextField();
txtValor = new JTextField();
txtValor = new JTextField( "$ 0");

txtMarca = new JTextField();
txtValor.setForeground(Color.BLUE);
txtValor.setBackground(Color.WHITE);
add( labMarca );
add( txtMarca );
add( labLinea );
add( txtLinea );
add( labModelo );
add( txtModelo );
add( labValor );
add( txtValor );
txtValor.setEditable(true);
}
}
class PanelDescuentos extends JPanel{
public PanelDescuentos(){
setLayout(new GridLayout(2,2));
TitledBorder border = BorderFactory.createTitledBorder( "Descuentos");
border.setTitleColor(Color.BLUE);
setBorder(border);
}
}
class PanelResultados extends JPanel{
public PanelResultados(){
setLayout(new GridLayout(2,3));
setPreferredSize(new Dimension(0,65));
TitledBorder border = BorderFactory.createTitledBorder( "Resultados");
border.setTitleColor(Color.BLUE);
setBorder(border);
}
}

public class InterfazVehiculos extends JFrame {
private PanelVehiculo panelVehiculo;
private PanelDescuentos panelDescuentos;
private PanelResultados panelResultados;
public InterfazVehiculos(){
setTitle("PenguinCar");
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(new BorderLayout());
panelVehiculo = new PanelVehiculo();
add(panelVehiculo, BorderLayout.NORTH);
panelDescuentos = new PanelDescuentos();
add(panelDescuentos, BorderLayout.CENTER);
panelResultados = new PanelResultados();
add(panelResultados, BorderLayout.SOUTH);
setSize(490,500);
setResizable(false);
setVisible(true);
pack();
}
public static void main(String[] args){
new InterfazVehiculos();
}
}