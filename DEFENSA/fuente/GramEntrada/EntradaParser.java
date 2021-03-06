// Generated from ./fuente/GramEntrada/EntradaParser.g4 by ANTLR 4.7.1

package fuente.GramEntrada;

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
		FONTNAME=8, FONTSIZE=9, ARROWSIZE=10, ARROWHEAD=11, ARROWCOLOR=12, PENWIDTH=13, 
		FILLCOLOR=14, STYLE=15, SHAPE=16, COLOR=17, EDGE=18, NODE=19, DIR=20, 
		RELATIONSHIP=21, CLASS=22, PROPERTY=23, INHERITANCE=24, INDERECT_USE=25, 
		TEXTO=26, CADENA=27;
	public static final int
		RULE_init = 0, RULE_tipo_archivo = 1, RULE_textojson = 2, RULE_textosvg = 3, 
		RULE_textodot = 4, RULE_textocsv = 5, RULE_textoparam = 6, RULE_basura = 7, 
		RULE_json = 8, RULE_kw_json = 9, RULE_svg = 10, RULE_kw_svg = 11, RULE_dot = 12, 
		RULE_kw_dot = 13, RULE_csv = 14, RULE_kw_csv = 15, RULE_parametros = 16, 
		RULE_len = 17, RULE_fontcolor = 18, RULE_fontname = 19, RULE_fontsize = 20, 
		RULE_arrowsize = 21, RULE_arrowcolor = 22, RULE_penwidth = 23, RULE_fillcolor = 24, 
		RULE_style = 25, RULE_shape = 26, RULE_color = 27, RULE_arrowhead = 28, 
		RULE_dir = 29, RULE_len_name = 30, RULE_fontcolor_name = 31, RULE_color_name = 32, 
		RULE_fontname_name = 33, RULE_fontsize_name = 34, RULE_arrowsize_name = 35, 
		RULE_arrowcolor_name = 36, RULE_arrowhead_name = 37, RULE_penwidth_name = 38, 
		RULE_fillcolor_name = 39, RULE_style_name = 40, RULE_shape_name = 41, 
		RULE_dir_name = 42, RULE_kw_edge = 43, RULE_kw_node = 44, RULE_kw_relationship = 45, 
		RULE_kw_class = 46, RULE_kw_property = 47, RULE_kw_inheritance = 48, RULE_kw_inderect_use = 49, 
		RULE_kw_len = 50, RULE_kw_fontcolor = 51, RULE_kw_color = 52, RULE_kw_fontname = 53, 
		RULE_kw_fontsize = 54, RULE_kw_arrowsize = 55, RULE_kw_arrowhead = 56, 
		RULE_kw_arrowcolor = 57, RULE_kw_penwidth = 58, RULE_kw_fillcolor = 59, 
		RULE_kw_style = 60, RULE_kw_shape = 61, RULE_kw_dir = 62;
	public static final String[] ruleNames = {
		"init", "tipo_archivo", "textojson", "textosvg", "textodot", "textocsv", 
		"textoparam", "basura", "json", "kw_json", "svg", "kw_svg", "dot", "kw_dot", 
		"csv", "kw_csv", "parametros", "len", "fontcolor", "fontname", "fontsize", 
		"arrowsize", "arrowcolor", "penwidth", "fillcolor", "style", "shape", 
		"color", "arrowhead", "dir", "len_name", "fontcolor_name", "color_name", 
		"fontname_name", "fontsize_name", "arrowsize_name", "arrowcolor_name", 
		"arrowhead_name", "penwidth_name", "fillcolor_name", "style_name", "shape_name", 
		"dir_name", "kw_edge", "kw_node", "kw_relationship", "kw_class", "kw_property", 
		"kw_inheritance", "kw_inderect_use", "kw_len", "kw_fontcolor", "kw_color", 
		"kw_fontname", "kw_fontsize", "kw_arrowsize", "kw_arrowhead", "kw_arrowcolor", 
		"kw_penwidth", "kw_fillcolor", "kw_style", "kw_shape", "kw_dir"
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
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_JSON:
				case KW_DOT:
				case KW_SVG:
				case KW_CSV:
					{
					setState(126);
					tipo_archivo();
					}
					break;
				case LEN:
				case FONTCOLOR:
				case FONTNAME:
				case FONTSIZE:
				case ARROWSIZE:
				case ARROWHEAD:
				case ARROWCOLOR:
				case PENWIDTH:
				case FILLCOLOR:
				case STYLE:
				case SHAPE:
				case COLOR:
				case DIR:
					{
					setState(127);
					parametros();
					}
					break;
				case SPACE:
				case TEXTO:
					{
					setState(128);
					basura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << KW_JSON) | (1L << KW_DOT) | (1L << KW_SVG) | (1L << KW_CSV) | (1L << LEN) | (1L << FONTCOLOR) | (1L << FONTNAME) | (1L << FONTSIZE) | (1L << ARROWSIZE) | (1L << ARROWHEAD) | (1L << ARROWCOLOR) | (1L << PENWIDTH) | (1L << FILLCOLOR) | (1L << STYLE) | (1L << SHAPE) | (1L << COLOR) | (1L << DIR) | (1L << TEXTO))) != 0) );
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_JSON:
				{
				setState(133);
				json();
				}
				break;
			case KW_SVG:
				{
				setState(134);
				svg();
				}
				break;
			case KW_DOT:
				{
				setState(135);
				dot();
				}
				break;
			case KW_CSV:
				{
				setState(136);
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
			setState(140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(139);
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
				setState(142); 
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
			setState(145); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(144);
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
				setState(147); 
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
			setState(150); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(149);
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
				setState(152); 
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
			setState(155); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(154);
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
				setState(157); 
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
			setState(160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159);
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
				setState(162); 
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
			setState(165); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(164);
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
				setState(167); 
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
			setState(169);
			kw_json();
			setState(170);
			textojson();
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(171);
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
			setState(174);
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
			setState(176);
			kw_svg();
			setState(177);
			textosvg();
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(178);
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
			setState(181);
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
			setState(183);
			kw_dot();
			setState(184);
			textodot();
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(185);
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
			setState(188);
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
			setState(190);
			kw_csv();
			setState(191);
			textocsv();
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(192);
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
			setState(195);
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
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ArrowheadContext arrowhead() {
			return getRuleContext(ArrowheadContext.class,0);
		}
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
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
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(197);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(198);
				fontcolor();
				}
				break;
			case FONTNAME:
				{
				setState(199);
				fontname();
				}
				break;
			case FONTSIZE:
				{
				setState(200);
				fontsize();
				}
				break;
			case ARROWSIZE:
				{
				setState(201);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(202);
				arrowcolor();
				}
				break;
			case PENWIDTH:
				{
				setState(203);
				penwidth();
				}
				break;
			case FILLCOLOR:
				{
				setState(204);
				fillcolor();
				}
				break;
			case STYLE:
				{
				setState(205);
				style();
				}
				break;
			case SHAPE:
				{
				setState(206);
				shape();
				}
				break;
			case COLOR:
				{
				setState(207);
				color();
				}
				break;
			case ARROWHEAD:
				{
				setState(208);
				arrowhead();
				}
				break;
			case DIR:
				{
				setState(209);
				dir();
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
			setState(212);
			len_name();
			setState(213);
			textoparam();
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(214);
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
			setState(217);
			fontcolor_name();
			setState(218);
			textoparam();
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(219);
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
			setState(222);
			fontname_name();
			setState(223);
			textoparam();
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(224);
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
			setState(227);
			fontsize_name();
			setState(228);
			textoparam();
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(229);
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
			setState(232);
			arrowsize_name();
			setState(233);
			textoparam();
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(234);
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
			setState(237);
			arrowcolor_name();
			setState(238);
			textoparam();
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(239);
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
			setState(242);
			penwidth_name();
			setState(243);
			textoparam();
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(244);
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
			setState(247);
			fillcolor_name();
			setState(248);
			textoparam();
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(249);
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
			setState(252);
			style_name();
			setState(253);
			textoparam();
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(254);
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
			setState(257);
			shape_name();
			setState(258);
			textoparam();
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(259);
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

	public static class ColorContext extends ParserRuleContext {
		public Color_nameContext color_name() {
			return getRuleContext(Color_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			color_name();
			setState(263);
			textoparam();
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(264);
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

	public static class ArrowheadContext extends ParserRuleContext {
		public Arrowhead_nameContext arrowhead_name() {
			return getRuleContext(Arrowhead_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public ArrowheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterArrowhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitArrowhead(this);
		}
	}

	public final ArrowheadContext arrowhead() throws RecognitionException {
		ArrowheadContext _localctx = new ArrowheadContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrowhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			arrowhead_name();
			setState(268);
			textoparam();
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(269);
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

	public static class DirContext extends ParserRuleContext {
		public Dir_nameContext dir_name() {
			return getRuleContext(Dir_nameContext.class,0);
		}
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public DirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitDir(this);
		}
	}

	public final DirContext dir() throws RecognitionException {
		DirContext _localctx = new DirContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			dir_name();
			setState(273);
			textoparam();
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(274);
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
		enterRule(_localctx, 60, RULE_len_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			kw_len();
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
		enterRule(_localctx, 62, RULE_fontcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			kw_fontcolor();
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

	public static class Color_nameContext extends ParserRuleContext {
		public Kw_colorContext kw_color() {
			return getRuleContext(Kw_colorContext.class,0);
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
		public Color_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterColor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitColor_name(this);
		}
	}

	public final Color_nameContext color_name() throws RecognitionException {
		Color_nameContext _localctx = new Color_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_color_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			kw_color();
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
		enterRule(_localctx, 66, RULE_fontname_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			kw_fontname();
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
		enterRule(_localctx, 68, RULE_fontsize_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			kw_fontsize();
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
		enterRule(_localctx, 70, RULE_arrowsize_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			kw_arrowsize();
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
		enterRule(_localctx, 72, RULE_arrowcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			kw_arrowcolor();
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

	public static class Arrowhead_nameContext extends ParserRuleContext {
		public Kw_arrowheadContext kw_arrowhead() {
			return getRuleContext(Kw_arrowheadContext.class,0);
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
		public Arrowhead_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowhead_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterArrowhead_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitArrowhead_name(this);
		}
	}

	public final Arrowhead_nameContext arrowhead_name() throws RecognitionException {
		Arrowhead_nameContext _localctx = new Arrowhead_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrowhead_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			kw_arrowhead();
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(358);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(359);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(362);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(363);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(364);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(365);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(366);
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
		enterRule(_localctx, 76, RULE_penwidth_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			kw_penwidth();
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(370);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(371);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(374);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(375);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(376);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(377);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(378);
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
		enterRule(_localctx, 78, RULE_fillcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			kw_fillcolor();
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(382);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(383);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(386);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(387);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(388);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(389);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(390);
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
		enterRule(_localctx, 80, RULE_style_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			kw_style();
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(394);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(395);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(398);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(399);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(400);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(401);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(402);
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
		enterRule(_localctx, 82, RULE_shape_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			kw_shape();
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(406);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(407);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(410);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(411);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(412);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(413);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(414);
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

	public static class Dir_nameContext extends ParserRuleContext {
		public Kw_dirContext kw_dir() {
			return getRuleContext(Kw_dirContext.class,0);
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
		public Dir_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterDir_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitDir_name(this);
		}
	}

	public final Dir_nameContext dir_name() throws RecognitionException {
		Dir_nameContext _localctx = new Dir_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dir_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			kw_dir();
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(418);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(419);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(422);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(423);
				kw_class();
				}
				break;
			case PROPERTY:
				{
				setState(424);
				kw_property();
				}
				break;
			case INHERITANCE:
				{
				setState(425);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(426);
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
		enterRule(_localctx, 86, RULE_kw_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		enterRule(_localctx, 88, RULE_kw_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		enterRule(_localctx, 90, RULE_kw_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 92, RULE_kw_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 94, RULE_kw_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		enterRule(_localctx, 96, RULE_kw_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 98, RULE_kw_inderect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		enterRule(_localctx, 100, RULE_kw_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		enterRule(_localctx, 102, RULE_kw_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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

	public static class Kw_colorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(EntradaParser.COLOR, 0); }
		public Kw_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_color(this);
		}
	}

	public final Kw_colorContext kw_color() throws RecognitionException {
		Kw_colorContext _localctx = new Kw_colorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_kw_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(COLOR);
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
		enterRule(_localctx, 106, RULE_kw_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
		enterRule(_localctx, 108, RULE_kw_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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
		enterRule(_localctx, 110, RULE_kw_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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

	public static class Kw_arrowheadContext extends ParserRuleContext {
		public TerminalNode ARROWHEAD() { return getToken(EntradaParser.ARROWHEAD, 0); }
		public Kw_arrowheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_arrowhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_arrowhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_arrowhead(this);
		}
	}

	public final Kw_arrowheadContext kw_arrowhead() throws RecognitionException {
		Kw_arrowheadContext _localctx = new Kw_arrowheadContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_kw_arrowhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(ARROWHEAD);
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
		enterRule(_localctx, 114, RULE_kw_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
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
		enterRule(_localctx, 116, RULE_kw_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		enterRule(_localctx, 118, RULE_kw_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
		enterRule(_localctx, 120, RULE_kw_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
		enterRule(_localctx, 122, RULE_kw_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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

	public static class Kw_dirContext extends ParserRuleContext {
		public TerminalNode DIR() { return getToken(EntradaParser.DIR, 0); }
		public Kw_dirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterKw_dir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitKw_dir(this);
		}
	}

	public final Kw_dirContext kw_dir() throws RecognitionException {
		Kw_dirContext _localctx = new Kw_dirContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_kw_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(DIR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u01d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\6\2\u0084\n\2\r\2\16\2\u0085\3\3\3\3\3"+
		"\3\3\3\5\3\u008c\n\3\3\4\6\4\u008f\n\4\r\4\16\4\u0090\3\5\6\5\u0094\n"+
		"\5\r\5\16\5\u0095\3\6\6\6\u0099\n\6\r\6\16\6\u009a\3\7\6\7\u009e\n\7\r"+
		"\7\16\7\u009f\3\b\6\b\u00a3\n\b\r\b\16\b\u00a4\3\t\6\t\u00a8\n\t\r\t\16"+
		"\t\u00a9\3\n\3\n\3\n\5\n\u00af\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u00b6\n\f"+
		"\3\r\3\r\3\16\3\16\3\16\5\16\u00bd\n\16\3\17\3\17\3\20\3\20\3\20\5\20"+
		"\u00c4\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00d5\n\22\3\23\3\23\3\23\5\23\u00da\n\23\3\24\3"+
		"\24\3\24\5\24\u00df\n\24\3\25\3\25\3\25\5\25\u00e4\n\25\3\26\3\26\3\26"+
		"\5\26\u00e9\n\26\3\27\3\27\3\27\5\27\u00ee\n\27\3\30\3\30\3\30\5\30\u00f3"+
		"\n\30\3\31\3\31\3\31\5\31\u00f8\n\31\3\32\3\32\3\32\5\32\u00fd\n\32\3"+
		"\33\3\33\3\33\5\33\u0102\n\33\3\34\3\34\3\34\5\34\u0107\n\34\3\35\3\35"+
		"\3\35\5\35\u010c\n\35\3\36\3\36\3\36\5\36\u0111\n\36\3\37\3\37\3\37\5"+
		"\37\u0116\n\37\3 \3 \3 \3 \3 \3 \5 \u011e\n \3!\3!\3!\5!\u0123\n!\3!\3"+
		"!\3!\3!\3!\5!\u012a\n!\3\"\3\"\3\"\5\"\u012f\n\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u0136\n\"\3#\3#\3#\5#\u013b\n#\3#\3#\3#\3#\3#\5#\u0142\n#\3$\3$\3$"+
		"\5$\u0147\n$\3$\3$\3$\3$\3$\5$\u014e\n$\3%\3%\3%\5%\u0153\n%\3%\3%\3%"+
		"\3%\3%\5%\u015a\n%\3&\3&\3&\5&\u015f\n&\3&\3&\3&\3&\3&\5&\u0166\n&\3\'"+
		"\3\'\3\'\5\'\u016b\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u0172\n\'\3(\3(\3(\5(\u0177"+
		"\n(\3(\3(\3(\3(\3(\5(\u017e\n(\3)\3)\3)\5)\u0183\n)\3)\3)\3)\3)\3)\5)"+
		"\u018a\n)\3*\3*\3*\5*\u018f\n*\3*\3*\3*\3*\3*\5*\u0196\n*\3+\3+\3+\5+"+
		"\u019b\n+\3+\3+\3+\3+\3+\5+\u01a2\n+\3,\3,\3,\5,\u01a7\n,\3,\3,\3,\3,"+
		"\3,\5,\u01ae\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\2\2A\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\4\3"+
		"\2\34\35\4\2\3\3\34\34\2\u0201\2\u0083\3\2\2\2\4\u008b\3\2\2\2\6\u008e"+
		"\3\2\2\2\b\u0093\3\2\2\2\n\u0098\3\2\2\2\f\u009d\3\2\2\2\16\u00a2\3\2"+
		"\2\2\20\u00a7\3\2\2\2\22\u00ab\3\2\2\2\24\u00b0\3\2\2\2\26\u00b2\3\2\2"+
		"\2\30\u00b7\3\2\2\2\32\u00b9\3\2\2\2\34\u00be\3\2\2\2\36\u00c0\3\2\2\2"+
		" \u00c5\3\2\2\2\"\u00d4\3\2\2\2$\u00d6\3\2\2\2&\u00db\3\2\2\2(\u00e0\3"+
		"\2\2\2*\u00e5\3\2\2\2,\u00ea\3\2\2\2.\u00ef\3\2\2\2\60\u00f4\3\2\2\2\62"+
		"\u00f9\3\2\2\2\64\u00fe\3\2\2\2\66\u0103\3\2\2\28\u0108\3\2\2\2:\u010d"+
		"\3\2\2\2<\u0112\3\2\2\2>\u0117\3\2\2\2@\u011f\3\2\2\2B\u012b\3\2\2\2D"+
		"\u0137\3\2\2\2F\u0143\3\2\2\2H\u014f\3\2\2\2J\u015b\3\2\2\2L\u0167\3\2"+
		"\2\2N\u0173\3\2\2\2P\u017f\3\2\2\2R\u018b\3\2\2\2T\u0197\3\2\2\2V\u01a3"+
		"\3\2\2\2X\u01af\3\2\2\2Z\u01b1\3\2\2\2\\\u01b3\3\2\2\2^\u01b5\3\2\2\2"+
		"`\u01b7\3\2\2\2b\u01b9\3\2\2\2d\u01bb\3\2\2\2f\u01bd\3\2\2\2h\u01bf\3"+
		"\2\2\2j\u01c1\3\2\2\2l\u01c3\3\2\2\2n\u01c5\3\2\2\2p\u01c7\3\2\2\2r\u01c9"+
		"\3\2\2\2t\u01cb\3\2\2\2v\u01cd\3\2\2\2x\u01cf\3\2\2\2z\u01d1\3\2\2\2|"+
		"\u01d3\3\2\2\2~\u01d5\3\2\2\2\u0080\u0084\5\4\3\2\u0081\u0084\5\"\22\2"+
		"\u0082\u0084\5\20\t\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\3\3\2\2\2\u0087\u008c\5\22\n\2\u0088\u008c\5\26\f\2\u0089\u008c\5\32"+
		"\16\2\u008a\u008c\5\36\20\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\5\3\2\2\2\u008d\u008f\t\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\7\3\2\2\2\u0092\u0094\t\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\t\3\2\2\2"+
		"\u0097\u0099\t\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\13\3\2\2\2\u009c\u009e\t\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\r\3\2\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\17\3\2\2\2\u00a6"+
		"\u00a8\t\3\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\5\24\13\2\u00ac"+
		"\u00ae\5\6\4\2\u00ad\u00af\7\3\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\23\3\2\2\2\u00b0\u00b1\7\4\2\2\u00b1\25\3\2\2\2\u00b2\u00b3"+
		"\5\30\r\2\u00b3\u00b5\5\b\5\2\u00b4\u00b6\7\3\2\2\u00b5\u00b4\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\7\6\2\2\u00b8\31\3\2"+
		"\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bc\5\n\6\2\u00bb\u00bd\7\3\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7\5\2"+
		"\2\u00bf\35\3\2\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c3\5\f\7\2\u00c2\u00c4"+
		"\7\3\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\37\3\2\2\2\u00c5"+
		"\u00c6\7\7\2\2\u00c6!\3\2\2\2\u00c7\u00d5\5$\23\2\u00c8\u00d5\5&\24\2"+
		"\u00c9\u00d5\5(\25\2\u00ca\u00d5\5*\26\2\u00cb\u00d5\5,\27\2\u00cc\u00d5"+
		"\5.\30\2\u00cd\u00d5\5\60\31\2\u00ce\u00d5\5\62\32\2\u00cf\u00d5\5\64"+
		"\33\2\u00d0\u00d5\5\66\34\2\u00d1\u00d5\58\35\2\u00d2\u00d5\5:\36\2\u00d3"+
		"\u00d5\5<\37\2\u00d4\u00c7\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00c9\3\2"+
		"\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4"+
		"\u00cd\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2"+
		"\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"#\3\2\2\2\u00d6\u00d7\5> \2\u00d7\u00d9\5\16\b\2\u00d8\u00da\7\3\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da%\3\2\2\2\u00db\u00dc\5@!\2\u00dc"+
		"\u00de\5\16\b\2\u00dd\u00df\7\3\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\'\3\2\2\2\u00e0\u00e1\5D#\2\u00e1\u00e3\5\16\b\2\u00e2\u00e4"+
		"\7\3\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4)\3\2\2\2\u00e5"+
		"\u00e6\5F$\2\u00e6\u00e8\5\16\b\2\u00e7\u00e9\7\3\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9+\3\2\2\2\u00ea\u00eb\5H%\2\u00eb\u00ed"+
		"\5\16\b\2\u00ec\u00ee\7\3\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2"+
		"\u00ee-\3\2\2\2\u00ef\u00f0\5J&\2\u00f0\u00f2\5\16\b\2\u00f1\u00f3\7\3"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3/\3\2\2\2\u00f4\u00f5"+
		"\5N(\2\u00f5\u00f7\5\16\b\2\u00f6\u00f8\7\3\2\2\u00f7\u00f6\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\61\3\2\2\2\u00f9\u00fa\5P)\2\u00fa\u00fc\5\16\b\2"+
		"\u00fb\u00fd\7\3\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\63"+
		"\3\2\2\2\u00fe\u00ff\5R*\2\u00ff\u0101\5\16\b\2\u0100\u0102\7\3\2\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\65\3\2\2\2\u0103\u0104\5T+\2"+
		"\u0104\u0106\5\16\b\2\u0105\u0107\7\3\2\2\u0106\u0105\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\67\3\2\2\2\u0108\u0109\5B\"\2\u0109\u010b\5\16\b\2\u010a"+
		"\u010c\7\3\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c9\3\2\2\2"+
		"\u010d\u010e\5L\'\2\u010e\u0110\5\16\b\2\u010f\u0111\7\3\2\2\u0110\u010f"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111;\3\2\2\2\u0112\u0113\5V,\2\u0113\u0115"+
		"\5\16\b\2\u0114\u0116\7\3\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2"+
		"\u0116=\3\2\2\2\u0117\u011d\5f\64\2\u0118\u011e\5\\/\2\u0119\u011e\5^"+
		"\60\2\u011a\u011e\5`\61\2\u011b\u011e\5b\62\2\u011c\u011e\5d\63\2\u011d"+
		"\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011c\3\2\2\2\u011e?\3\2\2\2\u011f\u0122\5h\65\2\u0120\u0123"+
		"\5X-\2\u0121\u0123\5Z.\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0129\3\2\2\2\u0124\u012a\5\\/\2\u0125\u012a\5^\60\2\u0126\u012a\5`\61"+
		"\2\u0127\u012a\5b\62\2\u0128\u012a\5d\63\2\u0129\u0124\3\2\2\2\u0129\u0125"+
		"\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"A\3\2\2\2\u012b\u012e\5j\66\2\u012c\u012f\5X-\2\u012d\u012f\5Z.\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0135\3\2\2\2\u0130\u0136\5\\"+
		"/\2\u0131\u0136\5^\60\2\u0132\u0136\5`\61\2\u0133\u0136\5b\62\2\u0134"+
		"\u0136\5d\63\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136C\3\2\2\2\u0137\u013a"+
		"\5l\67\2\u0138\u013b\5X-\2\u0139\u013b\5Z.\2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u0141\3\2\2\2\u013c\u0142\5\\/\2\u013d\u0142\5^\60"+
		"\2\u013e\u0142\5`\61\2\u013f\u0142\5b\62\2\u0140\u0142\5d\63\2\u0141\u013c"+
		"\3\2\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142E\3\2\2\2\u0143\u0146\5n8\2\u0144\u0147\5X-\2\u0145"+
		"\u0147\5Z.\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u014d\3\2\2"+
		"\2\u0148\u014e\5\\/\2\u0149\u014e\5^\60\2\u014a\u014e\5`\61\2\u014b\u014e"+
		"\5b\62\2\u014c\u014e\5d\63\2\u014d\u0148\3\2\2\2\u014d\u0149\3\2\2\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014eG\3\2\2\2"+
		"\u014f\u0152\5p9\2\u0150\u0153\5X-\2\u0151\u0153\5Z.\2\u0152\u0150\3\2"+
		"\2\2\u0152\u0151\3\2\2\2\u0153\u0159\3\2\2\2\u0154\u015a\5\\/\2\u0155"+
		"\u015a\5^\60\2\u0156\u015a\5`\61\2\u0157\u015a\5b\62\2\u0158\u015a\5d"+
		"\63\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015aI\3\2\2\2\u015b\u015e\5t;\2\u015c"+
		"\u015f\5X-\2\u015d\u015f\5Z.\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2"+
		"\u015f\u0165\3\2\2\2\u0160\u0166\5\\/\2\u0161\u0166\5^\60\2\u0162\u0166"+
		"\5`\61\2\u0163\u0166\5b\62\2\u0164\u0166\5d\63\2\u0165\u0160\3\2\2\2\u0165"+
		"\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2"+
		"\2\2\u0166K\3\2\2\2\u0167\u016a\5r:\2\u0168\u016b\5X-\2\u0169\u016b\5"+
		"Z.\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u0171\3\2\2\2\u016c"+
		"\u0172\5\\/\2\u016d\u0172\5^\60\2\u016e\u0172\5`\61\2\u016f\u0172\5b\62"+
		"\2\u0170\u0172\5d\63\2\u0171\u016c\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016e"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172M\3\2\2\2\u0173"+
		"\u0176\5v<\2\u0174\u0177\5X-\2\u0175\u0177\5Z.\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\u017d\3\2\2\2\u0178\u017e\5\\/\2\u0179\u017e\5^\60"+
		"\2\u017a\u017e\5`\61\2\u017b\u017e\5b\62\2\u017c\u017e\5d\63\2\u017d\u0178"+
		"\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017c\3\2\2\2\u017eO\3\2\2\2\u017f\u0182\5x=\2\u0180\u0183\5X-\2\u0181"+
		"\u0183\5Z.\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0189\3\2\2"+
		"\2\u0184\u018a\5\\/\2\u0185\u018a\5^\60\2\u0186\u018a\5`\61\2\u0187\u018a"+
		"\5b\62\2\u0188\u018a\5d\63\2\u0189\u0184\3\2\2\2\u0189\u0185\3\2\2\2\u0189"+
		"\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018aQ\3\2\2\2"+
		"\u018b\u018e\5z>\2\u018c\u018f\5X-\2\u018d\u018f\5Z.\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018d\3\2\2\2\u018f\u0195\3\2\2\2\u0190\u0196\5\\/\2\u0191"+
		"\u0196\5^\60\2\u0192\u0196\5`\61\2\u0193\u0196\5b\62\2\u0194\u0196\5d"+
		"\63\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0195\u0192\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196S\3\2\2\2\u0197\u019a\5|?\2\u0198"+
		"\u019b\5X-\2\u0199\u019b\5Z.\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2"+
		"\u019b\u01a1\3\2\2\2\u019c\u01a2\5\\/\2\u019d\u01a2\5^\60\2\u019e\u01a2"+
		"\5`\61\2\u019f\u01a2\5b\62\2\u01a0\u01a2\5d\63\2\u01a1\u019c\3\2\2\2\u01a1"+
		"\u019d\3\2\2\2\u01a1\u019e\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a2U\3\2\2\2\u01a3\u01a6\5~@\2\u01a4\u01a7\5X-\2\u01a5\u01a7\5"+
		"Z.\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01ad\3\2\2\2\u01a8"+
		"\u01ae\5\\/\2\u01a9\u01ae\5^\60\2\u01aa\u01ae\5`\61\2\u01ab\u01ae\5b\62"+
		"\2\u01ac\u01ae\5d\63\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa"+
		"\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aeW\3\2\2\2\u01af"+
		"\u01b0\7\24\2\2\u01b0Y\3\2\2\2\u01b1\u01b2\7\25\2\2\u01b2[\3\2\2\2\u01b3"+
		"\u01b4\7\27\2\2\u01b4]\3\2\2\2\u01b5\u01b6\7\30\2\2\u01b6_\3\2\2\2\u01b7"+
		"\u01b8\7\31\2\2\u01b8a\3\2\2\2\u01b9\u01ba\7\32\2\2\u01bac\3\2\2\2\u01bb"+
		"\u01bc\7\33\2\2\u01bce\3\2\2\2\u01bd\u01be\7\b\2\2\u01beg\3\2\2\2\u01bf"+
		"\u01c0\7\t\2\2\u01c0i\3\2\2\2\u01c1\u01c2\7\23\2\2\u01c2k\3\2\2\2\u01c3"+
		"\u01c4\7\n\2\2\u01c4m\3\2\2\2\u01c5\u01c6\7\13\2\2\u01c6o\3\2\2\2\u01c7"+
		"\u01c8\7\f\2\2\u01c8q\3\2\2\2\u01c9\u01ca\7\r\2\2\u01cas\3\2\2\2\u01cb"+
		"\u01cc\7\16\2\2\u01ccu\3\2\2\2\u01cd\u01ce\7\17\2\2\u01cew\3\2\2\2\u01cf"+
		"\u01d0\7\20\2\2\u01d0y\3\2\2\2\u01d1\u01d2\7\21\2\2\u01d2{\3\2\2\2\u01d3"+
		"\u01d4\7\22\2\2\u01d4}\3\2\2\2\u01d5\u01d6\7\26\2\2\u01d6\177\3\2\2\2"+
		"\66\u0083\u0085\u008b\u0090\u0095\u009a\u009f\u00a4\u00a9\u00ae\u00b5"+
		"\u00bc\u00c3\u00d4\u00d9\u00de\u00e3\u00e8\u00ed\u00f2\u00f7\u00fc\u0101"+
		"\u0106\u010b\u0110\u0115\u011d\u0122\u0129\u012e\u0135\u013a\u0141\u0146"+
		"\u014d\u0152\u0159\u015e\u0165\u016a\u0171\u0176\u017d\u0182\u0189\u018e"+
		"\u0195\u019a\u01a1\u01a6\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}