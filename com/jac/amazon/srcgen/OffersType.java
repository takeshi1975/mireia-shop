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
 * <p>Clase Java para OffersType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OffersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalOffers" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="TotalOfferPages" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="MoreOffersUrl"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/0321563840%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D0321563840"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/1523416920%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D1523416920"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/0321776402%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D0321776402"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/0988927802%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D0988927802"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/1491903996%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D1491903996"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/1519318588%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D1519318588"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/0134383583%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D0134383583"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/0133769399%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D0133769399"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/1305109910%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D1305109910"/&gt;
 *               &lt;enumeration value="http://www.amazon.com/gp/offer-listing/0321714113%3FSubscriptionId%3DAKIAJGK33UXRN7XC6B6Q%26tag%3Djuanjowebsite-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D386001%26creativeASIN%3D0321714113"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Offer" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OfferType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffersType", propOrder = {
    "totalOffers",
    "totalOfferPages",
    "moreOffersUrl",
    "offer"
})
public class OffersType {

    @XmlElement(name = "TotalOffers")
    protected byte totalOffers;
    @XmlElement(name = "TotalOfferPages")
    protected byte totalOfferPages;
    @XmlElement(name = "MoreOffersUrl", required = true)
    protected String moreOffersUrl;
    @XmlElement(name = "Offer", required = true)
    protected OfferType offer;

    /**
     * Obtiene el valor de la propiedad totalOffers.
     * 
     */
    public byte getTotalOffers() {
        return totalOffers;
    }

    /**
     * Define el valor de la propiedad totalOffers.
     * 
     */
    public void setTotalOffers(byte value) {
        this.totalOffers = value;
    }

    /**
     * Obtiene el valor de la propiedad totalOfferPages.
     * 
     */
    public byte getTotalOfferPages() {
        return totalOfferPages;
    }

    /**
     * Define el valor de la propiedad totalOfferPages.
     * 
     */
    public void setTotalOfferPages(byte value) {
        this.totalOfferPages = value;
    }

    /**
     * Obtiene el valor de la propiedad moreOffersUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreOffersUrl() {
        return moreOffersUrl;
    }

    /**
     * Define el valor de la propiedad moreOffersUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreOffersUrl(String value) {
        this.moreOffersUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad offer.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getOffer() {
        return offer;
    }

    /**
     * Define el valor de la propiedad offer.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setOffer(OfferType value) {
        this.offer = value;
    }

}
