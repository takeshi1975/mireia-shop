/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jac.shop.beans;

import com.jac.amazon.Amazon;
import com.jac.amazon.product.Product;
import java.io.IOException;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.xml.bind.JAXBException;
import org.apache.log4j.Logger;

/**
 *
 * @author juanjo
 */
@RequestScoped
@FacesConverter("com.jac.shop.beans.ProductConverter")
public class ProductConverter implements Converter{
    
    private Amazon amazon;
    private Logger log = Logger.getLogger(ProductConverter.class);
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {        
        log.info("Estoy en el conversor clave-->"+value);
        if (value == null || value.isEmpty()) {
            log.error("No tenemos una clave para el producto");
            return null;
        }
        try {  
            if (amazon == null)
                amazon = new Amazon();
            return amazon.performItemLookUp(value);
        } catch(JAXBException ex){
            throw new RuntimeException("No se ha parsear el XML", ex);
        } catch(IOException ioex){
            throw new RuntimeException("No se ha podido conectar con el servicio", ioex);
        } catch (NumberFormatException e) {
            throw new ConverterException("The value is not a valid Product ID: " + value, e);
        } catch(Exception ex){
            throw new RuntimeException("Error no controlado",ex);
        }
    }

    @Override    
    public String getAsString(FacesContext context, UIComponent component, Object value) {        
        log.info("Estoy en el conversor clave 2-->"+value);
        if (value == null) {
            return "";
        }

        if (value instanceof Product) {
            String id = ((Product) value).getId();
            return id;
        } else {
            throw new ConverterException("The value is not a valid Product instance: " + value);
        }
    }
}
