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
import pe.calvarado.gestion.dao.ContactoDAO;
import pe.calvarado.gestion.entities.Contacto;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.util.JPAUtil;
import pe.calvarado.gestion.util.messages.UIMessages;

public class ContactoDAOImplJPA implements ContactoDAO {

    private EntityManager em;
    private static Logger log = Logger.getLogger(ContactoDAOImplJPA.class);

    public ContactoDAOImplJPA() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<Contacto> listar() {
        TypedQuery<Contacto> query = em.createQuery("select c From Contacto c WHERE c.markfordelete = ?1", Contacto.class);
        query.setParameter(1, false);
        return query.getResultList();
    }

    @Override
    public String insert(Contacto contacto) {
        String resultado = null;

        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.persist(contacto);
            em.getTransaction().commit();
            resultado = UIMessages.getInfoMessage("onCompleteInsert");
            log.info("Insertando contacto");
        } catch (Exception ex) {
            log.error(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            return resultado;
        }
    }

    @Override
    public String update(Contacto contacto) {
        String mensaje = null;
        log.trace("Actualizando contacto...");
        if(!em.isOpen()) { em = JPAUtil.getEntityManager(); }
//        Contacto contactoEncontrado = em.find(Contacto.class, contacto.getContactoId());
//        contactoEncontrado.setNombre(contacto.getNombre());


        /* Completar todos los sets .... */

        try {
            em.getTransaction().begin();
            em.merge(contacto);
            em.getTransaction().commit();
            mensaje = UIMessages.getInfoMessage("onCompleteUpdate");
            log.info(UIMessages.getInfoMessage("onCompleteUpdate"));
        } catch (Exception ex) {
            em.getTransaction().rollback();
            log.error("Error al actualizar contacto...");
        }

        return mensaje;
    }

    @Override
    public Contacto get(Integer contacto_id) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(Contacto.class, contacto_id);
    }

   
    @Override
    public List<Contacto> listarporNombre(String nombre, Proveedor proveedor) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }        
        CriteriaBuilder qb = em.getCriteriaBuilder();
        CriteriaQuery cq = qb.createQuery();
        Root<Contacto> contacto = cq.from(Contacto.class);
        List<Predicate> predicates = new ArrayList<>();

      
        predicates.add(qb.like(contacto.<String>get("nombre"), "%" + nombre + "%"));
        predicates.add(qb.equal(contacto.<Proveedor>get("proveedorId"), proveedor));
        predicates.add(qb.equal(contacto.<Boolean>get("markfordelete"), false));

        cq.select(contacto).where(predicates.toArray(new Predicate[]{}));
        //cq.orderBy(qb.desc(proveedor.get("fechaAlta").as(Date.class)));
        List<Contacto> contactoList = em.createQuery(cq).getResultList();
        em.close();
        return contactoList;
    }
}
