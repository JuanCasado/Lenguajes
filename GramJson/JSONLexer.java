// Generated from JSONLexer.g4 by ANTLR 4.7.1
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
		GRAPH=1, TREE=2, PROPERTIES=3, KW_ID=4, KW_GENDER=5, KW_NUMBER=6, KW_WORD_TYPE=7, 
		KW_TYPE_OF=8, KW_IS_LIST=9, KW_OPTIONAL=10, KW_MULTIPLICITY_MAX=11, ESTADO_CONTEXT=12, 
		BOOLEANO=13, TEXTO=14, ABRIR_LLAVE=15, CERRAR_LLAVE=16, ABRIR_CORCHETE=17, 
		CERRAR_CORCHETE=18, DOSPUNTOS=19, COMA=20, WS=21, CERRARCONTEXT=22, INFO=23;
	public static final int
		CONTEXT_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CONTEXT_MODE"
	};

	public static final String[] ruleNames = {
		"GRAPH", "TREE", "PROPERTIES", "P_SPACE", "KW_ID", "KW_GENDER", "KW_NUMBER", 
		"KW_WORD_TYPE", "KW_TYPE_OF", "KW_IS_LIST", "KW_OPTIONAL", "KW_MULTIPLICITY_MAX", 
		"ESTADO_CONTEXT", "BOOLEANO", "TRUE", "FALSE", "TEXTO", "ABRIR_LLAVE", 
		"CERRAR_LLAVE", "ABRIR_CORCHETE", "CERRAR_CORCHETE", "DOSPUNTOS", "COMA", 
		"WS", "CERRARCONTEXT", "INFO", "C_SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"@graph\"'", "'\"@tree\"'", null, "'\"@id\"'", "'\"gender\"'", 
		"'\"number\"'", "'\"wordType\"'", "'\"typeOf\"'", "'\"isList\"'", "'\"optional\"'", 
		"'\"multiplicityMax\"'", "'\"@context\"'", null, null, "'{'", "'}'", "'['", 
		"']'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GRAPH", "TREE", "PROPERTIES", "KW_ID", "KW_GENDER", "KW_NUMBER", 
		"KW_WORD_TYPE", "KW_TYPE_OF", "KW_IS_LIST", "KW_OPTIONAL", "KW_MULTIPLICITY_MAX", 
		"ESTADO_CONTEXT", "BOOLEANO", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", 
		"ABRIR_CORCHETE", "CERRAR_CORCHETE", "DOSPUNTOS", "COMA", "WS", "CERRARCONTEXT", 
		"INFO"
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0109\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\7\5_\n\5\f\5\16\5b\13\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00c5"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\7\22\u00d6\n\22\f\22\16\22\u00d9\13\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00f8\n\32"+
		"\f\32\16\32\u00fb\13\32\3\32\3\32\3\32\3\32\3\33\6\33\u0102\n\33\r\33"+
		"\16\33\u0103\3\33\3\33\3\34\3\34\3\u0103\2\35\4\3\6\4\b\5\n\2\f\6\16\7"+
		"\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \2\"\2$\20&\21(\22*\23,\24"+
		".\25\60\26\62\27\64\30\66\318\2\4\2\3\4\3\2$$\5\2\n\f\17\17\"\"\2\u0109"+
		"\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2"+
		"\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2"+
		"\2\34\3\2\2\2\2\36\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2"+
		"\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2"+
		"\2\2\4:\3\2\2\2\6C\3\2\2\2\bK\3\2\2\2\n`\3\2\2\2\fc\3\2\2\2\16i\3\2\2"+
		"\2\20r\3\2\2\2\22{\3\2\2\2\24\u0086\3\2\2\2\26\u008f\3\2\2\2\30\u0098"+
		"\3\2\2\2\32\u00a3\3\2\2\2\34\u00b5\3\2\2\2\36\u00c4\3\2\2\2 \u00c6\3\2"+
		"\2\2\"\u00cb\3\2\2\2$\u00d1\3\2\2\2&\u00dd\3\2\2\2(\u00df\3\2\2\2*\u00e1"+
		"\3\2\2\2,\u00e3\3\2\2\2.\u00e5\3\2\2\2\60\u00e7\3\2\2\2\62\u00e9\3\2\2"+
		"\2\64\u00ed\3\2\2\2\66\u0101\3\2\2\28\u0107\3\2\2\2:;\7$\2\2;<\7B\2\2"+
		"<=\7i\2\2=>\7t\2\2>?\7c\2\2?@\7r\2\2@A\7j\2\2AB\7$\2\2B\5\3\2\2\2CD\7"+
		"$\2\2DE\7B\2\2EF\7v\2\2FG\7t\2\2GH\7g\2\2HI\7g\2\2IJ\7$\2\2J\7\3\2\2\2"+
		"KL\7$\2\2LM\7r\2\2MN\7t\2\2NO\7q\2\2OP\7r\2\2PQ\7g\2\2QR\7t\2\2RS\7v\2"+
		"\2ST\7k\2\2TU\7g\2\2UV\7u\2\2VW\7$\2\2WX\3\2\2\2XY\5\n\5\2YZ\7<\2\2Z["+
		"\5\n\5\2[\\\7]\2\2\\\t\3\2\2\2]_\7\"\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2"+
		"`a\3\2\2\2a\13\3\2\2\2b`\3\2\2\2cd\7$\2\2de\7B\2\2ef\7k\2\2fg\7f\2\2g"+
		"h\7$\2\2h\r\3\2\2\2ij\7$\2\2jk\7i\2\2kl\7g\2\2lm\7p\2\2mn\7f\2\2no\7g"+
		"\2\2op\7t\2\2pq\7$\2\2q\17\3\2\2\2rs\7$\2\2st\7p\2\2tu\7w\2\2uv\7o\2\2"+
		"vw\7d\2\2wx\7g\2\2xy\7t\2\2yz\7$\2\2z\21\3\2\2\2{|\7$\2\2|}\7y\2\2}~\7"+
		"q\2\2~\177\7t\2\2\177\u0080\7f\2\2\u0080\u0081\7V\2\2\u0081\u0082\7{\2"+
		"\2\u0082\u0083\7r\2\2\u0083\u0084\7g\2\2\u0084\u0085\7$\2\2\u0085\23\3"+
		"\2\2\2\u0086\u0087\7$\2\2\u0087\u0088\7v\2\2\u0088\u0089\7{\2\2\u0089"+
		"\u008a\7r\2\2\u008a\u008b\7g\2\2\u008b\u008c\7Q\2\2\u008c\u008d\7h\2\2"+
		"\u008d\u008e\7$\2\2\u008e\25\3\2\2\2\u008f\u0090\7$\2\2\u0090\u0091\7"+
		"k\2\2\u0091\u0092\7u\2\2\u0092\u0093\7N\2\2\u0093\u0094\7k\2\2\u0094\u0095"+
		"\7u\2\2\u0095\u0096\7v\2\2\u0096\u0097\7$\2\2\u0097\27\3\2\2\2\u0098\u0099"+
		"\7$\2\2\u0099\u009a\7q\2\2\u009a\u009b\7r\2\2\u009b\u009c\7v\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7q\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7n\2\2\u00a1\u00a2\7$\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\7"+
		"$\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7k\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7v\2\2"+
		"\u00af\u00b0\7{\2\2\u00b0\u00b1\7O\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7z\2\2\u00b3\u00b4\7$\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6\u00b7"+
		"\7B\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7z\2\2\u00bd\u00be\7v\2\2"+
		"\u00be\u00bf\7$\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\16\2\2\u00c1\35"+
		"\3\2\2\2\u00c2\u00c5\5 \20\2\u00c3\u00c5\5\"\21\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c5\37\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7"+
		"t\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2\u00ca!\3\2\2\2\u00cb\u00cc"+
		"\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0#\3\2\2\2\u00d1\u00d7\7$\2\2\u00d2\u00d3\7$\2\2\u00d3"+
		"\u00d6\7$\2\2\u00d4\u00d6\n\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7$\2\2\u00db\u00dc\b\22"+
		"\3\2\u00dc%\3\2\2\2\u00dd\u00de\7}\2\2\u00de\'\3\2\2\2\u00df\u00e0\7\177"+
		"\2\2\u00e0)\3\2\2\2\u00e1\u00e2\7]\2\2\u00e2+\3\2\2\2\u00e3\u00e4\7_\2"+
		"\2\u00e4-\3\2\2\2\u00e5\u00e6\7<\2\2\u00e6/\3\2\2\2\u00e7\u00e8\7.\2\2"+
		"\u00e8\61\3\2\2\2\u00e9\u00ea\t\3\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec"+
		"\b\31\4\2\u00ec\63\3\2\2\2\u00ed\u00ee\7$\2\2\u00ee\u00ef\7i\2\2\u00ef"+
		"\u00f0\7t\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7j\2\2"+
		"\u00f3\u00f4\7u\2\2\u00f4\u00f5\7$\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f8"+
		"\58\34\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7<"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\32\5\2\u00ff\65\3\2\2\2\u0100\u0102"+
		"\13\2\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b\33\4\2\u0106\67"+
		"\3\2\2\2\u0107\u0108\7\"\2\2\u01089\3\2\2\2\n\2\3`\u00c4\u00d5\u00d7\u00f9"+
		"\u0103\6\7\3\2\3\22\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}