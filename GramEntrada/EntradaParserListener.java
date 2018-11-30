// Generated from EntradaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EntradaParser}.
 */
public interface EntradaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EntradaParser#fichero}.
	 * @param ctx the parse tree
	 */
	void enterFichero(EntradaParser.FicheroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#fichero}.
	 * @param ctx the parse tree
	 */
	void exitFichero(EntradaParser.FicheroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(EntradaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(EntradaParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#authorcom}.
	 * @param ctx the parse tree
	 */
	void enterAuthorcom(EntradaParser.AuthorcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#authorcom}.
	 * @param ctx the parse tree
	 */
	void exitAuthorcom(EntradaParser.AuthorcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#descrcom}.
	 * @param ctx the parse tree
	 */
	void enterDescrcom(EntradaParser.DescrcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#descrcom}.
	 * @param ctx the parse tree
	 */
	void exitDescrcom(EntradaParser.DescrcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#targcom}.
	 * @param ctx the parse tree
	 */
	void enterTargcom(EntradaParser.TargcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#targcom}.
	 * @param ctx the parse tree
	 */
	void exitTargcom(EntradaParser.TargcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#texto_comen}.
	 * @param ctx the parse tree
	 */
	void enterTexto_comen(EntradaParser.Texto_comenContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#texto_comen}.
	 * @param ctx the parse tree
	 */
	void exitTexto_comen(EntradaParser.Texto_comenContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#rutafichero}.
	 * @param ctx the parse tree
	 */
	void enterRutafichero(EntradaParser.RutaficheroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#rutafichero}.
	 * @param ctx the parse tree
	 */
	void exitRutafichero(EntradaParser.RutaficheroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#tipo_archivo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_archivo(EntradaParser.Tipo_archivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#tipo_archivo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_archivo(EntradaParser.Tipo_archivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(EntradaParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(EntradaParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#svg}.
	 * @param ctx the parse tree
	 */
	void enterSvg(EntradaParser.SvgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#svg}.
	 * @param ctx the parse tree
	 */
	void exitSvg(EntradaParser.SvgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(EntradaParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(EntradaParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(EntradaParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(EntradaParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#wsci}.
	 * @param ctx the parse tree
	 */
	void enterWsci(EntradaParser.WsciContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#wsci}.
	 * @param ctx the parse tree
	 */
	void exitWsci(EntradaParser.WsciContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#white_space}.
	 * @param ctx the parse tree
	 */
	void enterWhite_space(EntradaParser.White_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#white_space}.
	 * @param ctx the parse tree
	 */
	void exitWhite_space(EntradaParser.White_spaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#barra}.
	 * @param ctx the parse tree
	 */
	void enterBarra(EntradaParser.BarraContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#barra}.
	 * @param ctx the parse tree
	 */
	void exitBarra(EntradaParser.BarraContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#intro}.
	 * @param ctx the parse tree
	 */
	void enterIntro(EntradaParser.IntroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#intro}.
	 * @param ctx the parse tree
	 */
	void exitIntro(EntradaParser.IntroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetra(EntradaParser.LetraContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetra(EntradaParser.LetraContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(EntradaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(EntradaParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(EntradaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(EntradaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#sap}.
	 * @param ctx the parse tree
	 */
	void enterSap(EntradaParser.SapContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#sap}.
	 * @param ctx the parse tree
	 */
	void exitSap(EntradaParser.SapContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#scp}.
	 * @param ctx the parse tree
	 */
	void enterScp(EntradaParser.ScpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#scp}.
	 * @param ctx the parse tree
	 */
	void exitScp(EntradaParser.ScpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(EntradaParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(EntradaParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#opasig}.
	 * @param ctx the parse tree
	 */
	void enterOpasig(EntradaParser.OpasigContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#opasig}.
	 * @param ctx the parse tree
	 */
	void exitOpasig(EntradaParser.OpasigContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#opblt}.
	 * @param ctx the parse tree
	 */
	void enterOpblt(EntradaParser.OpbltContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#opblt}.
	 * @param ctx the parse tree
	 */
	void exitOpblt(EntradaParser.OpbltContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#opbgt}.
	 * @param ctx the parse tree
	 */
	void enterOpbgt(EntradaParser.OpbgtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#opbgt}.
	 * @param ctx the parse tree
	 */
	void exitOpbgt(EntradaParser.OpbgtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(EntradaParser.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(EntradaParser.ComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#dos_ptos}.
	 * @param ctx the parse tree
	 */
	void enterDos_ptos(EntradaParser.Dos_ptosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#dos_ptos}.
	 * @param ctx the parse tree
	 */
	void exitDos_ptos(EntradaParser.Dos_ptosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#punto}.
	 * @param ctx the parse tree
	 */
	void enterPunto(EntradaParser.PuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#punto}.
	 * @param ctx the parse tree
	 */
	void exitPunto(EntradaParser.PuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#doblepunto}.
	 * @param ctx the parse tree
	 */
	void enterDoblepunto(EntradaParser.DoblepuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#doblepunto}.
	 * @param ctx the parse tree
	 */
	void exitDoblepunto(EntradaParser.DoblepuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#texto_cadena}.
	 * @param ctx the parse tree
	 */
	void enterTexto_cadena(EntradaParser.Texto_cadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#texto_cadena}.
	 * @param ctx the parse tree
	 */
	void exitTexto_cadena(EntradaParser.Texto_cadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#cadena_abrir}.
	 * @param ctx the parse tree
	 */
	void enterCadena_abrir(EntradaParser.Cadena_abrirContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#cadena_abrir}.
	 * @param ctx the parse tree
	 */
	void exitCadena_abrir(EntradaParser.Cadena_abrirContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#cadena_cerrar}.
	 * @param ctx the parse tree
	 */
	void enterCadena_cerrar(EntradaParser.Cadena_cerrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#cadena_cerrar}.
	 * @param ctx the parse tree
	 */
	void exitCadena_cerrar(EntradaParser.Cadena_cerrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(EntradaParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(EntradaParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#bbaja}.
	 * @param ctx the parse tree
	 */
	void enterBbaja(EntradaParser.BbajaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#bbaja}.
	 * @param ctx the parse tree
	 */
	void exitBbaja(EntradaParser.BbajaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#cor_abrir}.
	 * @param ctx the parse tree
	 */
	void enterCor_abrir(EntradaParser.Cor_abrirContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#cor_abrir}.
	 * @param ctx the parse tree
	 */
	void exitCor_abrir(EntradaParser.Cor_abrirContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#cor_Cerrar}.
	 * @param ctx the parse tree
	 */
	void enterCor_Cerrar(EntradaParser.Cor_CerrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#cor_Cerrar}.
	 * @param ctx the parse tree
	 */
	void exitCor_Cerrar(EntradaParser.Cor_CerrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_json}.
	 * @param ctx the parse tree
	 */
	void enterKw_json(EntradaParser.Kw_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_json}.
	 * @param ctx the parse tree
	 */
	void exitKw_json(EntradaParser.Kw_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#extension_json}.
	 * @param ctx the parse tree
	 */
	void enterExtension_json(EntradaParser.Extension_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#extension_json}.
	 * @param ctx the parse tree
	 */
	void exitExtension_json(EntradaParser.Extension_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_svg}.
	 * @param ctx the parse tree
	 */
	void enterKw_svg(EntradaParser.Kw_svgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_svg}.
	 * @param ctx the parse tree
	 */
	void exitKw_svg(EntradaParser.Kw_svgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#extension_svg}.
	 * @param ctx the parse tree
	 */
	void enterExtension_svg(EntradaParser.Extension_svgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#extension_svg}.
	 * @param ctx the parse tree
	 */
	void exitExtension_svg(EntradaParser.Extension_svgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_dot}.
	 * @param ctx the parse tree
	 */
	void enterKw_dot(EntradaParser.Kw_dotContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_dot}.
	 * @param ctx the parse tree
	 */
	void exitKw_dot(EntradaParser.Kw_dotContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#extension_dot}.
	 * @param ctx the parse tree
	 */
	void enterExtension_dot(EntradaParser.Extension_dotContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#extension_dot}.
	 * @param ctx the parse tree
	 */
	void exitExtension_dot(EntradaParser.Extension_dotContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_csv}.
	 * @param ctx the parse tree
	 */
	void enterKw_csv(EntradaParser.Kw_csvContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_csv}.
	 * @param ctx the parse tree
	 */
	void exitKw_csv(EntradaParser.Kw_csvContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#extension_csv}.
	 * @param ctx the parse tree
	 */
	void enterExtension_csv(EntradaParser.Extension_csvContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#extension_csv}.
	 * @param ctx the parse tree
	 */
	void exitExtension_csv(EntradaParser.Extension_csvContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(EntradaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(EntradaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(EntradaParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(EntradaParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#fontcolor}.
	 * @param ctx the parse tree
	 */
	void enterFontcolor(EntradaParser.FontcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#fontcolor}.
	 * @param ctx the parse tree
	 */
	void exitFontcolor(EntradaParser.FontcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#fontname}.
	 * @param ctx the parse tree
	 */
	void enterFontname(EntradaParser.FontnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#fontname}.
	 * @param ctx the parse tree
	 */
	void exitFontname(EntradaParser.FontnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#fontsize}.
	 * @param ctx the parse tree
	 */
	void enterFontsize(EntradaParser.FontsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#fontsize}.
	 * @param ctx the parse tree
	 */
	void exitFontsize(EntradaParser.FontsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#arrowsize}.
	 * @param ctx the parse tree
	 */
	void enterArrowsize(EntradaParser.ArrowsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#arrowsize}.
	 * @param ctx the parse tree
	 */
	void exitArrowsize(EntradaParser.ArrowsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#arrowcolor}.
	 * @param ctx the parse tree
	 */
	void enterArrowcolor(EntradaParser.ArrowcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#arrowcolor}.
	 * @param ctx the parse tree
	 */
	void exitArrowcolor(EntradaParser.ArrowcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#penwidth}.
	 * @param ctx the parse tree
	 */
	void enterPenwidth(EntradaParser.PenwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#penwidth}.
	 * @param ctx the parse tree
	 */
	void exitPenwidth(EntradaParser.PenwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#fillcolor}.
	 * @param ctx the parse tree
	 */
	void enterFillcolor(EntradaParser.FillcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#fillcolor}.
	 * @param ctx the parse tree
	 */
	void exitFillcolor(EntradaParser.FillcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(EntradaParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(EntradaParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(EntradaParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(EntradaParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#tipo_estruc}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estruc(EntradaParser.Tipo_estrucContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#tipo_estruc}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estruc(EntradaParser.Tipo_estrucContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_edge}.
	 * @param ctx the parse tree
	 */
	void enterKw_edge(EntradaParser.Kw_edgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_edge}.
	 * @param ctx the parse tree
	 */
	void exitKw_edge(EntradaParser.Kw_edgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_node}.
	 * @param ctx the parse tree
	 */
	void enterKw_node(EntradaParser.Kw_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_node}.
	 * @param ctx the parse tree
	 */
	void exitKw_node(EntradaParser.Kw_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_relationship}.
	 * @param ctx the parse tree
	 */
	void enterKw_relationship(EntradaParser.Kw_relationshipContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_relationship}.
	 * @param ctx the parse tree
	 */
	void exitKw_relationship(EntradaParser.Kw_relationshipContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_class}.
	 * @param ctx the parse tree
	 */
	void enterKw_class(EntradaParser.Kw_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_class}.
	 * @param ctx the parse tree
	 */
	void exitKw_class(EntradaParser.Kw_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_property}.
	 * @param ctx the parse tree
	 */
	void enterKw_property(EntradaParser.Kw_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_property}.
	 * @param ctx the parse tree
	 */
	void exitKw_property(EntradaParser.Kw_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_inheritance}.
	 * @param ctx the parse tree
	 */
	void enterKw_inheritance(EntradaParser.Kw_inheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_inheritance}.
	 * @param ctx the parse tree
	 */
	void exitKw_inheritance(EntradaParser.Kw_inheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_inderect_use}.
	 * @param ctx the parse tree
	 */
	void enterKw_inderect_use(EntradaParser.Kw_inderect_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_inderect_use}.
	 * @param ctx the parse tree
	 */
	void exitKw_inderect_use(EntradaParser.Kw_inderect_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_len}.
	 * @param ctx the parse tree
	 */
	void enterKw_len(EntradaParser.Kw_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_len}.
	 * @param ctx the parse tree
	 */
	void exitKw_len(EntradaParser.Kw_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_fontcolor}.
	 * @param ctx the parse tree
	 */
	void enterKw_fontcolor(EntradaParser.Kw_fontcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_fontcolor}.
	 * @param ctx the parse tree
	 */
	void exitKw_fontcolor(EntradaParser.Kw_fontcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_fontname}.
	 * @param ctx the parse tree
	 */
	void enterKw_fontname(EntradaParser.Kw_fontnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_fontname}.
	 * @param ctx the parse tree
	 */
	void exitKw_fontname(EntradaParser.Kw_fontnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_fontsize}.
	 * @param ctx the parse tree
	 */
	void enterKw_fontsize(EntradaParser.Kw_fontsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_fontsize}.
	 * @param ctx the parse tree
	 */
	void exitKw_fontsize(EntradaParser.Kw_fontsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_arrowsize}.
	 * @param ctx the parse tree
	 */
	void enterKw_arrowsize(EntradaParser.Kw_arrowsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_arrowsize}.
	 * @param ctx the parse tree
	 */
	void exitKw_arrowsize(EntradaParser.Kw_arrowsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_arrowcolor}.
	 * @param ctx the parse tree
	 */
	void enterKw_arrowcolor(EntradaParser.Kw_arrowcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_arrowcolor}.
	 * @param ctx the parse tree
	 */
	void exitKw_arrowcolor(EntradaParser.Kw_arrowcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_penwidth}.
	 * @param ctx the parse tree
	 */
	void enterKw_penwidth(EntradaParser.Kw_penwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_penwidth}.
	 * @param ctx the parse tree
	 */
	void exitKw_penwidth(EntradaParser.Kw_penwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_fillcolor}.
	 * @param ctx the parse tree
	 */
	void enterKw_fillcolor(EntradaParser.Kw_fillcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_fillcolor}.
	 * @param ctx the parse tree
	 */
	void exitKw_fillcolor(EntradaParser.Kw_fillcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_style}.
	 * @param ctx the parse tree
	 */
	void enterKw_style(EntradaParser.Kw_styleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_style}.
	 * @param ctx the parse tree
	 */
	void exitKw_style(EntradaParser.Kw_styleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_shape}.
	 * @param ctx the parse tree
	 */
	void enterKw_shape(EntradaParser.Kw_shapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_shape}.
	 * @param ctx the parse tree
	 */
	void exitKw_shape(EntradaParser.Kw_shapeContext ctx);
}