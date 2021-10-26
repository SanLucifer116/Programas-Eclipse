package poo_java;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class InterfazVehiculo {

	public static void main(String[] args) {
		
		Interfazventana2 ventana= new Interfazventana2();
		
	}
}

	class Interfazventana2 extends JFrame implements ActionListener{
		
	private JTextField textMarca;
	private JLabel labMarca;
	private JTextField textLinea;
	private JLabel labLinea;
	private JTextField textModelo;
	private JLabel labModelo;
	private JTextField textValor;
	private JLabel labValor;
	private JTextField textDescuento;
	private JLabel labDescuento;
	private JTextField textResultado;
	private JLabel labResultado;
	private JButton btnSeguir = new JButton("Seguir");
	private JButton btnCancelar = new JButton("Cancelar");
	
	
	private String marca, linea;
	private int modelo;
	private double valor, desc,des;
	
	
	public Interfazventana2 () {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit(); // GUARDA LA RESULUCION DE LA PANTALLA

		Dimension tamañoPantalla = mipantalla.getScreenSize(); // GUARDA EL TAMAÑO DE LA PANTALLA

		int alturaPantalla = tamañoPantalla.height; // SE CREA UNA VARIABLE PARA LA ALTURA DE LA VENTANA

		int anchoPantalla = tamañoPantalla.width;// SE CREA UNA VARIABLE PARA EL ANCHO DE LA VENTANA

		setSize(anchoPantalla / 2, alturaPantalla / 2); // TAMAÑO DE LA VENTANA

		setLocation(anchoPantalla / 4, alturaPantalla / 4); // LOCALIZACION DE LA VENTANA

		setTitle(" Descuentos "); // TITULO DE LA VENTANA

		Image miIcono = mipantalla.getImage("src/Iconos/iconoaprobado.png"); // ICONO DE LA VENTANA

		setIconImage(miIcono); // AGREGAR EL ICONO

		setDefaultCloseOperation(EXIT_ON_CLOSE); // SE ESTIPULA PARA QUE CUANDO SE LE DE A LA X SE CIERRE EL PROGRAMA

		panel();
		//add(panel1, BorderLayout.CENTER);
		
		panel2();
		
		panel3();

		setVisible(true); // METODO PARA ASIGNAR QUE LA VENTANA SEA VISIBLE

		setResizable(false); // METODO PARA ASIGNAR SI LA VENTANA SE PUEDE REDIMENCIONAR
	}
	
private void panel() {
		
		JPanel panel = new JPanel(); // METODO ARMAR PANEL
		panel.setLayout(new GridLayout(4, 2));
		panel.setPreferredSize(new Dimension(400, 140));
		TitledBorder border = BorderFactory.createTitledBorder("Datos Automovil");
		border.setTitleColor(Color.red);
		panel.setBorder(border);
		
		panel.add( labMarca = new JLabel(" Marca "));
		panel.add(textMarca = new JTextField());
		
		
		panel.add( labLinea = new JLabel(" Linea "));
		panel.add(textLinea = new JTextField());
		
		panel.add( labModelo = new JLabel(" Modelo "));
		panel.add(textModelo = new JTextField());
		
		panel.add( labValor = new JLabel(" Valor "));
		panel.add(textValor = new JTextField());
		this.getContentPane().add(panel,BorderLayout.NORTH);
		
		btnSeguir.addActionListener(this);
		btnCancelar.addActionListener(this);
		
	}


private void panel2() {
	
	JPanel panel2 = new JPanel(); // METODO ARMAR PANEL	
	panel2.setLayout(new GridLayout(1, 1));
	panel2.setPreferredSize(new Dimension(400, 140));
	TitledBorder border = BorderFactory.createTitledBorder("Descuento");
	border.setTitleColor(Color.red);
	panel2.setBorder(border);
	
	panel2.add( labDescuento = new JLabel(" Su descuento es: "));
	panel2.add(textDescuento = new JTextField("0"));
	textDescuento.setBackground(Color.WHITE);
	textDescuento.setEditable(false);
	this.getContentPane().add(panel2,BorderLayout.CENTER);
	
	}
	

private void panel3() {
	
	JPanel panel3 = new JPanel(); // METODO ARMAR PANEL	
	panel3.setLayout(new GridLayout(2, 2));
	panel3.setPreferredSize(new Dimension(400, 140));
	TitledBorder border = BorderFactory.createTitledBorder("Resultado");
	border.setTitleColor(Color.red);
	panel3.setBorder(border);
	
	panel3.add(labResultado = new JLabel ("El precio a pagar es: "));
	panel3.add(textResultado = new JTextField());
	textResultado.setEditable(false);

	panel3.add(btnSeguir, BorderLayout.SOUTH);
	panel3.add(btnCancelar, BorderLayout.SOUTH);
	
	
	this.getContentPane().add(panel3,BorderLayout.SOUTH);


  }

public void actionPerformed(ActionEvent e) {
	
	Object botonpulsado = e.getSource();
	double res;
	if (botonpulsado == btnSeguir) {
		modelo = Integer.parseInt(textModelo.getText());
		valor = Double.parseDouble(textValor.getText());
		//res = Double.parseDouble(textResultado.getText());
		
		if (modelo <= 2010 )
			des= valor * 0.05;
		else if ((modelo > 2010) && (modelo <= 2020))
			des = valor*0.02;
	   
		 else 
			 des= 0;
		res = valor - des;
      textDescuento.setText(Double.toString(des));
      textResultado.setText(Double.toString(res));
      
      
      
	
	} else	if (botonpulsado == btnCancelar) 
		
				System.exit(0);
	
   
 }

	}

	