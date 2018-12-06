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
		KW_TYPE_OF=8, KW_ISLIST=9, ESTADO_CONTEXT=10, BOOLEANO=11, TEXTO=12, ABRIR_LLAVE=13, 
		CERRAR_LLAVE=14, ABRIR_CORCHETE=15, CERRAR_CORCHETE=16, DOSPUNTOS=17, 
		COMA=18, WS=19, CERRARCONTEXT=20, INFO=21;
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
		"KW_WORD_TYPE", "KW_TYPE_OF", "KW_ISLIST", "ESTADO_CONTEXT", "BOOLEANO", 
		"TRUE", "FALSE", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", 
		"CERRAR_CORCHETE", "DOSPUNTOS", "COMA", "WS", "CERRARCONTEXT", "INFO", 
		"C_SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"@graph\"'", "'\"@tree\"'", null, "'\"@id\"'", "'\"gender\"'", 
		"'\"number\"'", "'\"wordType\"'", "'\"typeOf\"'", "'\"isList\"'", "'\"@context\"'", 
		null, null, "'{'", "'}'", "'['", "']'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GRAPH", "TREE", "PROPERTIES", "KW_ID", "KW_GENDER", "KW_NUMBER", 
		"KW_WORD_TYPE", "KW_TYPE_OF", "KW_ISLIST", "ESTADO_CONTEXT", "BOOLEANO", 
		"TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", "CERRAR_CORCHETE", 
		"DOSPUNTOS", "COMA", "WS", "CERRARCONTEXT", "INFO"
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00e8\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\7\5[\n\5\f\5\16\5^\13\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00a4\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7"+
		"\20\u00b5\n\20\f\20\16\20\u00b8\13\20\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00d7\n\30\f\30\16\30"+
		"\u00da\13\30\3\30\3\30\3\30\3\30\3\31\6\31\u00e1\n\31\r\31\16\31\u00e2"+
		"\3\31\3\31\3\32\3\32\3\u00e2\2\33\4\3\6\4\b\5\n\2\f\6\16\7\20\b\22\t\24"+
		"\n\26\13\30\f\32\r\34\2\36\2 \16\"\17$\20&\21(\22*\23,\24.\25\60\26\62"+
		"\27\64\2\4\2\3\4\3\2$$\5\2\n\f\17\17\"\"\2\u00e8\2\4\3\2\2\2\2\6\3\2\2"+
		"\2\2\b\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2"+
		"\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\3\60"+
		"\3\2\2\2\3\62\3\2\2\2\4\66\3\2\2\2\6?\3\2\2\2\bG\3\2\2\2\n\\\3\2\2\2\f"+
		"_\3\2\2\2\16e\3\2\2\2\20n\3\2\2\2\22w\3\2\2\2\24\u0082\3\2\2\2\26\u008b"+
		"\3\2\2\2\30\u0094\3\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00aa\3"+
		"\2\2\2 \u00b0\3\2\2\2\"\u00bc\3\2\2\2$\u00be\3\2\2\2&\u00c0\3\2\2\2(\u00c2"+
		"\3\2\2\2*\u00c4\3\2\2\2,\u00c6\3\2\2\2.\u00c8\3\2\2\2\60\u00cc\3\2\2\2"+
		"\62\u00e0\3\2\2\2\64\u00e6\3\2\2\2\66\67\7$\2\2\678\7B\2\289\7i\2\29:"+
		"\7t\2\2:;\7c\2\2;<\7r\2\2<=\7j\2\2=>\7$\2\2>\5\3\2\2\2?@\7$\2\2@A\7B\2"+
		"\2AB\7v\2\2BC\7t\2\2CD\7g\2\2DE\7g\2\2EF\7$\2\2F\7\3\2\2\2GH\7$\2\2HI"+
		"\7r\2\2IJ\7t\2\2JK\7q\2\2KL\7r\2\2LM\7g\2\2MN\7t\2\2NO\7v\2\2OP\7k\2\2"+
		"PQ\7g\2\2QR\7u\2\2RS\7$\2\2ST\3\2\2\2TU\5\n\5\2UV\7<\2\2VW\5\n\5\2WX\7"+
		"]\2\2X\t\3\2\2\2Y[\7\"\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]"+
		"\13\3\2\2\2^\\\3\2\2\2_`\7$\2\2`a\7B\2\2ab\7k\2\2bc\7f\2\2cd\7$\2\2d\r"+
		"\3\2\2\2ef\7$\2\2fg\7i\2\2gh\7g\2\2hi\7p\2\2ij\7f\2\2jk\7g\2\2kl\7t\2"+
		"\2lm\7$\2\2m\17\3\2\2\2no\7$\2\2op\7p\2\2pq\7w\2\2qr\7o\2\2rs\7d\2\2s"+
		"t\7g\2\2tu\7t\2\2uv\7$\2\2v\21\3\2\2\2wx\7$\2\2xy\7y\2\2yz\7q\2\2z{\7"+
		"t\2\2{|\7f\2\2|}\7V\2\2}~\7{\2\2~\177\7r\2\2\177\u0080\7g\2\2\u0080\u0081"+
		"\7$\2\2\u0081\23\3\2\2\2\u0082\u0083\7$\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7{\2\2\u0085\u0086\7r\2\2\u0086\u0087\7g\2\2\u0087\u0088\7Q\2\2\u0088"+
		"\u0089\7h\2\2\u0089\u008a\7$\2\2\u008a\25\3\2\2\2\u008b\u008c\7$\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7u\2\2\u008e\u008f\7N\2\2\u008f\u0090\7k\2\2"+
		"\u0090\u0091\7u\2\2\u0091\u0092\7v\2\2\u0092\u0093\7$\2\2\u0093\27\3\2"+
		"\2\2\u0094\u0095\7$\2\2\u0095\u0096\7B\2\2\u0096\u0097\7e\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7z\2\2\u009c\u009d\7v\2\2\u009d\u009e\7$\2\2\u009e\u009f\3\2\2"+
		"\2\u009f\u00a0\b\f\2\2\u00a0\31\3\2\2\2\u00a1\u00a4\5\34\16\2\u00a2\u00a4"+
		"\5\36\17\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\33\3\2\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\35\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7"+
		"n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af\37\3\2\2\2\u00b0\u00b6"+
		"\7$\2\2\u00b1\u00b2\7$\2\2\u00b2\u00b5\7$\2\2\u00b3\u00b5\n\2\2\2\u00b4"+
		"\u00b1\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\7$\2\2\u00ba\u00bb\b\20\3\2\u00bb!\3\2\2\2\u00bc\u00bd\7}\2\2\u00bd"+
		"#\3\2\2\2\u00be\u00bf\7\177\2\2\u00bf%\3\2\2\2\u00c0\u00c1\7]\2\2\u00c1"+
		"\'\3\2\2\2\u00c2\u00c3\7_\2\2\u00c3)\3\2\2\2\u00c4\u00c5\7<\2\2\u00c5"+
		"+\3\2\2\2\u00c6\u00c7\7.\2\2\u00c7-\3\2\2\2\u00c8\u00c9\t\3\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\b\27\4\2\u00cb/\3\2\2\2\u00cc\u00cd\7$\2\2"+
		"\u00cd\u00ce\7i\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1"+
		"\7r\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7$\2\2\u00d4"+
		"\u00d8\3\2\2\2\u00d5\u00d7\5\64\32\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dc\7<\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\30"+
		"\5\2\u00de\61\3\2\2\2\u00df\u00e1\13\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b\31\4\2\u00e5\63\3\2\2\2\u00e6\u00e7\7\"\2\2\u00e7\65\3\2\2\2"+
		"\n\2\3\\\u00a3\u00b4\u00b6\u00d8\u00e2\6\7\3\2\3\20\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}