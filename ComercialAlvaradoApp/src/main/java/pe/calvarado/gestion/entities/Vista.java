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
@Table(name = "vista")
@NamedQueries({
    @NamedQuery(name = "Vista.findAll", query = "SELECT v FROM Vista v")})
public class Vista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vista_id")
    private Integer vistaId;
    @Column(name = "archivo")
    private String archivo;
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "activa")
    private boolean activa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vistaId")
    private List<Permiso> permisoList;

    public Vista() {
    }

    public Vista(Integer vistaId) {
        this.vistaId = vistaId;
    }

    public Vista(Integer vistaId, boolean activa) {
        this.vistaId = vistaId;
        this.activa = activa;
    }

    public Integer getVistaId() {
        return vistaId;
    }

    public void setVistaId(Integer vistaId) {
        this.vistaId = vistaId;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public List<Permiso> getPermisoList() {
        return permisoList;
    }

    public void setPermisoList(List<Permiso> permisoList) {
        this.permisoList = permisoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vistaId != null ? vistaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vista)) {
            return false;
        }
        Vista other = (Vista) object;
        if ((this.vistaId == null && other.vistaId != null) || (this.vistaId != null && !this.vistaId.equals(other.vistaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Vista[ vistaId=" + vistaId + " ]";
    }
    
}
