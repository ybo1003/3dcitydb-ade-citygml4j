package org.citydb.ade.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class UpdatingPersonProperty extends ADEGenericApplicationProperty<String> {

    private UpdatingPersonProperty() {
    }

    public UpdatingPersonProperty(String value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UpdatingPersonProperty(), copyBuilder);
    }
}
