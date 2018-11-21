// Generated from entradaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class entradaParser extends Parser {
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
		RULE_fichero = 0, RULE_comentario = 1, RULE_authorcom = 2, RULE_descrcom = 3, 
		RULE_targcom = 4, RULE_texto_comen = 5, RULE_rutafichero = 6, RULE_tipo_archivo = 7, 
		RULE_json = 8, RULE_svg = 9, RULE_dot = 10, RULE_csv = 11, RULE_wsci = 12, 
		RULE_white_space = 13, RULE_barra = 14, RULE_intro = 15, RULE_letra = 16, 
		RULE_numero = 17, RULE_variable = 18, RULE_sap = 19, RULE_scp = 20, RULE_asig = 21, 
		RULE_opasig = 22, RULE_opblt = 23, RULE_opbgt = 24, RULE_coma = 25, RULE_dos_ptos = 26, 
		RULE_punto = 27, RULE_doblepunto = 28, RULE_texto_cadena = 29, RULE_cadena_abrir = 30, 
		RULE_cadena_cerrar = 31, RULE_cadena = 32, RULE_bbaja = 33, RULE_cor_abrir = 34, 
		RULE_cor_Cerrar = 35, RULE_kw_json = 36, RULE_extension_json = 37, RULE_kw_svg = 38, 
		RULE_extension_svg = 39, RULE_kw_dot = 40, RULE_extension_dot = 41, RULE_kw_csv = 42, 
		RULE_extension_csv = 43, RULE_parametros = 44, RULE_value = 45, RULE_len = 46, 
		RULE_fontcolor = 47, RULE_fontname = 48, RULE_fontsize = 49, RULE_arrowsize = 50, 
		RULE_arrowcolor = 51, RULE_penwidth = 52, RULE_fillcolor = 53, RULE_style = 54, 
		RULE_shape = 55, RULE_tipo_estruc = 56, RULE_kw_edge = 57, RULE_kw_node = 58, 
		RULE_kw_relationship = 59, RULE_kw_class = 60, RULE_kw_property = 61, 
		RULE_kw_inheritance = 62, RULE_kw_inderect_use = 63, RULE_kw_len = 64, 
		RULE_kw_fontcolor = 65, RULE_kw_fontname = 66, RULE_kw_fontsize = 67, 
		RULE_kw_arrowsize = 68, RULE_kw_arrowcolor = 69, RULE_kw_penwidth = 70, 
		RULE_kw_fillcolor = 71, RULE_kw_style = 72, RULE_kw_shape = 73;
	public static final String[] ruleNames = {
		"fichero", "comentario", "authorcom", "descrcom", "targcom", "texto_comen", 
		"rutafichero", "tipo_archivo", "json", "svg", "dot", "csv", "wsci", "white_space", 
		"barra", "intro", "letra", "numero", "variable", "sap", "scp", "asig", 
		"opasig", "opblt", "opbgt", "coma", "dos_ptos", "punto", "doblepunto", 
		"texto_cadena", "cadena_abrir", "cadena_cerrar", "cadena", "bbaja", "cor_abrir", 
		"cor_Cerrar", "kw_json", "extension_json", "kw_svg", "extension_svg", 
		"kw_dot", "extension_dot", "kw_csv", "extension_csv", "parametros", "value", 
		"len", "fontcolor", "fontname", "fontsize", "arrowsize", "arrowcolor", 
		"penwidth", "fillcolor", "style", "shape", "tipo_estruc", "kw_edge", "kw_node", 
		"kw_relationship", "kw_class", "kw_property", "kw_inheritance", "kw_inderect_use", 
		"kw_len", "kw_fontcolor", "kw_fontname", "kw_fontsize", "kw_arrowsize", 
		"kw_arrowcolor", "kw_penwidth", "kw_fillcolor", "kw_style", "kw_shape"
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
	public String getGrammarFileName() { return "entradaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public entradaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FicheroContext extends ParserRuleContext {
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
		public FicheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fichero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterFichero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitFichero(this);
		}
	}

	public final FicheroContext fichero() throws RecognitionException {
		FicheroContext _localctx = new FicheroContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fichero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << INTRO) | (1L << WS) | (1L << KW_JSON) | (1L << KW_DOT) | (1L << KW_SVG) | (1L << KW_CSV) | (1L << LEN) | (1L << FONTCOLOR) | (1L << FONTNAME) | (1L << FONTSIZE) | (1L << ARROWSIZE) | (1L << ARROWCOLOR) | (1L << PENWIDTH) | (1L << FILLCOLOR) | (1L << STYLE) | (1L << SHAPE))) != 0)) {
				{
				setState(152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_JSON:
				case KW_DOT:
				case KW_SVG:
				case KW_CSV:
					{
					setState(148);
					tipo_archivo();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
					{
					setState(149);
					comentario();
					}
					break;
				case INTRO:
				case WS:
					{
					setState(150);
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
					setState(151);
					parametros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(156);
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
		public TerminalNode COMENTARIOABRIR() { return getToken(entradaParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(entradaParser.COMENTARIOCERRAR, 0); }
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
		public List<TerminalNode> INTRO() { return getTokens(entradaParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(entradaParser.INTRO, i);
		}
		public TerminalNode COMENTARIOLINEA() { return getToken(entradaParser.COMENTARIOLINEA, 0); }
		public TerminalNode FINAL_COMENTARIO_UL() { return getToken(entradaParser.FINAL_COMENTARIO_UL, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comentario);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(COMENTARIOABRIR);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTRO) | (1L << TEXTOCOMENTARIO_ML) | (1L << AUTHOR) | (1L << DESCRIPTION) | (1L << TARGET) | (1L << TEXTOCOMENTARIO_UL))) != 0)) {
					{
					setState(163);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIO_ML:
					case TEXTOCOMENTARIO_UL:
						{
						setState(158);
						texto_comen();
						}
						break;
					case AUTHOR:
						{
						setState(159);
						authorcom();
						}
						break;
					case DESCRIPTION:
						{
						setState(160);
						descrcom();
						}
						break;
					case TARGET:
						{
						setState(161);
						targcom();
						}
						break;
					case INTRO:
						{
						setState(162);
						match(INTRO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(COMENTARIOLINEA);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIO_ML || _la==TEXTOCOMENTARIO_UL) {
					{
					{
					setState(170);
					texto_comen();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
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
		public List<TerminalNode> AUTHOR() { return getTokens(entradaParser.AUTHOR); }
		public TerminalNode AUTHOR(int i) {
			return getToken(entradaParser.AUTHOR, i);
		}
		public AuthorcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterAuthorcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitAuthorcom(this);
		}
	}

	public final AuthorcomContext authorcom() throws RecognitionException {
		AuthorcomContext _localctx = new AuthorcomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_authorcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(179);
					match(AUTHOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
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
		public List<TerminalNode> DESCRIPTION() { return getTokens(entradaParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(entradaParser.DESCRIPTION, i);
		}
		public DescrcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descrcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterDescrcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitDescrcom(this);
		}
	}

	public final DescrcomContext descrcom() throws RecognitionException {
		DescrcomContext _localctx = new DescrcomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descrcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(184);
					match(DESCRIPTION);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187); 
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
		public List<TerminalNode> TARGET() { return getTokens(entradaParser.TARGET); }
		public TerminalNode TARGET(int i) {
			return getToken(entradaParser.TARGET, i);
		}
		public TargcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterTargcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitTargcom(this);
		}
	}

	public final TargcomContext targcom() throws RecognitionException {
		TargcomContext _localctx = new TargcomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_targcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(189);
					match(TARGET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
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
		public List<TerminalNode> TEXTOCOMENTARIO_ML() { return getTokens(entradaParser.TEXTOCOMENTARIO_ML); }
		public TerminalNode TEXTOCOMENTARIO_ML(int i) {
			return getToken(entradaParser.TEXTOCOMENTARIO_ML, i);
		}
		public List<TerminalNode> TEXTOCOMENTARIO_UL() { return getTokens(entradaParser.TEXTOCOMENTARIO_UL); }
		public TerminalNode TEXTOCOMENTARIO_UL(int i) {
			return getToken(entradaParser.TEXTOCOMENTARIO_UL, i);
		}
		public Texto_comenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto_comen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterTexto_comen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitTexto_comen(this);
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
			setState(195); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(194);
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
				setState(197); 
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterRutafichero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitRutafichero(this);
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
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(207);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOBLEPUNTO:
						{
						setState(199);
						doblepunto();
						}
						break;
					case PUNTO:
						{
						setState(200);
						punto();
						}
						break;
					case LETRA:
						{
						setState(201);
						letra();
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_DOS_PUNTOS) {
							{
							setState(202);
							dos_ptos();
							}
						}

						}
						break;
					case IDF:
						{
						setState(205);
						variable();
						}
						break;
					case BARRA:
						{
						setState(206);
						barra();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(211);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterTipo_archivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitTipo_archivo(this);
		}
	}

	public final Tipo_archivoContext tipo_archivo() throws RecognitionException {
		Tipo_archivoContext _localctx = new Tipo_archivoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_archivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_JSON:
				{
				setState(212);
				json();
				}
				break;
			case KW_SVG:
				{
				setState(213);
				svg();
				}
				break;
			case KW_DOT:
				{
				setState(214);
				dot();
				}
				break;
			case KW_CSV:
				{
				setState(215);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			kw_json();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(219);
				wsci();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			asig();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(226);
				wsci();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			rutafichero();
			setState(233);
			variable();
			setState(234);
			punto();
			setState(235);
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

	public static class SvgContext extends ParserRuleContext {
		public Kw_svgContext kw_svg() {
			return getRuleContext(Kw_svgContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterSvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitSvg(this);
		}
	}

	public final SvgContext svg() throws RecognitionException {
		SvgContext _localctx = new SvgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_svg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			kw_svg();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(238);
				wsci();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			asig();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(245);
				wsci();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			rutafichero();
			setState(252);
			variable();
			setState(253);
			punto();
			setState(254);
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

	public static class DotContext extends ParserRuleContext {
		public Kw_dotContext kw_dot() {
			return getRuleContext(Kw_dotContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			kw_dot();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(257);
				wsci();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			asig();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(264);
				wsci();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			rutafichero();
			setState(271);
			variable();
			setState(272);
			punto();
			setState(273);
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

	public static class CsvContext extends ParserRuleContext {
		public Kw_csvContext kw_csv() {
			return getRuleContext(Kw_csvContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterCsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitCsv(this);
		}
	}

	public final CsvContext csv() throws RecognitionException {
		CsvContext _localctx = new CsvContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_csv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			kw_csv();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(276);
				wsci();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			asig();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(283);
				wsci();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			rutafichero();
			setState(290);
			variable();
			setState(291);
			punto();
			setState(292);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterWsci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitWsci(this);
		}
	}

	public final WsciContext wsci() throws RecognitionException {
		WsciContext _localctx = new WsciContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wsci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WS:
				{
				setState(294);
				white_space();
				}
				break;
			case INTRO:
				{
				setState(295);
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
		public TerminalNode WS() { return getToken(entradaParser.WS, 0); }
		public White_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_white_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterWhite_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitWhite_space(this);
		}
	}

	public final White_spaceContext white_space() throws RecognitionException {
		White_spaceContext _localctx = new White_spaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_white_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		public TerminalNode BARRA() { return getToken(entradaParser.BARRA, 0); }
		public BarraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterBarra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitBarra(this);
		}
	}

	public final BarraContext barra() throws RecognitionException {
		BarraContext _localctx = new BarraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_barra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		public TerminalNode INTRO() { return getToken(entradaParser.INTRO, 0); }
		public IntroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitIntro(this);
		}
	}

	public final IntroContext intro() throws RecognitionException {
		IntroContext _localctx = new IntroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_intro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		public TerminalNode LETRA() { return getToken(entradaParser.LETRA, 0); }
		public LetraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterLetra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitLetra(this);
		}
	}

	public final LetraContext letra() throws RecognitionException {
		LetraContext _localctx = new LetraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_letra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		public TerminalNode INT() { return getToken(entradaParser.INT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		public TerminalNode IDF() { return getToken(entradaParser.IDF, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		public TerminalNode SAP() { return getToken(entradaParser.SAP, 0); }
		public SapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterSap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitSap(this);
		}
	}

	public final SapContext sap() throws RecognitionException {
		SapContext _localctx = new SapContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		public TerminalNode SCP() { return getToken(entradaParser.SCP, 0); }
		public ScpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterScp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitScp(this);
		}
	}

	public final ScpContext scp() throws RecognitionException {
		ScpContext _localctx = new ScpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
		public TerminalNode ASIG() { return getToken(entradaParser.ASIG, 0); }
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitAsig(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		public TerminalNode OPASIG() { return getToken(entradaParser.OPASIG, 0); }
		public OpasigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opasig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterOpasig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitOpasig(this);
		}
	}

	public final OpasigContext opasig() throws RecognitionException {
		OpasigContext _localctx = new OpasigContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opasig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		public TerminalNode OPBLT() { return getToken(entradaParser.OPBLT, 0); }
		public OpbltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opblt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterOpblt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitOpblt(this);
		}
	}

	public final OpbltContext opblt() throws RecognitionException {
		OpbltContext _localctx = new OpbltContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opblt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		public TerminalNode OPBGT() { return getToken(entradaParser.OPBGT, 0); }
		public OpbgtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbgt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterOpbgt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitOpbgt(this);
		}
	}

	public final OpbgtContext opbgt() throws RecognitionException {
		OpbgtContext _localctx = new OpbgtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opbgt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		public TerminalNode COMA() { return getToken(entradaParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
		public TerminalNode KW_DOS_PUNTOS() { return getToken(entradaParser.KW_DOS_PUNTOS, 0); }
		public Dos_ptosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos_ptos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterDos_ptos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitDos_ptos(this);
		}
	}

	public final Dos_ptosContext dos_ptos() throws RecognitionException {
		Dos_ptosContext _localctx = new Dos_ptosContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dos_ptos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
		public TerminalNode PUNTO() { return getToken(entradaParser.PUNTO, 0); }
		public PuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterPunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitPunto(this);
		}
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
		public TerminalNode DOBLEPUNTO() { return getToken(entradaParser.DOBLEPUNTO, 0); }
		public DoblepuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doblepunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterDoblepunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitDoblepunto(this);
		}
	}

	public final DoblepuntoContext doblepunto() throws RecognitionException {
		DoblepuntoContext _localctx = new DoblepuntoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doblepunto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		public List<TerminalNode> TEXTO_CADENA() { return getTokens(entradaParser.TEXTO_CADENA); }
		public TerminalNode TEXTO_CADENA(int i) {
			return getToken(entradaParser.TEXTO_CADENA, i);
		}
		public Texto_cadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterTexto_cadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitTexto_cadena(this);
		}
	}

	public final Texto_cadenaContext texto_cadena() throws RecognitionException {
		Texto_cadenaContext _localctx = new Texto_cadenaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_texto_cadena);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(330);
					match(TEXTO_CADENA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(333); 
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
		public TerminalNode CADENA_ABRIR() { return getToken(entradaParser.CADENA_ABRIR, 0); }
		public Cadena_abrirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena_abrir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterCadena_abrir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitCadena_abrir(this);
		}
	}

	public final Cadena_abrirContext cadena_abrir() throws RecognitionException {
		Cadena_abrirContext _localctx = new Cadena_abrirContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cadena_abrir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		public TerminalNode CADENA_CERRAR() { return getToken(entradaParser.CADENA_CERRAR, 0); }
		public Cadena_cerrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena_cerrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterCadena_cerrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitCadena_cerrar(this);
		}
	}

	public final Cadena_cerrarContext cadena_cerrar() throws RecognitionException {
		Cadena_cerrarContext _localctx = new Cadena_cerrarContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cadena_cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitCadena(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			cadena_abrir();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTO_CADENA) {
				{
				{
				setState(340);
				texto_cadena();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
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
		public TerminalNode BBAJA() { return getToken(entradaParser.BBAJA, 0); }
		public BbajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbaja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterBbaja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitBbaja(this);
		}
	}

	public final BbajaContext bbaja() throws RecognitionException {
		BbajaContext _localctx = new BbajaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bbaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		public TerminalNode COR_ABRIR() { return getToken(entradaParser.COR_ABRIR, 0); }
		public Cor_abrirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_abrir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterCor_abrir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitCor_abrir(this);
		}
	}

	public final Cor_abrirContext cor_abrir() throws RecognitionException {
		Cor_abrirContext _localctx = new Cor_abrirContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cor_abrir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		public TerminalNode COR_CERRAR() { return getToken(entradaParser.COR_CERRAR, 0); }
		public Cor_CerrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_Cerrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterCor_Cerrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitCor_Cerrar(this);
		}
	}

	public final Cor_CerrarContext cor_Cerrar() throws RecognitionException {
		Cor_CerrarContext _localctx = new Cor_CerrarContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cor_Cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		public TerminalNode KW_JSON() { return getToken(entradaParser.KW_JSON, 0); }
		public Kw_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_json(this);
		}
	}

	public final Kw_jsonContext kw_json() throws RecognitionException {
		Kw_jsonContext _localctx = new Kw_jsonContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_kw_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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
		public TerminalNode EXTENSION_JSON() { return getToken(entradaParser.EXTENSION_JSON, 0); }
		public Extension_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterExtension_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitExtension_json(this);
		}
	}

	public final Extension_jsonContext extension_json() throws RecognitionException {
		Extension_jsonContext _localctx = new Extension_jsonContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_extension_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		public TerminalNode KW_SVG() { return getToken(entradaParser.KW_SVG, 0); }
		public Kw_svgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_svg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_svg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_svg(this);
		}
	}

	public final Kw_svgContext kw_svg() throws RecognitionException {
		Kw_svgContext _localctx = new Kw_svgContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kw_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		public TerminalNode EXTENSION_SVG() { return getToken(entradaParser.EXTENSION_SVG, 0); }
		public Extension_svgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_svg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterExtension_svg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitExtension_svg(this);
		}
	}

	public final Extension_svgContext extension_svg() throws RecognitionException {
		Extension_svgContext _localctx = new Extension_svgContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_extension_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		public TerminalNode KW_DOT() { return getToken(entradaParser.KW_DOT, 0); }
		public Kw_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_dot(this);
		}
	}

	public final Kw_dotContext kw_dot() throws RecognitionException {
		Kw_dotContext _localctx = new Kw_dotContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_kw_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		public TerminalNode EXTENSION_DOT() { return getToken(entradaParser.EXTENSION_DOT, 0); }
		public Extension_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterExtension_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitExtension_dot(this);
		}
	}

	public final Extension_dotContext extension_dot() throws RecognitionException {
		Extension_dotContext _localctx = new Extension_dotContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_extension_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		public TerminalNode KW_CSV() { return getToken(entradaParser.KW_CSV, 0); }
		public Kw_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_csv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_csv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_csv(this);
		}
	}

	public final Kw_csvContext kw_csv() throws RecognitionException {
		Kw_csvContext _localctx = new Kw_csvContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_kw_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		public TerminalNode EXTENSION_CSV() { return getToken(entradaParser.EXTENSION_CSV, 0); }
		public Extension_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_csv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterExtension_csv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitExtension_csv(this);
		}
	}

	public final Extension_csvContext extension_csv() throws RecognitionException {
		Extension_csvContext _localctx = new Extension_csvContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_extension_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(370);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(371);
				fontcolor();
				}
				break;
			case FONTNAME:
				{
				setState(372);
				fontname();
				}
				break;
			case FONTSIZE:
				{
				setState(373);
				fontsize();
				}
				break;
			case ARROWSIZE:
				{
				setState(374);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(375);
				arrowcolor();
				}
				break;
			case PENWIDTH:
				{
				setState(376);
				penwidth();
				}
				break;
			case FILLCOLOR:
				{
				setState(377);
				fillcolor();
				}
				break;
			case STYLE:
				{
				setState(378);
				style();
				}
				break;
			case SHAPE:
				{
				setState(379);
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

	public static class ValueContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(382);
				cadena();
				}
				break;
			case IDF:
				{
				setState(383);
				variable();
				}
				break;
			case INT:
				{
				setState(384);
				numero();
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitLen(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			kw_len();
			setState(388);
			bbaja();
			setState(389);
			tipo_estruc();
			setState(390);
			asig();
			setState(391);
			value();
			}
		}
		catch (RecognitionException re) {
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterFontcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitFontcolor(this);
		}
	}

	public final FontcolorContext fontcolor() throws RecognitionException {
		FontcolorContext _localctx = new FontcolorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			kw_fontcolor();
			setState(394);
			bbaja();
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(395);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(396);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(399);
			bbaja();
			setState(400);
			tipo_estruc();
			setState(401);
			asig();
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(402);
				cadena();
				}
				break;
			case IDF:
				{
				setState(403);
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterFontname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitFontname(this);
		}
	}

	public final FontnameContext fontname() throws RecognitionException {
		FontnameContext _localctx = new FontnameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			kw_fontname();
			setState(407);
			bbaja();
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(408);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(409);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(412);
			bbaja();
			setState(413);
			tipo_estruc();
			setState(414);
			asig();
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(415);
				cadena();
				}
				break;
			case IDF:
				{
				setState(416);
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
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
		public FontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterFontsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitFontsize(this);
		}
	}

	public final FontsizeContext fontsize() throws RecognitionException {
		FontsizeContext _localctx = new FontsizeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			kw_fontsize();
			setState(420);
			bbaja();
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(421);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(422);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(425);
			bbaja();
			setState(426);
			tipo_estruc();
			setState(427);
			asig();
			setState(428);
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
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
		public ArrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterArrowsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitArrowsize(this);
		}
	}

	public final ArrowsizeContext arrowsize() throws RecognitionException {
		ArrowsizeContext _localctx = new ArrowsizeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			kw_arrowsize();
			setState(431);
			bbaja();
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(432);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(433);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(436);
			bbaja();
			setState(437);
			tipo_estruc();
			setState(438);
			asig();
			setState(439);
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterArrowcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitArrowcolor(this);
		}
	}

	public final ArrowcolorContext arrowcolor() throws RecognitionException {
		ArrowcolorContext _localctx = new ArrowcolorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			kw_arrowcolor();
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
			setState(448);
			tipo_estruc();
			setState(449);
			asig();
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(450);
				cadena();
				}
				break;
			case IDF:
				{
				setState(451);
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
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
		public PenwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterPenwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitPenwidth(this);
		}
	}

	public final PenwidthContext penwidth() throws RecognitionException {
		PenwidthContext _localctx = new PenwidthContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			kw_penwidth();
			setState(455);
			bbaja();
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(456);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(457);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(460);
			bbaja();
			setState(461);
			tipo_estruc();
			setState(462);
			asig();
			setState(463);
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterFillcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitFillcolor(this);
		}
	}

	public final FillcolorContext fillcolor() throws RecognitionException {
		FillcolorContext _localctx = new FillcolorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			kw_fillcolor();
			setState(466);
			bbaja();
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(467);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(468);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(471);
			bbaja();
			setState(472);
			tipo_estruc();
			setState(473);
			asig();
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(474);
				cadena();
				}
				break;
			case IDF:
				{
				setState(475);
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitStyle(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			kw_style();
			setState(479);
			bbaja();
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(480);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(481);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(484);
			bbaja();
			setState(485);
			tipo_estruc();
			setState(486);
			asig();
			setState(487);
			value();
			}
		}
		catch (RecognitionException re) {
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
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
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
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitShape(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			kw_shape();
			setState(490);
			bbaja();
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(491);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(492);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(495);
			bbaja();
			setState(496);
			tipo_estruc();
			setState(497);
			asig();
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(498);
				cadena();
				}
				break;
			case IDF:
				{
				setState(499);
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

	public static class Tipo_estrucContext extends ParserRuleContext {
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
		public Tipo_estrucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estruc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterTipo_estruc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitTipo_estruc(this);
		}
	}

	public final Tipo_estrucContext tipo_estruc() throws RecognitionException {
		Tipo_estrucContext _localctx = new Tipo_estrucContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tipo_estruc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(502);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(503);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(504);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(505);
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
		public TerminalNode EDGE() { return getToken(entradaParser.EDGE, 0); }
		public Kw_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_edge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_edge(this);
		}
	}

	public final Kw_edgeContext kw_edge() throws RecognitionException {
		Kw_edgeContext _localctx = new Kw_edgeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_kw_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		public TerminalNode NODE() { return getToken(entradaParser.NODE, 0); }
		public Kw_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_node(this);
		}
	}

	public final Kw_nodeContext kw_node() throws RecognitionException {
		Kw_nodeContext _localctx = new Kw_nodeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_kw_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		public TerminalNode RELATIONSHIP() { return getToken(entradaParser.RELATIONSHIP, 0); }
		public Kw_relationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_relationship; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_relationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_relationship(this);
		}
	}

	public final Kw_relationshipContext kw_relationship() throws RecognitionException {
		Kw_relationshipContext _localctx = new Kw_relationshipContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_kw_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		public TerminalNode CLASS() { return getToken(entradaParser.CLASS, 0); }
		public Kw_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_class(this);
		}
	}

	public final Kw_classContext kw_class() throws RecognitionException {
		Kw_classContext _localctx = new Kw_classContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_kw_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		public TerminalNode PROPERTY() { return getToken(entradaParser.PROPERTY, 0); }
		public Kw_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_property(this);
		}
	}

	public final Kw_propertyContext kw_property() throws RecognitionException {
		Kw_propertyContext _localctx = new Kw_propertyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_kw_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		public TerminalNode INHERITANCE() { return getToken(entradaParser.INHERITANCE, 0); }
		public Kw_inheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_inheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_inheritance(this);
		}
	}

	public final Kw_inheritanceContext kw_inheritance() throws RecognitionException {
		Kw_inheritanceContext _localctx = new Kw_inheritanceContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_kw_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		public TerminalNode INDERECT_USE() { return getToken(entradaParser.INDERECT_USE, 0); }
		public Kw_inderect_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inderect_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_inderect_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_inderect_use(this);
		}
	}

	public final Kw_inderect_useContext kw_inderect_use() throws RecognitionException {
		Kw_inderect_useContext _localctx = new Kw_inderect_useContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_kw_inderect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		public TerminalNode LEN() { return getToken(entradaParser.LEN, 0); }
		public Kw_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_len(this);
		}
	}

	public final Kw_lenContext kw_len() throws RecognitionException {
		Kw_lenContext _localctx = new Kw_lenContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_kw_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
		public TerminalNode FONTCOLOR() { return getToken(entradaParser.FONTCOLOR, 0); }
		public Kw_fontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fontcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_fontcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_fontcolor(this);
		}
	}

	public final Kw_fontcolorContext kw_fontcolor() throws RecognitionException {
		Kw_fontcolorContext _localctx = new Kw_fontcolorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_kw_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		public TerminalNode FONTNAME() { return getToken(entradaParser.FONTNAME, 0); }
		public Kw_fontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fontname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_fontname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_fontname(this);
		}
	}

	public final Kw_fontnameContext kw_fontname() throws RecognitionException {
		Kw_fontnameContext _localctx = new Kw_fontnameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_kw_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		public TerminalNode FONTSIZE() { return getToken(entradaParser.FONTSIZE, 0); }
		public Kw_fontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fontsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_fontsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_fontsize(this);
		}
	}

	public final Kw_fontsizeContext kw_fontsize() throws RecognitionException {
		Kw_fontsizeContext _localctx = new Kw_fontsizeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_kw_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		public TerminalNode ARROWSIZE() { return getToken(entradaParser.ARROWSIZE, 0); }
		public Kw_arrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_arrowsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_arrowsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_arrowsize(this);
		}
	}

	public final Kw_arrowsizeContext kw_arrowsize() throws RecognitionException {
		Kw_arrowsizeContext _localctx = new Kw_arrowsizeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_kw_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		public TerminalNode ARROWCOLOR() { return getToken(entradaParser.ARROWCOLOR, 0); }
		public Kw_arrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_arrowcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_arrowcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_arrowcolor(this);
		}
	}

	public final Kw_arrowcolorContext kw_arrowcolor() throws RecognitionException {
		Kw_arrowcolorContext _localctx = new Kw_arrowcolorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_kw_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
		public TerminalNode PENWIDTH() { return getToken(entradaParser.PENWIDTH, 0); }
		public Kw_penwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_penwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_penwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_penwidth(this);
		}
	}

	public final Kw_penwidthContext kw_penwidth() throws RecognitionException {
		Kw_penwidthContext _localctx = new Kw_penwidthContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_kw_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		public TerminalNode FILLCOLOR() { return getToken(entradaParser.FILLCOLOR, 0); }
		public Kw_fillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fillcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_fillcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_fillcolor(this);
		}
	}

	public final Kw_fillcolorContext kw_fillcolor() throws RecognitionException {
		Kw_fillcolorContext _localctx = new Kw_fillcolorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_kw_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		public TerminalNode STYLE() { return getToken(entradaParser.STYLE, 0); }
		public Kw_styleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_style(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_style(this);
		}
	}

	public final Kw_styleContext kw_style() throws RecognitionException {
		Kw_styleContext _localctx = new Kw_styleContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_kw_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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
		public TerminalNode SHAPE() { return getToken(entradaParser.SHAPE, 0); }
		public Kw_shapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterKw_shape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitKw_shape(this);
		}
	}

	public final Kw_shapeContext kw_shape() throws RecognitionException {
		Kw_shapeContext _localctx = new Kw_shapeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_kw_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0221\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\7\2\u009b\n\2\f\2\16\2\u009e\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3\u00a6\n\3\f\3\16\3\u00a9\13\3\3\3\3\3\3\3\7\3"+
		"\u00ae\n\3\f\3\16\3\u00b1\13\3\3\3\5\3\u00b4\n\3\3\4\6\4\u00b7\n\4\r\4"+
		"\16\4\u00b8\3\5\6\5\u00bc\n\5\r\5\16\5\u00bd\3\6\6\6\u00c1\n\6\r\6\16"+
		"\6\u00c2\3\7\6\7\u00c6\n\7\r\7\16\7\u00c7\3\b\3\b\3\b\3\b\5\b\u00ce\n"+
		"\b\3\b\3\b\7\b\u00d2\n\b\f\b\16\b\u00d5\13\b\3\t\3\t\3\t\3\t\5\t\u00db"+
		"\n\t\3\n\3\n\7\n\u00df\n\n\f\n\16\n\u00e2\13\n\3\n\3\n\7\n\u00e6\n\n\f"+
		"\n\16\n\u00e9\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u00f2\n\13\f\13"+
		"\16\13\u00f5\13\13\3\13\3\13\7\13\u00f9\n\13\f\13\16\13\u00fc\13\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0105\n\f\f\f\16\f\u0108\13\f\3\f"+
		"\3\f\7\f\u010c\n\f\f\f\16\f\u010f\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r"+
		"\u0118\n\r\f\r\16\r\u011b\13\r\3\r\3\r\7\r\u011f\n\r\f\r\16\r\u0122\13"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u012b\n\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\6\37\u014e\n\37\r\37\16\37\u014f\3 \3 \3!\3!\3\"\3\"\7\"\u0158\n\""+
		"\f\"\16\"\u015b\13\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u017f\n."+
		"\3/\3/\3/\5/\u0184\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\5\61\u0190\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u0197\n\61\3\62\3\62\3"+
		"\62\3\62\5\62\u019d\n\62\3\62\3\62\3\62\3\62\3\62\5\62\u01a4\n\62\3\63"+
		"\3\63\3\63\3\63\5\63\u01aa\n\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\5\64\u01b5\n\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65"+
		"\u01c0\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u01c7\n\65\3\66\3\66\3\66\3"+
		"\66\5\66\u01cd\n\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67"+
		"\u01d8\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u01df\n\67\38\38\38\38\58\u01e5"+
		"\n8\38\38\38\38\38\39\39\39\39\59\u01f0\n9\39\39\39\39\39\59\u01f7\n9"+
		"\3:\3:\3:\3:\5:\u01fd\n:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B"+
		"\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3K\2\2L\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\2\3\4\2\64\6499\2\u0215\2\u009c\3\2\2\2\4\u00b3\3\2"+
		"\2\2\6\u00b6\3\2\2\2\b\u00bb\3\2\2\2\n\u00c0\3\2\2\2\f\u00c5\3\2\2\2\16"+
		"\u00d3\3\2\2\2\20\u00da\3\2\2\2\22\u00dc\3\2\2\2\24\u00ef\3\2\2\2\26\u0102"+
		"\3\2\2\2\30\u0115\3\2\2\2\32\u012a\3\2\2\2\34\u012c\3\2\2\2\36\u012e\3"+
		"\2\2\2 \u0130\3\2\2\2\"\u0132\3\2\2\2$\u0134\3\2\2\2&\u0136\3\2\2\2(\u0138"+
		"\3\2\2\2*\u013a\3\2\2\2,\u013c\3\2\2\2.\u013e\3\2\2\2\60\u0140\3\2\2\2"+
		"\62\u0142\3\2\2\2\64\u0144\3\2\2\2\66\u0146\3\2\2\28\u0148\3\2\2\2:\u014a"+
		"\3\2\2\2<\u014d\3\2\2\2>\u0151\3\2\2\2@\u0153\3\2\2\2B\u0155\3\2\2\2D"+
		"\u015e\3\2\2\2F\u0160\3\2\2\2H\u0162\3\2\2\2J\u0164\3\2\2\2L\u0166\3\2"+
		"\2\2N\u0168\3\2\2\2P\u016a\3\2\2\2R\u016c\3\2\2\2T\u016e\3\2\2\2V\u0170"+
		"\3\2\2\2X\u0172\3\2\2\2Z\u017e\3\2\2\2\\\u0183\3\2\2\2^\u0185\3\2\2\2"+
		"`\u018b\3\2\2\2b\u0198\3\2\2\2d\u01a5\3\2\2\2f\u01b0\3\2\2\2h\u01bb\3"+
		"\2\2\2j\u01c8\3\2\2\2l\u01d3\3\2\2\2n\u01e0\3\2\2\2p\u01eb\3\2\2\2r\u01fc"+
		"\3\2\2\2t\u01fe\3\2\2\2v\u0200\3\2\2\2x\u0202\3\2\2\2z\u0204\3\2\2\2|"+
		"\u0206\3\2\2\2~\u0208\3\2\2\2\u0080\u020a\3\2\2\2\u0082\u020c\3\2\2\2"+
		"\u0084\u020e\3\2\2\2\u0086\u0210\3\2\2\2\u0088\u0212\3\2\2\2\u008a\u0214"+
		"\3\2\2\2\u008c\u0216\3\2\2\2\u008e\u0218\3\2\2\2\u0090\u021a\3\2\2\2\u0092"+
		"\u021c\3\2\2\2\u0094\u021e\3\2\2\2\u0096\u009b\5\20\t\2\u0097\u009b\5"+
		"\4\3\2\u0098\u009b\5\32\16\2\u0099\u009b\5Z.\2\u009a\u0096\3\2\2\2\u009a"+
		"\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\3\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a7\7\3\2\2\u00a0\u00a6\5\f\7\2\u00a1\u00a6\5\6\4\2\u00a2"+
		"\u00a6\5\b\5\2\u00a3\u00a6\5\n\6\2\u00a4\u00a6\7\13\2\2\u00a5\u00a0\3"+
		"\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00b4\7\63\2\2\u00ab"+
		"\u00af\7\4\2\2\u00ac\u00ae\5\f\7\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b4\78\2\2\u00b3\u009f\3\2\2\2\u00b3\u00ab\3\2"+
		"\2\2\u00b4\5\3\2\2\2\u00b5\u00b7\7\65\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\7\3\2\2\2\u00ba"+
		"\u00bc\7\66\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\t\3\2\2\2\u00bf\u00c1\7\67\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\13\3\2\2\2\u00c4\u00c6\t\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\r\3\2\2\2\u00c9"+
		"\u00d2\5:\36\2\u00ca\u00d2\58\35\2\u00cb\u00cd\5\"\22\2\u00cc\u00ce\5"+
		"\66\34\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d2\3\2\2\2\u00cf"+
		"\u00d2\5&\24\2\u00d0\u00d2\5\36\20\2\u00d1\u00c9\3\2\2\2\u00d1\u00ca\3"+
		"\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\17\3\2\2"+
		"\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\5\22\n\2\u00d7\u00db\5\24\13\2\u00d8"+
		"\u00db\5\26\f\2\u00d9\u00db\5\30\r\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\21\3\2\2\2\u00dc"+
		"\u00e0\5J&\2\u00dd\u00df\5\32\16\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e7\5,\27\2\u00e4\u00e6\5\32\16\2\u00e5\u00e4\3"+
		"\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\16\b\2\u00eb\u00ec\5"+
		"&\24\2\u00ec\u00ed\58\35\2\u00ed\u00ee\5L\'\2\u00ee\23\3\2\2\2\u00ef\u00f3"+
		"\5N(\2\u00f0\u00f2\5\32\16\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00fa\5,\27\2\u00f7\u00f9\5\32\16\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5\16\b\2\u00fe\u00ff\5&\24\2\u00ff"+
		"\u0100\58\35\2\u0100\u0101\5P)\2\u0101\25\3\2\2\2\u0102\u0106\5R*\2\u0103"+
		"\u0105\5\32\16\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010d\5,\27\2\u010a\u010c\5\32\16\2\u010b\u010a\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\5\16\b\2\u0111\u0112\5&\24\2\u0112\u0113\5"+
		"8\35\2\u0113\u0114\5T+\2\u0114\27\3\2\2\2\u0115\u0119\5V,\2\u0116\u0118"+
		"\5\32\16\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0120"+
		"\5,\27\2\u011d\u011f\5\32\16\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0124\5\16\b\2\u0124\u0125\5&\24\2\u0125\u0126\58\35\2"+
		"\u0126\u0127\5X-\2\u0127\31\3\2\2\2\u0128\u012b\5\34\17\2\u0129\u012b"+
		"\5 \21\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\33\3\2\2\2\u012c"+
		"\u012d\7\27\2\2\u012d\35\3\2\2\2\u012e\u012f\7\30\2\2\u012f\37\3\2\2\2"+
		"\u0130\u0131\7\13\2\2\u0131!\3\2\2\2\u0132\u0133\7\7\2\2\u0133#\3\2\2"+
		"\2\u0134\u0135\7\6\2\2\u0135%\3\2\2\2\u0136\u0137\7\62\2\2\u0137\'\3\2"+
		"\2\2\u0138\u0139\7\16\2\2\u0139)\3\2\2\2\u013a\u013b\7\17\2\2\u013b+\3"+
		"\2\2\2\u013c\u013d\7\20\2\2\u013d-\3\2\2\2\u013e\u013f\7\21\2\2\u013f"+
		"/\3\2\2\2\u0140\u0141\7\f\2\2\u0141\61\3\2\2\2\u0142\u0143\7\r\2\2\u0143"+
		"\63\3\2\2\2\u0144\u0145\7\b\2\2\u0145\65\3\2\2\2\u0146\u0147\7\25\2\2"+
		"\u0147\67\3\2\2\2\u0148\u0149\7\n\2\2\u01499\3\2\2\2\u014a\u014b\7\t\2"+
		"\2\u014b;\3\2\2\2\u014c\u014e\7;\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3"+
		"\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150=\3\2\2\2\u0151\u0152"+
		"\7\5\2\2\u0152?\3\2\2\2\u0153\u0154\7:\2\2\u0154A\3\2\2\2\u0155\u0159"+
		"\5> \2\u0156\u0158\5<\37\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u015d\5@!\2\u015dC\3\2\2\2\u015e\u015f\7\22\2\2\u015fE\3\2"+
		"\2\2\u0160\u0161\7\23\2\2\u0161G\3\2\2\2\u0162\u0163\7\24\2\2\u0163I\3"+
		"\2\2\2\u0164\u0165\7\31\2\2\u0165K\3\2\2\2\u0166\u0167\7\'\2\2\u0167M"+
		"\3\2\2\2\u0168\u0169\7\33\2\2\u0169O\3\2\2\2\u016a\u016b\7(\2\2\u016b"+
		"Q\3\2\2\2\u016c\u016d\7\32\2\2\u016dS\3\2\2\2\u016e\u016f\7)\2\2\u016f"+
		"U\3\2\2\2\u0170\u0171\7\34\2\2\u0171W\3\2\2\2\u0172\u0173\7*\2\2\u0173"+
		"Y\3\2\2\2\u0174\u017f\5^\60\2\u0175\u017f\5`\61\2\u0176\u017f\5b\62\2"+
		"\u0177\u017f\5d\63\2\u0178\u017f\5f\64\2\u0179\u017f\5h\65\2\u017a\u017f"+
		"\5j\66\2\u017b\u017f\5l\67\2\u017c\u017f\5n8\2\u017d\u017f\5p9\2\u017e"+
		"\u0174\3\2\2\2\u017e\u0175\3\2\2\2\u017e\u0176\3\2\2\2\u017e\u0177\3\2"+
		"\2\2\u017e\u0178\3\2\2\2\u017e\u0179\3\2\2\2\u017e\u017a\3\2\2\2\u017e"+
		"\u017b\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f[\3\2\2\2"+
		"\u0180\u0184\5B\"\2\u0181\u0184\5&\24\2\u0182\u0184\5$\23\2\u0183\u0180"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184]\3\2\2\2\u0185"+
		"\u0186\5\u0082B\2\u0186\u0187\5D#\2\u0187\u0188\5r:\2\u0188\u0189\5,\27"+
		"\2\u0189\u018a\5\\/\2\u018a_\3\2\2\2\u018b\u018c\5\u0084C\2\u018c\u018f"+
		"\5D#\2\u018d\u0190\5t;\2\u018e\u0190\5v<\2\u018f\u018d\3\2\2\2\u018f\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\5D#\2\u0192\u0193\5r:\2\u0193"+
		"\u0196\5,\27\2\u0194\u0197\5B\"\2\u0195\u0197\5&\24\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0195\3\2\2\2\u0197a\3\2\2\2\u0198\u0199\5\u0086D\2\u0199\u019c"+
		"\5D#\2\u019a\u019d\5t;\2\u019b\u019d\5v<\2\u019c\u019a\3\2\2\2\u019c\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\5D#\2\u019f\u01a0\5r:\2\u01a0"+
		"\u01a3\5,\27\2\u01a1\u01a4\5B\"\2\u01a2\u01a4\5&\24\2\u01a3\u01a1\3\2"+
		"\2\2\u01a3\u01a2\3\2\2\2\u01a4c\3\2\2\2\u01a5\u01a6\5\u0088E\2\u01a6\u01a9"+
		"\5D#\2\u01a7\u01aa\5t;\2\u01a8\u01aa\5v<\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\5D#\2\u01ac\u01ad\5r:\2\u01ad"+
		"\u01ae\5,\27\2\u01ae\u01af\5$\23\2\u01afe\3\2\2\2\u01b0\u01b1\5\u008a"+
		"F\2\u01b1\u01b4\5D#\2\u01b2\u01b5\5t;\2\u01b3\u01b5\5v<\2\u01b4\u01b2"+
		"\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\5D#\2\u01b7"+
		"\u01b8\5r:\2\u01b8\u01b9\5,\27\2\u01b9\u01ba\5$\23\2\u01bag\3\2\2\2\u01bb"+
		"\u01bc\5\u008cG\2\u01bc\u01bf\5D#\2\u01bd\u01c0\5t;\2\u01be\u01c0\5v<"+
		"\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\5D#\2\u01c2\u01c3\5r:\2\u01c3\u01c6\5,\27\2\u01c4\u01c7\5B\"\2\u01c5"+
		"\u01c7\5&\24\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7i\3\2\2\2"+
		"\u01c8\u01c9\5\u008eH\2\u01c9\u01cc\5D#\2\u01ca\u01cd\5t;\2\u01cb\u01cd"+
		"\5v<\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\5D#\2\u01cf\u01d0\5r:\2\u01d0\u01d1\5,\27\2\u01d1\u01d2\5$\23\2"+
		"\u01d2k\3\2\2\2\u01d3\u01d4\5\u0090I\2\u01d4\u01d7\5D#\2\u01d5\u01d8\5"+
		"t;\2\u01d6\u01d8\5v<\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\5D#\2\u01da\u01db\5r:\2\u01db\u01de\5,\27\2\u01dc"+
		"\u01df\5B\"\2\u01dd\u01df\5&\24\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2"+
		"\2\2\u01dfm\3\2\2\2\u01e0\u01e1\5\u0092J\2\u01e1\u01e4\5D#\2\u01e2\u01e5"+
		"\5t;\2\u01e3\u01e5\5v<\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\5D#\2\u01e7\u01e8\5r:\2\u01e8\u01e9\5,\27\2"+
		"\u01e9\u01ea\5\\/\2\u01eao\3\2\2\2\u01eb\u01ec\5\u0094K\2\u01ec\u01ef"+
		"\5D#\2\u01ed\u01f0\5t;\2\u01ee\u01f0\5v<\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5D#\2\u01f2\u01f3\5r:\2\u01f3"+
		"\u01f6\5,\27\2\u01f4\u01f7\5B\"\2\u01f5\u01f7\5&\24\2\u01f6\u01f4\3\2"+
		"\2\2\u01f6\u01f5\3\2\2\2\u01f7q\3\2\2\2\u01f8\u01fd\5x=\2\u01f9\u01fd"+
		"\5z>\2\u01fa\u01fd\5~@\2\u01fb\u01fd\5\u0080A\2\u01fc\u01f8\3\2\2\2\u01fc"+
		"\u01f9\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fds\3\2\2\2"+
		"\u01fe\u01ff\7+\2\2\u01ffu\3\2\2\2\u0200\u0201\7,\2\2\u0201w\3\2\2\2\u0202"+
		"\u0203\7-\2\2\u0203y\3\2\2\2\u0204\u0205\7.\2\2\u0205{\3\2\2\2\u0206\u0207"+
		"\7/\2\2\u0207}\3\2\2\2\u0208\u0209\7\60\2\2\u0209\177\3\2\2\2\u020a\u020b"+
		"\7\61\2\2\u020b\u0081\3\2\2\2\u020c\u020d\7\35\2\2\u020d\u0083\3\2\2\2"+
		"\u020e\u020f\7\36\2\2\u020f\u0085\3\2\2\2\u0210\u0211\7\37\2\2\u0211\u0087"+
		"\3\2\2\2\u0212\u0213\7 \2\2\u0213\u0089\3\2\2\2\u0214\u0215\7!\2\2\u0215"+
		"\u008b\3\2\2\2\u0216\u0217\7\"\2\2\u0217\u008d\3\2\2\2\u0218\u0219\7#"+
		"\2\2\u0219\u008f\3\2\2\2\u021a\u021b\7$\2\2\u021b\u0091\3\2\2\2\u021c"+
		"\u021d\7%\2\2\u021d\u0093\3\2\2\2\u021e\u021f\7&\2\2\u021f\u0095\3\2\2"+
		"\2,\u009a\u009c\u00a5\u00a7\u00af\u00b3\u00b8\u00bd\u00c2\u00c7\u00cd"+
		"\u00d1\u00d3\u00da\u00e0\u00e7\u00f3\u00fa\u0106\u010d\u0119\u0120\u012a"+
		"\u014f\u0159\u017e\u0183\u018f\u0196\u019c\u01a3\u01a9\u01b4\u01bf\u01c6"+
		"\u01cc\u01d7\u01de\u01e4\u01ef\u01f6\u01fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}