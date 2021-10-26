import javax.swing.JOptionPane;

public class Contadores {

	public static void main(String[] args) {
		
		
		
		//**************CONTADORES Y ACUMULADORES*************
		
		
		
		int num, contPar,conImp, totalDatos =12, acum;
		float prom;
		
		contPar =0;
		conImp=0;
		acum=0;
		prom=(float) 0.0;
		
		for (int i = 1; i<=totalDatos; i++) {
			
			num =Integer.parseInt (JOptionPane.showInputDialog(null, "Ingrese El Número " + i + " De: " + totalDatos ));
			
			if(num%2 ==0)
				contPar = contPar + 1;
			else
				conImp=conImp +1;
			
			acum=acum+num;
							
			
		}
		prom=acum/totalDatos;
		JOptionPane.showMessageDialog(null, "Números pares: " + contPar);
		JOptionPane.showMessageDialog(null, "Números impares: " + conImp);
		JOptionPane.showMessageDialog(null, "Promedio de los datos es  " + prom);
		
	}

}
