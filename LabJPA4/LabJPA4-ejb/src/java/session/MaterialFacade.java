/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Material;

/**
 *
 * @author НР
 */
@Stateless
public class MaterialFacade extends AbstractFacade<Material> {

    @PersistenceContext(unitName = "LabJPA4-ejbPU")
    private EntityManager em;

    @Resource
    private SessionContext sessionContext;
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    public void flush()
    {
        em.flush();
    }
    
    public MaterialFacade() {
        super(Material.class);
    }
    public void CreateAndBack(Material material)
    {
        em.persist(material);
        sessionContext.setRollbackOnly();
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void CreateNewTransaktion(Material material)
    {
        em.persist(material);
    }
    
}
