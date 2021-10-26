import javax.swing.JOptionPane;

public class EjercicioVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		String mostrar = "";
			
		//SE DIGITA EL TAMAÑO DEL ARREGLO 
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño del Vector" ));
		//SE CREA EL ARREGLO 
		int vec [] = new int [n] ;
		for ( int i =0; i<n; i++ ) {
		//LLENAR EL ARREGLO	
		vec[i]= Integer.parseInt(JOptionPane.showInputDialog(null," Digite los elementos del vector" + (i+1)+ ")." + " Digite un numero " ));
			
							
		}
		
		for ( int i =0; i<n; i++) { //MOSTRAR EL ARREGLO
			mostrar = mostrar+ vec[i]+ "\n";
		
			 
		}
		
		JOptionPane.showMessageDialog(null, "Su Vector es :" + "\n-----------------" +"\n" + mostrar );
		
		
		
		
		
		
		
		
		
	}	
		

}
