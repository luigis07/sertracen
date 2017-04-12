/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Esquela;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LuisAlejandro
 */
@Stateless
public class EsquelaFacade extends AbstractFacade<Esquela> {
    @PersistenceContext(unitName = "SertracenPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EsquelaFacade() {
        super(Esquela.class);
    }
    
}
