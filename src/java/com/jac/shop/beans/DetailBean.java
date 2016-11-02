/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jac.shop.beans;

import com.jac.amazon.product.Product;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.apache.log4j.Logger;

/**
 *
 * @author juanjo
 */

@ManagedBean
@RequestScoped
public class DetailBean {
    
    private Product product;
    private Logger log = Logger.getLogger(DetailBean.class);
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }        
    
    @PostConstruct
    public void load(){
        log.info("Load de Detail Bean");
    }    
    
}
