package Modelo;

	public class Cliente {
	private int id;
	private String Nombre;
	private String Apellido;
	
	


	public Cliente(int id, String nombre, String apellido) {
	
	this.id = id;
	Nombre = nombre;
	Apellido = apellido;
	}
	
	public Cliente() {
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
	this.Nombre = nombre;
	}
	public String getApellido() {
	return Apellido;
	}
	public void setApellido(String apellido) {
	this.Apellido = apellido;
	}

}
