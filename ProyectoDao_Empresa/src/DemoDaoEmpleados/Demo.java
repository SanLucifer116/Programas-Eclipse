package DemoDaoEmpleados;



import Modelo.Empleado;
import DAO.EmpleadoDaolmpI;
import Idao.iEmpleadoDao;




public class Demo {

	public static void main(String[] args) {
		// objeto para manipular el dao, Se llaman las clases iEmpleadoDao y EmpleadoDaolmpI

	
		System.out.println("EMPRESA S.A.S");

		
		iEmpleadoDao empleadoDao= new EmpleadoDaolmpI();
	
	// imprimir los clientes
		empleadoDao.obtenerEmpleados().forEach(System.out::println);
	// obtner un cliente

		Empleado empleado = empleadoDao.obtenerEmpleados(0);
		empleado.setNombre("Sebastian Aragon");
		empleado.setSueldo(5000000);
		empleadoDao.actualizarEmpleado(empleado);
	
		System.out.println("*****");
		empleadoDao.obtenerEmpleados().forEach(System.out::println);

		empleado = empleadoDao.obtenerEmpleados(0);
		System.out.println("*****");
		empleadoDao.eliminarEmpleado(empleado);
	
		System.out.println("*****");
	    System.out.println("Usuarios Actuales");
	
	    empleadoDao.obtenerEmpleados().forEach(System.out::println);

	

	}







}
