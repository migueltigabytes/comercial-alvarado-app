package pe.calvarado.gestion.dao;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import pe.calvarado.gestion.entities.Fabricante;


/**
 *
 * @author DIEGOALV
 */
public interface FabricanteDAO {
    
     public List<Fabricante> listar();
     public String insert(Fabricante fabricante);
     public String update(Fabricante fabricante);
     public Fabricante get(Integer fabricante_id);  
     public List<Fabricante> getFabricantesByParams(String nombre);
     public DefaultComboBoxModel combo();   
    
}
