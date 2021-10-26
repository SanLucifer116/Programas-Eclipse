package Idao;

import java.util.List;

import Modelo.Cliente;
 
	public interface IClienteDao {
	//declaraci�n de m�todos para acceder a la base de datos
	public List<Cliente> obtenerClientes();
	public Cliente obtenerCliente(int id);
	public void actualizarCliente(Cliente cliente);
	public void eliminarCliente(Cliente cliente);
	}
	