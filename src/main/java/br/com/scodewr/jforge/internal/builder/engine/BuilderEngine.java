package br.com.scodewr.jforge.internal.builder.engine;

import br.com.scodewr.jforge.api.builder.ForgeBuilder;
import br.com.scodewr.jforge.internal.builder.ForgeEntityBuilder;
import br.com.scodewr.jforge.internal.builder.factory.BuilderFactory;
import br.com.scodewr.jforge.api.format.ForgeFormat;

public class BuilderEngine implements ForgeBuilder {

    @Override
    public ForgeEntityBuilder<?> fromForgeFormat(ForgeFormat forgeFormat) {
        return BuilderFactory.builder(forgeFormat);
    }
}
