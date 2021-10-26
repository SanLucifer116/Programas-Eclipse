import javax.swing.JOptionPane;

public class NotaAlta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,nota1,nota2,nota3; 
		double prom;
		String nombre;
		
		
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite Cantidad de Numeros"));
		
			for (int i=0; i<n;i++) {
				nombre = JOptionPane.showInputDialog(null, "Digite nombre del estudiante");
				nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Nota 1" ));
				nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Nota 2" ));
				nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite Nota 3" ));

					
				prom = (nota1+nota2+nota3)/3;
			
			if (prom>0)
				JOptionPane.showMessageDialog(null, "El estudiante" + nombre + " con una nota de: " + prom + "Es la nota mas alta ");
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
