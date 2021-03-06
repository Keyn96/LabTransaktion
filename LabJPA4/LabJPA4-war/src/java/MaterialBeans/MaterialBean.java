/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaterialBeans;

import dao.MaterialDAO;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import model.Material;

/**
 *
 * @author НР
 */
@Named(value = "materialBean")
@RequestScoped
public class MaterialBean {

    @EJB
    private MaterialDAO matDao;
    
    @EJB
    private TransactBean transactBean;
    private Material material;

    @PostConstruct
    private void initializeBean()
    {
        material=new Material();
    }
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
    /**
     * Creates a new instance of MaterialBean
     */
    public MaterialBean() {
    }
    public List<Material> getAll() throws Exception
    {
        return matDao.getAll();
    }
    public Material getMaterial(int id)
    {
        return matDao.selectMaterial(id);
    }
    public String addMaterial()
    {
        matDao.insertMaterial(material);
        return "/material/List.xhtml";
    }
    public String deleteMaterial(int id)
    {
        matDao.deleteMaterial(id);
        return "/material/List.xhtml";
    }
    public String updateMaterial()
    {
        matDao.updateMaterial(material);
        return "/material/List.xhtml";
    }
    public String exp1(){
        this.transactBean.exp1();
        return "/material/List";
    }
    public String exp2(){
        this.transactBean.exp2();
        return "/material/List";
    }
    public String exp3(){
        this.transactBean.exp3();
        return "/material/List";
    }
    public String exp4(){
        this.transactBean.exp4();
        return "/material/List";
    }
    public String exp5(){
        
        return "/material/List";
    }
}
