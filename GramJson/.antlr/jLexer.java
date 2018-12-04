// Generated from d:\gituni\Lenguajes\GramJson\jLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMA=1, PUNTO=2, DOS_PTOS=3, BARRA=4, BBAJA=5, GUION=6, ARROBA=7, ALM=8, 
		SALLAVE=9, SCLLAVE=10, SACORCHETE=11, SCCORCHETE=12, COMILLAS=13, NOMBRE=14, 
		DIGITO=15, KW_ID=16, KW_NAME=17, KW_PROPERTIES=18, KW_INHERITS=19, KW_REVERSENAME=20, 
		KW_LABELRN=21, KW_LANGUAGEDATA=22, KW_LANGUAGE=23, KW_NUMBER=24, KW_WORDTYPE=25, 
		KW_GENDER=26, KW_OPTIONAL=27, KW_LABEL=28, KW_FROM=29, KW_TO=30, KW_TYPEOF=31, 
		KW_USEDBY=32, KW_MULMAX=33, KW_MULMIN=34, KW_ISLIST=35, KW_TRUE=36, KW_FALSE=37, 
		INTRO=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMA", "PUNTO", "DOS_PTOS", "BARRA", "BBAJA", "GUION", "ARROBA", "ALM", 
		"SALLAVE", "SCLLAVE", "SACORCHETE", "SCCORCHETE", "COMILLAS", "NOMBRE", 
		"DIGITO", "KW_ID", "KW_NAME", "KW_PROPERTIES", "KW_INHERITS", "KW_REVERSENAME", 
		"KW_LABELRN", "KW_LANGUAGEDATA", "KW_LANGUAGE", "KW_NUMBER", "KW_WORDTYPE", 
		"KW_GENDER", "KW_OPTIONAL", "KW_LABEL", "KW_FROM", "KW_TO", "KW_TYPEOF", 
		"KW_USEDBY", "KW_MULMAX", "KW_MULMIN", "KW_ISLIST", "KW_TRUE", "KW_FALSE", 
		"INTRO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", "':'", null, "'_'", "'-'", "'@'", "'#'", "'{'", "'}'", 
		"'['", "']'", "'\"'", null, null, "'\"@id\":'", "'\"name\":'", "'\"properties\":'", 
		"'\"inherits\":'", "'\"reverseName\":'", "'\"labelReverseName\":'", "'\"languageData\":'", 
		"'\"language\":'", "'\"number\":'", "'\"wordType\":'", "'\"gender\":'", 
		"'\"optional\":'", "'\"label\":'", "'\"from\":'", "'\"to\":'", "'\"typeOf\":'", 
		"'\"usedby\":'", "'\"multiplicityMax\":'", "'\"multiplicityMin\":'", "'\"isList\":'", 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMA", "PUNTO", "DOS_PTOS", "BARRA", "BBAJA", "GUION", "ARROBA", 
		"ALM", "SALLAVE", "SCLLAVE", "SACORCHETE", "SCCORCHETE", "COMILLAS", "NOMBRE", 
		"DIGITO", "KW_ID", "KW_NAME", "KW_PROPERTIES", "KW_INHERITS", "KW_REVERSENAME", 
		"KW_LABELRN", "KW_LANGUAGEDATA", "KW_LANGUAGE", "KW_NUMBER", "KW_WORDTYPE", 
		"KW_GENDER", "KW_OPTIONAL", "KW_LABEL", "KW_FROM", "KW_TO", "KW_TYPEOF", 
		"KW_USEDBY", "KW_MULMAX", "KW_MULMIN", "KW_ISLIST", "KW_TRUE", "KW_FALSE", 
		"INTRO"
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


	public jLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0180\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\6\17k\n\17\r\17\16\17l\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17x\n\17\6\17z\n\17\r\17\16\17{\3\20\6\20\177\n\20\r"+
		"\20\16\20\u0080\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\6\4\2C\\c|\4"+
		"\2qqww\3\2\62;\4\2\13\f\17\17\2\u0187\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2"+
		"\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31e\3\2\2"+
		"\2\33g\3\2\2\2\35y\3\2\2\2\37~\3\2\2\2!\u0082\3\2\2\2#\u0089\3\2\2\2%"+
		"\u0091\3\2\2\2\'\u009f\3\2\2\2)\u00ab\3\2\2\2+\u00ba\3\2\2\2-\u00ce\3"+
		"\2\2\2/\u00de\3\2\2\2\61\u00ea\3\2\2\2\63\u00f4\3\2\2\2\65\u0100\3\2\2"+
		"\2\67\u010a\3\2\2\29\u0116\3\2\2\2;\u011f\3\2\2\2=\u0127\3\2\2\2?\u012d"+
		"\3\2\2\2A\u0137\3\2\2\2C\u0141\3\2\2\2E\u0154\3\2\2\2G\u0167\3\2\2\2I"+
		"\u0171\3\2\2\2K\u0176\3\2\2\2M\u017c\3\2\2\2OP\7.\2\2P\4\3\2\2\2QR\7\60"+
		"\2\2R\6\3\2\2\2ST\7<\2\2T\b\3\2\2\2UV\7\61\2\2V\n\3\2\2\2WX\7a\2\2X\f"+
		"\3\2\2\2YZ\7/\2\2Z\16\3\2\2\2[\\\7B\2\2\\\20\3\2\2\2]^\7%\2\2^\22\3\2"+
		"\2\2_`\7}\2\2`\24\3\2\2\2ab\7\177\2\2b\26\3\2\2\2cd\7]\2\2d\30\3\2\2\2"+
		"ef\7_\2\2f\32\3\2\2\2gh\7$\2\2h\34\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2\2"+
		"\2lj\3\2\2\2lm\3\2\2\2mz\3\2\2\2no\7\u00c5\2\2ox\7\u00a3\2\2pq\7\u00c5"+
		"\2\2qx\7\u00ab\2\2rs\7\u00c5\2\2sx\7\u00af\2\2tx\t\3\2\2uv\7\u00c5\2\2"+
		"vx\7\u00be\2\2wn\3\2\2\2wp\3\2\2\2wr\3\2\2\2wt\3\2\2\2wu\3\2\2\2xz\3\2"+
		"\2\2yj\3\2\2\2yw\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\36\3\2\2\2}\177"+
		"\t\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081 \3\2\2\2\u0082\u0083\7$\2\2\u0083\u0084\7B\2\2\u0084\u0085\7"+
		"k\2\2\u0085\u0086\7f\2\2\u0086\u0087\7$\2\2\u0087\u0088\7<\2\2\u0088\""+
		"\3\2\2\2\u0089\u008a\7$\2\2\u008a\u008b\7p\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7o\2\2\u008d\u008e\7g\2\2\u008e\u008f\7$\2\2\u008f\u0090\7<\2\2"+
		"\u0090$\3\2\2\2\u0091\u0092\7$\2\2\u0092\u0093\7r\2\2\u0093\u0094\7t\2"+
		"\2\u0094\u0095\7q\2\2\u0095\u0096\7r\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7t\2\2\u0098\u0099\7v\2\2\u0099\u009a\7k\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7$\2\2\u009d\u009e\7<\2\2\u009e&\3\2\2\2\u009f"+
		"\u00a0\7$\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7j\2\2"+
		"\u00a3\u00a4\7g\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7"+
		"\7v\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7$\2\2\u00a9\u00aa\7<\2\2\u00aa"+
		"(\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7x\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7u\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3\u00b4\7P\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6"+
		"\7o\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7$\2\2\u00b8\u00b9\7<\2\2\u00b9"+
		"*\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7c\2\2\u00bd"+
		"\u00be\7d\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7T\2\2"+
		"\u00c1\u00c2\7g\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7P\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7$\2\2"+
		"\u00cc\u00cd\7<\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf\u00d0\7n\2"+
		"\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4"+
		"\7w\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7F\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7c\2\2"+
		"\u00db\u00dc\7$\2\2\u00dc\u00dd\7<\2\2\u00dd.\3\2\2\2\u00de\u00df\7$\2"+
		"\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3"+
		"\7i\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7i\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7\u00e8\7$\2\2\u00e8\u00e9\7<\2\2\u00e9\60\3\2\2\2\u00ea"+
		"\u00eb\7$\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7o\2\2"+
		"\u00ee\u00ef\7d\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2"+
		"\7$\2\2\u00f2\u00f3\7<\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5\u00f6"+
		"\7y\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7f\2\2\u00f9"+
		"\u00fa\7V\2\2\u00fa\u00fb\7{\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7g\2\2"+
		"\u00fd\u00fe\7$\2\2\u00fe\u00ff\7<\2\2\u00ff\64\3\2\2\2\u0100\u0101\7"+
		"$\2\2\u0101\u0102\7i\2\2\u0102\u0103\7g\2\2\u0103\u0104\7p\2\2\u0104\u0105"+
		"\7f\2\2\u0105\u0106\7g\2\2\u0106\u0107\7t\2\2\u0107\u0108\7$\2\2\u0108"+
		"\u0109\7<\2\2\u0109\66\3\2\2\2\u010a\u010b\7$\2\2\u010b\u010c\7q\2\2\u010c"+
		"\u010d\7r\2\2\u010d\u010e\7v\2\2\u010e\u010f\7k\2\2\u010f\u0110\7q\2\2"+
		"\u0110\u0111\7p\2\2\u0111\u0112\7c\2\2\u0112\u0113\7n\2\2\u0113\u0114"+
		"\7$\2\2\u0114\u0115\7<\2\2\u01158\3\2\2\2\u0116\u0117\7$\2\2\u0117\u0118"+
		"\7n\2\2\u0118\u0119\7c\2\2\u0119\u011a\7d\2\2\u011a\u011b\7g\2\2\u011b"+
		"\u011c\7n\2\2\u011c\u011d\7$\2\2\u011d\u011e\7<\2\2\u011e:\3\2\2\2\u011f"+
		"\u0120\7$\2\2\u0120\u0121\7h\2\2\u0121\u0122\7t\2\2\u0122\u0123\7q\2\2"+
		"\u0123\u0124\7o\2\2\u0124\u0125\7$\2\2\u0125\u0126\7<\2\2\u0126<\3\2\2"+
		"\2\u0127\u0128\7$\2\2\u0128\u0129\7v\2\2\u0129\u012a\7q\2\2\u012a\u012b"+
		"\7$\2\2\u012b\u012c\7<\2\2\u012c>\3\2\2\2\u012d\u012e\7$\2\2\u012e\u012f"+
		"\7v\2\2\u012f\u0130\7{\2\2\u0130\u0131\7r\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7Q\2\2\u0133\u0134\7h\2\2\u0134\u0135\7$\2\2\u0135\u0136\7<\2\2"+
		"\u0136@\3\2\2\2\u0137\u0138\7$\2\2\u0138\u0139\7w\2\2\u0139\u013a\7u\2"+
		"\2\u013a\u013b\7g\2\2\u013b\u013c\7f\2\2\u013c\u013d\7d\2\2\u013d\u013e"+
		"\7{\2\2\u013e\u013f\7$\2\2\u013f\u0140\7<\2\2\u0140B\3\2\2\2\u0141\u0142"+
		"\7$\2\2\u0142\u0143\7o\2\2\u0143\u0144\7w\2\2\u0144\u0145\7n\2\2\u0145"+
		"\u0146\7v\2\2\u0146\u0147\7k\2\2\u0147\u0148\7r\2\2\u0148\u0149\7n\2\2"+
		"\u0149\u014a\7k\2\2\u014a\u014b\7e\2\2\u014b\u014c\7k\2\2\u014c\u014d"+
		"\7v\2\2\u014d\u014e\7{\2\2\u014e\u014f\7O\2\2\u014f\u0150\7c\2\2\u0150"+
		"\u0151\7z\2\2\u0151\u0152\7$\2\2\u0152\u0153\7<\2\2\u0153D\3\2\2\2\u0154"+
		"\u0155\7$\2\2\u0155\u0156\7o\2\2\u0156\u0157\7w\2\2\u0157\u0158\7n\2\2"+
		"\u0158\u0159\7v\2\2\u0159\u015a\7k\2\2\u015a\u015b\7r\2\2\u015b\u015c"+
		"\7n\2\2\u015c\u015d\7k\2\2\u015d\u015e\7e\2\2\u015e\u015f\7k\2\2\u015f"+
		"\u0160\7v\2\2\u0160\u0161\7{\2\2\u0161\u0162\7O\2\2\u0162\u0163\7k\2\2"+
		"\u0163\u0164\7p\2\2\u0164\u0165\7$\2\2\u0165\u0166\7<\2\2\u0166F\3\2\2"+
		"\2\u0167\u0168\7$\2\2\u0168\u0169\7k\2\2\u0169\u016a\7u\2\2\u016a\u016b"+
		"\7N\2\2\u016b\u016c\7k\2\2\u016c\u016d\7u\2\2\u016d\u016e\7v\2\2\u016e"+
		"\u016f\7$\2\2\u016f\u0170\7<\2\2\u0170H\3\2\2\2\u0171\u0172\7v\2\2\u0172"+
		"\u0173\7t\2\2\u0173\u0174\7w\2\2\u0174\u0175\7g\2\2\u0175J\3\2\2\2\u0176"+
		"\u0177\7h\2\2\u0177\u0178\7c\2\2\u0178\u0179\7n\2\2\u0179\u017a\7u\2\2"+
		"\u017a\u017b\7g\2\2\u017bL\3\2\2\2\u017c\u017d\t\5\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\b\'\2\2\u017fN\3\2\2\2\b\2lwy{\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}