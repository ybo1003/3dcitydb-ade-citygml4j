package org.citydb.ade.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class CountryProperty extends ADEGenericApplicationProperty<String> {

    private CountryProperty() {
    }

    public CountryProperty(String value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new CountryProperty(), copyBuilder);
    }
}
