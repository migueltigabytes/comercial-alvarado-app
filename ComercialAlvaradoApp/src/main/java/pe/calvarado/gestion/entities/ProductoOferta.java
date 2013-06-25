/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "producto_oferta")
@NamedQueries({
    @NamedQuery(name = "ProductoOferta.findAll", query = "SELECT p FROM ProductoOferta p")})
public class ProductoOferta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "producto_oferta_id")
    private Integer productoOfertaId;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Basic(optional = false)
    @Column(name = "precio_oferta")
    private double precioOferta;
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fecha_inicio_oferta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioOferta;
    @Column(name = "fecha_fin_oferta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinOferta;
    @Basic(optional = false)
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "fecha_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUpdate;
    @Column(name = "en_venta")
    private Boolean enVenta;
    @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")
    @ManyToOne(optional = false)
    private Producto productoId;

    public ProductoOferta() {
    }

    public ProductoOferta(Integer productoOfertaId) {
        this.productoOfertaId = productoOfertaId;
    }

    public ProductoOferta(Integer productoOfertaId, double precioOferta, Date fechaInicioOferta, Date fechaAlta) {
        this.productoOfertaId = productoOfertaId;
        this.precioOferta = precioOferta;
        this.fechaInicioOferta = fechaInicioOferta;
        this.fechaAlta = fechaAlta;
    }

    public Integer getProductoOfertaId() {
        return productoOfertaId;
    }

    public void setProductoOfertaId(Integer productoOfertaId) {
        this.productoOfertaId = productoOfertaId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicioOferta() {
        return fechaInicioOferta;
    }

    public void setFechaInicioOferta(Date fechaInicioOferta) {
        this.fechaInicioOferta = fechaInicioOferta;
    }

    public Date getFechaFinOferta() {
        return fechaFinOferta;
    }

    public void setFechaFinOferta(Date fechaFinOferta) {
        this.fechaFinOferta = fechaFinOferta;
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

    public Boolean getEnVenta() {
        return enVenta;
    }

    public void setEnVenta(Boolean enVenta) {
        this.enVenta = enVenta;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoOfertaId != null ? productoOfertaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoOferta)) {
            return false;
        }
        ProductoOferta other = (ProductoOferta) object;
        if ((this.productoOfertaId == null && other.productoOfertaId != null) || (this.productoOfertaId != null && !this.productoOfertaId.equals(other.productoOfertaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.ProductoOferta[ productoOfertaId=" + productoOfertaId + " ]";
    }
    
}
