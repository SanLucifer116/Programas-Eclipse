package Capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b=5,c=8;
		
		
		a=b++ + c++;
		
		JOptionPane.showMessageDialog(null, "a"+ "="+b + "+" +c );
		
		
		a=b++ + ++c;
		
		JOptionPane.showMessageDialog(null, "a"+ "="+b + "+" +c );
		
		
		a= ++b + c++;
		
		JOptionPane.showMessageDialog(null, "a"+ "="+b + "+" +c );
		
		a=++b + ++c;
		
		JOptionPane.showMessageDialog(null, "a"+ "="+b + "+" +c );
		
		JOptionPane.showMessageDialog(null, "a"+ "="+a );

		
		
		if (a==21)
			JOptionPane.showMessageDialog(null, "eres gay");
		else {
			JOptionPane.showMessageDialog(null, "no eres gay");
			JOptionPane.showMessageDialog(null, "Te amo");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
