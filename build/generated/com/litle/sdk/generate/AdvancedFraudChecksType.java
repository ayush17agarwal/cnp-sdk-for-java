//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for advancedFraudChecksType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advancedFraudChecksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threatMetrixSessionId" type="{http://www.litle.com/schema}threatMetrixSessionIdType" minOccurs="0"/>
 *         &lt;element name="customAttribute1" type="{http://www.litle.com/schema}customAttributeType" minOccurs="0"/>
 *         &lt;element name="customAttribute2" type="{http://www.litle.com/schema}customAttributeType" minOccurs="0"/>
 *         &lt;element name="customAttribute3" type="{http://www.litle.com/schema}customAttributeType" minOccurs="0"/>
 *         &lt;element name="customAttribute4" type="{http://www.litle.com/schema}customAttributeType" minOccurs="0"/>
 *         &lt;element name="customAttribute5" type="{http://www.litle.com/schema}customAttributeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advancedFraudChecksType", propOrder = {
    "threatMetrixSessionId",
    "customAttribute1",
    "customAttribute2",
    "customAttribute3",
    "customAttribute4",
    "customAttribute5"
})
public class AdvancedFraudChecksType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String threatMetrixSessionId;
    protected String customAttribute1;
    protected String customAttribute2;
    protected String customAttribute3;
    protected String customAttribute4;
    protected String customAttribute5;

    /**
     * Gets the value of the threatMetrixSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreatMetrixSessionId() {
        return threatMetrixSessionId;
    }

    /**
     * Sets the value of the threatMetrixSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreatMetrixSessionId(String value) {
        this.threatMetrixSessionId = value;
    }

    /**
     * Gets the value of the customAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute1() {
        return customAttribute1;
    }

    /**
     * Sets the value of the customAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute1(String value) {
        this.customAttribute1 = value;
    }

    /**
     * Gets the value of the customAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute2() {
        return customAttribute2;
    }

    /**
     * Sets the value of the customAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute2(String value) {
        this.customAttribute2 = value;
    }

    /**
     * Gets the value of the customAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute3() {
        return customAttribute3;
    }

    /**
     * Sets the value of the customAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute3(String value) {
        this.customAttribute3 = value;
    }

    /**
     * Gets the value of the customAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute4() {
        return customAttribute4;
    }

    /**
     * Sets the value of the customAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute4(String value) {
        this.customAttribute4 = value;
    }

    /**
     * Gets the value of the customAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttribute5() {
        return customAttribute5;
    }

    /**
     * Sets the value of the customAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttribute5(String value) {
        this.customAttribute5 = value;
    }

}