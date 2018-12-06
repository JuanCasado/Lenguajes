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