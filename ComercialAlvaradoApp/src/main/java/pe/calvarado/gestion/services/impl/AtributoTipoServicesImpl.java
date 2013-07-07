package pe.calvarado.gestion.services.impl;

import javax.swing.DefaultComboBoxModel;
import pe.calvarado.gestion.dao.AtributoTipoDAO;
import pe.calvarado.gestion.services.AtributoTipoServices;

/**
 *
 * @author DIEGOALV
 */
public class AtributoTipoServicesImpl implements AtributoTipoServices{

    AtributoTipoDAO atributoTipoDao;
    
    public void setAtributoTipoDao(AtributoTipoDAO atributoTipoDao) {
        this.atributoTipoDao = atributoTipoDao;
    }

    

    @Override
    public DefaultComboBoxModel combo() {
        return atributoTipoDao.combo();
    }
    
    
    
}
