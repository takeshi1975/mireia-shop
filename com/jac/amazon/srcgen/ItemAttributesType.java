//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.24 a las 12:56:14 PM CEST 
//


package com.jac.amazon.srcgen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ItemAttributesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Binding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Brand" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Stroustrup, Bjarne"/&gt;
 *               &lt;enumeration value="Addison-Wesley Professional"/&gt;
 *               &lt;enumeration value="Meyers, Scott"/&gt;
 *               &lt;enumeration value="Gaddis, Tony"/&gt;
 *               &lt;enumeration value="Dawson, Michael"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EAN"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;enumeration value="9780321563842"/&gt;
 *               &lt;enumeration value="9781523416929"/&gt;
 *               &lt;enumeration value="9780321776402"/&gt;
 *               &lt;enumeration value="9780988927803"/&gt;
 *               &lt;enumeration value="9781491903995"/&gt;
 *               &lt;enumeration value="9781519318589"/&gt;
 *               &lt;enumeration value="9780134383583"/&gt;
 *               &lt;enumeration value="9780133769395"/&gt;
 *               &lt;enumeration value="9781305109919"/&gt;
 *               &lt;enumeration value="9780321714114"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EANList" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}EANListType"/&gt;
 *         &lt;element name="Edition" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="4"/&gt;
 *               &lt;enumeration value="6"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="8"/&gt;
 *               &lt;enumeration value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Feature" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="100% Satisfaction Guarantee. Tracking provided on most orders. Buy with Confidence!"/&gt;
 *               &lt;enumeration value="A brand-new, unused, unopened item in its original packaging, with all original packaging materials included."/&gt;
 *               &lt;enumeration value="High seller positive feedback for the seller!"/&gt;
 *               &lt;enumeration value="Lowest price on amazon!"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISBN"&gt;
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
 *         &lt;element name="IsEligibleForTradeIn" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="ItemDimensions" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemDimensionsType"/&gt;
 *         &lt;element name="Label"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Addison-Wesley Professional"/&gt;
 *               &lt;enumeration value="CreateSpace Independent Publishing Platform"/&gt;
 *               &lt;enumeration value="Cprogramming.com"/&gt;
 *               &lt;enumeration value="O'Reilly Media"/&gt;
 *               &lt;enumeration value="Pearson"/&gt;
 *               &lt;enumeration value="Cengage Learning PTR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Languages" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}LanguagesType"/&gt;
 *         &lt;element name="ListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ListPriceType"/&gt;
 *         &lt;element name="Manufacturer"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Addison-Wesley Professional"/&gt;
 *               &lt;enumeration value="CreateSpace Independent Publishing Platform"/&gt;
 *               &lt;enumeration value="Cprogramming.com"/&gt;
 *               &lt;enumeration value="O'Reilly Media"/&gt;
 *               &lt;enumeration value="Pearson"/&gt;
 *               &lt;enumeration value="Cengage Learning PTR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MPN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="colour illustrations"/&gt;
 *               &lt;enumeration value="black &amp; white illustrations"/&gt;
 *               &lt;enumeration value="black &amp; white tables, figures"/&gt;
 *               &lt;enumeration value="9780321714114"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="NumberOfPages"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&gt;
 *               &lt;enumeration value="1368"/&gt;
 *               &lt;enumeration value="86"/&gt;
 *               &lt;enumeration value="1200"/&gt;
 *               &lt;enumeration value="536"/&gt;
 *               &lt;enumeration value="336"/&gt;
 *               &lt;enumeration value="136"/&gt;
 *               &lt;enumeration value="480"/&gt;
 *               &lt;enumeration value="1280"/&gt;
 *               &lt;enumeration value="416"/&gt;
 *               &lt;enumeration value="976"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PackageDimensions" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}PackageDimensionsType"/&gt;
 *         &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="PartNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="colour illustrations"/&gt;
 *               &lt;enumeration value="black &amp; white illustrations"/&gt;
 *               &lt;enumeration value="black &amp; white tables, figures"/&gt;
 *               &lt;enumeration value="9780321714114"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProductGroup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PublicationDate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;enumeration value="2013-05-19"/&gt;
 *               &lt;enumeration value="2016-01-18"/&gt;
 *               &lt;enumeration value="2011-10-28"/&gt;
 *               &lt;enumeration value="2013-04-19"/&gt;
 *               &lt;enumeration value="2014-12-05"/&gt;
 *               &lt;enumeration value="2015-11-18"/&gt;
 *               &lt;enumeration value="2015-12-27"/&gt;
 *               &lt;enumeration value="2014-03-08"/&gt;
 *               &lt;enumeration value="2014-06-23"/&gt;
 *               &lt;enumeration value="2012-08-16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Publisher"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Addison-Wesley Professional"/&gt;
 *               &lt;enumeration value="CreateSpace Independent Publishing Platform"/&gt;
 *               &lt;enumeration value="Cprogramming.com"/&gt;
 *               &lt;enumeration value="O'Reilly Media"/&gt;
 *               &lt;enumeration value="Pearson"/&gt;
 *               &lt;enumeration value="Cengage Learning PTR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Studio"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Addison-Wesley Professional"/&gt;
 *               &lt;enumeration value="CreateSpace Independent Publishing Platform"/&gt;
 *               &lt;enumeration value="Cprogramming.com"/&gt;
 *               &lt;enumeration value="O'Reilly Media"/&gt;
 *               &lt;enumeration value="Pearson"/&gt;
 *               &lt;enumeration value="Cengage Learning PTR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Title"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="The C++ Programming Language, 4th Edition"/&gt;
 *               &lt;enumeration value="C++: The Ultimate Beginner's Guide!"/&gt;
 *               &lt;enumeration value="C++ Primer Plus (6th Edition) (Developer's Library)"/&gt;
 *               &lt;enumeration value="Jumping into C++"/&gt;
 *               &lt;enumeration value="Effective Modern C++: 42 Specific Ways to Improve Your Use of C++11 and C++14"/&gt;
 *               &lt;enumeration value="Learn C++ In A DAY: The Ultimate Crash Course to Learning the Basics of C++ In No Time (C++, C++ Course, C++ Development, C++ Books, C++ for Beginners)"/&gt;
 *               &lt;enumeration value="Discovering Modern C++: An Intensive Course for Scientists, Engineers, and Programmers (C++ In-Depth)"/&gt;
 *               &lt;enumeration value="Starting Out with C++ from Control Structures to Objects (8th Edition)"/&gt;
 *               &lt;enumeration value="Beginning C++ Through Game Programming"/&gt;
 *               &lt;enumeration value="C++ Primer (5th Edition)"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TradeInValue" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TradeInValueType" minOccurs="0"/&gt;
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UPCList" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}UPCListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAttributesType", propOrder = {
    "author",
    "binding",
    "brand",
    "ean",
    "eanList",
    "edition",
    "feature",
    "format",
    "isbn",
    "isEligibleForTradeIn",
    "itemDimensions",
    "label",
    "languages",
    "listPrice",
    "manufacturer",
    "mpn",
    "numberOfItems",
    "numberOfPages",
    "packageDimensions",
    "packageQuantity",
    "partNumber",
    "productGroup",
    "productTypeName",
    "publicationDate",
    "publisher",
    "sku",
    "studio",
    "title",
    "tradeInValue",
    "upc",
    "upcList"
})
public class ItemAttributesType {

    @XmlElement(name = "Author")
    protected List<String> author;
    @XmlElement(name = "Binding", required = true)
    protected String binding;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "EAN")
    protected long ean;
    @XmlElement(name = "EANList", required = true)
    protected EANListType eanList;
    @XmlElement(name = "Edition")
    protected Byte edition;
    @XmlElement(name = "Feature")
    protected List<String> feature;
    @XmlElement(name = "Format")
    protected String format;
    @XmlElement(name = "ISBN")
    protected int isbn;
    @XmlElement(name = "IsEligibleForTradeIn")
    protected Byte isEligibleForTradeIn;
    @XmlElement(name = "ItemDimensions", required = true)
    protected ItemDimensionsType itemDimensions;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "Languages", required = true)
    protected LanguagesType languages;
    @XmlElement(name = "ListPrice", required = true)
    protected ListPriceType listPrice;
    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    @XmlElement(name = "MPN")
    protected String mpn;
    @XmlElement(name = "NumberOfItems")
    protected byte numberOfItems;
    @XmlElement(name = "NumberOfPages")
    protected short numberOfPages;
    @XmlElement(name = "PackageDimensions", required = true)
    protected PackageDimensionsType packageDimensions;
    @XmlElement(name = "PackageQuantity")
    protected Byte packageQuantity;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "ProductGroup", required = true)
    protected String productGroup;
    @XmlElement(name = "ProductTypeName", required = true)
    protected String productTypeName;
    @XmlElement(name = "PublicationDate", required = true)
    protected XMLGregorianCalendar publicationDate;
    @XmlElement(name = "Publisher", required = true)
    protected String publisher;
    @XmlElement(name = "SKU")
    protected Long sku;
    @XmlElement(name = "Studio", required = true)
    protected String studio;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "TradeInValue")
    protected TradeInValueType tradeInValue;
    @XmlElement(name = "UPC")
    protected Long upc;
    @XmlElement(name = "UPCList")
    protected UPCListType upcList;

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAuthor() {
        if (author == null) {
            author = new ArrayList<String>();
        }
        return this.author;
    }

    /**
     * Obtiene el valor de la propiedad binding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinding() {
        return binding;
    }

    /**
     * Define el valor de la propiedad binding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinding(String value) {
        this.binding = value;
    }

    /**
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Obtiene el valor de la propiedad ean.
     * 
     */
    public long getEAN() {
        return ean;
    }

    /**
     * Define el valor de la propiedad ean.
     * 
     */
    public void setEAN(long value) {
        this.ean = value;
    }

    /**
     * Obtiene el valor de la propiedad eanList.
     * 
     * @return
     *     possible object is
     *     {@link EANListType }
     *     
     */
    public EANListType getEANList() {
        return eanList;
    }

    /**
     * Define el valor de la propiedad eanList.
     * 
     * @param value
     *     allowed object is
     *     {@link EANListType }
     *     
     */
    public void setEANList(EANListType value) {
        this.eanList = value;
    }

    /**
     * Obtiene el valor de la propiedad edition.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getEdition() {
        return edition;
    }

    /**
     * Define el valor de la propiedad edition.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setEdition(Byte value) {
        this.edition = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFeature() {
        if (feature == null) {
            feature = new ArrayList<String>();
        }
        return this.feature;
    }

    /**
     * Obtiene el valor de la propiedad format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Define el valor de la propiedad format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Obtiene el valor de la propiedad isbn.
     * 
     */
    public int getISBN() {
        return isbn;
    }

    /**
     * Define el valor de la propiedad isbn.
     * 
     */
    public void setISBN(int value) {
        this.isbn = value;
    }

    /**
     * Obtiene el valor de la propiedad isEligibleForTradeIn.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIsEligibleForTradeIn() {
        return isEligibleForTradeIn;
    }

    /**
     * Define el valor de la propiedad isEligibleForTradeIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIsEligibleForTradeIn(Byte value) {
        this.isEligibleForTradeIn = value;
    }

    /**
     * Obtiene el valor de la propiedad itemDimensions.
     * 
     * @return
     *     possible object is
     *     {@link ItemDimensionsType }
     *     
     */
    public ItemDimensionsType getItemDimensions() {
        return itemDimensions;
    }

    /**
     * Define el valor de la propiedad itemDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDimensionsType }
     *     
     */
    public void setItemDimensions(ItemDimensionsType value) {
        this.itemDimensions = value;
    }

    /**
     * Obtiene el valor de la propiedad label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Define el valor de la propiedad label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtiene el valor de la propiedad languages.
     * 
     * @return
     *     possible object is
     *     {@link LanguagesType }
     *     
     */
    public LanguagesType getLanguages() {
        return languages;
    }

    /**
     * Define el valor de la propiedad languages.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagesType }
     *     
     */
    public void setLanguages(LanguagesType value) {
        this.languages = value;
    }

    /**
     * Obtiene el valor de la propiedad listPrice.
     * 
     * @return
     *     possible object is
     *     {@link ListPriceType }
     *     
     */
    public ListPriceType getListPrice() {
        return listPrice;
    }

    /**
     * Define el valor de la propiedad listPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPriceType }
     *     
     */
    public void setListPrice(ListPriceType value) {
        this.listPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Define el valor de la propiedad manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad mpn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPN() {
        return mpn;
    }

    /**
     * Define el valor de la propiedad mpn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPN(String value) {
        this.mpn = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfItems.
     * 
     */
    public byte getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Define el valor de la propiedad numberOfItems.
     * 
     */
    public void setNumberOfItems(byte value) {
        this.numberOfItems = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfPages.
     * 
     */
    public short getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Define el valor de la propiedad numberOfPages.
     * 
     */
    public void setNumberOfPages(short value) {
        this.numberOfPages = value;
    }

    /**
     * Obtiene el valor de la propiedad packageDimensions.
     * 
     * @return
     *     possible object is
     *     {@link PackageDimensionsType }
     *     
     */
    public PackageDimensionsType getPackageDimensions() {
        return packageDimensions;
    }

    /**
     * Define el valor de la propiedad packageDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageDimensionsType }
     *     
     */
    public void setPackageDimensions(PackageDimensionsType value) {
        this.packageDimensions = value;
    }

    /**
     * Obtiene el valor de la propiedad packageQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPackageQuantity() {
        return packageQuantity;
    }

    /**
     * Define el valor de la propiedad packageQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPackageQuantity(Byte value) {
        this.packageQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad partNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Define el valor de la propiedad partNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad productGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroup() {
        return productGroup;
    }

    /**
     * Define el valor de la propiedad productGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroup(String value) {
        this.productGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad productTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * Define el valor de la propiedad productTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeName(String value) {
        this.productTypeName = value;
    }

    /**
     * Obtiene el valor de la propiedad publicationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Define el valor de la propiedad publicationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad publisher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Define el valor de la propiedad publisher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Obtiene el valor de la propiedad sku.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSKU() {
        return sku;
    }

    /**
     * Define el valor de la propiedad sku.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSKU(Long value) {
        this.sku = value;
    }

    /**
     * Obtiene el valor de la propiedad studio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudio() {
        return studio;
    }

    /**
     * Define el valor de la propiedad studio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudio(String value) {
        this.studio = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeInValue.
     * 
     * @return
     *     possible object is
     *     {@link TradeInValueType }
     *     
     */
    public TradeInValueType getTradeInValue() {
        return tradeInValue;
    }

    /**
     * Define el valor de la propiedad tradeInValue.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeInValueType }
     *     
     */
    public void setTradeInValue(TradeInValueType value) {
        this.tradeInValue = value;
    }

    /**
     * Obtiene el valor de la propiedad upc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUPC() {
        return upc;
    }

    /**
     * Define el valor de la propiedad upc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUPC(Long value) {
        this.upc = value;
    }

    /**
     * Obtiene el valor de la propiedad upcList.
     * 
     * @return
     *     possible object is
     *     {@link UPCListType }
     *     
     */
    public UPCListType getUPCList() {
        return upcList;
    }

    /**
     * Define el valor de la propiedad upcList.
     * 
     * @param value
     *     allowed object is
     *     {@link UPCListType }
     *     
     */
    public void setUPCList(UPCListType value) {
        this.upcList = value;
    }

}
