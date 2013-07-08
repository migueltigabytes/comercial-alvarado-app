/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "pedido")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")})
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pedido_id")
    private Integer pedidoId;
    @Column(name = "codigo_nota_pedido")
    private BigInteger codigoNotaPedido;
    @Column(name = "codigo_nota_entrega")
    private BigInteger codigoNotaEntrega;
    @Column(name = "fecha_delivery")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDelivery;
    @Column(name = "fecha_factura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactura;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "total_descuento")
    private BigDecimal totalDescuento;
    @Basic(optional = false)
    @Column(name = "total_productos")
    private int totalProductos;
    @Basic(optional = false)
    @Column(name = "total_pedido")
    private BigDecimal totalPedido;
    @Basic(optional = false)
    @Column(name = "cancelado")
    private boolean cancelado;
    @Basic(optional = false)
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "fecha_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUpdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoId")
    private List<LiquidacionCliente> liquidacionClienteList;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuarioId;
    @JoinColumn(name = "tipo_pedido_id", referencedColumnName = "tipo_pedido_id")
    @ManyToOne(optional = false)
    private TipoPedido tipoPedidoId;
    @JoinColumn(name = "direccion_delivery_id", referencedColumnName = "direccion_id")
    @ManyToOne
    private Direccion direccionDeliveryId;
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id")
    @ManyToOne
    private Cliente clienteId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoId")
    private List<DetallePedido> detallePedidoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoId")
    private List<Delivery> deliveryList;

    public Pedido() {
    }

    public Pedido(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Pedido(Integer pedidoId, BigDecimal totalDescuento, int totalProductos, BigDecimal totalPedido, boolean cancelado, Date fechaAlta) {
        this.pedidoId = pedidoId;
        this.totalDescuento = totalDescuento;
        this.totalProductos = totalProductos;
        this.totalPedido = totalPedido;
        this.cancelado = cancelado;
        this.fechaAlta = fechaAlta;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public BigInteger getCodigoNotaPedido() {
        return codigoNotaPedido;
    }

    public void setCodigoNotaPedido(BigInteger codigoNotaPedido) {
        this.codigoNotaPedido = codigoNotaPedido;
    }

    public BigInteger getCodigoNotaEntrega() {
        return codigoNotaEntrega;
    }

    public void setCodigoNotaEntrega(BigInteger codigoNotaEntrega) {
        this.codigoNotaEntrega = codigoNotaEntrega;
    }

    public Date getFechaDelivery() {
        return fechaDelivery;
    }

    public void setFechaDelivery(Date fechaDelivery) {
        this.fechaDelivery = fechaDelivery;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public BigDecimal getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(BigDecimal totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public BigDecimal getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }

    public boolean getCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaUpdate() {
        return fechaUpdate;
    }

    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }

    public List<LiquidacionCliente> getLiquidacionClienteList() {
        return liquidacionClienteList;
    }

    public void setLiquidacionClienteList(List<LiquidacionCliente> liquidacionClienteList) {
        this.liquidacionClienteList = liquidacionClienteList;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public TipoPedido getTipoPedidoId() {
        return tipoPedidoId;
    }

    public void setTipoPedidoId(TipoPedido tipoPedidoId) {
        this.tipoPedidoId = tipoPedidoId;
    }

    public Direccion getDireccionDeliveryId() {
        return direccionDeliveryId;
    }

    public void setDireccionDeliveryId(Direccion direccionDeliveryId) {
        this.direccionDeliveryId = direccionDeliveryId;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    public List<DetallePedido> getDetallePedidoList() {
        return detallePedidoList;
    }

    public void setDetallePedidoList(List<DetallePedido> detallePedidoList) {
        this.detallePedidoList = detallePedidoList;
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
        hash += (pedidoId != null ? pedidoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedidoId == null && other.pedidoId != null) || (this.pedidoId != null && !this.pedidoId.equals(other.pedidoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Pedido[ pedidoId=" + pedidoId + " ]";
    }
    
}
