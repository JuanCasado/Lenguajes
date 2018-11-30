// Generated from CsvParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsvParser}.
 */
public interface CsvParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsvParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(CsvParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(CsvParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(CsvParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(CsvParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CsvParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CsvParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#dir}.
	 * @param ctx the parse tree
	 */
	void enterDir(CsvParser.DirContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#dir}.
	 * @param ctx the parse tree
	 */
	void exitDir(CsvParser.DirContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#json_file}.
	 * @param ctx the parse tree
	 */
	void enterJson_file(CsvParser.Json_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#json_file}.
	 * @param ctx the parse tree
	 */
	void exitJson_file(CsvParser.Json_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#svg_file}.
	 * @param ctx the parse tree
	 */
	void enterSvg_file(CsvParser.Svg_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#svg_file}.
	 * @param ctx the parse tree
	 */
	void exitSvg_file(CsvParser.Svg_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#dot_file}.
	 * @param ctx the parse tree
	 */
	void enterDot_file(CsvParser.Dot_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#dot_file}.
	 * @param ctx the parse tree
	 */
	void exitDot_file(CsvParser.Dot_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(CsvParser.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(CsvParser.ComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(CsvParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(CsvParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(CsvParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(CsvParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#rutafichero}.
	 * @param ctx the parse tree
	 */
	void enterRutafichero(CsvParser.RutaficheroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#rutafichero}.
	 * @param ctx the parse tree
	 */
	void exitRutafichero(CsvParser.RutaficheroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#rutaficherosalida}.
	 * @param ctx the parse tree
	 */
	void enterRutaficherosalida(CsvParser.RutaficherosalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#rutaficherosalida}.
	 * @param ctx the parse tree
	 */
	void exitRutaficherosalida(CsvParser.RutaficherosalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#rutaficherografico}.
	 * @param ctx the parse tree
	 */
	void enterRutaficherografico(CsvParser.RutaficherograficoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#rutaficherografico}.
	 * @param ctx the parse tree
	 */
	void exitRutaficherografico(CsvParser.RutaficherograficoContext ctx);
}