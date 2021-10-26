package InterfazVentana;


import java.awt.*;

import javax.swing.JFrame;


	
	public class InterfazVentana extends JFrame{
		public InterfazVentana(){
		setTitle("PengüinSoft");
		setSize(290,300);
		Color c=Color.YELLOW;
		getContentPane().setBackground(c);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		public static void main(String[] args){
		new InterfazVentana();
		}
		}
	
	