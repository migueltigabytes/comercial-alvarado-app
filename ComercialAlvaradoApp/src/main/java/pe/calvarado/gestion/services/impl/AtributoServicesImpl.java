/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.services.impl;

import java.util.List;
import pe.calvarado.gestion.dao.AtributoDAO;
import pe.calvarado.gestion.entities.Atributo;
import pe.calvarado.gestion.services.AtributoServices;

/**
 *
 * @author TIGABYTES 005
 */
public class AtributoServicesImpl implements AtributoServices{

    AtributoDAO atributoDao;
    
     public void setAtributoDao(AtributoDAO atributoDao) {
        this.atributoDao = atributoDao;
    }
    
    @Override
    public List<Atributo> listar() {
       return atributoDao.listar();
    }

    @Override
    public String insert(Atributo atributo) {
        return atributoDao.insert(atributo);
    }

    @Override
    public String update(Atributo atributo) {
        return atributoDao.update(atributo);
    }

    @Override
    public Atributo get(Integer atributo_id) {
       return atributoDao.get(atributo_id);
    }

    @Override
    public List<Atributo> listarPorNombre(String nombre) {
        return atributoDao.listarPorNombre(nombre);
    }
    
}
