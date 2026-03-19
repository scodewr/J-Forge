package br.com.scodewr.jforge.api.mapper;

import br.com.scodewr.jforge.api.model.EntityRepresentation;

public interface ForgeEntityRepresentation {
    EntityRepresentation fromJson(String json);
}
