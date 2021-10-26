package Principal;

import Fabricas.*;
import javax.swing.JOptionPane;

public class Principal {

	/*
	 * La clase principal hace uso de las fabricas concretas, esta clase no
	 * instancia directamente los productos concretos al igual que el producto
	 * abstracto, sino que se encarga de hacer uso de las fabricas, ya que, ellas se
	 * van a encargar de gestionar la creacion de los productos concretos a tavez de
	 * la fabrica abstracta
	 */

	public static void main(String[] args) {
		// TODO code application logic here

		FabricadeCalamidades calamidad = new FabricadeCalamidades();
		FabricaMatriculasdeH honor = new FabricaMatriculasdeH();
		FabricadeMDeportivos deportivo = new FabricadeMDeportivos();
		FabricaGeneracionE becaE = new FabricaGeneracionE();
		String salida;
		int opc = 0, conbh = 0, conbc = 0, conbd = 0, congE=0;

		try {
			do {
				try {
					opc = Integer.parseInt(JOptionPane
							.showInputDialog("Ingrese la opcion correspondiente para crear la beca del tipo que desee"
									+ "\n 1. Beca Matricula De Honor" + "\n 2. Beca Por Calamidad"
									+ "\n 3. Beca Por Merito Deportivo" + "\n 4. Beca Generación E"
									+ "\n 5. Ver Becas Creadas"));

					switch (opc) {
					case 1:
						FabricadeBecas.crearFabricaDeBecas(honor);
						conbh++;
						break;
					case 2:
						FabricadeBecas.crearFabricaDeBecas(calamidad);
						conbc++;
						break;
					case 3:
						FabricadeBecas.crearFabricaDeBecas(deportivo);
						conbd++;
						break;
					case 4:
						FabricadeBecas.crearFabricaDeBecas(becaE);
						congE++;
						break;
					case 5:
						JOptionPane.showMessageDialog(null,
								"Las Becas Creadas Fueron\n================" + "\n 1. Beca Matricula De Honor: " + conbh
										+ "\n 2. Beca Por Calamidad: " + conbc + "\n 3. Beca Por Merito Deportivo: "
										+ conbd + "\n 4. Beca Generación E: " + congE,
								"BECAS UNIVERSIDAD DEL TOLIMA :v ", JOptionPane.WARNING_MESSAGE);

						break;
					default:
						JOptionPane.showMessageDialog(null, "No es un valor de consulta valido", "ERROR",
								JOptionPane.ERROR_MESSAGE);

						break;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No es un parametro de consulta valido", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
				salida = JOptionPane.showInputDialog("Volver al menu? S/N");

			} while (salida.toUpperCase().equals("S"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Bye!!!");
		}

	}

}
