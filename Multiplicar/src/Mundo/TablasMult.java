
package Mundo;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;
import Mundo.TablasMultiplicar;
public class TablasMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pnumero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la tabla"));
		
		TablasMultiplicar tabla = new TablasMultiplicar(pnumero);
		
		JOptionPane.showMessageDialog(null,tabla.generartabla(pnumero)+ "\nLa Sumna toal de la tabla es: " + tabla.sumatoria(pnumero)  );
		
	}

	
}
