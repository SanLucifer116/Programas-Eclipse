import javax.swing.JOptionPane;

public class SerieFibonaci {

	public static void main(String[] args) {

		
		int f0=0,f1=1,f2,nveces;
		
		
		nveces = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite Numero de Terminos que Desea Ver"));
		
		
		
		for ( int i=1; i<=nveces; i++) {
			
			
			f2 = f0+f1;
			f0=f1;
			f1=f2;
			
			
			
			JOptionPane.showMessageDialog(null, f2 +"\n" );
			
			
			
		}
		
		
		JOptionPane.showMessageDialog(null, acu +"\n" );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
