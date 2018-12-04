// Generated from c:\antlr\Lenguajes\GramEntrada\EntradaLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EntradaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, ASIG=2, KW_JSON=3, KW_DOT=4, KW_SVG=5, KW_CSV=6, LEN=7, FONTCOLOR=8, 
		FONTNAME=9, FONTSIZE=10, ARROWSIZE=11, ARROWCOLOR=12, PENWIDTH=13, FILLCOLOR=14, 
		STYLE=15, SHAPE=16, EDGE=17, NODE=18, RELATIONSHIP=19, CLASS=20, PROPERTY=21, 
		INHERITANCE=22, INDERECT_USE=23, TEXTO=24, CADENA=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "ASIG", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "LEN", "FONTCOLOR", 
		"FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", "PENWIDTH", "FILLCOLOR", 
		"STYLE", "SHAPE", "EDGE", "NODE", "RELATIONSHIP", "CLASS", "PROPERTY", 
		"INHERITANCE", "INDERECT_USE", "BARRABAJA", "GUION", "TEXTO", "CADENA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "ASIG", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "LEN", 
		"FONTCOLOR", "FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", "PENWIDTH", 
		"FILLCOLOR", "STYLE", "SHAPE", "EDGE", "NODE", "RELATIONSHIP", "CLASS", 
		"PROPERTY", "INHERITANCE", "INDERECT_USE", "TEXTO", "CADENA"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26:
			CADENA_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CADENA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0139\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\5\4?\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\5\5G\n\5\3\5\3\5\3\5\3\5\3\6\5\6N\n\6\3\6\3\6\3\6\3"+
		"\6\3\7\5\7U\n\7\3\7\3\7\3\7\3\7\3\b\5\b\\\n\b\3\b\3\b\3\b\3\b\3\t\5\t"+
		"c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\5\np\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13|\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\5\f\u0088\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\5\r\u0095\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\5\16\u00a3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\5\17"+
		"\u00af\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\5\20"+
		"\u00bc\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\5\21\u00c5\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00cf\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\5\23\u00d8\n\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24"+
		"\u00e1\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\5\25\u00f2\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\5\26\u00fc\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\5\27\u0109\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u0119\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33\u012d\n\33\r\33"+
		"\16\33\u012e\3\34\3\34\6\34\u0133\n\34\r\34\16\34\u0134\3\34\3\34\3\34"+
		"\4\u012e\u0134\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65"+
		"\32\67\33\3\2\2\2\u0154\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2"+
		"\2\7>\3\2\2\2\tF\3\2\2\2\13M\3\2\2\2\rT\3\2\2\2\17[\3\2\2\2\21b\3\2\2"+
		"\2\23o\3\2\2\2\25{\3\2\2\2\27\u0087\3\2\2\2\31\u0094\3\2\2\2\33\u00a2"+
		"\3\2\2\2\35\u00ae\3\2\2\2\37\u00bb\3\2\2\2!\u00c4\3\2\2\2#\u00ce\3\2\2"+
		"\2%\u00d7\3\2\2\2\'\u00e0\3\2\2\2)\u00f1\3\2\2\2+\u00fb\3\2\2\2-\u0108"+
		"\3\2\2\2/\u0118\3\2\2\2\61\u0127\3\2\2\2\63\u0129\3\2\2\2\65\u012c\3\2"+
		"\2\2\67\u0130\3\2\2\29:\7\"\2\2:\4\3\2\2\2;<\7?\2\2<\6\3\2\2\2=?\5\63"+
		"\32\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7L\2\2AB\7U\2\2BC\7Q\2\2CD\7P\2"+
		"\2D\b\3\2\2\2EG\5\63\32\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7F\2\2IJ\7Q"+
		"\2\2JK\7V\2\2K\n\3\2\2\2LN\5\63\32\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7"+
		"U\2\2PQ\7X\2\2QR\7I\2\2R\f\3\2\2\2SU\5\63\32\2TS\3\2\2\2TU\3\2\2\2UV\3"+
		"\2\2\2VW\7E\2\2WX\7U\2\2XY\7X\2\2Y\16\3\2\2\2Z\\\5\63\32\2[Z\3\2\2\2["+
		"\\\3\2\2\2\\]\3\2\2\2]^\7n\2\2^_\7g\2\2_`\7p\2\2`\20\3\2\2\2ac\5\63\32"+
		"\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7h\2\2ef\7q\2\2fg\7p\2\2gh\7v\2\2h"+
		"i\7e\2\2ij\7q\2\2jk\7n\2\2kl\7q\2\2lm\7t\2\2m\22\3\2\2\2np\5\63\32\2o"+
		"n\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7h\2\2rs\7q\2\2st\7p\2\2tu\7v\2\2uv\7"+
		"p\2\2vw\7c\2\2wx\7o\2\2xy\7g\2\2y\24\3\2\2\2z|\5\63\32\2{z\3\2\2\2{|\3"+
		"\2\2\2|}\3\2\2\2}~\7h\2\2~\177\7q\2\2\177\u0080\7p\2\2\u0080\u0081\7v"+
		"\2\2\u0081\u0082\7u\2\2\u0082\u0083\7k\2\2\u0083\u0084\7|\2\2\u0084\u0085"+
		"\7g\2\2\u0085\26\3\2\2\2\u0086\u0088\5\63\32\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b\7t\2"+
		"\2\u008b\u008c\7t\2\2\u008c\u008d\7q\2\2\u008d\u008e\7y\2\2\u008e\u008f"+
		"\7u\2\2\u008f\u0090\7k\2\2\u0090\u0091\7|\2\2\u0091\u0092\7g\2\2\u0092"+
		"\30\3\2\2\2\u0093\u0095\5\63\32\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7q\2\2\u009a\u009b\7y\2\2\u009b\u009c\7e\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7n\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2"+
		"\u00a0\32\3\2\2\2\u00a1\u00a3\5\63\32\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7f\2\2"+
		"\u00aa\u00ab\7v\2\2\u00ab\u00ac\7j\2\2\u00ac\34\3\2\2\2\u00ad\u00af\5"+
		"\63\32\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7h\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7n\2\2"+
		"\u00b4\u00b5\7e\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\36\3\2\2\2\u00ba\u00bc\5\63\32\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7u"+
		"\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7{\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2 \3\2\2\2\u00c3\u00c5\5\63\32\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7j\2"+
		"\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7g\2\2\u00cb\"\3"+
		"\2\2\2\u00cc\u00cf\5\61\31\2\u00cd\u00cf\5\63\32\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"$\3\2\2\2\u00d5\u00d8\5\61\31\2\u00d6\u00d8\5\63\32\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\7p\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd&\3\2\2\2\u00de\u00e1\5\61\31\2\u00df\u00e1\5\63\32\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7c\2\2"+
		"\u00e6\u00e7\7v\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea"+
		"\7p\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed\7k\2\2\u00ed"+
		"\u00ee\7r\2\2\u00ee(\3\2\2\2\u00ef\u00f2\5\61\31\2\u00f0\u00f2\5\63\32"+
		"\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7c\2\2\u00f6"+
		"\u00f7\7u\2\2\u00f7\u00f8\7u\2\2\u00f8*\3\2\2\2\u00f9\u00fc\5\61\31\2"+
		"\u00fa\u00fc\5\63\32\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7t\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7r\2\2\u0101\u0102\7g\2\2\u0102\u0103\7t\2\2"+
		"\u0103\u0104\7v\2\2\u0104\u0105\7{\2\2\u0105,\3\2\2\2\u0106\u0109\5\61"+
		"\31\2\u0107\u0109\5\63\32\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2"+
		"\2\u010c\u010d\7j\2\2\u010d\u010e\7g\2\2\u010e\u010f\7t\2\2\u010f\u0110"+
		"\7k\2\2\u0110\u0111\7v\2\2\u0111\u0112\7c\2\2\u0112\u0113\7p\2\2\u0113"+
		"\u0114\7e\2\2\u0114\u0115\7g\2\2\u0115.\3\2\2\2\u0116\u0119\5\61\31\2"+
		"\u0117\u0119\5\63\32\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7k\2\2\u011b\u011c\7p\2\2\u011c"+
		"\u011d\7f\2\2\u011d\u011e\7g\2\2\u011e\u011f\7t\2\2\u011f\u0120\7g\2\2"+
		"\u0120\u0121\7e\2\2\u0121\u0122\7v\2\2\u0122\u0123\7a\2\2\u0123\u0124"+
		"\7w\2\2\u0124\u0125\7u\2\2\u0125\u0126\7g\2\2\u0126\60\3\2\2\2\u0127\u0128"+
		"\7a\2\2\u0128\62\3\2\2\2\u0129\u012a\7/\2\2\u012a\64\3\2\2\2\u012b\u012d"+
		"\13\2\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012e\u012c\3\2\2\2\u012f\66\3\2\2\2\u0130\u0132\7$\2\2\u0131\u0133\13"+
		"\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7$\2\2\u0137\u0138\b\34"+
		"\2\2\u01388\3\2\2\2\32\2>FMT[bo{\u0087\u0094\u00a2\u00ae\u00bb\u00c4\u00ce"+
		"\u00d7\u00e0\u00f1\u00fb\u0108\u0118\u012e\u0134\3\3\34\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}