package pe.calvarado.gestion.util;

import java.util.Collection;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIEGOALV
 */
public interface StandardViewMethods {
    
    
    /**
     * Implementar este metodo para cargar datos iniciales de una vista 
     * 
     */
    public void loadData();
    
    
   /**
    * Este método genérico es el encargado de poblar los JTable . 
    * Se puede reutilizar para todas las tablas que se tenga en el formulario  
    * @param data, la data con la que tiene que poblarse el la tabla
    * @param table , la tabla que se va a poblar .
    */
    public void loadTable(DefaultTableModel data,JTable table);

    
}
