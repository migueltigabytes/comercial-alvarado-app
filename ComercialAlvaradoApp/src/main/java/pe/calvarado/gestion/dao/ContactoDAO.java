
package pe.calvarado.gestion.dao;

import java.util.List;
import pe.calvarado.gestion.entities.Contacto;
import pe.calvarado.gestion.entities.Proveedor;

public interface ContactoDAO {    
     public List<Contacto> listar();
     public String insert(Contacto contacto);
     public String update(Contacto contacto);
     public Contacto get(Integer contacto_id);  
     public List<Contacto> listarporNombre(String nombre, Proveedor proveedorId); 
}
