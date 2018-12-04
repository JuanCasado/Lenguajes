// Generated from c:\antlr\Lenguajes\GramCSV\CSVParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXTO=1, CADENA=2, INTRO=3, SEPARADOR=4;
	public static final int
		RULE_init = 0, RULE_cabecera = 1, RULE_linea = 2, RULE_columna = 3, RULE_campo = 4;
	public static final String[] ruleNames = {
		"init", "cabecera", "linea", "columna", "campo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEXTO", "CADENA", "INTRO", "SEPARADOR"
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

	@Override
	public String getGrammarFileName() { return "CSVParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSVParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			cabecera();
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11);
				linea();
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXTO) | (1L << CADENA) | (1L << INTRO) | (1L << SEPARADOR))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CabeceraContext extends ParserRuleContext {
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public TerminalNode INTRO() { return getToken(CSVParser.INTRO, 0); }
		public List<TerminalNode> SEPARADOR() { return getTokens(CSVParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(CSVParser.SEPARADOR, i);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabecera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			columna();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(17);
				match(SEPARADOR);
				setState(18);
				columna();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(INTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineaContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public TerminalNode INTRO() { return getToken(CSVParser.INTRO, 0); }
		public List<TerminalNode> SEPARADOR() { return getTokens(CSVParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(CSVParser.SEPARADOR, i);
		}
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_linea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			campo();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(27);
				match(SEPARADOR);
				setState(28);
				campo();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(INTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnaContext extends ParserRuleContext {
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
	 
		public ColumnaContext() { }
		public void copyFrom(ColumnaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnaConComillasContext extends ColumnaContext {
		public TerminalNode CADENA() { return getToken(CSVParser.CADENA, 0); }
		public ColumnaConComillasContext(ColumnaContext ctx) { copyFrom(ctx); }
	}
	public static class ColumnaSinComillasContext extends ColumnaContext {
		public TerminalNode TEXTO() { return getToken(CSVParser.TEXTO, 0); }
		public ColumnaSinComillasContext(ColumnaContext ctx) { copyFrom(ctx); }
	}
	public static class ColumnaVacioContext extends ColumnaContext {
		public ColumnaVacioContext(ColumnaContext ctx) { copyFrom(ctx); }
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columna);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				_localctx = new ColumnaSinComillasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(TEXTO);
				}
				break;
			case CADENA:
				_localctx = new ColumnaConComillasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(CADENA);
				}
				break;
			case INTRO:
			case SEPARADOR:
				_localctx = new ColumnaVacioContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CampoContext extends ParserRuleContext {
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
	 
		public CampoContext() { }
		public void copyFrom(CampoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CampoVacioContext extends CampoContext {
		public CampoVacioContext(CampoContext ctx) { copyFrom(ctx); }
	}
	public static class StringConComillasContext extends CampoContext {
		public TerminalNode CADENA() { return getToken(CSVParser.CADENA, 0); }
		public StringConComillasContext(CampoContext ctx) { copyFrom(ctx); }
	}
	public static class TextoSinComillasContext extends CampoContext {
		public TerminalNode TEXTO() { return getToken(CSVParser.TEXTO, 0); }
		public TextoSinComillasContext(CampoContext ctx) { copyFrom(ctx); }
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_campo);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				_localctx = new TextoSinComillasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(TEXTO);
				}
				break;
			case CADENA:
				_localctx = new StringConComillasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(CADENA);
				}
				break;
			case INTRO:
			case SEPARADOR:
				_localctx = new CampoVacioContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\3\3\3\3"+
		"\3\7\3\26\n\3\f\3\16\3\31\13\3\3\3\3\3\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\5\5*\n\5\3\6\3\6\3\6\5\6/\n\6\3\6\2\2\7\2\4"+
		"\6\b\n\2\2\2\62\2\f\3\2\2\2\4\22\3\2\2\2\6\34\3\2\2\2\b)\3\2\2\2\n.\3"+
		"\2\2\2\f\16\5\4\3\2\r\17\5\6\4\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2"+
		"\2\2\20\21\3\2\2\2\21\3\3\2\2\2\22\27\5\b\5\2\23\24\7\6\2\2\24\26\5\b"+
		"\5\2\25\23\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2"+
		"\2\2\31\27\3\2\2\2\32\33\7\5\2\2\33\5\3\2\2\2\34!\5\n\6\2\35\36\7\6\2"+
		"\2\36 \5\n\6\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2"+
		"\2#!\3\2\2\2$%\7\5\2\2%\7\3\2\2\2&*\7\3\2\2\'*\7\4\2\2(*\3\2\2\2)&\3\2"+
		"\2\2)\'\3\2\2\2)(\3\2\2\2*\t\3\2\2\2+/\7\3\2\2,/\7\4\2\2-/\3\2\2\2.+\3"+
		"\2\2\2.,\3\2\2\2.-\3\2\2\2/\13\3\2\2\2\7\20\27!).";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}