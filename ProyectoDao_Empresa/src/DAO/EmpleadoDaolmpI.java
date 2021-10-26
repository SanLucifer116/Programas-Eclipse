package DAO;

import Modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

import Idao.iEmpleadoDao;


public class EmpleadoDaolmpI implements iEmpleadoDao {


	List<Empleado>empleados;
	
	public EmpleadoDaolmpI() {
		
		empleados = new ArrayList<>();
		Empleado empleado1= new Empleado(0, "Sebastian Mondol", 200000);
		Empleado empleado2= new Empleado(1, "Vanessa Aragon", 100000);
		empleados.add(empleado1);
		empleados.add(empleado2);

	}

	@Override
	public List<Empleado> obtenerEmpleados() {
		
		return empleados;
	}

	@Override
	public Empleado obtenerEmpleados(int Id) {
		
		return empleados.get(Id);
	}
	@Override
	public void actualizarEmpleado(Empleado empleado) {
		empleados.get(empleado.getId()).setSueldo(empleado.getSueldo());

		System.out.println("Empleado con id "+empleado.getId()+" actualizado satisfactoriamente");
		
	}

	@Override
	public void eliminarEmpleado(Empleado empleado) {
		empleados.remove(empleado.getId());
		System.out.println("Empleado con id: "+empleado.getId()+" elimnado satisfactoriamente");		
	}

	
















}
