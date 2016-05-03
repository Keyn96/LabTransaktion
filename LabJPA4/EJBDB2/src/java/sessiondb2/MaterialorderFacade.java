/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessiondb2;

import DB2.Materialorder;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author НР
 */
@Stateless
public class MaterialorderFacade extends AbstractFacade<Materialorder> {

    @PersistenceContext(unitName = "EJBDB2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public void flush() {
        em.flush();
    }

    public MaterialorderFacade() {
        super(Materialorder.class);
    }

    public void CreateAndException(Materialorder material)
    {
        em.persist(material);
        throw new EJBException("К нам приехал агент КГБ.");
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void CreateNotTransaktion(Materialorder material)
    {
        em.persist(material);
    }
    
    
}
