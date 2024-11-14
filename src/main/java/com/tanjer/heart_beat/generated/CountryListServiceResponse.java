
package com.tanjer.heart_beat.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countryListServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="countryListServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COUNTRYLIST" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="COUNTRY" type="{http://dtts.sfda.gov.sa/CountryListService}countryDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "countryListServiceResponse", propOrder = {
    "countrylist"
})
public class CountryListServiceResponse {

    @XmlElement(name = "COUNTRYLIST")
    protected CountryListServiceResponse.COUNTRYLIST countrylist;

    /**
     * Gets the value of the countrylist property.
     * 
     * @return
     *     possible object is
     *     {@link CountryListServiceResponse.COUNTRYLIST }
     *     
     */
    public CountryListServiceResponse.COUNTRYLIST getCOUNTRYLIST() {
        return countrylist;
    }

    /**
     * Sets the value of the countrylist property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryListServiceResponse.COUNTRYLIST }
     *     
     */
    public void setCOUNTRYLIST(CountryListServiceResponse.COUNTRYLIST value) {
        this.countrylist = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="COUNTRY" type="{http://dtts.sfda.gov.sa/CountryListService}countryDto" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "country"
    })
    public static class COUNTRYLIST {

        @XmlElement(name = "COUNTRY")
        protected List<CountryDto> country;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOUNTRY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryDto }
         * 
         * 
         */
        public List<CountryDto> getCOUNTRY() {
            if (country == null) {
                country = new ArrayList<CountryDto>();
            }
            return this.country;
        }

    }

}
