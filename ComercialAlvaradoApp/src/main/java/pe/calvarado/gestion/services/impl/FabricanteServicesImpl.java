package pe.calvarado.gestion.services.impl;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import pe.calvarado.gestion.dao.FabricanteDAO;
import pe.calvarado.gestion.entities.Fabricante;
import pe.calvarado.gestion.services.FabricanteServices;
/**
 *
 * @author DIEGOALV
 */
public class FabricanteServicesImpl implements FabricanteServices{

    FabricanteDAO fabricanteDao;
    
    /*Inyección de dependencia*/

    public void setFabricanteDao(FabricanteDAO fabricanteDao) {
        this.fabricanteDao = fabricanteDao;
    }
    
    
    /* Metodos ABM */     
    
    @Override
    public List<Fabricante> listar() {
        return fabricanteDao.listar();
    }

    @Override
    public String insert(Fabricante fabricante) {
       return fabricanteDao.insert(fabricante);
    }

    @Override
    public String update(Fabricante fabricante) {
       return  fabricanteDao.update(fabricante);
    }

    @Override
    public Fabricante get(Integer fabricante_id) {
       return fabricanteDao.get(fabricante_id);
    }
    
    
    @Override
    public List<Fabricante> getFabricantesByParams(String nombre) {
        return fabricanteDao.getFabricantesByParams(nombre );
    }

    @Override
    public DefaultComboBoxModel combo() {
       return fabricanteDao.combo();
    }
    
}
