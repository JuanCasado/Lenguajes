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
	 * Enter a parse tree produced by {@link JsonParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(JsonParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(JsonParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#lis}.
	 * @param ctx the parse tree
	 */
	void enterLis(JsonParser.LisContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#lis}.
	 * @param ctx the parse tree
	 */
	void exitLis(JsonParser.LisContext ctx);
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
	 * Enter a parse tree produced by {@link JsonParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(JsonParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(JsonParser.ColContext ctx);
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
	 * Enter a parse tree produced by {@link JsonParser#open_lis}.
	 * @param ctx the parse tree
	 */
	void enterOpen_lis(JsonParser.Open_lisContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#open_lis}.
	 * @param ctx the parse tree
	 */
	void exitOpen_lis(JsonParser.Open_lisContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#clos_lis}.
	 * @param ctx the parse tree
	 */
	void enterClos_lis(JsonParser.Clos_lisContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#clos_lis}.
	 * @param ctx the parse tree
	 */
	void exitClos_lis(JsonParser.Clos_lisContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#open_obj}.
	 * @param ctx the parse tree
	 */
	void enterOpen_obj(JsonParser.Open_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#open_obj}.
	 * @param ctx the parse tree
	 */
	void exitOpen_obj(JsonParser.Open_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#clos_obj}.
	 * @param ctx the parse tree
	 */
	void enterClos_obj(JsonParser.Clos_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#clos_obj}.
	 * @param ctx the parse tree
	 */
	void exitClos_obj(JsonParser.Clos_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(JsonParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(JsonParser.EndContext ctx);
}