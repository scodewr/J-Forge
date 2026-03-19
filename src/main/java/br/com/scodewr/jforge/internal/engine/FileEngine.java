package br.com.scodewr.jforge.internal.engine;

import br.com.scodewr.jforge.api.engine.ForgeFile;
import br.com.scodewr.jforge.api.format.ForgeFormat;
import br.com.scodewr.jforge.internal.engine.factory.FileEngineFactory;

public class FileEngine implements ForgeFile {
    @Override
    public ForgeEngine file(ForgeFormat forgeFormat, String json) {
        return FileEngineFactory.engine(forgeFormat);
    }

}
