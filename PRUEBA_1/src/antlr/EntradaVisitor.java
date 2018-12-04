package antlr;

import java.util.*;

class EntradaVisitor extends EntradaParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;
    private HashContenedor file;
    private HashContenedor parametros;
    private String cadena;

    private final String l1[];
    private final String l1_f[];
    private final String l2_file[];
    private final String l2_parametros_f1[];
    private final String l2_parametros_f2[];
    private final String l2_parametros_f3[];

    public EntradaVisitor () {
        contenedor = new HashContenedor("entrada");
        l1 = EntradaTable.getl1();
        l1_f = EntradaTable.getl1_f();
        l2_file = EntradaTable.getl2_file();
        l2_parametros_f1 = EntradaTable.getl2_parametros_f1();
        l2_parametros_f2 = EntradaTable.getl2_parametros_f2();
        l2_parametros_f3 = EntradaTable.getl2_parametros_f3();
    }

    @Override
    public HashContenedor visitInit(EntradaParser.InitContext ctx) {
        if (ctx.tipo_archivo()!=null){
            file = new HashContenedor(l1[0]);
            for (EntradaParser.Tipo_archivoContext tipoArchivo : ctx.tipo_archivo()) {
                visitChildren(tipoArchivo);
            }
            contenedor.addNode(file);
        }
        if (ctx.parametros()!=null){
            parametros = new HashContenedor(l1[1]);
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
        HashContenedor json = new HashContenedor(l2_file[0]);
        json.addFinal(l1_f[0], ctx.rutafichero().getText());
        json.addFinal(l1_f[1], ctx.variable().getText()+"."+l2_file[0]);
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
        HashContenedor svg = new HashContenedor(l2_file[1]);
        svg.addFinal(l1_f[0], ctx.rutafichero().getText());
        svg.addFinal(l1_f[1], ctx.variable().getText() + "."+l2_file[1]);
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
        HashContenedor dot = new HashContenedor(l2_file[2]);
        dot.addFinal(l1_f[0], ctx.rutafichero().getText());
        dot.addFinal(l1_f[1], ctx.variable().getText() + "."+l2_file[2]);
        file.addNode(dot);
        return null;
    }

    @Override
    public HashContenedor visitCsv(EntradaParser.CsvContext ctx) {
        return visit(ctx.path_csv());
    }
    @Override
    public HashContenedor visitPath_csv(EntradaParser.Path_csvContext ctx) {
        HashContenedor csv = new HashContenedor(l2_file[3]);
        csv.addFinal(l1_f[0], ctx.rutafichero().getText());
        csv.addFinal(l1_f[1], ctx.variable().getText() + "."+l2_file[3]);
        file.addNode(csv);
        return null;
    }

    //PARAMETROS
    @Override
    public HashContenedor visitLen(EntradaParser.LenContext ctx) {
        String tag = l2_parametros_f1[0];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
        parametros.addFinal(tag, ctx.numero().getText());
        return null;
    }
    
    @Override
    public HashContenedor visitFontcolor(EntradaParser.FontcolorContext ctx) {
        String tag = l2_parametros_f1[1];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
        if (ctx.kw_edge()!=null){
            tag += l2_parametros_f3[0];
        } else if (ctx.kw_node()!=null){
            tag += l2_parametros_f3[1];
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
        String tag = l2_parametros_f1[2];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
        if (ctx.kw_edge()!=null){
            tag += l2_parametros_f3[0];
        } else if (ctx.kw_node()!=null){
            tag += l2_parametros_f3[1];
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
        String tag = l2_parametros_f1[3];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
        if (ctx.kw_edge()!=null){
            tag += l2_parametros_f3[0];
        } else if (ctx.kw_node()!=null){
            tag += l2_parametros_f3[1];
        }
        parametros.addFinal(tag,ctx.numero().getText());
        return null;
    }

    @Override
    public HashContenedor visitArrowsize(EntradaParser.ArrowsizeContext ctx) {
        String tag = l2_parametros_f1[4];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
        if (ctx.kw_edge()!=null){
            tag += l2_parametros_f3[0];
        } else if (ctx.kw_node()!=null){
            tag += l2_parametros_f3[1];
        }
        parametros.addFinal(tag,ctx.numero().getText());
        return null;
    }

    @Override
    public HashContenedor visitArrowcolor(EntradaParser.ArrowcolorContext ctx) {
        String tag = l2_parametros_f1[5];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
        if (ctx.kw_edge()!=null){
            tag += l2_parametros_f3[0];
        } else if (ctx.kw_node()!=null){
            tag += l2_parametros_f3[1];
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
        String tag = l2_parametros_f1[6];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
       if (ctx.kw_edge()!=null){
            tag += l2_parametros_f3[0];
        } else if (ctx.kw_node()!=null){
            tag += l2_parametros_f3[1];
        }
        parametros.addFinal(tag,ctx.numero().getText());
        return null;
    }

    @Override
    public HashContenedor visitFillcolor(EntradaParser.FillcolorContext ctx) {
        String tag = l2_parametros_f1[7];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
        if (ctx.kw_edge()!=null){
            tag += l2_parametros_f3[0];
        } else if (ctx.kw_node()!=null){
            tag += l2_parametros_f3[1];
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
        String tag = l2_parametros_f1[8];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
        if (ctx.kw_edge()!=null){
            tag += l2_parametros_f3[0];
        } else if (ctx.kw_node()!=null){
            tag += l2_parametros_f3[1];
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
        String tag = l2_parametros_f1[9];
        if (ctx.kw_relationship()!=null){
            tag += l2_parametros_f2[0];
        } else if (ctx.kw_class()!=null){
            tag += l2_parametros_f2[1];
        } else if (ctx.kw_inheritance() != null) {
            tag += l2_parametros_f2[2];
        } else if (ctx.kw_inderect_use() != null) {
            tag += l2_parametros_f2[3];
        }
        if (ctx.kw_edge()!=null){
            tag += l2_parametros_f3[0];
        } else if (ctx.kw_node()!=null){
            tag += l2_parametros_f3[1];
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