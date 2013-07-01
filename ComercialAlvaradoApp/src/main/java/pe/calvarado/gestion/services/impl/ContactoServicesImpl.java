
package pe.calvarado.gestion.services.impl;

import java.util.List;
import pe.calvarado.gestion.dao.ContactoDAO;
import pe.calvarado.gestion.entities.Contacto;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.services.ContactoServices;


public class ContactoServicesImpl implements ContactoServices{

    ContactoDAO contactoDao;

    public void setContactoDao(ContactoDAO contactoDao) {
        this.contactoDao = contactoDao;
    }
            
    /* CURD */
    @Override
    public List<Contacto> listar() {
        return contactoDao.listar();
    }

    @Override
    public String insert(Contacto contacto) {
        return contactoDao.insert(contacto);
    }

    @Override
    public String update(Contacto contacto) {
       return contactoDao.update(contacto);
    }

    @Override
    public Contacto get(Integer contacto_id) {
       return contactoDao.get(contacto_id);
    }

    @Override
    public List<Contacto> listarporNombre(String nombre, Proveedor proveedor) {
        return contactoDao.listarporNombre(nombre, proveedor);
    }
    
}
