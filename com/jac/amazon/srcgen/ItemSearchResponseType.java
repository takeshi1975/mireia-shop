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
 * <p>Clase Java para ItemSearchResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemSearchResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationRequest" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OperationRequestType"/&gt;
 *         &lt;element name="Items" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearchResponseType", propOrder = {
    "operationRequest",
    "items"
})
public class ItemSearchResponseType {

    @XmlElement(name = "OperationRequest", required = true)
    protected OperationRequestType operationRequest;
    @XmlElement(name = "Items", required = true)
    protected ItemsType items;

    /**
     * Obtiene el valor de la propiedad operationRequest.
     * 
     * @return
     *     possible object is
     *     {@link OperationRequestType }
     *     
     */
    public OperationRequestType getOperationRequest() {
        return operationRequest;
    }

    /**
     * Define el valor de la propiedad operationRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationRequestType }
     *     
     */
    public void setOperationRequest(OperationRequestType value) {
        this.operationRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link ItemsType }
     *     
     */
    public ItemsType getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemsType }
     *     
     */
    public void setItems(ItemsType value) {
        this.items = value;
    }

}
