package br.com.scodewr.jforge.internal.builder.html;

import br.com.scodewr.jforge.internal.builder.ForgeEntityBuilder;
import br.com.scodewr.jforge.internal.model.FAttribute;
import br.com.scodewr.jforge.internal.transform.html.HTMLForgeTransform;
import j2html.rendering.FlatHtml;

import java.util.List;

public class HTMLEntityBuilder implements ForgeEntityBuilder<FlatHtml<StringBuilder>> {

    private List<FAttribute> attributes;
    private HTMLForgeTransform transformer;

    @Override
    public FlatHtml<StringBuilder> build() {
        return transformer.process(this);
    }

    @Override
    public ForgeEntityBuilder<FlatHtml<StringBuilder>> attribute(FAttribute attribute) {
        this.attributes.add(attribute);
        return this;
    }
}
