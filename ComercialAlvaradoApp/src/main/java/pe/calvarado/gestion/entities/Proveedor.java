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
@Table(name = "proveedor")
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p")})
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "proveedor_id")
    private Integer proveedorId;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "razon_social")
    private String razonSocial;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fax")
    private String fax;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;
    @Column(name = "nextel")
    private String nextel;
    @Column(name = "email")
    private String email;
    @Column(name = "web")
    private String web;
    @Basic(optional = false)
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "referencia")
    private String referencia;
    @Basic(optional = false)
    @Column(name = "MARKFORDELETE")
    private boolean markfordelete;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedorId")
    private List<Contacto> contactoList;
    @OneToMany(mappedBy = "proveedorId")
    private List<Producto> productoList;
    @JoinColumn(name = "ubigeo_id", referencedColumnName = "ubigeo_id")
    @ManyToOne(optional = false)
    private Ubigeo ubigeoId;

    public Proveedor() {
    }

    public Proveedor(Integer proveedorId) {
        this.proveedorId = proveedorId;
    }

    public Proveedor(Integer proveedorId, String nombre, String razonSocial, String direccion, String telefono, String celular, String ruc, boolean markfordelete) {
        this.proveedorId = proveedorId;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.ruc = ruc;
        this.markfordelete = markfordelete;
    }

    public Integer getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Integer proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public boolean getMarkfordelete() {
        return markfordelete;
    }

    public void setMarkfordelete(boolean markfordelete) {
        this.markfordelete = markfordelete;
    }

    public List<Contacto> getContactoList() {
        return contactoList;
    }

    public void setContactoList(List<Contacto> contactoList) {
        this.contactoList = contactoList;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public Ubigeo getUbigeoId() {
        return ubigeoId;
    }

    public void setUbigeoId(Ubigeo ubigeoId) {
        this.ubigeoId = ubigeoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proveedorId != null ? proveedorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.proveedorId == null && other.proveedorId != null) || (this.proveedorId != null && !this.proveedorId.equals(other.proveedorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
}
