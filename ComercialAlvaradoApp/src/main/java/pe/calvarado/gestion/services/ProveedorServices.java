package pe.calvarado.gestion.services;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import pe.calvarado.gestion.entities.Proveedor;

/**
 *
 * @author DIEGOALV
 */
public interface ProveedorServices {
    
    public List<Proveedor> listar();
    public String insert(Proveedor proveedor);
    public String update(Proveedor proveedor);
    public Proveedor get(Integer proveedor_id);
    public List<Proveedor> getProveedoresByParams(String nombre,String razonSocial,String ruc);
    public DefaultComboBoxModel combo();
    
}
