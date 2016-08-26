//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.24 a las 01:04:04 PM CEST 
//


package com.jac.amazon.srcgen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Request"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TotalResults"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TotalPages"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}MoreSearchResultsUrl"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "totalResults",
    "totalPages",
    "moreSearchResultsUrl",
    "item"
})
@XmlRootElement(name = "Items")
public class Items {

    @XmlElement(name = "Request", required = true)
    protected Request request;
    @XmlElement(name = "TotalResults")
    protected short totalResults;
    @XmlElement(name = "TotalPages")
    protected short totalPages;
    @XmlElement(name = "MoreSearchResultsUrl", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String moreSearchResultsUrl;
    @XmlElement(name = "Item")
    protected List<Item> item;

    /**
     * Obtiene el valor de la propiedad request.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Define el valor de la propiedad request.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Obtiene el valor de la propiedad totalResults.
     * 
     */
    public short getTotalResults() {
        return totalResults;
    }

    /**
     * Define el valor de la propiedad totalResults.
     * 
     */
    public void setTotalResults(short value) {
        this.totalResults = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPages.
     * 
     */
    public short getTotalPages() {
        return totalPages;
    }

    /**
     * Define el valor de la propiedad totalPages.
     * 
     */
    public void setTotalPages(short value) {
        this.totalPages = value;
    }

    /**
     * Obtiene el valor de la propiedad moreSearchResultsUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreSearchResultsUrl() {
        return moreSearchResultsUrl;
    }

    /**
     * Define el valor de la propiedad moreSearchResultsUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreSearchResultsUrl(String value) {
        this.moreSearchResultsUrl = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

}
