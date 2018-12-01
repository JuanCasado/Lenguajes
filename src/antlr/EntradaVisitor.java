package antlr;

import java.util.*;

class EntradaVisitor extends EntradaParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;
    private HashContenedor file;

    public EntradaVisitor () {
        contenedor = new HashContenedor("entrada");
    }

    @Override
    public HashContenedor visitInit(EntradaParser.InitContext ctx) {
        System.out.println("init");
        for (EntradaParser.Tipo_archivoContext tipoArchivo : ctx.tipo_archivo()) {
            file = new HashContenedor("file");
            visitChild(ctx.tipo_archivo());
            contenedor.addNode(file);
        }
        for (EntradaParser.ParametrosContext parametros : ctx.parametros()) {
            System.out.println("parametro nuevo");
            //visit(parametros);
        }
        return contenedor;
    }
    
    @Override
    public HashContenedor visitJson(EntradaParser.JsonContext ctx) {
        visit(ctx.path_json());
        return null ;
    }
    @Override
    public HashContenedor visitPath_json(EntradaParser.Path_jsonContext ctx) {
        HashContenedor json = new HashContenedor("json");
        json.addFinal("path", ctx.rutafichero().getText());
        json.addFinal("file", ctx.variable().getText()+".json");
        file.addNode(json);
        return null;
    }

    @Override
    public HashContenedor visitSvg(EntradaParser.SvgContext ctx) {
        visit(ctx.path_svg());
        return null;
    }
    @Override
    public HashContenedor visitPath_svg(EntradaParser.Path_svgContext ctx) {
        HashContenedor svg = new HashContenedor("svg");
        svg.addFinal("path", ctx.rutafichero().getText());
        svg.addFinal("file", ctx.variable().getText() + ".svg");
        file.addNode(svg);
        return null;
    }

    @Override
    public HashContenedor visitDot(EntradaParser.DotContext ctx) {
        visit(ctx.path_dot());
        return null;
    }
    @Override
    public HashContenedor visitPath_dot(EntradaParser.Path_dotContext ctx) {
        HashContenedor dot = new HashContenedor("svg");
        dot.addFinal("path", ctx.rutafichero().getText());
        dot.addFinal("file", ctx.variable().getText() + ".dot");
        file.addNode(dot);
        return null;
    }

    @Override
    public HashContenedor visitCsv(EntradaParser.CsvContext ctx) {
        return visit(ctx.csv());
    }
    @Override
    public HashContenedor visitPath_csv(EntradaParser.Path_csvContext ctx) {
        HashContenedor csv = new HashContenedor("svg");
        csv.addFinal("path", ctx.rutafichero().getText());
        csv.addFinal("file", ctx.variable().getText() + ".csv");
        file.addNode(csv);
        return null;
    }
}