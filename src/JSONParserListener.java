// Generated from JSONParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(JSONParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(JSONParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(JSONParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(JSONParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nombre_objeto}.
	 * @param ctx the parse tree
	 */
	void enterNombre_objeto(JSONParser.Nombre_objetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nombre_objeto}.
	 * @param ctx the parse tree
	 */
	void exitNombre_objeto(JSONParser.Nombre_objetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_objeto}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_objeto(JSONParser.Cuerpo_objetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_objeto}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_objeto(JSONParser.Cuerpo_objetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nombre_label}.
	 * @param ctx the parse tree
	 */
	void enterNombre_label(JSONParser.Nombre_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nombre_label}.
	 * @param ctx the parse tree
	 */
	void exitNombre_label(JSONParser.Nombre_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#label_clave}.
	 * @param ctx the parse tree
	 */
	void enterLabel_clave(JSONParser.Label_claveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#label_clave}.
	 * @param ctx the parse tree
	 */
	void exitLabel_clave(JSONParser.Label_claveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#label_valor}.
	 * @param ctx the parse tree
	 */
	void enterLabel_valor(JSONParser.Label_valorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#label_valor}.
	 * @param ctx the parse tree
	 */
	void exitLabel_valor(JSONParser.Label_valorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#contenido_label}.
	 * @param ctx the parse tree
	 */
	void enterContenido_label(JSONParser.Contenido_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#contenido_label}.
	 * @param ctx the parse tree
	 */
	void exitContenido_label(JSONParser.Contenido_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_label}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_label(JSONParser.Cuerpo_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_label}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_label(JSONParser.Cuerpo_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nombre_label_reversename}.
	 * @param ctx the parse tree
	 */
	void enterNombre_label_reversename(JSONParser.Nombre_label_reversenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nombre_label_reversename}.
	 * @param ctx the parse tree
	 */
	void exitNombre_label_reversename(JSONParser.Nombre_label_reversenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#label_reversename_clave}.
	 * @param ctx the parse tree
	 */
	void enterLabel_reversename_clave(JSONParser.Label_reversename_claveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#label_reversename_clave}.
	 * @param ctx the parse tree
	 */
	void exitLabel_reversename_clave(JSONParser.Label_reversename_claveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#label_reversename_valor}.
	 * @param ctx the parse tree
	 */
	void enterLabel_reversename_valor(JSONParser.Label_reversename_valorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#label_reversename_valor}.
	 * @param ctx the parse tree
	 */
	void exitLabel_reversename_valor(JSONParser.Label_reversename_valorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#contenido_label_reversename}.
	 * @param ctx the parse tree
	 */
	void enterContenido_label_reversename(JSONParser.Contenido_label_reversenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#contenido_label_reversename}.
	 * @param ctx the parse tree
	 */
	void exitContenido_label_reversename(JSONParser.Contenido_label_reversenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_label_reversename}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_label_reversename(JSONParser.Cuerpo_label_reversenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_label_reversename}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_label_reversename(JSONParser.Cuerpo_label_reversenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(JSONParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(JSONParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nombre_atributo}.
	 * @param ctx the parse tree
	 */
	void enterNombre_atributo(JSONParser.Nombre_atributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nombre_atributo}.
	 * @param ctx the parse tree
	 */
	void exitNombre_atributo(JSONParser.Nombre_atributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_atributo}.
	 * @param ctx the parse tree
	 */
	void enterValor_atributo(JSONParser.Valor_atributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_atributo}.
	 * @param ctx the parse tree
	 */
	void exitValor_atributo(JSONParser.Valor_atributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(JSONParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(JSONParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nombre_lista}.
	 * @param ctx the parse tree
	 */
	void enterNombre_lista(JSONParser.Nombre_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nombre_lista}.
	 * @param ctx the parse tree
	 */
	void exitNombre_lista(JSONParser.Nombre_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_lista}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_lista(JSONParser.Cuerpo_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_lista}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_lista(JSONParser.Cuerpo_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(JSONParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(JSONParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_graph}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_graph(JSONParser.Cuerpo_graphContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_graph}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_graph(JSONParser.Cuerpo_graphContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(JSONParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(JSONParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_propertie}.
	 * @param ctx the parse tree
	 */
	void enterValor_propertie(JSONParser.Valor_propertieContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_propertie}.
	 * @param ctx the parse tree
	 */
	void exitValor_propertie(JSONParser.Valor_propertieContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_properties}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_properties(JSONParser.Cuerpo_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_properties}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_properties(JSONParser.Cuerpo_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#arbol}.
	 * @param ctx the parse tree
	 */
	void enterArbol(JSONParser.ArbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#arbol}.
	 * @param ctx the parse tree
	 */
	void exitArbol(JSONParser.ArbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_tree}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_tree(JSONParser.Cuerpo_treeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_tree}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_tree(JSONParser.Cuerpo_treeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#usedby}.
	 * @param ctx the parse tree
	 */
	void enterUsedby(JSONParser.UsedbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#usedby}.
	 * @param ctx the parse tree
	 */
	void exitUsedby(JSONParser.UsedbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_usedby}.
	 * @param ctx the parse tree
	 */
	void enterValor_usedby(JSONParser.Valor_usedbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_usedby}.
	 * @param ctx the parse tree
	 */
	void exitValor_usedby(JSONParser.Valor_usedbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_usedby}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_usedby(JSONParser.Cuerpo_usedbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_usedby}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_usedby(JSONParser.Cuerpo_usedbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#languajedata}.
	 * @param ctx the parse tree
	 */
	void enterLanguajedata(JSONParser.LanguajedataContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#languajedata}.
	 * @param ctx the parse tree
	 */
	void exitLanguajedata(JSONParser.LanguajedataContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_languagedata}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_languagedata(JSONParser.Cuerpo_languagedataContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_languagedata}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_languagedata(JSONParser.Cuerpo_languagedataContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(JSONParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(JSONParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_id}.
	 * @param ctx the parse tree
	 */
	void enterKw_id(JSONParser.Kw_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_id}.
	 * @param ctx the parse tree
	 */
	void exitKw_id(JSONParser.Kw_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_id}.
	 * @param ctx the parse tree
	 */
	void enterValor_id(JSONParser.Valor_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_id}.
	 * @param ctx the parse tree
	 */
	void exitValor_id(JSONParser.Valor_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_geder}.
	 * @param ctx the parse tree
	 */
	void enterKw_geder(JSONParser.Kw_gederContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_geder}.
	 * @param ctx the parse tree
	 */
	void exitKw_geder(JSONParser.Kw_gederContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_gender}.
	 * @param ctx the parse tree
	 */
	void enterValor_gender(JSONParser.Valor_genderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_gender}.
	 * @param ctx the parse tree
	 */
	void exitValor_gender(JSONParser.Valor_genderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_number}.
	 * @param ctx the parse tree
	 */
	void enterKw_number(JSONParser.Kw_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_number}.
	 * @param ctx the parse tree
	 */
	void exitKw_number(JSONParser.Kw_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_number}.
	 * @param ctx the parse tree
	 */
	void enterValor_number(JSONParser.Valor_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_number}.
	 * @param ctx the parse tree
	 */
	void exitValor_number(JSONParser.Valor_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_word_type}.
	 * @param ctx the parse tree
	 */
	void enterKw_word_type(JSONParser.Kw_word_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_word_type}.
	 * @param ctx the parse tree
	 */
	void exitKw_word_type(JSONParser.Kw_word_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_word_type}.
	 * @param ctx the parse tree
	 */
	void enterValor_word_type(JSONParser.Valor_word_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_word_type}.
	 * @param ctx the parse tree
	 */
	void exitValor_word_type(JSONParser.Valor_word_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_type_of}.
	 * @param ctx the parse tree
	 */
	void enterKw_type_of(JSONParser.Kw_type_ofContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_type_of}.
	 * @param ctx the parse tree
	 */
	void exitKw_type_of(JSONParser.Kw_type_ofContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_type_of}.
	 * @param ctx the parse tree
	 */
	void enterValor_type_of(JSONParser.Valor_type_ofContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_type_of}.
	 * @param ctx the parse tree
	 */
	void exitValor_type_of(JSONParser.Valor_type_ofContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_is_list}.
	 * @param ctx the parse tree
	 */
	void enterKw_is_list(JSONParser.Kw_is_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_is_list}.
	 * @param ctx the parse tree
	 */
	void exitKw_is_list(JSONParser.Kw_is_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_is_list}.
	 * @param ctx the parse tree
	 */
	void enterValor_is_list(JSONParser.Valor_is_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_is_list}.
	 * @param ctx the parse tree
	 */
	void exitValor_is_list(JSONParser.Valor_is_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_optional}.
	 * @param ctx the parse tree
	 */
	void enterKw_optional(JSONParser.Kw_optionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_optional}.
	 * @param ctx the parse tree
	 */
	void exitKw_optional(JSONParser.Kw_optionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_optional}.
	 * @param ctx the parse tree
	 */
	void enterValor_optional(JSONParser.Valor_optionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_optional}.
	 * @param ctx the parse tree
	 */
	void exitValor_optional(JSONParser.Valor_optionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_multiplicity_max}.
	 * @param ctx the parse tree
	 */
	void enterKw_multiplicity_max(JSONParser.Kw_multiplicity_maxContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_multiplicity_max}.
	 * @param ctx the parse tree
	 */
	void exitKw_multiplicity_max(JSONParser.Kw_multiplicity_maxContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_multiplicity_max}.
	 * @param ctx the parse tree
	 */
	void enterValor_multiplicity_max(JSONParser.Valor_multiplicity_maxContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_multiplicity_max}.
	 * @param ctx the parse tree
	 */
	void exitValor_multiplicity_max(JSONParser.Valor_multiplicity_maxContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_multiplicity_min}.
	 * @param ctx the parse tree
	 */
	void enterKw_multiplicity_min(JSONParser.Kw_multiplicity_minContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_multiplicity_min}.
	 * @param ctx the parse tree
	 */
	void exitKw_multiplicity_min(JSONParser.Kw_multiplicity_minContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_multiplicity_min}.
	 * @param ctx the parse tree
	 */
	void enterValor_multiplicity_min(JSONParser.Valor_multiplicity_minContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_multiplicity_min}.
	 * @param ctx the parse tree
	 */
	void exitValor_multiplicity_min(JSONParser.Valor_multiplicity_minContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_reverse_name}.
	 * @param ctx the parse tree
	 */
	void enterKw_reverse_name(JSONParser.Kw_reverse_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_reverse_name}.
	 * @param ctx the parse tree
	 */
	void exitKw_reverse_name(JSONParser.Kw_reverse_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_reverse_name}.
	 * @param ctx the parse tree
	 */
	void enterValor_reverse_name(JSONParser.Valor_reverse_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_reverse_name}.
	 * @param ctx the parse tree
	 */
	void exitValor_reverse_name(JSONParser.Valor_reverse_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_from}.
	 * @param ctx the parse tree
	 */
	void enterKw_from(JSONParser.Kw_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_from}.
	 * @param ctx the parse tree
	 */
	void exitKw_from(JSONParser.Kw_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_from}.
	 * @param ctx the parse tree
	 */
	void enterValor_from(JSONParser.Valor_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_from}.
	 * @param ctx the parse tree
	 */
	void exitValor_from(JSONParser.Valor_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_to}.
	 * @param ctx the parse tree
	 */
	void enterKw_to(JSONParser.Kw_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_to}.
	 * @param ctx the parse tree
	 */
	void exitKw_to(JSONParser.Kw_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#kw_inherits}.
	 * @param ctx the parse tree
	 */
	void enterKw_inherits(JSONParser.Kw_inheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#kw_inherits}.
	 * @param ctx the parse tree
	 */
	void exitKw_inherits(JSONParser.Kw_inheritsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_inherits}.
	 * @param ctx the parse tree
	 */
	void enterValor_inherits(JSONParser.Valor_inheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_inherits}.
	 * @param ctx the parse tree
	 */
	void exitValor_inherits(JSONParser.Valor_inheritsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#valor_to}.
	 * @param ctx the parse tree
	 */
	void enterValor_to(JSONParser.Valor_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#valor_to}.
	 * @param ctx the parse tree
	 */
	void exitValor_to(JSONParser.Valor_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#estado_context}.
	 * @param ctx the parse tree
	 */
	void enterEstado_context(JSONParser.Estado_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#estado_context}.
	 * @param ctx the parse tree
	 */
	void exitEstado_context(JSONParser.Estado_contextContext ctx);
}