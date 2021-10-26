import javax.swing.JOptionPane;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num, res,contador1=0,contador2=0,acu=0;
		double prom;
				
		
	;
		
		
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite Cantidad de Numeros"));
		
		for (int i=0; i<n;i++) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + (i+1) + "." ));
			
			if(num%2 == 0)
				contador1=contador1+1;
			else
				contador2=contador2+1;
			
			acu=acu+num;
		}
		
		prom=acu/n;
		JOptionPane.showMessageDialog(null, " Numeros Pares: " + contador1 );
		JOptionPane.showMessageDialog(null, " Numeros Impares: " + contador2 );
		JOptionPane.showMessageDialog(null, " Promedio: " + prom);

		
		
		
		
		
		
		
		
		
		
		
	}

}
