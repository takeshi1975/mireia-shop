//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.24 a las 01:04:04 PM CEST 
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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TotalOffers"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TotalOfferPages"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}MoreOffersUrl"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Offer"/&gt;
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
    "totalOffers",
    "totalOfferPages",
    "moreOffersUrl",
    "offer"
})
@XmlRootElement(name = "Offers")
public class Offers {

    @XmlElement(name = "TotalOffers")
    protected byte totalOffers;
    @XmlElement(name = "TotalOfferPages")
    protected byte totalOfferPages;
    @XmlElement(name = "MoreOffersUrl", required = true)
    protected String moreOffersUrl;
    @XmlElement(name = "Offer", required = true)
    protected Offer offer;

    /**
     * Obtiene el valor de la propiedad totalOffers.
     * 
     */
    public byte getTotalOffers() {
        return totalOffers;
    }

    /**
     * Define el valor de la propiedad totalOffers.
     * 
     */
    public void setTotalOffers(byte value) {
        this.totalOffers = value;
    }

    /**
     * Obtiene el valor de la propiedad totalOfferPages.
     * 
     */
    public byte getTotalOfferPages() {
        return totalOfferPages;
    }

    /**
     * Define el valor de la propiedad totalOfferPages.
     * 
     */
    public void setTotalOfferPages(byte value) {
        this.totalOfferPages = value;
    }

    /**
     * Obtiene el valor de la propiedad moreOffersUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreOffersUrl() {
        return moreOffersUrl;
    }

    /**
     * Define el valor de la propiedad moreOffersUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreOffersUrl(String value) {
        this.moreOffersUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad offer.
     * 
     * @return
     *     possible object is
     *     {@link Offer }
     *     
     */
    public Offer getOffer() {
        return offer;
    }

    /**
     * Define el valor de la propiedad offer.
     * 
     * @param value
     *     allowed object is
     *     {@link Offer }
     *     
     */
    public void setOffer(Offer value) {
        this.offer = value;
    }

}
