//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.24 a las 01:02:21 PM CEST 
//


package com.jac.amazon.srcgen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LowestNewPrice"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LowestUsedPrice"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TotalNew"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TotalUsed"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TotalCollectible"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TotalRefurbished"/&gt;
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
    "lowestNewPrice",
    "lowestUsedPrice",
    "totalNew",
    "totalUsed",
    "totalCollectible",
    "totalRefurbished"
})
@XmlRootElement(name = "OfferSummary")
public class OfferSummary {

    @XmlElement(name = "LowestNewPrice", required = true)
    protected LowestNewPrice lowestNewPrice;
    @XmlElement(name = "LowestUsedPrice", required = true)
    protected LowestUsedPrice lowestUsedPrice;
    @XmlElement(name = "TotalNew")
    protected byte totalNew;
    @XmlElement(name = "TotalUsed")
    protected byte totalUsed;
    @XmlElement(name = "TotalCollectible")
    protected byte totalCollectible;
    @XmlElement(name = "TotalRefurbished")
    protected byte totalRefurbished;

    /**
     * Obtiene el valor de la propiedad lowestNewPrice.
     * 
     * @return
     *     possible object is
     *     {@link LowestNewPrice }
     *     
     */
    public LowestNewPrice getLowestNewPrice() {
        return lowestNewPrice;
    }

    /**
     * Define el valor de la propiedad lowestNewPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link LowestNewPrice }
     *     
     */
    public void setLowestNewPrice(LowestNewPrice value) {
        this.lowestNewPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad lowestUsedPrice.
     * 
     * @return
     *     possible object is
     *     {@link LowestUsedPrice }
     *     
     */
    public LowestUsedPrice getLowestUsedPrice() {
        return lowestUsedPrice;
    }

    /**
     * Define el valor de la propiedad lowestUsedPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link LowestUsedPrice }
     *     
     */
    public void setLowestUsedPrice(LowestUsedPrice value) {
        this.lowestUsedPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad totalNew.
     * 
     */
    public byte getTotalNew() {
        return totalNew;
    }

    /**
     * Define el valor de la propiedad totalNew.
     * 
     */
    public void setTotalNew(byte value) {
        this.totalNew = value;
    }

    /**
     * Obtiene el valor de la propiedad totalUsed.
     * 
     */
    public byte getTotalUsed() {
        return totalUsed;
    }

    /**
     * Define el valor de la propiedad totalUsed.
     * 
     */
    public void setTotalUsed(byte value) {
        this.totalUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCollectible.
     * 
     */
    public byte getTotalCollectible() {
        return totalCollectible;
    }

    /**
     * Define el valor de la propiedad totalCollectible.
     * 
     */
    public void setTotalCollectible(byte value) {
        this.totalCollectible = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRefurbished.
     * 
     */
    public byte getTotalRefurbished() {
        return totalRefurbished;
    }

    /**
     * Define el valor de la propiedad totalRefurbished.
     * 
     */
    public void setTotalRefurbished(byte value) {
        this.totalRefurbished = value;
    }

}
