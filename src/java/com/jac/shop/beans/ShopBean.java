package com.jac.shop.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.jac.amazon.Amazon;
import com.jac.amazon.srcgen.Item;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.xml.bind.JAXBException;
import org.apache.log4j.Logger;

/**
 *
 * @author juanjo
 */
@ManagedBean
@SessionScoped // RequestScoped // ViewScoped
public class ShopBean {

    private Logger log = Logger.getLogger(ShopBean.class);
    private String keywords;
    private int count=0;
    private List<Item> items;
    private List<String> links;
    private boolean showLinks = false;
    private int page = 1;
    /**
     * Creates a new instance of ShopBean
     */
    public ShopBean() {  
        links = new ArrayList<String>();  
        log.debug("ShopBean constructor");
        showLinks = false;
        if (links.size()==0)
                for (int i = 1; i<=5; i++)
                    links.add(String.valueOf(i));
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
    
    public boolean getShowLinks(){
        return this.showLinks;
    }
    
    public void setShowLinks(boolean showLinks){
        this.showLinks = showLinks;
    }
    
    public String testMethod(){
        return "shop.xhtml";
    }
    
    private String read(InputStream is){
        Scanner scanner = new Scanner(is).useDelimiter("\\A");
        return scanner.hasNext()?scanner.next():"";
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public List<String> getLinks() {
        return links;
    }    
    
    public String lookUp(){
        log.debug("Lookup call");
        String isbn=null;
        try{
            FacesContext facesContext = FacesContext.getCurrentInstance();
            Map<String,String> params = facesContext.getExternalContext().getRequestParameterMap();
            if (params.get("isbn")!=null)
                isbn = params.get("isbn");
            if (isbn!=null){
                Amazon amazon = new Amazon();
                amazon.performItemLookUp(isbn);
            }            
        }catch(NoSuchAlgorithmException ex){
            log.error(ex);
        } catch (InvalidKeyException ex) {
            log.error(ex);
        } catch (IOException ex) {
            log.error(ex);
        } catch (JAXBException ex) {
            log.error(ex);
        }
        log.debug("Ha finalizado la llamada a lookup call");
        log.debug("Se va a devolver la página de detalle");
        return "detail?isbn="+isbn;
    }
    
    public String find(){
        log.debug("Find call "+keywords);
        try{                        
            FacesContext facesContext = FacesContext.getCurrentInstance();
            Map<String,String> params = facesContext.getExternalContext().getRequestParameterMap();
            if (params.get("page")!=null)
                page = Integer.valueOf(params.get("page"));
            Amazon amazon = new Amazon();
            this.setItems(amazon.performItemSearch(keywords, page));            
            setShowLinks(getItems().size()>=10); 
            log.info(" Page ->"+page);
            log.info(" ShowLinks ->"+getShowLinks());            
            this.count=this.getItems().size();
            for (Item item:this.getItems())
                log.info(item.getItemAttributes().getTitle());                            
            System.out.println("find ok");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "shop";
    }
    
    public void test(){
        try {
            URL url = new URL("http://127.0.0.1");            
            HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
            if (httpConnection.getResponseCode()==HttpURLConnection.HTTP_OK){                            
                System.out.println(read(httpConnection.getInputStream()));            
            } else {                
                System.out.println(read(httpConnection.getErrorStream()));            
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }        
    }    
    
}
