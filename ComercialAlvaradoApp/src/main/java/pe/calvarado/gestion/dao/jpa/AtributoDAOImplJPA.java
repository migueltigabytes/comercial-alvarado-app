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
import pe.calvarado.gestion.dao.AtributoDAO;
import pe.calvarado.gestion.entities.Atributo;
import pe.calvarado.gestion.util.JPAUtil;
import pe.calvarado.gestion.util.messages.UIMessages;

public class AtributoDAOImplJPA implements AtributoDAO {

    private EntityManager em;
    private static Logger log = Logger.getLogger(AtributoDAOImplJPA.class);

    public AtributoDAOImplJPA() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<Atributo> listar() {
        TypedQuery<Atributo> query = em.createQuery("select c From Atributo", Atributo.class);
        return query.getResultList();
    }

    @Override
    public String insert(Atributo atributo) {
        String resultado = null;
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.persist(atributo);
            em.getTransaction().commit();
            resultado = UIMessages.getInfoMessage("onCompleteInsert");
            log.info("Insertando atributo");
        } catch (Exception ex) {
            log.error(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            return resultado;
        }
    }

    @Override
    public String update(Atributo atributo) {
        String mensaje = null;
        log.trace("Actualizando atributo...");
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }

        try {
            em.getTransaction().begin();
            em.merge(atributo);
            em.getTransaction().commit();
            mensaje = UIMessages.getInfoMessage("onCompleteUpdate");
            log.info(UIMessages.getInfoMessage("onCompleteUpdate"));
        } catch (Exception ex) {
            em.getTransaction().rollback();
            log.error("Error al actualizar atributo...");
        }

        return mensaje;
    }

    @Override
    public Atributo get(Integer atributo_id) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(Atributo.class, atributo_id);
    }

    @Override
    public List<Atributo> listarPorNombre(String nombre) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        CriteriaBuilder qb = em.getCriteriaBuilder();
        CriteriaQuery cq = qb.createQuery();
        Root<Atributo> atributo = cq.from(Atributo.class);
        List<Predicate> predicates = new ArrayList<>();
        
        predicates.add(qb.like(atributo.<String>get("nombre"),"%"+nombre+"%"));

        cq.select(atributo).where(predicates.toArray(new Predicate[]{}));
        //cq.orderBy(qb.desc(proveedor.get("fechaAlta").as(Date.class)));
        List<Atributo> atributoList = em.createQuery(cq).getResultList();
        em.close();
        return atributoList;
    }
}
