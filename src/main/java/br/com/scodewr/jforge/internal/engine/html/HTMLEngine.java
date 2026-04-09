package br.com.scodewr.jforge.internal.engine.html;

import br.com.scodewr.jforge.api.model.EntityRepresentation;
import br.com.scodewr.jforge.internal.engine.ForgeEngine;
import br.com.scodewr.jforge.internal.transform.entity.EntityRepresentationTransform;
import br.com.scodewr.jforge.internal.transform.html.HTMLForgeTransform;

import java.io.File;

public class HTMLEngine implements ForgeEngine {

    private HTMLForgeTransform htmlForgeTransform;
    private EntityRepresentationTransform entityRepresentationTransform;

    @Override
    public File fromJson(String json) {
        var er = entityRepresentationTransform.fromJson(json);
        var html = htmlForgeTransform.process(er.fAttributes());
        return new File(html);
    }

    @Override
    public File fromEntity(EntityRepresentation entityRepresentation) {
        var html = htmlForgeTransform.process(entityRepresentation.fAttributes());
        return new File(html);
    }
}
