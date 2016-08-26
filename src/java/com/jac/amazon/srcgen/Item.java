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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ASIN"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}DetailPageURL"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemLinks"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SmallImage"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}MediumImage"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LargeImage"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ImageSets"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemAttributes"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OfferSummary"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Offers"/&gt;
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
    "asin",
    "detailPageURL",
    "itemLinks",
    "smallImage",
    "mediumImage",
    "largeImage",
    "imageSets",
    "itemAttributes",
    "offerSummary",
    "offers"
})
@XmlRootElement(name = "Item")
public class Item {

    @XmlElement(name = "ASIN")
    protected int asin;
    @XmlElement(name = "DetailPageURL", required = true)
    protected String detailPageURL;
    @XmlElement(name = "ItemLinks", required = true)
    protected ItemLinks itemLinks;
    @XmlElement(name = "SmallImage", required = true)
    protected SmallImage smallImage;
    @XmlElement(name = "MediumImage", required = true)
    protected MediumImage mediumImage;
    @XmlElement(name = "LargeImage", required = true)
    protected LargeImage largeImage;
    @XmlElement(name = "ImageSets", required = true)
    protected ImageSets imageSets;
    @XmlElement(name = "ItemAttributes", required = true)
    protected ItemAttributes itemAttributes;
    @XmlElement(name = "OfferSummary", required = true)
    protected OfferSummary offerSummary;
    @XmlElement(name = "Offers", required = true)
    protected Offers offers;

    /**
     * Obtiene el valor de la propiedad asin.
     * 
     */
    public int getASIN() {
        return asin;
    }

    /**
     * Define el valor de la propiedad asin.
     * 
     */
    public void setASIN(int value) {
        this.asin = value;
    }

    /**
     * Obtiene el valor de la propiedad detailPageURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailPageURL() {
        return detailPageURL;
    }

    /**
     * Define el valor de la propiedad detailPageURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailPageURL(String value) {
        this.detailPageURL = value;
    }

    /**
     * Obtiene el valor de la propiedad itemLinks.
     * 
     * @return
     *     possible object is
     *     {@link ItemLinks }
     *     
     */
    public ItemLinks getItemLinks() {
        return itemLinks;
    }

    /**
     * Define el valor de la propiedad itemLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLinks }
     *     
     */
    public void setItemLinks(ItemLinks value) {
        this.itemLinks = value;
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
     * Obtiene el valor de la propiedad imageSets.
     * 
     * @return
     *     possible object is
     *     {@link ImageSets }
     *     
     */
    public ImageSets getImageSets() {
        return imageSets;
    }

    /**
     * Define el valor de la propiedad imageSets.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSets }
     *     
     */
    public void setImageSets(ImageSets value) {
        this.imageSets = value;
    }

    /**
     * Obtiene el valor de la propiedad itemAttributes.
     * 
     * @return
     *     possible object is
     *     {@link ItemAttributes }
     *     
     */
    public ItemAttributes getItemAttributes() {
        return itemAttributes;
    }

    /**
     * Define el valor de la propiedad itemAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAttributes }
     *     
     */
    public void setItemAttributes(ItemAttributes value) {
        this.itemAttributes = value;
    }

    /**
     * Obtiene el valor de la propiedad offerSummary.
     * 
     * @return
     *     possible object is
     *     {@link OfferSummary }
     *     
     */
    public OfferSummary getOfferSummary() {
        return offerSummary;
    }

    /**
     * Define el valor de la propiedad offerSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferSummary }
     *     
     */
    public void setOfferSummary(OfferSummary value) {
        this.offerSummary = value;
    }

    /**
     * Obtiene el valor de la propiedad offers.
     * 
     * @return
     *     possible object is
     *     {@link Offers }
     *     
     */
    public Offers getOffers() {
        return offers;
    }

    /**
     * Define el valor de la propiedad offers.
     * 
     * @param value
     *     allowed object is
     *     {@link Offers }
     *     
     */
    public void setOffers(Offers value) {
        this.offers = value;
    }

}
