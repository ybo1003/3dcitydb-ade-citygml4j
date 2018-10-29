package org.citydb.ade.bind;

import org.citydb.ade.model.CityProperty;
import org.citydb.ade.model.CountryProperty;
import org.citydb.ade.model.HouseNumberProperty;
import org.citydb.ade.model.LastModificationDateProperty;
import org.citydb.ade.model.LineageProperty;
import org.citydb.ade.model.PoBoxProperty;
import org.citydb.ade.model.ReasonForUpdateProperty;
import org.citydb.ade.model.StateProperty;
import org.citydb.ade.model.StreetProperty;
import org.citydb.ade.model.UpdatingPersonProperty;
import org.citydb.ade.model.ZipBoxProperty;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.ZonedDateTime;

public class CityDBADEUnmarshaller implements ADEUnmarshaller {

    @Override
    public void setADEUnmarshallerHelper(ADEUnmarshallerHelper helper) {
        // nothing to do
    }

    @Override
    public ADEModelObject unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
        final Object value = src.getValue();

        // generic application properties
        switch (src.getName().getLocalPart()) {
            case "lastModificationDate":
                return new LastModificationDateProperty(unmarshalXMLGregorianCalendar((XMLGregorianCalendar) value));
            case "updatingPerson":
                return new UpdatingPersonProperty(value.toString());
            case "reasonForUpdate":
                return new ReasonForUpdateProperty(value.toString());
            case "lineage":
                return new LineageProperty(value.toString());
            case "street":
                return new StreetProperty(value.toString());
            case "houseNumber":
                return new HouseNumberProperty(value.toString());
            case "poBox":
                return new PoBoxProperty(value.toString());
            case "zipCode":
                return new ZipBoxProperty(value.toString());
            case "city":
                return new CityProperty(value.toString());
            case "state":
                return new StateProperty(value.toString());
            case "country":
                return new CountryProperty(value.toString());
        }

        return null;
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        return null;
    }

    private ZonedDateTime unmarshalXMLGregorianCalendar(XMLGregorianCalendar src) {
        return src != null ? ZonedDateTime.parse(src.toXMLFormat()) : null;
    }

}
