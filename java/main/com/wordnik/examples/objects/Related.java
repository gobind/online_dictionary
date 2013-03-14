//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.08 at 10:00:24 AM PST 
//


package com.wordnik.examples.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for related complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="related">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wordstrings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wordstring" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="gram" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "related", propOrder = {
    "wordstrings"
})
public class Related {

    protected Related.Wordstrings wordstrings;
    @XmlAttribute
    protected String gram;
    @XmlAttribute
    protected String relType;

    /**
     * Gets the value of the wordstrings property.
     * 
     * @return
     *     possible object is
     *     {@link Related.Wordstrings }
     *     
     */
    public Related.Wordstrings getWordstrings() {
        return wordstrings;
    }

    /**
     * Sets the value of the wordstrings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Related.Wordstrings }
     *     
     */
    public void setWordstrings(Related.Wordstrings value) {
        this.wordstrings = value;
    }

    /**
     * Gets the value of the gram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGram() {
        return gram;
    }

    /**
     * Sets the value of the gram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGram(String value) {
        this.gram = value;
    }

    /**
     * Gets the value of the relType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelType() {
        return relType;
    }

    /**
     * Sets the value of the relType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelType(String value) {
        this.relType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="wordstring" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "wordstring"
    })
    public static class Wordstrings {

        protected List<String> wordstring;

        /**
         * Gets the value of the wordstring property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wordstring property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWordstring().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWordstring() {
            if (wordstring == null) {
                wordstring = new ArrayList<String>();
            }
            return this.wordstring;
        }

    }

}