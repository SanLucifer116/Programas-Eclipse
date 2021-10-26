package Mundo2;

/**

* Ejemplo simplificado: Especificaci�n e implementaci�n de Clases en Java
* @(#)Empleado.java
*
* @author vGus
* @version 1.00 2015/10/14
*/

//Especificaci�n de la Clase base Empleado (superClase)
public abstract class Empleado{
// Datos o Atributos
private String cedula;
private String nombre;
private double salario;

// M�todos u operaciones

public Empleado(String pCedula, String pNombre, double pSalario)

{

cedula = pCedula;
nombre= pNombre;
salario= pSalario;

}

public abstract double calcularSalario();

// M�todos de salida

public String getCedula()

{
return cedula;
}
public String getNombre()

{
return nombre;
}
public double getSalario()

{
return salario;
}

public void setSalario(double pSalario)

{
salario = pSalario;
}
}