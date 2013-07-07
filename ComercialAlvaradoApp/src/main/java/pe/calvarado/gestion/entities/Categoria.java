/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "categoria")
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")})
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "categoria_id")
    private Integer categoriaId;
    @OneToMany(mappedBy = "categoriaPadreId")
    private List<Categoria> categoriaList;
    @JoinColumn(name = "categoria_padre_id", referencedColumnName = "categoria_id")
    @ManyToOne
    private Categoria categoriaPadreId;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "nivel")
    private int nivel;
    @Basic(optional = false)
    @Column(name = "MARKFORDELETE")
    private boolean markfordelete;
    @ManyToMany(mappedBy = "categoriaList")
    private List<Producto> productoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaDefaultId")
    private List<Producto> productoList1;

    public Categoria() {
    }

    public Categoria(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Categoria(Integer categoriaId, Categoria categoriaPadreId, String nombre, int nivel, boolean markfordelete) {
        this.categoriaId = categoriaId;
        this.categoriaPadreId = categoriaPadreId;
        this.nombre = nombre;
        this.nivel = nivel;
        this.markfordelete = markfordelete;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Categoria getCategoriaPadreId() {
        return categoriaPadreId;
    }

    public void setCategoriaPadreId(Categoria categoriaPadreId) {
        this.categoriaPadreId = categoriaPadreId;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

    public List<Producto> getProductoList1() {
        return productoList1;
    }

    public void setProductoList1(List<Producto> productoList1) {
        this.productoList1 = productoList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriaId != null ? categoriaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.categoriaId == null && other.categoriaId != null) || (this.categoriaId != null && !this.categoriaId.equals(other.categoriaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
}
