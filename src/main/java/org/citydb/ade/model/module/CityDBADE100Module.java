package org.citydb.ade.model.module;

import org.citydb.ade.CityDBADEContext;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Map;

public class CityDBADE100Module extends ADEModule {

    public CityDBADE100Module() {
        super("http://www.3dcitydb.org/citygml-ade/3.0/citygml/1.0",
                "citydb",
                "http://www.3dcitydb.org/citygml-ade/3.0/3dcitydb-ade-citygml-1.0.xsd",
                CityGMLVersion.v1_0_0);
    }

    @Override
    public URL getSchemaResource() {
        return CityDBADEContext.class.getResource("/org/citydb/ade/schema/3dcitydb-ade-citygml-1.0.xsd");
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return false;
    }

    @Override
    public boolean hasFeature(String name) {
        return false;
    }

    @Override
    public Class<? extends AbstractFeature> getFeatureClass(String name) {
        return null;
    }

    @Override
    public QName getFeatureName(Class<? extends AbstractFeature> featureClass) {
        return null;
    }

    @Override
    public Map<String, Class<? extends AbstractFeature>> getFeatures() {
        return null;
    }

    @Override
    public boolean isTopLevelFeature(String name) {
        return false;
    }
}
