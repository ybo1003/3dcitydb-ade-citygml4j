package org.citydb.ade.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

import java.time.ZonedDateTime;

public class LastModificationDateProperty extends ADEGenericApplicationProperty<ZonedDateTime> {

    private LastModificationDateProperty() {
    }

    public LastModificationDateProperty(ZonedDateTime value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LastModificationDateProperty(), copyBuilder);
    }
}
