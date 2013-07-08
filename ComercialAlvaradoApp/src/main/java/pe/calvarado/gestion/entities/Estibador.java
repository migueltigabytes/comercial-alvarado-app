/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "estibador")
@NamedQueries({
    @NamedQuery(name = "Estibador.findAll", query = "SELECT e FROM Estibador e")})
public class Estibador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "estibador_id")
    private Integer estibadorId;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;
    @Column(name = "telefono")
    private String telefono;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "comision_por_carga")
    private BigDecimal comisionPorCarga;
    @Basic(optional = false)
    @Column(name = "MARKFORDELETE")
    private boolean markfordelete;
    @JoinTable(name = "estibador_delivery", joinColumns = {
        @JoinColumn(name = "estibador_id", referencedColumnName = "estibador_id")}, inverseJoinColumns = {
        @JoinColumn(name = "delivery_id", referencedColumnName = "delivery_id")})
    @ManyToMany
    private List<Delivery> deliveryList;

    public Estibador() {
    }

    public Estibador(Integer estibadorId) {
        this.estibadorId = estibadorId;
    }

    public Estibador(Integer estibadorId, String nombres, String apellidos, String celular, BigDecimal comisionPorCarga, boolean markfordelete) {
        this.estibadorId = estibadorId;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.comisionPorCarga = comisionPorCarga;
        this.markfordelete = markfordelete;
    }

    public Integer getEstibadorId() {
        return estibadorId;
    }

    public void setEstibadorId(Integer estibadorId) {
        this.estibadorId = estibadorId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public BigDecimal getComisionPorCarga() {
        return comisionPorCarga;
    }

    public void setComisionPorCarga(BigDecimal comisionPorCarga) {
        this.comisionPorCarga = comisionPorCarga;
    }

    public boolean getMarkfordelete() {
        return markfordelete;
    }

    public void setMarkfordelete(boolean markfordelete) {
        this.markfordelete = markfordelete;
    }

    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estibadorId != null ? estibadorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estibador)) {
            return false;
        }
        Estibador other = (Estibador) object;
        if ((this.estibadorId == null && other.estibadorId != null) || (this.estibadorId != null && !this.estibadorId.equals(other.estibadorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Estibador[ estibadorId=" + estibadorId + " ]";
    }
    
}
