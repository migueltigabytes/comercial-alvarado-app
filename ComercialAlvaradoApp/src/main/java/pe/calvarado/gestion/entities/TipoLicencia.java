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
@Table(name = "tipo_licencia")
@NamedQueries({
    @NamedQuery(name = "TipoLicencia.findAll", query = "SELECT t FROM TipoLicencia t")})
public class TipoLicencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tipo_licencia_id")
    private Integer tipoLicenciaId;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "identificador")
    private String identificador;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "MARKFORDELETE")
    private Boolean markfordelete;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoLicenciaId")
    private List<Transportista> transportistaList;

    public TipoLicencia() {
    }

    public TipoLicencia(Integer tipoLicenciaId) {
        this.tipoLicenciaId = tipoLicenciaId;
    }

    public Integer getTipoLicenciaId() {
        return tipoLicenciaId;
    }

    public void setTipoLicenciaId(Integer tipoLicenciaId) {
        this.tipoLicenciaId = tipoLicenciaId;
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

    public Boolean getMarkfordelete() {
        return markfordelete;
    }

    public void setMarkfordelete(Boolean markfordelete) {
        this.markfordelete = markfordelete;
    }

    public List<Transportista> getTransportistaList() {
        return transportistaList;
    }

    public void setTransportistaList(List<Transportista> transportistaList) {
        this.transportistaList = transportistaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoLicenciaId != null ? tipoLicenciaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoLicencia)) {
            return false;
        }
        TipoLicencia other = (TipoLicencia) object;
        if ((this.tipoLicenciaId == null && other.tipoLicenciaId != null) || (this.tipoLicenciaId != null && !this.tipoLicenciaId.equals(other.tipoLicenciaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.TipoLicencia[ tipoLicenciaId=" + tipoLicenciaId + " ]";
    }
    
}
