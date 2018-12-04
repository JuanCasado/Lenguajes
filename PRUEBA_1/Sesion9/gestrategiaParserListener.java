// Generated from .\gestrategiaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gestrategiaParser}.
 */
public interface gestrategiaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gestrategiaParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(gestrategiaParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link gestrategiaParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(gestrategiaParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link gestrategiaParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(gestrategiaParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gestrategiaParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(gestrategiaParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gestrategiaParser#linea}.
	 * @param ctx the parse tree
	 */
	void enterLinea(gestrategiaParser.LineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gestrategiaParser#linea}.
	 * @param ctx the parse tree
	 */
	void exitLinea(gestrategiaParser.LineaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnaSinComillas}
	 * labeled alternative in {@link gestrategiaParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumnaSinComillas(gestrategiaParser.ColumnaSinComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnaSinComillas}
	 * labeled alternative in {@link gestrategiaParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumnaSinComillas(gestrategiaParser.ColumnaSinComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnaConComillas}
	 * labeled alternative in {@link gestrategiaParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumnaConComillas(gestrategiaParser.ColumnaConComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnaConComillas}
	 * labeled alternative in {@link gestrategiaParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumnaConComillas(gestrategiaParser.ColumnaConComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnaVacio}
	 * labeled alternative in {@link gestrategiaParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumnaVacio(gestrategiaParser.ColumnaVacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnaVacio}
	 * labeled alternative in {@link gestrategiaParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumnaVacio(gestrategiaParser.ColumnaVacioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textoSinComillas}
	 * labeled alternative in {@link gestrategiaParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterTextoSinComillas(gestrategiaParser.TextoSinComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textoSinComillas}
	 * labeled alternative in {@link gestrategiaParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitTextoSinComillas(gestrategiaParser.TextoSinComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConComillas}
	 * labeled alternative in {@link gestrategiaParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterStringConComillas(gestrategiaParser.StringConComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConComillas}
	 * labeled alternative in {@link gestrategiaParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitStringConComillas(gestrategiaParser.StringConComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code campoVacio}
	 * labeled alternative in {@link gestrategiaParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampoVacio(gestrategiaParser.CampoVacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code campoVacio}
	 * labeled alternative in {@link gestrategiaParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampoVacio(gestrategiaParser.CampoVacioContext ctx);
}