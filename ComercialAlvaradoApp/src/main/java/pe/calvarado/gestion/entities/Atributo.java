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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "atributo")
@NamedQueries({
    @NamedQuery(name = "Atributo.findAll", query = "SELECT a FROM Atributo a")})
public class Atributo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "atributo")
    private Integer atributo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "identificador")
    private String identificador;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "integer_value")
    private Integer integerValue;
    @Column(name = "float_value")
    private Integer floatValue;
    @Column(name = "string_value")
    private Integer stringValue;
    @ManyToMany(mappedBy = "atributoList")
    private List<Producto> productoList;
    @JoinColumn(name = "atributo_tipo_id", referencedColumnName = "atributo_tipo_id")
    @ManyToOne(optional = false)
    private AtributoTipo atributoTipoId;

    public Atributo() {
    }

    public Atributo(Integer atributo) {
        this.atributo = atributo;
    }

    public Atributo(Integer atributo, String nombre, String identificador) {
        this.atributo = atributo;
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public Integer getAtributo() {
        return atributo;
    }

    public void setAtributo(Integer atributo) {
        this.atributo = atributo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public Integer getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Integer floatValue) {
        this.floatValue = floatValue;
    }

    public Integer getStringValue() {
        return stringValue;
    }

    public void setStringValue(Integer stringValue) {
        this.stringValue = stringValue;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public AtributoTipo getAtributoTipoId() {
        return atributoTipoId;
    }

    public void setAtributoTipoId(AtributoTipo atributoTipoId) {
        this.atributoTipoId = atributoTipoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atributo != null ? atributo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atributo)) {
            return false;
        }
        Atributo other = (Atributo) object;
        if ((this.atributo == null && other.atributo != null) || (this.atributo != null && !this.atributo.equals(other.atributo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Atributo[ atributo=" + atributo + " ]";
    }
    
}
