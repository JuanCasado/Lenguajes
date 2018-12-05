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
		SPACE=1, KW_JSON=2, KW_DOT=3, KW_SVG=4, KW_CSV=5, LEN=6, FONTCOLOR=7, 
		FONTNAME=8, FONTSIZE=9, ARROWSIZE=10, ARROWCOLOR=11, PENWIDTH=12, FILLCOLOR=13, 
		STYLE=14, SHAPE=15, EDGE=16, NODE=17, RELATIONSHIP=18, CLASS=19, PROPERTY=20, 
		INHERITANCE=21, INDERECT_USE=22, TEXTO=23, CADENA=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "LEN", "FONTCOLOR", 
		"FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", "PENWIDTH", "FILLCOLOR", 
		"STYLE", "SHAPE", "EDGE", "NODE", "RELATIONSHIP", "CLASS", "PROPERTY", 
		"INHERITANCE", "INDERECT_USE", "TEXTO", "CADENA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'-JSON='", "'-DOT='", "'-SVG='", "'-CSV='", "'-len'", "'-fontcolor'", 
		"'-fontname'", "'-fontsize'", "'-arrowsize'", "'-arrowcolor'", "'-penwidth'", 
		"'-fillcolor'", "'-style'", "'-shape'", "'_edge'", "'_node'", "'_relationship='", 
		"'_class='", "'_property='", "'_inheritance='", "'_inderect_use='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "LEN", "FONTCOLOR", 
		"FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", "PENWIDTH", "FILLCOLOR", 
		"STYLE", "SHAPE", "EDGE", "NODE", "RELATIONSHIP", "CLASS", "PROPERTY", 
		"INHERITANCE", "INDERECT_USE", "TEXTO", "CADENA"
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
		case 23:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0105\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\6"+
		"\30\u00f9\n\30\r\30\16\30\u00fa\3\31\3\31\6\31\u00ff\n\31\r\31\16\31\u0100"+
		"\3\31\3\31\3\31\4\u00fa\u0100\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\3\2\2\2\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7<\3\2"+
		"\2\2\tB\3\2\2\2\13H\3\2\2\2\rN\3\2\2\2\17S\3\2\2\2\21^\3\2\2\2\23h\3\2"+
		"\2\2\25r\3\2\2\2\27}\3\2\2\2\31\u0089\3\2\2\2\33\u0093\3\2\2\2\35\u009e"+
		"\3\2\2\2\37\u00a5\3\2\2\2!\u00ac\3\2\2\2#\u00b2\3\2\2\2%\u00b8\3\2\2\2"+
		"\'\u00c7\3\2\2\2)\u00cf\3\2\2\2+\u00da\3\2\2\2-\u00e8\3\2\2\2/\u00f8\3"+
		"\2\2\2\61\u00fc\3\2\2\2\63\64\7\"\2\2\64\4\3\2\2\2\65\66\7/\2\2\66\67"+
		"\7L\2\2\678\7U\2\289\7Q\2\29:\7P\2\2:;\7?\2\2;\6\3\2\2\2<=\7/\2\2=>\7"+
		"F\2\2>?\7Q\2\2?@\7V\2\2@A\7?\2\2A\b\3\2\2\2BC\7/\2\2CD\7U\2\2DE\7X\2\2"+
		"EF\7I\2\2FG\7?\2\2G\n\3\2\2\2HI\7/\2\2IJ\7E\2\2JK\7U\2\2KL\7X\2\2LM\7"+
		"?\2\2M\f\3\2\2\2NO\7/\2\2OP\7n\2\2PQ\7g\2\2QR\7p\2\2R\16\3\2\2\2ST\7/"+
		"\2\2TU\7h\2\2UV\7q\2\2VW\7p\2\2WX\7v\2\2XY\7e\2\2YZ\7q\2\2Z[\7n\2\2[\\"+
		"\7q\2\2\\]\7t\2\2]\20\3\2\2\2^_\7/\2\2_`\7h\2\2`a\7q\2\2ab\7p\2\2bc\7"+
		"v\2\2cd\7p\2\2de\7c\2\2ef\7o\2\2fg\7g\2\2g\22\3\2\2\2hi\7/\2\2ij\7h\2"+
		"\2jk\7q\2\2kl\7p\2\2lm\7v\2\2mn\7u\2\2no\7k\2\2op\7|\2\2pq\7g\2\2q\24"+
		"\3\2\2\2rs\7/\2\2st\7c\2\2tu\7t\2\2uv\7t\2\2vw\7q\2\2wx\7y\2\2xy\7u\2"+
		"\2yz\7k\2\2z{\7|\2\2{|\7g\2\2|\26\3\2\2\2}~\7/\2\2~\177\7c\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7t\2\2\u0081\u0082\7q\2\2\u0082\u0083\7y\2\2\u0083"+
		"\u0084\7e\2\2\u0084\u0085\7q\2\2\u0085\u0086\7n\2\2\u0086\u0087\7q\2\2"+
		"\u0087\u0088\7t\2\2\u0088\30\3\2\2\2\u0089\u008a\7/\2\2\u008a\u008b\7"+
		"r\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e\7y\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7f\2\2\u0090\u0091\7v\2\2\u0091\u0092\7j\2\2\u0092"+
		"\32\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095\7h\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7n\2\2\u0098\u0099\7e\2\2\u0099\u009a\7q\2\2"+
		"\u009a\u009b\7n\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d\34\3\2"+
		"\2\2\u009e\u009f\7/\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2"+
		"\7{\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\36\3\2\2\2\u00a5\u00a6"+
		"\7/\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7c\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7g\2\2\u00ab \3\2\2\2\u00ac\u00ad\7a\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\"\3\2\2\2\u00b2\u00b3\7a\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7q"+
		"\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7g\2\2\u00b7$\3\2\2\2\u00b8\u00b9"+
		"\7a\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7n\2\2\u00bc"+
		"\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7q\2\2"+
		"\u00c0\u00c1\7p\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7?\2\2\u00c6&\3\2\2\2\u00c7\u00c8"+
		"\7a\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7c\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7?\2\2\u00ce(\3\2\2\2\u00cf"+
		"\u00d0\7a\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7q\2\2"+
		"\u00d3\u00d4\7r\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7"+
		"\7v\2\2\u00d7\u00d8\7{\2\2\u00d8\u00d9\7?\2\2\u00d9*\3\2\2\2\u00da\u00db"+
		"\7a\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7j\2\2\u00de"+
		"\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7v\2\2"+
		"\u00e2\u00e3\7c\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6"+
		"\7g\2\2\u00e6\u00e7\7?\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7a\2\2\u00e9\u00ea"+
		"\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7v\2\2"+
		"\u00f1\u00f2\7a\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5"+
		"\7g\2\2\u00f5\u00f6\7?\2\2\u00f6.\3\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\60\3\2\2\2\u00fc\u00fe\7$\2\2\u00fd\u00ff\13\2\2\2\u00fe\u00fd\3\2\2"+
		"\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\7$\2\2\u0103\u0104\b\31\2\2\u0104\62\3\2\2\2\5\2"+
		"\u00fa\u0100\3\3\31\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}