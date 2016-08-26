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
 * <p>Clase Java para ItemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ASIN"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="0321563840"/&gt;
 *               &lt;enumeration value="1523416920"/&gt;
 *               &lt;enumeration value="0321776402"/&gt;
 *               &lt;enumeration value="0988927802"/&gt;
 *               &lt;enumeration value="1491903996"/&gt;
 *               &lt;enumeration value="1519318588"/&gt;
 *               &lt;enumeration value="0134383583"/&gt;
 *               &lt;enumeration value="0133769399"/&gt;
 *               &lt;enumeration value="1305109910"/&gt;
 *               &lt;enumeration value="0321714113"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DetailPageURL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;enumeration value="http://www.amazon.com/C-Programming-Language-4th/dp/0321563840%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D0321563840"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/Ultimate-Beginners-Guide-Andrew-Johansen/dp/1523416920%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D1523416920"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/Primer-Plus-6th-Developers-Library/dp/0321776402%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D0321776402"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/Jumping-into-C-Alex-Allain/dp/0988927802%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D0988927802"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/Effective-Modern-Specific-Ways-Improve/dp/1491903996%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D1491903996"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/Learn-DAY-Ultimate-Development-Beginners/dp/1519318588%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D1519318588"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/Discovering-Modern-Scientists-Programmers-Depth/dp/0134383583%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D0134383583"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/Starting-Out-Control-Structures-Objects/dp/0133769399%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D0133769399"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/Beginning-C-Through-Game-Programming/dp/1305109910%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D1305109910"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/Primer-5th-Stanley-B-Lippman/dp/0321714113%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D0321714113"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemLinks" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemLinksType"/&gt;
 *         &lt;element name="SmallImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SmallImageType"/&gt;
 *         &lt;element name="MediumImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}MediumImageType"/&gt;
 *         &lt;element name="LargeImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LargeImageType"/&gt;
 *         &lt;element name="ImageSets" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ImageSetsType"/&gt;
 *         &lt;element name="ItemAttributes" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemAttributesType"/&gt;
 *         &lt;element name="OfferSummary" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OfferSummaryType"/&gt;
 *         &lt;element name="Offers" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OffersType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
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
public class ItemType {

    @XmlElement(name = "ASIN")
    protected int asin;
    @XmlElement(name = "DetailPageURL", required = true)
    protected String detailPageURL;
    @XmlElement(name = "ItemLinks", required = true)
    protected ItemLinksType itemLinks;
    @XmlElement(name = "SmallImage", required = true)
    protected SmallImageType smallImage;
    @XmlElement(name = "MediumImage", required = true)
    protected MediumImageType mediumImage;
    @XmlElement(name = "LargeImage", required = true)
    protected LargeImageType largeImage;
    @XmlElement(name = "ImageSets", required = true)
    protected ImageSetsType imageSets;
    @XmlElement(name = "ItemAttributes", required = true)
    protected ItemAttributesType itemAttributes;
    @XmlElement(name = "OfferSummary", required = true)
    protected OfferSummaryType offerSummary;
    @XmlElement(name = "Offers", required = true)
    protected OffersType offers;

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
     *     {@link ItemLinksType }
     *     
     */
    public ItemLinksType getItemLinks() {
        return itemLinks;
    }

    /**
     * Define el valor de la propiedad itemLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLinksType }
     *     
     */
    public void setItemLinks(ItemLinksType value) {
        this.itemLinks = value;
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
     * Obtiene el valor de la propiedad imageSets.
     * 
     * @return
     *     possible object is
     *     {@link ImageSetsType }
     *     
     */
    public ImageSetsType getImageSets() {
        return imageSets;
    }

    /**
     * Define el valor de la propiedad imageSets.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSetsType }
     *     
     */
    public void setImageSets(ImageSetsType value) {
        this.imageSets = value;
    }

    /**
     * Obtiene el valor de la propiedad itemAttributes.
     * 
     * @return
     *     possible object is
     *     {@link ItemAttributesType }
     *     
     */
    public ItemAttributesType getItemAttributes() {
        return itemAttributes;
    }

    /**
     * Define el valor de la propiedad itemAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAttributesType }
     *     
     */
    public void setItemAttributes(ItemAttributesType value) {
        this.itemAttributes = value;
    }

    /**
     * Obtiene el valor de la propiedad offerSummary.
     * 
     * @return
     *     possible object is
     *     {@link OfferSummaryType }
     *     
     */
    public OfferSummaryType getOfferSummary() {
        return offerSummary;
    }

    /**
     * Define el valor de la propiedad offerSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferSummaryType }
     *     
     */
    public void setOfferSummary(OfferSummaryType value) {
        this.offerSummary = value;
    }

    /**
     * Obtiene el valor de la propiedad offers.
     * 
     * @return
     *     possible object is
     *     {@link OffersType }
     *     
     */
    public OffersType getOffers() {
        return offers;
    }

    /**
     * Define el valor de la propiedad offers.
     * 
     * @param value
     *     allowed object is
     *     {@link OffersType }
     *     
     */
    public void setOffers(OffersType value) {
        this.offers = value;
    }

}
