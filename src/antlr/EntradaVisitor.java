package antlr;

import java.util.*;

class EntradaVisitor extends EntradaParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;
    private HashContenedor file;
    private HashContenedor parametros;
    private String cadena;

    public EntradaVisitor () {
        contenedor = new HashContenedor("entrada");
    }

    @Override
    public HashContenedor visitInit(EntradaParser.InitContext ctx) {
        if (ctx.tipo_archivo()!=null){
            file = new HashContenedor("file");
            for (EntradaParser.Tipo_archivoContext tipoArchivo : ctx.tipo_archivo()) {
                visitChildren(tipoArchivo);
            }
            contenedor.addNode(file);
        }
        if (ctx.parametros()!=null){
            parametros = new HashContenedor("parametros");
            for (EntradaParser.ParametrosContext parametros : ctx.parametros()) {
                visitChildren(parametros);
            }
            contenedor.addNode(parametros);
        }
        return contenedor;
    }
    
    //ARCHIVOS
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
        return visit(ctx.path_csv());
    }
    @Override
    public HashContenedor visitPath_csv(EntradaParser.Path_csvContext ctx) {
        HashContenedor csv = new HashContenedor("svg");
        csv.addFinal("path", ctx.rutafichero().getText());
        csv.addFinal("file", ctx.variable().getText() + ".csv");
        file.addNode(csv);
        return null;
    }

    //PARAMETROS
    @Override
    public HashContenedor visitLen(EntradaParser.LenContext ctx) {
        String tag = "len";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
        parametros.addFinal(tag, ctx.numero().getText());
        return null;
    }
    
    @Override
    public HashContenedor visitFontcolor(EntradaParser.FontcolorContext ctx) {
        String tag = "fontcol";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
        if (ctx.kw_edge()!=null){
            tag += "edge";
        } else if (ctx.kw_node()!=null){
            tag += "node";
        }
        if (ctx.cadena()!=null){
            visit(ctx.cadena());
            parametros.addFinal(tag, cadena);
        } else if (ctx.variable()!=null){
            parametros.addFinal(tag, ctx.variable().getText());
        }
        return null;
    }
    
    @Override
    public HashContenedor visitFontname(EntradaParser.FontnameContext ctx) {
        String tag = "fontname";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
        if (ctx.kw_edge()!=null){
            tag += "edge";
        } else if (ctx.kw_node()!=null){
            tag += "node";
        }
        if (ctx.cadena()!=null){
            visit(ctx.cadena());
            parametros.addFinal(tag, cadena);
        } else if (ctx.variable()!=null){
            parametros.addFinal(tag, ctx.variable().getText());
        }
        return null;
    }
    
    @Override
    public HashContenedor visitFontsize(EntradaParser.FontsizeContext ctx) {
        String tag = "fontsize";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
        if (ctx.kw_edge()!=null){
            tag += "edge";
        } else if (ctx.kw_node()!=null){
            tag += "node";
        }
        parametros.addFinal(tag,ctx.numero().getText());
        return null;
    }

    @Override
    public HashContenedor visitArrowsize(EntradaParser.ArrowsizeContext ctx) {
        String tag = "arrowsize";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
        if (ctx.kw_edge()!=null){
            tag += "edge";
        } else if (ctx.kw_node()!=null){
            tag += "node";
        }
        parametros.addFinal(tag,ctx.numero().getText());
        return null;
    }

    @Override
    public HashContenedor visitArrowcolor(EntradaParser.ArrowcolorContext ctx) {
        String tag = "arrowcol";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
        if (ctx.kw_edge()!=null){
            tag += "edge";
        } else if (ctx.kw_node()!=null){
            tag += "node";
        }
        if (ctx.cadena()!=null){
            visit(ctx.cadena());
            parametros.addFinal(tag, cadena);
        } else if (ctx.variable()!=null){
            parametros.addFinal(tag, ctx.variable().getText());
        }
        return null;
    }

    @Override
    public HashContenedor visitPenwidth(EntradaParser.PenwidthContext ctx) {
        String tag = "penwidth";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
       if (ctx.kw_edge()!=null){
            tag += "edge";
        } else if (ctx.kw_node()!=null){
            tag += "node";
        }
        parametros.addFinal(tag,ctx.numero().getText());
        return null;
    }

    @Override
    public HashContenedor visitFillcolor(EntradaParser.FillcolorContext ctx) {
        String tag = "fillcol";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
        if (ctx.kw_edge()!=null){
            tag += "edge";
        } else if (ctx.kw_node()!=null){
            tag += "node";
        }
        if (ctx.cadena()!=null){
            visit(ctx.cadena());
            parametros.addFinal(tag, cadena);
        } else if (ctx.variable()!=null){
            parametros.addFinal(tag, ctx.variable().getText());
        }
        return null;
    }
    
    @Override
    public HashContenedor visitStyle(EntradaParser.StyleContext ctx) {
        String tag = "style";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
        if (ctx.kw_edge()!=null){
            tag += "edge";
        } else if (ctx.kw_node()!=null){
            tag += "node";
        }
        if (ctx.cadena()!=null){
            visit(ctx.cadena());
            parametros.addFinal(tag, cadena);
        } else if (ctx.variable()!=null){
            parametros.addFinal(tag, ctx.variable().getText());
        }
        return null;
    }
    
    @Override
    public HashContenedor visitShape(EntradaParser.ShapeContext ctx) {
        String tag = "shape";
        if (ctx.kw_relationship()!=null){
            tag += "rel";
        } else if (ctx.kw_class()!=null){
            tag += "class";
        } else if (ctx.kw_inheritance() != null) {
            tag += "inher";
        } else if (ctx.kw_inderect_use() != null) {
            tag += "inder";
        }
        if (ctx.kw_edge()!=null){
            tag += "edge";
        } else if (ctx.kw_node()!=null){
            tag += "node";
        }
        if (ctx.cadena()!=null){
            visit(ctx.cadena());
            parametros.addFinal(tag, cadena);
        } else if (ctx.variable()!=null){
            parametros.addFinal(tag, ctx.variable().getText());
        }
        return null;
    }
    
    @Override
    public HashContenedor visitCadena(EntradaParser.CadenaContext ctx) {
        cadena = "";
        if (ctx.texto_cadena()!=null){
            for (EntradaParser.Texto_cadenaContext fragment : ctx.texto_cadena()){
                cadena += fragment.getText();
            }
        }
        return null;
    }
}