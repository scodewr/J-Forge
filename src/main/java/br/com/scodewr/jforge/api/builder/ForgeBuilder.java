package br.com.scodewr.jforge.api.builder;

import br.com.scodewr.jforge.internal.builder.ForgeEntityBuilder;
import br.com.scodewr.jforge.api.format.ForgeFormat;

public interface ForgeBuilder {
    ForgeEntityBuilder<?> fromForgeFormat(ForgeFormat forgeFormat);
}
