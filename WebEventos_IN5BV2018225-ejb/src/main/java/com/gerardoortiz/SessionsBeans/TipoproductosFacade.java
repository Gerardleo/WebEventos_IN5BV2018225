/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerardoortiz.SessionsBeans;

import com.gerardoortiz.Entity.Tipoproductos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class TipoproductosFacade extends AbstractFacade<Tipoproductos> implements TipoproductosFacadeLocal {

    @PersistenceContext(unitName = "WebEventos_IN5BV_2018225PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoproductosFacade() {
        super(Tipoproductos.class);
    }
    
}
