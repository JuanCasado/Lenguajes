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
	 * Enter a parse tree produced by {@link JSONParser#graphs}.
	 * @param ctx the parse tree
	 */
	void enterGraphs(JSONParser.GraphsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#graphs}.
	 * @param ctx the parse tree
	 */
	void exitGraphs(JSONParser.GraphsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#cuerpo_graphs}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_graphs(JSONParser.Cuerpo_graphsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#cuerpo_graphs}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_graphs(JSONParser.Cuerpo_graphsContext ctx);
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
}