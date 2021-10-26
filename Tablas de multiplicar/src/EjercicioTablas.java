import javax.swing.JOptionPane;

public class EjercicioTablas {

	public static void main(String[] args) {
		
		int i,y;
		String tabla = " ";
		
		
		for (i=1; i<11; i++) {
			for ( y=1; y<11; y++) {
			tabla += "\n\"" +i + "X" + y + " = " + (i*y)+"\n"; 	
			
			JOptionPane.showMessageDialog(null, tabla);
			}
			
		}
		
	

	}

}
