import javax.swing.JOptionPane;

public class CharEjepmlo {

	
	
	
	public static void main(String[] args) {
		char genero;
		
		genero = JOptionPane.showInputDialog("Digite genero").charAt(0);
		
		JOptionPane.showMessageDialog(null, genero);

	}
}
