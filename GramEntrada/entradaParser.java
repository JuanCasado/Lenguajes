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
		ASIG=14, OPASIG=15, KW_DOS_PUNTOS=16, TERMINADOR=17, WS=18, BARRA=19, 
		KW_JSON=20, KW_DOT=21, KW_SVG=22, KW_CSV=23, LEN=24, FONTCOLOR=25, FONTNAME=26, 
		FONTSIZE=27, ARROWSIZE=28, ARROWCOLOR=29, PENWIDTH=30, FILLCOLOR=31, STYLE=32, 
		SHAPE=33, EXTENSION_JSON=34, EXTENSION_SVG=35, EXTENSION_DOT=36, EXTENSION_CSV=37, 
		IDF=38, COMENTARIOCERRAR=39, TEXTOCOMENTARIO_ML=40, AUTHOR=41, DESCRIPTION=42, 
		TARGET=43, FINAL_COMENTARIO_UL=44, TEXTOCOMENTARIO_UL=45, CADENA_CERRAR=46, 
		TEXTO_CADENA=47;
	public static final int
		RULE_fichero = 0, RULE_comentario = 1, RULE_authorcom = 2, RULE_descrcom = 3, 
		RULE_targcom = 4, RULE_textos = 5, RULE_rutafichero = 6, RULE_tipo_archivo = 7, 
		RULE_json = 8, RULE_svg = 9, RULE_dot = 10, RULE_csv = 11, RULE_wsci = 12, 
		RULE_white_space = 13, RULE_barra = 14, RULE_intro = 15, RULE_letra = 16, 
		RULE_numero = 17, RULE_variable = 18, RULE_sap = 19, RULE_scp = 20, RULE_asig = 21, 
		RULE_opasig = 22, RULE_coma = 23, RULE_dos_ptos = 24, RULE_punto = 25, 
		RULE_doblepunto = 26, RULE_cadena = 27, RULE_kw_json = 28, RULE_extension_json = 29, 
		RULE_kw_svg = 30, RULE_extension_svg = 31, RULE_kw_dot = 32, RULE_extension_dot = 33, 
		RULE_kw_csv = 34, RULE_extension_csv = 35;
	public static final String[] ruleNames = {
		"fichero", "comentario", "authorcom", "descrcom", "targcom", "textos", 
		"rutafichero", "tipo_archivo", "json", "svg", "dot", "csv", "wsci", "white_space", 
		"barra", "intro", "letra", "numero", "variable", "sap", "scp", "asig", 
		"opasig", "coma", "dos_ptos", "punto", "doblepunto", "cadena", "kw_json", 
		"extension_json", "kw_svg", "extension_svg", "kw_dot", "extension_dot", 
		"kw_csv", "extension_csv"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/*'", "'//'", null, null, null, "','", "'..'", "'.'", null, "'<'", 
		"'>'", "'('", "')'", "'='", "':='", "':'", "';'", null, null, "'JSON'", 
		"'DOT'", "'SVG'", "'CSV'", "'len'", "'fontcolor'", "'fontname'", "'fontsize'", 
		"'arrowsize'", "'arrowcolor'", "'penwidth'", "'fillcolor'", "'style'", 
		"'shape'", "'json'", "'svg'", "'dot'", "'csv'", null, "'*/'", null, null, 
		null, null, "'\r\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMENTARIOABRIR", "COMENTARIOLINEA", "CADENA_ABRIR", "INT", "LETRA", 
		"COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "OPBLT", "OPBGT", "SAP", "SCP", 
		"ASIG", "OPASIG", "KW_DOS_PUNTOS", "TERMINADOR", "WS", "BARRA", "KW_JSON", 
		"KW_DOT", "KW_SVG", "KW_CSV", "LEN", "FONTCOLOR", "FONTNAME", "FONTSIZE", 
		"ARROWSIZE", "ARROWCOLOR", "PENWIDTH", "FILLCOLOR", "STYLE", "SHAPE", 
		"EXTENSION_JSON", "EXTENSION_SVG", "EXTENSION_DOT", "EXTENSION_CSV", "IDF", 
		"COMENTARIOCERRAR", "TEXTOCOMENTARIO_ML", "AUTHOR", "DESCRIPTION", "TARGET", 
		"FINAL_COMENTARIO_UL", "TEXTOCOMENTARIO_UL", "CADENA_CERRAR", "TEXTO_CADENA"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << INTRO) | (1L << WS) | (1L << KW_JSON) | (1L << KW_DOT) | (1L << KW_SVG) | (1L << KW_CSV))) != 0)) {
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_JSON:
				case KW_DOT:
				case KW_SVG:
				case KW_CSV:
					{
					setState(72);
					tipo_archivo();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
					{
					setState(73);
					comentario();
					}
					break;
				case INTRO:
				case WS:
					{
					setState(74);
					wsci();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(COMENTARIOABRIR);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTRO) | (1L << TEXTOCOMENTARIO_ML) | (1L << AUTHOR) | (1L << DESCRIPTION) | (1L << TARGET) | (1L << TEXTOCOMENTARIO_UL))) != 0)) {
					{
					setState(86);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIO_ML:
					case TEXTOCOMENTARIO_UL:
						{
						setState(81);
						textos();
						}
						break;
					case AUTHOR:
						{
						setState(82);
						authorcom();
						}
						break;
					case DESCRIPTION:
						{
						setState(83);
						descrcom();
						}
						break;
					case TARGET:
						{
						setState(84);
						targcom();
						}
						break;
					case INTRO:
						{
						setState(85);
						match(INTRO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(COMENTARIOLINEA);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIO_ML || _la==TEXTOCOMENTARIO_UL) {
					{
					{
					setState(93);
					textos();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
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
			setState(103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(102);
					match(AUTHOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105); 
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
			setState(108); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(107);
					match(DESCRIPTION);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110); 
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
			setState(113); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(112);
					match(TARGET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof entradaParserListener ) ((entradaParserListener)listener).exitTextos(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_textos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(117);
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
				setState(120); 
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
		public List<BarraContext> barra() {
			return getRuleContexts(BarraContext.class);
		}
		public BarraContext barra(int i) {
			return getRuleContext(BarraContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << DOBLEPUNTO) | (1L << PUNTO))) != 0)) {
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOBLEPUNTO:
					{
					setState(122);
					doblepunto();
					}
					break;
				case PUNTO:
					{
					setState(123);
					punto();
					}
					break;
				case LETRA:
					{
					setState(124);
					letra();
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_DOS_PUNTOS) {
						{
						setState(125);
						dos_ptos();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BARRA) {
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(133);
					barra();
					setState(134);
					variable();
					}
					break;
				case 2:
					{
					setState(136);
					barra();
					}
					break;
				}
				}
				setState(141);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_JSON:
				{
				setState(142);
				json();
				}
				break;
			case KW_SVG:
				{
				setState(143);
				svg();
				}
				break;
			case KW_DOT:
				{
				setState(144);
				dot();
				}
				break;
			case KW_CSV:
				{
				setState(145);
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
			setState(148);
			kw_json();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(149);
				wsci();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			asig();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(156);
				wsci();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			rutafichero();
			setState(163);
			variable();
			setState(164);
			punto();
			setState(165);
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
			setState(167);
			kw_svg();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(168);
				wsci();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			asig();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(175);
				wsci();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			rutafichero();
			setState(182);
			variable();
			setState(183);
			punto();
			setState(184);
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
			setState(186);
			kw_dot();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(187);
				wsci();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			asig();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(194);
				wsci();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			rutafichero();
			setState(201);
			variable();
			setState(202);
			punto();
			setState(203);
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
			setState(205);
			kw_csv();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(206);
				wsci();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			asig();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(213);
				wsci();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			rutafichero();
			setState(220);
			variable();
			setState(221);
			punto();
			setState(222);
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
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WS:
				{
				setState(224);
				white_space();
				}
				break;
			case INTRO:
				{
				setState(225);
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
			setState(228);
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
			setState(230);
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
			setState(232);
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
			setState(234);
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
			setState(236);
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
			setState(238);
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
			setState(240);
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
			setState(242);
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
			setState(244);
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
			setState(246);
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
		enterRule(_localctx, 46, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		enterRule(_localctx, 48, RULE_dos_ptos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		enterRule(_localctx, 50, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 52, RULE_doblepunto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 54, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(CADENA_ABRIR);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTO_CADENA) {
				{
				{
				setState(257);
				match(TEXTO_CADENA);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
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
		enterRule(_localctx, 56, RULE_kw_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 58, RULE_extension_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		enterRule(_localctx, 60, RULE_kw_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 62, RULE_extension_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 64, RULE_kw_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 66, RULE_extension_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 68, RULE_kw_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 70, RULE_extension_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u011c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\3\3\3\3\7\3a\n\3\f\3"+
		"\16\3d\13\3\3\3\5\3g\n\3\3\4\6\4j\n\4\r\4\16\4k\3\5\6\5o\n\5\r\5\16\5"+
		"p\3\6\6\6t\n\6\r\6\16\6u\3\7\6\7y\n\7\r\7\16\7z\3\b\3\b\3\b\3\b\5\b\u0081"+
		"\n\b\7\b\u0083\n\b\f\b\16\b\u0086\13\b\3\b\3\b\3\b\3\b\7\b\u008c\n\b\f"+
		"\b\16\b\u008f\13\b\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3\n\3\n\7\n\u0099\n\n"+
		"\f\n\16\n\u009c\13\n\3\n\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\7\13\u00ac\n\13\f\13\16\13\u00af\13\13\3\13\3\13"+
		"\7\13\u00b3\n\13\f\13\16\13\u00b6\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\f\3\f\7\f\u00c6\n\f\f\f\16\f\u00c9"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u00d2\n\r\f\r\16\r\u00d5\13\r\3"+
		"\r\3\r\7\r\u00d9\n\r\f\r\16\r\u00dc\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\5\16\u00e5\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\7\35\u0105\n\35\f\35\16\35\u0108\13\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\2\2"+
		"&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"H\2\3\4\2**//\2\u0118\2O\3\2\2\2\4f\3\2\2\2\6i\3\2\2\2\bn\3\2\2\2\ns\3"+
		"\2\2\2\fx\3\2\2\2\16\u0084\3\2\2\2\20\u0094\3\2\2\2\22\u0096\3\2\2\2\24"+
		"\u00a9\3\2\2\2\26\u00bc\3\2\2\2\30\u00cf\3\2\2\2\32\u00e4\3\2\2\2\34\u00e6"+
		"\3\2\2\2\36\u00e8\3\2\2\2 \u00ea\3\2\2\2\"\u00ec\3\2\2\2$\u00ee\3\2\2"+
		"\2&\u00f0\3\2\2\2(\u00f2\3\2\2\2*\u00f4\3\2\2\2,\u00f6\3\2\2\2.\u00f8"+
		"\3\2\2\2\60\u00fa\3\2\2\2\62\u00fc\3\2\2\2\64\u00fe\3\2\2\2\66\u0100\3"+
		"\2\2\28\u0102\3\2\2\2:\u010b\3\2\2\2<\u010d\3\2\2\2>\u010f\3\2\2\2@\u0111"+
		"\3\2\2\2B\u0113\3\2\2\2D\u0115\3\2\2\2F\u0117\3\2\2\2H\u0119\3\2\2\2J"+
		"N\5\20\t\2KN\5\4\3\2LN\5\32\16\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QO\3\2\2\2RZ\7\3\2\2SY\5\f\7\2TY\5\6"+
		"\4\2UY\5\b\5\2VY\5\n\6\2WY\7\13\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3"+
		"\2\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]"+
		"g\7)\2\2^b\7\4\2\2_a\5\f\7\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c"+
		"e\3\2\2\2db\3\2\2\2eg\7.\2\2fR\3\2\2\2f^\3\2\2\2g\5\3\2\2\2hj\7+\2\2i"+
		"h\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\7\3\2\2\2mo\7,\2\2nm\3\2\2\2"+
		"op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\t\3\2\2\2rt\7-\2\2sr\3\2\2\2tu\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2v\13\3\2\2\2wy\t\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2"+
		"\2z{\3\2\2\2{\r\3\2\2\2|\u0083\5\66\34\2}\u0083\5\64\33\2~\u0080\5\"\22"+
		"\2\177\u0081\5\62\32\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008d\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\5\36\20\2\u0088\u0089\5&\24\2\u0089\u008c\3"+
		"\2\2\2\u008a\u008c\5\36\20\2\u008b\u0087\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\17\3\2\2"+
		"\2\u008f\u008d\3\2\2\2\u0090\u0095\5\22\n\2\u0091\u0095\5\24\13\2\u0092"+
		"\u0095\5\26\f\2\u0093\u0095\5\30\r\2\u0094\u0090\3\2\2\2\u0094\u0091\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\21\3\2\2\2\u0096"+
		"\u009a\5:\36\2\u0097\u0099\5\32\16\2\u0098\u0097\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a1\5,\27\2\u009e\u00a0\5\32\16\2\u009f\u009e\3"+
		"\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5\16\b\2\u00a5\u00a6\5"+
		"&\24\2\u00a6\u00a7\5\64\33\2\u00a7\u00a8\5<\37\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00ad\5> \2\u00aa\u00ac\5\32\16\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b4\5,\27\2\u00b1\u00b3\5\32\16\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5\16\b\2\u00b8\u00b9\5"+
		"&\24\2\u00b9\u00ba\5\64\33\2\u00ba\u00bb\5@!\2\u00bb\25\3\2\2\2\u00bc"+
		"\u00c0\5B\"\2\u00bd\u00bf\5\32\16\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c7\5,\27\2\u00c4\u00c6\5\32\16\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\5"+
		"&\24\2\u00cc\u00cd\5\64\33\2\u00cd\u00ce\5D#\2\u00ce\27\3\2\2\2\u00cf"+
		"\u00d3\5F$\2\u00d0\u00d2\5\32\16\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00da\5,\27\2\u00d7\u00d9\5\32\16\2\u00d8\u00d7\3"+
		"\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\16\b\2\u00de\u00df\5"+
		"&\24\2\u00df\u00e0\5\64\33\2\u00e0\u00e1\5H%\2\u00e1\31\3\2\2\2\u00e2"+
		"\u00e5\5\34\17\2\u00e3\u00e5\5 \21\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3"+
		"\2\2\2\u00e5\33\3\2\2\2\u00e6\u00e7\7\24\2\2\u00e7\35\3\2\2\2\u00e8\u00e9"+
		"\7\25\2\2\u00e9\37\3\2\2\2\u00ea\u00eb\7\13\2\2\u00eb!\3\2\2\2\u00ec\u00ed"+
		"\7\7\2\2\u00ed#\3\2\2\2\u00ee\u00ef\7\6\2\2\u00ef%\3\2\2\2\u00f0\u00f1"+
		"\7(\2\2\u00f1\'\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3)\3\2\2\2\u00f4\u00f5"+
		"\7\17\2\2\u00f5+\3\2\2\2\u00f6\u00f7\7\20\2\2\u00f7-\3\2\2\2\u00f8\u00f9"+
		"\7\21\2\2\u00f9/\3\2\2\2\u00fa\u00fb\7\b\2\2\u00fb\61\3\2\2\2\u00fc\u00fd"+
		"\7\22\2\2\u00fd\63\3\2\2\2\u00fe\u00ff\7\n\2\2\u00ff\65\3\2\2\2\u0100"+
		"\u0101\7\t\2\2\u0101\67\3\2\2\2\u0102\u0106\7\5\2\2\u0103\u0105\7\61\2"+
		"\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\60\2\2"+
		"\u010a9\3\2\2\2\u010b\u010c\7\26\2\2\u010c;\3\2\2\2\u010d\u010e\7$\2\2"+
		"\u010e=\3\2\2\2\u010f\u0110\7\30\2\2\u0110?\3\2\2\2\u0111\u0112\7%\2\2"+
		"\u0112A\3\2\2\2\u0113\u0114\7\27\2\2\u0114C\3\2\2\2\u0115\u0116\7&\2\2"+
		"\u0116E\3\2\2\2\u0117\u0118\7\31\2\2\u0118G\3\2\2\2\u0119\u011a\7\'\2"+
		"\2\u011aI\3\2\2\2\34MOXZbfkpuz\u0080\u0082\u0084\u008b\u008d\u0094\u009a"+
		"\u00a1\u00ad\u00b4\u00c0\u00c7\u00d3\u00da\u00e4\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}