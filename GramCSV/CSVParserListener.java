// Generated from CSVParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVParser}.
 */
public interface CSVParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(CSVParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(CSVParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(CSVParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(CSVParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#linea}.
	 * @param ctx the parse tree
	 */
	void enterLinea(CSVParser.LineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#linea}.
	 * @param ctx the parse tree
	 */
	void exitLinea(CSVParser.LineaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnaSinComillas}
	 * labeled alternative in {@link CSVParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumnaSinComillas(CSVParser.ColumnaSinComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnaSinComillas}
	 * labeled alternative in {@link CSVParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumnaSinComillas(CSVParser.ColumnaSinComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnaConComillas}
	 * labeled alternative in {@link CSVParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumnaConComillas(CSVParser.ColumnaConComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnaConComillas}
	 * labeled alternative in {@link CSVParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumnaConComillas(CSVParser.ColumnaConComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnaVacio}
	 * labeled alternative in {@link CSVParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumnaVacio(CSVParser.ColumnaVacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnaVacio}
	 * labeled alternative in {@link CSVParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumnaVacio(CSVParser.ColumnaVacioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textoSinComillas}
	 * labeled alternative in {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterTextoSinComillas(CSVParser.TextoSinComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textoSinComillas}
	 * labeled alternative in {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitTextoSinComillas(CSVParser.TextoSinComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConComillas}
	 * labeled alternative in {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterStringConComillas(CSVParser.StringConComillasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConComillas}
	 * labeled alternative in {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitStringConComillas(CSVParser.StringConComillasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code campoVacio}
	 * labeled alternative in {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampoVacio(CSVParser.CampoVacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code campoVacio}
	 * labeled alternative in {@link CSVParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampoVacio(CSVParser.CampoVacioContext ctx);
}