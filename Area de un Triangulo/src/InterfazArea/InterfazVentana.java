package InterfazArea;



import Mundo.Areatriangulo;
import javax.swing.JOptionPane;



public class InterfazVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, altura;
		
		
		 base = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese Base del Triangulo"));
		 altura = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese Altura del Triangulo"));

		
		
		 Areatriangulo ar = new  Areatriangulo ( base, altura);
		 JOptionPane.showMessageDialog(null,"Base del Triangulo: " + ar.getBase() + "\n Altura del Trinagulo: " + ar.getAltura() + 
				 "\n El Area del Triangulo Es: " +  ar.CalculoArea());
		
		
		
		

	}

}
