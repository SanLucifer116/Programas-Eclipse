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
			
			num =Integer.parseInt (JOptionPane.showInputDialog(null, "Ingrese El N�mero " + i + " De: " + totalDatos ));
			
			if(num%2 ==0)
				contPar = contPar + 1;
			else
				conImp=conImp +1;
			
			acum=acum+num;
							
			
		}
		prom=acum/totalDatos;
		JOptionPane.showMessageDialog(null, "N�meros pares: " + contPar);
		JOptionPane.showMessageDialog(null, "N�meros impares: " + conImp);
		JOptionPane.showMessageDialog(null, "Promedio de los datos es  " + prom);
		
	}

}
