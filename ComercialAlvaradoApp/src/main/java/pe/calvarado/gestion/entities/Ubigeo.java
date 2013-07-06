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
@Table(name = "ubigeo")
@NamedQueries({
    @NamedQuery(name = "Ubigeo.findAll", query = "SELECT u FROM Ubigeo u")})
public class Ubigeo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ubigeo_id")
    private Integer ubigeoId;
    @Column(name = "depto_id")
    private Integer deptoId;
    @Column(name = "provincia_id")
    private Integer provinciaId;
    @Column(name = "distrito_id")
    private Integer distritoId;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ubigeoId")
    private List<Proveedor> proveedorList;

    public Ubigeo() {
    }

    public Ubigeo(Integer ubigeoId) {
        this.ubigeoId = ubigeoId;
    }

    public Integer getUbigeoId() {
        return ubigeoId;
    }

    public void setUbigeoId(Integer ubigeoId) {
        this.ubigeoId = ubigeoId;
    }

    public Integer getDeptoId() {
        return deptoId;
    }

    public void setDeptoId(Integer deptoId) {
        this.deptoId = deptoId;
    }

    public Integer getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(Integer provinciaId) {
        this.provinciaId = provinciaId;
    }

    public Integer getDistritoId() {
        return distritoId;
    }

    public void setDistritoId(Integer distritoId) {
        this.distritoId = distritoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Proveedor> getProveedorList() {
        return proveedorList;
    }

    public void setProveedorList(List<Proveedor> proveedorList) {
        this.proveedorList = proveedorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ubigeoId != null ? ubigeoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubigeo)) {
            return false;
        }
        Ubigeo other = (Ubigeo) object;
        if ((this.ubigeoId == null && other.ubigeoId != null) || (this.ubigeoId != null && !this.ubigeoId.equals(other.ubigeoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Ubigeo[ ubigeoId=" + ubigeoId + " ]";
    }
    
}
