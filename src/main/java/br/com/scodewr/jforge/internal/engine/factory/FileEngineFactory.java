package br.com.scodewr.jforge.internal.engine.factory;

import br.com.scodewr.jforge.api.format.ForgeFormat;
import br.com.scodewr.jforge.internal.engine.ForgeEngine;
import br.com.scodewr.jforge.internal.engine.html.HTMLEngine;

import java.util.Map;

public class FileEngineFactory {

    private FileEngineFactory(){}

    private static final Map<ForgeFormat, ForgeEngine> ENGINES =
            Map.of(
                    ForgeFormat.HTML, new HTMLEngine()
            );

    public static ForgeEngine engine(ForgeFormat forgeFormat) {
        return ENGINES.get(forgeFormat);
    }
}
