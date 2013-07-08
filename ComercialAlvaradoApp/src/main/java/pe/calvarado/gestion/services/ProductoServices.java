/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.services;

import java.util.List;
import pe.calvarado.gestion.entities.Producto;

/**
 *
 * @author TIGABYTES 005
 */
public interface ProductoServices {
    
     public List<Producto> listar();
     public String insert(Producto producto);
     public String update(Producto producto);
     public Producto get(Integer producto_id);    
     public List<Producto> listarPorNombre(String nombre);
    
}
