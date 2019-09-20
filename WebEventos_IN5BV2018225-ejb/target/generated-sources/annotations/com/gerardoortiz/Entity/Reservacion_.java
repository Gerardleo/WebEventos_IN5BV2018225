package com.gerardoortiz.Entity;

import com.gerardoortiz.Entity.Cliente;
import com.gerardoortiz.Entity.Cotizacion;
import com.gerardoortiz.Entity.Tipoevento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T12:54:51")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, Date> horafin;
    public static volatile ListAttribute<Reservacion, Cotizacion> cotizacionList;
    public static volatile SingularAttribute<Reservacion, String> lugarReservacion;
    public static volatile SingularAttribute<Reservacion, Date> horainicio;
    public static volatile SingularAttribute<Reservacion, Integer> idreservacion;
    public static volatile SingularAttribute<Reservacion, Cliente> idcliente;
    public static volatile SingularAttribute<Reservacion, Integer> idtipoevento;
    public static volatile SingularAttribute<Reservacion, Tipoevento> tipoevento;
    public static volatile SingularAttribute<Reservacion, String> salon;

}