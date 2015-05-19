//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.07 at 01:41:53 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintSeverity-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstraintSeverity-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstraintSeverity-list")
@XmlEnum
public enum ConstraintSeverityList {


    /**
     * If the constraint is violated, the resource is
     * 						not conformant.
     * 					
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * If the constraint is violated, the resource is
     * 						conformant, but it is not necessarily following best practice.
     * 					
     * 
     */
    @XmlEnumValue("warning")
    WARNING("warning");
    private final java.lang.String value;

    ConstraintSeverityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConstraintSeverityList fromValue(java.lang.String v) {
        for (ConstraintSeverityList c: ConstraintSeverityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
