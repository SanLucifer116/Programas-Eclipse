package Mundo2;

import javax.swing.JOptionPane;
import Mundo2.Empleado; //SuperClase
import Mundo2.Profesor; //SubClase

//Clase principal
public class InterfazEmpleado

{
// Inicio del programa

public static void main(String[] args)

{
String pCedula, pNombre;
int pNumHoras;
double pSalario,pValorHora, pValorVenta, pSalariobasic;


//Entrada y conversión de datos

pCedula=JOptionPane.showInputDialog("Cedula del empleado?");
pNombre=JOptionPane.showInputDialog("Nombre?");
pValorHora=Double.parseDouble(JOptionPane.showInputDialog("Valor hora?"));
pNumHoras=Integer.parseInt(JOptionPane.showInputDialog("Numero de horas?"));

//Creación de un Objeto o una Instancia de la Clase

Profesor cat = new Profesor(pCedula, pNombre, 0,pNumHoras,pValorHora);
pSalario=cat.calcularSalario();

//Paso de mensaje con parámetros
cat.setSalario(pSalario);

//Salida de datos
JOptionPane.showMessageDialog(null, "Cedula: "+cat.getCedula()+"\nNombre: "+cat.getNombre()+"\nSalario: $"+cat.getSalario());


pCedula=JOptionPane.showInputDialog("Cedula del empleado?");
pNombre=JOptionPane.showInputDialog("Nombre?");
pSalariobasic=Double.parseDouble(JOptionPane.showInputDialog("Salario Basico?"));
pValorVenta = Double.parseDouble(JOptionPane.showInputDialog("Valor Venta?"));


Vendedor cat1 = new Vendedor (pCedula, pNombre, pSalariobasic, pValorVenta, pSalario );
pSalario =cat1.calcularComsion();


JOptionPane.showMessageDialog(null, "Cedula: "+cat1.getCedula()+"\nNombre: "+cat1.getNombre()+ "\nSalario Basico: "+ cat1.getValorComision() + "\nValor Venta" + cat1.getSalario()+"\nSalario: $"+cat1.getSalario());




}

















} // Fin del programa