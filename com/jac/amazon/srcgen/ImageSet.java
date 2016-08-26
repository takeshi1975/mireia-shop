//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.24 a las 01:02:21 PM CEST 
//


package com.jac.amazon.srcgen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SwatchImage"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SmallImage"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ThumbnailImage"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TinyImage"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}MediumImage"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LargeImage"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}HiResImage" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "swatchImage",
    "smallImage",
    "thumbnailImage",
    "tinyImage",
    "mediumImage",
    "largeImage",
    "hiResImage"
})
@XmlRootElement(name = "ImageSet")
public class ImageSet {

    @XmlElement(name = "SwatchImage", required = true)
    protected SwatchImage swatchImage;
    @XmlElement(name = "SmallImage", required = true)
    protected SmallImage smallImage;
    @XmlElement(name = "ThumbnailImage", required = true)
    protected ThumbnailImage thumbnailImage;
    @XmlElement(name = "TinyImage", required = true)
    protected TinyImage tinyImage;
    @XmlElement(name = "MediumImage", required = true)
    protected MediumImage mediumImage;
    @XmlElement(name = "LargeImage", required = true)
    protected LargeImage largeImage;
    @XmlElement(name = "HiResImage")
    protected HiResImage hiResImage;
    @XmlAttribute(name = "Category")
    protected String category;

    /**
     * Obtiene el valor de la propiedad swatchImage.
     * 
     * @return
     *     possible object is
     *     {@link SwatchImage }
     *     
     */
    public SwatchImage getSwatchImage() {
        return swatchImage;
    }

    /**
     * Define el valor de la propiedad swatchImage.
     * 
     * @param value
     *     allowed object is
     *     {@link SwatchImage }
     *     
     */
    public void setSwatchImage(SwatchImage value) {
        this.swatchImage = value;
    }

    /**
     * Obtiene el valor de la propiedad smallImage.
     * 
     * @return
     *     possible object is
     *     {@link SmallImage }
     *     
     */
    public SmallImage getSmallImage() {
        return smallImage;
    }

    /**
     * Define el valor de la propiedad smallImage.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallImage }
     *     
     */
    public void setSmallImage(SmallImage value) {
        this.smallImage = value;
    }

    /**
     * Obtiene el valor de la propiedad thumbnailImage.
     * 
     * @return
     *     possible object is
     *     {@link ThumbnailImage }
     *     
     */
    public ThumbnailImage getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * Define el valor de la propiedad thumbnailImage.
     * 
     * @param value
     *     allowed object is
     *     {@link ThumbnailImage }
     *     
     */
    public void setThumbnailImage(ThumbnailImage value) {
        this.thumbnailImage = value;
    }

    /**
     * Obtiene el valor de la propiedad tinyImage.
     * 
     * @return
     *     possible object is
     *     {@link TinyImage }
     *     
     */
    public TinyImage getTinyImage() {
        return tinyImage;
    }

    /**
     * Define el valor de la propiedad tinyImage.
     * 
     * @param value
     *     allowed object is
     *     {@link TinyImage }
     *     
     */
    public void setTinyImage(TinyImage value) {
        this.tinyImage = value;
    }

    /**
     * Obtiene el valor de la propiedad mediumImage.
     * 
     * @return
     *     possible object is
     *     {@link MediumImage }
     *     
     */
    public MediumImage getMediumImage() {
        return mediumImage;
    }

    /**
     * Define el valor de la propiedad mediumImage.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumImage }
     *     
     */
    public void setMediumImage(MediumImage value) {
        this.mediumImage = value;
    }

    /**
     * Obtiene el valor de la propiedad largeImage.
     * 
     * @return
     *     possible object is
     *     {@link LargeImage }
     *     
     */
    public LargeImage getLargeImage() {
        return largeImage;
    }

    /**
     * Define el valor de la propiedad largeImage.
     * 
     * @param value
     *     allowed object is
     *     {@link LargeImage }
     *     
     */
    public void setLargeImage(LargeImage value) {
        this.largeImage = value;
    }

    /**
     * Obtiene el valor de la propiedad hiResImage.
     * 
     * @return
     *     possible object is
     *     {@link HiResImage }
     *     
     */
    public HiResImage getHiResImage() {
        return hiResImage;
    }

    /**
     * Define el valor de la propiedad hiResImage.
     * 
     * @param value
     *     allowed object is
     *     {@link HiResImage }
     *     
     */
    public void setHiResImage(HiResImage value) {
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
