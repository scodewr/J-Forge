package br.com.scodewr.jforge.internal.transform.html;

import br.com.scodewr.jforge.internal.builder.html.HTMLEntityBuilder;
import br.com.scodewr.jforge.internal.model.FAttribute;
import br.com.scodewr.reflectool.reflection.ClassReflect;
import j2html.rendering.FlatHtml;
import j2html.tags.ContainerTag;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class HTMLForgeTransform {

    //TODO implementar metodo
    public FlatHtml<StringBuilder> process(HTMLEntityBuilder builder){
        return null;
    }

    public String process(List<FAttribute> attributeList){
        var tagsList = new ArrayList<ContainerTag<?>>();

        for(FAttribute attribute : attributeList){
            var tag = getTag(attribute);
            tagsList.add(tag);
        }

        return html(tagsList);
    }

    private String html(List<ContainerTag<?>> tagsList) {
        FlatHtml<StringBuilder> builder = FlatHtml.inMemory();

        try {
            for (ContainerTag<?> tag : tagsList) {
                tag.render(builder);
            }
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }

        return builder.output().toString();
    }

    private ContainerTag<?> getTag(FAttribute attribute){
        var packageName = "j2html.TagCreator";
        var className = attribute.name();
        var aClass = ClassReflect.getClassByNameAndPackage(className, packageName);
        return initTag(aClass, attribute);
    }

    private ContainerTag<?> initTag(Class<?> aClass, FAttribute attribute) {

        try{
            var instance = aClass.getConstructor().newInstance();
            //tenho que pegar o método que vai ser usado pra settar o atributo da tag
            //depois de settar os atributos eu devolvo essa tag instanciada
            return (ContainerTag<?>) instance;
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e){
            //
            return null;
        }
    }
}
