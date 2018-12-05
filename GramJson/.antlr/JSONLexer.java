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
		WS=1, TRUE=2, FALSE=3, TEXTO=4, ABRIR_LLAVE=5, CERRAR_LLAVE=6, ABRIR_CORCHETE=7, 
		CERRAR_CORCHETE=8, DOSPUNTOS=9, COMA=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "TRUE", "FALSE", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", 
		"CERRAR_CORCHETE", "DOSPUNTOS", "COMA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'true'", "'false'", null, "'{'", "'}'", "'['", "']'", "':'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRUE", "FALSE", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", 
		"CERRAR_CORCHETE", "DOSPUNTOS", "COMA"
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
		case 3:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f>\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\3\2\4\5\2\n\f\17\17\"\"\3\2$$\2?\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\33\3\2\2\2\7 \3\2\2\2\t&\3"+
		"\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2"+
		"\2\25<\3\2\2\2\27\30\t\2\2\2\30\31\3\2\2\2\31\32\b\2\2\2\32\4\3\2\2\2"+
		"\33\34\7v\2\2\34\35\7t\2\2\35\36\7w\2\2\36\37\7g\2\2\37\6\3\2\2\2 !\7"+
		"h\2\2!\"\7c\2\2\"#\7n\2\2#$\7u\2\2$%\7g\2\2%\b\3\2\2\2&,\7$\2\2\'(\7$"+
		"\2\2(+\7$\2\2)+\n\3\2\2*\'\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2"+
		"\2\2-/\3\2\2\2.,\3\2\2\2/\60\7$\2\2\60\61\b\5\3\2\61\n\3\2\2\2\62\63\7"+
		"}\2\2\63\f\3\2\2\2\64\65\7\177\2\2\65\16\3\2\2\2\66\67\7]\2\2\67\20\3"+
		"\2\2\289\7_\2\29\22\3\2\2\2:;\7<\2\2;\24\3\2\2\2<=\7.\2\2=\26\3\2\2\2"+
		"\5\2*,\4\b\2\2\3\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}