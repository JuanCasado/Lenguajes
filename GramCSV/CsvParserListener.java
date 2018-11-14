<<<<<<< HEAD
// Generated from CsvParser.g4 by ANTLR 4.7.1
=======
// Generated from .\CsvParser.g4 by ANTLR 4.7.1
>>>>>>> 74d6d6c63641f0ddb432068d6f111a3a509a5d56
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsvParser}.
 */
public interface CsvParserListener extends ParseTreeListener {
	/**
<<<<<<< HEAD
	 * Enter a parse tree produced by {@link CsvParser#csv_file}.
	 * @param ctx the parse tree
	 */
	void enterCsv_file(CsvParser.Csv_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#csv_file}.
	 * @param ctx the parse tree
	 */
	void exitCsv_file(CsvParser.Csv_fileContext ctx);
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
=======
	 * Enter a parse tree produced by {@link CsvParser#fichero}.
	 * @param ctx the parse tree
	 */
	void enterFichero(CsvParser.FicheroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#fichero}.
	 * @param ctx the parse tree
	 */
	void exitFichero(CsvParser.FicheroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(CsvParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(CsvParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(CsvParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(CsvParser.SentenciasContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link CsvParser#carpeta}.
	 * @param ctx the parse tree
	 */
	void enterCarpeta(CsvParser.CarpetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#carpeta}.
	 * @param ctx the parse tree
	 */
	void exitCarpeta(CsvParser.CarpetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#archivo}.
	 * @param ctx the parse tree
	 */
	void enterArchivo(CsvParser.ArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#archivo}.
	 * @param ctx the parse tree
	 */
	void exitArchivo(CsvParser.ArchivoContext ctx);
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
	 * Enter a parse tree produced by {@link CsvParser#cosas}.
	 * @param ctx the parse tree
	 */
	void enterCosas(CsvParser.CosasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#cosas}.
	 * @param ctx the parse tree
	 */
	void exitCosas(CsvParser.CosasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#intro}.
	 * @param ctx the parse tree
	 */
	void enterIntro(CsvParser.IntroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#intro}.
	 * @param ctx the parse tree
	 */
	void exitIntro(CsvParser.IntroContext ctx);
>>>>>>> 74d6d6c63641f0ddb432068d6f111a3a509a5d56
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
<<<<<<< HEAD
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
	 * Enter a parse tree produced by {@link CsvParser#bar}.
	 * @param ctx the parse tree
	 */
	void enterBar(CsvParser.BarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#bar}.
	 * @param ctx the parse tree
	 */
	void exitBar(CsvParser.BarContext ctx);
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
=======
	 * Enter a parse tree produced by {@link CsvParser#barra}.
	 * @param ctx the parse tree
	 */
	void enterBarra(CsvParser.BarraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#barra}.
	 * @param ctx the parse tree
	 */
	void exitBarra(CsvParser.BarraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#doblepunto}.
	 * @param ctx the parse tree
	 */
	void enterDoblepunto(CsvParser.DoblepuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#doblepunto}.
	 * @param ctx the parse tree
	 */
	void exitDoblepunto(CsvParser.DoblepuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#disco}.
	 * @param ctx the parse tree
	 */
	void enterDisco(CsvParser.DiscoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#disco}.
	 * @param ctx the parse tree
	 */
	void exitDisco(CsvParser.DiscoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#punto}.
	 * @param ctx the parse tree
	 */
	void enterPunto(CsvParser.PuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#punto}.
	 * @param ctx the parse tree
	 */
	void exitPunto(CsvParser.PuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#nombrearchivo}.
	 * @param ctx the parse tree
	 */
	void enterNombrearchivo(CsvParser.NombrearchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#nombrearchivo}.
	 * @param ctx the parse tree
	 */
	void exitNombrearchivo(CsvParser.NombrearchivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#nombrecarpeta}.
	 * @param ctx the parse tree
	 */
	void enterNombrecarpeta(CsvParser.NombrecarpetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#nombrecarpeta}.
	 * @param ctx the parse tree
	 */
	void exitNombrecarpeta(CsvParser.NombrecarpetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#extension}.
	 * @param ctx the parse tree
	 */
	void enterExtension(CsvParser.ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#extension}.
	 * @param ctx the parse tree
	 */
	void exitExtension(CsvParser.ExtensionContext ctx);
>>>>>>> 74d6d6c63641f0ddb432068d6f111a3a509a5d56
}