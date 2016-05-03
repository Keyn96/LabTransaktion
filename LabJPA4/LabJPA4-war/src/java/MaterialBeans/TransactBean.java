/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaterialBeans;

import DB2.Materialorder;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import model.Material;
import session.MaterialFacade;
import sessiondb2.MaterialorderFacade;

/**
 *
 * @author НР
 */

@Stateless
public class TransactBean implements Serializable {

    @EJB
    private MaterialorderFacade materialorderFacade;

    @EJB
    MaterialFacade materialFacade;
    
    
    
    /**
     * Creates a new instance of TransactBean
     */
    public TransactBean() {        
    }

    
    public Material construnctMaterialDB1()
    {
        Material mat=new Material();
        mat.setName("Лес");
        mat.setManufacturer("Лесопилка");
        mat.setCost(150000);
        mat.setQuantity(16);
        mat.setWeight(150);
       return mat;
    }
    public Materialorder construnctMaterialDB2()
    {
        Materialorder mat=new Materialorder();
        mat.setName("Лес");
        mat.setCost(150000);
        mat.setQuantity(16);
        return mat;
    }

    public void exp1() {
        Material mat = construnctMaterialDB1();
        Materialorder material = construnctMaterialDB2();
        materialFacade.create(mat);
        materialFacade.flush();
        materialorderFacade.create(material);

    }
    public void exp2() {
        Material mat = construnctMaterialDB1();
        Materialorder material = construnctMaterialDB2();
        materialorderFacade.create(material);
        materialorderFacade.flush();
        materialFacade.CreateAndBack(mat);

    }
    public void exp3() {
        Material mat = construnctMaterialDB1();
        Materialorder material = construnctMaterialDB2();
        materialorderFacade.CreateAndException(material);
        materialorderFacade.flush();
        materialFacade.create(mat);
    }
    public void exp4() {
        Material mat = construnctMaterialDB1();
        Materialorder material = construnctMaterialDB2();
        materialorderFacade.CreateNotTransaktion(material);
        materialorderFacade.flush();
        materialFacade.CreateAndBack(mat);
    }
    public void exp5() {
        Material mat = construnctMaterialDB1();
        Materialorder material = construnctMaterialDB2();
        materialorderFacade.CreateAndException(material);
        materialorderFacade.flush();
        materialFacade.CreateNewTransaktion(mat);

    }
    
    
}
