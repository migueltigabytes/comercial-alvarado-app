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

    /* CRUD */
    @Override
    public List<Proveedor> listar() {
       return proveedorDao.listar();
    }

    @Override
    public String insert(Proveedor proveedor) {
       return proveedorDao.insert(proveedor);
    }

    @Override
    public String update(Proveedor proveedor) {
       return proveedorDao.update(proveedor);
    }

    @Override
    public Proveedor get(Integer proveedor_id) {
       return proveedorDao.get(proveedor_id);
    }

    @Override
    public List<Proveedor> getProveedoresByParams(String nombre, String razonSocial, String ruc) {
        return proveedorDao.getProveedoresByParams(nombre, razonSocial, ruc);
    }
    
    
    
    
    
}
