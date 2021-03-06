// Generated from d:\gituni\Lenguajes\PRUEBA_1\Pruebas\JSON\PRUEBAS/PruebaLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PruebaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SALLAVE=1, SCLLAVE=2, SACORCHETE=3, SCCORCHETE=4, COMA=5, DOS_PTOS=6, 
		COMILLAS=7, PUNTO=8, BARRA=9, ALM=10, BBAJA=11, ARROBA=12, KW_CONTEXT=13, 
		KW_WWW=14, KW_HTTP=15, KW_ID=16, KW_NAME=17, KW_PROPERTIES=18, KW_INHERITS=19, 
		KW_GRAPHS=20, KW_REVERSENAME=21, KW_LABELRN=22, KW_LABEL=23, KW_FROM=24, 
		KW_TO=25, KW_TYPEOF=26, KW_USEDBY=27, KW_MULMAX=28, KW_MULMIN=29, KW_ISLIST=30, 
		KW_TRUE=31, KW_FALSE=32, NOMBRE=33, DIGITO=34, INTRO=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SALLAVE", "SCLLAVE", "SACORCHETE", "SCCORCHETE", "COMA", "DOS_PTOS", 
		"COMILLAS", "PUNTO", "BARRA", "ALM", "BBAJA", "ARROBA", "KW_CONTEXT", 
		"KW_WWW", "KW_HTTP", "KW_ID", "KW_NAME", "KW_PROPERTIES", "KW_INHERITS", 
		"KW_GRAPHS", "KW_REVERSENAME", "KW_LABELRN", "KW_LABEL", "KW_FROM", "KW_TO", 
		"KW_TYPEOF", "KW_USEDBY", "KW_MULMAX", "KW_MULMIN", "KW_ISLIST", "KW_TRUE", 
		"KW_FALSE", "NOMBRE", "DIGITO", "INTRO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "';'", "':'", "'\"'", "'.'", "'/'", 
		"'#'", "'_'", "'@'", "'\"@context\"'", "'www.'", "'http://'", "'\"@id\"'", 
		"'\"name\"'", "'\"properties\"'", "'\"inherits\"'", "'\"graphs\"'", "'\"reverseName\"'", 
		"'\"labelReverseName\"'", "'\"label\"'", "'\"from\"'", "'\"to\"'", "'\"typeOf\"'", 
		"'\"usedby\"'", "'\"multiplicityMax\"'", "'\"multiplicityMin\"'", "'\"isList\"'", 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SALLAVE", "SCLLAVE", "SACORCHETE", "SCCORCHETE", "COMA", "DOS_PTOS", 
		"COMILLAS", "PUNTO", "BARRA", "ALM", "BBAJA", "ARROBA", "KW_CONTEXT", 
		"KW_WWW", "KW_HTTP", "KW_ID", "KW_NAME", "KW_PROPERTIES", "KW_INHERITS", 
		"KW_GRAPHS", "KW_REVERSENAME", "KW_LABELRN", "KW_LABEL", "KW_FROM", "KW_TO", 
		"KW_TYPEOF", "KW_USEDBY", "KW_MULMAX", "KW_MULMIN", "KW_ISLIST", "KW_TRUE", 
		"KW_FALSE", "NOMBRE", "DIGITO", "INTRO"
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


	public PruebaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PruebaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0134\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\6\"\u0128\n\"\r\"\16\"\u0129"+
		"\3#\6#\u012d\n#\r#\16#\u012e\3$\3$\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\5\4\2C\\"+
		"c|\3\2\62;\4\2\13\f\17\17\2\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\t"+
		"O\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25"+
		"[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35l\3\2\2\2\37q\3\2\2\2"+
		"!y\3\2\2\2#\177\3\2\2\2%\u0086\3\2\2\2\'\u0093\3\2\2\2)\u009e\3\2\2\2"+
		"+\u00a7\3\2\2\2-\u00b5\3\2\2\2/\u00c8\3\2\2\2\61\u00d0\3\2\2\2\63\u00d7"+
		"\3\2\2\2\65\u00dc\3\2\2\2\67\u00e5\3\2\2\29\u00ee\3\2\2\2;\u0100\3\2\2"+
		"\2=\u0112\3\2\2\2?\u011b\3\2\2\2A\u0120\3\2\2\2C\u0127\3\2\2\2E\u012c"+
		"\3\2\2\2G\u0130\3\2\2\2IJ\7}\2\2J\4\3\2\2\2KL\7\177\2\2L\6\3\2\2\2MN\7"+
		"]\2\2N\b\3\2\2\2OP\7_\2\2P\n\3\2\2\2QR\7=\2\2R\f\3\2\2\2ST\7<\2\2T\16"+
		"\3\2\2\2UV\7$\2\2V\20\3\2\2\2WX\7\60\2\2X\22\3\2\2\2YZ\7\61\2\2Z\24\3"+
		"\2\2\2[\\\7%\2\2\\\26\3\2\2\2]^\7a\2\2^\30\3\2\2\2_`\7B\2\2`\32\3\2\2"+
		"\2ab\7$\2\2bc\7B\2\2cd\7e\2\2de\7q\2\2ef\7p\2\2fg\7v\2\2gh\7g\2\2hi\7"+
		"z\2\2ij\7v\2\2jk\7$\2\2k\34\3\2\2\2lm\7y\2\2mn\7y\2\2no\7y\2\2op\7\60"+
		"\2\2p\36\3\2\2\2qr\7j\2\2rs\7v\2\2st\7v\2\2tu\7r\2\2uv\7<\2\2vw\7\61\2"+
		"\2wx\7\61\2\2x \3\2\2\2yz\7$\2\2z{\7B\2\2{|\7k\2\2|}\7f\2\2}~\7$\2\2~"+
		"\"\3\2\2\2\177\u0080\7$\2\2\u0080\u0081\7p\2\2\u0081\u0082\7c\2\2\u0082"+
		"\u0083\7o\2\2\u0083\u0084\7g\2\2\u0084\u0085\7$\2\2\u0085$\3\2\2\2\u0086"+
		"\u0087\7$\2\2\u0087\u0088\7r\2\2\u0088\u0089\7t\2\2\u0089\u008a\7q\2\2"+
		"\u008a\u008b\7r\2\2\u008b\u008c\7g\2\2\u008c\u008d\7t\2\2\u008d\u008e"+
		"\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7g\2\2\u0090\u0091\7u\2\2\u0091"+
		"\u0092\7$\2\2\u0092&\3\2\2\2\u0093\u0094\7$\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7p\2\2\u0096\u0097\7j\2\2\u0097\u0098\7g\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u009a\7k\2\2\u009a\u009b\7v\2\2\u009b\u009c\7u\2\2\u009c\u009d"+
		"\7$\2\2\u009d(\3\2\2\2\u009e\u009f\7$\2\2\u009f\u00a0\7i\2\2\u00a0\u00a1"+
		"\7t\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7j\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7$\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7$\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7x\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\u00ad\7t\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7P\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7$\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6\u00b7\7n\2\2\u00b7"+
		"\u00b8\7c\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7n\2\2"+
		"\u00bb\u00bc\7T\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7x\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7P\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\7g\2\2"+
		"\u00c6\u00c7\7$\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7$\2\2\u00c9\u00ca\7n\2"+
		"\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7d\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7n\2\2\u00ce\u00cf\7$\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1\u00d2"+
		"\7h\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7$\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7q\2\2\u00da\u00db\7$\2\2\u00db\64\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7{\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1\u00e2\7Q\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7$\2\2\u00e4\66\3\2"+
		"\2\2\u00e5\u00e6\7$\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7d\2\2\u00eb\u00ec\7{\2\2\u00ec"+
		"\u00ed\7$\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7$\2\2\u00ef\u00f0\7o\2\2\u00f0"+
		"\u00f1\7w\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7k\2\2"+
		"\u00f4\u00f5\7r\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7e\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7{\2\2\u00fb"+
		"\u00fc\7O\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7z\2\2\u00fe\u00ff\7$\2\2"+
		"\u00ff:\3\2\2\2\u0100\u0101\7$\2\2\u0101\u0102\7o\2\2\u0102\u0103\7w\2"+
		"\2\u0103\u0104\7n\2\2\u0104\u0105\7v\2\2\u0105\u0106\7k\2\2\u0106\u0107"+
		"\7r\2\2\u0107\u0108\7n\2\2\u0108\u0109\7k\2\2\u0109\u010a\7e\2\2\u010a"+
		"\u010b\7k\2\2\u010b\u010c\7v\2\2\u010c\u010d\7{\2\2\u010d\u010e\7O\2\2"+
		"\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110\u0111\7$\2\2\u0111<\3\2\2"+
		"\2\u0112\u0113\7$\2\2\u0113\u0114\7k\2\2\u0114\u0115\7u\2\2\u0115\u0116"+
		"\7N\2\2\u0116\u0117\7k\2\2\u0117\u0118\7u\2\2\u0118\u0119\7v\2\2\u0119"+
		"\u011a\7$\2\2\u011a>\3\2\2\2\u011b\u011c\7v\2\2\u011c\u011d\7t\2\2\u011d"+
		"\u011e\7w\2\2\u011e\u011f\7g\2\2\u011f@\3\2\2\2\u0120\u0121\7h\2\2\u0121"+
		"\u0122\7c\2\2\u0122\u0123\7n\2\2\u0123\u0124\7u\2\2\u0124\u0125\7g\2\2"+
		"\u0125B\3\2\2\2\u0126\u0128\t\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3"+
		"\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aD\3\2\2\2\u012b\u012d"+
		"\t\3\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012fF\3\2\2\2\u0130\u0131\t\4\2\2\u0131\u0132\3\2\2\2"+
		"\u0132\u0133\b$\2\2\u0133H\3\2\2\2\5\2\u0129\u012e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}