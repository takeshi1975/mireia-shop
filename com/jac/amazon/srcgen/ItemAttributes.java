//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.24 a las 01:02:21 PM CEST 
//


package com.jac.amazon.srcgen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Author" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Binding"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Brand" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}EAN"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}EANList"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Edition" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Feature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Format" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ISBN"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}IsEligibleForTradeIn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemDimensions"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Label"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Languages"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ListPrice"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Manufacturer"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}MPN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}NumberOfItems"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}NumberOfPages"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}PackageDimensions"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}PackageQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}PartNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ProductGroup"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ProductTypeName"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}PublicationDate"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Publisher"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SKU" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Studio"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Title"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TradeInValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}UPC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}UPCList" minOccurs="0"/&gt;
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
@XmlRootElement(name = "ItemAttributes")
public class ItemAttributes {

    @XmlElement(name = "Author")
    protected List<String> author;
    @XmlElement(name = "Binding", required = true)
    protected String binding;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "EAN")
    protected long ean;
    @XmlElement(name = "EANList", required = true)
    protected EANList eanList;
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
    protected ItemDimensions itemDimensions;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "Languages", required = true)
    protected Languages languages;
    @XmlElement(name = "ListPrice", required = true)
    protected ListPrice listPrice;
    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    @XmlElement(name = "MPN")
    protected String mpn;
    @XmlElement(name = "NumberOfItems")
    protected byte numberOfItems;
    @XmlElement(name = "NumberOfPages")
    protected short numberOfPages;
    @XmlElement(name = "PackageDimensions", required = true)
    protected PackageDimensions packageDimensions;
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
    protected TradeInValue tradeInValue;
    @XmlElement(name = "UPC")
    protected Long upc;
    @XmlElement(name = "UPCList")
    protected UPCList upcList;

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
     *     {@link EANList }
     *     
     */
    public EANList getEANList() {
        return eanList;
    }

    /**
     * Define el valor de la propiedad eanList.
     * 
     * @param value
     *     allowed object is
     *     {@link EANList }
     *     
     */
    public void setEANList(EANList value) {
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
     *     {@link ItemDimensions }
     *     
     */
    public ItemDimensions getItemDimensions() {
        return itemDimensions;
    }

    /**
     * Define el valor de la propiedad itemDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDimensions }
     *     
     */
    public void setItemDimensions(ItemDimensions value) {
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
     *     {@link Languages }
     *     
     */
    public Languages getLanguages() {
        return languages;
    }

    /**
     * Define el valor de la propiedad languages.
     * 
     * @param value
     *     allowed object is
     *     {@link Languages }
     *     
     */
    public void setLanguages(Languages value) {
        this.languages = value;
    }

    /**
     * Obtiene el valor de la propiedad listPrice.
     * 
     * @return
     *     possible object is
     *     {@link ListPrice }
     *     
     */
    public ListPrice getListPrice() {
        return listPrice;
    }

    /**
     * Define el valor de la propiedad listPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPrice }
     *     
     */
    public void setListPrice(ListPrice value) {
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
     *     {@link PackageDimensions }
     *     
     */
    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    /**
     * Define el valor de la propiedad packageDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageDimensions }
     *     
     */
    public void setPackageDimensions(PackageDimensions value) {
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
     *     {@link TradeInValue }
     *     
     */
    public TradeInValue getTradeInValue() {
        return tradeInValue;
    }

    /**
     * Define el valor de la propiedad tradeInValue.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeInValue }
     *     
     */
    public void setTradeInValue(TradeInValue value) {
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
     *     {@link UPCList }
     *     
     */
    public UPCList getUPCList() {
        return upcList;
    }

    /**
     * Define el valor de la propiedad upcList.
     * 
     * @param value
     *     allowed object is
     *     {@link UPCList }
     *     
     */
    public void setUPCList(UPCList value) {
        this.upcList = value;
    }

}
