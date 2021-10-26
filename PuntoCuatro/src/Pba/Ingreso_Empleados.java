package Pba;

public class Ingreso_Empleados {
	private String Cedula;
	private String Nombre;
	private int Tipo_Cargo;
	private int cantidad_Enfermeros;
	private int Otro_Funcionario;
	private int cantidad_Funcionarios;
	
	
	public Ingreso_Empleados (String P_Cedula, String P_Nombre,int P_Tipo_Cargo, int P_cantidad_Funcionarios) {
		Cedula = P_Cedula;
		Nombre = P_Nombre;
		Tipo_Cargo = P_Tipo_Cargo;
		cantidad_Funcionarios = P_cantidad_Funcionarios;
	}
	
	public String get_Cedula() {
		return Cedula;
	}
	public String get_Nombre() {
		return Nombre;
	}
	public int  get_Tipo_Cargo() {
		return Tipo_Cargo;
	}	
	public int  get_Cantidad_Funcionarios() {
		return cantidad_Funcionarios;
	}	
	
	public boolean Contar_Enfermeros_Hospital() { 

		if (Tipo_Cargo ==1) {
			return true;
		}else {
			return false; 
			
			
			
			
		}
	}
	
}