/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import pe.calvarado.gestion.dao.ProveedorDAO;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.util.JPAUtil;

/**
 *
 * @author DIEGOALV
 */
public class ProveedorDAOImplJPA implements ProveedorDAO{

    
    private EntityManager		 em;

    public ProveedorDAOImplJPA() {
        this.em = JPAUtil.getEntityManager();
    }
    
   
    
    @Override
    public List<Proveedor> listar() {
                TypedQuery<Proveedor> query = em.createQuery("select p From Proveedor p",Proveedor.class);
		return query.getResultList();
    }
    
    
    
    
}
