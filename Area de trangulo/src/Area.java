import javax.swing.JOptionPane;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int base, altura;
	double resultado;
	
	
	base = Integer.parseInt(JOptionPane.showInputDialog(null, " Dijite base de triangulo"));
	altura = Integer.parseInt(JOptionPane.showInputDialog(null, " Dijite altura de triangulo"));
	
	
	resultado = ((base*altura)/2);
	
	JOptionPane.showMessageDialog(null, "El area de su trangulo es: " + resultado);
	
	
	
	
	
	}

	
	
	
}
