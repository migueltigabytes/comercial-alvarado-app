/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.dao.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.dao.ClienteDAO;
import pe.calvarado.gestion.entities.Cliente;
import pe.calvarado.gestion.util.JPAUtil;
import pe.calvarado.gestion.util.messages.UIMessages;

/**
 *
 * @author TIGABYTES 005
 */
public class ClienteDAOImplJPA implements ClienteDAO{

    private EntityManager em;
    private static Logger log = Logger.getLogger(ClienteDAOImplJPA.class);

    public ClienteDAOImplJPA() {
        this.em = JPAUtil.getEntityManager();
    }
    
    
    @Override
    public List<Cliente> listar() {
        TypedQuery<Cliente> query = em.createQuery("select c From Cliente", Cliente.class);
        return query.getResultList();
    }

    @Override
    public String insert(Cliente cliente) {
        String resultado = null;
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            resultado = UIMessages.getInfoMessage("onCompleteInsert");
            log.info("Insertando cliente");
        } catch (Exception ex) {
            log.error(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            return resultado;
        }
    }

    @Override
    public String update(Cliente cliente) {
        String mensaje = null;
        log.trace("Actualizando cliente...");
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }

        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
            mensaje = UIMessages.getInfoMessage("onCompleteUpdate");
            log.info(UIMessages.getInfoMessage("onCompleteUpdate"));
        } catch (Exception ex) {
            em.getTransaction().rollback();
            log.error("Error al actualizar cliente...");
        }

        return mensaje;
    }

    @Override
    public Cliente get(Integer cliente_id) {
       if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(Cliente.class, cliente_id);
    }

    @Override
    public List<Cliente> listarPorApellido(String apellido) {
      if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        CriteriaBuilder qb = em.getCriteriaBuilder();
        CriteriaQuery cq = qb.createQuery();
        Root<Cliente> cliente = cq.from(Cliente.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(qb.like(cliente.<String>get("apellidos"), "%" + apellido + "%"));

        cq.select(cliente).where(predicates.toArray(new Predicate[]{}));      
        List<Cliente> clienteList = em.createQuery(cq).getResultList();
        em.close();
        return clienteList;
    }
    
}
