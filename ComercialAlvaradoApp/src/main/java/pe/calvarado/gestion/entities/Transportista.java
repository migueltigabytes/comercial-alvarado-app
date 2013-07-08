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
@Table(name = "transportista")
@NamedQueries({
    @NamedQuery(name = "Transportista.findAll", query = "SELECT t FROM Transportista t")})
public class Transportista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transportista_id")
    private Integer transportistaId;
    @Basic(optional = false)
    @Column(name = "lic_conducir")
    private String licConducir;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;
    @Column(name = "nextel")
    private String nextel;
    @Column(name = "rpm")
    private String rpm;
    @Column(name = "rpc")
    private String rpc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transportistaId")
    private List<Delivery> deliveryList;
    @JoinColumn(name = "tipo_licencia_id", referencedColumnName = "tipo_licencia_id")
    @ManyToOne(optional = false)
    private TipoLicencia tipoLicenciaId;

    public Transportista() {
    }

    public Transportista(Integer transportistaId) {
        this.transportistaId = transportistaId;
    }

    public Transportista(Integer transportistaId, String licConducir, String nombres, String apellidos, String celular) {
        this.transportistaId = transportistaId;
        this.licConducir = licConducir;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
    }

    public Integer getTransportistaId() {
        return transportistaId;
    }

    public void setTransportistaId(Integer transportistaId) {
        this.transportistaId = transportistaId;
    }

    public String getLicConducir() {
        return licConducir;
    }

    public void setLicConducir(String licConducir) {
        this.licConducir = licConducir;
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

    public String getNextel() {
        return nextel;
    }

    public void setNextel(String nextel) {
        this.nextel = nextel;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getRpc() {
        return rpc;
    }

    public void setRpc(String rpc) {
        this.rpc = rpc;
    }

    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public TipoLicencia getTipoLicenciaId() {
        return tipoLicenciaId;
    }

    public void setTipoLicenciaId(TipoLicencia tipoLicenciaId) {
        this.tipoLicenciaId = tipoLicenciaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transportistaId != null ? transportistaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transportista)) {
            return false;
        }
        Transportista other = (Transportista) object;
        if ((this.transportistaId == null && other.transportistaId != null) || (this.transportistaId != null && !this.transportistaId.equals(other.transportistaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Transportista[ transportistaId=" + transportistaId + " ]";
    }
    
}
