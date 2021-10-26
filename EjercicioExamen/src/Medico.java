public class Medico extends Empleado {	
	
private String cargo;
private double sueldo;



public Medico(String cedula, String nombre, String pCargo , double pSueldo)
{
super(cedula, nombre);
cargo = pCargo;
sueldo = pSueldo;
}



public String getCargo() {
	return cargo;
}



public double getSueldo() {
	return sueldo;
}




}