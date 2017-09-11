//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mposType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mposType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ksn" type="{http://www.litle.com/schema}ksnType"/>
 *         &lt;element name="formatId" type="{http://www.litle.com/schema}formatIdType"/>
 *         &lt;element name="encryptedTrack" type="{http://www.litle.com/schema}encryptedTrackType"/>
 *         &lt;element name="track1Status" type="{http://www.litle.com/schema}trackStatusType"/>
 *         &lt;element name="track2Status" type="{http://www.litle.com/schema}trackStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mposType", propOrder = {
    "ksn",
    "formatId",
    "encryptedTrack",
    "track1Status",
    "track2Status"
})
public class MposType {

    @XmlElement(required = true)
    protected String ksn;
    @XmlElement(required = true)
    protected String formatId;
    @XmlElement(required = true)
    protected String encryptedTrack;
    protected int track1Status;
    protected int track2Status;

    /**
     * Gets the value of the ksn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKsn() {
        return ksn;
    }

    /**
     * Sets the value of the ksn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKsn(String value) {
        this.ksn = value;
    }

    /**
     * Gets the value of the formatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatId() {
        return formatId;
    }

    /**
     * Sets the value of the formatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatId(String value) {
        this.formatId = value;
    }

    /**
     * Gets the value of the encryptedTrack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedTrack() {
        return encryptedTrack;
    }

    /**
     * Sets the value of the encryptedTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedTrack(String value) {
        this.encryptedTrack = value;
    }

    /**
     * Gets the value of the track1Status property.
     * 
     */
    public int getTrack1Status() {
        return track1Status;
    }

    /**
     * Sets the value of the track1Status property.
     * 
     */
    public void setTrack1Status(int value) {
        this.track1Status = value;
    }

    /**
     * Gets the value of the track2Status property.
     * 
     */
    public int getTrack2Status() {
        return track2Status;
    }

    /**
     * Sets the value of the track2Status property.
     * 
     */
    public void setTrack2Status(int value) {
        this.track2Status = value;
    }

}