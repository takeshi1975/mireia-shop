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
 * <p>Clase Java para RequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemSearchRequest" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemSearchRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "isValid",
    "itemSearchRequest"
})
public class RequestType {

    @XmlElement(name = "IsValid", required = true)
    protected String isValid;
    @XmlElement(name = "ItemSearchRequest", required = true)
    protected ItemSearchRequestType itemSearchRequest;

    /**
     * Obtiene el valor de la propiedad isValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * Define el valor de la propiedad isValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsValid(String value) {
        this.isValid = value;
    }

    /**
     * Obtiene el valor de la propiedad itemSearchRequest.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRequestType }
     *     
     */
    public ItemSearchRequestType getItemSearchRequest() {
        return itemSearchRequest;
    }

    /**
     * Define el valor de la propiedad itemSearchRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRequestType }
     *     
     */
    public void setItemSearchRequest(ItemSearchRequestType value) {
        this.itemSearchRequest = value;
    }

}
