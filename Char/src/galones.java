
/*Los surtidores de una estaci�n de gasolina "Terpel� 
 * registran lo que "surten� en galones, 
 * pero el precio de la gasolina est� fijado en litros. 
 * Calcular e imprimir el valor a cobrarle a un cliente. 
 * Cada gal�n tiene 3.785 litros. 
 * El precio del litro es $1.025
*/


import javax.swing.*;//Importamos biblioteca swing para monstrar cuadros de dialogo


public class galones {

	public static void main(String[] args) {
		 final  double GALONLIT = 3.785;
		 final  double PRECIO = 1.025;

		double cantidad_Galones = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Cantidad Galones"));
		double conversion_Litros =  cantidad_Galones * GALONLIT;
		double valor_Total = conversion_Litros * PRECIO;
		
		JOptionPane.showMessageDialog(null, "El valor de: " + conversion_Litros + " " + "Litros Gasolina : " +" "+ '\n' +" "+ "Valor Total " + valor_Total);      
		
        }
}
