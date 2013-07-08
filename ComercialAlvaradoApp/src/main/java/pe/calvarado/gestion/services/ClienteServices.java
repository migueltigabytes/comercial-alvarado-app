/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.services;

import java.util.List;
import pe.calvarado.gestion.entities.Cliente;

/**
 *
 * @author TIGABYTES 005
 */
public interface ClienteServices {
    
     public List<Cliente> listar();
     public String insert(Cliente cliente);
     public String update(Cliente cliente);
     public Cliente get(Integer cliente_id);    
     public List<Cliente> listarPorApellido(String apellido);  
    
}
