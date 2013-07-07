/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.dao.AtributoTipoDAO;
import pe.calvarado.gestion.entities.AtributoTipo;
import pe.calvarado.gestion.util.JPAUtil;

/**
 *
 * @author DIEGOALV
 */
public class AtributoTipoDAOImplJPA implements AtributoTipoDAO {
    
    private EntityManager em;
    private static Logger log = Logger.getLogger(AtributoTipoDAOImplJPA.class);

    public AtributoTipoDAOImplJPA() {
        this.em = JPAUtil.getEntityManager();
    }
    

    @Override
    public DefaultComboBoxModel combo() {
        if(!em.isOpen()){
            em = JPAUtil.getEntityManager();
        }
       
        Query query = em.createQuery("SELECT a FROM AtributoTipo a"); 
        List<AtributoTipo> atributoTipoList =  query.getResultList();
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        for(AtributoTipo atributoTipo : atributoTipoList){
            modelo.addElement(atributoTipo);
        }
        
        return modelo;
        
    }
    
}
