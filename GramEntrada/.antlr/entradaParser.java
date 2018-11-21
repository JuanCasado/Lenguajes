// Generated from c:\antlr\Lenguajes\GramEntrada\entradaParser.g4 by ANTLR 4.7.1
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
		RULE_targcom = 4, RULE_textos = 5, RULE_rutafichero = 6, RULE_tipo_archivo = 7, 
		RULE_json = 8, RULE_svg = 9, RULE_dot = 10, RULE_csv = 11, RULE_wsci = 12, 
		RULE_white_space = 13, RULE_barra = 14, RULE_intro = 15, RULE_letra = 16, 
		RULE_numero = 17, RULE_variable = 18, RULE_sap = 19, RULE_scp = 20, RULE_asig = 21, 
		RULE_opasig = 22, RULE_opblt = 23, RULE_opbgt = 24, RULE_coma = 25, RULE_dos_ptos = 26, 
		RULE_punto = 27, RULE_doblepunto = 28, RULE_cadena = 29, RULE_bbaja = 30, 
		RULE_cor_abrir = 31, RULE_cor_Cerrar = 32, RULE_kw_json = 33, RULE_extension_json = 34, 
		RULE_kw_svg = 35, RULE_extension_svg = 36, RULE_kw_dot = 37, RULE_extension_dot = 38, 
		RULE_kw_csv = 39, RULE_extension_csv = 40, RULE_parametros = 41, RULE_len = 42, 
		RULE_fontcolor = 43, RULE_fontname = 44, RULE_fontsize = 45, RULE_arrowsize = 46, 
		RULE_arrowcolor = 47, RULE_penwidth = 48, RULE_fillcolor = 49, RULE_style = 50, 
		RULE_shape = 51, RULE_kw_edge = 52, RULE_kw_node = 53, RULE_kw_relationship = 54, 
		RULE_kw_class = 55, RULE_kw_property = 56, RULE_kw_inheritance = 57, RULE_kw_inderect_use = 58, 
		RULE_kw_len = 59, RULE_kw_fontcolor = 60, RULE_kw_fontname = 61, RULE_kw_fontsize = 62, 
		RULE_kw_arrowsize = 63, RULE_kw_arrowcolor = 64, RULE_kw_penwidth = 65, 
		RULE_kw_fillcolor = 66, RULE_kw_style = 67, RULE_kw_shape = 68;
	public static final String[] ruleNames = {
		"fichero", "comentario", "authorcom", "descrcom", "targcom", "textos", 
		"rutafichero", "tipo_archivo", "json", "svg", "dot", "csv", "wsci", "white_space", 
		"barra", "intro", "letra", "numero", "variable", "sap", "scp", "asig", 
		"opasig", "opblt", "opbgt", "coma", "dos_ptos", "punto", "doblepunto", 
		"cadena", "bbaja", "cor_abrir", "cor_Cerrar", "kw_json", "extension_json", 
		"kw_svg", "extension_svg", "kw_dot", "extension_dot", "kw_csv", "extension_csv", 
		"parametros", "len", "fontcolor", "fontname", "fontsize", "arrowsize", 
		"arrowcolor", "penwidth", "fillcolor", "style", "shape", "kw_edge", "kw_node", 
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
	}

	public final FicheroContext fichero() throws RecognitionException {
		FicheroContext _localctx = new FicheroContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fichero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << INTRO) | (1L << WS) | (1L << KW_JSON) | (1L << KW_DOT) | (1L << KW_SVG) | (1L << KW_CSV) | (1L << LEN) | (1L << FONTCOLOR) | (1L << FONTNAME) | (1L << FONTSIZE) | (1L << ARROWSIZE) | (1L << ARROWCOLOR) | (1L << PENWIDTH) | (1L << FILLCOLOR) | (1L << STYLE) | (1L << SHAPE))) != 0)) {
				{
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_JSON:
				case KW_DOT:
				case KW_SVG:
				case KW_CSV:
					{
					setState(138);
					tipo_archivo();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
					{
					setState(139);
					comentario();
					}
					break;
				case INTRO:
				case WS:
					{
					setState(140);
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
					setState(141);
					parametros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146);
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
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
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
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comentario);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(COMENTARIOABRIR);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTRO) | (1L << TEXTOCOMENTARIO_ML) | (1L << AUTHOR) | (1L << DESCRIPTION) | (1L << TARGET) | (1L << TEXTOCOMENTARIO_UL))) != 0)) {
					{
					setState(153);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIO_ML:
					case TEXTOCOMENTARIO_UL:
						{
						setState(148);
						textos();
						}
						break;
					case AUTHOR:
						{
						setState(149);
						authorcom();
						}
						break;
					case DESCRIPTION:
						{
						setState(150);
						descrcom();
						}
						break;
					case TARGET:
						{
						setState(151);
						targcom();
						}
						break;
					case INTRO:
						{
						setState(152);
						match(INTRO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(COMENTARIOLINEA);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIO_ML || _la==TEXTOCOMENTARIO_UL) {
					{
					{
					setState(160);
					textos();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
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
	}

	public final AuthorcomContext authorcom() throws RecognitionException {
		AuthorcomContext _localctx = new AuthorcomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_authorcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(169);
					match(AUTHOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172); 
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
	}

	public final DescrcomContext descrcom() throws RecognitionException {
		DescrcomContext _localctx = new DescrcomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descrcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(174);
					match(DESCRIPTION);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177); 
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
	}

	public final TargcomContext targcom() throws RecognitionException {
		TargcomContext _localctx = new TargcomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_targcom);
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
					match(TARGET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
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

	public static class TextosContext extends ParserRuleContext {
		public List<TerminalNode> TEXTOCOMENTARIO_ML() { return getTokens(entradaParser.TEXTOCOMENTARIO_ML); }
		public TerminalNode TEXTOCOMENTARIO_ML(int i) {
			return getToken(entradaParser.TEXTOCOMENTARIO_ML, i);
		}
		public List<TerminalNode> TEXTOCOMENTARIO_UL() { return getTokens(entradaParser.TEXTOCOMENTARIO_UL); }
		public TerminalNode TEXTOCOMENTARIO_UL(int i) {
			return getToken(entradaParser.TEXTOCOMENTARIO_UL, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_textos);
		int _la;
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
				setState(187); 
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
	}

	public final RutaficheroContext rutafichero() throws RecognitionException {
		RutaficheroContext _localctx = new RutaficheroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rutafichero);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(197);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOBLEPUNTO:
						{
						setState(189);
						doblepunto();
						}
						break;
					case PUNTO:
						{
						setState(190);
						punto();
						}
						break;
					case LETRA:
						{
						setState(191);
						letra();
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_DOS_PUNTOS) {
							{
							setState(192);
							dos_ptos();
							}
						}

						}
						break;
					case IDF:
						{
						setState(195);
						variable();
						}
						break;
					case BARRA:
						{
						setState(196);
						barra();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(201);
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
	}

	public final Tipo_archivoContext tipo_archivo() throws RecognitionException {
		Tipo_archivoContext _localctx = new Tipo_archivoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_archivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_JSON:
				{
				setState(202);
				json();
				}
				break;
			case KW_SVG:
				{
				setState(203);
				svg();
				}
				break;
			case KW_DOT:
				{
				setState(204);
				dot();
				}
				break;
			case KW_CSV:
				{
				setState(205);
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
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			kw_json();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(209);
				wsci();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			asig();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(216);
				wsci();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			rutafichero();
			setState(223);
			variable();
			setState(224);
			punto();
			setState(225);
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
	}

	public final SvgContext svg() throws RecognitionException {
		SvgContext _localctx = new SvgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_svg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			kw_svg();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(228);
				wsci();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			asig();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(235);
				wsci();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			rutafichero();
			setState(242);
			variable();
			setState(243);
			punto();
			setState(244);
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
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			kw_dot();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(247);
				wsci();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			asig();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(254);
				wsci();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			rutafichero();
			setState(261);
			variable();
			setState(262);
			punto();
			setState(263);
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
	}

	public final CsvContext csv() throws RecognitionException {
		CsvContext _localctx = new CsvContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_csv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			kw_csv();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(266);
				wsci();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			asig();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(273);
				wsci();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			rutafichero();
			setState(280);
			variable();
			setState(281);
			punto();
			setState(282);
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
	}

	public final WsciContext wsci() throws RecognitionException {
		WsciContext _localctx = new WsciContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wsci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WS:
				{
				setState(284);
				white_space();
				}
				break;
			case INTRO:
				{
				setState(285);
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
	}

	public final White_spaceContext white_space() throws RecognitionException {
		White_spaceContext _localctx = new White_spaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_white_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
	}

	public final BarraContext barra() throws RecognitionException {
		BarraContext _localctx = new BarraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_barra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
	}

	public final IntroContext intro() throws RecognitionException {
		IntroContext _localctx = new IntroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_intro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
	}

	public final LetraContext letra() throws RecognitionException {
		LetraContext _localctx = new LetraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_letra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
	}

	public final SapContext sap() throws RecognitionException {
		SapContext _localctx = new SapContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
	}

	public final ScpContext scp() throws RecognitionException {
		ScpContext _localctx = new ScpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
	}

	public final OpasigContext opasig() throws RecognitionException {
		OpasigContext _localctx = new OpasigContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opasig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
	}

	public final OpbltContext opblt() throws RecognitionException {
		OpbltContext _localctx = new OpbltContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opblt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
	}

	public final OpbgtContext opbgt() throws RecognitionException {
		OpbgtContext _localctx = new OpbgtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opbgt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
	}

	public final Dos_ptosContext dos_ptos() throws RecognitionException {
		Dos_ptosContext _localctx = new Dos_ptosContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dos_ptos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
	}

	public final DoblepuntoContext doblepunto() throws RecognitionException {
		DoblepuntoContext _localctx = new DoblepuntoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doblepunto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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

	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode CADENA_ABRIR() { return getToken(entradaParser.CADENA_ABRIR, 0); }
		public TerminalNode CADENA_CERRAR() { return getToken(entradaParser.CADENA_CERRAR, 0); }
		public List<TerminalNode> TEXTO_CADENA() { return getTokens(entradaParser.TEXTO_CADENA); }
		public TerminalNode TEXTO_CADENA(int i) {
			return getToken(entradaParser.TEXTO_CADENA, i);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(CADENA_ABRIR);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTO_CADENA) {
				{
				{
				setState(321);
				match(TEXTO_CADENA);
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
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

	public static class BbajaContext extends ParserRuleContext {
		public TerminalNode BBAJA() { return getToken(entradaParser.BBAJA, 0); }
		public BbajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbaja; }
	}

	public final BbajaContext bbaja() throws RecognitionException {
		BbajaContext _localctx = new BbajaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bbaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
	}

	public final Cor_abrirContext cor_abrir() throws RecognitionException {
		Cor_abrirContext _localctx = new Cor_abrirContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cor_abrir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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
	}

	public final Cor_CerrarContext cor_Cerrar() throws RecognitionException {
		Cor_CerrarContext _localctx = new Cor_CerrarContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cor_Cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
	}

	public final Kw_jsonContext kw_json() throws RecognitionException {
		Kw_jsonContext _localctx = new Kw_jsonContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_kw_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
	}

	public final Extension_jsonContext extension_json() throws RecognitionException {
		Extension_jsonContext _localctx = new Extension_jsonContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_extension_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
	}

	public final Kw_svgContext kw_svg() throws RecognitionException {
		Kw_svgContext _localctx = new Kw_svgContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kw_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
	}

	public final Extension_svgContext extension_svg() throws RecognitionException {
		Extension_svgContext _localctx = new Extension_svgContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_extension_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
	}

	public final Kw_dotContext kw_dot() throws RecognitionException {
		Kw_dotContext _localctx = new Kw_dotContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_kw_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
	}

	public final Extension_dotContext extension_dot() throws RecognitionException {
		Extension_dotContext _localctx = new Extension_dotContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_extension_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
	}

	public final Kw_csvContext kw_csv() throws RecognitionException {
		Kw_csvContext _localctx = new Kw_csvContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kw_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
	}

	public final Extension_csvContext extension_csv() throws RecognitionException {
		Extension_csvContext _localctx = new Extension_csvContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_extension_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(351);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(352);
				fontcolor();
				}
				break;
			case FONTNAME:
				{
				setState(353);
				fontname();
				}
				break;
			case FONTSIZE:
				{
				setState(354);
				fontsize();
				}
				break;
			case ARROWSIZE:
				{
				setState(355);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(356);
				arrowcolor();
				}
				break;
			case PENWIDTH:
				{
				setState(357);
				penwidth();
				}
				break;
			case FILLCOLOR:
				{
				setState(358);
				fillcolor();
				}
				break;
			case STYLE:
				{
				setState(359);
				style();
				}
				break;
			case SHAPE:
				{
				setState(360);
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
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			kw_len();
			setState(364);
			bbaja();
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(365);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(366);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(367);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(368);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(371);
			asig();
			setState(372);
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
	}

	public final FontcolorContext fontcolor() throws RecognitionException {
		FontcolorContext _localctx = new FontcolorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			kw_fontcolor();
			setState(375);
			bbaja();
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(376);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(377);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(380);
			bbaja();
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(381);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(382);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(383);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(384);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(387);
			asig();
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(388);
				cadena();
				}
				break;
			case IDF:
				{
				setState(389);
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
	}

	public final FontnameContext fontname() throws RecognitionException {
		FontnameContext _localctx = new FontnameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			kw_fontname();
			setState(393);
			bbaja();
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
			setState(398);
			bbaja();
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(399);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(400);
				kw_class();
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
			setState(405);
			asig();
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(406);
				cadena();
				}
				break;
			case IDF:
				{
				setState(407);
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
	}

	public final FontsizeContext fontsize() throws RecognitionException {
		FontsizeContext _localctx = new FontsizeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			kw_fontsize();
			setState(411);
			bbaja();
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(412);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(413);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(416);
			bbaja();
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(417);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(418);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(419);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(420);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(423);
			asig();
			setState(424);
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
	}

	public final ArrowsizeContext arrowsize() throws RecognitionException {
		ArrowsizeContext _localctx = new ArrowsizeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			kw_arrowsize();
			setState(427);
			bbaja();
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(428);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(429);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(432);
			bbaja();
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(433);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(434);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(435);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(436);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(439);
			asig();
			setState(440);
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
	}

	public final ArrowcolorContext arrowcolor() throws RecognitionException {
		ArrowcolorContext _localctx = new ArrowcolorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			kw_arrowcolor();
			setState(443);
			bbaja();
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(444);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(445);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(448);
			bbaja();
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(449);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(450);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(451);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(452);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(455);
			asig();
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(456);
				cadena();
				}
				break;
			case IDF:
				{
				setState(457);
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
	}

	public final PenwidthContext penwidth() throws RecognitionException {
		PenwidthContext _localctx = new PenwidthContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			kw_penwidth();
			setState(461);
			bbaja();
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(462);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(463);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(466);
			bbaja();
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(467);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(468);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(469);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(470);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(473);
			asig();
			setState(474);
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
	}

	public final FillcolorContext fillcolor() throws RecognitionException {
		FillcolorContext _localctx = new FillcolorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			kw_fillcolor();
			setState(477);
			bbaja();
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(478);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(479);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(482);
			bbaja();
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(483);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(484);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(485);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(486);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(489);
			asig();
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(490);
				cadena();
				}
				break;
			case IDF:
				{
				setState(491);
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
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			kw_style();
			setState(495);
			bbaja();
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(496);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(497);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(500);
			bbaja();
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(501);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(502);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(503);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(504);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(507);
			asig();
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(508);
				cadena();
				}
				break;
			case IDF:
				{
				setState(509);
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
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			kw_shape();
			setState(513);
			bbaja();
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(514);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(515);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(518);
			bbaja();
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(519);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(520);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(521);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(522);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(525);
			asig();
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(526);
				cadena();
				}
				break;
			case IDF:
				{
				setState(527);
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
		public TerminalNode EDGE() { return getToken(entradaParser.EDGE, 0); }
		public Kw_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_edge; }
	}

	public final Kw_edgeContext kw_edge() throws RecognitionException {
		Kw_edgeContext _localctx = new Kw_edgeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_kw_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
	}

	public final Kw_nodeContext kw_node() throws RecognitionException {
		Kw_nodeContext _localctx = new Kw_nodeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_kw_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
	}

	public final Kw_relationshipContext kw_relationship() throws RecognitionException {
		Kw_relationshipContext _localctx = new Kw_relationshipContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_kw_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
	}

	public final Kw_classContext kw_class() throws RecognitionException {
		Kw_classContext _localctx = new Kw_classContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_kw_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
	}

	public final Kw_propertyContext kw_property() throws RecognitionException {
		Kw_propertyContext _localctx = new Kw_propertyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_kw_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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
	}

	public final Kw_inheritanceContext kw_inheritance() throws RecognitionException {
		Kw_inheritanceContext _localctx = new Kw_inheritanceContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_kw_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
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
	}

	public final Kw_inderect_useContext kw_inderect_use() throws RecognitionException {
		Kw_inderect_useContext _localctx = new Kw_inderect_useContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_kw_inderect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
	}

	public final Kw_lenContext kw_len() throws RecognitionException {
		Kw_lenContext _localctx = new Kw_lenContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_kw_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
	}

	public final Kw_fontcolorContext kw_fontcolor() throws RecognitionException {
		Kw_fontcolorContext _localctx = new Kw_fontcolorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_kw_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
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
	}

	public final Kw_fontnameContext kw_fontname() throws RecognitionException {
		Kw_fontnameContext _localctx = new Kw_fontnameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_kw_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
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
	}

	public final Kw_fontsizeContext kw_fontsize() throws RecognitionException {
		Kw_fontsizeContext _localctx = new Kw_fontsizeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_kw_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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
	}

	public final Kw_arrowsizeContext kw_arrowsize() throws RecognitionException {
		Kw_arrowsizeContext _localctx = new Kw_arrowsizeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_kw_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
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
	}

	public final Kw_arrowcolorContext kw_arrowcolor() throws RecognitionException {
		Kw_arrowcolorContext _localctx = new Kw_arrowcolorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_kw_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
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
	}

	public final Kw_penwidthContext kw_penwidth() throws RecognitionException {
		Kw_penwidthContext _localctx = new Kw_penwidthContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_kw_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
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
	}

	public final Kw_fillcolorContext kw_fillcolor() throws RecognitionException {
		Kw_fillcolorContext _localctx = new Kw_fillcolorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_kw_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
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
	}

	public final Kw_styleContext kw_style() throws RecognitionException {
		Kw_styleContext _localctx = new Kw_styleContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_kw_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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
	}

	public final Kw_shapeContext kw_shape() throws RecognitionException {
		Kw_shapeContext _localctx = new Kw_shapeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_kw_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0237\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\7\2\u0091\n\2\f\2\16\2\u0094\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u009c\n"+
		"\3\f\3\16\3\u009f\13\3\3\3\3\3\3\3\7\3\u00a4\n\3\f\3\16\3\u00a7\13\3\3"+
		"\3\5\3\u00aa\n\3\3\4\6\4\u00ad\n\4\r\4\16\4\u00ae\3\5\6\5\u00b2\n\5\r"+
		"\5\16\5\u00b3\3\6\6\6\u00b7\n\6\r\6\16\6\u00b8\3\7\6\7\u00bc\n\7\r\7\16"+
		"\7\u00bd\3\b\3\b\3\b\3\b\5\b\u00c4\n\b\3\b\3\b\7\b\u00c8\n\b\f\b\16\b"+
		"\u00cb\13\b\3\t\3\t\3\t\3\t\5\t\u00d1\n\t\3\n\3\n\7\n\u00d5\n\n\f\n\16"+
		"\n\u00d8\13\n\3\n\3\n\7\n\u00dc\n\n\f\n\16\n\u00df\13\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\7\13\u00e8\n\13\f\13\16\13\u00eb\13\13\3\13\3\13\7\13"+
		"\u00ef\n\13\f\13\16\13\u00f2\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7"+
		"\f\u00fb\n\f\f\f\16\f\u00fe\13\f\3\f\3\f\7\f\u0102\n\f\f\f\16\f\u0105"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u010e\n\r\f\r\16\r\u0111\13\r\3"+
		"\r\3\r\7\r\u0115\n\r\f\r\16\r\u0118\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\5\16\u0121\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\7\37\u0145\n\37\f\37\16"+
		"\37\u0148\13\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u016c\n+\3"+
		",\3,\3,\3,\3,\3,\5,\u0174\n,\3,\3,\3,\3-\3-\3-\3-\5-\u017d\n-\3-\3-\3"+
		"-\3-\3-\5-\u0184\n-\3-\3-\3-\5-\u0189\n-\3.\3.\3.\3.\5.\u018f\n.\3.\3"+
		".\3.\3.\3.\5.\u0196\n.\3.\3.\3.\5.\u019b\n.\3/\3/\3/\3/\5/\u01a1\n/\3"+
		"/\3/\3/\3/\3/\5/\u01a8\n/\3/\3/\3/\3\60\3\60\3\60\3\60\5\60\u01b1\n\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u01b8\n\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\5\61\u01c1\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u01c8\n\61\3\61\3"+
		"\61\3\61\5\61\u01cd\n\61\3\62\3\62\3\62\3\62\5\62\u01d3\n\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u01da\n\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63"+
		"\u01e3\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u01ea\n\63\3\63\3\63\3\63\5"+
		"\63\u01ef\n\63\3\64\3\64\3\64\3\64\5\64\u01f5\n\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u01fc\n\64\3\64\3\64\3\64\5\64\u0201\n\64\3\65\3\65\3\65\3"+
		"\65\5\65\u0207\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u020e\n\65\3\65\3\65"+
		"\3\65\5\65\u0213\n\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\2\2G"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\2\3\4"+
		"\2\64\6499\2\u0249\2\u0092\3\2\2\2\4\u00a9\3\2\2\2\6\u00ac\3\2\2\2\b\u00b1"+
		"\3\2\2\2\n\u00b6\3\2\2\2\f\u00bb\3\2\2\2\16\u00c9\3\2\2\2\20\u00d0\3\2"+
		"\2\2\22\u00d2\3\2\2\2\24\u00e5\3\2\2\2\26\u00f8\3\2\2\2\30\u010b\3\2\2"+
		"\2\32\u0120\3\2\2\2\34\u0122\3\2\2\2\36\u0124\3\2\2\2 \u0126\3\2\2\2\""+
		"\u0128\3\2\2\2$\u012a\3\2\2\2&\u012c\3\2\2\2(\u012e\3\2\2\2*\u0130\3\2"+
		"\2\2,\u0132\3\2\2\2.\u0134\3\2\2\2\60\u0136\3\2\2\2\62\u0138\3\2\2\2\64"+
		"\u013a\3\2\2\2\66\u013c\3\2\2\28\u013e\3\2\2\2:\u0140\3\2\2\2<\u0142\3"+
		"\2\2\2>\u014b\3\2\2\2@\u014d\3\2\2\2B\u014f\3\2\2\2D\u0151\3\2\2\2F\u0153"+
		"\3\2\2\2H\u0155\3\2\2\2J\u0157\3\2\2\2L\u0159\3\2\2\2N\u015b\3\2\2\2P"+
		"\u015d\3\2\2\2R\u015f\3\2\2\2T\u016b\3\2\2\2V\u016d\3\2\2\2X\u0178\3\2"+
		"\2\2Z\u018a\3\2\2\2\\\u019c\3\2\2\2^\u01ac\3\2\2\2`\u01bc\3\2\2\2b\u01ce"+
		"\3\2\2\2d\u01de\3\2\2\2f\u01f0\3\2\2\2h\u0202\3\2\2\2j\u0214\3\2\2\2l"+
		"\u0216\3\2\2\2n\u0218\3\2\2\2p\u021a\3\2\2\2r\u021c\3\2\2\2t\u021e\3\2"+
		"\2\2v\u0220\3\2\2\2x\u0222\3\2\2\2z\u0224\3\2\2\2|\u0226\3\2\2\2~\u0228"+
		"\3\2\2\2\u0080\u022a\3\2\2\2\u0082\u022c\3\2\2\2\u0084\u022e\3\2\2\2\u0086"+
		"\u0230\3\2\2\2\u0088\u0232\3\2\2\2\u008a\u0234\3\2\2\2\u008c\u0091\5\20"+
		"\t\2\u008d\u0091\5\4\3\2\u008e\u0091\5\32\16\2\u008f\u0091\5T+\2\u0090"+
		"\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\3\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u009d\7\3\2\2\u0096\u009c\5\f\7\2"+
		"\u0097\u009c\5\6\4\2\u0098\u009c\5\b\5\2\u0099\u009c\5\n\6\2\u009a\u009c"+
		"\7\13\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00aa\7\63\2\2\u00a1\u00a5\7\4\2\2\u00a2\u00a4\5\f\7\2\u00a3\u00a2\3"+
		"\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\78\2\2\u00a9\u0095\3\2"+
		"\2\2\u00a9\u00a1\3\2\2\2\u00aa\5\3\2\2\2\u00ab\u00ad\7\65\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\7\3\2\2\2\u00b0\u00b2\7\66\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\t\3\2\2\2\u00b5\u00b7"+
		"\7\67\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\13\3\2\2\2\u00ba\u00bc\t\2\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\r\3\2\2\2\u00bf\u00c8\5:\36\2\u00c0\u00c8\58\35\2\u00c1\u00c3\5\"\22"+
		"\2\u00c2\u00c4\5\66\34\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c8\3\2\2\2\u00c5\u00c8\5&\24\2\u00c6\u00c8\5\36\20\2\u00c7\u00bf\3"+
		"\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\17\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d1\5\22\n\2\u00cd\u00d1"+
		"\5\24\13\2\u00ce\u00d1\5\26\f\2\u00cf\u00d1\5\30\r\2\u00d0\u00cc\3\2\2"+
		"\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\21"+
		"\3\2\2\2\u00d2\u00d6\5D#\2\u00d3\u00d5\5\32\16\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dd\5,\27\2\u00da\u00dc\5\32\16\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\5\16\b\2\u00e1"+
		"\u00e2\5&\24\2\u00e2\u00e3\58\35\2\u00e3\u00e4\5F$\2\u00e4\23\3\2\2\2"+
		"\u00e5\u00e9\5H%\2\u00e6\u00e8\5\32\16\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00f0\5,\27\2\u00ed\u00ef\5\32\16\2\u00ee\u00ed\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\5\16\b\2\u00f4\u00f5\5"+
		"&\24\2\u00f5\u00f6\58\35\2\u00f6\u00f7\5J&\2\u00f7\25\3\2\2\2\u00f8\u00fc"+
		"\5L\'\2\u00f9\u00fb\5\32\16\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0103\5,\27\2\u0100\u0102\5\32\16\2\u0101\u0100\3\2\2\2"+
		"\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\5\16\b\2\u0107\u0108\5&\24\2"+
		"\u0108\u0109\58\35\2\u0109\u010a\5N(\2\u010a\27\3\2\2\2\u010b\u010f\5"+
		"P)\2\u010c\u010e\5\32\16\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0116\5,\27\2\u0113\u0115\5\32\16\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0119\u011a\5\16\b\2\u011a\u011b\5&\24\2\u011b"+
		"\u011c\58\35\2\u011c\u011d\5R*\2\u011d\31\3\2\2\2\u011e\u0121\5\34\17"+
		"\2\u011f\u0121\5 \21\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\33"+
		"\3\2\2\2\u0122\u0123\7\27\2\2\u0123\35\3\2\2\2\u0124\u0125\7\30\2\2\u0125"+
		"\37\3\2\2\2\u0126\u0127\7\13\2\2\u0127!\3\2\2\2\u0128\u0129\7\7\2\2\u0129"+
		"#\3\2\2\2\u012a\u012b\7\6\2\2\u012b%\3\2\2\2\u012c\u012d\7\62\2\2\u012d"+
		"\'\3\2\2\2\u012e\u012f\7\16\2\2\u012f)\3\2\2\2\u0130\u0131\7\17\2\2\u0131"+
		"+\3\2\2\2\u0132\u0133\7\20\2\2\u0133-\3\2\2\2\u0134\u0135\7\21\2\2\u0135"+
		"/\3\2\2\2\u0136\u0137\7\f\2\2\u0137\61\3\2\2\2\u0138\u0139\7\r\2\2\u0139"+
		"\63\3\2\2\2\u013a\u013b\7\b\2\2\u013b\65\3\2\2\2\u013c\u013d\7\25\2\2"+
		"\u013d\67\3\2\2\2\u013e\u013f\7\n\2\2\u013f9\3\2\2\2\u0140\u0141\7\t\2"+
		"\2\u0141;\3\2\2\2\u0142\u0146\7\5\2\2\u0143\u0145\7;\2\2\u0144\u0143\3"+
		"\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7:\2\2\u014a=\3\2\2\2\u014b"+
		"\u014c\7\22\2\2\u014c?\3\2\2\2\u014d\u014e\7\23\2\2\u014eA\3\2\2\2\u014f"+
		"\u0150\7\24\2\2\u0150C\3\2\2\2\u0151\u0152\7\31\2\2\u0152E\3\2\2\2\u0153"+
		"\u0154\7\'\2\2\u0154G\3\2\2\2\u0155\u0156\7\33\2\2\u0156I\3\2\2\2\u0157"+
		"\u0158\7(\2\2\u0158K\3\2\2\2\u0159\u015a\7\32\2\2\u015aM\3\2\2\2\u015b"+
		"\u015c\7)\2\2\u015cO\3\2\2\2\u015d\u015e\7\34\2\2\u015eQ\3\2\2\2\u015f"+
		"\u0160\7*\2\2\u0160S\3\2\2\2\u0161\u016c\5V,\2\u0162\u016c\5X-\2\u0163"+
		"\u016c\5Z.\2\u0164\u016c\5\\/\2\u0165\u016c\5^\60\2\u0166\u016c\5`\61"+
		"\2\u0167\u016c\5b\62\2\u0168\u016c\5d\63\2\u0169\u016c\5f\64\2\u016a\u016c"+
		"\5h\65\2\u016b\u0161\3\2\2\2\u016b\u0162\3\2\2\2\u016b\u0163\3\2\2\2\u016b"+
		"\u0164\3\2\2\2\u016b\u0165\3\2\2\2\u016b\u0166\3\2\2\2\u016b\u0167\3\2"+
		"\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c"+
		"U\3\2\2\2\u016d\u016e\5x=\2\u016e\u0173\5> \2\u016f\u0174\5n8\2\u0170"+
		"\u0174\5p9\2\u0171\u0174\5t;\2\u0172\u0174\5v<\2\u0173\u016f\3\2\2\2\u0173"+
		"\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0176\5,\27\2\u0176\u0177\5$\23\2\u0177W\3\2\2\2\u0178\u0179"+
		"\5z>\2\u0179\u017c\5> \2\u017a\u017d\5j\66\2\u017b\u017d\5l\67\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0183\5>"+
		" \2\u017f\u0184\5n8\2\u0180\u0184\5p9\2\u0181\u0184\5t;\2\u0182\u0184"+
		"\5v<\2\u0183\u017f\3\2\2\2\u0183\u0180\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0188\5,\27\2\u0186\u0189\5<"+
		"\37\2\u0187\u0189\5&\24\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189"+
		"Y\3\2\2\2\u018a\u018b\5|?\2\u018b\u018e\5> \2\u018c\u018f\5j\66\2\u018d"+
		"\u018f\5l\67\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0195\5> \2\u0191\u0196\5n8\2\u0192\u0196\5p9\2\u0193\u0196"+
		"\5t;\2\u0194\u0196\5v<\2\u0195\u0191\3\2\2\2\u0195\u0192\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019a\5,"+
		"\27\2\u0198\u019b\5<\37\2\u0199\u019b\5&\24\2\u019a\u0198\3\2\2\2\u019a"+
		"\u0199\3\2\2\2\u019b[\3\2\2\2\u019c\u019d\5~@\2\u019d\u01a0\5> \2\u019e"+
		"\u01a1\5j\66\2\u019f\u01a1\5l\67\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a7\5> \2\u01a3\u01a8\5n8\2\u01a4\u01a8"+
		"\5p9\2\u01a5\u01a8\5t;\2\u01a6\u01a8\5v<\2\u01a7\u01a3\3\2\2\2\u01a7\u01a4"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\5,\27\2\u01aa\u01ab\5$\23\2\u01ab]\3\2\2\2\u01ac\u01ad\5\u0080"+
		"A\2\u01ad\u01b0\5> \2\u01ae\u01b1\5j\66\2\u01af\u01b1\5l\67\2\u01b0\u01ae"+
		"\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b7\5> \2\u01b3"+
		"\u01b8\5n8\2\u01b4\u01b8\5p9\2\u01b5\u01b8\5t;\2\u01b6\u01b8\5v<\2\u01b7"+
		"\u01b3\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\5,\27\2\u01ba\u01bb\5$\23\2\u01bb"+
		"_\3\2\2\2\u01bc\u01bd\5\u0082B\2\u01bd\u01c0\5> \2\u01be\u01c1\5j\66\2"+
		"\u01bf\u01c1\5l\67\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c7\5> \2\u01c3\u01c8\5n8\2\u01c4\u01c8\5p9\2\u01c5\u01c8"+
		"\5t;\2\u01c6\u01c8\5v<\2\u01c7\u01c3\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cc\5,"+
		"\27\2\u01ca\u01cd\5<\37\2\u01cb\u01cd\5&\24\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cb\3\2\2\2\u01cda\3\2\2\2\u01ce\u01cf\5\u0084C\2\u01cf\u01d2\5> \2"+
		"\u01d0\u01d3\5j\66\2\u01d1\u01d3\5l\67\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d9\5> \2\u01d5\u01da\5n8\2\u01d6"+
		"\u01da\5p9\2\u01d7\u01da\5t;\2\u01d8\u01da\5v<\2\u01d9\u01d5\3\2\2\2\u01d9"+
		"\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dc\5,\27\2\u01dc\u01dd\5$\23\2\u01ddc\3\2\2\2\u01de\u01df"+
		"\5\u0086D\2\u01df\u01e2\5> \2\u01e0\u01e3\5j\66\2\u01e1\u01e3\5l\67\2"+
		"\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e9"+
		"\5> \2\u01e5\u01ea\5n8\2\u01e6\u01ea\5p9\2\u01e7\u01ea\5t;\2\u01e8\u01ea"+
		"\5v<\2\u01e9\u01e5\3\2\2\2\u01e9\u01e6\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ee\5,\27\2\u01ec\u01ef\5<"+
		"\37\2\u01ed\u01ef\5&\24\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"e\3\2\2\2\u01f0\u01f1\5\u0088E\2\u01f1\u01f4\5> \2\u01f2\u01f5\5j\66\2"+
		"\u01f3\u01f5\5l\67\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01fb\5> \2\u01f7\u01fc\5n8\2\u01f8\u01fc\5p9\2\u01f9\u01fc"+
		"\5t;\2\u01fa\u01fc\5v<\2\u01fb\u01f7\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200\5,"+
		"\27\2\u01fe\u0201\5<\37\2\u01ff\u0201\5&\24\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201g\3\2\2\2\u0202\u0203\5\u008aF\2\u0203\u0206\5> \2"+
		"\u0204\u0207\5j\66\2\u0205\u0207\5l\67\2\u0206\u0204\3\2\2\2\u0206\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020d\5> \2\u0209\u020e\5n8\2\u020a"+
		"\u020e\5p9\2\u020b\u020e\5t;\2\u020c\u020e\5v<\2\u020d\u0209\3\2\2\2\u020d"+
		"\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0212\5,\27\2\u0210\u0213\5<\37\2\u0211\u0213\5&\24\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213i\3\2\2\2\u0214\u0215\7+\2\2\u0215"+
		"k\3\2\2\2\u0216\u0217\7,\2\2\u0217m\3\2\2\2\u0218\u0219\7-\2\2\u0219o"+
		"\3\2\2\2\u021a\u021b\7.\2\2\u021bq\3\2\2\2\u021c\u021d\7/\2\2\u021ds\3"+
		"\2\2\2\u021e\u021f\7\60\2\2\u021fu\3\2\2\2\u0220\u0221\7\61\2\2\u0221"+
		"w\3\2\2\2\u0222\u0223\7\35\2\2\u0223y\3\2\2\2\u0224\u0225\7\36\2\2\u0225"+
		"{\3\2\2\2\u0226\u0227\7\37\2\2\u0227}\3\2\2\2\u0228\u0229\7 \2\2\u0229"+
		"\177\3\2\2\2\u022a\u022b\7!\2\2\u022b\u0081\3\2\2\2\u022c\u022d\7\"\2"+
		"\2\u022d\u0083\3\2\2\2\u022e\u022f\7#\2\2\u022f\u0085\3\2\2\2\u0230\u0231"+
		"\7$\2\2\u0231\u0087\3\2\2\2\u0232\u0233\7%\2\2\u0233\u0089\3\2\2\2\u0234"+
		"\u0235\7&\2\2\u0235\u008b\3\2\2\2\64\u0090\u0092\u009b\u009d\u00a5\u00a9"+
		"\u00ae\u00b3\u00b8\u00bd\u00c3\u00c7\u00c9\u00d0\u00d6\u00dd\u00e9\u00f0"+
		"\u00fc\u0103\u010f\u0116\u0120\u0146\u016b\u0173\u017c\u0183\u0188\u018e"+
		"\u0195\u019a\u01a0\u01a7\u01b0\u01b7\u01c0\u01c7\u01cc\u01d2\u01d9\u01e2"+
		"\u01e9\u01ee\u01f4\u01fb\u0200\u0206\u020d\u0212";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}