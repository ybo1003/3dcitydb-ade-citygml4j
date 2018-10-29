package org.citydb.ade.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class LineageProperty extends ADEGenericApplicationProperty<String> {

    private LineageProperty() {
    }

    public LineageProperty(String value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LineageProperty(), copyBuilder);
    }
}
