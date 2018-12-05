import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class EntradaListener extends EntradaParserBaseListener {
    public static final String CAMPO_VACIO = "";
    private EntradaTable _tablasimbolos;

    public EntradaListener() {
        super();
    }

    public EntradaListener(EntradaTable p_ts) {
        super();
        _tablasimbolos = p_ts;
    }

    @Override
    public void exitTipo_archivo(EntradaParser.Tipo_archivoContext ctx) {

    }

    @Override
    public void exitJson(EntradaParser.JsonContext ctx) {

    }

    @Override
    public void exitSvg(EntradaParser.SvgContext ctx) {
    }

    @Override
    public void exitDot(EntradaParser.DotContext ctx) {
    }

    @Override
    public void exitCsv(EntradaParser.CsvContext ctx) {
    }

    // PARAMETROS
    @Override
    public void exitParametros(EntradaParser.ParametrosContext ctx) {
    }

    @Override
    public void exitLen(EntradaParser.LenContext ctx) {
    }

    @Override
    public void exitFontcolor(EntradaParser.FontcolorContext ctx) {
    }

    @Override
    public void exitFontname(EntradaParser.FontnameContext ctx) {
    }

    @Override
    public void exitFontsize(EntradaParser.FontsizeContext ctx) {
    }

    @Override
    public void exitArrowsize(EntradaParser.ArrowsizeContext ctx) {
    }

    @Override
    public void exitArrowcolor(EntradaParser.ArrowcolorContext ctx) {
    }

    @Override
    public void exitPenwidth(EntradaParser.PenwidthContext ctx) {
    }

    @Override
    public void exitFillcolor(EntradaParser.FillcolorContext ctx) {
    }

    @Override
    public void exitStyle(EntradaParser.StyleContext ctx) {
    }

    @Override
    public void exitShape(EntradaParser.ShapeContext ctx) {
    }
}