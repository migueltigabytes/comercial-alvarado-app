package pe.calvarado.gestion.services;

import java.util.List;
import pe.calvarado.gestion.entities.Fabricante;

/**
 *
 * @author DIEGOALV
 */
public interface FabricanteServices {
    
     public List<Fabricante> listar();
     public String insert(Fabricante fabricante);
     public String update(Fabricante fabricante);
     public Fabricante get(Integer fabricante_id); 
     public List<Fabricante> getFabricantesByParams(String nombre );
}
