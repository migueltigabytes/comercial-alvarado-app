package pe.calvarado.gestion.dao;

import java.util.List;
import pe.calvarado.gestion.entities.Proveedor;

/**
 *
 * @author DIEGOALV
 */
public interface ProveedorDAO {
    
     public List<Proveedor> listar();
     public String insert(Proveedor proveedor);
     public String update(Proveedor proveedor);
     public Proveedor get(Integer proveedor_id);
    
}
