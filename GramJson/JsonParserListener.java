// Generated from JsonParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(JsonParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(JsonParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(JsonParser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(JsonParser.ContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#descripcion}.
	 * @param ctx the parse tree
	 */
	void enterDescripcion(JsonParser.DescripcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#descripcion}.
	 * @param ctx the parse tree
	 */
	void exitDescripcion(JsonParser.DescripcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(JsonParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(JsonParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#ampli_info}.
	 * @param ctx the parse tree
	 */
	void enterAmpli_info(JsonParser.Ampli_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#ampli_info}.
	 * @param ctx the parse tree
	 */
	void exitAmpli_info(JsonParser.Ampli_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#ampli_info_content}.
	 * @param ctx the parse tree
	 */
	void enterAmpli_info_content(JsonParser.Ampli_info_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#ampli_info_content}.
	 * @param ctx the parse tree
	 */
	void exitAmpli_info_content(JsonParser.Ampli_info_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#contenido}.
	 * @param ctx the parse tree
	 */
	void enterContenido(JsonParser.ContenidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#contenido}.
	 * @param ctx the parse tree
	 */
	void exitContenido(JsonParser.ContenidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#otro_nombre}.
	 * @param ctx the parse tree
	 */
	void enterOtro_nombre(JsonParser.Otro_nombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#otro_nombre}.
	 * @param ctx the parse tree
	 */
	void exitOtro_nombre(JsonParser.Otro_nombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#ruta}.
	 * @param ctx the parse tree
	 */
	void enterRuta(JsonParser.RutaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#ruta}.
	 * @param ctx the parse tree
	 */
	void exitRuta(JsonParser.RutaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(JsonParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(JsonParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#graphs}.
	 * @param ctx the parse tree
	 */
	void enterGraphs(JsonParser.GraphsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#graphs}.
	 * @param ctx the parse tree
	 */
	void exitGraphs(JsonParser.GraphsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(JsonParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(JsonParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#objetos}.
	 * @param ctx the parse tree
	 */
	void enterObjetos(JsonParser.ObjetosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#objetos}.
	 * @param ctx the parse tree
	 */
	void exitObjetos(JsonParser.ObjetosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(JsonParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(JsonParser.PropContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#pclass}.
	 * @param ctx the parse tree
	 */
	void enterPclass(JsonParser.PclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#pclass}.
	 * @param ctx the parse tree
	 */
	void exitPclass(JsonParser.PclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(JsonParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(JsonParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(JsonParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(JsonParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(JsonParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(JsonParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(JsonParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(JsonParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#inherits}.
	 * @param ctx the parse tree
	 */
	void enterInherits(JsonParser.InheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#inherits}.
	 * @param ctx the parse tree
	 */
	void exitInherits(JsonParser.InheritsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#relationship}.
	 * @param ctx the parse tree
	 */
	void enterRelationship(JsonParser.RelationshipContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#relationship}.
	 * @param ctx the parse tree
	 */
	void exitRelationship(JsonParser.RelationshipContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#reverse_name}.
	 * @param ctx the parse tree
	 */
	void enterReverse_name(JsonParser.Reverse_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#reverse_name}.
	 * @param ctx the parse tree
	 */
	void exitReverse_name(JsonParser.Reverse_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#labelrn}.
	 * @param ctx the parse tree
	 */
	void enterLabelrn(JsonParser.LabelrnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#labelrn}.
	 * @param ctx the parse tree
	 */
	void exitLabelrn(JsonParser.LabelrnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(JsonParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(JsonParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(JsonParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(JsonParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(JsonParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(JsonParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(JsonParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(JsonParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#languageData}.
	 * @param ctx the parse tree
	 */
	void enterLanguageData(JsonParser.LanguageDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#languageData}.
	 * @param ctx the parse tree
	 */
	void exitLanguageData(JsonParser.LanguageDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#typeOf}.
	 * @param ctx the parse tree
	 */
	void enterTypeOf(JsonParser.TypeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#typeOf}.
	 * @param ctx the parse tree
	 */
	void exitTypeOf(JsonParser.TypeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#usedby}.
	 * @param ctx the parse tree
	 */
	void enterUsedby(JsonParser.UsedbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#usedby}.
	 * @param ctx the parse tree
	 */
	void exitUsedby(JsonParser.UsedbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#isList}.
	 * @param ctx the parse tree
	 */
	void enterIsList(JsonParser.IsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#isList}.
	 * @param ctx the parse tree
	 */
	void exitIsList(JsonParser.IsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(JsonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(JsonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#mulMin}.
	 * @param ctx the parse tree
	 */
	void enterMulMin(JsonParser.MulMinContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#mulMin}.
	 * @param ctx the parse tree
	 */
	void exitMulMin(JsonParser.MulMinContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#mulMax}.
	 * @param ctx the parse tree
	 */
	void enterMulMax(JsonParser.MulMaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#mulMax}.
	 * @param ctx the parse tree
	 */
	void exitMulMax(JsonParser.MulMaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#languageProperty}.
	 * @param ctx the parse tree
	 */
	void enterLanguageProperty(JsonParser.LanguagePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#languageProperty}.
	 * @param ctx the parse tree
	 */
	void exitLanguageProperty(JsonParser.LanguagePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(JsonParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(JsonParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#gender}.
	 * @param ctx the parse tree
	 */
	void enterGender(JsonParser.GenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#gender}.
	 * @param ctx the parse tree
	 */
	void exitGender(JsonParser.GenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JsonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JsonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#wordType}.
	 * @param ctx the parse tree
	 */
	void enterWordType(JsonParser.WordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#wordType}.
	 * @param ctx the parse tree
	 */
	void exitWordType(JsonParser.WordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#nombre_obj}.
	 * @param ctx the parse tree
	 */
	void enterNombre_obj(JsonParser.Nombre_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#nombre_obj}.
	 * @param ctx the parse tree
	 */
	void exitNombre_obj(JsonParser.Nombre_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#sacorchete}.
	 * @param ctx the parse tree
	 */
	void enterSacorchete(JsonParser.SacorcheteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#sacorchete}.
	 * @param ctx the parse tree
	 */
	void exitSacorchete(JsonParser.SacorcheteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#sccorchete}.
	 * @param ctx the parse tree
	 */
	void enterSccorchete(JsonParser.SccorcheteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#sccorchete}.
	 * @param ctx the parse tree
	 */
	void exitSccorchete(JsonParser.SccorcheteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(JsonParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(JsonParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw}.
	 * @param ctx the parse tree
	 */
	void enterKw(JsonParser.KwContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw}.
	 * @param ctx the parse tree
	 */
	void exitKw(JsonParser.KwContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_true}.
	 * @param ctx the parse tree
	 */
	void enterKw_true(JsonParser.Kw_trueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_true}.
	 * @param ctx the parse tree
	 */
	void exitKw_true(JsonParser.Kw_trueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_false}.
	 * @param ctx the parse tree
	 */
	void enterKw_false(JsonParser.Kw_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_false}.
	 * @param ctx the parse tree
	 */
	void exitKw_false(JsonParser.Kw_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_isList}.
	 * @param ctx the parse tree
	 */
	void enterKw_isList(JsonParser.Kw_isListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_isList}.
	 * @param ctx the parse tree
	 */
	void exitKw_isList(JsonParser.Kw_isListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_optional}.
	 * @param ctx the parse tree
	 */
	void enterKw_optional(JsonParser.Kw_optionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_optional}.
	 * @param ctx the parse tree
	 */
	void exitKw_optional(JsonParser.Kw_optionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_languageData}.
	 * @param ctx the parse tree
	 */
	void enterKw_languageData(JsonParser.Kw_languageDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_languageData}.
	 * @param ctx the parse tree
	 */
	void exitKw_languageData(JsonParser.Kw_languageDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_context}.
	 * @param ctx the parse tree
	 */
	void enterKw_context(JsonParser.Kw_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_context}.
	 * @param ctx the parse tree
	 */
	void exitKw_context(JsonParser.Kw_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_http}.
	 * @param ctx the parse tree
	 */
	void enterKw_http(JsonParser.Kw_httpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_http}.
	 * @param ctx the parse tree
	 */
	void exitKw_http(JsonParser.Kw_httpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_www}.
	 * @param ctx the parse tree
	 */
	void enterKw_www(JsonParser.Kw_wwwContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_www}.
	 * @param ctx the parse tree
	 */
	void exitKw_www(JsonParser.Kw_wwwContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_id}.
	 * @param ctx the parse tree
	 */
	void enterKw_id(JsonParser.Kw_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_id}.
	 * @param ctx the parse tree
	 */
	void exitKw_id(JsonParser.Kw_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_name}.
	 * @param ctx the parse tree
	 */
	void enterKw_name(JsonParser.Kw_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_name}.
	 * @param ctx the parse tree
	 */
	void exitKw_name(JsonParser.Kw_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_label}.
	 * @param ctx the parse tree
	 */
	void enterKw_label(JsonParser.Kw_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_label}.
	 * @param ctx the parse tree
	 */
	void exitKw_label(JsonParser.Kw_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_properties}.
	 * @param ctx the parse tree
	 */
	void enterKw_properties(JsonParser.Kw_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_properties}.
	 * @param ctx the parse tree
	 */
	void exitKw_properties(JsonParser.Kw_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_inherits}.
	 * @param ctx the parse tree
	 */
	void enterKw_inherits(JsonParser.Kw_inheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_inherits}.
	 * @param ctx the parse tree
	 */
	void exitKw_inherits(JsonParser.Kw_inheritsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_graphs}.
	 * @param ctx the parse tree
	 */
	void enterKw_graphs(JsonParser.Kw_graphsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_graphs}.
	 * @param ctx the parse tree
	 */
	void exitKw_graphs(JsonParser.Kw_graphsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_reversename}.
	 * @param ctx the parse tree
	 */
	void enterKw_reversename(JsonParser.Kw_reversenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_reversename}.
	 * @param ctx the parse tree
	 */
	void exitKw_reversename(JsonParser.Kw_reversenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_labelrn}.
	 * @param ctx the parse tree
	 */
	void enterKw_labelrn(JsonParser.Kw_labelrnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_labelrn}.
	 * @param ctx the parse tree
	 */
	void exitKw_labelrn(JsonParser.Kw_labelrnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_from}.
	 * @param ctx the parse tree
	 */
	void enterKw_from(JsonParser.Kw_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_from}.
	 * @param ctx the parse tree
	 */
	void exitKw_from(JsonParser.Kw_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_to}.
	 * @param ctx the parse tree
	 */
	void enterKw_to(JsonParser.Kw_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_to}.
	 * @param ctx the parse tree
	 */
	void exitKw_to(JsonParser.Kw_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_typeof}.
	 * @param ctx the parse tree
	 */
	void enterKw_typeof(JsonParser.Kw_typeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_typeof}.
	 * @param ctx the parse tree
	 */
	void exitKw_typeof(JsonParser.Kw_typeofContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_usedby}.
	 * @param ctx the parse tree
	 */
	void enterKw_usedby(JsonParser.Kw_usedbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_usedby}.
	 * @param ctx the parse tree
	 */
	void exitKw_usedby(JsonParser.Kw_usedbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_mulmax}.
	 * @param ctx the parse tree
	 */
	void enterKw_mulmax(JsonParser.Kw_mulmaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_mulmax}.
	 * @param ctx the parse tree
	 */
	void exitKw_mulmax(JsonParser.Kw_mulmaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_mulmin}.
	 * @param ctx the parse tree
	 */
	void enterKw_mulmin(JsonParser.Kw_mulminContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_mulmin}.
	 * @param ctx the parse tree
	 */
	void exitKw_mulmin(JsonParser.Kw_mulminContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_language}.
	 * @param ctx the parse tree
	 */
	void enterKw_language(JsonParser.Kw_languageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_language}.
	 * @param ctx the parse tree
	 */
	void exitKw_language(JsonParser.Kw_languageContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_number}.
	 * @param ctx the parse tree
	 */
	void enterKw_number(JsonParser.Kw_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_number}.
	 * @param ctx the parse tree
	 */
	void exitKw_number(JsonParser.Kw_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_gender}.
	 * @param ctx the parse tree
	 */
	void enterKw_gender(JsonParser.Kw_genderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_gender}.
	 * @param ctx the parse tree
	 */
	void exitKw_gender(JsonParser.Kw_genderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kw_wordType}.
	 * @param ctx the parse tree
	 */
	void enterKw_wordType(JsonParser.Kw_wordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kw_wordType}.
	 * @param ctx the parse tree
	 */
	void exitKw_wordType(JsonParser.Kw_wordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#punto}.
	 * @param ctx the parse tree
	 */
	void enterPunto(JsonParser.PuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#punto}.
	 * @param ctx the parse tree
	 */
	void exitPunto(JsonParser.PuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#barra}.
	 * @param ctx the parse tree
	 */
	void enterBarra(JsonParser.BarraContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#barra}.
	 * @param ctx the parse tree
	 */
	void exitBarra(JsonParser.BarraContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#alm}.
	 * @param ctx the parse tree
	 */
	void enterAlm(JsonParser.AlmContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#alm}.
	 * @param ctx the parse tree
	 */
	void exitAlm(JsonParser.AlmContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#dos_ptos}.
	 * @param ctx the parse tree
	 */
	void enterDos_ptos(JsonParser.Dos_ptosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#dos_ptos}.
	 * @param ctx the parse tree
	 */
	void exitDos_ptos(JsonParser.Dos_ptosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#sallave}.
	 * @param ctx the parse tree
	 */
	void enterSallave(JsonParser.SallaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#sallave}.
	 * @param ctx the parse tree
	 */
	void exitSallave(JsonParser.SallaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#scllave}.
	 * @param ctx the parse tree
	 */
	void enterScllave(JsonParser.ScllaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#scllave}.
	 * @param ctx the parse tree
	 */
	void exitScllave(JsonParser.ScllaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(JsonParser.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(JsonParser.ComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#comillas}.
	 * @param ctx the parse tree
	 */
	void enterComillas(JsonParser.ComillasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#comillas}.
	 * @param ctx the parse tree
	 */
	void exitComillas(JsonParser.ComillasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#bbaja}.
	 * @param ctx the parse tree
	 */
	void enterBbaja(JsonParser.BbajaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#bbaja}.
	 * @param ctx the parse tree
	 */
	void exitBbaja(JsonParser.BbajaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(JsonParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(JsonParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#digito}.
	 * @param ctx the parse tree
	 */
	void enterDigito(JsonParser.DigitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#digito}.
	 * @param ctx the parse tree
	 */
	void exitDigito(JsonParser.DigitoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#intro}.
	 * @param ctx the parse tree
	 */
	void enterIntro(JsonParser.IntroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#intro}.
	 * @param ctx the parse tree
	 */
	void exitIntro(JsonParser.IntroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#arroba}.
	 * @param ctx the parse tree
	 */
	void enterArroba(JsonParser.ArrobaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#arroba}.
	 * @param ctx the parse tree
	 */
	void exitArroba(JsonParser.ArrobaContext ctx);
}