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
@Table(name = "delivery")
@NamedQueries({
    @NamedQuery(name = "Delivery.findAll", query = "SELECT d FROM Delivery d")})
public class Delivery implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "delivery_id")
    private Integer deliveryId;
    @Column(name = "carga_descarga")
    private Boolean cargaDescarga;
    @ManyToMany(mappedBy = "deliveryList")
    private List<Estibador> estibadorList;
    @JoinColumn(name = "pedido_id", referencedColumnName = "pedido_id")
    @ManyToOne(optional = false)
    private Pedido pedidoId;
    @JoinColumn(name = "transporte_id", referencedColumnName = "transporte_id")
    @ManyToOne(optional = false)
    private Transporte transporteId;
    @JoinColumn(name = "transportista_id", referencedColumnName = "transportista_id")
    @ManyToOne(optional = false)
    private Transportista transportistaId;

    public Delivery() {
    }

    public Delivery(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Boolean getCargaDescarga() {
        return cargaDescarga;
    }

    public void setCargaDescarga(Boolean cargaDescarga) {
        this.cargaDescarga = cargaDescarga;
    }

    public List<Estibador> getEstibadorList() {
        return estibadorList;
    }

    public void setEstibadorList(List<Estibador> estibadorList) {
        this.estibadorList = estibadorList;
    }

    public Pedido getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Pedido pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Transporte getTransporteId() {
        return transporteId;
    }

    public void setTransporteId(Transporte transporteId) {
        this.transporteId = transporteId;
    }

    public Transportista getTransportistaId() {
        return transportistaId;
    }

    public void setTransportistaId(Transportista transportistaId) {
        this.transportistaId = transportistaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliveryId != null ? deliveryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delivery)) {
            return false;
        }
        Delivery other = (Delivery) object;
        if ((this.deliveryId == null && other.deliveryId != null) || (this.deliveryId != null && !this.deliveryId.equals(other.deliveryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Delivery[ deliveryId=" + deliveryId + " ]";
    }
    
}
