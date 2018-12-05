
import java.util.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import jdk.nashorn.internal.parser.JSONParser;

public class JsonVisitor extends JsonParserBaseVisitor<Integer> {

    private JSONTable tablaJSON;

    public JsonVisitor(JSONTable jsonT) {
        tablaJSON = jsonT;
    }

    @Override
    public Integer visitInit(JsonParser.InitContext ctx) {
        visit(ctx.graphs());
        return 0;
    }

    @Override
    public Integer visitGraphs(JsonParser.GraphsContext ctx) {
        if (ctx.lista() != null) {
            for (JsonParser.ListaContext numList : ctx.lista()) {
                visit(numList);
            }
        }
        return 0;
    }

    @Override
    public Integer visitLista(JsonParser.ListaContext ctx) {
        if (ctx.objetos() != null) {
            for (JsonParser.ObjetosContext numObj : ctx.objetos()) {
                visit(numObj);
            }
        }
        return 0;
    }

    @Override
    public Integer visitObjetos(JsonParser.ObjetosContext ctx) {
        if (ctx.prop() != null) {
            for (JsonParser.PropContext numProp : ctx.prop()) {
                visit(numProp);
            }
        }
        return 0;
    }

    @Override
    public Integer visitProp(JsonParser.PropContext ctx) {
        if (ctx.pclass() != null) {
            visit(ctx.pclass());

        } else if (ctx.relationship() != null) {
            visit(ctx.relationship());
        } else if (ctx.property() != null) {
            visit(ctx.property());
        } else if (ctx.languageProperty() != null) {
            visit(ctx.languageProperty());
        }
        return 0;
    }

    @Override
    public Integer visitPclass(JsonParser.PclassContext ctx) {
        String label = "";
        String contenido = "";
        // Añadimos el id a la tabla de simbolos
        tablaJSON.addId(ctx.id(0).ruta().getText());
        // Añadimos el nombre a la tabla de simbolos
        tablaJSON.addName(ctx.name(0).nombre().getText());

        // Lo guardamos en clase
        if (ctx.label() != null) {
            if (ctx.label(0) != null) {
                JsonParser.Ampli_infoContext ampliInfo = ctx.label(0).ampli_info();
                if (ampliInfo.descripcion() != null) {
                    if (ampliInfo.descripcion(0) != null) {
                        label = ampliInfo.descripcion(0).getText();
                        if (ampliInfo.ampli_info_content(0) != null) {
                            if (ampliInfo.ampli_info_content() != null) {
                                contenido = ampliInfo.ampli_info_content(0).getText();
                            }
                            System.out.println(label);
                            System.out.println(contenido);
                        }
                    }
                }
            }
            // tablaJSON.addLabel(label, contenido);
        }

        /*
         * //Lo guardamos en relaciones if (ctx.inherits()!=null)
         * tablaJSON.addRelaciones(ctx.name().nombre.getText); //la ruta del inherits es
         * el to tablaJSON.addRelaciones(ctx.inherits().ruta().getText());
         * 
         * if (ctx.properties()!=null) // Properties es lo que tenemos que añadir al
         * arraylist de clase tablaJSON.addProperties();
         */
        return 0;
    }

}