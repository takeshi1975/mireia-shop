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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}HTTPHeaders"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}RequestId"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Arguments"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}RequestProcessingTime"/&gt;
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
    "httpHeaders",
    "requestId",
    "arguments",
    "requestProcessingTime"
})
@XmlRootElement(name = "OperationRequest")
public class OperationRequest {

    @XmlElement(name = "HTTPHeaders", required = true)
    protected HTTPHeaders httpHeaders;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "Arguments", required = true)
    protected Arguments arguments;
    @XmlElement(name = "RequestProcessingTime")
    protected float requestProcessingTime;

    /**
     * Obtiene el valor de la propiedad httpHeaders.
     * 
     * @return
     *     possible object is
     *     {@link HTTPHeaders }
     *     
     */
    public HTTPHeaders getHTTPHeaders() {
        return httpHeaders;
    }

    /**
     * Define el valor de la propiedad httpHeaders.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPHeaders }
     *     
     */
    public void setHTTPHeaders(HTTPHeaders value) {
        this.httpHeaders = value;
    }

    /**
     * Obtiene el valor de la propiedad requestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Define el valor de la propiedad requestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Obtiene el valor de la propiedad arguments.
     * 
     * @return
     *     possible object is
     *     {@link Arguments }
     *     
     */
    public Arguments getArguments() {
        return arguments;
    }

    /**
     * Define el valor de la propiedad arguments.
     * 
     * @param value
     *     allowed object is
     *     {@link Arguments }
     *     
     */
    public void setArguments(Arguments value) {
        this.arguments = value;
    }

    /**
     * Obtiene el valor de la propiedad requestProcessingTime.
     * 
     */
    public float getRequestProcessingTime() {
        return requestProcessingTime;
    }

    /**
     * Define el valor de la propiedad requestProcessingTime.
     * 
     */
    public void setRequestProcessingTime(float value) {
        this.requestProcessingTime = value;
    }

}
