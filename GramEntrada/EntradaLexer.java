// Generated from .\EntradaLexer.g4 by ANTLR 4.7.1
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
		INHERITANCE=22, INDERECT_USE=23, BARRABAJA=24, GUION=25, TEXTO=26, CADENA=27;
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
		null, "' '", "'='", "'JSON'", "'DOT'", "'SVG'", "'CSV'", "'len'", "'fontcolor'", 
		"'fontname'", "'fontsize'", "'arrowsize'", "'arrowcolor'", "'penwidth'", 
		"'fillcolor'", "'style'", "'shape'", "'edge'", "'node'", "'relationship'", 
		"'class'", "'property'", "'inheritance'", "'inderect_use'", "'_'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "ASIG", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "LEN", 
		"FONTCOLOR", "FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", "PENWIDTH", 
		"FILLCOLOR", "STYLE", "SHAPE", "EDGE", "NODE", "RELATIONSHIP", "CLASS", 
		"PROPERTY", "INHERITANCE", "INDERECT_USE", "BARRABAJA", "GUION", "TEXTO", 
		"CADENA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00f3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6"+
		"\33\u00e7\n\33\r\33\16\33\u00e8\3\34\3\34\6\34\u00ed\n\34\r\34\16\34\u00ee"+
		"\3\34\3\34\3\34\4\u00e8\u00ee\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\35\3\2\2\2\u00f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\tB\3\2\2\2"+
		"\13F\3\2\2\2\rJ\3\2\2\2\17N\3\2\2\2\21R\3\2\2\2\23\\\3\2\2\2\25e\3\2\2"+
		"\2\27n\3\2\2\2\31x\3\2\2\2\33\u0083\3\2\2\2\35\u008c\3\2\2\2\37\u0096"+
		"\3\2\2\2!\u009c\3\2\2\2#\u00a2\3\2\2\2%\u00a7\3\2\2\2\'\u00ac\3\2\2\2"+
		")\u00b9\3\2\2\2+\u00bf\3\2\2\2-\u00c8\3\2\2\2/\u00d4\3\2\2\2\61\u00e1"+
		"\3\2\2\2\63\u00e3\3\2\2\2\65\u00e6\3\2\2\2\67\u00ea\3\2\2\29:\7\"\2\2"+
		":\4\3\2\2\2;<\7?\2\2<\6\3\2\2\2=>\7L\2\2>?\7U\2\2?@\7Q\2\2@A\7P\2\2A\b"+
		"\3\2\2\2BC\7F\2\2CD\7Q\2\2DE\7V\2\2E\n\3\2\2\2FG\7U\2\2GH\7X\2\2HI\7I"+
		"\2\2I\f\3\2\2\2JK\7E\2\2KL\7U\2\2LM\7X\2\2M\16\3\2\2\2NO\7n\2\2OP\7g\2"+
		"\2PQ\7p\2\2Q\20\3\2\2\2RS\7h\2\2ST\7q\2\2TU\7p\2\2UV\7v\2\2VW\7e\2\2W"+
		"X\7q\2\2XY\7n\2\2YZ\7q\2\2Z[\7t\2\2[\22\3\2\2\2\\]\7h\2\2]^\7q\2\2^_\7"+
		"p\2\2_`\7v\2\2`a\7p\2\2ab\7c\2\2bc\7o\2\2cd\7g\2\2d\24\3\2\2\2ef\7h\2"+
		"\2fg\7q\2\2gh\7p\2\2hi\7v\2\2ij\7u\2\2jk\7k\2\2kl\7|\2\2lm\7g\2\2m\26"+
		"\3\2\2\2no\7c\2\2op\7t\2\2pq\7t\2\2qr\7q\2\2rs\7y\2\2st\7u\2\2tu\7k\2"+
		"\2uv\7|\2\2vw\7g\2\2w\30\3\2\2\2xy\7c\2\2yz\7t\2\2z{\7t\2\2{|\7q\2\2|"+
		"}\7y\2\2}~\7e\2\2~\177\7q\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7t\2\2\u0082\32\3\2\2\2\u0083\u0084\7r\2\2\u0084\u0085\7g\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7y\2\2\u0087\u0088\7k\2\2\u0088\u0089\7f\2\2"+
		"\u0089\u008a\7v\2\2\u008a\u008b\7j\2\2\u008b\34\3\2\2\2\u008c\u008d\7"+
		"h\2\2\u008d\u008e\7k\2\2\u008e\u008f\7n\2\2\u008f\u0090\7n\2\2\u0090\u0091"+
		"\7e\2\2\u0091\u0092\7q\2\2\u0092\u0093\7n\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7t\2\2\u0095\36\3\2\2\2\u0096\u0097\7u\2\2\u0097\u0098\7v\2\2\u0098"+
		"\u0099\7{\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b \3\2\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7j\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7r\2\2"+
		"\u00a0\u00a1\7g\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7f"+
		"\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6\7g\2\2\u00a6$\3\2\2\2\u00a7\u00a8"+
		"\7p\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"&\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7q\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7"+
		"\7k\2\2\u00b7\u00b8\7r\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb"+
		"\7n\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7u\2\2\u00be"+
		"*\3\2\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7r\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7v\2\2"+
		"\u00c6\u00c7\7{\2\2\u00c7,\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7p\2"+
		"\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce"+
		"\7k\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7p\2\2\u00d1"+
		"\u00d2\7e\2\2\u00d2\u00d3\7g\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7p\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7t\2\2"+
		"\u00d9\u00da\7g\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7a\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\60\3\2\2\2\u00e1\u00e2\7a\2\2\u00e2\62\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4"+
		"\64\3\2\2\2\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\66\3\2\2\2\u00ea\u00ec"+
		"\7$\2\2\u00eb\u00ed\13\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7$"+
		"\2\2\u00f1\u00f2\b\34\2\2\u00f28\3\2\2\2\5\2\u00e8\u00ee\3\3\34\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}