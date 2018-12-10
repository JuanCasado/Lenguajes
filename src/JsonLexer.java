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
		GRAPH=1, TREE=2, PROPERTIES=3, USEDBY=4, LANGUAGEDATA=5, KW_ID=6, KW_NAME=7, 
		KW_GENDER=8, KW_NUMBER=9, KW_WORD_TYPE=10, KW_TYPE_OF=11, KW_IS_LIST=12, 
		KW_OPTIONAL=13, KW_MULTIPLICITY_MAX=14, KW_MULTIPLICITY_MIN=15, KW_REVERSE_NAME=16, 
		KW_FROM=17, KW_TO=18, KW_INHERITS=19, LABEL=20, LABEL_REVERSENAME=21, 
		ESTADO_CONTEXT=22, BOOLEANO=23, TEXTO=24, ABRIR_LLAVE=25, CERRAR_LLAVE=26, 
		ABRIR_CORCHETE=27, CERRAR_CORCHETE=28, COMA=29, DOSPUNTOS=30, WS=31, CERRARCONTEXT=32, 
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
		"GRAPH", "TREE", "PROPERTIES", "USEDBY", "LANGUAGEDATA", "P_SPACE", "DOSPUNTOSF", 
		"KW_ID", "KW_NAME", "KW_GENDER", "KW_NUMBER", "KW_WORD_TYPE", "KW_TYPE_OF", 
		"KW_IS_LIST", "KW_OPTIONAL", "KW_MULTIPLICITY_MAX", "KW_MULTIPLICITY_MIN", 
		"KW_REVERSE_NAME", "KW_FROM", "KW_TO", "KW_INHERITS", "LABEL", "LABEL_REVERSENAME", 
		"ESTADO_CONTEXT", "BOOLEANO", "TRUE", "FALSE", "TEXTO", "ABRIR_LLAVE", 
		"CERRAR_LLAVE", "ABRIR_CORCHETE", "CERRAR_CORCHETE", "COMA", "DOSPUNTOS", 
		"WS", "CERRARCONTEXT", "INFO", "C_SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'\"@context\"'", 
		null, null, "'{'", "'}'", "'['", "']'", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GRAPH", "TREE", "PROPERTIES", "USEDBY", "LANGUAGEDATA", "KW_ID", 
		"KW_NAME", "KW_GENDER", "KW_NUMBER", "KW_WORD_TYPE", "KW_TYPE_OF", "KW_IS_LIST", 
		"KW_OPTIONAL", "KW_MULTIPLICITY_MAX", "KW_MULTIPLICITY_MIN", "KW_REVERSE_NAME", 
		"KW_FROM", "KW_TO", "KW_INHERITS", "LABEL", "LABEL_REVERSENAME", "ESTADO_CONTEXT", 
		"BOOLEANO", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", 
		"CERRAR_CORCHETE", "COMA", "DOSPUNTOS", "WS", "CERRARCONTEXT", "INFO"
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
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u01ce\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7\u0099\n\7"+
		"\f\7\16\7\u009c\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u018a\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u019b\n\35"+
		"\f\35\16\35\u019e\13\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01bd\n%"+
		"\f%\16%\u01c0\13%\3%\3%\3%\3%\3&\6&\u01c7\n&\r&\16&\u01c8\3&\3&\3\'\3"+
		"\'\3\u01c8\2(\4\3\6\4\b\5\n\6\f\7\16\2\20\2\22\b\24\t\26\n\30\13\32\f"+
		"\34\r\36\16 \17\"\20$\21&\22(\23*\24,\25.\26\60\27\62\30\64\31\66\28\2"+
		":\32<\33>\34@\35B\36D\37F H!J\"L#N\2\4\2\3\4\3\2$$\5\2\n\f\17\17\"\"\2"+
		"\u01cd\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\22"+
		"\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2"+
		"\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2"+
		"\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3"+
		"\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2"+
		"\2\2F\3\2\2\2\2H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\4P\3\2\2\2\6\\\3\2\2\2"+
		"\bg\3\2\2\2\ny\3\2\2\2\f\u0085\3\2\2\2\16\u009a\3\2\2\2\20\u009d\3\2\2"+
		"\2\22\u009f\3\2\2\2\24\u00a8\3\2\2\2\26\u00b2\3\2\2\2\30\u00be\3\2\2\2"+
		"\32\u00ca\3\2\2\2\34\u00d8\3\2\2\2\36\u00e4\3\2\2\2 \u00f0\3\2\2\2\"\u00fe"+
		"\3\2\2\2$\u0113\3\2\2\2&\u0128\3\2\2\2(\u0139\3\2\2\2*\u0143\3\2\2\2,"+
		"\u014b\3\2\2\2.\u0159\3\2\2\2\60\u0164\3\2\2\2\62\u017a\3\2\2\2\64\u0189"+
		"\3\2\2\2\66\u018b\3\2\2\28\u0190\3\2\2\2:\u0196\3\2\2\2<\u01a2\3\2\2\2"+
		">\u01a4\3\2\2\2@\u01a6\3\2\2\2B\u01a8\3\2\2\2D\u01aa\3\2\2\2F\u01ac\3"+
		"\2\2\2H\u01ae\3\2\2\2J\u01b2\3\2\2\2L\u01c6\3\2\2\2N\u01cc\3\2\2\2PQ\7"+
		"$\2\2QR\7B\2\2RS\7i\2\2ST\7t\2\2TU\7c\2\2UV\7r\2\2VW\7j\2\2WX\7$\2\2X"+
		"Y\3\2\2\2YZ\5\16\7\2Z[\5\20\b\2[\5\3\2\2\2\\]\7$\2\2]^\7B\2\2^_\7v\2\2"+
		"_`\7t\2\2`a\7g\2\2ab\7g\2\2bc\7$\2\2cd\3\2\2\2de\5\16\7\2ef\5\20\b\2f"+
		"\7\3\2\2\2gh\7$\2\2hi\7r\2\2ij\7t\2\2jk\7q\2\2kl\7r\2\2lm\7g\2\2mn\7t"+
		"\2\2no\7v\2\2op\7k\2\2pq\7g\2\2qr\7u\2\2rs\7$\2\2st\3\2\2\2tu\5\16\7\2"+
		"uv\5\20\b\2vw\5\16\7\2wx\7]\2\2x\t\3\2\2\2yz\7$\2\2z{\7w\2\2{|\7u\2\2"+
		"|}\7g\2\2}~\7f\2\2~\177\7d\2\2\177\u0080\7{\2\2\u0080\u0081\7$\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\5\16\7\2\u0083\u0084\5\20\b\2\u0084\13\3\2"+
		"\2\2\u0085\u0086\7$\2\2\u0086\u0087\7n\2\2\u0087\u0088\7c\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7i\2\2\u008a\u008b\7w\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7i\2\2\u008d\u008e\7g\2\2\u008e\u008f\7F\2\2\u008f\u0090\7c\2\2"+
		"\u0090\u0091\7v\2\2\u0091\u0092\7c\2\2\u0092\u0093\7$\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\5\16\7\2\u0095\u0096\5\20\b\2\u0096\r\3\2\2\2\u0097"+
		"\u0099\7\"\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\17\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
		"\7<\2\2\u009e\21\3\2\2\2\u009f\u00a0\7$\2\2\u00a0\u00a1\7B\2\2\u00a1\u00a2"+
		"\7k\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7$\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\5\16\7\2\u00a6\u00a7\5\20\b\2\u00a7\23\3\2\2\2\u00a8\u00a9\7$\2"+
		"\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7$\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5\16\7\2\u00b0"+
		"\u00b1\5\20\b\2\u00b1\25\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b4\7i\2\2"+
		"\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7$\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\5\16\7\2\u00bc\u00bd\5\20\b\2\u00bd\27\3\2\2\2\u00be\u00bf\7$\2"+
		"\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7o\2\2\u00c2\u00c3"+
		"\7d\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7$\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\5\16\7\2\u00c8\u00c9\5\20\b\2\u00c9\31\3\2"+
		"\2\2\u00ca\u00cb\7$\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7V\2\2\u00d0\u00d1\7{\2\2\u00d1"+
		"\u00d2\7r\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7$\2\2\u00d4\u00d5\3\2\2"+
		"\2\u00d5\u00d6\5\16\7\2\u00d6\u00d7\5\20\b\2\u00d7\33\3\2\2\2\u00d8\u00d9"+
		"\7$\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7{\2\2\u00db\u00dc\7r\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7Q\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7$\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e2\5\16\7\2\u00e2\u00e3\5\20\b\2\u00e3\35"+
		"\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7u\2\2\u00e7"+
		"\u00e8\7N\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7v\2\2"+
		"\u00eb\u00ec\7$\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5\16\7\2\u00ee\u00ef"+
		"\5\20\b\2\u00ef\37\3\2\2\2\u00f0\u00f1\7$\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"\u00f3\7r\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7q\2\2"+
		"\u00f6\u00f7\7p\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa"+
		"\7$\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\5\16\7\2\u00fc\u00fd\5\20\b\2"+
		"\u00fd!\3\2\2\2\u00fe\u00ff\7$\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7w\2"+
		"\2\u0101\u0102\7n\2\2\u0102\u0103\7v\2\2\u0103\u0104\7k\2\2\u0104\u0105"+
		"\7r\2\2\u0105\u0106\7n\2\2\u0106\u0107\7k\2\2\u0107\u0108\7e\2\2\u0108"+
		"\u0109\7k\2\2\u0109\u010a\7v\2\2\u010a\u010b\7{\2\2\u010b\u010c\7O\2\2"+
		"\u010c\u010d\7c\2\2\u010d\u010e\7z\2\2\u010e\u010f\7$\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\5\16\7\2\u0111\u0112\5\20\b\2\u0112#\3\2\2\2\u0113"+
		"\u0114\7$\2\2\u0114\u0115\7o\2\2\u0115\u0116\7w\2\2\u0116\u0117\7n\2\2"+
		"\u0117\u0118\7v\2\2\u0118\u0119\7k\2\2\u0119\u011a\7r\2\2\u011a\u011b"+
		"\7n\2\2\u011b\u011c\7k\2\2\u011c\u011d\7e\2\2\u011d\u011e\7k\2\2\u011e"+
		"\u011f\7v\2\2\u011f\u0120\7{\2\2\u0120\u0121\7O\2\2\u0121\u0122\7k\2\2"+
		"\u0122\u0123\7p\2\2\u0123\u0124\7$\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\5\16\7\2\u0126\u0127\5\20\b\2\u0127%\3\2\2\2\u0128\u0129\7$\2\2\u0129"+
		"\u012a\7t\2\2\u012a\u012b\7g\2\2\u012b\u012c\7x\2\2\u012c\u012d\7g\2\2"+
		"\u012d\u012e\7t\2\2\u012e\u012f\7u\2\2\u012f\u0130\7g\2\2\u0130\u0131"+
		"\7P\2\2\u0131\u0132\7c\2\2\u0132\u0133\7o\2\2\u0133\u0134\7g\2\2\u0134"+
		"\u0135\7$\2\2\u0135\u0136\3\2\2\2\u0136\u0137\5\16\7\2\u0137\u0138\5\20"+
		"\b\2\u0138\'\3\2\2\2\u0139\u013a\7$\2\2\u013a\u013b\7h\2\2\u013b\u013c"+
		"\7t\2\2\u013c\u013d\7q\2\2\u013d\u013e\7o\2\2\u013e\u013f\7$\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\5\16\7\2\u0141\u0142\5\20\b\2\u0142)\3\2\2"+
		"\2\u0143\u0144\7$\2\2\u0144\u0145\7v\2\2\u0145\u0146\7q\2\2\u0146\u0147"+
		"\7$\2\2\u0147\u0148\3\2\2\2\u0148\u0149\5\16\7\2\u0149\u014a\5\20\b\2"+
		"\u014a+\3\2\2\2\u014b\u014c\7$\2\2\u014c\u014d\7k\2\2\u014d\u014e\7p\2"+
		"\2\u014e\u014f\7j\2\2\u014f\u0150\7g\2\2\u0150\u0151\7t\2\2\u0151\u0152"+
		"\7k\2\2\u0152\u0153\7v\2\2\u0153\u0154\7u\2\2\u0154\u0155\7$\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0157\5\16\7\2\u0157\u0158\5\20\b\2\u0158-\3\2\2"+
		"\2\u0159\u015a\7$\2\2\u015a\u015b\7n\2\2\u015b\u015c\7c\2\2\u015c\u015d"+
		"\7d\2\2\u015d\u015e\7g\2\2\u015e\u015f\7n\2\2\u015f\u0160\7$\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\5\16\7\2\u0162\u0163\5\20\b\2\u0163/\3\2\2"+
		"\2\u0164\u0165\7$\2\2\u0165\u0166\7n\2\2\u0166\u0167\7c\2\2\u0167\u0168"+
		"\7d\2\2\u0168\u0169\7g\2\2\u0169\u016a\7n\2\2\u016a\u016b\7T\2\2\u016b"+
		"\u016c\7g\2\2\u016c\u016d\7x\2\2\u016d\u016e\7g\2\2\u016e\u016f\7t\2\2"+
		"\u016f\u0170\7u\2\2\u0170\u0171\7g\2\2\u0171\u0172\7P\2\2\u0172\u0173"+
		"\7c\2\2\u0173\u0174\7o\2\2\u0174\u0175\7g\2\2\u0175\u0176\7$\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\5\16\7\2\u0178\u0179\5\20\b\2\u0179\61\3\2"+
		"\2\2\u017a\u017b\7$\2\2\u017b\u017c\7B\2\2\u017c\u017d\7e\2\2\u017d\u017e"+
		"\7q\2\2\u017e\u017f\7p\2\2\u017f\u0180\7v\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7z\2\2\u0182\u0183\7v\2\2\u0183\u0184\7$\2\2\u0184\u0185\3\2\2"+
		"\2\u0185\u0186\b\31\2\2\u0186\63\3\2\2\2\u0187\u018a\5\66\33\2\u0188\u018a"+
		"\58\34\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\65\3\2\2\2\u018b"+
		"\u018c\7v\2\2\u018c\u018d\7t\2\2\u018d\u018e\7w\2\2\u018e\u018f\7g\2\2"+
		"\u018f\67\3\2\2\2\u0190\u0191\7h\2\2\u0191\u0192\7c\2\2\u0192\u0193\7"+
		"n\2\2\u0193\u0194\7u\2\2\u0194\u0195\7g\2\2\u01959\3\2\2\2\u0196\u019c"+
		"\7$\2\2\u0197\u0198\7$\2\2\u0198\u019b\7$\2\2\u0199\u019b\n\2\2\2\u019a"+
		"\u0197\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f"+
		"\u01a0\7$\2\2\u01a0\u01a1\b\35\3\2\u01a1;\3\2\2\2\u01a2\u01a3\7}\2\2\u01a3"+
		"=\3\2\2\2\u01a4\u01a5\7\177\2\2\u01a5?\3\2\2\2\u01a6\u01a7\7]\2\2\u01a7"+
		"A\3\2\2\2\u01a8\u01a9\7_\2\2\u01a9C\3\2\2\2\u01aa\u01ab\7.\2\2\u01abE"+
		"\3\2\2\2\u01ac\u01ad\7<\2\2\u01adG\3\2\2\2\u01ae\u01af\t\3\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\b$\4\2\u01b1I\3\2\2\2\u01b2\u01b3\7$\2\2\u01b3\u01b4"+
		"\7i\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7r\2\2\u01b7"+
		"\u01b8\7j\2\2\u01b8\u01b9\7u\2\2\u01b9\u01ba\7$\2\2\u01ba\u01be\3\2\2"+
		"\2\u01bb\u01bd\5N\'\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c2\7<\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\b%\5\2\u01c4K\3\2\2\2\u01c5"+
		"\u01c7\13\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3"+
		"\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\b&\4\2\u01cb"+
		"M\3\2\2\2\u01cc\u01cd\7\"\2\2\u01cdO\3\2\2\2\n\2\3\u009a\u0189\u019a\u019c"+
		"\u01be\u01c8\6\7\3\2\3\35\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}