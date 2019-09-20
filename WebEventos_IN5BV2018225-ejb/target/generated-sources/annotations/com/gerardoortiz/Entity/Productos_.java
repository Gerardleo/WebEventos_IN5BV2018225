package com.gerardoortiz.Entity;

import com.gerardoortiz.Entity.Cotizaciondetalle;
import com.gerardoortiz.Entity.Tipoproductos;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T12:54:51")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Integer> idproductos;
    public static volatile ListAttribute<Productos, Tipoproductos> tipoproductosList;
    public static volatile SingularAttribute<Productos, Integer> idcotizaciondetalle;
    public static volatile SingularAttribute<Productos, String> nombreproducto;
    public static volatile ListAttribute<Productos, Cotizaciondetalle> cotizaciondetalleList;
    public static volatile SingularAttribute<Productos, BigDecimal> precioventa;
    public static volatile SingularAttribute<Productos, Date> fechavencimiento;

}