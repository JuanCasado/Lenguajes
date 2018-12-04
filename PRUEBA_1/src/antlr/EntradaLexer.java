package antlr;

// Generated from EntradaLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
class EntradaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIOABRIR=1, COMENTARIOLINEA=2, CADENA_ABRIR=3, INT=4, LETRA=5, 
		COMA=6, DOBLEPUNTO=7, PUNTO=8, INTRO=9, OPBLT=10, OPBGT=11, SAP=12, SCP=13, 
		ASIG=14, OPASIG=15, BBAJA=16, COR_ABRIR=17, COR_CERRAR=18, KW_DOS_PUNTOS=19, 
		TERMINADOR=20, WS=21, BARRA=22, KW_JSON=23, KW_DOT=24, KW_SVG=25, KW_CSV=26, 
		LEN=27, FONTCOLOR=28, FONTNAME=29, FONTSIZE=30, ARROWSIZE=31, ARROWCOLOR=32, 
		PENWIDTH=33, FILLCOLOR=34, STYLE=35, SHAPE=36, EXTENSION_JSON=37, EXTENSION_SVG=38, 
		EXTENSION_DOT=39, EXTENSION_CSV=40, EDGE=41, NODE=42, RELATIONSHIP=43, 
		CLASS=44, PROPERTY=45, INHERITANCE=46, INDERECT_USE=47, IDF=48, COMENTARIOCERRAR=49, 
		TEXTOCOMENTARIO_ML=50, AUTHOR=51, DESCRIPTION=52, TARGET=53, FINAL_COMENTARIO_UL=54, 
		TEXTOCOMENTARIO_UL=55, CADENA_CERRAR=56, TEXTO_CADENA=57;
	public static final int
		COMENTARIO_MULTILINEA_MODE=1, COMENTARIO_LINEA_MODE=2, CADENA_CARACTERES_MODE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMENTARIO_MULTILINEA_MODE", "COMENTARIO_LINEA_MODE", 
		"CADENA_CARACTERES_MODE"
	};

	public static final String[] ruleNames = {
		"COMENTARIOABRIR", "COMENTARIOLINEA", "CADENA_ABRIR", "INT", "LETRA", 
		"COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "OPBLT", "OPBGT", "SAP", "SCP", 
		"ASIG", "OPASIG", "BBAJA", "COR_ABRIR", "COR_CERRAR", "KW_DOS_PUNTOS", 
		"TERMINADOR", "WS", "BARRA", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", 
		"LEN", "FONTCOLOR", "FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", 
		"PENWIDTH", "FILLCOLOR", "STYLE", "SHAPE", "EXTENSION_JSON", "EXTENSION_SVG", 
		"EXTENSION_DOT", "EXTENSION_CSV", "EDGE", "NODE", "RELATIONSHIP", "CLASS", 
		"PROPERTY", "INHERITANCE", "INDERECT_USE", "IDF", "ID_LETRA", "DIGITO", 
		"BARRABAJA", "GUION", "COMENTARIOCERRAR", "TEXTOCOMENTARIO_ML", "AUTHOR", 
		"DESCRIPTION", "TARGET", "FINAL_COMENTARIO_UL", "TEXTOCOMENTARIO_UL", 
		"CADENA_CERRAR", "TEXTO_CADENA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/*'", "'//'", null, null, null, "','", "'..'", "'.'", null, "'<'", 
		"'>'", "'('", "')'", "'='", "':='", "'_'", "'['", "']'", "':'", "';'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'json'", "'svg'", "'dot'", "'csv'", null, null, 
		null, null, null, null, null, null, "'*/'", null, null, null, null, "'\r\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMENTARIOABRIR", "COMENTARIOLINEA", "CADENA_ABRIR", "INT", "LETRA", 
		"COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "OPBLT", "OPBGT", "SAP", "SCP", 
		"ASIG", "OPASIG", "BBAJA", "COR_ABRIR", "COR_CERRAR", "KW_DOS_PUNTOS", 
		"TERMINADOR", "WS", "BARRA", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", 
		"LEN", "FONTCOLOR", "FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", 
		"PENWIDTH", "FILLCOLOR", "STYLE", "SHAPE", "EXTENSION_JSON", "EXTENSION_SVG", 
		"EXTENSION_DOT", "EXTENSION_CSV", "EDGE", "NODE", "RELATIONSHIP", "CLASS", 
		"PROPERTY", "INHERITANCE", "INDERECT_USE", "IDF", "COMENTARIOCERRAR", 
		"TEXTOCOMENTARIO_ML", "AUTHOR", "DESCRIPTION", "TARGET", "FINAL_COMENTARIO_UL", 
		"TEXTOCOMENTARIO_UL", "CADENA_CERRAR", "TEXTO_CADENA"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public EntradaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EntradaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u021e\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\6\5\u0090\n\5\r\5\16\5\u0091\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\6\n\u009e\n\n\r\n\16\n\u009f\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\6\26\u00ba\n\26\r\26\16\26\u00bb\3\27\3\27\3\30\5\30\u00c1"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\31\5\31\u00c9\n\31\3\31\3\31\3\31\3\31"+
		"\3\32\5\32\u00d0\n\32\3\32\3\32\3\32\3\32\3\33\5\33\u00d7\n\33\3\33\3"+
		"\33\3\33\3\33\3\34\5\34\u00de\n\34\3\34\3\34\3\34\3\34\3\35\5\35\u00e5"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u00f2"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\5\37\u00fe\n\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \5 \u010a\n \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3!\5!\u0117\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3\"\5\"\u0125\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\5#\u0131\n#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\5$\u013e\n$\3$\3$\3$\3$\3$\3$\3%\5%"+
		"\u0147\n%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3*\3*\5*\u0162\n*\3*\3*\3*\3*\3*\3+\3+\5+\u016b\n+\3+\3"+
		"+\3+\3+\3+\3,\3,\5,\u0174\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		"-\3-\5-\u0185\n-\3-\3-\3-\3-\3-\3-\3.\3.\5.\u018f\n.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3/\3/\5/\u019c\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\5\60\u01ac\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\5\61\u01be\n\61\3\61\3\61\3\61\3\61\7\61"+
		"\u01c4\n\61\f\61\16\61\u01c7\13\61\3\62\5\62\u01ca\n\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\6\67\u01d8\n\67\r\67\16"+
		"\67\u01d9\38\38\38\38\38\38\38\38\38\38\68\u01e6\n8\r8\168\u01e7\38\3"+
		"8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\69\u01fb\n9\r9\169\u01fc"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\6:\u0208\n:\r:\16:\u0209\3;\3;\3;\3;\3;\3"+
		"<\6<\u0212\n<\r<\16<\u0213\3=\3=\3=\3=\3>\6>\u021b\n>\r>\16>\u021c\b\u01d9"+
		"\u01e7\u01fc\u0209\u0213\u021c\2?\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n"+
		"\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30\62"+
		"\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/`\60"+
		"b\61d\62f\2h\2j\2l\2n\63p\64r\65t\66v\67x8z9|:~;\6\2\3\4\5\7\3\2\62;\4"+
		"\2C\\c|\4\2\f\f\17\17\4\2\61\61^^\20\2C\\c|\u00c3\u00c3\u00cb\u00cb\u00cf"+
		"\u00cf\u00d3\u00d3\u00dc\u00dc\u00e3\u00e3\u00eb\u00eb\u00ef\u00ef\u00f3"+
		"\u00f3\u00f5\u00f5\u00f8\u00f8\u00fc\u00fc\2\u0241\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3"+
		"\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2"+
		"\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66"+
		"\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2"+
		"\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2"+
		"\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\"+
		"\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\3n\3\2\2\2\3p\3\2"+
		"\2\2\3r\3\2\2\2\3t\3\2\2\2\3v\3\2\2\2\4x\3\2\2\2\4z\3\2\2\2\5|\3\2\2\2"+
		"\5~\3\2\2\2\6\u0080\3\2\2\2\b\u0085\3\2\2\2\n\u008a\3\2\2\2\f\u008f\3"+
		"\2\2\2\16\u0093\3\2\2\2\20\u0095\3\2\2\2\22\u0097\3\2\2\2\24\u009a\3\2"+
		"\2\2\26\u009d\3\2\2\2\30\u00a1\3\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2"+
		"\2\36\u00a7\3\2\2\2 \u00a9\3\2\2\2\"\u00ab\3\2\2\2$\u00ae\3\2\2\2&\u00b0"+
		"\3\2\2\2(\u00b2\3\2\2\2*\u00b4\3\2\2\2,\u00b6\3\2\2\2.\u00b9\3\2\2\2\60"+
		"\u00bd\3\2\2\2\62\u00c0\3\2\2\2\64\u00c8\3\2\2\2\66\u00cf\3\2\2\28\u00d6"+
		"\3\2\2\2:\u00dd\3\2\2\2<\u00e4\3\2\2\2>\u00f1\3\2\2\2@\u00fd\3\2\2\2B"+
		"\u0109\3\2\2\2D\u0116\3\2\2\2F\u0124\3\2\2\2H\u0130\3\2\2\2J\u013d\3\2"+
		"\2\2L\u0146\3\2\2\2N\u014e\3\2\2\2P\u0153\3\2\2\2R\u0157\3\2\2\2T\u015b"+
		"\3\2\2\2V\u0161\3\2\2\2X\u016a\3\2\2\2Z\u0173\3\2\2\2\\\u0184\3\2\2\2"+
		"^\u018e\3\2\2\2`\u019b\3\2\2\2b\u01ab\3\2\2\2d\u01bd\3\2\2\2f\u01c9\3"+
		"\2\2\2h\u01cb\3\2\2\2j\u01cd\3\2\2\2l\u01cf\3\2\2\2n\u01d1\3\2\2\2p\u01d7"+
		"\3\2\2\2r\u01db\3\2\2\2t\u01eb\3\2\2\2v\u01fe\3\2\2\2x\u020b\3\2\2\2z"+
		"\u0211\3\2\2\2|\u0215\3\2\2\2~\u021a\3\2\2\2\u0080\u0081\7\61\2\2\u0081"+
		"\u0082\7,\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\2\2\2\u0084\7\3\2\2\2"+
		"\u0085\u0086\7\61\2\2\u0086\u0087\7\61\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\b\3\3\2\u0089\t\3\2\2\2\u008a\u008b\7$\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\b\4\4\2\u008d\13\3\2\2\2\u008e\u0090\t\2\2\2\u008f\u008e\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\r"+
		"\3\2\2\2\u0093\u0094\t\3\2\2\u0094\17\3\2\2\2\u0095\u0096\7.\2\2\u0096"+
		"\21\3\2\2\2\u0097\u0098\7\60\2\2\u0098\u0099\7\60\2\2\u0099\23\3\2\2\2"+
		"\u009a\u009b\7\60\2\2\u009b\25\3\2\2\2\u009c\u009e\t\4\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\27\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4"+
		"\33\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8"+
		"\37\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa!\3\2\2\2\u00ab\u00ac\7<\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad#\3\2\2\2\u00ae\u00af\7a\2\2\u00af%\3\2\2\2\u00b0\u00b1"+
		"\7]\2\2\u00b1\'\3\2\2\2\u00b2\u00b3\7_\2\2\u00b3)\3\2\2\2\u00b4\u00b5"+
		"\7<\2\2\u00b5+\3\2\2\2\u00b6\u00b7\7=\2\2\u00b7-\3\2\2\2\u00b8\u00ba\7"+
		"\"\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc/\3\2\2\2\u00bd\u00be\t\5\2\2\u00be\61\3\2\2\2\u00bf"+
		"\u00c1\5l\65\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\7L\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c5\7Q\2\2\u00c5\u00c6"+
		"\7P\2\2\u00c6\63\3\2\2\2\u00c7\u00c9\5l\65\2\u00c8\u00c7\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7F\2\2\u00cb\u00cc\7Q\2"+
		"\2\u00cc\u00cd\7V\2\2\u00cd\65\3\2\2\2\u00ce\u00d0\5l\65\2\u00cf\u00ce"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7U\2\2\u00d2"+
		"\u00d3\7X\2\2\u00d3\u00d4\7I\2\2\u00d4\67\3\2\2\2\u00d5\u00d7\5l\65\2"+
		"\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\7E\2\2\u00d9\u00da\7U\2\2\u00da\u00db\7X\2\2\u00db9\3\2\2\2\u00dc\u00de"+
		"\5l\65\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7p\2\2\u00e2;\3\2\2\2\u00e3"+
		"\u00e5\5l\65\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea"+
		"\7v\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7n\2\2\u00ed"+
		"\u00ee\7q\2\2\u00ee\u00ef\7t\2\2\u00ef=\3\2\2\2\u00f0\u00f2\5l\65\2\u00f1"+
		"\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7h"+
		"\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"?\3\2\2\2\u00fc\u00fe\5l\65\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7q\2\2\u0101\u0102"+
		"\7p\2\2\u0102\u0103\7v\2\2\u0103\u0104\7u\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7|\2\2\u0106\u0107\7g\2\2\u0107A\3\2\2\2\u0108\u010a\5l\65\2\u0109"+
		"\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7c"+
		"\2\2\u010c\u010d\7t\2\2\u010d\u010e\7t\2\2\u010e\u010f\7q\2\2\u010f\u0110"+
		"\7y\2\2\u0110\u0111\7u\2\2\u0111\u0112\7k\2\2\u0112\u0113\7|\2\2\u0113"+
		"\u0114\7g\2\2\u0114C\3\2\2\2\u0115\u0117\5l\65\2\u0116\u0115\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7c\2\2\u0119\u011a\7t\2"+
		"\2\u011a\u011b\7t\2\2\u011b\u011c\7q\2\2\u011c\u011d\7y\2\2\u011d\u011e"+
		"\7e\2\2\u011e\u011f\7q\2\2\u011f\u0120\7n\2\2\u0120\u0121\7q\2\2\u0121"+
		"\u0122\7t\2\2\u0122E\3\2\2\2\u0123\u0125\5l\65\2\u0124\u0123\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7r\2\2\u0127\u0128\7g\2"+
		"\2\u0128\u0129\7p\2\2\u0129\u012a\7y\2\2\u012a\u012b\7k\2\2\u012b\u012c"+
		"\7f\2\2\u012c\u012d\7v\2\2\u012d\u012e\7j\2\2\u012eG\3\2\2\2\u012f\u0131"+
		"\5l\65\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\7h\2\2\u0133\u0134\7k\2\2\u0134\u0135\7n\2\2\u0135\u0136\7n\2\2"+
		"\u0136\u0137\7e\2\2\u0137\u0138\7q\2\2\u0138\u0139\7n\2\2\u0139\u013a"+
		"\7q\2\2\u013a\u013b\7t\2\2\u013bI\3\2\2\2\u013c\u013e\5l\65\2\u013d\u013c"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7u\2\2\u0140"+
		"\u0141\7v\2\2\u0141\u0142\7{\2\2\u0142\u0143\7n\2\2\u0143\u0144\7g\2\2"+
		"\u0144K\3\2\2\2\u0145\u0147\5l\65\2\u0146\u0145\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7u\2\2\u0149\u014a\7j\2\2\u014a"+
		"\u014b\7c\2\2\u014b\u014c\7r\2\2\u014c\u014d\7g\2\2\u014dM\3\2\2\2\u014e"+
		"\u014f\7l\2\2\u014f\u0150\7u\2\2\u0150\u0151\7q\2\2\u0151\u0152\7p\2\2"+
		"\u0152O\3\2\2\2\u0153\u0154\7u\2\2\u0154\u0155\7x\2\2\u0155\u0156\7i\2"+
		"\2\u0156Q\3\2\2\2\u0157\u0158\7f\2\2\u0158\u0159\7q\2\2\u0159\u015a\7"+
		"v\2\2\u015aS\3\2\2\2\u015b\u015c\7e\2\2\u015c\u015d\7u\2\2\u015d\u015e"+
		"\7x\2\2\u015eU\3\2\2\2\u015f\u0162\5j\64\2\u0160\u0162\5l\65\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0164\7g\2\2\u0164\u0165\7f\2\2\u0165\u0166\7i\2\2\u0166\u0167\7g\2\2"+
		"\u0167W\3\2\2\2\u0168\u016b\5j\64\2\u0169\u016b\5l\65\2\u016a\u0168\3"+
		"\2\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\7p\2\2\u016d\u016e\7q\2\2\u016e\u016f\7f\2\2\u016f\u0170\7g\2\2"+
		"\u0170Y\3\2\2\2\u0171\u0174\5j\64\2\u0172\u0174\5l\65\2\u0173\u0171\3"+
		"\2\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\7t\2\2\u0176\u0177\7g\2\2\u0177\u0178\7n\2\2\u0178\u0179\7c\2\2"+
		"\u0179\u017a\7v\2\2\u017a\u017b\7k\2\2\u017b\u017c\7q\2\2\u017c\u017d"+
		"\7p\2\2\u017d\u017e\7u\2\2\u017e\u017f\7j\2\2\u017f\u0180\7k\2\2\u0180"+
		"\u0181\7r\2\2\u0181[\3\2\2\2\u0182\u0185\5j\64\2\u0183\u0185\5l\65\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0187\7e\2\2\u0187\u0188\7n\2\2\u0188\u0189\7c\2\2\u0189\u018a"+
		"\7u\2\2\u018a\u018b\7u\2\2\u018b]\3\2\2\2\u018c\u018f\5j\64\2\u018d\u018f"+
		"\5l\65\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\7r\2\2\u0191\u0192\7t\2\2\u0192\u0193\7q\2"+
		"\2\u0193\u0194\7r\2\2\u0194\u0195\7g\2\2\u0195\u0196\7t\2\2\u0196\u0197"+
		"\7v\2\2\u0197\u0198\7{\2\2\u0198_\3\2\2\2\u0199\u019c\5j\64\2\u019a\u019c"+
		"\5l\65\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\7k\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7j\2"+
		"\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7t\2\2\u01a2\u01a3\7k\2\2\u01a3\u01a4"+
		"\7v\2\2\u01a4\u01a5\7c\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a7\7e\2\2\u01a7"+
		"\u01a8\7g\2\2\u01a8a\3\2\2\2\u01a9\u01ac\5j\64\2\u01aa\u01ac\5l\65\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7p\2\2\u01af\u01b0\7f\2\2\u01b0\u01b1"+
		"\7g\2\2\u01b1\u01b2\7t\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7e\2\2\u01b4"+
		"\u01b5\7v\2\2\u01b5\u01b6\7a\2\2\u01b6\u01b7\7w\2\2\u01b7\u01b8\7u\2\2"+
		"\u01b8\u01b9\7g\2\2\u01b9c\3\2\2\2\u01ba\u01be\5f\62\2\u01bb\u01be\5j"+
		"\64\2\u01bc\u01be\5l\65\2\u01bd\u01ba\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01c5\3\2\2\2\u01bf\u01c4\5f\62\2\u01c0\u01c4\5j"+
		"\64\2\u01c1\u01c4\5h\63\2\u01c2\u01c4\5l\65\2\u01c3\u01bf\3\2\2\2\u01c3"+
		"\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2"+
		"\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6e\3\2\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c8\u01ca\t\6\2\2\u01c9\u01c8\3\2\2\2\u01cag\3\2\2\2\u01cb"+
		"\u01cc\t\2\2\2\u01cci\3\2\2\2\u01cd\u01ce\7a\2\2\u01cek\3\2\2\2\u01cf"+
		"\u01d0\7/\2\2\u01d0m\3\2\2\2\u01d1\u01d2\7,\2\2\u01d2\u01d3\7\61\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\b\66\5\2\u01d5o\3\2\2\2\u01d6\u01d8\13\2\2"+
		"\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01daq\3\2\2\2\u01db\u01dc\7B\2\2\u01dc\u01dd\7c\2\2\u01dd\u01de"+
		"\7w\2\2\u01de\u01df\7v\2\2\u01df\u01e0\7j\2\2\u01e0\u01e1\7q\2\2\u01e1"+
		"\u01e2\7t\2\2\u01e2\u01e3\7<\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e6\13\2"+
		"\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\5\26\n\2\u01eas\3\2\2\2"+
		"\u01eb\u01ec\7B\2\2\u01ec\u01ed\7f\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef"+
		"\7u\2\2\u01ef\u01f0\7e\2\2\u01f0\u01f1\7t\2\2\u01f1\u01f2\7k\2\2\u01f2"+
		"\u01f3\7r\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7k\2\2\u01f5\u01f6\7q\2\2"+
		"\u01f6\u01f7\7p\2\2\u01f7\u01f8\7<\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01fb"+
		"\13\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2"+
		"\u01fc\u01fa\3\2\2\2\u01fdu\3\2\2\2\u01fe\u01ff\7B\2\2\u01ff\u0200\7v"+
		"\2\2\u0200\u0201\7c\2\2\u0201\u0202\7t\2\2\u0202\u0203\7i\2\2\u0203\u0204"+
		"\7g\2\2\u0204\u0205\7v\2\2\u0205\u0207\3\2\2\2\u0206\u0208\13\2\2\2\u0207"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020aw\3\2\2\2\u020b\u020c\7\17\2\2\u020c\u020d\7\f\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u020f\b;\5\2\u020fy\3\2\2\2\u0210\u0212\13\2\2\2\u0211"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0214{\3\2\2\2\u0215\u0216\7$\2\2\u0216\u0217\3\2\2\2\u0217\u0218"+
		"\b=\5\2\u0218}\3\2\2\2\u0219\u021b\13\2\2\2\u021a\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\177\3\2\2"+
		"\2(\2\3\4\5\u0091\u009f\u00bb\u00c0\u00c8\u00cf\u00d6\u00dd\u00e4\u00f1"+
		"\u00fd\u0109\u0116\u0124\u0130\u013d\u0146\u0161\u016a\u0173\u0184\u018e"+
		"\u019b\u01ab\u01bd\u01c3\u01c5\u01c9\u01d9\u01e7\u01fc\u0209\u0213\u021c"+
		"\6\7\3\2\7\4\2\7\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}