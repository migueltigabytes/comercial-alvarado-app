/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.entities;

import java.io.Serializable;
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
@Table(name = "imagen")
@NamedQueries({
    @NamedQuery(name = "Imagen.findAll", query = "SELECT i FROM Imagen i")})
public class Imagen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "imagen_id")
    private Integer imagenId;
    @Basic(optional = false)
    @Column(name = "nombre")
    private int nombre;
    @Basic(optional = false)
    @Column(name = "alto")
    private int alto;
    @Basic(optional = false)
    @Column(name = "ancho")
    private int ancho;
    @Basic(optional = false)
    @Column(name = "ruta_imagen")
    private String rutaImagen;
    @Basic(optional = false)
    @Column(name = "MARKFORDELETE")
    private boolean markfordelete;
    @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")
    @ManyToOne(optional = false)
    private Producto productoId;

    public Imagen() {
    }

    public Imagen(Integer imagenId) {
        this.imagenId = imagenId;
    }

    public Imagen(Integer imagenId, int nombre, int alto, int ancho, String rutaImagen, boolean markfordelete) {
        this.imagenId = imagenId;
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.rutaImagen = rutaImagen;
        this.markfordelete = markfordelete;
    }

    public Integer getImagenId() {
        return imagenId;
    }

    public void setImagenId(Integer imagenId) {
        this.imagenId = imagenId;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imagenId != null ? imagenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imagen)) {
            return false;
        }
        Imagen other = (Imagen) object;
        if ((this.imagenId == null && other.imagenId != null) || (this.imagenId != null && !this.imagenId.equals(other.imagenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Imagen[ imagenId=" + imagenId + " ]";
    }
    
}
