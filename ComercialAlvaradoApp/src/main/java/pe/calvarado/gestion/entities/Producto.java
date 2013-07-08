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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DIEGOALV
 */
@Entity
@Table(name = "producto")
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")})
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "producto_id")
    private Integer productoId;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio_venta")
    private BigDecimal precioVenta;
    @Column(name = "precio_promocion")
    private BigDecimal precioPromocion;
    @Column(name = "promocion_desde")
    @Temporal(TemporalType.DATE)
    private Date promocionDesde;
    @Column(name = "promocion_hasta")
    @Temporal(TemporalType.DATE)
    private Date promocionHasta;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "en_venta")
    private boolean enVenta;
    @Column(name = "descuento_por_cantidad")
    private Boolean descuentoPorCantidad;
    @Basic(optional = false)
    @Column(name = "alerta_de_stock")
    private int alertaDeStock;
    @Basic(optional = false)
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "fecha_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUpdate;
    @Basic(optional = false)
    @Column(name = "MARKFORDELETE")
    private boolean markfordelete;
    @JoinTable(name = "producto_categoria", joinColumns = {
        @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")}, inverseJoinColumns = {
        @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")})
    @ManyToMany
    private List<Categoria> categoriaList;
    @JoinTable(name = "producto_atributo", joinColumns = {
        @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")}, inverseJoinColumns = {
        @JoinColumn(name = "atributo", referencedColumnName = "atributo")})
    @ManyToMany
    private List<Atributo> atributoList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "productoId")
    private ProductoCombo productoCombo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId")
    private List<ProductoOferta> productoOfertaList;
    @JoinColumn(name = "categoria_default_id", referencedColumnName = "categoria_id")
    @ManyToOne(optional = false)
    private Categoria categoriaDefaultId;
    @JoinColumn(name = "fabricante_id", referencedColumnName = "fabricante_id")
    @ManyToOne
    private Fabricante fabricanteId;
    @JoinColumn(name = "proveedor_id", referencedColumnName = "proveedor_id")
    @ManyToOne
    private Proveedor proveedorId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId")
    private List<DetallePedido> detallePedidoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId")
    private List<Imagen> imagenList;

    public Producto() {
    }

    public Producto(Integer productoId) {
        this.productoId = productoId;
    }

    public Producto(Integer productoId, String nombre, String descripcion, BigDecimal precioVenta, int cantidad, boolean enVenta, int alertaDeStock, Date fechaAlta, boolean markfordelete) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.enVenta = enVenta;
        this.alertaDeStock = alertaDeStock;
        this.fechaAlta = fechaAlta;
        this.markfordelete = markfordelete;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public BigDecimal getPrecioPromocion() {
        return precioPromocion;
    }

    public void setPrecioPromocion(BigDecimal precioPromocion) {
        this.precioPromocion = precioPromocion;
    }

    public Date getPromocionDesde() {
        return promocionDesde;
    }

    public void setPromocionDesde(Date promocionDesde) {
        this.promocionDesde = promocionDesde;
    }

    public Date getPromocionHasta() {
        return promocionHasta;
    }

    public void setPromocionHasta(Date promocionHasta) {
        this.promocionHasta = promocionHasta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean getEnVenta() {
        return enVenta;
    }

    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }

    public Boolean getDescuentoPorCantidad() {
        return descuentoPorCantidad;
    }

    public void setDescuentoPorCantidad(Boolean descuentoPorCantidad) {
        this.descuentoPorCantidad = descuentoPorCantidad;
    }

    public int getAlertaDeStock() {
        return alertaDeStock;
    }

    public void setAlertaDeStock(int alertaDeStock) {
        this.alertaDeStock = alertaDeStock;
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

    public boolean getMarkfordelete() {
        return markfordelete;
    }

    public void setMarkfordelete(boolean markfordelete) {
        this.markfordelete = markfordelete;
    }

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public List<Atributo> getAtributoList() {
        return atributoList;
    }

    public void setAtributoList(List<Atributo> atributoList) {
        this.atributoList = atributoList;
    }

    public ProductoCombo getProductoCombo() {
        return productoCombo;
    }

    public void setProductoCombo(ProductoCombo productoCombo) {
        this.productoCombo = productoCombo;
    }

    public List<ProductoOferta> getProductoOfertaList() {
        return productoOfertaList;
    }

    public void setProductoOfertaList(List<ProductoOferta> productoOfertaList) {
        this.productoOfertaList = productoOfertaList;
    }

    public Categoria getCategoriaDefaultId() {
        return categoriaDefaultId;
    }

    public void setCategoriaDefaultId(Categoria categoriaDefaultId) {
        this.categoriaDefaultId = categoriaDefaultId;
    }

    public Fabricante getFabricanteId() {
        return fabricanteId;
    }

    public void setFabricanteId(Fabricante fabricanteId) {
        this.fabricanteId = fabricanteId;
    }

    public Proveedor getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Proveedor proveedorId) {
        this.proveedorId = proveedorId;
    }

    public List<DetallePedido> getDetallePedidoList() {
        return detallePedidoList;
    }

    public void setDetallePedidoList(List<DetallePedido> detallePedidoList) {
        this.detallePedidoList = detallePedidoList;
    }

    public List<Imagen> getImagenList() {
        return imagenList;
    }

    public void setImagenList(List<Imagen> imagenList) {
        this.imagenList = imagenList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoId != null ? productoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.productoId == null && other.productoId != null) || (this.productoId != null && !this.productoId.equals(other.productoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Producto[ productoId=" + productoId + " ]";
    }
    
}
