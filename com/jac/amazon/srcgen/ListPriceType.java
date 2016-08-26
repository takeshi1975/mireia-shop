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
 * <p>Clase Java para ListPriceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&gt;
 *               &lt;enumeration value="7999"/&gt;
 *               &lt;enumeration value="1299"/&gt;
 *               &lt;enumeration value="5999"/&gt;
 *               &lt;enumeration value="3499"/&gt;
 *               &lt;enumeration value="4999"/&gt;
 *               &lt;enumeration value="799"/&gt;
 *               &lt;enumeration value="17320"/&gt;
 *               &lt;enumeration value="3999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FormattedPrice"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="$79.99"/&gt;
 *               &lt;enumeration value="$12.99"/&gt;
 *               &lt;enumeration value="$59.99"/&gt;
 *               &lt;enumeration value="$34.99"/&gt;
 *               &lt;enumeration value="$49.99"/&gt;
 *               &lt;enumeration value="$7.99"/&gt;
 *               &lt;enumeration value="$173.20"/&gt;
 *               &lt;enumeration value="$39.99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListPriceType", propOrder = {
    "amount",
    "currencyCode",
    "formattedPrice"
})
public class ListPriceType {

    @XmlElement(name = "Amount")
    protected short amount;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "FormattedPrice", required = true)
    protected String formattedPrice;

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public short getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAmount(short value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define el valor de la propiedad currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad formattedPrice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedPrice() {
        return formattedPrice;
    }

    /**
     * Define el valor de la propiedad formattedPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedPrice(String value) {
        this.formattedPrice = value;
    }

}
