import javax.swing.JOptionPane;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12, b=8, c= 6;
		
		
		
		
		JOptionPane.showMessageDialog(null, a + " /" + b + " /" + c + " /");
		a =c;
		JOptionPane.showMessageDialog(null, a + " /" + b + " /" + c + " /");
		c/=b;
		JOptionPane.showMessageDialog(null, a + " /" + b + " /" + c + " /");
		a = b+c;
		JOptionPane.showMessageDialog(null, a + " /" + b + " /" + c + " /");
		a++;
		b++;
		c=a++ + ++b;
		JOptionPane.showMessageDialog(null, a + " /" + b + " /" + c + " /");
		
		
		
	}

}
