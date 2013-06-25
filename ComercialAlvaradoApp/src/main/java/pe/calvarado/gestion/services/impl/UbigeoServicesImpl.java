/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.services.impl;

import java.util.List;
import pe.calvarado.gestion.dao.UbigeoDAO;
import pe.calvarado.gestion.entities.Ubigeo;
import pe.calvarado.gestion.services.UbigeoServices;

/**
 *
 * @author DIEGOALV
 */
public class UbigeoServicesImpl implements UbigeoServices{
    
    UbigeoDAO ubigeoDao;

    public void setUbigeoDao(UbigeoDAO ubigeoDao) {
        this.ubigeoDao = ubigeoDao;
    }
      

    @Override
    public List<Ubigeo> listarUbigeo() {
        return ubigeoDao.listarUbigeo();
    }
    
}
