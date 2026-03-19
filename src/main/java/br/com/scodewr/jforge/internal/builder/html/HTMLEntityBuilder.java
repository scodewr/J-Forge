package br.com.scodewr.jforge.internal.builder.html;

import br.com.scodewr.jforge.internal.builder.ForgeEntityBuilder;
import br.com.scodewr.jforge.internal.model.FAttribute;
import br.com.scodewr.jforge.internal.engine.html.HTMLEngine;
import br.com.scodewr.jforge.internal.transform.html.HTMLForgeTransform;
import j2html.tags.specialized.HtmlTag;

import java.util.List;

public class HTMLEntityBuilder implements ForgeEntityBuilder<HtmlTag> {

    private List<FAttribute> attributes;
    private HTMLForgeTransform transformer;

    @Override
    public HtmlTag build() {
        return transformer.process(this);
    }

    @Override
    public ForgeEntityBuilder<HtmlTag> attribute(FAttribute attribute) {
        this.attributes.add(attribute);
        return this;
    }
}
