// Generated from EntradaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EntradaParser}.
 */
public interface EntradaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EntradaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(EntradaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(EntradaParser.InitContext ctx);
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
	 * Enter a parse tree produced by {@link EntradaParser#textojson}.
	 * @param ctx the parse tree
	 */
	void enterTextojson(EntradaParser.TextojsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#textojson}.
	 * @param ctx the parse tree
	 */
	void exitTextojson(EntradaParser.TextojsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#textosvg}.
	 * @param ctx the parse tree
	 */
	void enterTextosvg(EntradaParser.TextosvgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#textosvg}.
	 * @param ctx the parse tree
	 */
	void exitTextosvg(EntradaParser.TextosvgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#textodot}.
	 * @param ctx the parse tree
	 */
	void enterTextodot(EntradaParser.TextodotContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#textodot}.
	 * @param ctx the parse tree
	 */
	void exitTextodot(EntradaParser.TextodotContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#textocsv}.
	 * @param ctx the parse tree
	 */
	void enterTextocsv(EntradaParser.TextocsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#textocsv}.
	 * @param ctx the parse tree
	 */
	void exitTextocsv(EntradaParser.TextocsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#textoparam}.
	 * @param ctx the parse tree
	 */
	void enterTextoparam(EntradaParser.TextoparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#textoparam}.
	 * @param ctx the parse tree
	 */
	void exitTextoparam(EntradaParser.TextoparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#basura}.
	 * @param ctx the parse tree
	 */
	void enterBasura(EntradaParser.BasuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#basura}.
	 * @param ctx the parse tree
	 */
	void exitBasura(EntradaParser.BasuraContext ctx);
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
	 * Enter a parse tree produced by {@link EntradaParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(EntradaParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(EntradaParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#arrowhead}.
	 * @param ctx the parse tree
	 */
	void enterArrowhead(EntradaParser.ArrowheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#arrowhead}.
	 * @param ctx the parse tree
	 */
	void exitArrowhead(EntradaParser.ArrowheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#dir}.
	 * @param ctx the parse tree
	 */
	void enterDir(EntradaParser.DirContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#dir}.
	 * @param ctx the parse tree
	 */
	void exitDir(EntradaParser.DirContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#len_name}.
	 * @param ctx the parse tree
	 */
	void enterLen_name(EntradaParser.Len_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#len_name}.
	 * @param ctx the parse tree
	 */
	void exitLen_name(EntradaParser.Len_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#fontcolor_name}.
	 * @param ctx the parse tree
	 */
	void enterFontcolor_name(EntradaParser.Fontcolor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#fontcolor_name}.
	 * @param ctx the parse tree
	 */
	void exitFontcolor_name(EntradaParser.Fontcolor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#color_name}.
	 * @param ctx the parse tree
	 */
	void enterColor_name(EntradaParser.Color_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#color_name}.
	 * @param ctx the parse tree
	 */
	void exitColor_name(EntradaParser.Color_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#fontname_name}.
	 * @param ctx the parse tree
	 */
	void enterFontname_name(EntradaParser.Fontname_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#fontname_name}.
	 * @param ctx the parse tree
	 */
	void exitFontname_name(EntradaParser.Fontname_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#fontsize_name}.
	 * @param ctx the parse tree
	 */
	void enterFontsize_name(EntradaParser.Fontsize_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#fontsize_name}.
	 * @param ctx the parse tree
	 */
	void exitFontsize_name(EntradaParser.Fontsize_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#arrowsize_name}.
	 * @param ctx the parse tree
	 */
	void enterArrowsize_name(EntradaParser.Arrowsize_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#arrowsize_name}.
	 * @param ctx the parse tree
	 */
	void exitArrowsize_name(EntradaParser.Arrowsize_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#arrowcolor_name}.
	 * @param ctx the parse tree
	 */
	void enterArrowcolor_name(EntradaParser.Arrowcolor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#arrowcolor_name}.
	 * @param ctx the parse tree
	 */
	void exitArrowcolor_name(EntradaParser.Arrowcolor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#arrowhead_name}.
	 * @param ctx the parse tree
	 */
	void enterArrowhead_name(EntradaParser.Arrowhead_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#arrowhead_name}.
	 * @param ctx the parse tree
	 */
	void exitArrowhead_name(EntradaParser.Arrowhead_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#penwidth_name}.
	 * @param ctx the parse tree
	 */
	void enterPenwidth_name(EntradaParser.Penwidth_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#penwidth_name}.
	 * @param ctx the parse tree
	 */
	void exitPenwidth_name(EntradaParser.Penwidth_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#fillcolor_name}.
	 * @param ctx the parse tree
	 */
	void enterFillcolor_name(EntradaParser.Fillcolor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#fillcolor_name}.
	 * @param ctx the parse tree
	 */
	void exitFillcolor_name(EntradaParser.Fillcolor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#style_name}.
	 * @param ctx the parse tree
	 */
	void enterStyle_name(EntradaParser.Style_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#style_name}.
	 * @param ctx the parse tree
	 */
	void exitStyle_name(EntradaParser.Style_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#shape_name}.
	 * @param ctx the parse tree
	 */
	void enterShape_name(EntradaParser.Shape_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#shape_name}.
	 * @param ctx the parse tree
	 */
	void exitShape_name(EntradaParser.Shape_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EntradaParser#dir_name}.
	 * @param ctx the parse tree
	 */
	void enterDir_name(EntradaParser.Dir_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#dir_name}.
	 * @param ctx the parse tree
	 */
	void exitDir_name(EntradaParser.Dir_nameContext ctx);
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
	 * Enter a parse tree produced by {@link EntradaParser#kw_color}.
	 * @param ctx the parse tree
	 */
	void enterKw_color(EntradaParser.Kw_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_color}.
	 * @param ctx the parse tree
	 */
	void exitKw_color(EntradaParser.Kw_colorContext ctx);
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
	 * Enter a parse tree produced by {@link EntradaParser#kw_arrowhead}.
	 * @param ctx the parse tree
	 */
	void enterKw_arrowhead(EntradaParser.Kw_arrowheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_arrowhead}.
	 * @param ctx the parse tree
	 */
	void exitKw_arrowhead(EntradaParser.Kw_arrowheadContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link EntradaParser#kw_dir}.
	 * @param ctx the parse tree
	 */
	void enterKw_dir(EntradaParser.Kw_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link EntradaParser#kw_dir}.
	 * @param ctx the parse tree
	 */
	void exitKw_dir(EntradaParser.Kw_dirContext ctx);
}