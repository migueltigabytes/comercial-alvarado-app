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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "producto_combo")
@NamedQueries({
    @NamedQuery(name = "ProductoCombo.findAll", query = "SELECT p FROM ProductoCombo p")})
public class ProductoCombo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "producto_combo_id")
    private Integer productoComboId;
    @Column(name = "producto_hijo_id")
    private Integer productoHijoId;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Basic(optional = false)
    @Column(name = "secuencia")
    private short secuencia;
    @Basic(optional = false)
    @Column(name = "fecha_inicio_venta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioVenta;
    @Column(name = "fecha_fin_venta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinVenta;
    @Basic(optional = false)
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "fecha_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUpdate;
    @Basic(optional = false)
    @Column(name = "en_venta")
    private int enVenta;
    @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")
    @OneToOne(optional = false)
    private Producto productoId;

    public ProductoCombo() {
    }

    public ProductoCombo(Integer productoComboId) {
        this.productoComboId = productoComboId;
    }

    public ProductoCombo(Integer productoComboId, short secuencia, Date fechaInicioVenta, Date fechaAlta, int enVenta) {
        this.productoComboId = productoComboId;
        this.secuencia = secuencia;
        this.fechaInicioVenta = fechaInicioVenta;
        this.fechaAlta = fechaAlta;
        this.enVenta = enVenta;
    }

    public Integer getProductoComboId() {
        return productoComboId;
    }

    public void setProductoComboId(Integer productoComboId) {
        this.productoComboId = productoComboId;
    }

    public Integer getProductoHijoId() {
        return productoHijoId;
    }

    public void setProductoHijoId(Integer productoHijoId) {
        this.productoHijoId = productoHijoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(short secuencia) {
        this.secuencia = secuencia;
    }

    public Date getFechaInicioVenta() {
        return fechaInicioVenta;
    }

    public void setFechaInicioVenta(Date fechaInicioVenta) {
        this.fechaInicioVenta = fechaInicioVenta;
    }

    public Date getFechaFinVenta() {
        return fechaFinVenta;
    }

    public void setFechaFinVenta(Date fechaFinVenta) {
        this.fechaFinVenta = fechaFinVenta;
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

    public int getEnVenta() {
        return enVenta;
    }

    public void setEnVenta(int enVenta) {
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
        hash += (productoComboId != null ? productoComboId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoCombo)) {
            return false;
        }
        ProductoCombo other = (ProductoCombo) object;
        if ((this.productoComboId == null && other.productoComboId != null) || (this.productoComboId != null && !this.productoComboId.equals(other.productoComboId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.ProductoCombo[ productoComboId=" + productoComboId + " ]";
    }
    
}
