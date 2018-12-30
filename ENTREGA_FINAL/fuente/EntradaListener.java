package fuente;

import fuente.GramEntrada.*;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class EntradaListener extends EntradaParserBaseListener {
    public static final String CAMPO_VACIO = "";
    private EntradaTable _tablasimbolos;

    private EntradaListener() {
        super();
    }

    public EntradaListener(EntradaTable p_ts) {
        super();
        _tablasimbolos = p_ts;
    }

    @Override
    public void exitTextojson(EntradaParser.TextojsonContext ctx) {
        // System.out.println(ctx.getText());
        _tablasimbolos.addJSON(ctx.getText());
    }

    @Override
    public void exitTextosvg(EntradaParser.TextosvgContext ctx) {
        // System.out.println(ctx.getText());
        _tablasimbolos.addSVG(ctx.getText());
    }

    @Override
    public void exitTextodot(EntradaParser.TextodotContext ctx) {
        // System.out.println(ctx.getText());
        _tablasimbolos.addDOT(ctx.getText());
    }

    @Override
    public void exitTextocsv(EntradaParser.TextocsvContext ctx) {
        // System.out.println(ctx.getText());
        _tablasimbolos.addCSV(ctx.getText());
    }

    @Override
    public void exitLen(EntradaParser.LenContext ctx) {
        // System.out.println(ctx.len_name().getText());
        _tablasimbolos.addParameters(ctx.len_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitFontcolor(EntradaParser.FontcolorContext ctx) {
        // System.out.println(ctx.fontcolor_name().getText());
        _tablasimbolos.addParameters(ctx.fontcolor_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitFontname(EntradaParser.FontnameContext ctx) {
        // System.out.println(ctx.fontname_name().getText());
        _tablasimbolos.addParameters(ctx.fontname_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitFontsize(EntradaParser.FontsizeContext ctx) {
        // System.out.println(ctx.fontsize_name().getText());
        _tablasimbolos.addParameters(ctx.fontsize_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitArrowsize(EntradaParser.ArrowsizeContext ctx) {
        // System.out.println(ctx.arrowsize_name().getText());
        _tablasimbolos.addParameters(ctx.arrowsize_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitArrowcolor(EntradaParser.ArrowcolorContext ctx) {
        // System.out.println(ctx.arrowcolor_name().getText());
        _tablasimbolos.addParameters(ctx.arrowcolor_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitPenwidth(EntradaParser.PenwidthContext ctx) {
        // System.out.println(ctx.penwidth_name().getText());
        _tablasimbolos.addParameters(ctx.penwidth_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitFillcolor(EntradaParser.FillcolorContext ctx) {
        // System.out.println(ctx.fillcolor_name().getText());
        _tablasimbolos.addParameters(ctx.fillcolor_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitStyle(EntradaParser.StyleContext ctx) {
        // System.out.println(ctx.style_name().getText());
        _tablasimbolos.addParameters(ctx.style_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitShape(EntradaParser.ShapeContext ctx) {
        // System.out.println(ctx.shape_name().getText());
        _tablasimbolos.addParameters(ctx.shape_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitColor(EntradaParser.ColorContext ctx) {
        // System.out.println(ctx.shape_name().getText());
        _tablasimbolos.addParameters(ctx.color_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitDir(EntradaParser.DirContext ctx) {
        // System.out.println(ctx.shape_name().getText());
        _tablasimbolos.addParameters(ctx.dir_name().getText(), ctx.textoparam().getText());
    }

    @Override
    public void exitArrowhead(EntradaParser.ArrowheadContext ctx) {
        // System.out.println(ctx.shape_name().getText());
        _tablasimbolos.addParameters(ctx.arrowhead_name().getText(), ctx.textoparam().getText());
    }
}