// Generated from EntradaParser.g4 by ANTLR 4.7.1
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
		COMENTARIOABRIR=1, COMENTARIOLINEA=2, CADENA_ABRIR=3, INT=4, LETRA=5, 
		COMA=6, DOBLEPUNTO=7, PUNTO=8, INTRO=9, OPBLT=10, OPBGT=11, SAP=12, SCP=13, 
		ASIG=14, OPASIG=15, BBAJA=16, COR_ABRIR=17, COR_CERRAR=18, KW_DOS_PUNTOS=19, 
		TERMINADOR=20, WS=21, BARRA=22, KW_JSON=23, KW_DOT=24, KW_SVG=25, KW_CSV=26, 
		LEN=27, FONTCOLOR=28, FONTNAME=29, FONTSIZE=30, ARROWSIZE=31, ARROWCOLOR=32, 
		PENWIDTH=33, FILLCOLOR=34, STYLE=35, SHAPE=36, EXTENSION_JSON=37, EXTENSION_SVG=38, 
		EXTENSION_DOT=39, EXTENSION_CSV=40, EDGE=41, NODE=42, RELATIONSHIP=43, 
		CLASS=44, PROPERTY=45, INHERITANCE=46, INDERECT_USE=47, IDF=48, COMENTARIOCERRAR=49, 
		TEXTOCOMENTARIO_ML=50, AUTHOR=51, DESCRIPTION=52, TARGET=53, FINAL_COMENTARIO_UL=54, 
		TEXTOCOMENTARIO_UL=55, CADENA_CERRAR=56, TEXTO_CADENA=57;
	public static final int
		RULE_init = 0, RULE_comentario = 1, RULE_authorcom = 2, RULE_descrcom = 3, 
		RULE_targcom = 4, RULE_texto_comen = 5, RULE_rutafichero = 6, RULE_tipo_archivo = 7, 
		RULE_json = 8, RULE_svg = 9, RULE_dot = 10, RULE_csv = 11, RULE_path_json = 12, 
		RULE_path_svg = 13, RULE_path_dot = 14, RULE_path_csv = 15, RULE_wsci = 16, 
		RULE_white_space = 17, RULE_barra = 18, RULE_intro = 19, RULE_letra = 20, 
		RULE_numero = 21, RULE_variable = 22, RULE_sap = 23, RULE_scp = 24, RULE_asig = 25, 
		RULE_opasig = 26, RULE_opblt = 27, RULE_opbgt = 28, RULE_coma = 29, RULE_dos_ptos = 30, 
		RULE_punto = 31, RULE_doblepunto = 32, RULE_texto_cadena = 33, RULE_cadena_abrir = 34, 
		RULE_cadena_cerrar = 35, RULE_cadena = 36, RULE_bbaja = 37, RULE_cor_abrir = 38, 
		RULE_cor_Cerrar = 39, RULE_kw_json = 40, RULE_extension_json = 41, RULE_kw_svg = 42, 
		RULE_extension_svg = 43, RULE_kw_dot = 44, RULE_extension_dot = 45, RULE_kw_csv = 46, 
		RULE_extension_csv = 47, RULE_parametros = 48, RULE_len = 49, RULE_fontcolor = 50, 
		RULE_fontname = 51, RULE_fontsize = 52, RULE_arrowsize = 53, RULE_arrowcolor = 54, 
		RULE_penwidth = 55, RULE_fillcolor = 56, RULE_style = 57, RULE_shape = 58, 
		RULE_kw_edge = 59, RULE_kw_node = 60, RULE_kw_relationship = 61, RULE_kw_class = 62, 
		RULE_kw_property = 63, RULE_kw_inheritance = 64, RULE_kw_inderect_use = 65, 
		RULE_kw_len = 66, RULE_kw_fontcolor = 67, RULE_kw_fontname = 68, RULE_kw_fontsize = 69, 
		RULE_kw_arrowsize = 70, RULE_kw_arrowcolor = 71, RULE_kw_penwidth = 72, 
		RULE_kw_fillcolor = 73, RULE_kw_style = 74, RULE_kw_shape = 75;
	public static final String[] ruleNames = {
		"init", "comentario", "authorcom", "descrcom", "targcom", "texto_comen", 
		"rutafichero", "tipo_archivo", "json", "svg", "dot", "csv", "path_json", 
		"path_svg", "path_dot", "path_csv", "wsci", "white_space", "barra", "intro", 
		"letra", "numero", "variable", "sap", "scp", "asig", "opasig", "opblt", 
		"opbgt", "coma", "dos_ptos", "punto", "doblepunto", "texto_cadena", "cadena_abrir", 
		"cadena_cerrar", "cadena", "bbaja", "cor_abrir", "cor_Cerrar", "kw_json", 
		"extension_json", "kw_svg", "extension_svg", "kw_dot", "extension_dot", 
		"kw_csv", "extension_csv", "parametros", "len", "fontcolor", "fontname", 
		"fontsize", "arrowsize", "arrowcolor", "penwidth", "fillcolor", "style", 
		"shape", "kw_edge", "kw_node", "kw_relationship", "kw_class", "kw_property", 
		"kw_inheritance", "kw_inderect_use", "kw_len", "kw_fontcolor", "kw_fontname", 
		"kw_fontsize", "kw_arrowsize", "kw_arrowcolor", "kw_penwidth", "kw_fillcolor", 
		"kw_style", "kw_shape"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/*'", "'//'", null, null, null, "','", "'..'", "'.'", null, "'<'", 
		"'>'", "'('", "')'", "'='", "':='", "'_'", "'['", "']'", "':'", "';'", 
		null, null, "'JSON'", "'DOT'", "'SVG'", "'CSV'", "'len'", "'fontcolor'", 
		"'fontname'", "'fontsize'", "'arrowsize'", "'arrowcolor'", "'penwidth'", 
		"'fillcolor'", "'style'", "'shape'", "'json'", "'svg'", "'dot'", "'csv'", 
		"'edge'", "'node'", "'relationship'", "'class'", "'property'", "'inheritance'", 
		"'inderect_use'", null, "'*/'", null, null, null, null, "'\r\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMENTARIOABRIR", "COMENTARIOLINEA", "CADENA_ABRIR", "INT", "LETRA", 
		"COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "OPBLT", "OPBGT", "SAP", "SCP", 
		"ASIG", "OPASIG", "BBAJA", "COR_ABRIR", "COR_CERRAR", "KW_DOS_PUNTOS", 
		"TERMINADOR", "WS", "BARRA", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", 
		"LEN", "FONTCOLOR", "FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", 
		"PENWIDTH", "FILLCOLOR", "STYLE", "SHAPE", "EXTENSION_JSON", "EXTENSION_SVG", 
		"EXTENSION_DOT", "EXTENSION_CSV", "EDGE", "NODE", "RELATIONSHIP", "CLASS", 
		"PROPERTY", "INHERITANCE", "INDERECT_USE", "IDF", "COMENTARIOCERRAR", 
		"TEXTOCOMENTARIO_ML", "AUTHOR", "DESCRIPTION", "TARGET", "FINAL_COMENTARIO_UL", 
		"TEXTOCOMENTARIO_UL", "CADENA_CERRAR", "TEXTO_CADENA"
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
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
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
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << INTRO) | (1L << WS) | (1L << KW_JSON) | (1L << KW_DOT) | (1L << KW_SVG) | (1L << KW_CSV) | (1L << LEN) | (1L << FONTCOLOR) | (1L << FONTNAME) | (1L << FONTSIZE) | (1L << ARROWSIZE) | (1L << ARROWCOLOR) | (1L << PENWIDTH) | (1L << FILLCOLOR) | (1L << STYLE) | (1L << SHAPE))) != 0)) {
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_JSON:
				case KW_DOT:
				case KW_SVG:
				case KW_CSV:
					{
					setState(152);
					tipo_archivo();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
					{
					setState(153);
					comentario();
					}
					break;
				case INTRO:
				case WS:
					{
					setState(154);
					wsci();
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
					setState(155);
					parametros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOABRIR() { return getToken(EntradaParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(EntradaParser.COMENTARIOCERRAR, 0); }
		public List<Texto_comenContext> texto_comen() {
			return getRuleContexts(Texto_comenContext.class);
		}
		public Texto_comenContext texto_comen(int i) {
			return getRuleContext(Texto_comenContext.class,i);
		}
		public List<AuthorcomContext> authorcom() {
			return getRuleContexts(AuthorcomContext.class);
		}
		public AuthorcomContext authorcom(int i) {
			return getRuleContext(AuthorcomContext.class,i);
		}
		public List<DescrcomContext> descrcom() {
			return getRuleContexts(DescrcomContext.class);
		}
		public DescrcomContext descrcom(int i) {
			return getRuleContext(DescrcomContext.class,i);
		}
		public List<TargcomContext> targcom() {
			return getRuleContexts(TargcomContext.class);
		}
		public TargcomContext targcom(int i) {
			return getRuleContext(TargcomContext.class,i);
		}
		public List<TerminalNode> INTRO() { return getTokens(EntradaParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(EntradaParser.INTRO, i);
		}
		public TerminalNode COMENTARIOLINEA() { return getToken(EntradaParser.COMENTARIOLINEA, 0); }
		public TerminalNode FINAL_COMENTARIO_UL() { return getToken(EntradaParser.FINAL_COMENTARIO_UL, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comentario);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(COMENTARIOABRIR);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTRO) | (1L << TEXTOCOMENTARIO_ML) | (1L << AUTHOR) | (1L << DESCRIPTION) | (1L << TARGET) | (1L << TEXTOCOMENTARIO_UL))) != 0)) {
					{
					setState(167);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIO_ML:
					case TEXTOCOMENTARIO_UL:
						{
						setState(162);
						texto_comen();
						}
						break;
					case AUTHOR:
						{
						setState(163);
						authorcom();
						}
						break;
					case DESCRIPTION:
						{
						setState(164);
						descrcom();
						}
						break;
					case TARGET:
						{
						setState(165);
						targcom();
						}
						break;
					case INTRO:
						{
						setState(166);
						match(INTRO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(COMENTARIOLINEA);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIO_ML || _la==TEXTOCOMENTARIO_UL) {
					{
					{
					setState(174);
					texto_comen();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(FINAL_COMENTARIO_UL);
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

	public static class AuthorcomContext extends ParserRuleContext {
		public List<TerminalNode> AUTHOR() { return getTokens(EntradaParser.AUTHOR); }
		public TerminalNode AUTHOR(int i) {
			return getToken(EntradaParser.AUTHOR, i);
		}
		public AuthorcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterAuthorcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitAuthorcom(this);
		}
	}

	public final AuthorcomContext authorcom() throws RecognitionException {
		AuthorcomContext _localctx = new AuthorcomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_authorcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(183);
					match(AUTHOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186); 
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

	public static class DescrcomContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(EntradaParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(EntradaParser.DESCRIPTION, i);
		}
		public DescrcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descrcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterDescrcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitDescrcom(this);
		}
	}

	public final DescrcomContext descrcom() throws RecognitionException {
		DescrcomContext _localctx = new DescrcomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descrcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					match(DESCRIPTION);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); 
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

	public static class TargcomContext extends ParserRuleContext {
		public List<TerminalNode> TARGET() { return getTokens(EntradaParser.TARGET); }
		public TerminalNode TARGET(int i) {
			return getToken(EntradaParser.TARGET, i);
		}
		public TargcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTargcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTargcom(this);
		}
	}

	public final TargcomContext targcom() throws RecognitionException {
		TargcomContext _localctx = new TargcomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_targcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(193);
					match(TARGET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196); 
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

	public static class Texto_comenContext extends ParserRuleContext {
		public List<TerminalNode> TEXTOCOMENTARIO_ML() { return getTokens(EntradaParser.TEXTOCOMENTARIO_ML); }
		public TerminalNode TEXTOCOMENTARIO_ML(int i) {
			return getToken(EntradaParser.TEXTOCOMENTARIO_ML, i);
		}
		public List<TerminalNode> TEXTOCOMENTARIO_UL() { return getTokens(EntradaParser.TEXTOCOMENTARIO_UL); }
		public TerminalNode TEXTOCOMENTARIO_UL(int i) {
			return getToken(EntradaParser.TEXTOCOMENTARIO_UL, i);
		}
		public Texto_comenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto_comen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTexto_comen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTexto_comen(this);
		}
	}

	public final Texto_comenContext texto_comen() throws RecognitionException {
		Texto_comenContext _localctx = new Texto_comenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_texto_comen);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(198);
					_la = _input.LA(1);
					if ( !(_la==TEXTOCOMENTARIO_ML || _la==TEXTOCOMENTARIO_UL) ) {
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
				setState(201); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class RutaficheroContext extends ParserRuleContext {
		public List<DoblepuntoContext> doblepunto() {
			return getRuleContexts(DoblepuntoContext.class);
		}
		public DoblepuntoContext doblepunto(int i) {
			return getRuleContext(DoblepuntoContext.class,i);
		}
		public List<PuntoContext> punto() {
			return getRuleContexts(PuntoContext.class);
		}
		public PuntoContext punto(int i) {
			return getRuleContext(PuntoContext.class,i);
		}
		public List<LetraContext> letra() {
			return getRuleContexts(LetraContext.class);
		}
		public LetraContext letra(int i) {
			return getRuleContext(LetraContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<BarraContext> barra() {
			return getRuleContexts(BarraContext.class);
		}
		public BarraContext barra(int i) {
			return getRuleContext(BarraContext.class,i);
		}
		public List<Dos_ptosContext> dos_ptos() {
			return getRuleContexts(Dos_ptosContext.class);
		}
		public Dos_ptosContext dos_ptos(int i) {
			return getRuleContext(Dos_ptosContext.class,i);
		}
		public RutaficheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutafichero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterRutafichero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitRutafichero(this);
		}
	}

	public final RutaficheroContext rutafichero() throws RecognitionException {
		RutaficheroContext _localctx = new RutaficheroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rutafichero);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(211);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOBLEPUNTO:
						{
						setState(203);
						doblepunto();
						}
						break;
					case PUNTO:
						{
						setState(204);
						punto();
						}
						break;
					case LETRA:
						{
						setState(205);
						letra();
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_DOS_PUNTOS) {
							{
							setState(206);
							dos_ptos();
							}
						}

						}
						break;
					case IDF:
						{
						setState(209);
						variable();
						}
						break;
					case BARRA:
						{
						setState(210);
						barra();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 14, RULE_tipo_archivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_JSON:
				{
				setState(216);
				json();
				}
				break;
			case KW_SVG:
				{
				setState(217);
				svg();
				}
				break;
			case KW_DOT:
				{
				setState(218);
				dot();
				}
				break;
			case KW_CSV:
				{
				setState(219);
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

	public static class JsonContext extends ParserRuleContext {
		public Kw_jsonContext kw_json() {
			return getRuleContext(Kw_jsonContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Path_jsonContext path_json() {
			return getRuleContext(Path_jsonContext.class,0);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			kw_json();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(223);
				wsci();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			asig();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(230);
				wsci();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			path_json();
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
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Path_svgContext path_svg() {
			return getRuleContext(Path_svgContext.class,0);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
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
		enterRule(_localctx, 18, RULE_svg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			kw_svg();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(239);
				wsci();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			asig();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(246);
				wsci();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			path_svg();
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
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Path_dotContext path_dot() {
			return getRuleContext(Path_dotContext.class,0);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_dot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			kw_dot();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(255);
				wsci();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			asig();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(262);
				wsci();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			path_dot();
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
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Path_csvContext path_csv() {
			return getRuleContext(Path_csvContext.class,0);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
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
		enterRule(_localctx, 22, RULE_csv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			kw_csv();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(271);
				wsci();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			asig();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(278);
				wsci();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			path_csv();
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

	public static class Path_jsonContext extends ParserRuleContext {
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public Extension_jsonContext extension_json() {
			return getRuleContext(Extension_jsonContext.class,0);
		}
		public Path_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterPath_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitPath_json(this);
		}
	}

	public final Path_jsonContext path_json() throws RecognitionException {
		Path_jsonContext _localctx = new Path_jsonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_path_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			rutafichero();
			setState(287);
			variable();
			setState(288);
			punto();
			setState(289);
			extension_json();
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

	public static class Path_svgContext extends ParserRuleContext {
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public Extension_svgContext extension_svg() {
			return getRuleContext(Extension_svgContext.class,0);
		}
		public Path_svgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_svg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterPath_svg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitPath_svg(this);
		}
	}

	public final Path_svgContext path_svg() throws RecognitionException {
		Path_svgContext _localctx = new Path_svgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_path_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			rutafichero();
			setState(292);
			variable();
			setState(293);
			punto();
			setState(294);
			extension_svg();
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

	public static class Path_dotContext extends ParserRuleContext {
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public Extension_dotContext extension_dot() {
			return getRuleContext(Extension_dotContext.class,0);
		}
		public Path_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterPath_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitPath_dot(this);
		}
	}

	public final Path_dotContext path_dot() throws RecognitionException {
		Path_dotContext _localctx = new Path_dotContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_path_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			rutafichero();
			setState(297);
			variable();
			setState(298);
			punto();
			setState(299);
			extension_dot();
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

	public static class Path_csvContext extends ParserRuleContext {
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public Extension_csvContext extension_csv() {
			return getRuleContext(Extension_csvContext.class,0);
		}
		public Path_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_csv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterPath_csv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitPath_csv(this);
		}
	}

	public final Path_csvContext path_csv() throws RecognitionException {
		Path_csvContext _localctx = new Path_csvContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_path_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			rutafichero();
			setState(302);
			variable();
			setState(303);
			punto();
			setState(304);
			extension_csv();
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

	public static class WsciContext extends ParserRuleContext {
		public White_spaceContext white_space() {
			return getRuleContext(White_spaceContext.class,0);
		}
		public IntroContext intro() {
			return getRuleContext(IntroContext.class,0);
		}
		public WsciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterWsci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitWsci(this);
		}
	}

	public final WsciContext wsci() throws RecognitionException {
		WsciContext _localctx = new WsciContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_wsci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WS:
				{
				setState(306);
				white_space();
				}
				break;
			case INTRO:
				{
				setState(307);
				intro();
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

	public static class White_spaceContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(EntradaParser.WS, 0); }
		public White_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_white_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterWhite_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitWhite_space(this);
		}
	}

	public final White_spaceContext white_space() throws RecognitionException {
		White_spaceContext _localctx = new White_spaceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_white_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(WS);
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

	public static class BarraContext extends ParserRuleContext {
		public TerminalNode BARRA() { return getToken(EntradaParser.BARRA, 0); }
		public BarraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterBarra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitBarra(this);
		}
	}

	public final BarraContext barra() throws RecognitionException {
		BarraContext _localctx = new BarraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_barra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(BARRA);
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

	public static class IntroContext extends ParserRuleContext {
		public TerminalNode INTRO() { return getToken(EntradaParser.INTRO, 0); }
		public IntroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitIntro(this);
		}
	}

	public final IntroContext intro() throws RecognitionException {
		IntroContext _localctx = new IntroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_intro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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

	public static class LetraContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(EntradaParser.LETRA, 0); }
		public LetraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterLetra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitLetra(this);
		}
	}

	public final LetraContext letra() throws RecognitionException {
		LetraContext _localctx = new LetraContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_letra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(LETRA);
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EntradaParser.INT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(INT);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(EntradaParser.IDF, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(IDF);
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

	public static class SapContext extends ParserRuleContext {
		public TerminalNode SAP() { return getToken(EntradaParser.SAP, 0); }
		public SapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterSap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitSap(this);
		}
	}

	public final SapContext sap() throws RecognitionException {
		SapContext _localctx = new SapContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(SAP);
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

	public static class ScpContext extends ParserRuleContext {
		public TerminalNode SCP() { return getToken(EntradaParser.SCP, 0); }
		public ScpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterScp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitScp(this);
		}
	}

	public final ScpContext scp() throws RecognitionException {
		ScpContext _localctx = new ScpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_scp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(SCP);
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

	public static class AsigContext extends ParserRuleContext {
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitAsig(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(ASIG);
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

	public static class OpasigContext extends ParserRuleContext {
		public TerminalNode OPASIG() { return getToken(EntradaParser.OPASIG, 0); }
		public OpasigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opasig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterOpasig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitOpasig(this);
		}
	}

	public final OpasigContext opasig() throws RecognitionException {
		OpasigContext _localctx = new OpasigContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_opasig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(OPASIG);
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

	public static class OpbltContext extends ParserRuleContext {
		public TerminalNode OPBLT() { return getToken(EntradaParser.OPBLT, 0); }
		public OpbltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opblt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterOpblt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitOpblt(this);
		}
	}

	public final OpbltContext opblt() throws RecognitionException {
		OpbltContext _localctx = new OpbltContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opblt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(OPBLT);
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

	public static class OpbgtContext extends ParserRuleContext {
		public TerminalNode OPBGT() { return getToken(EntradaParser.OPBGT, 0); }
		public OpbgtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbgt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterOpbgt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitOpbgt(this);
		}
	}

	public final OpbgtContext opbgt() throws RecognitionException {
		OpbgtContext _localctx = new OpbgtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_opbgt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(OPBGT);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(EntradaParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(COMA);
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

	public static class Dos_ptosContext extends ParserRuleContext {
		public TerminalNode KW_DOS_PUNTOS() { return getToken(EntradaParser.KW_DOS_PUNTOS, 0); }
		public Dos_ptosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos_ptos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterDos_ptos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitDos_ptos(this);
		}
	}

	public final Dos_ptosContext dos_ptos() throws RecognitionException {
		Dos_ptosContext _localctx = new Dos_ptosContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dos_ptos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(KW_DOS_PUNTOS);
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

	public static class PuntoContext extends ParserRuleContext {
		public TerminalNode PUNTO() { return getToken(EntradaParser.PUNTO, 0); }
		public PuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterPunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitPunto(this);
		}
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(PUNTO);
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

	public static class DoblepuntoContext extends ParserRuleContext {
		public TerminalNode DOBLEPUNTO() { return getToken(EntradaParser.DOBLEPUNTO, 0); }
		public DoblepuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doblepunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterDoblepunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitDoblepunto(this);
		}
	}

	public final DoblepuntoContext doblepunto() throws RecognitionException {
		DoblepuntoContext _localctx = new DoblepuntoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_doblepunto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(DOBLEPUNTO);
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

	public static class Texto_cadenaContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO_CADENA() { return getTokens(EntradaParser.TEXTO_CADENA); }
		public TerminalNode TEXTO_CADENA(int i) {
			return getToken(EntradaParser.TEXTO_CADENA, i);
		}
		public Texto_cadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterTexto_cadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitTexto_cadena(this);
		}
	}

	public final Texto_cadenaContext texto_cadena() throws RecognitionException {
		Texto_cadenaContext _localctx = new Texto_cadenaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_texto_cadena);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(342);
					match(TEXTO_CADENA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(345); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Cadena_abrirContext extends ParserRuleContext {
		public TerminalNode CADENA_ABRIR() { return getToken(EntradaParser.CADENA_ABRIR, 0); }
		public Cadena_abrirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena_abrir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterCadena_abrir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitCadena_abrir(this);
		}
	}

	public final Cadena_abrirContext cadena_abrir() throws RecognitionException {
		Cadena_abrirContext _localctx = new Cadena_abrirContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cadena_abrir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(CADENA_ABRIR);
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

	public static class Cadena_cerrarContext extends ParserRuleContext {
		public TerminalNode CADENA_CERRAR() { return getToken(EntradaParser.CADENA_CERRAR, 0); }
		public Cadena_cerrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena_cerrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterCadena_cerrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitCadena_cerrar(this);
		}
	}

	public final Cadena_cerrarContext cadena_cerrar() throws RecognitionException {
		Cadena_cerrarContext _localctx = new Cadena_cerrarContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cadena_cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(CADENA_CERRAR);
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

	public static class CadenaContext extends ParserRuleContext {
		public Cadena_abrirContext cadena_abrir() {
			return getRuleContext(Cadena_abrirContext.class,0);
		}
		public Cadena_cerrarContext cadena_cerrar() {
			return getRuleContext(Cadena_cerrarContext.class,0);
		}
		public List<Texto_cadenaContext> texto_cadena() {
			return getRuleContexts(Texto_cadenaContext.class);
		}
		public Texto_cadenaContext texto_cadena(int i) {
			return getRuleContext(Texto_cadenaContext.class,i);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitCadena(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			cadena_abrir();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTO_CADENA) {
				{
				{
				setState(352);
				texto_cadena();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			cadena_cerrar();
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

	public static class BbajaContext extends ParserRuleContext {
		public TerminalNode BBAJA() { return getToken(EntradaParser.BBAJA, 0); }
		public BbajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbaja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterBbaja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitBbaja(this);
		}
	}

	public final BbajaContext bbaja() throws RecognitionException {
		BbajaContext _localctx = new BbajaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bbaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(BBAJA);
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

	public static class Cor_abrirContext extends ParserRuleContext {
		public TerminalNode COR_ABRIR() { return getToken(EntradaParser.COR_ABRIR, 0); }
		public Cor_abrirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_abrir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterCor_abrir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitCor_abrir(this);
		}
	}

	public final Cor_abrirContext cor_abrir() throws RecognitionException {
		Cor_abrirContext _localctx = new Cor_abrirContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cor_abrir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(COR_ABRIR);
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

	public static class Cor_CerrarContext extends ParserRuleContext {
		public TerminalNode COR_CERRAR() { return getToken(EntradaParser.COR_CERRAR, 0); }
		public Cor_CerrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_Cerrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterCor_Cerrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitCor_Cerrar(this);
		}
	}

	public final Cor_CerrarContext cor_Cerrar() throws RecognitionException {
		Cor_CerrarContext _localctx = new Cor_CerrarContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cor_Cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(COR_CERRAR);
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
		enterRule(_localctx, 80, RULE_kw_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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

	public static class Extension_jsonContext extends ParserRuleContext {
		public TerminalNode EXTENSION_JSON() { return getToken(EntradaParser.EXTENSION_JSON, 0); }
		public Extension_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterExtension_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitExtension_json(this);
		}
	}

	public final Extension_jsonContext extension_json() throws RecognitionException {
		Extension_jsonContext _localctx = new Extension_jsonContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_extension_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(EXTENSION_JSON);
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
		enterRule(_localctx, 84, RULE_kw_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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

	public static class Extension_svgContext extends ParserRuleContext {
		public TerminalNode EXTENSION_SVG() { return getToken(EntradaParser.EXTENSION_SVG, 0); }
		public Extension_svgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_svg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterExtension_svg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitExtension_svg(this);
		}
	}

	public final Extension_svgContext extension_svg() throws RecognitionException {
		Extension_svgContext _localctx = new Extension_svgContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_extension_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(EXTENSION_SVG);
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
		enterRule(_localctx, 88, RULE_kw_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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

	public static class Extension_dotContext extends ParserRuleContext {
		public TerminalNode EXTENSION_DOT() { return getToken(EntradaParser.EXTENSION_DOT, 0); }
		public Extension_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterExtension_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitExtension_dot(this);
		}
	}

	public final Extension_dotContext extension_dot() throws RecognitionException {
		Extension_dotContext _localctx = new Extension_dotContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_extension_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(EXTENSION_DOT);
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
		enterRule(_localctx, 92, RULE_kw_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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

	public static class Extension_csvContext extends ParserRuleContext {
		public TerminalNode EXTENSION_CSV() { return getToken(EntradaParser.EXTENSION_CSV, 0); }
		public Extension_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_csv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).enterExtension_csv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EntradaParserListener ) ((EntradaParserListener)listener).exitExtension_csv(this);
		}
	}

	public final Extension_csvContext extension_csv() throws RecognitionException {
		Extension_csvContext _localctx = new Extension_csvContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_extension_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(EXTENSION_CSV);
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
		enterRule(_localctx, 96, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(382);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(383);
				fontcolor();
				}
				break;
			case FONTNAME:
				{
				setState(384);
				fontname();
				}
				break;
			case FONTSIZE:
				{
				setState(385);
				fontsize();
				}
				break;
			case ARROWSIZE:
				{
				setState(386);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(387);
				arrowcolor();
				}
				break;
			case PENWIDTH:
				{
				setState(388);
				penwidth();
				}
				break;
			case FILLCOLOR:
				{
				setState(389);
				fillcolor();
				}
				break;
			case STYLE:
				{
				setState(390);
				style();
				}
				break;
			case SHAPE:
				{
				setState(391);
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
		public BbajaContext bbaja() {
			return getRuleContext(BbajaContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
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
		enterRule(_localctx, 98, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			kw_len();
			setState(395);
			bbaja();
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(396);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(397);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(398);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(399);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(402);
			asig();
			setState(403);
			numero();
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
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
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
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 100, RULE_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			kw_fontcolor();
			setState(406);
			bbaja();
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(407);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(408);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(411);
			bbaja();
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(412);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(413);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(414);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(415);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(418);
			asig();
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(419);
				cadena();
				}
				break;
			case IDF:
				{
				setState(420);
				variable();
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

	public static class FontnameContext extends ParserRuleContext {
		public Kw_fontnameContext kw_fontname() {
			return getRuleContext(Kw_fontnameContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
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
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 102, RULE_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			kw_fontname();
			setState(424);
			bbaja();
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(425);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(426);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(429);
			bbaja();
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(430);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(431);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(432);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(433);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(436);
			asig();
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(437);
				cadena();
				}
				break;
			case IDF:
				{
				setState(438);
				variable();
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

	public static class FontsizeContext extends ParserRuleContext {
		public Kw_fontsizeContext kw_fontsize() {
			return getRuleContext(Kw_fontsizeContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
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
		enterRule(_localctx, 104, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			kw_fontsize();
			setState(442);
			bbaja();
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(443);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(444);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(447);
			bbaja();
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(448);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(449);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(450);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(451);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(454);
			asig();
			setState(455);
			numero();
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
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
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
		enterRule(_localctx, 106, RULE_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			kw_arrowsize();
			setState(458);
			bbaja();
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(459);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(460);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(463);
			bbaja();
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(464);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(465);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(466);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(467);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(470);
			asig();
			setState(471);
			numero();
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
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
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
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 108, RULE_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			kw_arrowcolor();
			setState(474);
			bbaja();
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(475);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(476);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(479);
			bbaja();
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(480);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(481);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(482);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(483);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(486);
			asig();
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(487);
				cadena();
				}
				break;
			case IDF:
				{
				setState(488);
				variable();
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

	public static class PenwidthContext extends ParserRuleContext {
		public Kw_penwidthContext kw_penwidth() {
			return getRuleContext(Kw_penwidthContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
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
		enterRule(_localctx, 110, RULE_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			kw_penwidth();
			setState(492);
			bbaja();
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(493);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(494);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(497);
			bbaja();
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(498);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(499);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(500);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(501);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(504);
			asig();
			setState(505);
			numero();
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
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
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
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 112, RULE_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			kw_fillcolor();
			setState(508);
			bbaja();
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(509);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(510);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(513);
			bbaja();
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(514);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(515);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(516);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(517);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(520);
			asig();
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(521);
				cadena();
				}
				break;
			case IDF:
				{
				setState(522);
				variable();
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

	public static class StyleContext extends ParserRuleContext {
		public Kw_styleContext kw_style() {
			return getRuleContext(Kw_styleContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
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
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 114, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			kw_style();
			setState(526);
			bbaja();
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(527);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(528);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(531);
			bbaja();
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(532);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(533);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(534);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(535);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(538);
			asig();
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(539);
				cadena();
				}
				break;
			case IDF:
				{
				setState(540);
				variable();
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

	public static class ShapeContext extends ParserRuleContext {
		public Kw_shapeContext kw_shape() {
			return getRuleContext(Kw_shapeContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
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
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 116, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			kw_shape();
			setState(544);
			bbaja();
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(545);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(546);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(549);
			bbaja();
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(550);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(551);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(552);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(553);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(556);
			asig();
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(557);
				cadena();
				}
				break;
			case IDF:
				{
				setState(558);
				variable();
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
		enterRule(_localctx, 118, RULE_kw_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
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
		enterRule(_localctx, 120, RULE_kw_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		enterRule(_localctx, 122, RULE_kw_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
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
		enterRule(_localctx, 124, RULE_kw_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		enterRule(_localctx, 126, RULE_kw_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		enterRule(_localctx, 128, RULE_kw_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		enterRule(_localctx, 130, RULE_kw_inderect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
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
		enterRule(_localctx, 132, RULE_kw_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
		enterRule(_localctx, 134, RULE_kw_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
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
		enterRule(_localctx, 136, RULE_kw_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
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
		enterRule(_localctx, 138, RULE_kw_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
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
		enterRule(_localctx, 140, RULE_kw_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
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
		enterRule(_localctx, 142, RULE_kw_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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
		enterRule(_localctx, 144, RULE_kw_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
		enterRule(_localctx, 146, RULE_kw_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		enterRule(_localctx, 148, RULE_kw_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
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
		enterRule(_localctx, 150, RULE_kw_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0256\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\7\2\u009f\n\2\f\2\16\2\u00a2"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00aa\n\3\f\3\16\3\u00ad\13\3\3\3\3"+
		"\3\3\3\7\3\u00b2\n\3\f\3\16\3\u00b5\13\3\3\3\5\3\u00b8\n\3\3\4\6\4\u00bb"+
		"\n\4\r\4\16\4\u00bc\3\5\6\5\u00c0\n\5\r\5\16\5\u00c1\3\6\6\6\u00c5\n\6"+
		"\r\6\16\6\u00c6\3\7\6\7\u00ca\n\7\r\7\16\7\u00cb\3\b\3\b\3\b\3\b\5\b\u00d2"+
		"\n\b\3\b\3\b\7\b\u00d6\n\b\f\b\16\b\u00d9\13\b\3\t\3\t\3\t\3\t\5\t\u00df"+
		"\n\t\3\n\3\n\7\n\u00e3\n\n\f\n\16\n\u00e6\13\n\3\n\3\n\7\n\u00ea\n\n\f"+
		"\n\16\n\u00ed\13\n\3\n\3\n\3\13\3\13\7\13\u00f3\n\13\f\13\16\13\u00f6"+
		"\13\13\3\13\3\13\7\13\u00fa\n\13\f\13\16\13\u00fd\13\13\3\13\3\13\3\f"+
		"\3\f\7\f\u0103\n\f\f\f\16\f\u0106\13\f\3\f\3\f\7\f\u010a\n\f\f\f\16\f"+
		"\u010d\13\f\3\f\3\f\3\r\3\r\7\r\u0113\n\r\f\r\16\r\u0116\13\r\3\r\3\r"+
		"\7\r\u011a\n\r\f\r\16\r\u011d\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\5\22\u0137\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\6#\u015a\n#\r#\16#\u015b\3"+
		"$\3$\3%\3%\3&\3&\7&\u0164\n&\f&\16&\u0167\13&\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u018b\n\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u0193\n\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64"+
		"\u019c\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u01a3\n\64\3\64\3\64\3\64\5"+
		"\64\u01a8\n\64\3\65\3\65\3\65\3\65\5\65\u01ae\n\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u01b5\n\65\3\65\3\65\3\65\5\65\u01ba\n\65\3\66\3\66\3\66\3"+
		"\66\5\66\u01c0\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u01c7\n\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\5\67\u01d0\n\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u01d7\n\67\3\67\3\67\3\67\38\38\38\38\58\u01e0\n8\38\38\38\38\38\58\u01e7"+
		"\n8\38\38\38\58\u01ec\n8\39\39\39\39\59\u01f2\n9\39\39\39\39\39\59\u01f9"+
		"\n9\39\39\39\3:\3:\3:\3:\5:\u0202\n:\3:\3:\3:\3:\3:\5:\u0209\n:\3:\3:"+
		"\3:\5:\u020e\n:\3;\3;\3;\3;\5;\u0214\n;\3;\3;\3;\3;\3;\5;\u021b\n;\3;"+
		"\3;\3;\5;\u0220\n;\3<\3<\3<\3<\5<\u0226\n<\3<\3<\3<\3<\3<\5<\u022d\n<"+
		"\3<\3<\3<\5<\u0232\n<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D"+
		"\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\2\2N\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\2\3\4\2\64\6499\2\u0262\2\u00a0\3\2\2\2\4\u00b7"+
		"\3\2\2\2\6\u00ba\3\2\2\2\b\u00bf\3\2\2\2\n\u00c4\3\2\2\2\f\u00c9\3\2\2"+
		"\2\16\u00d7\3\2\2\2\20\u00de\3\2\2\2\22\u00e0\3\2\2\2\24\u00f0\3\2\2\2"+
		"\26\u0100\3\2\2\2\30\u0110\3\2\2\2\32\u0120\3\2\2\2\34\u0125\3\2\2\2\36"+
		"\u012a\3\2\2\2 \u012f\3\2\2\2\"\u0136\3\2\2\2$\u0138\3\2\2\2&\u013a\3"+
		"\2\2\2(\u013c\3\2\2\2*\u013e\3\2\2\2,\u0140\3\2\2\2.\u0142\3\2\2\2\60"+
		"\u0144\3\2\2\2\62\u0146\3\2\2\2\64\u0148\3\2\2\2\66\u014a\3\2\2\28\u014c"+
		"\3\2\2\2:\u014e\3\2\2\2<\u0150\3\2\2\2>\u0152\3\2\2\2@\u0154\3\2\2\2B"+
		"\u0156\3\2\2\2D\u0159\3\2\2\2F\u015d\3\2\2\2H\u015f\3\2\2\2J\u0161\3\2"+
		"\2\2L\u016a\3\2\2\2N\u016c\3\2\2\2P\u016e\3\2\2\2R\u0170\3\2\2\2T\u0172"+
		"\3\2\2\2V\u0174\3\2\2\2X\u0176\3\2\2\2Z\u0178\3\2\2\2\\\u017a\3\2\2\2"+
		"^\u017c\3\2\2\2`\u017e\3\2\2\2b\u018a\3\2\2\2d\u018c\3\2\2\2f\u0197\3"+
		"\2\2\2h\u01a9\3\2\2\2j\u01bb\3\2\2\2l\u01cb\3\2\2\2n\u01db\3\2\2\2p\u01ed"+
		"\3\2\2\2r\u01fd\3\2\2\2t\u020f\3\2\2\2v\u0221\3\2\2\2x\u0233\3\2\2\2z"+
		"\u0235\3\2\2\2|\u0237\3\2\2\2~\u0239\3\2\2\2\u0080\u023b\3\2\2\2\u0082"+
		"\u023d\3\2\2\2\u0084\u023f\3\2\2\2\u0086\u0241\3\2\2\2\u0088\u0243\3\2"+
		"\2\2\u008a\u0245\3\2\2\2\u008c\u0247\3\2\2\2\u008e\u0249\3\2\2\2\u0090"+
		"\u024b\3\2\2\2\u0092\u024d\3\2\2\2\u0094\u024f\3\2\2\2\u0096\u0251\3\2"+
		"\2\2\u0098\u0253\3\2\2\2\u009a\u009f\5\20\t\2\u009b\u009f\5\4\3\2\u009c"+
		"\u009f\5\"\22\2\u009d\u009f\5b\62\2\u009e\u009a\3\2\2\2\u009e\u009b\3"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\3\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a3\u00ab\7\3\2\2\u00a4\u00aa\5\f\7\2\u00a5\u00aa\5\6\4\2\u00a6\u00aa"+
		"\5\b\5\2\u00a7\u00aa\5\n\6\2\u00a8\u00aa\7\13\2\2\u00a9\u00a4\3\2\2\2"+
		"\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b8\7\63\2\2\u00af\u00b3\7"+
		"\4\2\2\u00b0\u00b2\5\f\7\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b8\78\2\2\u00b7\u00a3\3\2\2\2\u00b7\u00af\3\2\2\2\u00b8"+
		"\5\3\2\2\2\u00b9\u00bb\7\65\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\7\3\2\2\2\u00be\u00c0"+
		"\7\66\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\t\3\2\2\2\u00c3\u00c5\7\67\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\13\3\2\2\2\u00c8\u00ca\t\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2"+
		"\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\r\3\2\2\2\u00cd\u00d6"+
		"\5B\"\2\u00ce\u00d6\5@!\2\u00cf\u00d1\5*\26\2\u00d0\u00d2\5> \2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d6\5."+
		"\30\2\u00d4\u00d6\5&\24\2\u00d5\u00cd\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d5"+
		"\u00cf\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\17\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00df\5\22\n\2\u00db\u00df\5\24\13\2\u00dc\u00df\5\26\f"+
		"\2\u00dd\u00df\5\30\r\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\21\3\2\2\2\u00e0\u00e4\5R*\2"+
		"\u00e1\u00e3\5\"\22\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00eb\5\64\33\2\u00e8\u00ea\5\"\22\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\5\32\16\2\u00ef\23\3\2\2\2\u00f0\u00f4\5V,"+
		"\2\u00f1\u00f3\5\"\22\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00fb\5\64\33\2\u00f8\u00fa\5\"\22\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\5\34\17\2\u00ff\25\3\2\2\2\u0100"+
		"\u0104\5Z.\2\u0101\u0103\5\"\22\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u010b\5\64\33\2\u0108\u010a\5\"\22\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5\36\20\2\u010f\27\3\2"+
		"\2\2\u0110\u0114\5^\60\2\u0111\u0113\5\"\22\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u011b\5\64\33\2\u0118\u011a\5\"\22\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\5 \21\2\u011f"+
		"\31\3\2\2\2\u0120\u0121\5\16\b\2\u0121\u0122\5.\30\2\u0122\u0123\5@!\2"+
		"\u0123\u0124\5T+\2\u0124\33\3\2\2\2\u0125\u0126\5\16\b\2\u0126\u0127\5"+
		".\30\2\u0127\u0128\5@!\2\u0128\u0129\5X-\2\u0129\35\3\2\2\2\u012a\u012b"+
		"\5\16\b\2\u012b\u012c\5.\30\2\u012c\u012d\5@!\2\u012d\u012e\5\\/\2\u012e"+
		"\37\3\2\2\2\u012f\u0130\5\16\b\2\u0130\u0131\5.\30\2\u0131\u0132\5@!\2"+
		"\u0132\u0133\5`\61\2\u0133!\3\2\2\2\u0134\u0137\5$\23\2\u0135\u0137\5"+
		"(\25\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137#\3\2\2\2\u0138\u0139"+
		"\7\27\2\2\u0139%\3\2\2\2\u013a\u013b\7\30\2\2\u013b\'\3\2\2\2\u013c\u013d"+
		"\7\13\2\2\u013d)\3\2\2\2\u013e\u013f\7\7\2\2\u013f+\3\2\2\2\u0140\u0141"+
		"\7\6\2\2\u0141-\3\2\2\2\u0142\u0143\7\62\2\2\u0143/\3\2\2\2\u0144\u0145"+
		"\7\16\2\2\u0145\61\3\2\2\2\u0146\u0147\7\17\2\2\u0147\63\3\2\2\2\u0148"+
		"\u0149\7\20\2\2\u0149\65\3\2\2\2\u014a\u014b\7\21\2\2\u014b\67\3\2\2\2"+
		"\u014c\u014d\7\f\2\2\u014d9\3\2\2\2\u014e\u014f\7\r\2\2\u014f;\3\2\2\2"+
		"\u0150\u0151\7\b\2\2\u0151=\3\2\2\2\u0152\u0153\7\25\2\2\u0153?\3\2\2"+
		"\2\u0154\u0155\7\n\2\2\u0155A\3\2\2\2\u0156\u0157\7\t\2\2\u0157C\3\2\2"+
		"\2\u0158\u015a\7;\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015cE\3\2\2\2\u015d\u015e\7\5\2\2\u015e"+
		"G\3\2\2\2\u015f\u0160\7:\2\2\u0160I\3\2\2\2\u0161\u0165\5F$\2\u0162\u0164"+
		"\5D#\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\5H"+
		"%\2\u0169K\3\2\2\2\u016a\u016b\7\22\2\2\u016bM\3\2\2\2\u016c\u016d\7\23"+
		"\2\2\u016dO\3\2\2\2\u016e\u016f\7\24\2\2\u016fQ\3\2\2\2\u0170\u0171\7"+
		"\31\2\2\u0171S\3\2\2\2\u0172\u0173\7\'\2\2\u0173U\3\2\2\2\u0174\u0175"+
		"\7\33\2\2\u0175W\3\2\2\2\u0176\u0177\7(\2\2\u0177Y\3\2\2\2\u0178\u0179"+
		"\7\32\2\2\u0179[\3\2\2\2\u017a\u017b\7)\2\2\u017b]\3\2\2\2\u017c\u017d"+
		"\7\34\2\2\u017d_\3\2\2\2\u017e\u017f\7*\2\2\u017fa\3\2\2\2\u0180\u018b"+
		"\5d\63\2\u0181\u018b\5f\64\2\u0182\u018b\5h\65\2\u0183\u018b\5j\66\2\u0184"+
		"\u018b\5l\67\2\u0185\u018b\5n8\2\u0186\u018b\5p9\2\u0187\u018b\5r:\2\u0188"+
		"\u018b\5t;\2\u0189\u018b\5v<\2\u018a\u0180\3\2\2\2\u018a\u0181\3\2\2\2"+
		"\u018a\u0182\3\2\2\2\u018a\u0183\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0185"+
		"\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u0189\3\2\2\2\u018bc\3\2\2\2\u018c\u018d\5\u0086D\2\u018d\u0192\5L\'"+
		"\2\u018e\u0193\5|?\2\u018f\u0193\5~@\2\u0190\u0193\5\u0082B\2\u0191\u0193"+
		"\5\u0084C\2\u0192\u018e\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2"+
		"\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\5\64\33\2\u0195"+
		"\u0196\5,\27\2\u0196e\3\2\2\2\u0197\u0198\5\u0088E\2\u0198\u019b\5L\'"+
		"\2\u0199\u019c\5x=\2\u019a\u019c\5z>\2\u019b\u0199\3\2\2\2\u019b\u019a"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a2\5L\'\2\u019e\u01a3\5|?\2\u019f"+
		"\u01a3\5~@\2\u01a0\u01a3\5\u0082B\2\u01a1\u01a3\5\u0084C\2\u01a2\u019e"+
		"\3\2\2\2\u01a2\u019f\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a7\5\64\33\2\u01a5\u01a8\5J&\2\u01a6\u01a8\5."+
		"\30\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8g\3\2\2\2\u01a9\u01aa"+
		"\5\u008aF\2\u01aa\u01ad\5L\'\2\u01ab\u01ae\5x=\2\u01ac\u01ae\5z>\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b4\5L"+
		"\'\2\u01b0\u01b5\5|?\2\u01b1\u01b5\5~@\2\u01b2\u01b5\5\u0082B\2\u01b3"+
		"\u01b5\5\u0084C\2\u01b4\u01b0\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\5\64\33\2"+
		"\u01b7\u01ba\5J&\2\u01b8\u01ba\5.\30\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8"+
		"\3\2\2\2\u01bai\3\2\2\2\u01bb\u01bc\5\u008cG\2\u01bc\u01bf\5L\'\2\u01bd"+
		"\u01c0\5x=\2\u01be\u01c0\5z>\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2"+
		"\u01c0\u01c1\3\2\2\2\u01c1\u01c6\5L\'\2\u01c2\u01c7\5|?\2\u01c3\u01c7"+
		"\5~@\2\u01c4\u01c7\5\u0082B\2\u01c5\u01c7\5\u0084C\2\u01c6\u01c2\3\2\2"+
		"\2\u01c6\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01c9\5\64\33\2\u01c9\u01ca\5,\27\2\u01cak\3\2\2\2\u01cb"+
		"\u01cc\5\u008eH\2\u01cc\u01cf\5L\'\2\u01cd\u01d0\5x=\2\u01ce\u01d0\5z"+
		">\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d6\5L\'\2\u01d2\u01d7\5|?\2\u01d3\u01d7\5~@\2\u01d4\u01d7\5\u0082"+
		"B\2\u01d5\u01d7\5\u0084C\2\u01d6\u01d2\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\5\64"+
		"\33\2\u01d9\u01da\5,\27\2\u01dam\3\2\2\2\u01db\u01dc\5\u0090I\2\u01dc"+
		"\u01df\5L\'\2\u01dd\u01e0\5x=\2\u01de\u01e0\5z>\2\u01df\u01dd\3\2\2\2"+
		"\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e6\5L\'\2\u01e2\u01e7"+
		"\5|?\2\u01e3\u01e7\5~@\2\u01e4\u01e7\5\u0082B\2\u01e5\u01e7\5\u0084C\2"+
		"\u01e6\u01e2\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\5\64\33\2\u01e9\u01ec\5J&\2\u01ea"+
		"\u01ec\5.\30\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01eco\3\2\2\2"+
		"\u01ed\u01ee\5\u0092J\2\u01ee\u01f1\5L\'\2\u01ef\u01f2\5x=\2\u01f0\u01f2"+
		"\5z>\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f8\5L\'\2\u01f4\u01f9\5|?\2\u01f5\u01f9\5~@\2\u01f6\u01f9\5\u0082"+
		"B\2\u01f7\u01f9\5\u0084C\2\u01f8\u01f4\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\5\64"+
		"\33\2\u01fb\u01fc\5,\27\2\u01fcq\3\2\2\2\u01fd\u01fe\5\u0094K\2\u01fe"+
		"\u0201\5L\'\2\u01ff\u0202\5x=\2\u0200\u0202\5z>\2\u0201\u01ff\3\2\2\2"+
		"\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0208\5L\'\2\u0204\u0209"+
		"\5|?\2\u0205\u0209\5~@\2\u0206\u0209\5\u0082B\2\u0207\u0209\5\u0084C\2"+
		"\u0208\u0204\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0207"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020d\5\64\33\2\u020b\u020e\5J&\2\u020c"+
		"\u020e\5.\30\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020es\3\2\2\2"+
		"\u020f\u0210\5\u0096L\2\u0210\u0213\5L\'\2\u0211\u0214\5x=\2\u0212\u0214"+
		"\5z>\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u021a\5L\'\2\u0216\u021b\5|?\2\u0217\u021b\5~@\2\u0218\u021b\5\u0082"+
		"B\2\u0219\u021b\5\u0084C\2\u021a\u0216\3\2\2\2\u021a\u0217\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021f\5\64"+
		"\33\2\u021d\u0220\5J&\2\u021e\u0220\5.\30\2\u021f\u021d\3\2\2\2\u021f"+
		"\u021e\3\2\2\2\u0220u\3\2\2\2\u0221\u0222\5\u0098M\2\u0222\u0225\5L\'"+
		"\2\u0223\u0226\5x=\2\u0224\u0226\5z>\2\u0225\u0223\3\2\2\2\u0225\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022c\5L\'\2\u0228\u022d\5|?\2\u0229"+
		"\u022d\5~@\2\u022a\u022d\5\u0082B\2\u022b\u022d\5\u0084C\2\u022c\u0228"+
		"\3\2\2\2\u022c\u0229\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u0231\5\64\33\2\u022f\u0232\5J&\2\u0230\u0232\5."+
		"\30\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232w\3\2\2\2\u0233\u0234"+
		"\7+\2\2\u0234y\3\2\2\2\u0235\u0236\7,\2\2\u0236{\3\2\2\2\u0237\u0238\7"+
		"-\2\2\u0238}\3\2\2\2\u0239\u023a\7.\2\2\u023a\177\3\2\2\2\u023b\u023c"+
		"\7/\2\2\u023c\u0081\3\2\2\2\u023d\u023e\7\60\2\2\u023e\u0083\3\2\2\2\u023f"+
		"\u0240\7\61\2\2\u0240\u0085\3\2\2\2\u0241\u0242\7\35\2\2\u0242\u0087\3"+
		"\2\2\2\u0243\u0244\7\36\2\2\u0244\u0089\3\2\2\2\u0245\u0246\7\37\2\2\u0246"+
		"\u008b\3\2\2\2\u0247\u0248\7 \2\2\u0248\u008d\3\2\2\2\u0249\u024a\7!\2"+
		"\2\u024a\u008f\3\2\2\2\u024b\u024c\7\"\2\2\u024c\u0091\3\2\2\2\u024d\u024e"+
		"\7#\2\2\u024e\u0093\3\2\2\2\u024f\u0250\7$\2\2\u0250\u0095\3\2\2\2\u0251"+
		"\u0252\7%\2\2\u0252\u0097\3\2\2\2\u0253\u0254\7&\2\2\u0254\u0099\3\2\2"+
		"\2\65\u009e\u00a0\u00a9\u00ab\u00b3\u00b7\u00bc\u00c1\u00c6\u00cb\u00d1"+
		"\u00d5\u00d7\u00de\u00e4\u00eb\u00f4\u00fb\u0104\u010b\u0114\u011b\u0136"+
		"\u015b\u0165\u018a\u0192\u019b\u01a2\u01a7\u01ad\u01b4\u01b9\u01bf\u01c6"+
		"\u01cf\u01d6\u01df\u01e6\u01eb\u01f1\u01f8\u0201\u0208\u020d\u0213\u021a"+
		"\u021f\u0225\u022c\u0231";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}