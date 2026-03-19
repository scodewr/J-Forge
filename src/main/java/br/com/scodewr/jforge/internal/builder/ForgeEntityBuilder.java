package br.com.scodewr.jforge.internal.builder;

import br.com.scodewr.jforge.internal.model.FAttribute;

public interface ForgeEntityBuilder<T> {
    ForgeEntityBuilder<T> attribute(FAttribute attribute);
    T build();
}
