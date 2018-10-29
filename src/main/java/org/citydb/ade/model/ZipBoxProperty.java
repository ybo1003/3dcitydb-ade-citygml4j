package org.citydb.ade.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class ZipBoxProperty extends ADEGenericApplicationProperty<String> {

    private ZipBoxProperty() {
    }

    public ZipBoxProperty(String value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ZipBoxProperty(), copyBuilder);
    }
}
