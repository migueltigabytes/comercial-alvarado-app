package pe.calvarado.gestion.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.dao.CategoriaDAO;
import pe.calvarado.gestion.entities.Categoria;
import pe.calvarado.gestion.util.JPAUtil;
import pe.calvarado.gestion.util.messages.UIMessages;

public class CategoriaDAOImplJPA implements CategoriaDAO {

    private EntityManager em;
    private static Logger log = Logger.getLogger(CategoriaDAOImplJPA.class);

    public CategoriaDAOImplJPA() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<Categoria> listar() {
        TypedQuery<Categoria> query = em.createQuery("select c From Categoria c WHERE c.markfordelete = ?1", Categoria.class);
        query.setParameter(1, false);
        return query.getResultList();
    }

    @Override
    public String insert(Categoria categoria) {
        String resultado = null;

        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();
            resultado = UIMessages.getInfoMessage("onCompleteInsert");
            log.info("Insertando categoria");
        } catch (Exception ex) {
            log.error(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            return resultado;
        }
    }

    @Override
    public String update(Categoria categoria) {
        String mensaje = null;
        log.trace("Actualizando categoria...");
        if(!em.isOpen()) { em = JPAUtil.getEntityManager(); }

        try {
            em.getTransaction().begin();
            em.merge(categoria);
            em.getTransaction().commit();
            mensaje = UIMessages.getInfoMessage("onCompleteUpdate");
            log.info(UIMessages.getInfoMessage("onCompleteUpdate"));
        } catch (Exception ex) {
            em.getTransaction().rollback();
            log.error("Error al actualizar categoria...");
        }

        return mensaje;
    }

    @Override
    public Categoria get(Integer categoria_id) {
       if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(Categoria.class, categoria_id);
    }
}
