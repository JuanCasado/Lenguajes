// Generated from .\EntradaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EntradaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, ASIG=2, KW_JSON=3, KW_DOT=4, KW_SVG=5, KW_CSV=6, LEN=7, FONTCOLOR=8, 
		FONTNAME=9, FONTSIZE=10, ARROWSIZE=11, ARROWCOLOR=12, PENWIDTH=13, FILLCOLOR=14, 
		STYLE=15, SHAPE=16, EDGE=17, NODE=18, RELATIONSHIP=19, CLASS=20, PROPERTY=21, 
		INHERITANCE=22, INDERECT_USE=23, TEXTO=24, CADENA=25;
	public static final int
		RULE_init = 0, RULE_tipo_archivo = 1, RULE_texto = 2, RULE_basura = 3, 
		RULE_json = 4, RULE_kw_json = 5, RULE_svg = 6, RULE_kw_svg = 7, RULE_dot = 8, 
		RULE_kw_dot = 9, RULE_csv = 10, RULE_kw_csv = 11, RULE_parametros = 12, 
		RULE_len = 13, RULE_fontcolor = 14, RULE_fontname = 15, RULE_fontsize = 16, 
		RULE_arrowsize = 17, RULE_arrowcolor = 18, RULE_penwidth = 19, RULE_fillcolor = 20, 
		RULE_style = 21, RULE_shape = 22, RULE_kw_edge = 23, RULE_kw_node = 24, 
		RULE_kw_relationship = 25, RULE_kw_class = 26, RULE_kw_property = 27, 
		RULE_kw_inheritance = 28, RULE_kw_inderect_use = 29, RULE_kw_len = 30, 
		RULE_kw_fontcolor = 31, RULE_kw_fontname = 32, RULE_kw_fontsize = 33, 
		RULE_kw_arrowsize = 34, RULE_kw_arrowcolor = 35, RULE_kw_penwidth = 36, 
		RULE_kw_fillcolor = 37, RULE_kw_style = 38, RULE_kw_shape = 39;
	public static final String[] ruleNames = {
		"init", "tipo_archivo", "texto", "basura", "json", "kw_json", "svg", "kw_svg", 
		"dot", "kw_dot", "csv", "kw_csv", "parametros", "len", "fontcolor", "fontname", 
		"fontsize", "arrowsize", "arrowcolor", "penwidth", "fillcolor", "style", 
		"shape", "kw_edge", "kw_node", "kw_relationship", "kw_class", "kw_property", 
		"kw_inheritance", "kw_inderect_use", "kw_len", "kw_fontcolor", "kw_fontname", 
		"kw_fontsize", "kw_arrowsize", "kw_arrowcolor", "kw_penwidth", "kw_fillcolor", 
		"kw_style", "kw_shape"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "ASIG", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "LEN", 
		"FONTCOLOR", "FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", "PENWIDTH", 
		"FILLCOLOR", "STYLE", "SHAPE", "EDGE", "NODE", "RELATIONSHIP", "CLASS", 
		"PROPERTY", "INHERITANCE", "INDERECT_USE", "TEXTO", "CADENA"
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
	public String getGrammarFileName() { return "EntradaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EntradaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<Tipo_archivoContext> tipo_archivo() {
			return getRuleContexts(Tipo_archivoContext.class);
		}
		public Tipo_archivoContext tipo_archivo(int i) {
			return getRuleContext(Tipo_archivoContext.class,i);
		}
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public List<BasuraContext> basura() {
			return getRuleContexts(BasuraContext.class);
		}
		public BasuraContext basura(int i) {
			return getRuleContext(BasuraContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_JSON:
				case KW_DOT:
				case KW_SVG:
				case KW_CSV:
					{
					setState(80);
					tipo_archivo();
					}
					break;
				case LEN:
				case FONTCOLOR:
				case FONTNAME:
				case FONTSIZE:
				case ARROWSIZE:
				case ARROWCOLOR:
				case PENWIDTH:
				case FILLCOLOR:
				case STYLE:
				case SHAPE:
					{
					setState(81);
					parametros();
					}
					break;
				case SPACE:
				case ASIG:
				case TEXTO:
					{
					setState(82);
					basura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ASIG) | (1L << KW_JSON) | (1L << KW_DOT) | (1L << KW_SVG) | (1L << KW_CSV) | (1L << LEN) | (1L << FONTCOLOR) | (1L << FONTNAME) | (1L << FONTSIZE) | (1L << ARROWSIZE) | (1L << ARROWCOLOR) | (1L << PENWIDTH) | (1L << FILLCOLOR) | (1L << STYLE) | (1L << SHAPE) | (1L << TEXTO))) != 0) );
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

	public static class Tipo_archivoContext extends ParserRuleContext {
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public SvgContext svg() {
			return getRuleContext(SvgContext.class,0);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public CsvContext csv() {
			return getRuleContext(CsvContext.class,0);
		}
		public Tipo_archivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_archivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTipo_archivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTipo_archivo(this);
		}
	}

	public final Tipo_archivoContext tipo_archivo() throws RecognitionException {
		Tipo_archivoContext _localctx = new Tipo_archivoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo_archivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_JSON:
				{
				setState(87);
				json();
				}
				break;
			case KW_SVG:
				{
				setState(88);
				svg();
				}
				break;
			case KW_DOT:
				{
				setState(89);
				dot();
				}
				break;
			case KW_CSV:
				{
				setState(90);
				csv();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class TextoContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(EntradaParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(EntradaParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(EntradaParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(EntradaParser.CADENA, i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_texto);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(93);
					_la = _input.LA(1);
					if ( !(_la==TEXTO || _la==CADENA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BasuraContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(EntradaParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(EntradaParser.TEXTO, i);
		}
		public List<TerminalNode> ASIG() { return getTokens(EntradaParser.ASIG); }
		public TerminalNode ASIG(int i) {
			return getToken(EntradaParser.ASIG, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(EntradaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(EntradaParser.SPACE, i);
		}
		public BasuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterBasura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitBasura(this);
		}
	}

	public final BasuraContext basura() throws RecognitionException {
		BasuraContext _localctx = new BasuraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_basura);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(98);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << ASIG) | (1L << TEXTO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(101); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class JsonContext extends ParserRuleContext {
		public Kw_jsonContext kw_json() {
			return getRuleContext(Kw_jsonContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			kw_json();
			setState(104);
			match(ASIG);
			setState(105);
			texto();
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106);
				match(SPACE);
				}
				break;
			}
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

	public static class Kw_jsonContext extends ParserRuleContext {
		public TerminalNode KW_JSON() { return getToken(EntradaParser.KW_JSON, 0); }
		public Kw_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_json(this);
		}
	}

	public final Kw_jsonContext kw_json() throws RecognitionException {
		Kw_jsonContext _localctx = new Kw_jsonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_kw_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(KW_JSON);
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

	public static class SvgContext extends ParserRuleContext {
		public Kw_svgContext kw_svg() {
			return getRuleContext(Kw_svgContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public SvgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterSvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitSvg(this);
		}
	}

	public final SvgContext svg() throws RecognitionException {
		SvgContext _localctx = new SvgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			kw_svg();
			setState(112);
			match(ASIG);
			setState(113);
			texto();
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(114);
				match(SPACE);
				}
				break;
			}
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

	public static class Kw_svgContext extends ParserRuleContext {
		public TerminalNode KW_SVG() { return getToken(EntradaParser.KW_SVG, 0); }
		public Kw_svgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_svg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_svg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_svg(this);
		}
	}

	public final Kw_svgContext kw_svg() throws RecognitionException {
		Kw_svgContext _localctx = new Kw_svgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_kw_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(KW_SVG);
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

	public static class DotContext extends ParserRuleContext {
		public Kw_dotContext kw_dot() {
			return getRuleContext(Kw_dotContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			kw_dot();
			setState(120);
			match(ASIG);
			setState(121);
			texto();
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(122);
				match(SPACE);
				}
				break;
			}
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

	public static class Kw_dotContext extends ParserRuleContext {
		public TerminalNode KW_DOT() { return getToken(EntradaParser.KW_DOT, 0); }
		public Kw_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_dot(this);
		}
	}

	public final Kw_dotContext kw_dot() throws RecognitionException {
		Kw_dotContext _localctx = new Kw_dotContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_kw_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(KW_DOT);
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

	public static class CsvContext extends ParserRuleContext {
		public Kw_csvContext kw_csv() {
			return getRuleContext(Kw_csvContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public CsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterCsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitCsv(this);
		}
	}

	public final CsvContext csv() throws RecognitionException {
		CsvContext _localctx = new CsvContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			kw_csv();
			setState(128);
			match(ASIG);
			setState(129);
			texto();
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(130);
				match(SPACE);
				}
				break;
			}
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

	public static class Kw_csvContext extends ParserRuleContext {
		public TerminalNode KW_CSV() { return getToken(EntradaParser.KW_CSV, 0); }
		public Kw_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_csv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_csv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_csv(this);
		}
	}

	public final Kw_csvContext kw_csv() throws RecognitionException {
		Kw_csvContext _localctx = new Kw_csvContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_kw_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(KW_CSV);
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

	public static class ParametrosContext extends ParserRuleContext {
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public FontcolorContext fontcolor() {
			return getRuleContext(FontcolorContext.class,0);
		}
		public FontnameContext fontname() {
			return getRuleContext(FontnameContext.class,0);
		}
		public FontsizeContext fontsize() {
			return getRuleContext(FontsizeContext.class,0);
		}
		public ArrowsizeContext arrowsize() {
			return getRuleContext(ArrowsizeContext.class,0);
		}
		public ArrowcolorContext arrowcolor() {
			return getRuleContext(ArrowcolorContext.class,0);
		}
		public PenwidthContext penwidth() {
			return getRuleContext(PenwidthContext.class,0);
		}
		public FillcolorContext fillcolor() {
			return getRuleContext(FillcolorContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(135);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(136);
				fontcolor();
				}
				break;
			case FONTNAME:
				{
				setState(137);
				fontname();
				}
				break;
			case FONTSIZE:
				{
				setState(138);
				fontsize();
				}
				break;
			case ARROWSIZE:
				{
				setState(139);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(140);
				arrowcolor();
				}
				break;
			case PENWIDTH:
				{
				setState(141);
				penwidth();
				}
				break;
			case FILLCOLOR:
				{
				setState(142);
				fillcolor();
				}
				break;
			case STYLE:
				{
				setState(143);
				style();
				}
				break;
			case SHAPE:
				{
				setState(144);
				shape();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class LenContext extends ParserRuleContext {
		public Kw_lenContext kw_len() {
			return getRuleContext(Kw_lenContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitLen(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			kw_len();
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(148);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(149);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(150);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(151);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			match(ASIG);
			setState(155);
			texto();
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				match(SPACE);
				}
				break;
			}
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

	public static class FontcolorContext extends ParserRuleContext {
		public Kw_fontcolorContext kw_fontcolor() {
			return getRuleContext(Kw_fontcolorContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public FontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterFontcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitFontcolor(this);
		}
	}

	public final FontcolorContext fontcolor() throws RecognitionException {
		FontcolorContext _localctx = new FontcolorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			kw_fontcolor();
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(160);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(161);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(164);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(165);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(166);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(167);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(170);
			match(ASIG);
			setState(171);
			texto();
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(172);
				match(SPACE);
				}
				break;
			}
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

	public static class FontnameContext extends ParserRuleContext {
		public Kw_fontnameContext kw_fontname() {
			return getRuleContext(Kw_fontnameContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public FontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterFontname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitFontname(this);
		}
	}

	public final FontnameContext fontname() throws RecognitionException {
		FontnameContext _localctx = new FontnameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			kw_fontname();
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(176);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(177);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(180);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(181);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(182);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(183);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			match(ASIG);
			setState(187);
			texto();
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(188);
				match(SPACE);
				}
				break;
			}
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

	public static class FontsizeContext extends ParserRuleContext {
		public Kw_fontsizeContext kw_fontsize() {
			return getRuleContext(Kw_fontsizeContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public FontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterFontsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitFontsize(this);
		}
	}

	public final FontsizeContext fontsize() throws RecognitionException {
		FontsizeContext _localctx = new FontsizeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			kw_fontsize();
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(192);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(193);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(196);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(197);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(198);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(199);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			match(ASIG);
			setState(203);
			texto();
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(204);
				match(SPACE);
				}
				break;
			}
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

	public static class ArrowsizeContext extends ParserRuleContext {
		public Kw_arrowsizeContext kw_arrowsize() {
			return getRuleContext(Kw_arrowsizeContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public ArrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterArrowsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitArrowsize(this);
		}
	}

	public final ArrowsizeContext arrowsize() throws RecognitionException {
		ArrowsizeContext _localctx = new ArrowsizeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			kw_arrowsize();
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(208);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(209);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(212);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(213);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(214);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(215);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(218);
			match(ASIG);
			setState(219);
			texto();
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(220);
				match(SPACE);
				}
				break;
			}
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

	public static class ArrowcolorContext extends ParserRuleContext {
		public Kw_arrowcolorContext kw_arrowcolor() {
			return getRuleContext(Kw_arrowcolorContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public ArrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterArrowcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitArrowcolor(this);
		}
	}

	public final ArrowcolorContext arrowcolor() throws RecognitionException {
		ArrowcolorContext _localctx = new ArrowcolorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			kw_arrowcolor();
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(224);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(225);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(228);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(229);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(230);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(231);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(234);
			match(ASIG);
			setState(235);
			texto();
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(236);
				match(SPACE);
				}
				break;
			}
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

	public static class PenwidthContext extends ParserRuleContext {
		public Kw_penwidthContext kw_penwidth() {
			return getRuleContext(Kw_penwidthContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public PenwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterPenwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitPenwidth(this);
		}
	}

	public final PenwidthContext penwidth() throws RecognitionException {
		PenwidthContext _localctx = new PenwidthContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			kw_penwidth();
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(240);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(241);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(244);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(245);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(246);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(247);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(250);
			match(ASIG);
			setState(251);
			texto();
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(252);
				match(SPACE);
				}
				break;
			}
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

	public static class FillcolorContext extends ParserRuleContext {
		public Kw_fillcolorContext kw_fillcolor() {
			return getRuleContext(Kw_fillcolorContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public FillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterFillcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitFillcolor(this);
		}
	}

	public final FillcolorContext fillcolor() throws RecognitionException {
		FillcolorContext _localctx = new FillcolorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			kw_fillcolor();
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(256);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(257);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(260);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(261);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(262);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(263);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(266);
			match(ASIG);
			setState(267);
			texto();
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(268);
				match(SPACE);
				}
				break;
			}
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

	public static class StyleContext extends ParserRuleContext {
		public Kw_styleContext kw_style() {
			return getRuleContext(Kw_styleContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitStyle(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			kw_style();
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(272);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(273);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(276);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(277);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(278);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(279);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(282);
			match(ASIG);
			setState(283);
			texto();
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(284);
				match(SPACE);
				}
				break;
			}
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

	public static class ShapeContext extends ParserRuleContext {
		public Kw_shapeContext kw_shape() {
			return getRuleContext(Kw_shapeContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitShape(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			kw_shape();
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(288);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(289);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(292);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(293);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(294);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(295);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(298);
			match(ASIG);
			setState(299);
			texto();
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(300);
				match(SPACE);
				}
				break;
			}
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

	public static class Kw_edgeContext extends ParserRuleContext {
		public TerminalNode EDGE() { return getToken(EntradaParser.EDGE, 0); }
		public Kw_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_edge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_edge(this);
		}
	}

	public final Kw_edgeContext kw_edge() throws RecognitionException {
		Kw_edgeContext _localctx = new Kw_edgeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_kw_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(EDGE);
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

	public static class Kw_nodeContext extends ParserRuleContext {
		public TerminalNode NODE() { return getToken(EntradaParser.NODE, 0); }
		public Kw_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_node(this);
		}
	}

	public final Kw_nodeContext kw_node() throws RecognitionException {
		Kw_nodeContext _localctx = new Kw_nodeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_kw_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(NODE);
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

	public static class Kw_relationshipContext extends ParserRuleContext {
		public TerminalNode RELATIONSHIP() { return getToken(EntradaParser.RELATIONSHIP, 0); }
		public Kw_relationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_relationship; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_relationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_relationship(this);
		}
	}

	public final Kw_relationshipContext kw_relationship() throws RecognitionException {
		Kw_relationshipContext _localctx = new Kw_relationshipContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_kw_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(RELATIONSHIP);
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

	public static class Kw_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(EntradaParser.CLASS, 0); }
		public Kw_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_class(this);
		}
	}

	public final Kw_classContext kw_class() throws RecognitionException {
		Kw_classContext _localctx = new Kw_classContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_kw_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(CLASS);
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

	public static class Kw_propertyContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(EntradaParser.PROPERTY, 0); }
		public Kw_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_property(this);
		}
	}

	public final Kw_propertyContext kw_property() throws RecognitionException {
		Kw_propertyContext _localctx = new Kw_propertyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_kw_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(PROPERTY);
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

	public static class Kw_inheritanceContext extends ParserRuleContext {
		public TerminalNode INHERITANCE() { return getToken(EntradaParser.INHERITANCE, 0); }
		public Kw_inheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_inheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_inheritance(this);
		}
	}

	public final Kw_inheritanceContext kw_inheritance() throws RecognitionException {
		Kw_inheritanceContext _localctx = new Kw_inheritanceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_kw_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(INHERITANCE);
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

	public static class Kw_inderect_useContext extends ParserRuleContext {
		public TerminalNode INDERECT_USE() { return getToken(EntradaParser.INDERECT_USE, 0); }
		public Kw_inderect_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inderect_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_inderect_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_inderect_use(this);
		}
	}

	public final Kw_inderect_useContext kw_inderect_use() throws RecognitionException {
		Kw_inderect_useContext _localctx = new Kw_inderect_useContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_kw_inderect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(INDERECT_USE);
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

	public static class Kw_lenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(EntradaParser.LEN, 0); }
		public Kw_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_len(this);
		}
	}

	public final Kw_lenContext kw_len() throws RecognitionException {
		Kw_lenContext _localctx = new Kw_lenContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_kw_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LEN);
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

	public static class Kw_fontcolorContext extends ParserRuleContext {
		public TerminalNode FONTCOLOR() { return getToken(EntradaParser.FONTCOLOR, 0); }
		public Kw_fontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fontcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_fontcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_fontcolor(this);
		}
	}

	public final Kw_fontcolorContext kw_fontcolor() throws RecognitionException {
		Kw_fontcolorContext _localctx = new Kw_fontcolorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_kw_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(FONTCOLOR);
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

	public static class Kw_fontnameContext extends ParserRuleContext {
		public TerminalNode FONTNAME() { return getToken(EntradaParser.FONTNAME, 0); }
		public Kw_fontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fontname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_fontname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_fontname(this);
		}
	}

	public final Kw_fontnameContext kw_fontname() throws RecognitionException {
		Kw_fontnameContext _localctx = new Kw_fontnameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_kw_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(FONTNAME);
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

	public static class Kw_fontsizeContext extends ParserRuleContext {
		public TerminalNode FONTSIZE() { return getToken(EntradaParser.FONTSIZE, 0); }
		public Kw_fontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fontsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_fontsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_fontsize(this);
		}
	}

	public final Kw_fontsizeContext kw_fontsize() throws RecognitionException {
		Kw_fontsizeContext _localctx = new Kw_fontsizeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_kw_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(FONTSIZE);
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

	public static class Kw_arrowsizeContext extends ParserRuleContext {
		public TerminalNode ARROWSIZE() { return getToken(EntradaParser.ARROWSIZE, 0); }
		public Kw_arrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_arrowsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_arrowsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_arrowsize(this);
		}
	}

	public final Kw_arrowsizeContext kw_arrowsize() throws RecognitionException {
		Kw_arrowsizeContext _localctx = new Kw_arrowsizeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_kw_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(ARROWSIZE);
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

	public static class Kw_arrowcolorContext extends ParserRuleContext {
		public TerminalNode ARROWCOLOR() { return getToken(EntradaParser.ARROWCOLOR, 0); }
		public Kw_arrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_arrowcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_arrowcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_arrowcolor(this);
		}
	}

	public final Kw_arrowcolorContext kw_arrowcolor() throws RecognitionException {
		Kw_arrowcolorContext _localctx = new Kw_arrowcolorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kw_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ARROWCOLOR);
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

	public static class Kw_penwidthContext extends ParserRuleContext {
		public TerminalNode PENWIDTH() { return getToken(EntradaParser.PENWIDTH, 0); }
		public Kw_penwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_penwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_penwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_penwidth(this);
		}
	}

	public final Kw_penwidthContext kw_penwidth() throws RecognitionException {
		Kw_penwidthContext _localctx = new Kw_penwidthContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_kw_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(PENWIDTH);
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

	public static class Kw_fillcolorContext extends ParserRuleContext {
		public TerminalNode FILLCOLOR() { return getToken(EntradaParser.FILLCOLOR, 0); }
		public Kw_fillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fillcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_fillcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_fillcolor(this);
		}
	}

	public final Kw_fillcolorContext kw_fillcolor() throws RecognitionException {
		Kw_fillcolorContext _localctx = new Kw_fillcolorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_kw_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(FILLCOLOR);
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

	public static class Kw_styleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(EntradaParser.STYLE, 0); }
		public Kw_styleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_style(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_style(this);
		}
	}

	public final Kw_styleContext kw_style() throws RecognitionException {
		Kw_styleContext _localctx = new Kw_styleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kw_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(STYLE);
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

	public static class Kw_shapeContext extends ParserRuleContext {
		public TerminalNode SHAPE() { return getToken(EntradaParser.SHAPE, 0); }
		public Kw_shapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_shape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_shape(this);
		}
	}

	public final Kw_shapeContext kw_shape() throws RecognitionException {
		Kw_shapeContext _localctx = new Kw_shapeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kw_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(SHAPE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0154\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\6"+
		"\2V\n\2\r\2\16\2W\3\3\3\3\3\3\3\3\5\3^\n\3\3\4\6\4a\n\4\r\4\16\4b\3\5"+
		"\6\5f\n\5\r\5\16\5g\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\b\3\b\3\b\3\b\5"+
		"\bv\n\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f"+
		"\u0086\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0094\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u009b\n\17\3\17\3\17\3\17"+
		"\5\17\u00a0\n\17\3\20\3\20\3\20\5\20\u00a5\n\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00ab\n\20\3\20\3\20\3\20\5\20\u00b0\n\20\3\21\3\21\3\21\5\21\u00b5"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u00bb\n\21\3\21\3\21\3\21\5\21\u00c0\n"+
		"\21\3\22\3\22\3\22\5\22\u00c5\n\22\3\22\3\22\3\22\3\22\5\22\u00cb\n\22"+
		"\3\22\3\22\3\22\5\22\u00d0\n\22\3\23\3\23\3\23\5\23\u00d5\n\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00db\n\23\3\23\3\23\3\23\5\23\u00e0\n\23\3\24\3\24"+
		"\3\24\5\24\u00e5\n\24\3\24\3\24\3\24\3\24\5\24\u00eb\n\24\3\24\3\24\3"+
		"\24\5\24\u00f0\n\24\3\25\3\25\3\25\5\25\u00f5\n\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00fb\n\25\3\25\3\25\3\25\5\25\u0100\n\25\3\26\3\26\3\26\5\26\u0105"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u010b\n\26\3\26\3\26\3\26\5\26\u0110\n"+
		"\26\3\27\3\27\3\27\5\27\u0115\n\27\3\27\3\27\3\27\3\27\5\27\u011b\n\27"+
		"\3\27\3\27\3\27\5\27\u0120\n\27\3\30\3\30\3\30\5\30\u0125\n\30\3\30\3"+
		"\30\3\30\3\30\5\30\u012b\n\30\3\30\3\30\3\30\5\30\u0130\n\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\2\2*\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2"+
		"\4\3\2\32\33\4\2\3\4\32\32\2\u0171\2U\3\2\2\2\4]\3\2\2\2\6`\3\2\2\2\b"+
		"e\3\2\2\2\ni\3\2\2\2\fo\3\2\2\2\16q\3\2\2\2\20w\3\2\2\2\22y\3\2\2\2\24"+
		"\177\3\2\2\2\26\u0081\3\2\2\2\30\u0087\3\2\2\2\32\u0093\3\2\2\2\34\u0095"+
		"\3\2\2\2\36\u00a1\3\2\2\2 \u00b1\3\2\2\2\"\u00c1\3\2\2\2$\u00d1\3\2\2"+
		"\2&\u00e1\3\2\2\2(\u00f1\3\2\2\2*\u0101\3\2\2\2,\u0111\3\2\2\2.\u0121"+
		"\3\2\2\2\60\u0131\3\2\2\2\62\u0133\3\2\2\2\64\u0135\3\2\2\2\66\u0137\3"+
		"\2\2\28\u0139\3\2\2\2:\u013b\3\2\2\2<\u013d\3\2\2\2>\u013f\3\2\2\2@\u0141"+
		"\3\2\2\2B\u0143\3\2\2\2D\u0145\3\2\2\2F\u0147\3\2\2\2H\u0149\3\2\2\2J"+
		"\u014b\3\2\2\2L\u014d\3\2\2\2N\u014f\3\2\2\2P\u0151\3\2\2\2RV\5\4\3\2"+
		"SV\5\32\16\2TV\5\b\5\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2X\3\3\2\2\2Y^\5\n\6\2Z^\5\16\b\2[^\5\22\n\2\\^\5\26\f\2]Y"+
		"\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\5\3\2\2\2_a\t\2\2\2`_\3\2\2\2"+
		"ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\7\3\2\2\2df\t\3\2\2ed\3\2\2\2fg\3\2\2"+
		"\2ge\3\2\2\2gh\3\2\2\2h\t\3\2\2\2ij\5\f\7\2jk\7\4\2\2km\5\6\4\2ln\7\3"+
		"\2\2ml\3\2\2\2mn\3\2\2\2n\13\3\2\2\2op\7\5\2\2p\r\3\2\2\2qr\5\20\t\2r"+
		"s\7\4\2\2su\5\6\4\2tv\7\3\2\2ut\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wx\7\7\2"+
		"\2x\21\3\2\2\2yz\5\24\13\2z{\7\4\2\2{}\5\6\4\2|~\7\3\2\2}|\3\2\2\2}~\3"+
		"\2\2\2~\23\3\2\2\2\177\u0080\7\6\2\2\u0080\25\3\2\2\2\u0081\u0082\5\30"+
		"\r\2\u0082\u0083\7\4\2\2\u0083\u0085\5\6\4\2\u0084\u0086\7\3\2\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\27\3\2\2\2\u0087\u0088\7\b\2"+
		"\2\u0088\31\3\2\2\2\u0089\u0094\5\34\17\2\u008a\u0094\5\36\20\2\u008b"+
		"\u0094\5 \21\2\u008c\u0094\5\"\22\2\u008d\u0094\5$\23\2\u008e\u0094\5"+
		"&\24\2\u008f\u0094\5(\25\2\u0090\u0094\5*\26\2\u0091\u0094\5,\27\2\u0092"+
		"\u0094\5.\30\2\u0093\u0089\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2"+
		"\2\2\u0093\u008c\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\33\3\2\2\2\u0095\u009a\5> \2\u0096\u009b\5\64\33\2\u0097\u009b"+
		"\5\66\34\2\u0098\u009b\5:\36\2\u0099\u009b\5<\37\2\u009a\u0096\3\2\2\2"+
		"\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\7\4\2\2\u009d\u009f\5\6\4\2\u009e\u00a0\7\3\2\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u00a4\5@!\2"+
		"\u00a2\u00a5\5\60\31\2\u00a3\u00a5\5\62\32\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00ab\5\64\33\2\u00a7\u00ab\5"+
		"\66\34\2\u00a8\u00ab\5:\36\2\u00a9\u00ab\5<\37\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00af\5\6\4\2\u00ae\u00b0\7\3\2\2\u00af"+
		"\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\37\3\2\2\2\u00b1\u00b4\5B\"\2"+
		"\u00b2\u00b5\5\60\31\2\u00b3\u00b5\5\62\32\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00ba\3\2\2\2\u00b6\u00bb\5\64\33\2\u00b7\u00bb\5"+
		"\66\34\2\u00b8\u00bb\5:\36\2\u00b9\u00bb\5<\37\2\u00ba\u00b6\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\7\4\2\2\u00bd\u00bf\5\6\4\2\u00be\u00c0\7\3\2\2\u00bf"+
		"\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00c4\5D#\2\u00c2"+
		"\u00c5\5\60\31\2\u00c3\u00c5\5\62\32\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00cb\5\64\33\2\u00c7\u00cb\5\66\34"+
		"\2\u00c8\u00cb\5:\36\2\u00c9\u00cb\5<\37\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\7\4\2\2\u00cd\u00cf\5\6\4\2\u00ce\u00d0\7\3\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00d4\5F$\2\u00d2\u00d5"+
		"\5\60\31\2\u00d3\u00d5\5\62\32\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2"+
		"\2\u00d5\u00da\3\2\2\2\u00d6\u00db\5\64\33\2\u00d7\u00db\5\66\34\2\u00d8"+
		"\u00db\5:\36\2\u00d9\u00db\5<\37\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\7\4\2\2\u00dd\u00df\5\6\4\2\u00de\u00e0\7\3\2\2\u00df\u00de\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0%\3\2\2\2\u00e1\u00e4\5H%\2\u00e2\u00e5"+
		"\5\60\31\2\u00e3\u00e5\5\62\32\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2"+
		"\2\u00e5\u00ea\3\2\2\2\u00e6\u00eb\5\64\33\2\u00e7\u00eb\5\66\34\2\u00e8"+
		"\u00eb\5:\36\2\u00e9\u00eb\5<\37\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\7\4\2\2\u00ed\u00ef\5\6\4\2\u00ee\u00f0\7\3\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\'\3\2\2\2\u00f1\u00f4\5J&\2\u00f2\u00f5"+
		"\5\60\31\2\u00f3\u00f5\5\62\32\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2"+
		"\2\u00f5\u00fa\3\2\2\2\u00f6\u00fb\5\64\33\2\u00f7\u00fb\5\66\34\2\u00f8"+
		"\u00fb\5:\36\2\u00f9\u00fb\5<\37\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\7\4\2\2\u00fd\u00ff\5\6\4\2\u00fe\u0100\7\3\2\2\u00ff\u00fe\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100)\3\2\2\2\u0101\u0104\5L\'\2\u0102\u0105"+
		"\5\60\31\2\u0103\u0105\5\62\32\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2"+
		"\2\u0105\u010a\3\2\2\2\u0106\u010b\5\64\33\2\u0107\u010b\5\66\34\2\u0108"+
		"\u010b\5:\36\2\u0109\u010b\5<\37\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\7\4\2\2\u010d\u010f\5\6\4\2\u010e\u0110\7\3\2\2\u010f\u010e\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110+\3\2\2\2\u0111\u0114\5N(\2\u0112\u0115"+
		"\5\60\31\2\u0113\u0115\5\62\32\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2"+
		"\2\u0115\u011a\3\2\2\2\u0116\u011b\5\64\33\2\u0117\u011b\5\66\34\2\u0118"+
		"\u011b\5:\36\2\u0119\u011b\5<\37\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\7\4\2\2\u011d\u011f\5\6\4\2\u011e\u0120\7\3\2\2\u011f\u011e\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120-\3\2\2\2\u0121\u0124\5P)\2\u0122\u0125"+
		"\5\60\31\2\u0123\u0125\5\62\32\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2"+
		"\2\u0125\u012a\3\2\2\2\u0126\u012b\5\64\33\2\u0127\u012b\5\66\34\2\u0128"+
		"\u012b\5:\36\2\u0129\u012b\5<\37\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7\4\2\2\u012d\u012f\5\6\4\2\u012e\u0130\7\3\2\2\u012f\u012e\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130/\3\2\2\2\u0131\u0132\7\23\2\2\u0132\61"+
		"\3\2\2\2\u0133\u0134\7\24\2\2\u0134\63\3\2\2\2\u0135\u0136\7\25\2\2\u0136"+
		"\65\3\2\2\2\u0137\u0138\7\26\2\2\u0138\67\3\2\2\2\u0139\u013a\7\27\2\2"+
		"\u013a9\3\2\2\2\u013b\u013c\7\30\2\2\u013c;\3\2\2\2\u013d\u013e\7\31\2"+
		"\2\u013e=\3\2\2\2\u013f\u0140\7\t\2\2\u0140?\3\2\2\2\u0141\u0142\7\n\2"+
		"\2\u0142A\3\2\2\2\u0143\u0144\7\13\2\2\u0144C\3\2\2\2\u0145\u0146\7\f"+
		"\2\2\u0146E\3\2\2\2\u0147\u0148\7\r\2\2\u0148G\3\2\2\2\u0149\u014a\7\16"+
		"\2\2\u014aI\3\2\2\2\u014b\u014c\7\17\2\2\u014cK\3\2\2\2\u014d\u014e\7"+
		"\20\2\2\u014eM\3\2\2\2\u014f\u0150\7\21\2\2\u0150O\3\2\2\2\u0151\u0152"+
		"\7\22\2\2\u0152Q\3\2\2\2)UW]bgmu}\u0085\u0093\u009a\u009f\u00a4\u00aa"+
		"\u00af\u00b4\u00ba\u00bf\u00c4\u00ca\u00cf\u00d4\u00da\u00df\u00e4\u00ea"+
		"\u00ef\u00f4\u00fa\u00ff\u0104\u010a\u010f\u0114\u011a\u011f\u0124\u012a"+
		"\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}