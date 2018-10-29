package org.citydb.ade.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class HouseNumberProperty extends ADEGenericApplicationProperty<String> {

    private HouseNumberProperty() {
    }

    public HouseNumberProperty(String value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new HouseNumberProperty(), copyBuilder);
    }
}
