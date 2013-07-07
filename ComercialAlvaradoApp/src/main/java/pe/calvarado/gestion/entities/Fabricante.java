/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "fabricante")
@NamedQueries({
    @NamedQuery(name = "Fabricante.findAll", query = "SELECT f FROM Fabricante f")})
public class Fabricante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fabricante_id")
    private Integer fabricanteId;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "MARKFORDELETE")
    private boolean markfordelete;
    @OneToMany(mappedBy = "fabricanteId")
    private List<Producto> productoList;

    public Fabricante() {
    }

    public Fabricante(Integer fabricanteId) {
        this.fabricanteId = fabricanteId;
    }

    public Fabricante(Integer fabricanteId, String nombre, boolean markfordelete) {
        this.fabricanteId = fabricanteId;
        this.nombre = nombre;
        this.markfordelete = markfordelete;
    }

    public Integer getFabricanteId() {
        return fabricanteId;
    }

    public void setFabricanteId(Integer fabricanteId) {
        this.fabricanteId = fabricanteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getMarkfordelete() {
        return markfordelete;
    }

    public void setMarkfordelete(boolean markfordelete) {
        this.markfordelete = markfordelete;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fabricanteId != null ? fabricanteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fabricante)) {
            return false;
        }
        Fabricante other = (Fabricante) object;
        if ((this.fabricanteId == null && other.fabricanteId != null) || (this.fabricanteId != null && !this.fabricanteId.equals(other.fabricanteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
}
