package pe.calvarado.gestion.dao.jpa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.dao.FabricanteDAO;
import pe.calvarado.gestion.entities.Fabricante;
import pe.calvarado.gestion.util.JPAUtil;
import pe.calvarado.gestion.util.messages.UIMessages;

/**
 *
 * @author DIEGOALV
 */
public class FabricanteDAOImplJPA implements FabricanteDAO{
    
    
     private EntityManager      em;
     private Logger log = Logger.getLogger(FabricanteDAOImplJPA.class);

     
        public FabricanteDAOImplJPA() {
            this.em = JPAUtil.getEntityManager();
        }

        
    @Override
    public List<Fabricante> listar() {
        TypedQuery<Fabricante> query = em.createQuery("select f From Fabricante f",Fabricante.class);
        return query.getResultList();
    }
    
    
    @Override
    public String insert(Fabricante fabricante) {
        String resultado = null;
                
                if(!em.isOpen()) {  em = JPAUtil.getEntityManager(); }
		
		try{
			em.getTransaction().begin();
			em.persist(fabricante);
			em.getTransaction().commit();
			resultado = UIMessages.getInfoMessage("onCompleteInsert");
                        log.info("Insertando fabricante...");
                        log.info("OK!");
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
    public String update(Fabricante fabricante) {
              String mensaje = null;
              log.trace("Actualizando fabricante...");
                
                Fabricante fabricanteEncontrado = em.find(Fabricante.class,fabricante.getFabricanteId());
                fabricanteEncontrado.setNombre(fabricante.getNombre());
                fabricanteEncontrado.setDescripcion(fabricante.getDescripcion());
                fabricanteEncontrado.setMarkfordelete(false);
             
               try{    
                    em.getTransaction().begin();
                    em.merge(fabricante);
                    em.getTransaction().commit();
                    mensaje = UIMessages.getInfoMessage("onCompleteUpdate");
                    log.info(UIMessages.getInfoMessage("onCompleteUpdate"));
                }catch(Exception ex){
                    em.getTransaction().rollback();
                    log.error("Error al actualizar fabricante...");
                }
                
                return mensaje;
    }

    @Override
    public Fabricante get(Integer fabricante_id) {
        if(!em.isOpen()){ em = JPAUtil.getEntityManager();}
        
        return em.find(Fabricante.class, fabricante_id);
    }
    
    
    
}
