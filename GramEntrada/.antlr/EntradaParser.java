// Generated from c:\antlr\Lenguajes\GramEntrada\EntradaParser.g4 by ANTLR 4.7.1
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
		INHERITANCE=22, INDERECT_USE=23, BARRABAJA=24, GUION=25, TEXTO=26, CADENA=27;
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
				case ASIG:
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
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextojsonContext textojson() {
			return getRuleContext(TextojsonContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
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
			match(ASIG);
			setState(153);
			textojson();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(154);
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
	}

	public final Kw_jsonContext kw_json() throws RecognitionException {
		Kw_jsonContext _localctx = new Kw_jsonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_kw_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		public TextosvgContext textosvg() {
			return getRuleContext(TextosvgContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public SvgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svg; }
	}

	public final SvgContext svg() throws RecognitionException {
		SvgContext _localctx = new SvgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			kw_svg();
			setState(160);
			match(ASIG);
			setState(161);
			textosvg();
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(162);
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
	}

	public final Kw_svgContext kw_svg() throws RecognitionException {
		Kw_svgContext _localctx = new Kw_svgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_kw_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		public TextodotContext textodot() {
			return getRuleContext(TextodotContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			kw_dot();
			setState(168);
			match(ASIG);
			setState(169);
			textodot();
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(170);
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
	}

	public final Kw_dotContext kw_dot() throws RecognitionException {
		Kw_dotContext _localctx = new Kw_dotContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_kw_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		public TextocsvContext textocsv() {
			return getRuleContext(TextocsvContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public CsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csv; }
	}

	public final CsvContext csv() throws RecognitionException {
		CsvContext _localctx = new CsvContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			kw_csv();
			setState(176);
			match(ASIG);
			setState(177);
			textocsv();
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
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

	public static class Kw_csvContext extends ParserRuleContext {
		public TerminalNode KW_CSV() { return getToken(EntradaParser.KW_CSV, 0); }
		public Kw_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_csv; }
	}

	public final Kw_csvContext kw_csv() throws RecognitionException {
		Kw_csvContext _localctx = new Kw_csvContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_kw_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(183);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(184);
				fontcolor();
				}
				break;
			case FONTNAME:
				{
				setState(185);
				fontname();
				}
				break;
			case FONTSIZE:
				{
				setState(186);
				fontsize();
				}
				break;
			case ARROWSIZE:
				{
				setState(187);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(188);
				arrowcolor();
				}
				break;
			case PENWIDTH:
				{
				setState(189);
				penwidth();
				}
				break;
			case FILLCOLOR:
				{
				setState(190);
				fillcolor();
				}
				break;
			case STYLE:
				{
				setState(191);
				style();
				}
				break;
			case SHAPE:
				{
				setState(192);
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
		public Len_nameContext len_name() {
			return getRuleContext(Len_nameContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			kw_len();
			setState(196);
			len_name();
			setState(197);
			match(ASIG);
			setState(198);
			textoparam();
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(199);
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
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public FontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontcolor; }
	}

	public final FontcolorContext fontcolor() throws RecognitionException {
		FontcolorContext _localctx = new FontcolorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			fontcolor_name();
			setState(203);
			match(ASIG);
			setState(204);
			textoparam();
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(205);
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
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public FontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontname; }
	}

	public final FontnameContext fontname() throws RecognitionException {
		FontnameContext _localctx = new FontnameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			fontname_name();
			setState(209);
			match(ASIG);
			setState(210);
			textoparam();
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(211);
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
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public FontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize; }
	}

	public final FontsizeContext fontsize() throws RecognitionException {
		FontsizeContext _localctx = new FontsizeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			fontsize_name();
			setState(215);
			match(ASIG);
			setState(216);
			textoparam();
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(217);
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
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public ArrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowsize; }
	}

	public final ArrowsizeContext arrowsize() throws RecognitionException {
		ArrowsizeContext _localctx = new ArrowsizeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			arrowsize_name();
			setState(221);
			match(ASIG);
			setState(222);
			textoparam();
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
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

	public static class ArrowcolorContext extends ParserRuleContext {
		public Arrowcolor_nameContext arrowcolor_name() {
			return getRuleContext(Arrowcolor_nameContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public ArrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowcolor; }
	}

	public final ArrowcolorContext arrowcolor() throws RecognitionException {
		ArrowcolorContext _localctx = new ArrowcolorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			arrowcolor_name();
			setState(227);
			match(ASIG);
			setState(228);
			textoparam();
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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

	public static class PenwidthContext extends ParserRuleContext {
		public Penwidth_nameContext penwidth_name() {
			return getRuleContext(Penwidth_nameContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public PenwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penwidth; }
	}

	public final PenwidthContext penwidth() throws RecognitionException {
		PenwidthContext _localctx = new PenwidthContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			penwidth_name();
			setState(233);
			match(ASIG);
			setState(234);
			textoparam();
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(235);
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
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public FillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillcolor; }
	}

	public final FillcolorContext fillcolor() throws RecognitionException {
		FillcolorContext _localctx = new FillcolorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			fillcolor_name();
			setState(239);
			match(ASIG);
			setState(240);
			textoparam();
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(241);
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
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			style_name();
			setState(245);
			match(ASIG);
			setState(246);
			textoparam();
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(247);
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
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public TextoparamContext textoparam() {
			return getRuleContext(TextoparamContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EntradaParser.SPACE, 0); }
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			shape_name();
			setState(251);
			match(ASIG);
			setState(252);
			textoparam();
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(253);
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
		public Len_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len_name; }
	}

	public final Len_nameContext len_name() throws RecognitionException {
		Len_nameContext _localctx = new Len_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_len_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(256);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(257);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(258);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(259);
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
	}

	public final Fontcolor_nameContext fontcolor_name() throws RecognitionException {
		Fontcolor_nameContext _localctx = new Fontcolor_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fontcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			kw_fontcolor();
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(263);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(264);
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
				setState(267);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(268);
				kw_class();
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
	}

	public final Fontname_nameContext fontname_name() throws RecognitionException {
		Fontname_nameContext _localctx = new Fontname_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fontname_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			kw_fontname();
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
			setState(282);
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
			case INHERITANCE:
				{
				setState(280);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(281);
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
	}

	public final Fontsize_nameContext fontsize_name() throws RecognitionException {
		Fontsize_nameContext _localctx = new Fontsize_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fontsize_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			kw_fontsize();
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(285);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(286);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(289);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(290);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(291);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(292);
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
	}

	public final Arrowsize_nameContext arrowsize_name() throws RecognitionException {
		Arrowsize_nameContext _localctx = new Arrowsize_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrowsize_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			kw_arrowsize();
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(296);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(297);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(300);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(301);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(302);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(303);
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
	}

	public final Arrowcolor_nameContext arrowcolor_name() throws RecognitionException {
		Arrowcolor_nameContext _localctx = new Arrowcolor_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrowcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			kw_arrowcolor();
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(307);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(308);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(311);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(312);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(313);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(314);
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
	}

	public final Penwidth_nameContext penwidth_name() throws RecognitionException {
		Penwidth_nameContext _localctx = new Penwidth_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_penwidth_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			kw_penwidth();
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(318);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(319);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(322);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(323);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(324);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(325);
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
	}

	public final Fillcolor_nameContext fillcolor_name() throws RecognitionException {
		Fillcolor_nameContext _localctx = new Fillcolor_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fillcolor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			kw_fillcolor();
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(329);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(330);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(333);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(334);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(335);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(336);
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
	}

	public final Style_nameContext style_name() throws RecognitionException {
		Style_nameContext _localctx = new Style_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_style_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			kw_style();
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(340);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(341);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(344);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(345);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(346);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(347);
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
	}

	public final Shape_nameContext shape_name() throws RecognitionException {
		Shape_nameContext _localctx = new Shape_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_shape_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			kw_shape();
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(351);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(352);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(355);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(356);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(357);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(358);
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
	}

	public final Kw_edgeContext kw_edge() throws RecognitionException {
		Kw_edgeContext _localctx = new Kw_edgeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_kw_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
	}

	public final Kw_nodeContext kw_node() throws RecognitionException {
		Kw_nodeContext _localctx = new Kw_nodeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kw_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
	}

	public final Kw_relationshipContext kw_relationship() throws RecognitionException {
		Kw_relationshipContext _localctx = new Kw_relationshipContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kw_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
	}

	public final Kw_classContext kw_class() throws RecognitionException {
		Kw_classContext _localctx = new Kw_classContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_kw_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
	}

	public final Kw_propertyContext kw_property() throws RecognitionException {
		Kw_propertyContext _localctx = new Kw_propertyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_kw_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
	}

	public final Kw_inheritanceContext kw_inheritance() throws RecognitionException {
		Kw_inheritanceContext _localctx = new Kw_inheritanceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_kw_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
	}

	public final Kw_inderect_useContext kw_inderect_use() throws RecognitionException {
		Kw_inderect_useContext _localctx = new Kw_inderect_useContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_kw_inderect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
	}

	public final Kw_lenContext kw_len() throws RecognitionException {
		Kw_lenContext _localctx = new Kw_lenContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_kw_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
	}

	public final Kw_fontcolorContext kw_fontcolor() throws RecognitionException {
		Kw_fontcolorContext _localctx = new Kw_fontcolorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_kw_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
	}

	public final Kw_fontnameContext kw_fontname() throws RecognitionException {
		Kw_fontnameContext _localctx = new Kw_fontnameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_kw_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
	}

	public final Kw_fontsizeContext kw_fontsize() throws RecognitionException {
		Kw_fontsizeContext _localctx = new Kw_fontsizeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_kw_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
	}

	public final Kw_arrowsizeContext kw_arrowsize() throws RecognitionException {
		Kw_arrowsizeContext _localctx = new Kw_arrowsizeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_kw_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
	}

	public final Kw_arrowcolorContext kw_arrowcolor() throws RecognitionException {
		Kw_arrowcolorContext _localctx = new Kw_arrowcolorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_kw_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
	}

	public final Kw_penwidthContext kw_penwidth() throws RecognitionException {
		Kw_penwidthContext _localctx = new Kw_penwidthContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_kw_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
	}

	public final Kw_fillcolorContext kw_fillcolor() throws RecognitionException {
		Kw_fillcolorContext _localctx = new Kw_fillcolorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_kw_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
	}

	public final Kw_styleContext kw_style() throws RecognitionException {
		Kw_styleContext _localctx = new Kw_styleContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_kw_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
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
	}

	public final Kw_shapeContext kw_shape() throws RecognitionException {
		Kw_shapeContext _localctx = new Kw_shapeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_kw_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u018e\4\2\t\2"+
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
		"\3\n\3\n\3\n\5\n\u009e\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\5\16\u00ae\n\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\5\20\u00b6\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00c4\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00cb\n\23\3\24\3"+
		"\24\3\24\3\24\5\24\u00d1\n\24\3\25\3\25\3\25\3\25\5\25\u00d7\n\25\3\26"+
		"\3\26\3\26\3\26\5\26\u00dd\n\26\3\27\3\27\3\27\3\27\5\27\u00e3\n\27\3"+
		"\30\3\30\3\30\3\30\5\30\u00e9\n\30\3\31\3\31\3\31\3\31\5\31\u00ef\n\31"+
		"\3\32\3\32\3\32\3\32\5\32\u00f5\n\32\3\33\3\33\3\33\3\33\5\33\u00fb\n"+
		"\33\3\34\3\34\3\34\3\34\5\34\u0101\n\34\3\35\3\35\3\35\3\35\5\35\u0107"+
		"\n\35\3\36\3\36\3\36\5\36\u010c\n\36\3\36\3\36\3\36\3\36\5\36\u0112\n"+
		"\36\3\37\3\37\3\37\5\37\u0117\n\37\3\37\3\37\3\37\3\37\5\37\u011d\n\37"+
		"\3 \3 \3 \5 \u0122\n \3 \3 \3 \3 \5 \u0128\n \3!\3!\3!\5!\u012d\n!\3!"+
		"\3!\3!\3!\5!\u0133\n!\3\"\3\"\3\"\5\"\u0138\n\"\3\"\3\"\3\"\3\"\5\"\u013e"+
		"\n\"\3#\3#\3#\5#\u0143\n#\3#\3#\3#\3#\5#\u0149\n#\3$\3$\3$\5$\u014e\n"+
		"$\3$\3$\3$\3$\5$\u0154\n$\3%\3%\3%\5%\u0159\n%\3%\3%\3%\3%\5%\u015f\n"+
		"%\3&\3&\3&\5&\u0164\n&\3&\3&\3&\3&\5&\u016a\n&\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\2\28\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"l\2\4\3\2\34\35\4\2\3\4\34\34\2\u01a1\2q\3\2\2\2\4y\3\2\2\2\6|\3\2\2\2"+
		"\b\u0081\3\2\2\2\n\u0086\3\2\2\2\f\u008b\3\2\2\2\16\u0090\3\2\2\2\20\u0095"+
		"\3\2\2\2\22\u0099\3\2\2\2\24\u009f\3\2\2\2\26\u00a1\3\2\2\2\30\u00a7\3"+
		"\2\2\2\32\u00a9\3\2\2\2\34\u00af\3\2\2\2\36\u00b1\3\2\2\2 \u00b7\3\2\2"+
		"\2\"\u00c3\3\2\2\2$\u00c5\3\2\2\2&\u00cc\3\2\2\2(\u00d2\3\2\2\2*\u00d8"+
		"\3\2\2\2,\u00de\3\2\2\2.\u00e4\3\2\2\2\60\u00ea\3\2\2\2\62\u00f0\3\2\2"+
		"\2\64\u00f6\3\2\2\2\66\u00fc\3\2\2\28\u0106\3\2\2\2:\u0108\3\2\2\2<\u0113"+
		"\3\2\2\2>\u011e\3\2\2\2@\u0129\3\2\2\2B\u0134\3\2\2\2D\u013f\3\2\2\2F"+
		"\u014a\3\2\2\2H\u0155\3\2\2\2J\u0160\3\2\2\2L\u016b\3\2\2\2N\u016d\3\2"+
		"\2\2P\u016f\3\2\2\2R\u0171\3\2\2\2T\u0173\3\2\2\2V\u0175\3\2\2\2X\u0177"+
		"\3\2\2\2Z\u0179\3\2\2\2\\\u017b\3\2\2\2^\u017d\3\2\2\2`\u017f\3\2\2\2"+
		"b\u0181\3\2\2\2d\u0183\3\2\2\2f\u0185\3\2\2\2h\u0187\3\2\2\2j\u0189\3"+
		"\2\2\2l\u018b\3\2\2\2nr\5\4\3\2or\5\"\22\2pr\5\20\t\2qn\3\2\2\2qo\3\2"+
		"\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\3\3\2\2\2uz\5\22\n\2vz\5"+
		"\26\f\2wz\5\32\16\2xz\5\36\20\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2"+
		"\2z\5\3\2\2\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\7\3\2\2\2\u0080\u0082\t\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\t\3\2\2\2\u0085\u0087\t"+
		"\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\13\3\2\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\r"+
		"\3\2\2\2\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\17\3\2\2\2\u0094\u0096\t\3\2"+
		"\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\21\3\2\2\2\u0099\u009a\5\24\13\2\u009a\u009b\7\4\2\2\u009b"+
		"\u009d\5\6\4\2\u009c\u009e\7\3\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\23\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0\25\3\2\2\2\u00a1\u00a2"+
		"\5\30\r\2\u00a2\u00a3\7\4\2\2\u00a3\u00a5\5\b\5\2\u00a4\u00a6\7\3\2\2"+
		"\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a8"+
		"\7\7\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\7\4\2\2\u00ab"+
		"\u00ad\5\n\6\2\u00ac\u00ae\7\3\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\33\3\2\2\2\u00af\u00b0\7\6\2\2\u00b0\35\3\2\2\2\u00b1\u00b2"+
		"\5 \21\2\u00b2\u00b3\7\4\2\2\u00b3\u00b5\5\f\7\2\u00b4\u00b6\7\3\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\37\3\2\2\2\u00b7\u00b8\7\b\2"+
		"\2\u00b8!\3\2\2\2\u00b9\u00c4\5$\23\2\u00ba\u00c4\5&\24\2\u00bb\u00c4"+
		"\5(\25\2\u00bc\u00c4\5*\26\2\u00bd\u00c4\5,\27\2\u00be\u00c4\5.\30\2\u00bf"+
		"\u00c4\5\60\31\2\u00c0\u00c4\5\62\32\2\u00c1\u00c4\5\64\33\2\u00c2\u00c4"+
		"\5\66\34\2\u00c3\u00b9\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bb\3\2\2\2"+
		"\u00c3\u00bc\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf"+
		"\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"#\3\2\2\2\u00c5\u00c6\5Z.\2\u00c6\u00c7\58\35\2\u00c7\u00c8\7\4\2\2\u00c8"+
		"\u00ca\5\16\b\2\u00c9\u00cb\7\3\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00cb%\3\2\2\2\u00cc\u00cd\5:\36\2\u00cd\u00ce\7\4\2\2\u00ce\u00d0"+
		"\5\16\b\2\u00cf\u00d1\7\3\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2"+
		"\u00d1\'\3\2\2\2\u00d2\u00d3\5<\37\2\u00d3\u00d4\7\4\2\2\u00d4\u00d6\5"+
		"\16\b\2\u00d5\u00d7\7\3\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		")\3\2\2\2\u00d8\u00d9\5> \2\u00d9\u00da\7\4\2\2\u00da\u00dc\5\16\b\2\u00db"+
		"\u00dd\7\3\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd+\3\2\2\2"+
		"\u00de\u00df\5@!\2\u00df\u00e0\7\4\2\2\u00e0\u00e2\5\16\b\2\u00e1\u00e3"+
		"\7\3\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3-\3\2\2\2\u00e4"+
		"\u00e5\5B\"\2\u00e5\u00e6\7\4\2\2\u00e6\u00e8\5\16\b\2\u00e7\u00e9\7\3"+
		"\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9/\3\2\2\2\u00ea\u00eb"+
		"\5D#\2\u00eb\u00ec\7\4\2\2\u00ec\u00ee\5\16\b\2\u00ed\u00ef\7\3\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\61\3\2\2\2\u00f0\u00f1\5F$\2"+
		"\u00f1\u00f2\7\4\2\2\u00f2\u00f4\5\16\b\2\u00f3\u00f5\7\3\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\63\3\2\2\2\u00f6\u00f7\5H%\2\u00f7"+
		"\u00f8\7\4\2\2\u00f8\u00fa\5\16\b\2\u00f9\u00fb\7\3\2\2\u00fa\u00f9\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\65\3\2\2\2\u00fc\u00fd\5J&\2\u00fd\u00fe"+
		"\7\4\2\2\u00fe\u0100\5\16\b\2\u00ff\u0101\7\3\2\2\u0100\u00ff\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\67\3\2\2\2\u0102\u0107\5P)\2\u0103\u0107\5"+
		"R*\2\u0104\u0107\5V,\2\u0105\u0107\5X-\2\u0106\u0102\3\2\2\2\u0106\u0103"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u01079\3\2\2\2\u0108"+
		"\u010b\5\\/\2\u0109\u010c\5L\'\2\u010a\u010c\5N(\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u0111\3\2\2\2\u010d\u0112\5P)\2\u010e\u0112"+
		"\5R*\2\u010f\u0112\5V,\2\u0110\u0112\5X-\2\u0111\u010d\3\2\2\2\u0111\u010e"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112;\3\2\2\2\u0113"+
		"\u0116\5^\60\2\u0114\u0117\5L\'\2\u0115\u0117\5N(\2\u0116\u0114\3\2\2"+
		"\2\u0116\u0115\3\2\2\2\u0117\u011c\3\2\2\2\u0118\u011d\5P)\2\u0119\u011d"+
		"\5R*\2\u011a\u011d\5V,\2\u011b\u011d\5X-\2\u011c\u0118\3\2\2\2\u011c\u0119"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d=\3\2\2\2\u011e"+
		"\u0121\5`\61\2\u011f\u0122\5L\'\2\u0120\u0122\5N(\2\u0121\u011f\3\2\2"+
		"\2\u0121\u0120\3\2\2\2\u0122\u0127\3\2\2\2\u0123\u0128\5P)\2\u0124\u0128"+
		"\5R*\2\u0125\u0128\5V,\2\u0126\u0128\5X-\2\u0127\u0123\3\2\2\2\u0127\u0124"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128?\3\2\2\2\u0129"+
		"\u012c\5b\62\2\u012a\u012d\5L\'\2\u012b\u012d\5N(\2\u012c\u012a\3\2\2"+
		"\2\u012c\u012b\3\2\2\2\u012d\u0132\3\2\2\2\u012e\u0133\5P)\2\u012f\u0133"+
		"\5R*\2\u0130\u0133\5V,\2\u0131\u0133\5X-\2\u0132\u012e\3\2\2\2\u0132\u012f"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133A\3\2\2\2\u0134"+
		"\u0137\5d\63\2\u0135\u0138\5L\'\2\u0136\u0138\5N(\2\u0137\u0135\3\2\2"+
		"\2\u0137\u0136\3\2\2\2\u0138\u013d\3\2\2\2\u0139\u013e\5P)\2\u013a\u013e"+
		"\5R*\2\u013b\u013e\5V,\2\u013c\u013e\5X-\2\u013d\u0139\3\2\2\2\u013d\u013a"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013eC\3\2\2\2\u013f"+
		"\u0142\5f\64\2\u0140\u0143\5L\'\2\u0141\u0143\5N(\2\u0142\u0140\3\2\2"+
		"\2\u0142\u0141\3\2\2\2\u0143\u0148\3\2\2\2\u0144\u0149\5P)\2\u0145\u0149"+
		"\5R*\2\u0146\u0149\5V,\2\u0147\u0149\5X-\2\u0148\u0144\3\2\2\2\u0148\u0145"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149E\3\2\2\2\u014a"+
		"\u014d\5h\65\2\u014b\u014e\5L\'\2\u014c\u014e\5N(\2\u014d\u014b\3\2\2"+
		"\2\u014d\u014c\3\2\2\2\u014e\u0153\3\2\2\2\u014f\u0154\5P)\2\u0150\u0154"+
		"\5R*\2\u0151\u0154\5V,\2\u0152\u0154\5X-\2\u0153\u014f\3\2\2\2\u0153\u0150"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154G\3\2\2\2\u0155"+
		"\u0158\5j\66\2\u0156\u0159\5L\'\2\u0157\u0159\5N(\2\u0158\u0156\3\2\2"+
		"\2\u0158\u0157\3\2\2\2\u0159\u015e\3\2\2\2\u015a\u015f\5P)\2\u015b\u015f"+
		"\5R*\2\u015c\u015f\5V,\2\u015d\u015f\5X-\2\u015e\u015a\3\2\2\2\u015e\u015b"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015fI\3\2\2\2\u0160"+
		"\u0163\5l\67\2\u0161\u0164\5L\'\2\u0162\u0164\5N(\2\u0163\u0161\3\2\2"+
		"\2\u0163\u0162\3\2\2\2\u0164\u0169\3\2\2\2\u0165\u016a\5P)\2\u0166\u016a"+
		"\5R*\2\u0167\u016a\5V,\2\u0168\u016a\5X-\2\u0169\u0165\3\2\2\2\u0169\u0166"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016aK\3\2\2\2\u016b"+
		"\u016c\7\23\2\2\u016cM\3\2\2\2\u016d\u016e\7\24\2\2\u016eO\3\2\2\2\u016f"+
		"\u0170\7\25\2\2\u0170Q\3\2\2\2\u0171\u0172\7\26\2\2\u0172S\3\2\2\2\u0173"+
		"\u0174\7\27\2\2\u0174U\3\2\2\2\u0175\u0176\7\30\2\2\u0176W\3\2\2\2\u0177"+
		"\u0178\7\31\2\2\u0178Y\3\2\2\2\u0179\u017a\7\t\2\2\u017a[\3\2\2\2\u017b"+
		"\u017c\7\n\2\2\u017c]\3\2\2\2\u017d\u017e\7\13\2\2\u017e_\3\2\2\2\u017f"+
		"\u0180\7\f\2\2\u0180a\3\2\2\2\u0181\u0182\7\r\2\2\u0182c\3\2\2\2\u0183"+
		"\u0184\7\16\2\2\u0184e\3\2\2\2\u0185\u0186\7\17\2\2\u0186g\3\2\2\2\u0187"+
		"\u0188\7\20\2\2\u0188i\3\2\2\2\u0189\u018a\7\21\2\2\u018ak\3\2\2\2\u018b"+
		"\u018c\7\22\2\2\u018cm\3\2\2\2-qsy~\u0083\u0088\u008d\u0092\u0097\u009d"+
		"\u00a5\u00ad\u00b5\u00c3\u00ca\u00d0\u00d6\u00dc\u00e2\u00e8\u00ee\u00f4"+
		"\u00fa\u0100\u0106\u010b\u0111\u0116\u011c\u0121\u0127\u012c\u0132\u0137"+
		"\u013d\u0142\u0148\u014d\u0153\u0158\u015e\u0163\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}