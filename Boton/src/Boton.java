import javax.swing.*;
import java.awt.event.*;




public class Boton extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton boton;
	JLabel texto;
	
	public Boton() {
	setLayout(null);
	boton= new JButton ("Salir");
	boton.setBounds(100, 150, 100, 30);
	boton.addActionListener(this);
	add (boton);
	texto = new JLabel ("Presione el boton para salir");
	texto.setBounds(50,50, 200, 40);
	add (texto);
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource()== boton) {}
		setTitle("Saldra en 2 segundos");
		try {
			Thread.sleep(2000);
			System.exit(0);
		}catch ( Exception excep) {
			System.exit(0);
		}
	}
	public static void main(String[] ar) {
		Boton ventana=new Boton();
		ventana.setBounds(500,250,300,250);
		ventana.setVisible(true);
		ventana.setResizable(false);
		}
}

	