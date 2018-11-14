// Generated from entradaLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class entradaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIOABRIR=1, COMENTARIOLINEA=2, CADENA_ABRIR=3, INT=4, LETRA=5, 
		COMA=6, DOBLEPUNTO=7, PUNTO=8, INTRO=9, OPBLT=10, OPBGT=11, SAP=12, SCP=13, 
		ASIG=14, OPASIG=15, KW_DOS_PUNTOS=16, TERMINADOR=17, WS=18, BARRA=19, 
		KW_JSON=20, KW_DOT=21, KW_SVG=22, KW_CSV=23, LEN=24, FONTCOLOR=25, FONTNAME=26, 
		FONTSIZE=27, ARROWSIZE=28, ARROWCOLOR=29, PENWIDTH=30, FILLCOLOR=31, STYLE=32, 
		SHAPE=33, EXTENSION_JSON=34, EXTENSION_SVG=35, EXTENSION_DOT=36, EXTENSION_CSV=37, 
		IDF=38, COMENTARIOCERRAR=39, TEXTOCOMENTARIO_ML=40, AUTHOR=41, DESCRIPTION=42, 
		TARGET=43, FINAL_COMENTARIO_UL=44, TEXTOCOMENTARIO_UL=45, CADENA_CERRAR=46, 
		TEXTO_CADENA=47;
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
		"ASIG", "OPASIG", "KW_DOS_PUNTOS", "TERMINADOR", "WS", "BARRA", "KW_JSON", 
		"KW_DOT", "KW_SVG", "KW_CSV", "LEN", "FONTCOLOR", "FONTNAME", "FONTSIZE", 
		"ARROWSIZE", "ARROWCOLOR", "PENWIDTH", "FILLCOLOR", "STYLE", "SHAPE", 
		"EXTENSION_JSON", "EXTENSION_SVG", "EXTENSION_DOT", "EXTENSION_CSV", "IDF", 
		"ID_LETRA", "DIGITO", "BARRABAJA", "COMENTARIOCERRAR", "TEXTOCOMENTARIO_ML", 
		"AUTHOR", "DESCRIPTION", "TARGET", "FINAL_COMENTARIO_UL", "TEXTOCOMENTARIO_UL", 
		"CADENA_CERRAR", "TEXTO_CADENA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/*'", "'//'", null, null, null, "','", "'..'", "'.'", null, "'<'", 
		"'>'", "'('", "')'", "'='", "':='", "':'", "';'", null, null, "'JSON'", 
		"'DOT'", "'SVG'", "'CSV'", "'len'", "'fontcolor'", "'fontname'", "'fontsize'", 
		"'arrowsize'", "'arrowcolor'", "'penwidth'", "'fillcolor'", "'style'", 
		"'shape'", "'json'", "'svg'", "'dot'", "'csv'", null, "'*/'", null, null, 
		null, null, "'\r\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMENTARIOABRIR", "COMENTARIOLINEA", "CADENA_ABRIR", "INT", "LETRA", 
		"COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "OPBLT", "OPBGT", "SAP", "SCP", 
		"ASIG", "OPASIG", "KW_DOS_PUNTOS", "TERMINADOR", "WS", "BARRA", "KW_JSON", 
		"KW_DOT", "KW_SVG", "KW_CSV", "LEN", "FONTCOLOR", "FONTNAME", "FONTSIZE", 
		"ARROWSIZE", "ARROWCOLOR", "PENWIDTH", "FILLCOLOR", "STYLE", "SHAPE", 
		"EXTENSION_JSON", "EXTENSION_SVG", "EXTENSION_DOT", "EXTENSION_CSV", "IDF", 
		"COMENTARIOCERRAR", "TEXTOCOMENTARIO_ML", "AUTHOR", "DESCRIPTION", "TARGET", 
		"FINAL_COMENTARIO_UL", "TEXTOCOMENTARIO_UL", "CADENA_CERRAR", "TEXTO_CADENA"
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


	public entradaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "entradaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0175\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5"+
		"z\n\5\r\5\16\5{\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\6\n\u0088\n\n"+
		"\r\n\16\n\u0089\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\6\23\u009e\n\23\r\23\16\23\u009f\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u011e\n\'\f\'\16"+
		"\'\u0121\13\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3,\6,\u012f\n,\r,\16,\u0130"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\6-\u013d\n-\r-\16-\u013e\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\6.\u0152\n.\r.\16.\u0153\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\6/\u015f\n/\r/\16/\u0160\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\6\61\u0169\n\61\r\61\16\61\u016a\3\62\3\62\3\62\3\62\3\63\6\63\u0172"+
		"\n\63\r\63\16\63\u0173\b\u0130\u013e\u0153\u0160\u016a\u0173\2\64\6\3"+
		"\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21"+
		"$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D"+
		"\"F#H$J%L&N\'P(R\2T\2V\2X)Z*\\+^,`-b.d/f\60h\61\6\2\3\4\5\6\3\2\62;\4"+
		"\2C\\c|\4\2\f\f\17\17\4\2\61\61^^\2\u017a\2\6\3\2\2\2\2\b\3\2\2\2\2\n"+
		"\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2"+
		"\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2"+
		" \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3"+
		"\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2"+
		"\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D"+
		"\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2"+
		"\2\2\3X\3\2\2\2\3Z\3\2\2\2\3\\\3\2\2\2\3^\3\2\2\2\3`\3\2\2\2\4b\3\2\2"+
		"\2\4d\3\2\2\2\5f\3\2\2\2\5h\3\2\2\2\6j\3\2\2\2\bo\3\2\2\2\nt\3\2\2\2\f"+
		"y\3\2\2\2\16}\3\2\2\2\20\177\3\2\2\2\22\u0081\3\2\2\2\24\u0084\3\2\2\2"+
		"\26\u0087\3\2\2\2\30\u008b\3\2\2\2\32\u008d\3\2\2\2\34\u008f\3\2\2\2\36"+
		"\u0091\3\2\2\2 \u0093\3\2\2\2\"\u0095\3\2\2\2$\u0098\3\2\2\2&\u009a\3"+
		"\2\2\2(\u009d\3\2\2\2*\u00a1\3\2\2\2,\u00a3\3\2\2\2.\u00a8\3\2\2\2\60"+
		"\u00ac\3\2\2\2\62\u00b0\3\2\2\2\64\u00b4\3\2\2\2\66\u00b8\3\2\2\28\u00c2"+
		"\3\2\2\2:\u00cb\3\2\2\2<\u00d4\3\2\2\2>\u00de\3\2\2\2@\u00e9\3\2\2\2B"+
		"\u00f2\3\2\2\2D\u00fc\3\2\2\2F\u0102\3\2\2\2H\u0108\3\2\2\2J\u010d\3\2"+
		"\2\2L\u0111\3\2\2\2N\u0115\3\2\2\2P\u0119\3\2\2\2R\u0122\3\2\2\2T\u0124"+
		"\3\2\2\2V\u0126\3\2\2\2X\u0128\3\2\2\2Z\u012e\3\2\2\2\\\u0132\3\2\2\2"+
		"^\u0142\3\2\2\2`\u0155\3\2\2\2b\u0162\3\2\2\2d\u0168\3\2\2\2f\u016c\3"+
		"\2\2\2h\u0171\3\2\2\2jk\7\61\2\2kl\7,\2\2lm\3\2\2\2mn\b\2\2\2n\7\3\2\2"+
		"\2op\7\61\2\2pq\7\61\2\2qr\3\2\2\2rs\b\3\3\2s\t\3\2\2\2tu\7$\2\2uv\3\2"+
		"\2\2vw\b\4\4\2w\13\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|\r\3\2\2\2}~\t\3\2\2~\17\3\2\2\2\177\u0080\7.\2\2\u0080\21\3\2"+
		"\2\2\u0081\u0082\7\60\2\2\u0082\u0083\7\60\2\2\u0083\23\3\2\2\2\u0084"+
		"\u0085\7\60\2\2\u0085\25\3\2\2\2\u0086\u0088\t\4\2\2\u0087\u0086\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\27"+
		"\3\2\2\2\u008b\u008c\7>\2\2\u008c\31\3\2\2\2\u008d\u008e\7@\2\2\u008e"+
		"\33\3\2\2\2\u008f\u0090\7*\2\2\u0090\35\3\2\2\2\u0091\u0092\7+\2\2\u0092"+
		"\37\3\2\2\2\u0093\u0094\7?\2\2\u0094!\3\2\2\2\u0095\u0096\7<\2\2\u0096"+
		"\u0097\7?\2\2\u0097#\3\2\2\2\u0098\u0099\7<\2\2\u0099%\3\2\2\2\u009a\u009b"+
		"\7=\2\2\u009b\'\3\2\2\2\u009c\u009e\7\"\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0)\3\2\2\2"+
		"\u00a1\u00a2\t\5\2\2\u00a2+\3\2\2\2\u00a3\u00a4\7L\2\2\u00a4\u00a5\7U"+
		"\2\2\u00a5\u00a6\7Q\2\2\u00a6\u00a7\7P\2\2\u00a7-\3\2\2\2\u00a8\u00a9"+
		"\7F\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab\7V\2\2\u00ab/\3\2\2\2\u00ac\u00ad"+
		"\7U\2\2\u00ad\u00ae\7X\2\2\u00ae\u00af\7I\2\2\u00af\61\3\2\2\2\u00b0\u00b1"+
		"\7E\2\2\u00b1\u00b2\7U\2\2\u00b2\u00b3\7X\2\2\u00b3\63\3\2\2\2\u00b4\u00b5"+
		"\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\65\3\2\2\2\u00b8\u00b9"+
		"\7h\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7v\2\2\u00bc"+
		"\u00bd\7e\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7q\2\2"+
		"\u00c0\u00c1\7t\2\2\u00c1\67\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7"+
		"q\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8"+
		"\7c\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7g\2\2\u00ca9\3\2\2\2\u00cb\u00cc"+
		"\7h\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7|\2\2\u00d2\u00d3\7g\2\2"+
		"\u00d3;\3\2\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7t\2"+
		"\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7u\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7|\2\2\u00dc\u00dd\7g\2\2\u00dd=\3\2\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7q\2\2\u00e2"+
		"\u00e3\7y\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7n\2\2"+
		"\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8?\3\2\2\2\u00e9\u00ea\7r\2"+
		"\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7y\2\2\u00ed\u00ee"+
		"\7k\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7j\2\2\u00f1"+
		"A\3\2\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7n\2\2\u00f5"+
		"\u00f6\7n\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7n\2\2"+
		"\u00f9\u00fa\7q\2\2\u00fa\u00fb\7t\2\2\u00fbC\3\2\2\2\u00fc\u00fd\7u\2"+
		"\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7{\2\2\u00ff\u0100\7n\2\2\u0100\u0101"+
		"\7g\2\2\u0101E\3\2\2\2\u0102\u0103\7u\2\2\u0103\u0104\7j\2\2\u0104\u0105"+
		"\7c\2\2\u0105\u0106\7r\2\2\u0106\u0107\7g\2\2\u0107G\3\2\2\2\u0108\u0109"+
		"\7l\2\2\u0109\u010a\7u\2\2\u010a\u010b\7q\2\2\u010b\u010c\7p\2\2\u010c"+
		"I\3\2\2\2\u010d\u010e\7u\2\2\u010e\u010f\7x\2\2\u010f\u0110\7i\2\2\u0110"+
		"K\3\2\2\2\u0111\u0112\7f\2\2\u0112\u0113\7q\2\2\u0113\u0114\7v\2\2\u0114"+
		"M\3\2\2\2\u0115\u0116\7e\2\2\u0116\u0117\7u\2\2\u0117\u0118\7x\2\2\u0118"+
		"O\3\2\2\2\u0119\u011f\5R(\2\u011a\u011e\5R(\2\u011b\u011e\5V*\2\u011c"+
		"\u011e\5T)\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2"+
		"\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120Q"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\t\3\2\2\u0123S\3\2\2\2\u0124"+
		"\u0125\t\2\2\2\u0125U\3\2\2\2\u0126\u0127\7a\2\2\u0127W\3\2\2\2\u0128"+
		"\u0129\7,\2\2\u0129\u012a\7\61\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b+"+
		"\5\2\u012cY\3\2\2\2\u012d\u012f\13\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131[\3\2\2\2\u0132"+
		"\u0133\7B\2\2\u0133\u0134\7c\2\2\u0134\u0135\7w\2\2\u0135\u0136\7v\2\2"+
		"\u0136\u0137\7j\2\2\u0137\u0138\7q\2\2\u0138\u0139\7t\2\2\u0139\u013a"+
		"\7<\2\2\u013a\u013c\3\2\2\2\u013b\u013d\13\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\5\26\n\2\u0141]\3\2\2\2\u0142\u0143\7B\2\2\u0143\u0144"+
		"\7f\2\2\u0144\u0145\7g\2\2\u0145\u0146\7u\2\2\u0146\u0147\7e\2\2\u0147"+
		"\u0148\7t\2\2\u0148\u0149\7k\2\2\u0149\u014a\7r\2\2\u014a\u014b\7v\2\2"+
		"\u014b\u014c\7k\2\2\u014c\u014d\7q\2\2\u014d\u014e\7p\2\2\u014e\u014f"+
		"\7<\2\2\u014f\u0151\3\2\2\2\u0150\u0152\13\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154_\3\2\2\2"+
		"\u0155\u0156\7B\2\2\u0156\u0157\7v\2\2\u0157\u0158\7c\2\2\u0158\u0159"+
		"\7t\2\2\u0159\u015a\7i\2\2\u015a\u015b\7g\2\2\u015b\u015c\7v\2\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015f\13\2\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3"+
		"\2\2\2\u0160\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161a\3\2\2\2\u0162\u0163"+
		"\7\17\2\2\u0163\u0164\7\f\2\2\u0164\u0165\3\2\2\2\u0165\u0166\b\60\5\2"+
		"\u0166c\3\2\2\2\u0167\u0169\13\2\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016be\3\2\2\2\u016c\u016d"+
		"\7$\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b\62\5\2\u016fg\3\2\2\2\u0170"+
		"\u0172\13\2\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3"+
		"\2\2\2\u0173\u0171\3\2\2\2\u0174i\3\2\2\2\21\2\3\4\5{\u0089\u009f\u011d"+
		"\u011f\u0130\u013e\u0153\u0160\u016a\u0173\6\7\3\2\7\4\2\7\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}