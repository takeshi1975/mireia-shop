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
 * <p>Clase Java para ItemDimensionsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemDimensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}HeightType"/&gt;
 *         &lt;element name="Length" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LengthType"/&gt;
 *         &lt;element name="Weight" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}WeightType"/&gt;
 *         &lt;element name="Width" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}WidthType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDimensionsType", propOrder = {
    "height",
    "length",
    "weight",
    "width"
})
public class ItemDimensionsType {

    @XmlElement(name = "Height", required = true)
    protected HeightType height;
    @XmlElement(name = "Length", required = true)
    protected LengthType length;
    @XmlElement(name = "Weight", required = true)
    protected WeightType weight;
    @XmlElement(name = "Width", required = true)
    protected WidthType width;

    /**
     * Obtiene el valor de la propiedad height.
     * 
     * @return
     *     possible object is
     *     {@link HeightType }
     *     
     */
    public HeightType getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightType }
     *     
     */
    public void setHeight(HeightType value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad length.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLength() {
        return length;
    }

    /**
     * Define el valor de la propiedad length.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLength(LengthType value) {
        this.length = value;
    }

    /**
     * Obtiene el valor de la propiedad weight.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getWeight() {
        return weight;
    }

    /**
     * Define el valor de la propiedad weight.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setWeight(WeightType value) {
        this.weight = value;
    }

    /**
     * Obtiene el valor de la propiedad width.
     * 
     * @return
     *     possible object is
     *     {@link WidthType }
     *     
     */
    public WidthType getWidth() {
        return width;
    }

    /**
     * Define el valor de la propiedad width.
     * 
     * @param value
     *     allowed object is
     *     {@link WidthType }
     *     
     */
    public void setWidth(WidthType value) {
        this.width = value;
    }

}
