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
import pe.calvarado.gestion.dao.ProveedorDAO;
import pe.calvarado.gestion.entities.Proveedor;
import pe.calvarado.gestion.util.JPAUtil;
import pe.calvarado.gestion.util.messages.UIMessages;

/**
 *
 * @author DIEGOALV
 */
public class ProveedorDAOImplJPA implements ProveedorDAO{

    
    private EntityManager      em;
    private static Logger log = Logger.getLogger(ProveedorDAOImplJPA.class);
    

    public ProveedorDAOImplJPA() {
        this.em = JPAUtil.getEntityManager();
    }
    
    @Override
    public List<Proveedor> listar() {
                TypedQuery<Proveedor> query = em.createQuery("select p From Proveedor p",Proveedor.class);
		return query.getResultList();
    }

    @Override
    public String insert(Proveedor proveedor) {
        	String resultado = null;
                
                if(!em.isOpen()) {  em = JPAUtil.getEntityManager(); }
		
		try
                {
			em.getTransaction().begin();
			em.persist(proveedor);
			em.getTransaction().commit();
			resultado = UIMessages.getInfoMessage("onCompleteInsert");
                        log.info("Insertando cheque...");
		}
                        catch(Exception ex){
                        log.error(ex.getMessage());
			em.getTransaction().rollback();
                }
		
                finally{
                        em.close();
                        return resultado;
                        }
    }

    @Override
    public String update(Proveedor proveedor) {
              String mensaje = null;
              log.trace("Actualizando proveedor...");
                
             Proveedor proveedorEncontrado = em.find(Proveedor.class,proveedor.getProveedorId());
             proveedorEncontrado.setNombre(proveedor.getNombre());
             
             /* Completar todos los sets .... */
   
               try{    
                    em.getTransaction().begin();
                    em.merge(proveedor);
                    em.getTransaction().commit();
                    mensaje = UIMessages.getInfoMessage("onCompleteUpdate");
                    log.info(UIMessages.getInfoMessage("onCompleteUpdate"));
                }catch(Exception ex){
                    em.getTransaction().rollback();
                    log.error("Error al actualizar cheque...");
                }
                
                return mensaje;
        
        
    }

    @Override
    public Proveedor get(Integer proveedor_id) {
        if(!em.isOpen()){ em = JPAUtil.getEntityManager();}
        return em.find(Proveedor.class, proveedor_id);
    }

    @Override
    public List<Proveedor> getProveedoresByParams(String nombre,String razonSocial,String ruc) {
                    CriteriaBuilder qb  = em.getCriteriaBuilder();
		    CriteriaQuery cq    = qb.createQuery();
		    Root<Proveedor> proveedor = cq.from(Proveedor.class);
                    List<Predicate> predicates = new ArrayList<>();
        
                        if(nombre != null && !nombre.isEmpty()){
                            predicates.add(qb.like(proveedor.<String>get("nombre"),"%"+nombre+"%"));
                        }
                    
                        if(razonSocial != null && !razonSocial.isEmpty()){
                            predicates.add(qb.like(proveedor.<String>get("razonSocial"),"%"+razonSocial+"%"));
                        }
                        
                        if(ruc != null && !ruc.isEmpty()){
                            predicates.add(qb.like(proveedor.<String>get("ruc"),"%"+ruc+"%"));
                        }
                    
                cq.select(proveedor)
		            .where(predicates.toArray(new Predicate[]{}));
                            //cq.orderBy(qb.desc(proveedor.get("fechaAlta").as(Date.class)));
                            List<Proveedor> proveedorList =  em.createQuery(cq).getResultList();
                            return proveedorList;    
    }
    
    
    
    
}
