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
    public void exitTextojson(EntradaParser.TextojsonContext ctx) {
        _tablasimbolos.addJSON(ctx.getText());
    }

    @Override
    public void exitTextosvg(EntradaParser.TextosvgContext ctx) {
        _tablasimbolos.addSVG(ctx.getText());
    }

    @Override
    public void exitTextodot(EntradaParser.TextodotContext ctx) {
        _tablasimbolos.addDOT(ctx.getText());
    }

    @Override
    public void exitTextocsv(EntradaParser.TextocsvContext ctx) {
        _tablasimbolos.addCSV(ctx.getText());
    }

    @Override
    public void exitLen(EntradaParser.LenContext ctx) {
        _tablasimbolos.addParameters(ctx.len_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitFontcolor(EntradaParser.FontcolorContext ctx) {
        _tablasimbolos.addParameters(ctx.fontcolor_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitFontname(EntradaParser.FontnameContext ctx) {
        _tablasimbolos.addParameters(ctx.fontname_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitFontsize(EntradaParser.FontsizeContext ctx) {
        _tablasimbolos.addParameters(ctx.fontsize_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitArrowsize(EntradaParser.ArrowsizeContext ctx) {
        _tablasimbolos.addParameters(ctx.arrowsize_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitArrowcolor(EntradaParser.ArrowcolorContext ctx) {
        _tablasimbolos.addParameters(ctx.arrowcolor_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitPenwidth(EntradaParser.PenwidthContext ctx) {
        _tablasimbolos.addParameters(ctx.penwidth_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitFillcolor(EntradaParser.FillcolorContext ctx) {
        _tablasimbolos.addParameters(ctx.fillcolor_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitStyle(EntradaParser.StyleContext ctx) {
        _tablasimbolos.addParameters(ctx.style_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitShape(EntradaParser.ShapeContext ctx) {
        _tablasimbolos.addParameters(ctx.shape_name().getText(), ctx.textoparam().getText());
    }
}