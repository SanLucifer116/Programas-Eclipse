import javax.swing.JOptionPane;

public class Tablas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int x;
		String tabla= "";
		
		x= Integer.parseInt(JOptionPane.showInputDialog(null, "Numero que desea la tabla"));
		
		
		for (int i=1; i<=10; i++) {
			
			tabla+= x + " X " + i + " = " + x*i+ "\n";
		
			}
			
			JOptionPane.showMessageDialog(null, " Tabla del numero " + x + " es la siguiente" +  "\n"+ tabla);
			
		
	
	
	
	}

 }
	
	
	
	

