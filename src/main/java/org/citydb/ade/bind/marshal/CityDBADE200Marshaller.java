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

package org.citydb.ade.bind.marshal;

import org.citydb.ade._3._2.ObjectFactory;
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
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.util.mapper.TypeMapper;

import javax.xml.bind.JAXBElement;
import java.util.GregorianCalendar;
import java.util.concurrent.locks.ReentrantLock;

public class CityDBADE200Marshaller implements ADEMarshaller {
    private final ReentrantLock lock = new ReentrantLock();
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;

    private TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            lock.lock();
            try {
                if (elementMapper == null) {
                    elementMapper = TypeMapper.<JAXBElement<?>>create()
                            .with(LastModificationDateProperty.class, this::createLastModificationDateProperty)
                            .with(UpdatingPersonProperty.class, this::createUpdatingPersonProperty)
                            .with(ReasonForUpdateProperty.class, this::createReasonForUpdateProperty)
                            .with(LineageProperty.class, this::createLineageProperty)
                            .with(StreetProperty.class, this::createStreetProperty)
                            .with(HouseNumberProperty.class, this::createHouseNumberProperty)
                            .with(PoBoxProperty.class, this::createPoBoxProperty)
                            .with(ZipBoxProperty.class, this::createZipBoxProperty)
                            .with(CityProperty.class, this::createCityProperty)
                            .with(StateProperty.class, this::createStateProperty)
                            .with(CountryProperty.class, this::createCountryProperty);
                }
            } finally {
                lock.unlock();
            }
        }

        return elementMapper;
    }

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        return getElementMapper().apply(src);
    }

    @Override
    public Object marshal(ADEModelObject src) {
        return null;
    }

    private JAXBElement<?> createLastModificationDateProperty(LastModificationDateProperty src) {
        if (src.isSetValue()) {
            GregorianCalendar gregorianCalendar = GregorianCalendar.from(src.getValue());
            return factory.createLastModificationDate(helper.getJAXBMarshaller().getDataTypeFactory().newXMLGregorianCalendar(gregorianCalendar));
        }

        return null;
    }

    private JAXBElement<?> createUpdatingPersonProperty(UpdatingPersonProperty src) {
        return factory.createUpdatingPerson(src.getValue());
    }

    private JAXBElement<?> createReasonForUpdateProperty(ReasonForUpdateProperty src) {
        return factory.createReasonForUpdate(src.getValue());
    }

    private JAXBElement<?> createLineageProperty(LineageProperty src) {
        return factory.createLineage(src.getValue());
    }

    private JAXBElement<?> createStreetProperty(StreetProperty src) {
        return factory.createStreet(src.getValue());
    }

    private JAXBElement<?> createHouseNumberProperty(HouseNumberProperty src) {
        return factory.createHouseNumber(src.getValue());
    }

    private JAXBElement<?> createPoBoxProperty(PoBoxProperty src) {
        return factory.createPoBox(src.getValue());
    }

    private JAXBElement<?> createZipBoxProperty(ZipBoxProperty src) {
        return factory.createZipCode(src.getValue());
    }

    private JAXBElement<?> createCityProperty(CityProperty src) {
        return factory.createCity(src.getValue());
    }

    private JAXBElement<?> createStateProperty(StateProperty src) {
        return factory.createState(src.getValue());
    }

    private JAXBElement<?> createCountryProperty(CountryProperty src) {
        return factory.createCountry(src.getValue());
    }

}
