package poo_java;



import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

class PanelVehiculo extends JPanel {
	
	public PanelVehiculo(){
		setLayout(new GridLayout(5,2));
		setPreferredSize(new Dimension(0,130));
		TitledBorder border = BorderFactory.createTitledBorder( "Datos del Vehiculo" );
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		}
		}
		class PanelDescuentos extends JPanel{
		public PanelDescuentos(){
		setLayout(new GridLayout(2,2));
		TitledBorder border = BorderFactory.createTitledBorder( "Descuentos" );
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

		public class  InterfazPanel extends JFrame {
		private PanelVehiculo panelVehiculo;
		private PanelDescuentos panelDescuentos;
		private PanelResultados panelResultados;
		public InterfazPanel(){
		setTitle("Venta de vehiculos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		panelVehiculo = new PanelVehiculo();
		add(panelVehiculo, BorderLayout.NORTH);
		panelDescuentos = new PanelDescuentos();
		add(panelDescuentos, BorderLayout.CENTER);
		panelResultados = new PanelResultados();
		add(panelResultados, BorderLayout.SOUTH);
		setSize(290,300);
		setResizable(false);
		setVisible(true);
		pack();
		}
		public static void main(String[] args){
		new InterfazPanel();
		}
		}

	


