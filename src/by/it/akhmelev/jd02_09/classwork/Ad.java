//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.22 at 11:38:33 AM MSK 
//


package by.it.akhmelev.jd02_09.classwork;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Floors" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Square" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ad", propOrder = {

})
public class Ad {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Floor", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger floor;
    @XmlElement(name = "Floors", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger floors;
    @XmlElement(name = "Square")
    protected double square;
    @XmlElement(name = "Price")
    protected double price;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFloor(BigInteger value) {
        this.floor = value;
    }

    /**
     * Gets the value of the floors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFloors() {
        return floors;
    }

    /**
     * Sets the value of the floors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFloors(BigInteger value) {
        this.floors = value;
    }

    /**
     * Gets the value of the square property.
     * 
     */
    public double getSquare() {
        return square;
    }

    /**
     * Sets the value of the square property.
     * 
     */
    public void setSquare(double value) {
        this.square = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

}
