
package pe.calvarado.gestion.dao;

import java.util.List;
import pe.calvarado.gestion.entities.Producto;

public interface ProductoDAO {

     public List<Producto> listar();
     public String insert(Producto producto);
     public String update(Producto producto);
     public Producto get(Integer producto_id);    
     public List<Producto> listarPorNombre(String nombre);
    
}
