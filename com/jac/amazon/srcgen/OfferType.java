//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.24 a las 12:56:14 PM CEST 
//


package com.jac.amazon.srcgen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OfferType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferAttributes" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OfferAttributesType"/&gt;
 *         &lt;element name="OfferListing" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OfferListingType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", propOrder = {
    "offerAttributes",
    "offerListing"
})
public class OfferType {

    @XmlElement(name = "OfferAttributes", required = true)
    protected OfferAttributesType offerAttributes;
    @XmlElement(name = "OfferListing", required = true)
    protected OfferListingType offerListing;

    /**
     * Obtiene el valor de la propiedad offerAttributes.
     * 
     * @return
     *     possible object is
     *     {@link OfferAttributesType }
     *     
     */
    public OfferAttributesType getOfferAttributes() {
        return offerAttributes;
    }

    /**
     * Define el valor de la propiedad offerAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAttributesType }
     *     
     */
    public void setOfferAttributes(OfferAttributesType value) {
        this.offerAttributes = value;
    }

    /**
     * Obtiene el valor de la propiedad offerListing.
     * 
     * @return
     *     possible object is
     *     {@link OfferListingType }
     *     
     */
    public OfferListingType getOfferListing() {
        return offerListing;
    }

    /**
     * Define el valor de la propiedad offerListing.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferListingType }
     *     
     */
    public void setOfferListing(OfferListingType value) {
        this.offerListing = value;
    }

}
