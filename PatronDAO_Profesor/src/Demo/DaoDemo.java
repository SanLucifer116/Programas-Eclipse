package Demo;

import Modelo.Cliente;
import Idao.IClienteDao;
import DAO.ClienteDaoImpl;

public class DaoDemo {



	public static void main(String[] args) {
		// objeto para manipular el dao
		IClienteDao clienteDao = new ClienteDaoImpl();
		 
		// imprimir los clientes
		clienteDao.obtenerClientes().forEach(System.out::println);
		 
		// obtner un cliente
		Cliente cliente = clienteDao.obtenerCliente(0);
		cliente.setApellido("Pardo");
		//actualizar cliente
		clienteDao.actualizarCliente(cliente);
		
		
		
		
		
		// imprimir los clientes
		System.out.println("*****");
		clienteDao.obtenerClientes().forEach(System.out::println);
		
		System.out.println("*****");

		//Eliminar un cliente 
		cliente =clienteDao.obtenerCliente(0);
		clienteDao.eliminarCliente(cliente);
		
		System.out.println("*****");
		 System.out.println("Usuarios Actuales");
         clienteDao.obtenerClientes().forEach(System.out::println);
	
	}
	
  }




















