//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.24 a las 12:56:14 PM CEST 
//


package com.jac.amazon.srcgen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ImageSetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImageSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SwatchImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SwatchImageType"/&gt;
 *         &lt;element name="SmallImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SmallImageType"/&gt;
 *         &lt;element name="ThumbnailImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ThumbnailImageType"/&gt;
 *         &lt;element name="TinyImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TinyImageType"/&gt;
 *         &lt;element name="MediumImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}MediumImageType"/&gt;
 *         &lt;element name="LargeImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LargeImageType"/&gt;
 *         &lt;element name="HiResImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}HiResImageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageSetType", propOrder = {
    "swatchImage",
    "smallImage",
    "thumbnailImage",
    "tinyImage",
    "mediumImage",
    "largeImage",
    "hiResImage"
})
public class ImageSetType {

    @XmlElement(name = "SwatchImage", required = true)
    protected SwatchImageType swatchImage;
    @XmlElement(name = "SmallImage", required = true)
    protected SmallImageType smallImage;
    @XmlElement(name = "ThumbnailImage", required = true)
    protected ThumbnailImageType thumbnailImage;
    @XmlElement(name = "TinyImage", required = true)
    protected TinyImageType tinyImage;
    @XmlElement(name = "MediumImage", required = true)
    protected MediumImageType mediumImage;
    @XmlElement(name = "LargeImage", required = true)
    protected LargeImageType largeImage;
    @XmlElement(name = "HiResImage")
    protected HiResImageType hiResImage;
    @XmlAttribute(name = "Category")
    protected String category;

    /**
     * Obtiene el valor de la propiedad swatchImage.
     * 
     * @return
     *     possible object is
     *     {@link SwatchImageType }
     *     
     */
    public SwatchImageType getSwatchImage() {
        return swatchImage;
    }

    /**
     * Define el valor de la propiedad swatchImage.
     * 
     * @param value
     *     allowed object is
     *     {@link SwatchImageType }
     *     
     */
    public void setSwatchImage(SwatchImageType value) {
        this.swatchImage = value;
    }

    /**
     * Obtiene el valor de la propiedad smallImage.
     * 
     * @return
     *     possible object is
     *     {@link SmallImageType }
     *     
     */
    public SmallImageType getSmallImage() {
        return smallImage;
    }

    /**
     * Define el valor de la propiedad smallImage.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallImageType }
     *     
     */
    public void setSmallImage(SmallImageType value) {
        this.smallImage = value;
    }

    /**
     * Obtiene el valor de la propiedad thumbnailImage.
     * 
     * @return
     *     possible object is
     *     {@link ThumbnailImageType }
     *     
     */
    public ThumbnailImageType getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * Define el valor de la propiedad thumbnailImage.
     * 
     * @param value
     *     allowed object is
     *     {@link ThumbnailImageType }
     *     
     */
    public void setThumbnailImage(ThumbnailImageType value) {
        this.thumbnailImage = value;
    }

    /**
     * Obtiene el valor de la propiedad tinyImage.
     * 
     * @return
     *     possible object is
     *     {@link TinyImageType }
     *     
     */
    public TinyImageType getTinyImage() {
        return tinyImage;
    }

    /**
     * Define el valor de la propiedad tinyImage.
     * 
     * @param value
     *     allowed object is
     *     {@link TinyImageType }
     *     
     */
    public void setTinyImage(TinyImageType value) {
        this.tinyImage = value;
    }

    /**
     * Obtiene el valor de la propiedad mediumImage.
     * 
     * @return
     *     possible object is
     *     {@link MediumImageType }
     *     
     */
    public MediumImageType getMediumImage() {
        return mediumImage;
    }

    /**
     * Define el valor de la propiedad mediumImage.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumImageType }
     *     
     */
    public void setMediumImage(MediumImageType value) {
        this.mediumImage = value;
    }

    /**
     * Obtiene el valor de la propiedad largeImage.
     * 
     * @return
     *     possible object is
     *     {@link LargeImageType }
     *     
     */
    public LargeImageType getLargeImage() {
        return largeImage;
    }

    /**
     * Define el valor de la propiedad largeImage.
     * 
     * @param value
     *     allowed object is
     *     {@link LargeImageType }
     *     
     */
    public void setLargeImage(LargeImageType value) {
        this.largeImage = value;
    }

    /**
     * Obtiene el valor de la propiedad hiResImage.
     * 
     * @return
     *     possible object is
     *     {@link HiResImageType }
     *     
     */
    public HiResImageType getHiResImage() {
        return hiResImage;
    }

    /**
     * Define el valor de la propiedad hiResImage.
     * 
     * @param value
     *     allowed object is
     *     {@link HiResImageType }
     *     
     */
    public void setHiResImage(HiResImageType value) {
        this.hiResImage = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
