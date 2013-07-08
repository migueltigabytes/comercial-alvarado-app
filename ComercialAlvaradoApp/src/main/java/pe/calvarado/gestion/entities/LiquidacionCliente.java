/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "liquidacion_cliente")
@NamedQueries({
    @NamedQuery(name = "LiquidacionCliente.findAll", query = "SELECT l FROM LiquidacionCliente l")})
public class LiquidacionCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "liquidacion_cliente_id")
    private Integer liquidacionClienteId;
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto_pago")
    private BigDecimal montoPago;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuarioId;
    @JoinColumn(name = "pedido_id", referencedColumnName = "pedido_id")
    @ManyToOne(optional = false)
    private Pedido pedidoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "liquidacionClienteId")
    private List<Cheque> chequeList;

    public LiquidacionCliente() {
    }

    public LiquidacionCliente(Integer liquidacionClienteId) {
        this.liquidacionClienteId = liquidacionClienteId;
    }

    public Integer getLiquidacionClienteId() {
        return liquidacionClienteId;
    }

    public void setLiquidacionClienteId(Integer liquidacionClienteId) {
        this.liquidacionClienteId = liquidacionClienteId;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(BigDecimal montoPago) {
        this.montoPago = montoPago;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Pedido getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Pedido pedidoId) {
        this.pedidoId = pedidoId;
    }

    public List<Cheque> getChequeList() {
        return chequeList;
    }

    public void setChequeList(List<Cheque> chequeList) {
        this.chequeList = chequeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (liquidacionClienteId != null ? liquidacionClienteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LiquidacionCliente)) {
            return false;
        }
        LiquidacionCliente other = (LiquidacionCliente) object;
        if ((this.liquidacionClienteId == null && other.liquidacionClienteId != null) || (this.liquidacionClienteId != null && !this.liquidacionClienteId.equals(other.liquidacionClienteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.LiquidacionCliente[ liquidacionClienteId=" + liquidacionClienteId + " ]";
    }
    
}
