package com.gerardoortiz.Entity;

import com.gerardoortiz.Entity.Cotizacion;
import com.gerardoortiz.Entity.Productos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T12:54:51")
@StaticMetamodel(Cotizaciondetalle.class)
public class Cotizaciondetalle_ { 

    public static volatile SingularAttribute<Cotizaciondetalle, Productos> idproductos;
    public static volatile SingularAttribute<Cotizaciondetalle, Integer> idcotizaciondetalle;
    public static volatile SingularAttribute<Cotizaciondetalle, Cotizacion> idcotizacion;
    public static volatile SingularAttribute<Cotizaciondetalle, BigDecimal> precioventa;
    public static volatile SingularAttribute<Cotizaciondetalle, BigDecimal> preciofacturacion;

}