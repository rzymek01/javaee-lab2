//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.16 at 12:30:48 AM CEST 
//


package pl.gda.pg.eti.kask.javaee.wieze;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zywiol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zywiol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="woda"/>
 *     &lt;enumeration value="ogien"/>
 *     &lt;enumeration value="ziemia"/>
 *     &lt;enumeration value="wiatr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zywiol")
@XmlEnum
public enum Zywiol {

    @XmlEnumValue("woda")
    WODA("woda"),
    @XmlEnumValue("ogien")
    OGIEN("ogien"),
    @XmlEnumValue("ziemia")
    ZIEMIA("ziemia"),
    @XmlEnumValue("wiatr")
    WIATR("wiatr");
    private final String value;

    Zywiol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Zywiol fromValue(String v) {
        for (Zywiol c: Zywiol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}