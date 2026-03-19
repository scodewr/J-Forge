package br.com.scodewr.jforge.internal.builder.factory;

import br.com.scodewr.jforge.api.format.ForgeFormat;
import br.com.scodewr.jforge.internal.builder.ForgeEntityBuilder;
import br.com.scodewr.jforge.internal.builder.html.HTMLEntityBuilder;

import java.util.Map;

public class BuilderFactory {

    private BuilderFactory(){}

    private static final Map<ForgeFormat, ForgeEntityBuilder<?>> BUILDERS =
            Map.of(
                ForgeFormat.HTML, new HTMLEntityBuilder()
            );

    public static ForgeEntityBuilder<?> builder(ForgeFormat forgeFormat) {
        return BUILDERS.get(forgeFormat);
    }
}
