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
 * <p>Clase Java para AvailabilityAttributesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailabilityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MinimumHours"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaximumHours"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="24"/&gt;
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
@XmlType(name = "AvailabilityAttributesType", propOrder = {
    "availabilityType",
    "minimumHours",
    "maximumHours"
})
public class AvailabilityAttributesType {

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
