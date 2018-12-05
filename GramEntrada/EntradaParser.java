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
		SPACE=1, KW_JSON=2, KW_DOT=3, KW_SVG=4, KW_CSV=5, LEN=6, FONTCOLOR=7, 
		FONTNAME=8, FONTSIZE=9, ARROWSIZE=10, ARROWCOLOR=11, PENWIDTH=12, FILLCOLOR=13, 
		STYLE=14, SHAPE=15, EDGE=16, NODE=17, RELATIONSHIP=18, CLASS=19, PROPERTY=20, 
		INHERITANCE=21, INDERECT_USE=22, TEXTO=23, CADENA=24;
	public static final int
		RULE_init = 0, RULE_tipo_archivo = 1, RULE_textojson = 2, RULE_textosvg = 3, 
		RULE_textodot = 4, RULE_textocsv = 5, RULE_textoparam = 6, RULE_basura = 7, 
		RULE_json = 8, RULE_kw_json = 9, RULE_svg = 10, RULE_kw_svg = 11, RULE_dot = 12, 
		RULE_kw_dot = 13, RULE_csv = 14, RULE_kw_csv = 15, RULE_parametros = 16, 
		RULE_len = 17, RULE_fontcolor = 18, RULE_fontname = 19, RULE_fontsize = 20, 
		RULE_arrowsize = 21, RULE_arrowcolor = 22, RULE_penwidth = 23, RULE_fillcolor = 24, 
		RULE_style = 25, RULE_shape = 26, RULE_len_name = 27, RULE_fontcolor_name = 28, 
		RULE_fontname_name = 29, RULE_fontsize_name = 30, RULE_arrowsize_name = 31, 
		RULE_arrowcolor_name = 32, RULE_penwidth_name = 33, RULE_fillcolor_name = 34, 
		RULE_style_name = 35, RULE_shape_name = 36, RULE_kw_edge = 37, RULE_kw_node = 38, 
		RULE_kw_relationship = 39, RULE_kw_class = 40, RULE_kw_property = 41, 
		RULE_kw_inheritance = 42, RULE_kw_inderect_use = 43, RULE_kw_len = 44, 
		RULE_kw_fontcolor = 45, RULE_kw_fontname = 46, RULE_kw_fontsize = 47, 
		RULE_kw_arrowsize = 48, RULE_kw_arrowcolor = 49, RULE_kw_penwidth = 50, 
		RULE_kw_fillcolor = 51, RULE_kw_style = 52, RULE_kw_shape = 53;
	public static final String[] ruleNames = {
		"init", "tipo_archivo", "textojson", "textosvg", "textodot", "textocsv", 
		"textoparam", "basura", "json", "kw_json", "svg", "kw_svg", "dot", "kw_dot", 
		"csv", "kw_csv", "parametros", "len", "fontcolor", "fontname", "fontsize", 
		"arrowsize", "arrowcolor", "penwidth", "fillcolor", "style", "shape", 
		"len_name", "fontcolor_name", "fontname_name", "fontsize_name", "arrowsize_name", 
		"arrowcolor_name", "penwidth_name", "fillcolor_name", "style_name", "shape_name", 
		"kw_edge", "kw_node", "kw_relationship", "kw_class", "kw_property", "kw_inheritance", 
		"kw_inderect_use", "kw_len", "kw_fontcolor", "kw_fontname", "kw_fontsize", 
		"kw_arrowsize", "kw_arrowcolor", "kw_penwidth", "kw_fillcolor", "kw_style", 
		"kw_shape"
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
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_JSON:
				case KW_DOT:
				case KW_SVG:
				case KW_CSV:
					{
					setState(108);
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
					setState(109);
					parametros();
					}
					break;
				case SPACE:
				case TEXTO:
					{
					setState(110);
					basura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << KW_JSON) | (1L << KW_DOT) | (1L << KW_SVG) | (1L << KW_CSV) | (1L << LEN) | (1L << FONTCOLOR) | (1L << FONTNAME) | (1L << FONTSIZE) | (1L << ARROWSIZE) | (1L << ARROWCOLOR) | (1L << PENWIDTH) | (1L << FILLCOLOR) | (1L << STYLE) | (1L << SHAPE) | (1L << TEXTO))) != 0) );
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_JSON:
				{
				setState(115);
				json();
				}
				break;
			case KW_SVG:
				{
				setState(116);
				svg();
				}
				break;
			case KW_DOT:
				{
				setState(117);
				dot();
				}
				break;
			case KW_CSV:
				{
				setState(118);
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

	public static class TextojsonContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(EntradaParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(EntradaParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(EntradaParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(EntradaParser.CADENA, i);
		}
		public TextojsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textojson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTextojson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTextojson(this);
		}
	}

	public final TextojsonContext textojson() throws RecognitionException {
		TextojsonContext _localctx = new TextojsonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_textojson);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(121);
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
				setState(124); 
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

	public static class TextosvgContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(EntradaParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(EntradaParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(EntradaParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(EntradaParser.CADENA, i);
		}
		public TextosvgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textosvg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTextosvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTextosvg(this);
		}
	}

	public final TextosvgContext textosvg() throws RecognitionException {
		TextosvgContext _localctx = new TextosvgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_textosvg);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(126);
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
				setState(129); 
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

	public static class TextodotContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(EntradaParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(EntradaParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(EntradaParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(EntradaParser.CADENA, i);
		}
		public TextodotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textodot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTextodot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTextodot(this);
		}
	}

	public final TextodotContext textodot() throws RecognitionException {
		TextodotContext _localctx = new TextodotContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_textodot);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(131);
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
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class TextocsvContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(EntradaParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(EntradaParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(EntradaParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(EntradaParser.CADENA, i);
		}
		public TextocsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textocsv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTextocsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTextocsv(this);
		}
	}

	public final TextocsvContext textocsv() throws RecognitionException {
		TextocsvContext _localctx = new TextocsvContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_textocsv);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(136);
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
				setState(139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class TextoparamContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(EntradaParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(EntradaParser.TEXTO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(EntradaParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(EntradaParser.CADENA, i);
		}
		public TextoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTextoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTextoparam(this);
		}
	}

	public final TextoparamContext textoparam() throws RecognitionException {
		TextoparamContext _localctx = new TextoparamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textoparam);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(141);
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
				setState(144); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 14, RULE_basura);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(146);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==TEXTO) ) {
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
				setState(149); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public TextojsonContext textojson() {
			return getRuleContext(TextojsonContext.class,0);
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
		enterRule(_localctx, 16, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			kw_json();
			setState(152);
			textojson();
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(153);
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
		enterRule(_localctx, 18, RULE_kw_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		public TextosvgContext textosvg() {
			return getRuleContext(TextosvgContext.class,0);
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
		enterRule(_localctx, 20, RULE_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			kw_svg();
			setState(159);
			textosvg();
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(160);
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
		enterRule(_localctx, 22, RULE_kw_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		public TextodotContext textodot() {
			return getRuleContext(TextodotContext.class,0);
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
		enterRule(_localctx, 24, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			kw_dot();
			setState(166);
			textodot();
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(167);
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
		enterRule(_localctx, 26, RULE_kw_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		public TextocsvContext textocsv() {
			return getRuleContext(TextocsvContext.class,0);
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
		enterRule(_localctx, 28, RULE_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			kw_csv();
			setState(173);
			textocsv();
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(174);
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
		enterRule(_localctx, 30, RULE_kw_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 32, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(179);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(180);
				fontcolor();
				}
				break;
			case FONTNAME:
				{
				setState(181);
				fontname();
				}
				break;
			case FONTSIZE:
				{
				setState(182);
				fontsize();
				}
				break;
			case ARROWSIZE:
				{
				setState(183);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(184);
				arrowcolor();
				}
				break;
			case PENWIDTH:
				{
				setState(185);
				penwidth();
				}
				break;
			case FILLCOLOR:
				{
				setState(186);
				fillcolor();
				}
				break;
			case STYLE:
				{
				setState(187);
				style();
				}
				break;
			case SHAPE:
				{
				setState(188);
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
		public Len_nameContext len_name() {
			return getRuleContext(Len_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 34, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			len_name();
			setState(192);
			textoparam();
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(193);
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
		public Fontcolor_nameContext fontcolor_name() {
			return getRuleContext(Fontcolor_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 36, RULE_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			fontcolor_name();
			setState(197);
			textoparam();
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(198);
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
		public Fontname_nameContext fontname_name() {
			return getRuleContext(Fontname_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 38, RULE_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			fontname_name();
			setState(202);
			textoparam();
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(203);
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
		public Fontsize_nameContext fontsize_name() {
			return getRuleContext(Fontsize_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 40, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			fontsize_name();
			setState(207);
			textoparam();
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(208);
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
		public Arrowsize_nameContext arrowsize_name() {
			return getRuleContext(Arrowsize_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 42, RULE_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			arrowsize_name();
			setState(212);
			textoparam();
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(213);
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
		public Arrowcolor_nameContext arrowcolor_name() {
			return getRuleContext(Arrowcolor_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 44, RULE_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			arrowcolor_name();
			setState(217);
			textoparam();
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(218);
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
		public Penwidth_nameContext penwidth_name() {
			return getRuleContext(Penwidth_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 46, RULE_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			penwidth_name();
			setState(222);
			textoparam();
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(223);
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
		public Fillcolor_nameContext fillcolor_name() {
			return getRuleContext(Fillcolor_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 48, RULE_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			fillcolor_name();
			setState(227);
			textoparam();
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(228);
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
		public Style_nameContext style_name() {
			return getRuleContext(Style_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 50, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			style_name();
			setState(232);
			textoparam();
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(233);
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
		public Shape_nameContext shape_name() {
			return getRuleContext(Shape_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
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
		enterRule(_localctx, 52, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			shape_name();
			setState(237);
			textoparam();
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(238);
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

	public static class Len_nameContext extends ParserRuleContext {
		public Kw_lenContext kw_len() {
			return getRuleContext(Kw_lenContext.class,0);
		}
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Len_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterLen_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitLen_name(this);
		}
	}

	public final Len_nameContext len_name() throws RecognitionException {
		Len_nameContext _localctx = new Len_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_len_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			kw_len();
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(242);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(243);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(244);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(245);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(246);
				kw_inderect_use();
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

	public static class Fontcolor_nameContext extends ParserRuleContext {
		public Kw_fontcolorContext kw_fontcolor() {
			return getRuleContext(Kw_fontcolorContext.class,0);
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
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Fontcolor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontcolor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterFontcolor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitFontcolor_name(this);
		}
	}

	public final Fontcolor_nameContext fontcolor_name() throws RecognitionException {
		Fontcolor_nameContext _localctx = new Fontcolor_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fontcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			kw_fontcolor();
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(250);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(251);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(254);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(255);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(256);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(257);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(258);
				kw_inderect_use();
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

	public static class Fontname_nameContext extends ParserRuleContext {
		public Kw_fontnameContext kw_fontname() {
			return getRuleContext(Kw_fontnameContext.class,0);
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
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Fontname_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontname_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterFontname_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitFontname_name(this);
		}
	}

	public final Fontname_nameContext fontname_name() throws RecognitionException {
		Fontname_nameContext _localctx = new Fontname_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fontname_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			kw_fontname();
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(262);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(263);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(266);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(267);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(268);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(269);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(270);
				kw_inderect_use();
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

	public static class Fontsize_nameContext extends ParserRuleContext {
		public Kw_fontsizeContext kw_fontsize() {
			return getRuleContext(Kw_fontsizeContext.class,0);
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
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Fontsize_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterFontsize_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitFontsize_name(this);
		}
	}

	public final Fontsize_nameContext fontsize_name() throws RecognitionException {
		Fontsize_nameContext _localctx = new Fontsize_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fontsize_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			kw_fontsize();
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(274);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(275);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(278);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(279);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(280);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(281);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(282);
				kw_inderect_use();
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

	public static class Arrowsize_nameContext extends ParserRuleContext {
		public Kw_arrowsizeContext kw_arrowsize() {
			return getRuleContext(Kw_arrowsizeContext.class,0);
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
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Arrowsize_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowsize_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterArrowsize_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitArrowsize_name(this);
		}
	}

	public final Arrowsize_nameContext arrowsize_name() throws RecognitionException {
		Arrowsize_nameContext _localctx = new Arrowsize_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrowsize_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			kw_arrowsize();
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(286);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(287);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(290);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(291);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(292);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(293);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(294);
				kw_inderect_use();
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

	public static class Arrowcolor_nameContext extends ParserRuleContext {
		public Kw_arrowcolorContext kw_arrowcolor() {
			return getRuleContext(Kw_arrowcolorContext.class,0);
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
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Arrowcolor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowcolor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterArrowcolor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitArrowcolor_name(this);
		}
	}

	public final Arrowcolor_nameContext arrowcolor_name() throws RecognitionException {
		Arrowcolor_nameContext _localctx = new Arrowcolor_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrowcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			kw_arrowcolor();
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(298);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(299);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(302);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(303);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(304);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(305);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(306);
				kw_inderect_use();
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

	public static class Penwidth_nameContext extends ParserRuleContext {
		public Kw_penwidthContext kw_penwidth() {
			return getRuleContext(Kw_penwidthContext.class,0);
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
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Penwidth_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penwidth_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterPenwidth_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitPenwidth_name(this);
		}
	}

	public final Penwidth_nameContext penwidth_name() throws RecognitionException {
		Penwidth_nameContext _localctx = new Penwidth_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_penwidth_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			kw_penwidth();
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(310);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(311);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(314);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(315);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(316);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(317);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(318);
				kw_inderect_use();
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

	public static class Fillcolor_nameContext extends ParserRuleContext {
		public Kw_fillcolorContext kw_fillcolor() {
			return getRuleContext(Kw_fillcolorContext.class,0);
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
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Fillcolor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillcolor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterFillcolor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitFillcolor_name(this);
		}
	}

	public final Fillcolor_nameContext fillcolor_name() throws RecognitionException {
		Fillcolor_nameContext _localctx = new Fillcolor_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fillcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			kw_fillcolor();
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(322);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(323);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(326);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(327);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(328);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(329);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(330);
				kw_inderect_use();
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

	public static class Style_nameContext extends ParserRuleContext {
		public Kw_styleContext kw_style() {
			return getRuleContext(Kw_styleContext.class,0);
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
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Style_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterStyle_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitStyle_name(this);
		}
	}

	public final Style_nameContext style_name() throws RecognitionException {
		Style_nameContext _localctx = new Style_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_style_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			kw_style();
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(334);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(335);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(338);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(339);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(340);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(341);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(342);
				kw_inderect_use();
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

	public static class Shape_nameContext extends ParserRuleContext {
		public Kw_shapeContext kw_shape() {
			return getRuleContext(Kw_shapeContext.class,0);
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
		public Kw_propertyContext kw_property() {
			return getRuleContext(Kw_propertyContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Shape_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterShape_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitShape_name(this);
		}
	}

	public final Shape_nameContext shape_name() throws RecognitionException {
		Shape_nameContext _localctx = new Shape_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_shape_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			kw_shape();
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(346);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(347);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(350);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(351);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(352);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(353);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(354);
				kw_inderect_use();
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
		enterRule(_localctx, 74, RULE_kw_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 76, RULE_kw_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 78, RULE_kw_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 80, RULE_kw_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 82, RULE_kw_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 84, RULE_kw_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		enterRule(_localctx, 86, RULE_kw_inderect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		enterRule(_localctx, 88, RULE_kw_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		enterRule(_localctx, 90, RULE_kw_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		enterRule(_localctx, 92, RULE_kw_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		enterRule(_localctx, 94, RULE_kw_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		enterRule(_localctx, 96, RULE_kw_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		enterRule(_localctx, 98, RULE_kw_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		enterRule(_localctx, 100, RULE_kw_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
		enterRule(_localctx, 102, RULE_kw_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		enterRule(_localctx, 104, RULE_kw_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 106, RULE_kw_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u018a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\6\2r\n\2\r\2\16\2s\3\3\3"+
		"\3\3\3\3\3\5\3z\n\3\3\4\6\4}\n\4\r\4\16\4~\3\5\6\5\u0082\n\5\r\5\16\5"+
		"\u0083\3\6\6\6\u0087\n\6\r\6\16\6\u0088\3\7\6\7\u008c\n\7\r\7\16\7\u008d"+
		"\3\b\6\b\u0091\n\b\r\b\16\b\u0092\3\t\6\t\u0096\n\t\r\t\16\t\u0097\3\n"+
		"\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u00a4\n\f\3\r\3\r\3\16"+
		"\3\16\3\16\5\16\u00ab\n\16\3\17\3\17\3\20\3\20\3\20\5\20\u00b2\n\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c0"+
		"\n\22\3\23\3\23\3\23\5\23\u00c5\n\23\3\24\3\24\3\24\5\24\u00ca\n\24\3"+
		"\25\3\25\3\25\5\25\u00cf\n\25\3\26\3\26\3\26\5\26\u00d4\n\26\3\27\3\27"+
		"\3\27\5\27\u00d9\n\27\3\30\3\30\3\30\5\30\u00de\n\30\3\31\3\31\3\31\5"+
		"\31\u00e3\n\31\3\32\3\32\3\32\5\32\u00e8\n\32\3\33\3\33\3\33\5\33\u00ed"+
		"\n\33\3\34\3\34\3\34\5\34\u00f2\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u00fa\n\35\3\36\3\36\3\36\5\36\u00ff\n\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u0106\n\36\3\37\3\37\3\37\5\37\u010b\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0112\n\37\3 \3 \3 \5 \u0117\n \3 \3 \3 \3 \3 \5 \u011e\n \3!\3"+
		"!\3!\5!\u0123\n!\3!\3!\3!\3!\3!\5!\u012a\n!\3\"\3\"\3\"\5\"\u012f\n\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u0136\n\"\3#\3#\3#\5#\u013b\n#\3#\3#\3#\3#\3"+
		"#\5#\u0142\n#\3$\3$\3$\5$\u0147\n$\3$\3$\3$\3$\3$\5$\u014e\n$\3%\3%\3"+
		"%\5%\u0153\n%\3%\3%\3%\3%\3%\5%\u015a\n%\3&\3&\3&\5&\u015f\n&\3&\3&\3"+
		"&\3&\3&\5&\u0166\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\3\67\2\28\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\4\3\2\31\32\4\2\3\3\31"+
		"\31\2\u01a7\2q\3\2\2\2\4y\3\2\2\2\6|\3\2\2\2\b\u0081\3\2\2\2\n\u0086\3"+
		"\2\2\2\f\u008b\3\2\2\2\16\u0090\3\2\2\2\20\u0095\3\2\2\2\22\u0099\3\2"+
		"\2\2\24\u009e\3\2\2\2\26\u00a0\3\2\2\2\30\u00a5\3\2\2\2\32\u00a7\3\2\2"+
		"\2\34\u00ac\3\2\2\2\36\u00ae\3\2\2\2 \u00b3\3\2\2\2\"\u00bf\3\2\2\2$\u00c1"+
		"\3\2\2\2&\u00c6\3\2\2\2(\u00cb\3\2\2\2*\u00d0\3\2\2\2,\u00d5\3\2\2\2."+
		"\u00da\3\2\2\2\60\u00df\3\2\2\2\62\u00e4\3\2\2\2\64\u00e9\3\2\2\2\66\u00ee"+
		"\3\2\2\28\u00f3\3\2\2\2:\u00fb\3\2\2\2<\u0107\3\2\2\2>\u0113\3\2\2\2@"+
		"\u011f\3\2\2\2B\u012b\3\2\2\2D\u0137\3\2\2\2F\u0143\3\2\2\2H\u014f\3\2"+
		"\2\2J\u015b\3\2\2\2L\u0167\3\2\2\2N\u0169\3\2\2\2P\u016b\3\2\2\2R\u016d"+
		"\3\2\2\2T\u016f\3\2\2\2V\u0171\3\2\2\2X\u0173\3\2\2\2Z\u0175\3\2\2\2\\"+
		"\u0177\3\2\2\2^\u0179\3\2\2\2`\u017b\3\2\2\2b\u017d\3\2\2\2d\u017f\3\2"+
		"\2\2f\u0181\3\2\2\2h\u0183\3\2\2\2j\u0185\3\2\2\2l\u0187\3\2\2\2nr\5\4"+
		"\3\2or\5\"\22\2pr\5\20\t\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2t\3\3\2\2\2uz\5\22\n\2vz\5\26\f\2wz\5\32\16\2xz\5\36\20"+
		"\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\5\3\2\2\2{}\t\2\2\2|{\3\2"+
		"\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\7\3\2\2\2\u0080\u0082\t\2\2"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\t\3\2\2\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\13\3\2\2"+
		"\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\r\3\2\2\2\u008f\u0091\t\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\17\3\2\2\2\u0094\u0096\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\21\3\2\2\2\u0099"+
		"\u009a\5\24\13\2\u009a\u009c\5\6\4\2\u009b\u009d\7\3\2\2\u009c\u009b\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\23\3\2\2\2\u009e\u009f\7\4\2\2\u009f"+
		"\25\3\2\2\2\u00a0\u00a1\5\30\r\2\u00a1\u00a3\5\b\5\2\u00a2\u00a4\7\3\2"+
		"\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\27\3\2\2\2\u00a5\u00a6"+
		"\7\6\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00aa\5\n\6\2\u00a9"+
		"\u00ab\7\3\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\33\3\2\2"+
		"\2\u00ac\u00ad\7\5\2\2\u00ad\35\3\2\2\2\u00ae\u00af\5 \21\2\u00af\u00b1"+
		"\5\f\7\2\u00b0\u00b2\7\3\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\37\3\2\2\2\u00b3\u00b4\7\7\2\2\u00b4!\3\2\2\2\u00b5\u00c0\5$\23\2\u00b6"+
		"\u00c0\5&\24\2\u00b7\u00c0\5(\25\2\u00b8\u00c0\5*\26\2\u00b9\u00c0\5,"+
		"\27\2\u00ba\u00c0\5.\30\2\u00bb\u00c0\5\60\31\2\u00bc\u00c0\5\62\32\2"+
		"\u00bd\u00c0\5\64\33\2\u00be\u00c0\5\66\34\2\u00bf\u00b5\3\2\2\2\u00bf"+
		"\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00b9\3\2"+
		"\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0#\3\2\2\2\u00c1\u00c2\58\35\2"+
		"\u00c2\u00c4\5\16\b\2\u00c3\u00c5\7\3\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00c7\5:\36\2\u00c7\u00c9\5\16\b\2\u00c8"+
		"\u00ca\7\3\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\'\3\2\2\2"+
		"\u00cb\u00cc\5<\37\2\u00cc\u00ce\5\16\b\2\u00cd\u00cf\7\3\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf)\3\2\2\2\u00d0\u00d1\5> \2\u00d1\u00d3"+
		"\5\16\b\2\u00d2\u00d4\7\3\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4+\3\2\2\2\u00d5\u00d6\5@!\2\u00d6\u00d8\5\16\b\2\u00d7\u00d9\7\3"+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9-\3\2\2\2\u00da\u00db"+
		"\5B\"\2\u00db\u00dd\5\16\b\2\u00dc\u00de\7\3\2\2\u00dd\u00dc\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de/\3\2\2\2\u00df\u00e0\5D#\2\u00e0\u00e2\5\16\b\2\u00e1"+
		"\u00e3\7\3\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\61\3\2\2"+
		"\2\u00e4\u00e5\5F$\2\u00e5\u00e7\5\16\b\2\u00e6\u00e8\7\3\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\63\3\2\2\2\u00e9\u00ea\5H%\2\u00ea"+
		"\u00ec\5\16\b\2\u00eb\u00ed\7\3\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3"+
		"\2\2\2\u00ed\65\3\2\2\2\u00ee\u00ef\5J&\2\u00ef\u00f1\5\16\b\2\u00f0\u00f2"+
		"\7\3\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\67\3\2\2\2\u00f3"+
		"\u00f9\5Z.\2\u00f4\u00fa\5P)\2\u00f5\u00fa\5R*\2\u00f6\u00fa\5T+\2\u00f7"+
		"\u00fa\5V,\2\u00f8\u00fa\5X-\2\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2"+
		"\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa9\3"+
		"\2\2\2\u00fb\u00fe\5\\/\2\u00fc\u00ff\5L\'\2\u00fd\u00ff\5N(\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0105\3\2\2\2\u0100\u0106\5P)\2\u0101"+
		"\u0106\5R*\2\u0102\u0106\5T+\2\u0103\u0106\5V,\2\u0104\u0106\5X-\2\u0105"+
		"\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0104\3\2\2\2\u0106;\3\2\2\2\u0107\u010a\5^\60\2\u0108\u010b"+
		"\5L\'\2\u0109\u010b\5N(\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u0111\3\2\2\2\u010c\u0112\5P)\2\u010d\u0112\5R*\2\u010e\u0112\5T+\2\u010f"+
		"\u0112\5V,\2\u0110\u0112\5X-\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2\2"+
		"\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112=\3"+
		"\2\2\2\u0113\u0116\5`\61\2\u0114\u0117\5L\'\2\u0115\u0117\5N(\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u011d\3\2\2\2\u0118\u011e\5P"+
		")\2\u0119\u011e\5R*\2\u011a\u011e\5T+\2\u011b\u011e\5V,\2\u011c\u011e"+
		"\5X-\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e?\3\2\2\2\u011f\u0122\5b\62\2"+
		"\u0120\u0123\5L\'\2\u0121\u0123\5N(\2\u0122\u0120\3\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123\u0129\3\2\2\2\u0124\u012a\5P)\2\u0125\u012a\5R*\2\u0126"+
		"\u012a\5T+\2\u0127\u012a\5V,\2\u0128\u012a\5X-\2\u0129\u0124\3\2\2\2\u0129"+
		"\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012aA\3\2\2\2\u012b\u012e\5d\63\2\u012c\u012f\5L\'\2\u012d\u012f"+
		"\5N(\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0135\3\2\2\2\u0130"+
		"\u0136\5P)\2\u0131\u0136\5R*\2\u0132\u0136\5T+\2\u0133\u0136\5V,\2\u0134"+
		"\u0136\5X-\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136C\3\2\2\2\u0137\u013a"+
		"\5f\64\2\u0138\u013b\5L\'\2\u0139\u013b\5N(\2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u0141\3\2\2\2\u013c\u0142\5P)\2\u013d\u0142\5R*\2"+
		"\u013e\u0142\5T+\2\u013f\u0142\5V,\2\u0140\u0142\5X-\2\u0141\u013c\3\2"+
		"\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142E\3\2\2\2\u0143\u0146\5h\65\2\u0144\u0147\5L\'\2\u0145"+
		"\u0147\5N(\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u014d\3\2\2"+
		"\2\u0148\u014e\5P)\2\u0149\u014e\5R*\2\u014a\u014e\5T+\2\u014b\u014e\5"+
		"V,\2\u014c\u014e\5X-\2\u014d\u0148\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014a"+
		"\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014eG\3\2\2\2\u014f"+
		"\u0152\5j\66\2\u0150\u0153\5L\'\2\u0151\u0153\5N(\2\u0152\u0150\3\2\2"+
		"\2\u0152\u0151\3\2\2\2\u0153\u0159\3\2\2\2\u0154\u015a\5P)\2\u0155\u015a"+
		"\5R*\2\u0156\u015a\5T+\2\u0157\u015a\5V,\2\u0158\u015a\5X-\2\u0159\u0154"+
		"\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015aI\3\2\2\2\u015b\u015e\5l\67\2\u015c\u015f\5L\'\2\u015d"+
		"\u015f\5N(\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0165\3\2\2"+
		"\2\u0160\u0166\5P)\2\u0161\u0166\5R*\2\u0162\u0166\5T+\2\u0163\u0166\5"+
		"V,\2\u0164\u0166\5X-\2\u0165\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0162"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166K\3\2\2\2\u0167"+
		"\u0168\7\22\2\2\u0168M\3\2\2\2\u0169\u016a\7\23\2\2\u016aO\3\2\2\2\u016b"+
		"\u016c\7\24\2\2\u016cQ\3\2\2\2\u016d\u016e\7\25\2\2\u016eS\3\2\2\2\u016f"+
		"\u0170\7\26\2\2\u0170U\3\2\2\2\u0171\u0172\7\27\2\2\u0172W\3\2\2\2\u0173"+
		"\u0174\7\30\2\2\u0174Y\3\2\2\2\u0175\u0176\7\b\2\2\u0176[\3\2\2\2\u0177"+
		"\u0178\7\t\2\2\u0178]\3\2\2\2\u0179\u017a\7\n\2\2\u017a_\3\2\2\2\u017b"+
		"\u017c\7\13\2\2\u017ca\3\2\2\2\u017d\u017e\7\f\2\2\u017ec\3\2\2\2\u017f"+
		"\u0180\7\r\2\2\u0180e\3\2\2\2\u0181\u0182\7\16\2\2\u0182g\3\2\2\2\u0183"+
		"\u0184\7\17\2\2\u0184i\3\2\2\2\u0185\u0186\7\20\2\2\u0186k\3\2\2\2\u0187"+
		"\u0188\7\21\2\2\u0188m\3\2\2\2-qsy~\u0083\u0088\u008d\u0092\u0097\u009c"+
		"\u00a3\u00aa\u00b1\u00bf\u00c4\u00c9\u00ce\u00d3\u00d8\u00dd\u00e2\u00e7"+
		"\u00ec\u00f1\u00f9\u00fe\u0105\u010a\u0111\u0116\u011d\u0122\u0129\u012e"+
		"\u0135\u013a\u0141\u0146\u014d\u0152\u0159\u015e\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}