package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
public class Pelicula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaPelicula2 ventana= new VentanaPelicula2();
	}

}

class VentanaPelicula2 extends JFrame implements ActionListener{
	
	private JTextField txtNombrepeli;
	private JLabel labNombrepeli;
	private JTextField txtProtagonista;
	private JLabel labProtagonista;

	private JTextField txtGenero;
	private JLabel labGenero;

	private JTextField txtDuracion;
	private JLabel labDuracion;

	private JTextField txtResultado;
	private JLabel labResultado;

	private JTextField txtCostoprduccion;
	private JLabel labCostoproduccion;

	private JTextField txtimpuesto;
	private JLabel labimpuesto;

	private JButton btnSeguir = new JButton("Seguir");
	private JButton btnCancelar = new JButton("Cancelar");

	private int duracion;
	private double costoproduccion;
	private String nombrePelicula;
	private double impuesto;
	private double total;
	
	public VentanaPelicula2() { // METODO TOOLKIT

		Toolkit mipantalla = Toolkit.getDefaultToolkit(); // GUARDA LA RESULUCION DE LA PANTALLA

		Dimension tamañoPantalla = mipantalla.getScreenSize(); // GUARDA EL TAMAÑO DE LA PANTALLA

		int alturaPantalla = tamañoPantalla.height; // SE CREA UNA VARIABLE PARA LA ALTURA DE LA VENTANA

		int anchoPantalla = tamañoPantalla.width;// SE CREA UNA VARIABLE PARA EL ANCHO DE LA VENTANA

		setSize(anchoPantalla / 2, alturaPantalla / 2); // TAMAÑO DE LA VENTANA

		setLocation(anchoPantalla / 4, alturaPantalla / 4); // LOCALIZACION DE LA VENTANA

		setTitle("Ventana de Julian Eduardo Guarnizo Parra "); // TITULO DE LA VENTANA

		Image miIcono = mipantalla.getImage("src/Iconos/iconoaprobado.png"); // ICONO DE LA VENTANA

		setIconImage(miIcono); // AGREGAR EL ICONO

		setDefaultCloseOperation(EXIT_ON_CLOSE); // SE ESTIPULA PARA QUE CUANDO SE LE DE A LA X SE CIERRE EL PROGRAMA

		armarpanel();
		//add(panel1, BorderLayout.CENTER);
		
		armarpanel2();

		setVisible(true); // METODO PARA ASIGNAR QUE LA VENTANA SEA VISIBLE

		setResizable(false); // METODO PARA ASIGNAR SI LA VENTANA SE PUEDE REDIMENCIONAR
	}

	private void armarpanel() {
		
		JPanel panel = new JPanel(); // METODO ARMAR PANEL
		
		
		panel.setLayout(new GridLayout(7, 4));
		panel.setPreferredSize(new Dimension(400, 140));
		TitledBorder border = BorderFactory.createTitledBorder("Datos de la pelicula");
		border.setTitleColor(Color.BLUE);
		panel.setBorder(border);

		panel.add(labNombrepeli = new JLabel(" Nombre de la pelicula "));
		panel.add(txtNombrepeli = new JTextField());

		panel.add(labProtagonista = new JLabel(" Protagonista de la pelicula "));
		panel.add(txtProtagonista = new JTextField());

		panel.add(labGenero = new JLabel(" Genero de la pelicula "));
		panel.add(txtGenero = new JTextField());

		panel.add(labDuracion = new JLabel(" Duracion de la pelicula "));
		panel.add(txtDuracion = new JTextField());

		panel.add(labCostoproduccion = new JLabel(" Costo de produccion sin impuesto "));
		panel.add(txtCostoprduccion = new JTextField("0"));
		txtCostoprduccion.setEditable(true);
		labCostoproduccion.setForeground(Color.red);
		txtCostoprduccion.setBackground(Color.YELLOW);

		btnSeguir.addActionListener(this);
		btnCancelar.addActionListener(this);

		panel.add(btnSeguir, BorderLayout.SOUTH);
		panel.add(btnCancelar, BorderLayout.SOUTH);
		
		this.getContentPane().add(panel,BorderLayout.NORTH);

		

	
		
	}
	
	private void armarpanel2() {
		
		JPanel panel2 = new JPanel();
		
		panel2.setLayout(new GridLayout(8,0,4,5 ));
		panel2.setPreferredSize(new Dimension(400, 140));
		TitledBorder border = BorderFactory.createTitledBorder("resultados de la pelicula ");
		border.setTitleColor(Color.BLUE);
		panel2.setBorder(border);
		setBackground(Color.red);
		
		panel2.add(labimpuesto = new JLabel(" Impuesto a pagar "));
		panel2.add(txtimpuesto = new JTextField());
		txtimpuesto.setEditable(false);
		labimpuesto.setForeground(Color.red);

		panel2.add(labResultado = new JLabel(" Valor total de la procuccion "));
		panel2.add(txtResultado = new JTextField());
		txtResultado.setEditable(false);
		labResultado.setForeground(Color.red);
		
		this.getContentPane().add(panel2,BorderLayout.CENTER);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object botonpulsado = e.getSource();

		if (botonpulsado == btnSeguir) {

			duracion = Integer.parseInt(txtDuracion.getText());
			nombrePelicula = txtNombrepeli.getText();
			costoproduccion = Double.parseDouble(txtCostoprduccion.getText());

			if (duracion > 60 && duracion<=120) { // IMPUESTO SI LA PELICULA DURA MAS DE 100 MINUTOS

				impuesto = costoproduccion * 5 / 100;
				txtimpuesto.setText(Double.toString(impuesto));

				total = costoproduccion + impuesto;
				txtResultado.setText(Double.toString(total));

				labimpuesto.setText(" Impuesto a pagar fue del 5%");

			} else
				
			if (duracion > 120) { // IMPUESTO SI LA PELICULA DURA MAS DE 100 MINUTOS

				impuesto = costoproduccion * 15 / 100;
				txtimpuesto.setText(Double.toString(impuesto));

				total = costoproduccion + impuesto;
				txtResultado.setText(Double.toString(total));

				labimpuesto.setText(" Impuesto a pagar fue del 15%");

			} else {

				txtimpuesto.setText("No hay impuesto");
				total = costoproduccion;
				txtResultado.setText(Double.toString(total));
			}

		} else if (botonpulsado == btnCancelar) {

			System.exit(0);

		}
		
	}
	
}