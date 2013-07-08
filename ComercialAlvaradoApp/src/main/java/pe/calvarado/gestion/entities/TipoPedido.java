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
@Table(name = "tipo_pedido")
@NamedQueries({
    @NamedQuery(name = "TipoPedido.findAll", query = "SELECT t FROM TipoPedido t")})
public class TipoPedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tipo_pedido_id")
    private Integer tipoPedidoId;
    @Column(name = "tipo_pedido")
    private String tipoPedido;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoPedidoId")
    private List<Pedido> pedidoList;

    public TipoPedido() {
    }

    public TipoPedido(Integer tipoPedidoId) {
        this.tipoPedidoId = tipoPedidoId;
    }

    public Integer getTipoPedidoId() {
        return tipoPedidoId;
    }

    public void setTipoPedidoId(Integer tipoPedidoId) {
        this.tipoPedidoId = tipoPedidoId;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoPedidoId != null ? tipoPedidoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPedido)) {
            return false;
        }
        TipoPedido other = (TipoPedido) object;
        if ((this.tipoPedidoId == null && other.tipoPedidoId != null) || (this.tipoPedidoId != null && !this.tipoPedidoId.equals(other.tipoPedidoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.TipoPedido[ tipoPedidoId=" + tipoPedidoId + " ]";
    }
    
}
