
package pe.calvarado.gestion.dao;

import java.util.List;
import pe.calvarado.gestion.entities.Atributo;

public interface AtributoDAO {
     public List<Atributo> listar();
     public String insert(Atributo atributo);
     public String update(Atributo atributo);
     public Atributo get(Integer atributo_id);       
}
