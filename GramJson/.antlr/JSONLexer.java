// Generated from c:\antlr\Lenguajes\GramJson/JSONLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAPH=1, TREE=2, PROPERTIES=3, USEDBY=4, LANGUAGEDATA=5, KW_ID=6, KW_NAME=7, 
		KW_GENDER=8, KW_NUMBER=9, KW_WORD_TYPE=10, KW_TYPE_OF=11, KW_IS_LIST=12, 
		KW_OPTIONAL=13, KW_MULTIPLICITY_MAX=14, KW_MULTIPLICITY_MIN=15, KW_REVERSE_NAME=16, 
		KW_FROM=17, KW_TO=18, KW_INHERITS=19, LABEL=20, LABEL_REVERSENAME=21, 
		ESTADO_CONTEXT=22, BOOLEANO=23, TEXTO=24, ABRIR_LLAVE=25, CERRAR_LLAVE=26, 
		ABRIR_CORCHETE=27, CERRAR_CORCHETE=28, DOSPUNTOS=29, COMA=30, WS=31, CERRARCONTEXT=32, 
		INFO=33;
	public static final int
		CONTEXT_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CONTEXT_MODE"
	};

	public static final String[] ruleNames = {
		"GRAPH", "TREE", "PROPERTIES", "USEDBY", "LANGUAGEDATA", "P_SPACE", "KW_ID", 
		"KW_NAME", "KW_GENDER", "KW_NUMBER", "KW_WORD_TYPE", "KW_TYPE_OF", "KW_IS_LIST", 
		"KW_OPTIONAL", "KW_MULTIPLICITY_MAX", "KW_MULTIPLICITY_MIN", "KW_REVERSE_NAME", 
		"KW_FROM", "KW_TO", "KW_INHERITS", "LABEL", "LABEL_REVERSENAME", "ESTADO_CONTEXT", 
		"BOOLEANO", "TRUE", "FALSE", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", 
		"CERRAR_CORCHETE", "DOSPUNTOS", "COMA", "WS", "CERRARCONTEXT", "INFO", 
		"C_SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"@graph\"'", "'\"@tree\"'", null, "'\"usedby\"'", "'\"languageData\"'", 
		"'\"@id\"'", "'\"name\"'", "'\"gender\"'", "'\"number\"'", "'\"wordType\"'", 
		"'\"typeOf\"'", "'\"isList\"'", "'\"optional\"'", "'\"multiplicityMax\"'", 
		"'\"multiplicityMin\"'", "'\"reverseName\"'", "'\"from\"'", "'\"to\"'", 
		"'\"inherits\"'", "'\"label\"'", "'\"labelReverseName\"'", "'\"@context\"'", 
		null, null, "'{'", "'}'", "'['", "']'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GRAPH", "TREE", "PROPERTIES", "USEDBY", "LANGUAGEDATA", "KW_ID", 
		"KW_NAME", "KW_GENDER", "KW_NUMBER", "KW_WORD_TYPE", "KW_TYPE_OF", "KW_IS_LIST", 
		"KW_OPTIONAL", "KW_MULTIPLICITY_MAX", "KW_MULTIPLICITY_MIN", "KW_REVERSE_NAME", 
		"KW_FROM", "KW_TO", "KW_INHERITS", "LABEL", "LABEL_REVERSENAME", "ESTADO_CONTEXT", 
		"BOOLEANO", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", 
		"CERRAR_CORCHETE", "DOSPUNTOS", "COMA", "WS", "CERRARCONTEXT", "INFO"
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSONLexer.g4"; }

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
			TEXTO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEXTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(-)", "$1"));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u018e\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\7\7\u008b\n\7\f\7\16\7\u008e\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\5\31\u014a\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u015b\n\34\f\34\16\34\u015e\13"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u017d\n$\f$\16$\u0180\13$"+
		"\3$\3$\3$\3$\3%\6%\u0187\n%\r%\16%\u0188\3%\3%\3&\3&\3\u0188\2\'\4\3\6"+
		"\4\b\5\n\6\f\7\16\2\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21"+
		"$\22&\23(\24*\25,\26.\27\60\30\62\31\64\2\66\28\32:\33<\34>\35@\36B\37"+
		"D F!H\"J#L\2\4\2\3\4\3\2$$\5\2\n\f\17\17\"\"\2\u018e\2\4\3\2\2\2\2\6\3"+
		"\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3"+
		"\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2"+
		"\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\28\3\2\2\2\2:\3\2"+
		"\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2"+
		"\3H\3\2\2\2\3J\3\2\2\2\4N\3\2\2\2\6W\3\2\2\2\b_\3\2\2\2\nq\3\2\2\2\fz"+
		"\3\2\2\2\16\u008c\3\2\2\2\20\u008f\3\2\2\2\22\u0095\3\2\2\2\24\u009c\3"+
		"\2\2\2\26\u00a5\3\2\2\2\30\u00ae\3\2\2\2\32\u00b9\3\2\2\2\34\u00c2\3\2"+
		"\2\2\36\u00cb\3\2\2\2 \u00d6\3\2\2\2\"\u00e8\3\2\2\2$\u00fa\3\2\2\2&\u0108"+
		"\3\2\2\2(\u010f\3\2\2\2*\u0114\3\2\2\2,\u011f\3\2\2\2.\u0127\3\2\2\2\60"+
		"\u013a\3\2\2\2\62\u0149\3\2\2\2\64\u014b\3\2\2\2\66\u0150\3\2\2\28\u0156"+
		"\3\2\2\2:\u0162\3\2\2\2<\u0164\3\2\2\2>\u0166\3\2\2\2@\u0168\3\2\2\2B"+
		"\u016a\3\2\2\2D\u016c\3\2\2\2F\u016e\3\2\2\2H\u0172\3\2\2\2J\u0186\3\2"+
		"\2\2L\u018c\3\2\2\2NO\7$\2\2OP\7B\2\2PQ\7i\2\2QR\7t\2\2RS\7c\2\2ST\7r"+
		"\2\2TU\7j\2\2UV\7$\2\2V\5\3\2\2\2WX\7$\2\2XY\7B\2\2YZ\7v\2\2Z[\7t\2\2"+
		"[\\\7g\2\2\\]\7g\2\2]^\7$\2\2^\7\3\2\2\2_`\7$\2\2`a\7r\2\2ab\7t\2\2bc"+
		"\7q\2\2cd\7r\2\2de\7g\2\2ef\7t\2\2fg\7v\2\2gh\7k\2\2hi\7g\2\2ij\7u\2\2"+
		"jk\7$\2\2kl\3\2\2\2lm\5\16\7\2mn\7<\2\2no\5\16\7\2op\7]\2\2p\t\3\2\2\2"+
		"qr\7$\2\2rs\7w\2\2st\7u\2\2tu\7g\2\2uv\7f\2\2vw\7d\2\2wx\7{\2\2xy\7$\2"+
		"\2y\13\3\2\2\2z{\7$\2\2{|\7n\2\2|}\7c\2\2}~\7p\2\2~\177\7i\2\2\177\u0080"+
		"\7w\2\2\u0080\u0081\7c\2\2\u0081\u0082\7i\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7F\2\2\u0084\u0085\7c\2\2\u0085\u0086\7v\2\2\u0086\u0087\7c\2\2"+
		"\u0087\u0088\7$\2\2\u0088\r\3\2\2\2\u0089\u008b\7\"\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\17\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7$\2\2\u0090\u0091\7B\2\2"+
		"\u0091\u0092\7k\2\2\u0092\u0093\7f\2\2\u0093\u0094\7$\2\2\u0094\21\3\2"+
		"\2\2\u0095\u0096\7$\2\2\u0096\u0097\7p\2\2\u0097\u0098\7c\2\2\u0098\u0099"+
		"\7o\2\2\u0099\u009a\7g\2\2\u009a\u009b\7$\2\2\u009b\23\3\2\2\2\u009c\u009d"+
		"\7$\2\2\u009d\u009e\7i\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7f\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7$\2\2"+
		"\u00a4\25\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7"+
		"w\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7t\2\2\u00ac\u00ad\7$\2\2\u00ad\27\3\2\2\2\u00ae\u00af\7$\2\2\u00af\u00b0"+
		"\7y\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7f\2\2\u00b3"+
		"\u00b4\7V\2\2\u00b4\u00b5\7{\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7g\2\2"+
		"\u00b7\u00b8\7$\2\2\u00b8\31\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba\u00bb\7"+
		"v\2\2\u00bb\u00bc\7{\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7g\2\2\u00be\u00bf"+
		"\7Q\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7$\2\2\u00c1\33\3\2\2\2\u00c2\u00c3"+
		"\7$\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7N\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7$\2\2"+
		"\u00ca\35\3\2\2\2\u00cb\u00cc\7$\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7"+
		"r\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2"+
		"\7p\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7$\2\2\u00d5"+
		"\37\3\2\2\2\u00d6\u00d7\7$\2\2\u00d7\u00d8\7o\2\2\u00d8\u00d9\7w\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7r\2\2"+
		"\u00dd\u00de\7n\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1"+
		"\7k\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7{\2\2\u00e3\u00e4\7O\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7z\2\2\u00e6\u00e7\7$\2\2\u00e7!\3\2\2\2\u00e8"+
		"\u00e9\7$\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7n\2\2"+
		"\u00ec\u00ed\7v\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0"+
		"\7n\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7{\2\2\u00f5\u00f6\7O\2\2\u00f6\u00f7\7k\2\2"+
		"\u00f7\u00f8\7p\2\2\u00f8\u00f9\7$\2\2\u00f9#\3\2\2\2\u00fa\u00fb\7$\2"+
		"\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7x\2\2\u00fe\u00ff"+
		"\7g\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7u\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0103\7P\2\2\u0103\u0104\7c\2\2\u0104\u0105\7o\2\2\u0105\u0106\7g\2\2"+
		"\u0106\u0107\7$\2\2\u0107%\3\2\2\2\u0108\u0109\7$\2\2\u0109\u010a\7h\2"+
		"\2\u010a\u010b\7t\2\2\u010b\u010c\7q\2\2\u010c\u010d\7o\2\2\u010d\u010e"+
		"\7$\2\2\u010e\'\3\2\2\2\u010f\u0110\7$\2\2\u0110\u0111\7v\2\2\u0111\u0112"+
		"\7q\2\2\u0112\u0113\7$\2\2\u0113)\3\2\2\2\u0114\u0115\7$\2\2\u0115\u0116"+
		"\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7j\2\2\u0118\u0119\7g\2\2\u0119"+
		"\u011a\7t\2\2\u011a\u011b\7k\2\2\u011b\u011c\7v\2\2\u011c\u011d\7u\2\2"+
		"\u011d\u011e\7$\2\2\u011e+\3\2\2\2\u011f\u0120\7$\2\2\u0120\u0121\7n\2"+
		"\2\u0121\u0122\7c\2\2\u0122\u0123\7d\2\2\u0123\u0124\7g\2\2\u0124\u0125"+
		"\7n\2\2\u0125\u0126\7$\2\2\u0126-\3\2\2\2\u0127\u0128\7$\2\2\u0128\u0129"+
		"\7n\2\2\u0129\u012a\7c\2\2\u012a\u012b\7d\2\2\u012b\u012c\7g\2\2\u012c"+
		"\u012d\7n\2\2\u012d\u012e\7T\2\2\u012e\u012f\7g\2\2\u012f\u0130\7x\2\2"+
		"\u0130\u0131\7g\2\2\u0131\u0132\7t\2\2\u0132\u0133\7u\2\2\u0133\u0134"+
		"\7g\2\2\u0134\u0135\7P\2\2\u0135\u0136\7c\2\2\u0136\u0137\7o\2\2\u0137"+
		"\u0138\7g\2\2\u0138\u0139\7$\2\2\u0139/\3\2\2\2\u013a\u013b\7$\2\2\u013b"+
		"\u013c\7B\2\2\u013c\u013d\7e\2\2\u013d\u013e\7q\2\2\u013e\u013f\7p\2\2"+
		"\u013f\u0140\7v\2\2\u0140\u0141\7g\2\2\u0141\u0142\7z\2\2\u0142\u0143"+
		"\7v\2\2\u0143\u0144\7$\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\30\2\2\u0146"+
		"\61\3\2\2\2\u0147\u014a\5\64\32\2\u0148\u014a\5\66\33\2\u0149\u0147\3"+
		"\2\2\2\u0149\u0148\3\2\2\2\u014a\63\3\2\2\2\u014b\u014c\7v\2\2\u014c\u014d"+
		"\7t\2\2\u014d\u014e\7w\2\2\u014e\u014f\7g\2\2\u014f\65\3\2\2\2\u0150\u0151"+
		"\7h\2\2\u0151\u0152\7c\2\2\u0152\u0153\7n\2\2\u0153\u0154\7u\2\2\u0154"+
		"\u0155\7g\2\2\u0155\67\3\2\2\2\u0156\u015c\7$\2\2\u0157\u0158\7$\2\2\u0158"+
		"\u015b\7$\2\2\u0159\u015b\n\2\2\2\u015a\u0157\3\2\2\2\u015a\u0159\3\2"+
		"\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7$\2\2\u0160\u0161\b\34"+
		"\3\2\u01619\3\2\2\2\u0162\u0163\7}\2\2\u0163;\3\2\2\2\u0164\u0165\7\177"+
		"\2\2\u0165=\3\2\2\2\u0166\u0167\7]\2\2\u0167?\3\2\2\2\u0168\u0169\7_\2"+
		"\2\u0169A\3\2\2\2\u016a\u016b\7<\2\2\u016bC\3\2\2\2\u016c\u016d\7.\2\2"+
		"\u016dE\3\2\2\2\u016e\u016f\t\3\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b"+
		"#\4\2\u0171G\3\2\2\2\u0172\u0173\7$\2\2\u0173\u0174\7i\2\2\u0174\u0175"+
		"\7t\2\2\u0175\u0176\7c\2\2\u0176\u0177\7r\2\2\u0177\u0178\7j\2\2\u0178"+
		"\u0179\7u\2\2\u0179\u017a\7$\2\2\u017a\u017e\3\2\2\2\u017b\u017d\5L&\2"+
		"\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7<\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\b$\5\2\u0184I\3\2\2\2\u0185\u0187\13\2\2\2"+
		"\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b%\4\2\u018bK\3\2\2\2\u018c\u018d"+
		"\7\"\2\2\u018dM\3\2\2\2\n\2\3\u008c\u0149\u015a\u015c\u017e\u0188\6\7"+
		"\3\2\3\34\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}