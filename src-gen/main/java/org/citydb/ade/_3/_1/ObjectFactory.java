//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Jun 08 10:15:46 CEST 2021
//


package org.citydb.ade._3._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.citydb.ade._3._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LastModificationDate_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "lastModificationDate");
    private final static QName _UpdatingPerson_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "updatingPerson");
    private final static QName _ReasonForUpdate_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "reasonForUpdate");
    private final static QName _Lineage_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "lineage");
    private final static QName _Street_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "street");
    private final static QName _HouseNumber_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "houseNumber");
    private final static QName _PoBox_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "poBox");
    private final static QName _ZipCode_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "zipCode");
    private final static QName _City_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "city");
    private final static QName _State_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "state");
    private final static QName _Country_QNAME = new QName("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", "country");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.citydb.ade._3._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "lastModificationDate", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
    public JAXBElement<XMLGregorianCalendar> createLastModificationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastModificationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "updatingPerson", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
    public JAXBElement<String> createUpdatingPerson(String value) {
        return new JAXBElement<String>(_UpdatingPerson_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "reasonForUpdate", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
    public JAXBElement<String> createReasonForUpdate(String value) {
        return new JAXBElement<String>(_ReasonForUpdate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "lineage", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
    public JAXBElement<String> createLineage(String value) {
        return new JAXBElement<String>(_Lineage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "street", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfAddress")
    public JAXBElement<String> createStreet(String value) {
        return new JAXBElement<String>(_Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "houseNumber", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfAddress")
    public JAXBElement<String> createHouseNumber(String value) {
        return new JAXBElement<String>(_HouseNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "poBox", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfAddress")
    public JAXBElement<String> createPoBox(String value) {
        return new JAXBElement<String>(_PoBox_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "zipCode", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfAddress")
    public JAXBElement<String> createZipCode(String value) {
        return new JAXBElement<String>(_ZipCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "city", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfAddress")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "state", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfAddress")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0", name = "country", substitutionHeadNamespace = "http://www.opengis.net/citygml/1.0", substitutionHeadName = "_GenericApplicationPropertyOfAddress")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

}
