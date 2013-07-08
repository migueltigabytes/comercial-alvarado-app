/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "permiso")
@NamedQueries({
    @NamedQuery(name = "Permiso.findAll", query = "SELECT p FROM Permiso p")})
public class Permiso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "permiso_id")
    private Integer permisoId;
    @Basic(optional = false)
    @Column(name = "ver")
    private boolean ver;
    @Basic(optional = false)
    @Column(name = "editar")
    private boolean editar;
    @Basic(optional = false)
    @Column(name = "eliminar")
    private boolean eliminar;
    @Basic(optional = false)
    @Column(name = "crear")
    private boolean crear;
    @Basic(optional = false)
    @Column(name = "imprimir")
    private boolean imprimir;
    @JoinColumn(name = "vista_id", referencedColumnName = "vista_id")
    @ManyToOne(optional = false)
    private Vista vistaId;
    @JoinColumn(name = "perfil_id", referencedColumnName = "perfil_id")
    @ManyToOne(optional = false)
    private Perfil perfilId;

    public Permiso() {
    }

    public Permiso(Integer permisoId) {
        this.permisoId = permisoId;
    }

    public Permiso(Integer permisoId, boolean ver, boolean editar, boolean eliminar, boolean crear, boolean imprimir) {
        this.permisoId = permisoId;
        this.ver = ver;
        this.editar = editar;
        this.eliminar = eliminar;
        this.crear = crear;
        this.imprimir = imprimir;
    }

    public Integer getPermisoId() {
        return permisoId;
    }

    public void setPermisoId(Integer permisoId) {
        this.permisoId = permisoId;
    }

    public boolean getVer() {
        return ver;
    }

    public void setVer(boolean ver) {
        this.ver = ver;
    }

    public boolean getEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public boolean getEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }

    public boolean getCrear() {
        return crear;
    }

    public void setCrear(boolean crear) {
        this.crear = crear;
    }

    public boolean getImprimir() {
        return imprimir;
    }

    public void setImprimir(boolean imprimir) {
        this.imprimir = imprimir;
    }

    public Vista getVistaId() {
        return vistaId;
    }

    public void setVistaId(Vista vistaId) {
        this.vistaId = vistaId;
    }

    public Perfil getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(Perfil perfilId) {
        this.perfilId = perfilId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permisoId != null ? permisoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        if ((this.permisoId == null && other.permisoId != null) || (this.permisoId != null && !this.permisoId.equals(other.permisoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Permiso[ permisoId=" + permisoId + " ]";
    }
    
}
