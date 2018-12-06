import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class JSONListener extends JSONParserBaseListener {
    public static final String CAMPO_VACIO = "";
    private JSONTable _tablasimbolos;

    private JSONListener() {
        super();
    }

    public JSONListener(JSONTable p_ts) {
        super();
        _tablasimbolos = p_ts;
    }

    @Override
    public void enterGraph(JSONParser.GraphContext ctx) {
        // System.out.println(ctx.getParent().getParent().getParent().getStart().getText());
        _tablasimbolos.addGrafo(ctx.getParent().getParent().getParent().getStart().getText());
    }

    @Override
    public void enterArbol(JSONParser.ArbolContext ctx) {
        // System.out.println(ctx.getParent().getParent().getParent().getStart().getText());
        _tablasimbolos.addGrafo(ctx.getParent().getParent().getParent().getStart().getText());
    }

    @Override
    public void enterValor_id(JSONParser.Valor_idContext ctx) {
        // System.out.println(ctx.getText());
        String cadena = ctx.getText();
        if (cadena.contains("class#")) {
            _tablasimbolos.addClase(cadena);
        } else if (cadena.contains("relationship#")) {
            _tablasimbolos.addRelationship(cadena);
        } else if (cadena.contains("property#")) {
            _tablasimbolos.addProperty(cadena);
        }
    }

    @Override
    public void enterValor_gender(JSONParser.Valor_genderContext ctx) {
        _tablasimbolos.addPropertyGender(ctx.getText());
    }

    @Override
    public void enterValor_number(JSONParser.Valor_numberContext ctx) {
        _tablasimbolos.addPropertyNumber(ctx.getText());
    }

    @Override
    public void enterValor_word_type(JSONParser.Valor_word_typeContext ctx) {
        _tablasimbolos.addPropertyWordType(ctx.getText());
    }

    @Override
    public void enterValor_type_of(JSONParser.Valor_type_ofContext ctx) {
        _tablasimbolos.addPropertyTypeOf(ctx.getText());
    }

    @Override
    public void enterValor_is_list(JSONParser.Valor_is_listContext ctx) {
        _tablasimbolos.addPropertyIsList(ctx.getText());
    }

    @Override
    public void enterValor_optional(JSONParser.Valor_optionalContext ctx) {
        _tablasimbolos.addPropertyIsOptional(ctx.getText());
    }

    @Override
    public void enterValor_multiplicity_max(JSONParser.Valor_multiplicity_maxContext ctx) {
        _tablasimbolos.addPropertyMultiMax(ctx.getText());
    }

    @Override
    public void enterValor_multiplicity_min(JSONParser.Valor_multiplicity_minContext ctx) {
        _tablasimbolos.addPropertyMultiMin(ctx.getText());
    }

    @Override
    public void enterValor_reverse_name(JSONParser.Valor_reverse_nameContext ctx) {
        _tablasimbolos.addRelationshipReverseName(ctx.getText());
    }

    @Override
    public void enterValor_from(JSONParser.Valor_fromContext ctx) {
        _tablasimbolos.addRelationshipFrom(ctx.getText());
    }

    @Override
    public void enterValor_to(JSONParser.Valor_toContext ctx) {
        _tablasimbolos.addRelationshipTo(ctx.getText());
    }
}
