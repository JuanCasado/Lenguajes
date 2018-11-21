import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import entradaParser.ParametrosContext;

public class entradaVisitor<T> extends AbstractParseTreeVisitor<T> implements entradaParserVisitor<T> {

    @Override
    public T visitFichero(entradaParser.FicheroContext ctx) {
        
        for (Tipo_archivoContext archivo : ctx.tipo_archivo()){
            
        }
        for (ParametrosContext parametro : ctx.parametros()) {

        }
        return visitChildren(ctx);
    }

    @Override
    public T visitComentario(entradaParser.ComentarioContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitAuthorcom(entradaParser.AuthorcomContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitDescrcom(entradaParser.DescrcomContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitTargcom(entradaParser.TargcomContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitTextos(entradaParser.TextosContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitRutafichero(entradaParser.RutaficheroContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitTipo_archivo(entradaParser.Tipo_archivoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitJson(entradaParser.JsonContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitSvg(entradaParser.SvgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitDot(entradaParser.DotContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitCsv(entradaParser.CsvContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitWsci(entradaParser.WsciContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitWhite_space(entradaParser.White_spaceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitBarra(entradaParser.BarraContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitIntro(entradaParser.IntroContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitLetra(entradaParser.LetraContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitNumero(entradaParser.NumeroContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitVariable(entradaParser.VariableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitSap(entradaParser.SapContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitScp(entradaParser.ScpContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitAsig(entradaParser.AsigContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitOpasig(entradaParser.OpasigContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitOpblt(entradaParser.OpbltContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitOpbgt(entradaParser.OpbgtContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitComa(entradaParser.ComaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitDos_ptos(entradaParser.Dos_ptosContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitPunto(entradaParser.PuntoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitDoblepunto(entradaParser.DoblepuntoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitCadena(entradaParser.CadenaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitBbaja(entradaParser.BbajaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitCor_abrir(entradaParser.Cor_abrirContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitCor_Cerrar(entradaParser.Cor_CerrarContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_json(entradaParser.Kw_jsonContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitExtension_json(entradaParser.Extension_jsonContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_svg(entradaParser.Kw_svgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitExtension_svg(entradaParser.Extension_svgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_dot(entradaParser.Kw_dotContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitExtension_dot(entradaParser.Extension_dotContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_csv(entradaParser.Kw_csvContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitExtension_csv(entradaParser.Extension_csvContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitParametros(entradaParser.ParametrosContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitLen(entradaParser.LenContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFontcolor(entradaParser.FontcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFontname(entradaParser.FontnameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFontsize(entradaParser.FontsizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitArrowsize(entradaParser.ArrowsizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitArrowcolor(entradaParser.ArrowcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitPenwidth(entradaParser.PenwidthContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFillcolor(entradaParser.FillcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitStyle(entradaParser.StyleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitShape(entradaParser.ShapeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_edge(entradaParser.Kw_edgeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_node(entradaParser.Kw_nodeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_relationship(entradaParser.Kw_relationshipContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_class(entradaParser.Kw_classContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_property(entradaParser.Kw_propertyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_inheritance(entradaParser.Kw_inheritanceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_inderect_use(entradaParser.Kw_inderect_useContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_len(entradaParser.Kw_lenContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_fontcolor(entradaParser.Kw_fontcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_fontname(entradaParser.Kw_fontnameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_fontsize(entradaParser.Kw_fontsizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_arrowsize(entradaParser.Kw_arrowsizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_arrowcolor(entradaParser.Kw_arrowcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_penwidth(entradaParser.Kw_penwidthContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_fillcolor(entradaParser.Kw_fillcolorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_style(entradaParser.Kw_styleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitKw_shape(entradaParser.Kw_shapeContext ctx) {
        return visitChildren(ctx);
    }
}