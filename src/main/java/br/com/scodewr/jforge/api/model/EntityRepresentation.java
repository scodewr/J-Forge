package br.com.scodewr.jforge.api.model;

import br.com.scodewr.jforge.internal.model.FAttribute;

import java.util.List;

public record EntityRepresentation
        (String name, String inputType, String outputType, List<FAttribute> fAttributes) {}