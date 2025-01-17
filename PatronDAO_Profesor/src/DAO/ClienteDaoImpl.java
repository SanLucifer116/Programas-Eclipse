package DAO;

import java.util.ArrayList;
import java.util.List;
 
import Modelo.Cliente;
import Idao.IClienteDao;
 
public class ClienteDaoImpl implements IClienteDao {
//lista de tipo cliente
List<Cliente> clientes;
//inicializar los objetos cliente y a�adirlos a la lista
public ClienteDaoImpl() {
clientes = new ArrayList<>();
Cliente cliente1 = new Cliente(0,"Javier", "Molina");
Cliente cliente2 = new Cliente(1,"Lillian","�lvarez");
clientes.add(cliente1);
clientes.add(cliente2);
}
//obtener todos los clientes
@Override
public List<Cliente> obtenerClientes() {
return clientes;
}
//obtener un cliente por el id
@Override
public Cliente obtenerCliente(int id) {
return clientes.get(id);
}
//actualizar un cliente
@Override
public void actualizarCliente(Cliente cliente) {
clientes.get(cliente.getId()).setNombre(cliente.getNombre());
clientes.get(cliente.getId()).setApellido(cliente.getApellido());
System.out.println("Cliente con id: "+cliente.getId()+" actualizado satisfactoriamente");
}
//eliminar un cliente por el id
@Override
public void eliminarCliente(Cliente cliente) {
clientes.remove(cliente.getId());
System.out.println("Cliente con id: "+cliente.getId()+" elimnado satisfactoriamente");
}
}