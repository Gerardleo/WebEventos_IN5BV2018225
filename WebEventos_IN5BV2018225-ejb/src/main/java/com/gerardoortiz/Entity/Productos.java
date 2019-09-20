/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerardoortiz.Entity;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByIdproductos", query = "SELECT p FROM Productos p WHERE p.idproductos = :idproductos")
    , @NamedQuery(name = "Productos.findByIdcotizaciondetalle", query = "SELECT p FROM Productos p WHERE p.idcotizaciondetalle = :idcotizaciondetalle")
    , @NamedQuery(name = "Productos.findByNombreproducto", query = "SELECT p FROM Productos p WHERE p.nombreproducto = :nombreproducto")
    , @NamedQuery(name = "Productos.findByPrecioventa", query = "SELECT p FROM Productos p WHERE p.precioventa = :precioventa")
    , @NamedQuery(name = "Productos.findByFechavencimiento", query = "SELECT p FROM Productos p WHERE p.fechavencimiento = :fechavencimiento")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproductos")
    private Integer idproductos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcotizaciondetalle")
    private int idcotizaciondetalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreproducto")
    private String nombreproducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioventa")
    private BigDecimal precioventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechavencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechavencimiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproductos")
    private List<Cotizaciondetalle> cotizaciondetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproductos")
    private List<Tipoproductos> tipoproductosList;

    public Productos() {
    }

    public Productos(Integer idproductos) {
        this.idproductos = idproductos;
    }

    public Productos(Integer idproductos, int idcotizaciondetalle, String nombreproducto, BigDecimal precioventa, Date fechavencimiento) {
        this.idproductos = idproductos;
        this.idcotizaciondetalle = idcotizaciondetalle;
        this.nombreproducto = nombreproducto;
        this.precioventa = precioventa;
        this.fechavencimiento = fechavencimiento;
    }

    public Integer getIdproductos() {
        return idproductos;
    }

    public void setIdproductos(Integer idproductos) {
        this.idproductos = idproductos;
    }

    public int getIdcotizaciondetalle() {
        return idcotizaciondetalle;
    }

    public void setIdcotizaciondetalle(int idcotizaciondetalle) {
        this.idcotizaciondetalle = idcotizaciondetalle;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public BigDecimal getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(BigDecimal precioventa) {
        this.precioventa = precioventa;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    @XmlTransient
    public List<Cotizaciondetalle> getCotizaciondetalleList() {
        return cotizaciondetalleList;
    }

    public void setCotizaciondetalleList(List<Cotizaciondetalle> cotizaciondetalleList) {
        this.cotizaciondetalleList = cotizaciondetalleList;
    }

    @XmlTransient
    public List<Tipoproductos> getTipoproductosList() {
        return tipoproductosList;
    }

    public void setTipoproductosList(List<Tipoproductos> tipoproductosList) {
        this.tipoproductosList = tipoproductosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproductos != null ? idproductos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idproductos == null && other.idproductos != null) || (this.idproductos != null && !this.idproductos.equals(other.idproductos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gerardoortiz.Entity.Productos[ idproductos=" + idproductos + " ]";
    }
    
}
