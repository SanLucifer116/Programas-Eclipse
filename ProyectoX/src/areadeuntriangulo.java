
import javax.swing.*;


public class areadeuntriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura, base, res;
		
		
	base = Double.parseDouble(JOptionPane.showInputDialog("Dijite la base del triangulo"));

		altura = Double.parseDouble(JOptionPane.showInputDialog("Dijite la Altura del triangulo"));
		
		 	
		 	res = (base * altura)/2; 
		 	
		 	JOptionPane.showMessageDialog(null, "El area de su triangulo es: " + res);
		
	}

}
