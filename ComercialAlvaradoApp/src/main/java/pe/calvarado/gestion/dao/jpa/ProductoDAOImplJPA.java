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
import pe.calvarado.gestion.dao.ProductoDAO;
import pe.calvarado.gestion.entities.Atributo;
import pe.calvarado.gestion.entities.Producto;
import pe.calvarado.gestion.util.JPAUtil;
import pe.calvarado.gestion.util.messages.UIMessages;

/**
 *
 * @author TIGABYTES 005
 */
public class ProductoDAOImplJPA implements ProductoDAO {

    private EntityManager em;
    private static Logger log = Logger.getLogger(ProductoDAOImplJPA.class);

    public ProductoDAOImplJPA() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<Producto> listar() {
        TypedQuery<Producto> query = em.createQuery("select p From Producto", Producto.class);
        return query.getResultList();
    }

    @Override
    public String insert(Producto producto) {
        String resultado = null;
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
            resultado = UIMessages.getInfoMessage("onCompleteInsert");
            log.info("Insertando producto");
        } catch (Exception ex) {
            log.error(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            return resultado;
        }
    }

    @Override
    public String update(Producto producto) {
        String mensaje = null;
        log.trace("Actualizando atributo...");
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }

        try {
            em.getTransaction().begin();
            em.merge(producto);
            em.getTransaction().commit();
            mensaje = UIMessages.getInfoMessage("onCompleteUpdate");
            log.info(UIMessages.getInfoMessage("onCompleteUpdate"));
        } catch (Exception ex) {
            em.getTransaction().rollback();
            log.error("Error al actualizar producto...");
        }

        return mensaje;
    }

    @Override
    public Producto get(Integer producto_id) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(Producto.class, producto_id);
    }

    @Override
    public List<Producto> listarPorNombre(String nombre) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        CriteriaBuilder qb = em.getCriteriaBuilder();
        CriteriaQuery cq = qb.createQuery();
        Root<Producto> producto = cq.from(Producto.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(qb.like(producto.<String>get("nombre"), "%" + nombre + "%"));

        cq.select(producto).where(predicates.toArray(new Predicate[]{}));
        //cq.orderBy(qb.desc(proveedor.get("fechaAlta").as(Date.class)));
        List<Producto> productoList = em.createQuery(cq).getResultList();
        em.close();
        return productoList;
    }
}
