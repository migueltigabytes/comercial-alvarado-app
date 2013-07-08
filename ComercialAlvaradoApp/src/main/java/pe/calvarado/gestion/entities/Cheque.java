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
@Table(name = "cheque")
@NamedQueries({
    @NamedQuery(name = "Cheque.findAll", query = "SELECT c FROM Cheque c")})
public class Cheque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cheque_id")
    private Integer chequeId;
    @Column(name = "banco")
    private String banco;
    @Column(name = "nro_de_cheque")
    private String nroDeCheque;
    @Column(name = "codigo_seguridad")
    private String codigoSeguridad;
    @Column(name = "fecha_vencimiento")
    private String fechaVencimiento;
    @JoinColumn(name = "liquidacion_cliente_id", referencedColumnName = "liquidacion_cliente_id")
    @ManyToOne(optional = false)
    private LiquidacionCliente liquidacionClienteId;

    public Cheque() {
    }

    public Cheque(Integer chequeId) {
        this.chequeId = chequeId;
    }

    public Integer getChequeId() {
        return chequeId;
    }

    public void setChequeId(Integer chequeId) {
        this.chequeId = chequeId;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNroDeCheque() {
        return nroDeCheque;
    }

    public void setNroDeCheque(String nroDeCheque) {
        this.nroDeCheque = nroDeCheque;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LiquidacionCliente getLiquidacionClienteId() {
        return liquidacionClienteId;
    }

    public void setLiquidacionClienteId(LiquidacionCliente liquidacionClienteId) {
        this.liquidacionClienteId = liquidacionClienteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chequeId != null ? chequeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cheque)) {
            return false;
        }
        Cheque other = (Cheque) object;
        if ((this.chequeId == null && other.chequeId != null) || (this.chequeId != null && !this.chequeId.equals(other.chequeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.calvarado.gestion.entities.Cheque[ chequeId=" + chequeId + " ]";
    }
    
}
