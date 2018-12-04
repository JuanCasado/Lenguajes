import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class EntradaListener extends EntradaParserBaseListener {

    private EntradaTable _tablasimbolos;

    /*
     * public EntradaListener() { super(); }
     * 
     * public EntradaListener(EntradaTable p_ts) { super(); _tablasimbolos = p_ts; }
     */

    @Override
    public void exitTipo_archivo(EntradaParser.Tipo_archivoContext ctx) {
        super.exitTipo_archivo(ctx);
    }

}