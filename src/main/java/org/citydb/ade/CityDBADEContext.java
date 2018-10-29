package org.citydb.ade;

import org.citydb.ade.bind.CityDBADEMarshaller;
import org.citydb.ade.bind.CityDBADEUnmarshaller;
import org.citydb.ade.model.module.CityDBADE100Module;
import org.citydb.ade.model.module.CityDBADE200Module;
import org.citygml4j.model.citygml.ade.binding.ADEContext;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.module.ade.ADEModule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CityDBADEContext implements ADEContext {
    private final List<ADEModule> modules = Arrays.asList(new CityDBADE100Module(), new CityDBADE200Module());
    private final ADEMarshaller marshaller = new CityDBADEMarshaller();
    private final ADEUnmarshaller unmarshaller = new CityDBADEUnmarshaller();

    @Override
    public List<ADEModule> getADEModules() {
        return modules;
    }

    @Override
    public List<String> getModelPackageNames() {
        return Collections.singletonList("org.citydb.ade.model");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Arrays.asList("org.citydb.ade._3._1", "org.citydb.ade._3._2");
    }

    @Override
    public ADEMarshaller getADEMarshaller() {
        return marshaller;
    }

    @Override
    public ADEUnmarshaller getADEUnmarshaller() {
        return unmarshaller;
    }
}
