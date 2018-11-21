// Generated from entradaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link entradaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface entradaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link entradaParser#fichero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFichero(entradaParser.FicheroContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(entradaParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#authorcom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorcom(entradaParser.AuthorcomContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#descrcom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescrcom(entradaParser.DescrcomContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#targcom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargcom(entradaParser.TargcomContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#textos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextos(entradaParser.TextosContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#rutafichero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRutafichero(entradaParser.RutaficheroContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#tipo_archivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_archivo(entradaParser.Tipo_archivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(entradaParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#svg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSvg(entradaParser.SvgContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(entradaParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsv(entradaParser.CsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#wsci}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWsci(entradaParser.WsciContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#white_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhite_space(entradaParser.White_spaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#barra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBarra(entradaParser.BarraContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#intro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntro(entradaParser.IntroContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#letra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetra(entradaParser.LetraContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(entradaParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(entradaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#sap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSap(entradaParser.SapContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#scp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScp(entradaParser.ScpContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(entradaParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#opasig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpasig(entradaParser.OpasigContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#opblt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpblt(entradaParser.OpbltContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#opbgt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpbgt(entradaParser.OpbgtContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComa(entradaParser.ComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#dos_ptos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDos_ptos(entradaParser.Dos_ptosContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#punto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunto(entradaParser.PuntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#doblepunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoblepunto(entradaParser.DoblepuntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(entradaParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#bbaja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBbaja(entradaParser.BbajaContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#cor_abrir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCor_abrir(entradaParser.Cor_abrirContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#cor_Cerrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCor_Cerrar(entradaParser.Cor_CerrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_json(entradaParser.Kw_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#extension_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_json(entradaParser.Extension_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_svg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_svg(entradaParser.Kw_svgContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#extension_svg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_svg(entradaParser.Extension_svgContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_dot(entradaParser.Kw_dotContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#extension_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_dot(entradaParser.Extension_dotContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_csv(entradaParser.Kw_csvContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#extension_csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_csv(entradaParser.Extension_csvContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(entradaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(entradaParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#fontcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontcolor(entradaParser.FontcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#fontname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontname(entradaParser.FontnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#fontsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontsize(entradaParser.FontsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#arrowsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowsize(entradaParser.ArrowsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#arrowcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowcolor(entradaParser.ArrowcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#penwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenwidth(entradaParser.PenwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#fillcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFillcolor(entradaParser.FillcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(entradaParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(entradaParser.ShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_edge(entradaParser.Kw_edgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_node(entradaParser.Kw_nodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_relationship}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_relationship(entradaParser.Kw_relationshipContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_class(entradaParser.Kw_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_property(entradaParser.Kw_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_inheritance(entradaParser.Kw_inheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_inderect_use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_inderect_use(entradaParser.Kw_inderect_useContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_len(entradaParser.Kw_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_fontcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_fontcolor(entradaParser.Kw_fontcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_fontname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_fontname(entradaParser.Kw_fontnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_fontsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_fontsize(entradaParser.Kw_fontsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_arrowsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_arrowsize(entradaParser.Kw_arrowsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_arrowcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_arrowcolor(entradaParser.Kw_arrowcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_penwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_penwidth(entradaParser.Kw_penwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_fillcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_fillcolor(entradaParser.Kw_fillcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_style(entradaParser.Kw_styleContext ctx);
	/**
	 * Visit a parse tree produced by {@link entradaParser#kw_shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_shape(entradaParser.Kw_shapeContext ctx);
}