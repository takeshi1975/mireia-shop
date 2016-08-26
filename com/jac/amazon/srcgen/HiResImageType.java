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
 * <p>Clase Java para HiResImageType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HiResImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;enumeration value="http://ecx.images-amazon.com/images/I/81wQKLHH1LL.jpg"/&gt;
 *               &lt;enumeration value="http://ecx.images-amazon.com/images/I/81q6N9gv8TL.jpg"/&gt;
 *               &lt;enumeration value="http://ecx.images-amazon.com/images/I/81dLzu9kL1L.jpg"/&gt;
 *               &lt;enumeration value="http://ecx.images-amazon.com/images/I/71S6jBU8FxL.jpg"/&gt;
 *               &lt;enumeration value="http://ecx.images-amazon.com/images/I/81SRgRH9z8L.jpg"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}HeightType"/&gt;
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
@XmlType(name = "HiResImageType", propOrder = {
    "url",
    "height",
    "width"
})
public class HiResImageType {

    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "Height", required = true)
    protected HeightType height;
    @XmlElement(name = "Width", required = true)
    protected WidthType width;

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

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
