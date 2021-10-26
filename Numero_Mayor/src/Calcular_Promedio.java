import javax.swing.JOptionPane;

public class Calcular_Promedio {

	public static void main(String[] args) {
	
		
		
		
		double n1,n2,n3,n4,prom;
		int nveces;
		
		
		nveces = Integer.parseInt (JOptionPane.showInputDialog(null, "Cantidad de estudiantes"));
		
		for (int i=1; i<=nveces; i++ )	{
			
		//JOptionPane.showMessageDialog(null, " Estudiante N." + i + " de " + nveces);
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite Nota 1 Del estudiante" + i));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite Nota 2 Del estudiante" + i));
		n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite Nota 3 Del estudiante" + i));	
		n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite Nota 4 Del estudiante" + i));
		
		prom = (n1+n2+n3+n4)/4.0;
		
		
		if (prom >=3.0)
			JOptionPane.showMessageDialog(null, "Pasa la materia con un promedio de: " + prom);
		else
			
			JOptionPane.showMessageDialog(null, "Pierde la materia con un promedio de: " + prom);


		JOptionPane.showMessageDialog(null, "------------FIN PROGRAMA-------------");
	
		
		
		}
		
		

	}

}
