//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.16 at 12:30:48 AM CEST 
//


package pl.gda.pg.eti.kask.javaee.wieze;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="imie" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mana" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="zywiol" use="required" type="{http://www.eti.pg.gda.pl/kask/javaee/wieze}zywiol" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mag")
public class Mag {

    @XmlAttribute(required = true)
    protected String imie;
    @XmlAttribute(required = true)
    protected int mana;
    @XmlAttribute(required = true)
    protected Zywiol zywiol;
    @XmlAttribute(required = true)
    protected int id;

    /**
     * Gets the value of the imie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImie() {
        return imie;
    }

    /**
     * Sets the value of the imie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImie(String value) {
        this.imie = value;
    }

    /**
     * Gets the value of the mana property.
     * 
     */
    public int getMana() {
        return mana;
    }

    /**
     * Sets the value of the mana property.
     * 
     */
    public void setMana(int value) {
        this.mana = value;
    }

    /**
     * Gets the value of the zywiol property.
     * 
     * @return
     *     possible object is
     *     {@link Zywiol }
     *     
     */
    public Zywiol getZywiol() {
        return zywiol;
    }

    /**
     * Sets the value of the zywiol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zywiol }
     *     
     */
    public void setZywiol(Zywiol value) {
        this.zywiol = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}