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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "atributo_tipo")
@NamedQueries({
    @NamedQuery(name = "AtributoTipo.findAll", query = "SELECT a FROM AtributoTipo a")})
public class AtributoTipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "atributo_tipo_id")
    private Integer atributoTipoId;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atributoTipoId")
    private List<Atributo> atributoList;

    public AtributoTipo() {
    }

    public AtributoTipo(Integer atributoTipoId) {
        this.atributoTipoId = atributoTipoId;
    }

    public Integer getAtributoTipoId() {
        return atributoTipoId;
    }

    public void setAtributoTipoId(Integer atributoTipoId) {
        this.atributoTipoId = atributoTipoId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Atributo> getAtributoList() {
        return atributoList;
    }

    public void setAtributoList(List<Atributo> atributoList) {
        this.atributoList = atributoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atributoTipoId != null ? atributoTipoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtributoTipo)) {
            return false;
        }
        AtributoTipo other = (AtributoTipo) object;
        if ((this.atributoTipoId == null && other.atributoTipoId != null) || (this.atributoTipoId != null && !this.atributoTipoId.equals(other.atributoTipoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.AtributoTipo[ atributoTipoId=" + atributoTipoId + " ]";
    }
    
}
