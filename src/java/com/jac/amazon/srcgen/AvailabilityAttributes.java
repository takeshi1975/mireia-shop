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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}AvailabilityType"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}MinimumHours"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}MaximumHours"/&gt;
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
    "availabilityType",
    "minimumHours",
    "maximumHours"
})
@XmlRootElement(name = "AvailabilityAttributes")
public class AvailabilityAttributes {

    @XmlElement(name = "AvailabilityType", required = true)
    protected String availabilityType;
    @XmlElement(name = "MinimumHours")
    protected byte minimumHours;
    @XmlElement(name = "MaximumHours")
    protected byte maximumHours;

    /**
     * Obtiene el valor de la propiedad availabilityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityType() {
        return availabilityType;
    }

    /**
     * Define el valor de la propiedad availabilityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityType(String value) {
        this.availabilityType = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumHours.
     * 
     */
    public byte getMinimumHours() {
        return minimumHours;
    }

    /**
     * Define el valor de la propiedad minimumHours.
     * 
     */
    public void setMinimumHours(byte value) {
        this.minimumHours = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumHours.
     * 
     */
    public byte getMaximumHours() {
        return maximumHours;
    }

    /**
     * Define el valor de la propiedad maximumHours.
     * 
     */
    public void setMaximumHours(byte value) {
        this.maximumHours = value;
    }

}
