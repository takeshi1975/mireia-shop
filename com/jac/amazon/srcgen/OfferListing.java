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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OfferListingId"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Price"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}AmountSaved" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}PercentageSaved" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Availability"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}AvailabilityAttributes"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}IsEligibleForSuperSaverShipping"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}IsEligibleForPrime"/&gt;
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
    "offerListingId",
    "price",
    "amountSaved",
    "percentageSaved",
    "availability",
    "availabilityAttributes",
    "isEligibleForSuperSaverShipping",
    "isEligibleForPrime"
})
@XmlRootElement(name = "OfferListing")
public class OfferListing {

    @XmlElement(name = "OfferListingId", required = true)
    protected String offerListingId;
    @XmlElement(name = "Price", required = true)
    protected Price price;
    @XmlElement(name = "AmountSaved")
    protected AmountSaved amountSaved;
    @XmlElement(name = "PercentageSaved")
    protected Byte percentageSaved;
    @XmlElement(name = "Availability", required = true)
    protected String availability;
    @XmlElement(name = "AvailabilityAttributes", required = true)
    protected AvailabilityAttributes availabilityAttributes;
    @XmlElement(name = "IsEligibleForSuperSaverShipping")
    protected byte isEligibleForSuperSaverShipping;
    @XmlElement(name = "IsEligibleForPrime")
    protected byte isEligibleForPrime;

    /**
     * Obtiene el valor de la propiedad offerListingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferListingId() {
        return offerListingId;
    }

    /**
     * Define el valor de la propiedad offerListingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferListingId(String value) {
        this.offerListingId = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad amountSaved.
     * 
     * @return
     *     possible object is
     *     {@link AmountSaved }
     *     
     */
    public AmountSaved getAmountSaved() {
        return amountSaved;
    }

    /**
     * Define el valor de la propiedad amountSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountSaved }
     *     
     */
    public void setAmountSaved(AmountSaved value) {
        this.amountSaved = value;
    }

    /**
     * Obtiene el valor de la propiedad percentageSaved.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPercentageSaved() {
        return percentageSaved;
    }

    /**
     * Define el valor de la propiedad percentageSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPercentageSaved(Byte value) {
        this.percentageSaved = value;
    }

    /**
     * Obtiene el valor de la propiedad availability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Define el valor de la propiedad availability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Obtiene el valor de la propiedad availabilityAttributes.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityAttributes }
     *     
     */
    public AvailabilityAttributes getAvailabilityAttributes() {
        return availabilityAttributes;
    }

    /**
     * Define el valor de la propiedad availabilityAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityAttributes }
     *     
     */
    public void setAvailabilityAttributes(AvailabilityAttributes value) {
        this.availabilityAttributes = value;
    }

    /**
     * Obtiene el valor de la propiedad isEligibleForSuperSaverShipping.
     * 
     */
    public byte getIsEligibleForSuperSaverShipping() {
        return isEligibleForSuperSaverShipping;
    }

    /**
     * Define el valor de la propiedad isEligibleForSuperSaverShipping.
     * 
     */
    public void setIsEligibleForSuperSaverShipping(byte value) {
        this.isEligibleForSuperSaverShipping = value;
    }

    /**
     * Obtiene el valor de la propiedad isEligibleForPrime.
     * 
     */
    public byte getIsEligibleForPrime() {
        return isEligibleForPrime;
    }

    /**
     * Define el valor de la propiedad isEligibleForPrime.
     * 
     */
    public void setIsEligibleForPrime(byte value) {
        this.isEligibleForPrime = value;
    }

}
