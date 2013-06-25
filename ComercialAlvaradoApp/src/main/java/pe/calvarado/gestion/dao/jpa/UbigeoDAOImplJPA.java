/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import pe.calvarado.gestion.dao.UbigeoDAO;
import pe.calvarado.gestion.entities.Ubigeo;
import pe.calvarado.gestion.util.JPAUtil;

/**
 *
 * @author DIEGOALV
 */
public class UbigeoDAOImplJPA implements UbigeoDAO {

    private EntityManager  em;

    public UbigeoDAOImplJPA() {
        em = JPAUtil.getEntityManager();
    }
           
    @Override
    public List<Ubigeo> listarUbigeo() {
        
        if(!em.isOpen()){
            em = JPAUtil.getEntityManager();
        }
        //JPQL
        Query query = em.createQuery("SELECT u FROM Ubigeo u"); //SELECT * FROM UBIGEO
        return query.getResultList();
    }
    
    
    
}
