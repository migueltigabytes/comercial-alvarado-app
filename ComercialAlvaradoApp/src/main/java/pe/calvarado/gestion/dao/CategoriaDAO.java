
package pe.calvarado.gestion.dao;

import java.util.List;
import pe.calvarado.gestion.entities.Categoria;

public interface CategoriaDAO {
    
     public List<Categoria> listar();
     public String insert(Categoria categoria);
     public String update(Categoria categoria);
     public Categoria get(Integer categoria_id);     
    
}
