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
public class EntradaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, KW_JSON=2, KW_DOT=3, KW_SVG=4, KW_CSV=5, LEN=6, FONTCOLOR=7, 
		FONTNAME=8, FONTSIZE=9, ARROWSIZE=10, ARROWHEAD=11, ARROWCOLOR=12, PENWIDTH=13, 
		FILLCOLOR=14, STYLE=15, SHAPE=16, COLOR=17, EDGE=18, NODE=19, DIR=20, 
		RELATIONSHIP=21, CLASS=22, PROPERTY=23, INHERITANCE=24, INDERECT_USE=25, 
		TEXTO=26, CADENA=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "LEN", "FONTCOLOR", 
		"FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWHEAD", "ARROWCOLOR", "PENWIDTH", 
		"FILLCOLOR", "STYLE", "SHAPE", "COLOR", "EDGE", "NODE", "DIR", "RELATIONSHIP", 
		"CLASS", "PROPERTY", "INHERITANCE", "INDERECT_USE", "TEXTO", "CADENA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'-JSON='", "'-DOT='", "'-SVG='", "'-CSV='", "'-len'", "'-fontcolor'", 
		"'-fontname'", "'-fontsize'", "'-arrowsize'", "'-arrowhead'", "'-arrowcolor'", 
		"'-penwidth'", "'-fillcolor'", "'-style'", "'-shape'", "'-color'", "'_edge'", 
		"'_node'", "'-dir'", "'_relationship='", "'_class='", "'_property='", 
		"'_inheritance='", "'_indirect_use='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "LEN", "FONTCOLOR", 
		"FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWHEAD", "ARROWCOLOR", "PENWIDTH", 
		"FILLCOLOR", "STYLE", "SHAPE", "COLOR", "EDGE", "NODE", "DIR", "RELATIONSHIP", 
		"CLASS", "PROPERTY", "INHERITANCE", "INDERECT_USE", "TEXTO", "CADENA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0122\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\6\33\u0116\n\33\r\33\16\33\u0117\3\34\3\34\6\34\u011c\n\34\r\34\16\34"+
		"\u011d\3\34\3\34\3\34\4\u0117\u011d\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\35\3\2\2\2\u0123\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7B\3\2\2\2\tH\3\2"+
		"\2\2\13N\3\2\2\2\rT\3\2\2\2\17Y\3\2\2\2\21d\3\2\2\2\23n\3\2\2\2\25x\3"+
		"\2\2\2\27\u0083\3\2\2\2\31\u008e\3\2\2\2\33\u009a\3\2\2\2\35\u00a4\3\2"+
		"\2\2\37\u00af\3\2\2\2!\u00b6\3\2\2\2#\u00bd\3\2\2\2%\u00c4\3\2\2\2\'\u00ca"+
		"\3\2\2\2)\u00d0\3\2\2\2+\u00d5\3\2\2\2-\u00e4\3\2\2\2/\u00ec\3\2\2\2\61"+
		"\u00f7\3\2\2\2\63\u0105\3\2\2\2\65\u0115\3\2\2\2\67\u0119\3\2\2\29:\7"+
		"\"\2\2:\4\3\2\2\2;<\7/\2\2<=\7L\2\2=>\7U\2\2>?\7Q\2\2?@\7P\2\2@A\7?\2"+
		"\2A\6\3\2\2\2BC\7/\2\2CD\7F\2\2DE\7Q\2\2EF\7V\2\2FG\7?\2\2G\b\3\2\2\2"+
		"HI\7/\2\2IJ\7U\2\2JK\7X\2\2KL\7I\2\2LM\7?\2\2M\n\3\2\2\2NO\7/\2\2OP\7"+
		"E\2\2PQ\7U\2\2QR\7X\2\2RS\7?\2\2S\f\3\2\2\2TU\7/\2\2UV\7n\2\2VW\7g\2\2"+
		"WX\7p\2\2X\16\3\2\2\2YZ\7/\2\2Z[\7h\2\2[\\\7q\2\2\\]\7p\2\2]^\7v\2\2^"+
		"_\7e\2\2_`\7q\2\2`a\7n\2\2ab\7q\2\2bc\7t\2\2c\20\3\2\2\2de\7/\2\2ef\7"+
		"h\2\2fg\7q\2\2gh\7p\2\2hi\7v\2\2ij\7p\2\2jk\7c\2\2kl\7o\2\2lm\7g\2\2m"+
		"\22\3\2\2\2no\7/\2\2op\7h\2\2pq\7q\2\2qr\7p\2\2rs\7v\2\2st\7u\2\2tu\7"+
		"k\2\2uv\7|\2\2vw\7g\2\2w\24\3\2\2\2xy\7/\2\2yz\7c\2\2z{\7t\2\2{|\7t\2"+
		"\2|}\7q\2\2}~\7y\2\2~\177\7u\2\2\177\u0080\7k\2\2\u0080\u0081\7|\2\2\u0081"+
		"\u0082\7g\2\2\u0082\26\3\2\2\2\u0083\u0084\7/\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7t\2\2\u0086\u0087\7t\2\2\u0087\u0088\7q\2\2\u0088\u0089\7y\2\2"+
		"\u0089\u008a\7j\2\2\u008a\u008b\7g\2\2\u008b\u008c\7c\2\2\u008c\u008d"+
		"\7f\2\2\u008d\30\3\2\2\2\u008e\u008f\7/\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7t\2\2\u0092\u0093\7q\2\2\u0093\u0094\7y\2\2\u0094"+
		"\u0095\7e\2\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097\u0098\7q\2\2"+
		"\u0098\u0099\7t\2\2\u0099\32\3\2\2\2\u009a\u009b\7/\2\2\u009b\u009c\7"+
		"r\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7y\2\2\u009f\u00a0"+
		"\7k\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7j\2\2\u00a3"+
		"\34\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7n\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7q\2\2"+
		"\u00ab\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7t\2\2\u00ae\36\3\2"+
		"\2\2\u00af\u00b0\7/\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3"+
		"\7{\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5 \3\2\2\2\u00b6\u00b7"+
		"\7/\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7r\2\2\u00bb\u00bc\7g\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7/\2\2\u00be"+
		"\u00bf\7e\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7q\2\2"+
		"\u00c2\u00c3\7t\2\2\u00c3$\3\2\2\2\u00c4\u00c5\7a\2\2\u00c5\u00c6\7g\2"+
		"\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9\7g\2\2\u00c9&\3\2"+
		"\2\2\u00ca\u00cb\7a\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce"+
		"\7f\2\2\u00ce\u00cf\7g\2\2\u00cf(\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d2"+
		"\7f\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7t\2\2\u00d4*\3\2\2\2\u00d5\u00d6"+
		"\7a\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7n\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7q\2\2"+
		"\u00dd\u00de\7p\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7j\2\2\u00e0\u00e1"+
		"\7k\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7?\2\2\u00e3,\3\2\2\2\u00e4\u00e5"+
		"\7a\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7c\2\2\u00e8"+
		"\u00e9\7u\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7?\2\2\u00eb.\3\2\2\2\u00ec"+
		"\u00ed\7a\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7q\2\2"+
		"\u00f0\u00f1\7r\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4"+
		"\7v\2\2\u00f4\u00f5\7{\2\2\u00f5\u00f6\7?\2\2\u00f6\60\3\2\2\2\u00f7\u00f8"+
		"\7a\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7j\2\2\u00fb"+
		"\u00fc\7g\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7v\2\2"+
		"\u00ff\u0100\7c\2\2\u0100\u0101\7p\2\2\u0101\u0102\7e\2\2\u0102\u0103"+
		"\7g\2\2\u0103\u0104\7?\2\2\u0104\62\3\2\2\2\u0105\u0106\7a\2\2\u0106\u0107"+
		"\7k\2\2\u0107\u0108\7p\2\2\u0108\u0109\7f\2\2\u0109\u010a\7k\2\2\u010a"+
		"\u010b\7t\2\2\u010b\u010c\7g\2\2\u010c\u010d\7e\2\2\u010d\u010e\7v\2\2"+
		"\u010e\u010f\7a\2\2\u010f\u0110\7w\2\2\u0110\u0111\7u\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7?\2\2\u0113\64\3\2\2\2\u0114\u0116\13\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\66\3\2\2\2\u0119\u011b\7$\2\2\u011a\u011c\13\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\7$\2\2\u0120\u0121\b\34\2\2\u01218\3\2\2\2"+
		"\5\2\u0117\u011d\3\3\34\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}