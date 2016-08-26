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
 * <p>Clase Java para OperationRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OperationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HTTPHeaders" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}HTTPHeadersType"/&gt;
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Arguments" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ArgumentsType"/&gt;
 *         &lt;element name="RequestProcessingTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationRequestType", propOrder = {
    "httpHeaders",
    "requestId",
    "arguments",
    "requestProcessingTime"
})
public class OperationRequestType {

    @XmlElement(name = "HTTPHeaders", required = true)
    protected HTTPHeadersType httpHeaders;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "Arguments", required = true)
    protected ArgumentsType arguments;
    @XmlElement(name = "RequestProcessingTime")
    protected float requestProcessingTime;

    /**
     * Obtiene el valor de la propiedad httpHeaders.
     * 
     * @return
     *     possible object is
     *     {@link HTTPHeadersType }
     *     
     */
    public HTTPHeadersType getHTTPHeaders() {
        return httpHeaders;
    }

    /**
     * Define el valor de la propiedad httpHeaders.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPHeadersType }
     *     
     */
    public void setHTTPHeaders(HTTPHeadersType value) {
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
     *     {@link ArgumentsType }
     *     
     */
    public ArgumentsType getArguments() {
        return arguments;
    }

    /**
     * Define el valor de la propiedad arguments.
     * 
     * @param value
     *     allowed object is
     *     {@link ArgumentsType }
     *     
     */
    public void setArguments(ArgumentsType value) {
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
