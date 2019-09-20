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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cotizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizacion.findAll", query = "SELECT c FROM Cotizacion c")
    , @NamedQuery(name = "Cotizacion.findByIdcotizacion", query = "SELECT c FROM Cotizacion c WHERE c.idcotizacion = :idcotizacion")
    , @NamedQuery(name = "Cotizacion.findByIdreservacion", query = "SELECT c FROM Cotizacion c WHERE c.idreservacion = :idreservacion")
    , @NamedQuery(name = "Cotizacion.findByFechacotizacion", query = "SELECT c FROM Cotizacion c WHERE c.fechacotizacion = :fechacotizacion")
    , @NamedQuery(name = "Cotizacion.findByFechavencimiento", query = "SELECT c FROM Cotizacion c WHERE c.fechavencimiento = :fechavencimiento")
    , @NamedQuery(name = "Cotizacion.findByNombrefacturazion", query = "SELECT c FROM Cotizacion c WHERE c.nombrefacturazion = :nombrefacturazion")
    , @NamedQuery(name = "Cotizacion.findByPrecio", query = "SELECT c FROM Cotizacion c WHERE c.precio = :precio")
    , @NamedQuery(name = "Cotizacion.findByFormaPago", query = "SELECT c FROM Cotizacion c WHERE c.formaPago = :formaPago")
    , @NamedQuery(name = "Cotizacion.findByDireccionfactura", query = "SELECT c FROM Cotizacion c WHERE c.direccionfactura = :direccionfactura")})
public class Cotizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcotizacion")
    private Integer idcotizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idreservacion")
    private int idreservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechacotizacion")
    @Temporal(TemporalType.DATE)
    private Date fechacotizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechavencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechavencimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombrefacturazion")
    private String nombrefacturazion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private BigDecimal precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "formaPago")
    private String formaPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccionfactura")
    private String direccionfactura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcotizacion")
    private List<Cotizaciondetalle> cotizaciondetalleList;
    @JoinColumn(name = "reservacion_idreservacion", referencedColumnName = "idreservacion")
    @ManyToOne(optional = false)
    private Reservacion reservacionIdreservacion;

    public Cotizacion() {
    }

    public Cotizacion(Integer idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public Cotizacion(Integer idcotizacion, int idreservacion, Date fechacotizacion, Date fechavencimiento, String nombrefacturazion, BigDecimal precio, String formaPago, String direccionfactura) {
        this.idcotizacion = idcotizacion;
        this.idreservacion = idreservacion;
        this.fechacotizacion = fechacotizacion;
        this.fechavencimiento = fechavencimiento;
        this.nombrefacturazion = nombrefacturazion;
        this.precio = precio;
        this.formaPago = formaPago;
        this.direccionfactura = direccionfactura;
    }

    public Integer getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Integer idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public int getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(int idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Date getFechacotizacion() {
        return fechacotizacion;
    }

    public void setFechacotizacion(Date fechacotizacion) {
        this.fechacotizacion = fechacotizacion;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public String getNombrefacturazion() {
        return nombrefacturazion;
    }

    public void setNombrefacturazion(String nombrefacturazion) {
        this.nombrefacturazion = nombrefacturazion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getDireccionfactura() {
        return direccionfactura;
    }

    public void setDireccionfactura(String direccionfactura) {
        this.direccionfactura = direccionfactura;
    }

    @XmlTransient
    public List<Cotizaciondetalle> getCotizaciondetalleList() {
        return cotizaciondetalleList;
    }

    public void setCotizaciondetalleList(List<Cotizaciondetalle> cotizaciondetalleList) {
        this.cotizaciondetalleList = cotizaciondetalleList;
    }

    public Reservacion getReservacionIdreservacion() {
        return reservacionIdreservacion;
    }

    public void setReservacionIdreservacion(Reservacion reservacionIdreservacion) {
        this.reservacionIdreservacion = reservacionIdreservacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotizacion != null ? idcotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizacion)) {
            return false;
        }
        Cotizacion other = (Cotizacion) object;
        if ((this.idcotizacion == null && other.idcotizacion != null) || (this.idcotizacion != null && !this.idcotizacion.equals(other.idcotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gerardoortiz.Entity.Cotizacion[ idcotizacion=" + idcotizacion + " ]";
    }
    
}
