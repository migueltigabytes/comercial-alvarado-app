/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "detalle_pedido")
@NamedQueries({
    @NamedQuery(name = "DetallePedido.findAll", query = "SELECT d FROM DetallePedido d")})
public class DetallePedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "detalle_pedido_id")
    private Integer detallePedidoId;
    @Basic(optional = false)
    @Column(name = "producto_cantidad")
    private int productoCantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio_venta")
    private BigDecimal precioVenta;
    @Column(name = "desc_por_cantidad")
    private BigDecimal descPorCantidad;
    @Basic(optional = false)
    @Column(name = "producto_atributo_id")
    private int productoAtributoId;
    @Column(name = "producto_peso_total")
    private Float productoPesoTotal;
    @Column(name = "producto_nota")
    private String productoNota;
    @Basic(optional = false)
    @Column(name = "MARKFORDELETE")
    private boolean markfordelete;
    @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")
    @ManyToOne(optional = false)
    private Producto productoId;
    @JoinColumn(name = "pedido_id", referencedColumnName = "pedido_id")
    @ManyToOne(optional = false)
    private Pedido pedidoId;

    public DetallePedido() {
    }

    public DetallePedido(Integer detallePedidoId) {
        this.detallePedidoId = detallePedidoId;
    }

    public DetallePedido(Integer detallePedidoId, int productoCantidad, BigDecimal precioVenta, int productoAtributoId, boolean markfordelete) {
        this.detallePedidoId = detallePedidoId;
        this.productoCantidad = productoCantidad;
        this.precioVenta = precioVenta;
        this.productoAtributoId = productoAtributoId;
        this.markfordelete = markfordelete;
    }

    public Integer getDetallePedidoId() {
        return detallePedidoId;
    }

    public void setDetallePedidoId(Integer detallePedidoId) {
        this.detallePedidoId = detallePedidoId;
    }

    public int getProductoCantidad() {
        return productoCantidad;
    }

    public void setProductoCantidad(int productoCantidad) {
        this.productoCantidad = productoCantidad;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public BigDecimal getDescPorCantidad() {
        return descPorCantidad;
    }

    public void setDescPorCantidad(BigDecimal descPorCantidad) {
        this.descPorCantidad = descPorCantidad;
    }

    public int getProductoAtributoId() {
        return productoAtributoId;
    }

    public void setProductoAtributoId(int productoAtributoId) {
        this.productoAtributoId = productoAtributoId;
    }

    public Float getProductoPesoTotal() {
        return productoPesoTotal;
    }

    public void setProductoPesoTotal(Float productoPesoTotal) {
        this.productoPesoTotal = productoPesoTotal;
    }

    public String getProductoNota() {
        return productoNota;
    }

    public void setProductoNota(String productoNota) {
        this.productoNota = productoNota;
    }

    public boolean getMarkfordelete() {
        return markfordelete;
    }

    public void setMarkfordelete(boolean markfordelete) {
        this.markfordelete = markfordelete;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    public Pedido getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Pedido pedidoId) {
        this.pedidoId = pedidoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallePedidoId != null ? detallePedidoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePedido)) {
            return false;
        }
        DetallePedido other = (DetallePedido) object;
        if ((this.detallePedidoId == null && other.detallePedidoId != null) || (this.detallePedidoId != null && !this.detallePedidoId.equals(other.detallePedidoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.DetallePedido[ detallePedidoId=" + detallePedidoId + " ]";
    }
    
}
