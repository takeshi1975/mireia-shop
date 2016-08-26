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
 * <p>Clase Java para OfferSummaryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfferSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LowestNewPrice" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LowestNewPriceType"/&gt;
 *         &lt;element name="LowestUsedPrice" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LowestUsedPriceType"/&gt;
 *         &lt;element name="TotalNew"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="55"/&gt;
 *               &lt;enumeration value="17"/&gt;
 *               &lt;enumeration value="39"/&gt;
 *               &lt;enumeration value="28"/&gt;
 *               &lt;enumeration value="47"/&gt;
 *               &lt;enumeration value="19"/&gt;
 *               &lt;enumeration value="36"/&gt;
 *               &lt;enumeration value="50"/&gt;
 *               &lt;enumeration value="59"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalUsed"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="53"/&gt;
 *               &lt;enumeration value="5"/&gt;
 *               &lt;enumeration value="42"/&gt;
 *               &lt;enumeration value="26"/&gt;
 *               &lt;enumeration value="29"/&gt;
 *               &lt;enumeration value="9"/&gt;
 *               &lt;enumeration value="17"/&gt;
 *               &lt;enumeration value="50"/&gt;
 *               &lt;enumeration value="21"/&gt;
 *               &lt;enumeration value="61"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalCollectible" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="TotalRefurbished" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferSummaryType", propOrder = {
    "lowestNewPrice",
    "lowestUsedPrice",
    "totalNew",
    "totalUsed",
    "totalCollectible",
    "totalRefurbished"
})
public class OfferSummaryType {

    @XmlElement(name = "LowestNewPrice", required = true)
    protected LowestNewPriceType lowestNewPrice;
    @XmlElement(name = "LowestUsedPrice", required = true)
    protected LowestUsedPriceType lowestUsedPrice;
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
     *     {@link LowestNewPriceType }
     *     
     */
    public LowestNewPriceType getLowestNewPrice() {
        return lowestNewPrice;
    }

    /**
     * Define el valor de la propiedad lowestNewPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link LowestNewPriceType }
     *     
     */
    public void setLowestNewPrice(LowestNewPriceType value) {
        this.lowestNewPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad lowestUsedPrice.
     * 
     * @return
     *     possible object is
     *     {@link LowestUsedPriceType }
     *     
     */
    public LowestUsedPriceType getLowestUsedPrice() {
        return lowestUsedPrice;
    }

    /**
     * Define el valor de la propiedad lowestUsedPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link LowestUsedPriceType }
     *     
     */
    public void setLowestUsedPrice(LowestUsedPriceType value) {
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
