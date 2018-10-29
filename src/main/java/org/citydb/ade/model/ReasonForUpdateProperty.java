package org.citydb.ade.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class ReasonForUpdateProperty extends ADEGenericApplicationProperty<String> {

    private ReasonForUpdateProperty() {
    }

    public ReasonForUpdateProperty(String value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ReasonForUpdateProperty(), copyBuilder);
    }
}
