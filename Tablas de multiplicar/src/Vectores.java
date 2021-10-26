import javax.swing.JOptionPane;

public class Vectores {

	public static void main(String[] args) {
		
		int n;
		String mostrar = " ";
			
	
		n = Integer.parseInt(JOptionPane.showInputDialog(null, " Tamaño del vector"));
		
		int vec[] = new int[n];
		
		for (int i=0; i<n;i++) {
			
			vec[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la posicion: " + (i+1)));
			
				
			
		}
		
		for (int i=0; i<n; i++) {
			mostrar = mostrar+ vec[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "Su Vector es: "+"\n"+ mostrar );
		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

