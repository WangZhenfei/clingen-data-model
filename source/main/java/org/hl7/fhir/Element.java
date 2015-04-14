//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.20 at 11:19:26 AM EST 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The base element used for all FHIR elements and resources - allows for them to be extended with extensions
 * 
 * <p>Java class for Element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://hl7.org/fhir}id-primitive" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Element", propOrder = {
    "extension"
})
@XmlSeeAlso({
    SampledDataDataType.class,
    Attachment.class,
    Base64Binary.class,
    AddressUse.class,
    HumanName.class,
    ScheduleRepeat.class,
    Boolean.class,
    CodeableConcept.class,
    Identifier.class,
    Instant.class,
    Coding.class,
    IdentifierUse.class,
    Uuid.class,
    ObservationRelationshipType.class,
    Period.class,
    UnitsOfTime.class,
    Date.class,
    DocumentReferenceStatus.class,
    Schedule.class,
    Oid.class,
    Range.class,
    Integer.class,
    QuantityCompararator.class,
    org.hl7.fhir.String.class,
    Address.class,
    SampledData.class,
    ResourceReference.class,
    Narrative.class,
    NarrativeStatus.class,
    DiagnosticOrderPriority.class,
    ObservationStatus.class,
    LocationStatus.class,
    Extension.class,
    LocationMode.class,
    ContactUse.class,
    ContactSystem.class,
    Code.class,
    ObservationReliability.class,
    Uri.class,
    SearchParamType.class,
    DateTime.class,
    Id.class,
    EventTiming.class,
    Ratio.class,
    NameUse.class,
    Quantity.class,
    ValueSetStatus.class,
    Contact.class,
    Decimal.class,
    BackboneElement.class,
    DiagnosticOrderStatus.class
})
public class Element {

    protected List<Extension> extension;
    @XmlAttribute(name = "id")
    protected java.lang.String id;

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}