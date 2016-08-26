package com.jac.shop.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jac.amazon.Amazon;
import com.jac.amazon.srcgen.Item;
import com.jac.amazon.srcgen.ItemSearchResponse;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.apache.log4j.Logger;

/**
 *
 * @author juanjo
 */
@ManagedBean
@RequestScoped
public class ShopBean {
    
    private Logger log = Logger.getLogger(ShopBean.class);
    private String keywords;
    private int count=0;
    private List<Item> items;
    
    /**
     * Creates a new instance of ShopBean
     */
    public ShopBean() {     
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }        
    
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }        

    public int getCount() {
        return count;
    }    
    
    public void setCount(int count) {
        this.count = count;
    }        

        
    
    public String testMethod(){
        return "shop.xhtml";
    }
    
    public void find(){
        log.debug("Find call "+keywords);
        try{
            Amazon amazon = new Amazon();
            this.setItems(amazon.send(keywords));
            this.count=this.getItems().size();
            for (Item item:this.getItems()){
                log.info(item.getItemAttributes().getTitle());                
            }
            System.out.println("find ok");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    
    
}
