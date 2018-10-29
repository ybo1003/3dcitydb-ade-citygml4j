package org.citydb.ade.bind;

import org.citydb.ade.bind.marshal.CityDBADE100Marshaller;
import org.citydb.ade.bind.marshal.CityDBADE200Marshaller;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import javax.xml.bind.JAXBElement;

public class CityDBADEMarshaller implements ADEMarshaller {
   private ADEMarshaller marshaller;

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        marshaller = helper.getTargetCityGMLVersion() == CityGMLVersion.v1_0_0 ? new CityDBADE100Marshaller() : new CityDBADE200Marshaller();
        marshaller.setADEMarshallerHelper(helper);
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        return marshaller.marshalJAXBElement(src);
    }

    @Override
    public Object marshal(ADEModelObject src) {
        return marshaller.marshal(src);
    }

}
