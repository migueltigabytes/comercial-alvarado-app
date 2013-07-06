
package pe.calvarado.gestion.services.impl;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import pe.calvarado.gestion.dao.CategoriaDAO;
import pe.calvarado.gestion.entities.Categoria;
import pe.calvarado.gestion.services.CategoriaServices;

public class CategoriaServicesImpl implements CategoriaServices {

    CategoriaDAO categoriaDao;
    
    public void setCategoriaDao(CategoriaDAO categoriaDao) {
        this.categoriaDao = categoriaDao;
    }
        
    @Override
    public List<Categoria> listar() {
        return categoriaDao.listar();
    }

    @Override
    public String insert(Categoria categoria) {
        return categoriaDao.insert(categoria);
    }

    @Override
    public String update(Categoria categoria) {
        return categoriaDao.update(categoria);
    }

    @Override
    public Categoria get(Integer categoria_id) {
        return categoriaDao.get(categoria_id);
    }

    @Override
    public DefaultComboBoxModel combo() {
       return categoriaDao.combo();
    }
    
}
