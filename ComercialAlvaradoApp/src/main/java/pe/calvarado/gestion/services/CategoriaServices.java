
package pe.calvarado.gestion.services;

import java.util.List;
import pe.calvarado.gestion.entities.Categoria;

public interface CategoriaServices {
    
     public List<Categoria> listar();
     public String insert(Categoria categoria);
     public String update(Categoria categoria);
     public Categoria get(Integer categoria_id);    
    
    
}
