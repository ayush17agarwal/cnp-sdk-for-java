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


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.litle.com/schema}recurringTransactionResponseType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionId" type="{http://www.litle.com/schema}litleIdType"/>
 *         &lt;element name="tokenResponse" type="{http://www.litle.com/schema}tokenResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subscriptionId",
    "tokenResponse"
})
public class UpdateSubscriptionResponse
    extends RecurringTransactionResponseType
{

    protected long subscriptionId;
    protected TokenResponseType tokenResponse;

    /**
     * Gets the value of the subscriptionId property.
     * 
     */
    public long getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     */
    public void setSubscriptionId(long value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the tokenResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TokenResponseType }
     *     
     */
    public TokenResponseType getTokenResponse() {
        return tokenResponse;
    }

    /**
     * Sets the value of the tokenResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenResponseType }
     *     
     */
    public void setTokenResponse(TokenResponseType value) {
        this.tokenResponse = value;
    }

}