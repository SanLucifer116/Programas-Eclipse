package Modelo;

public class Empleado {

 private int id;
 private String Nombre;
 private double Sueldo;
 
 
 
 public Empleado(int id, String nombre, double sueldo) {
	super();
	this.id = id;
	Nombre = nombre;
	Sueldo = sueldo;
	}



	public int getId() {
		return id;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getNombre() {
		return Nombre;
	}
	
	
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
	public double getSueldo() {
		return Sueldo;
	}
	
	
	
	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}
		

	public String toString() {
		return this.getNombre()+" "+this.getSueldo();
		}
	
	
	
	






}
