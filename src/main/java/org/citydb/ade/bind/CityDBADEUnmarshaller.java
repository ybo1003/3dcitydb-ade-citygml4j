/*
 * 3D City Database - The Open Source CityGML Database
 * https://www.3dcitydb.org/
 *
 * Copyright 2013 - 2021
 * Chair of Geoinformatics
 * Technical University of Munich, Germany
 * https://www.lrg.tum.de/gis/
 *
 * The 3D City Database is jointly developed with the following
 * cooperation partners:
 *
 * Virtual City Systems, Berlin <https://vc.systems/>
 * M.O.S.S. Computer Grafik Systeme GmbH, Taufkirchen <http://www.moss.de/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citydb.ade.bind;

import org.citydb.ade.model.*;
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
