package br.com.scodewr.jforge.api.engine;

import br.com.scodewr.jforge.api.format.ForgeFormat;
import br.com.scodewr.jforge.internal.engine.ForgeEngine;

public interface ForgeFile{
    ForgeEngine file(ForgeFormat forgeFormat, String json);
}
