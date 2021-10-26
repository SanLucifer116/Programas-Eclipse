package Idao;

import java.util.List;

import Modelo.Empleado;

//public class iEmpleadoDao {

public interface  iEmpleadoDao {
	//declaración de métodos para acceder a la base de datos
	
	public List<Empleado> obtenerEmpleados();
	public Empleado obtenerEmpleados(int Id);
	public void actualizarEmpleado(Empleado empleado);
	public void eliminarEmpleado(Empleado empleado);
	}
