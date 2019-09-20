package com.gerardoortiz.Entity;

import com.gerardoortiz.Entity.Cotizaciondetalle;
import com.gerardoortiz.Entity.Reservacion;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T12:54:51")
@StaticMetamodel(Cotizacion.class)
public class Cotizacion_ { 

    public static volatile SingularAttribute<Cotizacion, BigDecimal> precio;
    public static volatile SingularAttribute<Cotizacion, String> direccionfactura;
    public static volatile SingularAttribute<Cotizacion, Date> fechacotizacion;
    public static volatile SingularAttribute<Cotizacion, Reservacion> reservacionIdreservacion;
    public static volatile SingularAttribute<Cotizacion, Integer> idcotizacion;
    public static volatile ListAttribute<Cotizacion, Cotizaciondetalle> cotizaciondetalleList;
    public static volatile SingularAttribute<Cotizacion, Date> fechavencimiento;
    public static volatile SingularAttribute<Cotizacion, String> formaPago;
    public static volatile SingularAttribute<Cotizacion, Integer> idreservacion;
    public static volatile SingularAttribute<Cotizacion, String> nombrefacturazion;

}