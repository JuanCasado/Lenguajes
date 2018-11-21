import javax.crypto.NullCipher;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class entradaVisitor extends AbstractParseTreeVisitor<String> implements entradaParserVisitor<String> {
    private entradaSimbols simbols;
    public entradaVisitor (entradaSimbols simbols){
        this.simbols = simbols;
    }

    @Override
    public String visitFichero(entradaParser.FicheroContext ctx) {
        simbols.addRow();
        for (entradaParser.Tipo_archivoContext archivo : ctx.tipo_archivo()){
            visitChildren(archivo);
        }
        for (entradaParser.ParametrosContext parametro : ctx.parametros()) {
            visitChildren(parametro);
        }
        return null;
    }

    @Override
    public String visitComentario(entradaParser.ComentarioContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAuthorcom(entradaParser.AuthorcomContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDescrcom(entradaParser.DescrcomContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitTargcom(entradaParser.TargcomContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCadena_abrir(entradaParser.Cadena_abrirContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitTipo_estruc(entradaParser.Tipo_estrucContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCadena_cerrar(entradaParser.Cadena_cerrarContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitTexto_comen(entradaParser.Texto_comenContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitTexto_cadena(entradaParser.Texto_cadenaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitRutafichero(entradaParser.RutaficheroContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitTipo_archivo(entradaParser.Tipo_archivoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitJson(entradaParser.JsonContext ctx) {
        visitChildren(ctx.rutafichero());
        visitChildren(ctx.variable());
        visitChildren(ctx.punto());
        visitChildren(ctx.extension_json());
        simbols.addJson();
        return visitChildren(ctx);
    }

    @Override
    public String visitSvg(entradaParser.SvgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDot(entradaParser.DotContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCsv(entradaParser.CsvContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitWsci(entradaParser.WsciContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitWhite_space(entradaParser.White_spaceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitBarra(entradaParser.BarraContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitIntro(entradaParser.IntroContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitLetra(entradaParser.LetraContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitNumero(entradaParser.NumeroContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitVariable(entradaParser.VariableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitSap(entradaParser.SapContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitScp(entradaParser.ScpContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAsig(entradaParser.AsigContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitOpasig(entradaParser.OpasigContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitOpblt(entradaParser.OpbltContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitOpbgt(entradaParser.OpbgtContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitComa(entradaParser.ComaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDos_ptos(entradaParser.Dos_ptosContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitPunto(entradaParser.PuntoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDoblepunto(entradaParser.DoblepuntoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCadena(entradaParser.CadenaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitBbaja(entradaParser.BbajaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCor_abrir(entradaParser.Cor_abrirContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCor_Cerrar(entradaParser.Cor_CerrarContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_json(entradaParser.Kw_jsonContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExtension_json(entradaParser.Extension_jsonContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_svg(entradaParser.Kw_svgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExtension_svg(entradaParser.Extension_svgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_dot(entradaParser.Kw_dotContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExtension_dot(entradaParser.Extension_dotContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_csv(entradaParser.Kw_csvContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExtension_csv(entradaParser.Extension_csvContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitParametros(entradaParser.ParametrosContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitLen(entradaParser.LenContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitFontcolor(entradaParser.FontcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitFontname(entradaParser.FontnameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitFontsize(entradaParser.FontsizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitArrowsize(entradaParser.ArrowsizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitArrowcolor(entradaParser.ArrowcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitPenwidth(entradaParser.PenwidthContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitFillcolor(entradaParser.FillcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitStyle(entradaParser.StyleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitShape(entradaParser.ShapeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_edge(entradaParser.Kw_edgeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_node(entradaParser.Kw_nodeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_relationship(entradaParser.Kw_relationshipContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_class(entradaParser.Kw_classContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_property(entradaParser.Kw_propertyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_inheritance(entradaParser.Kw_inheritanceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_inderect_use(entradaParser.Kw_inderect_useContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_len(entradaParser.Kw_lenContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_fontcolor(entradaParser.Kw_fontcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_fontname(entradaParser.Kw_fontnameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_fontsize(entradaParser.Kw_fontsizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_arrowsize(entradaParser.Kw_arrowsizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_arrowcolor(entradaParser.Kw_arrowcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_penwidth(entradaParser.Kw_penwidthContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_fillcolor(entradaParser.Kw_fillcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_style(entradaParser.Kw_styleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitKw_shape(entradaParser.Kw_shapeContext ctx) {
        return visitChildren(ctx);
    }
}