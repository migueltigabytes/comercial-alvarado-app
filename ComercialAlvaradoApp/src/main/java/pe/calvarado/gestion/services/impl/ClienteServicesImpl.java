/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.services.impl;

import java.util.List;
import pe.calvarado.gestion.dao.ClienteDAO;
import pe.calvarado.gestion.entities.Cliente;
import pe.calvarado.gestion.services.ClienteServices;

/**
 *
 * @author TIGABYTES 005
 */
public class ClienteServicesImpl implements ClienteServices{

    ClienteDAO clienteDao;
    
    public void setClienteDao(ClienteDAO clienteDao){
      this.clienteDao = clienteDao;
    }
    
    
    @Override
    public List<Cliente> listar() {
      return clienteDao.listar();
    }

    @Override
    public String insert(Cliente cliente) {
      return clienteDao.insert(cliente);
    }

    @Override
    public String update(Cliente cliente) {
      return clienteDao.update(cliente);
    }

    @Override
    public Cliente get(Integer cliente_id) {
      return clienteDao.get(cliente_id);
    }

    @Override
    public List<Cliente> listarPorApellido(String apellido) {
       return clienteDao.listarPorApellido(apellido);
    }
    
}
