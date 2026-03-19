package br.com.scodewr.jforge.internal.engine;

import br.com.scodewr.jforge.api.model.EntityRepresentation;

import java.io.File;

public interface ForgeEngine {
    File fromJson(String json);
    File fromEntity(EntityRepresentation entityRepresentation);
}
