/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerardoortiz.Entity;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "cotizaciondetalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizaciondetalle.findAll", query = "SELECT c FROM Cotizaciondetalle c")
    , @NamedQuery(name = "Cotizaciondetalle.findByIdcotizaciondetalle", query = "SELECT c FROM Cotizaciondetalle c WHERE c.idcotizaciondetalle = :idcotizaciondetalle")
    , @NamedQuery(name = "Cotizaciondetalle.findByPreciofacturacion", query = "SELECT c FROM Cotizaciondetalle c WHERE c.preciofacturacion = :preciofacturacion")
    , @NamedQuery(name = "Cotizaciondetalle.findByPrecioventa", query = "SELECT c FROM Cotizaciondetalle c WHERE c.precioventa = :precioventa")})
public class Cotizaciondetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcotizaciondetalle")
    private Integer idcotizaciondetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "preciofacturacion")
    private BigDecimal preciofacturacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioventa")
    private BigDecimal precioventa;
    @JoinColumn(name = "idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne(optional = false)
    private Cotizacion idcotizacion;
    @JoinColumn(name = "idproductos", referencedColumnName = "idproductos")
    @ManyToOne(optional = false)
    private Productos idproductos;

    public Cotizaciondetalle() {
    }

    public Cotizaciondetalle(Integer idcotizaciondetalle) {
        this.idcotizaciondetalle = idcotizaciondetalle;
    }

    public Cotizaciondetalle(Integer idcotizaciondetalle, BigDecimal preciofacturacion, BigDecimal precioventa) {
        this.idcotizaciondetalle = idcotizaciondetalle;
        this.preciofacturacion = preciofacturacion;
        this.precioventa = precioventa;
    }

    public Integer getIdcotizaciondetalle() {
        return idcotizaciondetalle;
    }

    public void setIdcotizaciondetalle(Integer idcotizaciondetalle) {
        this.idcotizaciondetalle = idcotizaciondetalle;
    }

    public BigDecimal getPreciofacturacion() {
        return preciofacturacion;
    }

    public void setPreciofacturacion(BigDecimal preciofacturacion) {
        this.preciofacturacion = preciofacturacion;
    }

    public BigDecimal getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(BigDecimal precioventa) {
        this.precioventa = precioventa;
    }

    public Cotizacion getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Cotizacion idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public Productos getIdproductos() {
        return idproductos;
    }

    public void setIdproductos(Productos idproductos) {
        this.idproductos = idproductos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotizaciondetalle != null ? idcotizaciondetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizaciondetalle)) {
            return false;
        }
        Cotizaciondetalle other = (Cotizaciondetalle) object;
        if ((this.idcotizaciondetalle == null && other.idcotizaciondetalle != null) || (this.idcotizaciondetalle != null && !this.idcotizaciondetalle.equals(other.idcotizaciondetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gerardoortiz.Entity.Cotizaciondetalle[ idcotizaciondetalle=" + idcotizaciondetalle + " ]";
    }
    
}
