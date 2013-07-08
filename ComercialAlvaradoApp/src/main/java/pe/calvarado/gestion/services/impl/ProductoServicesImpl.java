/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.services.impl;

import java.util.List;
import pe.calvarado.gestion.dao.ProductoDAO;
import pe.calvarado.gestion.entities.Producto;
import pe.calvarado.gestion.services.ProductoServices;

/**
 *
 * @author TIGABYTES 005
 */
public class ProductoServicesImpl  implements ProductoServices{

    ProductoDAO productoDao;
    
    public void setProductoDao(ProductoDAO productoDao){
       this.productoDao =  productoDao;    
    }
    
    
    @Override
    public List<Producto> listar() {
       return productoDao.listar();
    }

    @Override
    public String insert(Producto producto) {
       return productoDao.insert(producto);
    }

    @Override
    public String update(Producto producto) {
       return productoDao.update(producto);
    }

    @Override
    public Producto get(Integer producto_id) {
       return productoDao.get(producto_id);
    }

    @Override
    public List<Producto> listarPorNombre(String nombre) {
       return productoDao.listarPorNombre(nombre);
    }
    
}
