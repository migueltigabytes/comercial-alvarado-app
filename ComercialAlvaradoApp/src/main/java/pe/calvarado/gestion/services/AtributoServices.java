/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.services;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import pe.calvarado.gestion.entities.Atributo;

/**
 *
 * @author TIGABYTES 005
 */
public interface AtributoServices {
     public List<Atributo> listar();
     public String insert(Atributo atributo);
     public String update(Atributo atributo);
     public Atributo get(Integer atributo_id);  
     public List<Atributo> listarPorNombre(String nombre);
      public DefaultComboBoxModel combo();
}
