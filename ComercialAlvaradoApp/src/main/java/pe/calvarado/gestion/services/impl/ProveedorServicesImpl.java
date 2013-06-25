package pe.calvarado.gestion.services.impl;

import java.util.List;
import pe.calvarado.gestion.dao.ProveedorDAO;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.services.ProveedorServices;

/**
 *
 * @author DIEGOALV
 */
public class ProveedorServicesImpl implements ProveedorServices {
    
    ProveedorDAO proveedorDao;

    public void setProveedorDao(ProveedorDAO proveedorDao) {
        this.proveedorDao = proveedorDao;
    }

    @Override
    public List<Proveedor> listar() {
       return proveedorDao.listar();
    }
    
    
    
    
    
}
