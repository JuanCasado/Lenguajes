<<<<<<< HEAD
// Generated from CsvLexer.g4 by ANTLR 4.7.1
=======
// Generated from .\CsvLexer.g4 by ANTLR 4.7.1
>>>>>>> 74d6d6c63641f0ddb432068d6f111a3a509a5d56
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CsvLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
<<<<<<< HEAD
		COMA=1, INTRO=2, BARRA=3, JSON_EXTENSION=4, DOT_EXTENSION=5, SVG_EXTENSION=6, 
		FILE=7;
=======
		IDENTIFICADOR=1, COMA=2, DOBLEPUNTO=3, PUNTO=4, INTRO=5, DISCO=6, BARRA=7, 
		EXTENSION=8, NOMBRECOSAS=9;
>>>>>>> 74d6d6c63641f0ddb432068d6f111a3a509a5d56
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
<<<<<<< HEAD
		"COMA", "INTRO", "BARRA", "JSON_EXTENSION", "DOT_EXTENSION", "SVG_EXTENSION", 
		"FILE", "IDLETRA", "DIGITO", "PUNTUACION", "DOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, "'.json'", "'.dot'", "'.svg'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMA", "INTRO", "BARRA", "JSON_EXTENSION", "DOT_EXTENSION", "SVG_EXTENSION", 
		"FILE"
=======
		"IDENTIFICADOR", "COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "DISCO", "BARRA", 
		"EXTENSION", "NOMBRECOSAS", "IDLETRA", "DIGITO", "PUNTUACION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "'..'", "'.'", null, null, "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IDENTIFICADOR", "COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "DISCO", 
		"BARRA", "EXTENSION", "NOMBRECOSAS"
>>>>>>> 74d6d6c63641f0ddb432068d6f111a3a509a5d56
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


	public CsvLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CsvLexer.g4"; }

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
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tL\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\63\n\b\3\b\5\b\66\n\b\6"+
		"\b8\n\b\r\b\16\b9\3\b\3\b\5\b>\n\b\3\b\5\bA\n\b\5\bC\n\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25"+
		"\2\27\2\3\2\7\4\2\f\f\17\17\4\2\61\61^^\16\2C\\c|\u00c3\u00c3\u00cb\u00cb"+
		"\u00cf\u00cf\u00d5\u00d5\u00dc\u00dc\u00e3\u00e3\u00eb\u00eb\u00ef\u00ef"+
		"\u00f5\u00f5\u00fc\u00fc\3\2\62;\6\2\"\"//<<aa\2N\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\31"+
		"\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13%\3\2\2\2\r*\3\2\2\2"+
		"\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2\31\32\7."+
		"\2\2\32\4\3\2\2\2\33\34\t\2\2\2\34\6\3\2\2\2\35\36\t\3\2\2\36\b\3\2\2"+
		"\2\37 \7\60\2\2 !\7l\2\2!\"\7u\2\2\"#\7q\2\2#$\7p\2\2$\n\3\2\2\2%&\7\60"+
		"\2\2&\'\7f\2\2\'(\7q\2\2()\7v\2\2)\f\3\2\2\2*+\7\60\2\2+,\7u\2\2,-\7x"+
		"\2\2-.\7i\2\2.\16\3\2\2\2/\63\5\21\t\2\60\63\5\23\n\2\61\63\5\25\13\2"+
		"\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\65\3\2\2\2\64\66\5\7\4\2\65"+
		"\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\62\3\2\2\289\3\2\2\29\67\3\2"+
		"\2\29:\3\2\2\2:C\3\2\2\2;=\5\27\f\2<>\5\27\f\2=<\3\2\2\2=>\3\2\2\2>@\3"+
		"\2\2\2?A\5\7\4\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2B\67\3\2\2\2B;\3\2\2\2C"+
		"\20\3\2\2\2DE\t\4\2\2E\22\3\2\2\2FG\t\5\2\2G\24\3\2\2\2HI\t\6\2\2I\26"+
		"\3\2\2\2JK\7\60\2\2K\30\3\2\2\2\t\2\62\659=@B\2";
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13U\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t9\n\t\3\n\3\n\3\n\7\n>\n\n\f\n\16\nA\13\n\3\n\3\n\3\n\7\nF\n\n\f"+
		"\n\16\nI\13\n\7\nK\n\n\f\n\16\nN\13\n\3\13\3\13\3\f\3\f\3\r\3\r\2\2\16"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\3\2\5\4\2C\\"+
		"c|\4\2\f\f\17\17\3\2\62;\2Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\3\34\3\2\2\2\5 \3\2\2\2\7\"\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2"+
		"\2\17,\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31S\3\2"+
		"\2\2\33\35\t\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2"+
		"\2\2\37\4\3\2\2\2 !\7.\2\2!\6\3\2\2\2\"#\7\60\2\2#$\7\60\2\2$\b\3\2\2"+
		"\2%&\7\60\2\2&\n\3\2\2\2\'(\t\3\2\2(\f\3\2\2\2)*\t\2\2\2*+\7<\2\2+\16"+
		"\3\2\2\2,-\7\61\2\2-\20\3\2\2\2./\7l\2\2/\60\7u\2\2\60\61\7q\2\2\619\7"+
		"p\2\2\62\63\7u\2\2\63\64\7x\2\2\649\7i\2\2\65\66\7f\2\2\66\67\7q\2\2\67"+
		"9\7v\2\28.\3\2\2\28\62\3\2\2\28\65\3\2\2\29\22\3\2\2\2:?\5\25\13\2;>\5"+
		"\25\13\2<>\5\27\f\2=;\3\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@L\3\2\2\2A?\3\2\2\2BG\5\31\r\2CF\5\25\13\2DF\5\27\f\2EC\3\2\2\2ED\3\2"+
		"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2JB\3\2\2\2KN\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2M\24\3\2\2\2NL\3\2\2\2OP\t\2\2\2P\26\3\2\2\2Q"+
		"R\t\4\2\2R\30\3\2\2\2ST\7a\2\2T\32\3\2\2\2\n\2\368=?EGL\2";
>>>>>>> 74d6d6c63641f0ddb432068d6f111a3a509a5d56
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}