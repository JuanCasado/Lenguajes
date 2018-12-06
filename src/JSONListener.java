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
        System.out.println(ctx.getParent().getParent().getParent().getStart().getText());
        _tablasimbolos.addGrafo(ctx.getParent().getParent().getParent().getStart().getText());
    }

    @Override
    public void enterArbol(JSONParser.ArbolContext ctx) {
        System.out.println(ctx.getParent().getParent().getParent().getStart().getText());
        _tablasimbolos.addGrafo(ctx.getParent().getParent().getParent().getStart().getText());
    }
}
