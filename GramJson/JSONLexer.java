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
		WS=1, GRAPHS=2, GRAPH=3, TREE=4, PROPERTIES=5, TRUE=6, FALSE=7, TEXTO=8, 
		ABRIR_LLAVE=9, CERRAR_LLAVE=10, ABRIR_CORCHETE=11, CERRAR_CORCHETE=12, 
		DOSPUNTOS=13, COMA=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "GRAPHS", "GRAPH", "TREE", "PROPERTIES", "TRUE", "FALSE", "TEXTO", 
		"ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", "CERRAR_CORCHETE", "DOSPUNTOS", 
		"COMA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'\"graphs\"'", "'\"@graph\"'", "'\"@tree\"'", "'\"properties\":['", 
		"'true'", "'false'", null, "'{'", "'}'", "'['", "']'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "GRAPHS", "GRAPH", "TREE", "PROPERTIES", "TRUE", "FALSE", 
		"TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", "CERRAR_CORCHETE", 
		"DOSPUNTOS", "COMA"
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
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\7\t\\\n\t\f\t\16\t_\13\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\3\2\4\5\2\n\f\17\17\"\"\3\2$$\2p\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5#\3\2\2\2\7,\3\2\2\2\t\65"+
		"\3\2\2\2\13=\3\2\2\2\rL\3\2\2\2\17Q\3\2\2\2\21W\3\2\2\2\23c\3\2\2\2\25"+
		"e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37 \t\2\2\2"+
		" !\3\2\2\2!\"\b\2\2\2\"\4\3\2\2\2#$\7$\2\2$%\7i\2\2%&\7t\2\2&\'\7c\2\2"+
		"\'(\7r\2\2()\7j\2\2)*\7u\2\2*+\7$\2\2+\6\3\2\2\2,-\7$\2\2-.\7B\2\2./\7"+
		"i\2\2/\60\7t\2\2\60\61\7c\2\2\61\62\7r\2\2\62\63\7j\2\2\63\64\7$\2\2\64"+
		"\b\3\2\2\2\65\66\7$\2\2\66\67\7B\2\2\678\7v\2\289\7t\2\29:\7g\2\2:;\7"+
		"g\2\2;<\7$\2\2<\n\3\2\2\2=>\7$\2\2>?\7r\2\2?@\7t\2\2@A\7q\2\2AB\7r\2\2"+
		"BC\7g\2\2CD\7t\2\2DE\7v\2\2EF\7k\2\2FG\7g\2\2GH\7u\2\2HI\7$\2\2IJ\7<\2"+
		"\2JK\7]\2\2K\f\3\2\2\2LM\7v\2\2MN\7t\2\2NO\7w\2\2OP\7g\2\2P\16\3\2\2\2"+
		"QR\7h\2\2RS\7c\2\2ST\7n\2\2TU\7u\2\2UV\7g\2\2V\20\3\2\2\2W]\7$\2\2XY\7"+
		"$\2\2Y\\\7$\2\2Z\\\n\3\2\2[X\3\2\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^"+
		"\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7$\2\2ab\b\t\3\2b\22\3\2\2\2cd\7}\2\2d"+
		"\24\3\2\2\2ef\7\177\2\2f\26\3\2\2\2gh\7]\2\2h\30\3\2\2\2ij\7_\2\2j\32"+
		"\3\2\2\2kl\7<\2\2l\34\3\2\2\2mn\7.\2\2n\36\3\2\2\2\5\2[]\4\b\2\2\3\t\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}