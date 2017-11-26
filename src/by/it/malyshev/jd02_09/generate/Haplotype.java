//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.25 at 12:15:19 AM EET 
//


package by.it.malyshev.jd02_09.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Haplotype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Haplotype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STRmarkers" type="{http://by/it/malyshev/jd02_09/generate}STRmarkers" maxOccurs="unbounded"/>
 *         &lt;element name="SNPs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Haplotype", propOrder = {
    "stRmarkers",
    "snPs"
})
public class Haplotype {

    @XmlElement(name = "STRmarkers", required = true)
    protected List<STRmarkers> stRmarkers;
    @XmlElement(name = "SNPs", required = true)
    protected String snPs;

    /**
     * Gets the value of the stRmarkers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stRmarkers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTRmarkers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STRmarkers }
     * 
     * 
     */
    public List<STRmarkers> getSTRmarkers() {
        if (stRmarkers == null) {
            stRmarkers = new ArrayList<>();
        }
        return this.stRmarkers;
    }

    /**
     * Gets the value of the snPs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNPs() {
        return snPs;
    }

    /**
     * Sets the value of the snPs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNPs(String value) {
        this.snPs = value;
    }

    @Override
    public String toString() {
        return "\n\t\t\tHaplotype{" +
                "\n\t\t\t\tSTRmarkers=" + stRmarkers +
                ", \n\t\t\t\tSNPs='" + snPs + '\'' +
                '}';
    }

}