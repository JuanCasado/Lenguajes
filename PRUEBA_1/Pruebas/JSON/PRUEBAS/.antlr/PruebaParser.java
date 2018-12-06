// Generated from d:\gituni\Lenguajes\PRUEBA_1\Pruebas\JSON\PRUEBAS\PruebaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PruebaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SALLAVE=1, SCLLAVE=2, SACORCHETE=3, SCCORCHETE=4, COMA=5, DOS_PTOS=6, 
		COMILLAS=7, PUNTO=8, BARRA=9, ALM=10, BBAJA=11, ARROBA=12, KW_CONTEXT=13, 
		KW_WWW=14, KW_HTTP=15, KW_ID=16, KW_NAME=17, KW_PROPERTIES=18, KW_INHERITS=19, 
		KW_GRAPHS=20, KW_REVERSENAME=21, KW_LABELRN=22, KW_LABEL=23, KW_FROM=24, 
		KW_TO=25, KW_TYPEOF=26, KW_USEDBY=27, KW_MULMAX=28, KW_MULMIN=29, KW_ISLIST=30, 
		KW_TRUE=31, KW_FALSE=32, NOMBRE=33, DIGITO=34, INTRO=35;
	public static final int
		RULE_init = 0, RULE_context = 1, RULE_descripcion = 2, RULE_cadena = 3, 
		RULE_ampli_info = 4, RULE_ruta = 5, RULE_declaracion = 6, RULE_graphs = 7, 
		RULE_list = 8, RULE_objetos = 9, RULE_prop = 10, RULE_pclass = 11, RULE_id = 12, 
		RULE_name = 13, RULE_label = 14, RULE_inherits = 15, RULE_properties = 16, 
		RULE_relationship = 17, RULE_reverse_name = 18, RULE_labelrn = 19, RULE_from = 20, 
		RULE_to = 21, RULE_property = 22, RULE_typeOf = 23, RULE_usedby = 24, 
		RULE_isList = 25, RULE_bool = 26, RULE_mulMin = 27, RULE_mulMax = 28, 
		RULE_languageData = 29, RULE_nombre_obj = 30, RULE_sacorchete = 31, RULE_sccorchete = 32, 
		RULE_target = 33, RULE_kw_true = 34, RULE_kw_false = 35, RULE_kw_isList = 36, 
		RULE_kw_context = 37, RULE_kw_http = 38, RULE_kw_www = 39, RULE_kw_id = 40, 
		RULE_kw_name = 41, RULE_kw_label = 42, RULE_kw_properties = 43, RULE_kw_inherits = 44, 
		RULE_kw_graphs = 45, RULE_kw_reversename = 46, RULE_kw_labelrn = 47, RULE_kw_from = 48, 
		RULE_kw_to = 49, RULE_kw_typeof = 50, RULE_kw_usedby = 51, RULE_kw_mulmax = 52, 
		RULE_kw_mulmin = 53, RULE_punto = 54, RULE_barra = 55, RULE_alm = 56, 
		RULE_dos_ptos = 57, RULE_sallave = 58, RULE_scllave = 59, RULE_coma = 60, 
		RULE_comillas = 61, RULE_bbaja = 62, RULE_nombre = 63, RULE_digito = 64, 
		RULE_intro = 65, RULE_arroba = 66;
	public static final String[] ruleNames = {
		"init", "context", "descripcion", "cadena", "ampli_info", "ruta", "declaracion", 
		"graphs", "list", "objetos", "prop", "pclass", "id", "name", "label", 
		"inherits", "properties", "relationship", "reverse_name", "labelrn", "from", 
		"to", "property", "typeOf", "usedby", "isList", "bool", "mulMin", "mulMax", 
		"languageData", "nombre_obj", "sacorchete", "sccorchete", "target", "kw_true", 
		"kw_false", "kw_isList", "kw_context", "kw_http", "kw_www", "kw_id", "kw_name", 
		"kw_label", "kw_properties", "kw_inherits", "kw_graphs", "kw_reversename", 
		"kw_labelrn", "kw_from", "kw_to", "kw_typeof", "kw_usedby", "kw_mulmax", 
		"kw_mulmin", "punto", "barra", "alm", "dos_ptos", "sallave", "scllave", 
		"coma", "comillas", "bbaja", "nombre", "digito", "intro", "arroba"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "';'", "':'", "'\"'", "'.'", "'/'", 
		"'#'", "'_'", "'@'", "'\"@context\"'", "'www.'", "'http://'", "'\"@id\"'", 
		"'\"name\"'", "'\"properties\"'", "'\"inherits\"'", "'\"graphs\"'", "'\"reverseName\"'", 
		"'\"labelReverseName\"'", "'\"label\"'", "'\"from\"'", "'\"to\"'", "'\"typeOf\"'", 
		"'\"usedby\"'", "'\"multiplicityMax\"'", "'\"multiplicityMin\"'", "'\"isList\"'", 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SALLAVE", "SCLLAVE", "SACORCHETE", "SCCORCHETE", "COMA", "DOS_PTOS", 
		"COMILLAS", "PUNTO", "BARRA", "ALM", "BBAJA", "ARROBA", "KW_CONTEXT", 
		"KW_WWW", "KW_HTTP", "KW_ID", "KW_NAME", "KW_PROPERTIES", "KW_INHERITS", 
		"KW_GRAPHS", "KW_REVERSENAME", "KW_LABELRN", "KW_LABEL", "KW_FROM", "KW_TO", 
		"KW_TYPEOF", "KW_USEDBY", "KW_MULMAX", "KW_MULMIN", "KW_ISLIST", "KW_TRUE", 
		"KW_FALSE", "NOMBRE", "DIGITO", "INTRO"
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
	public String getGrammarFileName() { return "PruebaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PruebaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public SallaveContext sallave() {
			return getRuleContext(SallaveContext.class,0);
		}
		public GraphsContext graphs() {
			return getRuleContext(GraphsContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public ContextContext context() {
			return getRuleContext(ContextContext.class,0);
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
			setState(134);
			sallave();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SALLAVE) {
				{
				setState(135);
				context();
				}
			}

			setState(138);
			graphs();
			setState(139);
			scllave();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextContext extends ParserRuleContext {
		public List<SallaveContext> sallave() {
			return getRuleContexts(SallaveContext.class);
		}
		public SallaveContext sallave(int i) {
			return getRuleContext(SallaveContext.class,i);
		}
		public Kw_contextContext kw_context() {
			return getRuleContext(Kw_contextContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public List<DescripcionContext> descripcion() {
			return getRuleContexts(DescripcionContext.class);
		}
		public DescripcionContext descripcion(int i) {
			return getRuleContext(DescripcionContext.class,i);
		}
		public ContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context; }
	}

	public final ContextContext context() throws RecognitionException {
		ContextContext _localctx = new ContextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_context);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			sallave();
			setState(142);
			kw_context();
			setState(143);
			dos_ptos();
			setState(144);
			sallave();
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				descripcion();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALLAVE) | (1L << DOS_PTOS) | (1L << COMILLAS) | (1L << NOMBRE) | (1L << INTRO))) != 0) );
			setState(150);
			scllave();
			setState(151);
			coma();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescripcionContext extends ParserRuleContext {
		public List<Dos_ptosContext> dos_ptos() {
			return getRuleContexts(Dos_ptosContext.class);
		}
		public Dos_ptosContext dos_ptos(int i) {
			return getRuleContext(Dos_ptosContext.class,i);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public List<IntroContext> intro() {
			return getRuleContexts(IntroContext.class);
		}
		public IntroContext intro(int i) {
			return getRuleContext(IntroContext.class,i);
		}
		public List<Ampli_infoContext> ampli_info() {
			return getRuleContexts(Ampli_infoContext.class);
		}
		public Ampli_infoContext ampli_info(int i) {
			return getRuleContext(Ampli_infoContext.class,i);
		}
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public List<RutaContext> ruta() {
			return getRuleContexts(RutaContext.class);
		}
		public RutaContext ruta(int i) {
			return getRuleContext(RutaContext.class,i);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public DescripcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descripcion; }
	}

	public final DescripcionContext descripcion() throws RecognitionException {
		DescripcionContext _localctx = new DescripcionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descripcion);
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
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(153);
						dos_ptos();
						}
						break;
					case 2:
						{
						setState(154);
						cadena();
						}
						break;
					case 3:
						{
						setState(155);
						intro();
						}
						break;
					case 4:
						{
						setState(156);
						ampli_info();
						}
						break;
					case 5:
						{
						setState(157);
						nombre();
						}
						break;
					case 6:
						{
						setState(158);
						ruta();
						}
						break;
					case 7:
						{
						setState(159);
						declaracion();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
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

	public static class CadenaContext extends ParserRuleContext {
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public List<DigitoContext> digito() {
			return getRuleContexts(DigitoContext.class);
		}
		public DigitoContext digito(int i) {
			return getRuleContext(DigitoContext.class,i);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cadena);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			comillas();
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				nombre();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BBAJA) {
					{
					setState(166);
					bbaja();
					setState(169); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(169);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case NOMBRE:
								{
								setState(167);
								nombre();
								}
								break;
							case DIGITO:
								{
								setState(168);
								digito();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(171); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOMBRE );
			setState(179);
			comillas();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ampli_infoContext extends ParserRuleContext {
		public SallaveContext sallave() {
			return getRuleContext(SallaveContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public List<DescripcionContext> descripcion() {
			return getRuleContexts(DescripcionContext.class);
		}
		public DescripcionContext descripcion(int i) {
			return getRuleContext(DescripcionContext.class,i);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Ampli_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ampli_info; }
	}

	public final Ampli_infoContext ampli_info() throws RecognitionException {
		Ampli_infoContext _localctx = new Ampli_infoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ampli_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			sallave();
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				descripcion();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALLAVE) | (1L << DOS_PTOS) | (1L << COMILLAS) | (1L << NOMBRE) | (1L << INTRO))) != 0) );
			setState(187);
			scllave();
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(188);
				coma();
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

	public static class RutaContext extends ParserRuleContext {
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public Kw_httpContext kw_http() {
			return getRuleContext(Kw_httpContext.class,0);
		}
		public Kw_wwwContext kw_www() {
			return getRuleContext(Kw_wwwContext.class,0);
		}
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public List<DigitoContext> digito() {
			return getRuleContexts(DigitoContext.class);
		}
		public DigitoContext digito(int i) {
			return getRuleContext(DigitoContext.class,i);
		}
		public List<PuntoContext> punto() {
			return getRuleContexts(PuntoContext.class);
		}
		public PuntoContext punto(int i) {
			return getRuleContext(PuntoContext.class,i);
		}
		public List<BarraContext> barra() {
			return getRuleContexts(BarraContext.class);
		}
		public BarraContext barra(int i) {
			return getRuleContext(BarraContext.class,i);
		}
		public List<AlmContext> alm() {
			return getRuleContexts(AlmContext.class);
		}
		public AlmContext alm(int i) {
			return getRuleContext(AlmContext.class,i);
		}
		public RutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruta; }
	}

	public final RutaContext ruta() throws RecognitionException {
		RutaContext _localctx = new RutaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ruta);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			comillas();
			setState(192);
			kw_http();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WWW) {
				{
				setState(193);
				kw_www();
				}
			}

			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(198);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NOMBRE:
							{
							setState(196);
							nombre();
							}
							break;
						case DIGITO:
							{
							setState(197);
							digito();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(200); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO) {
					{
					setState(202);
					punto();
					}
				}

				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BARRA) {
					{
					setState(205);
					barra();
					}
				}

				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALM) {
					{
					setState(208);
					alm();
					}
				}

				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOMBRE || _la==DIGITO );
			setState(215);
			comillas();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public List<ArrobaContext> arroba() {
			return getRuleContexts(ArrobaContext.class);
		}
		public ArrobaContext arroba(int i) {
			return getRuleContext(ArrobaContext.class,i);
		}
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public List<Dos_ptosContext> dos_ptos() {
			return getRuleContexts(Dos_ptosContext.class);
		}
		public Dos_ptosContext dos_ptos(int i) {
			return getRuleContext(Dos_ptosContext.class,i);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public DigitoContext digito() {
			return getRuleContext(DigitoContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion);
		int _la;
		try {
			int _alt;
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				comillas();
				setState(218);
				arroba();
				setState(219);
				nombre();
				setState(220);
				comillas();
				setState(221);
				dos_ptos();
				setState(222);
				comillas();
				setState(223);
				nombre();
				setState(224);
				dos_ptos();
				setState(225);
				nombre();
				setState(226);
				comillas();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(227);
					coma();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				comillas();
				setState(231);
				arroba();
				setState(232);
				nombre();
				setState(233);
				comillas();
				setState(234);
				dos_ptos();
				setState(235);
				ruta();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(236);
					coma();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				comillas();
				setState(240);
				arroba();
				setState(241);
				nombre();
				setState(242);
				comillas();
				setState(243);
				dos_ptos();
				setState(245); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(244);
						cadena();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(249);
					coma();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				comillas();
				setState(253);
				arroba();
				setState(254);
				nombre();
				setState(255);
				comillas();
				setState(256);
				dos_ptos();
				setState(258); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(257);
						nombre();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(260); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(262);
					coma();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				comillas();
				setState(266);
				arroba();
				setState(267);
				nombre();
				setState(268);
				comillas();
				setState(269);
				dos_ptos();
				setState(270);
				comillas();
				setState(271);
				arroba();
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(272);
					nombre();
					}
					}
					setState(275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOMBRE );
				setState(277);
				comillas();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(278);
					coma();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				comillas();
				setState(282);
				arroba();
				setState(283);
				nombre();
				setState(284);
				comillas();
				setState(285);
				dos_ptos();
				setState(286);
				comillas();
				setState(287);
				digito();
				setState(288);
				comillas();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(289);
					coma();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphsContext extends ParserRuleContext {
		public Kw_graphsContext kw_graphs() {
			return getRuleContext(Kw_graphsContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public SacorcheteContext sacorchete() {
			return getRuleContext(SacorcheteContext.class,0);
		}
		public SccorcheteContext sccorchete() {
			return getRuleContext(SccorcheteContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public GraphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphs; }
	}

	public final GraphsContext graphs() throws RecognitionException {
		GraphsContext _localctx = new GraphsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_graphs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			kw_graphs();
			setState(295);
			dos_ptos();
			setState(296);
			sacorchete();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMILLAS) {
				{
				setState(297);
				list();
				}
			}

			setState(300);
			sccorchete();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public SacorcheteContext sacorchete() {
			return getRuleContext(SacorcheteContext.class,0);
		}
		public SccorcheteContext sccorchete() {
			return getRuleContext(SccorcheteContext.class,0);
		}
		public List<ObjetosContext> objetos() {
			return getRuleContexts(ObjetosContext.class);
		}
		public ObjetosContext objetos(int i) {
			return getRuleContext(ObjetosContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			target();
			setState(303);
			dos_ptos();
			setState(304);
			sacorchete();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALLAVE) {
				{
				{
				setState(305);
				objetos();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			sccorchete();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjetosContext extends ParserRuleContext {
		public SallaveContext sallave() {
			return getRuleContext(SallaveContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public ObjetosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetos; }
	}

	public final ObjetosContext objetos() throws RecognitionException {
		ObjetosContext _localctx = new ObjetosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_objetos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			sallave();
			setState(315); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(314);
				prop();
				}
				}
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_ID );
			setState(319);
			scllave();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(320);
				coma();
				}
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

	public static class PropContext extends ParserRuleContext {
		public List<PclassContext> pclass() {
			return getRuleContexts(PclassContext.class);
		}
		public PclassContext pclass(int i) {
			return getRuleContext(PclassContext.class,i);
		}
		public List<RelationshipContext> relationship() {
			return getRuleContexts(RelationshipContext.class);
		}
		public RelationshipContext relationship(int i) {
			return getRuleContext(RelationshipContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(323);
						pclass();
						}
						break;
					case 2:
						{
						setState(324);
						relationship();
						}
						break;
					case 3:
						{
						setState(325);
						property();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class PclassContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public InheritsContext inherits() {
			return getRuleContext(InheritsContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pclass; }
	}

	public final PclassContext pclass() throws RecognitionException {
		PclassContext _localctx = new PclassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			id();
			setState(331);
			name();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LABEL) {
				{
				setState(332);
				label();
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_INHERITS) {
				{
				setState(335);
				inherits();
				}
			}

			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PROPERTIES) {
				{
				setState(338);
				properties();
				}
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

	public static class IdContext extends ParserRuleContext {
		public Kw_idContext kw_id() {
			return getRuleContext(Kw_idContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			kw_id();
			setState(342);
			dos_ptos();
			setState(343);
			ruta();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(344);
				coma();
				}
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

	public static class NameContext extends ParserRuleContext {
		public Kw_nameContext kw_name() {
			return getRuleContext(Kw_nameContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			kw_name();
			setState(348);
			dos_ptos();
			setState(349);
			comillas();
			setState(350);
			nombre();
			setState(351);
			comillas();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(352);
				coma();
				}
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

	public static class LabelContext extends ParserRuleContext {
		public Kw_labelContext kw_label() {
			return getRuleContext(Kw_labelContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public Ampli_infoContext ampli_info() {
			return getRuleContext(Ampli_infoContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			kw_label();
			setState(356);
			dos_ptos();
			setState(357);
			ampli_info();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(358);
				coma();
				}
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

	public static class InheritsContext extends ParserRuleContext {
		public Kw_inheritsContext kw_inherits() {
			return getRuleContext(Kw_inheritsContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public InheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherits; }
	}

	public final InheritsContext inherits() throws RecognitionException {
		InheritsContext _localctx = new InheritsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inherits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			kw_inherits();
			setState(362);
			dos_ptos();
			setState(363);
			ruta();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(364);
				coma();
				}
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

	public static class PropertiesContext extends ParserRuleContext {
		public Kw_propertiesContext kw_properties() {
			return getRuleContext(Kw_propertiesContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public SacorcheteContext sacorchete() {
			return getRuleContext(SacorcheteContext.class,0);
		}
		public SccorcheteContext sccorchete() {
			return getRuleContext(SccorcheteContext.class,0);
		}
		public List<RutaContext> ruta() {
			return getRuleContexts(RutaContext.class);
		}
		public RutaContext ruta(int i) {
			return getRuleContext(RutaContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			kw_properties();
			setState(368);
			dos_ptos();
			setState(369);
			sacorchete();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMILLAS) {
				{
				{
				setState(370);
				ruta();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(371);
					coma();
					}
				}

				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			sccorchete();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationshipContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Reverse_nameContext reverse_name() {
			return getRuleContext(Reverse_nameContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LabelrnContext labelrn() {
			return getRuleContext(LabelrnContext.class,0);
		}
		public RelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship; }
	}

	public final RelationshipContext relationship() throws RecognitionException {
		RelationshipContext _localctx = new RelationshipContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationship);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			id();
			setState(382);
			name();
			setState(383);
			reverse_name();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LABEL) {
				{
				setState(384);
				label();
				}
			}

			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LABELRN) {
				{
				setState(387);
				labelrn();
				}
			}

			setState(390);
			from();
			setState(391);
			to();
			setState(392);
			properties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reverse_nameContext extends ParserRuleContext {
		public Kw_reversenameContext kw_reversename() {
			return getRuleContext(Kw_reversenameContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Reverse_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverse_name; }
	}

	public final Reverse_nameContext reverse_name() throws RecognitionException {
		Reverse_nameContext _localctx = new Reverse_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reverse_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			kw_reversename();
			setState(395);
			dos_ptos();
			setState(396);
			comillas();
			setState(397);
			nombre();
			setState(398);
			comillas();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(399);
				coma();
				}
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

	public static class LabelrnContext extends ParserRuleContext {
		public Kw_labelrnContext kw_labelrn() {
			return getRuleContext(Kw_labelrnContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public Ampli_infoContext ampli_info() {
			return getRuleContext(Ampli_infoContext.class,0);
		}
		public LabelrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelrn; }
	}

	public final LabelrnContext labelrn() throws RecognitionException {
		LabelrnContext _localctx = new LabelrnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_labelrn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			kw_labelrn();
			setState(403);
			dos_ptos();
			setState(404);
			ampli_info();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromContext extends ParserRuleContext {
		public Kw_fromContext kw_from() {
			return getRuleContext(Kw_fromContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			kw_from();
			setState(407);
			dos_ptos();
			setState(408);
			ruta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToContext extends ParserRuleContext {
		public Kw_toContext kw_to() {
			return getRuleContext(Kw_toContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			kw_to();
			setState(411);
			dos_ptos();
			setState(412);
			ruta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeOfContext typeOf() {
			return getRuleContext(TypeOfContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public IsListContext isList() {
			return getRuleContext(IsListContext.class,0);
		}
		public MulMaxContext mulMax() {
			return getRuleContext(MulMaxContext.class,0);
		}
		public MulMinContext mulMin() {
			return getRuleContext(MulMinContext.class,0);
		}
		public UsedbyContext usedby() {
			return getRuleContext(UsedbyContext.class,0);
		}
		public LanguageDataContext languageData() {
			return getRuleContext(LanguageDataContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_property);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				id();
				setState(415);
				name();
				setState(416);
				typeOf();
				setState(417);
				label();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ISLIST) {
					{
					setState(418);
					isList();
					}
				}

				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MULMAX) {
					{
					setState(421);
					mulMax();
					}
				}

				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MULMIN) {
					{
					setState(424);
					mulMin();
					}
				}

				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_USEDBY) {
					{
					setState(427);
					usedby();
					}
				}

				setState(431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(430);
					languageData();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				id();
				setState(434);
				name();
				setState(435);
				typeOf();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ISLIST) {
					{
					setState(436);
					isList();
					}
				}

				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MULMAX) {
					{
					setState(439);
					mulMax();
					}
				}

				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MULMIN) {
					{
					setState(442);
					mulMin();
					}
				}

				setState(445);
				label();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_USEDBY) {
					{
					setState(446);
					usedby();
					}
				}

				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(449);
					languageData();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeOfContext extends ParserRuleContext {
		public Kw_typeofContext kw_typeof() {
			return getRuleContext(Kw_typeofContext.class,0);
		}
		public List<Dos_ptosContext> dos_ptos() {
			return getRuleContexts(Dos_ptosContext.class);
		}
		public Dos_ptosContext dos_ptos(int i) {
			return getRuleContext(Dos_ptosContext.class,i);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public TypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOf; }
	}

	public final TypeOfContext typeOf() throws RecognitionException {
		TypeOfContext _localctx = new TypeOfContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeOf);
		int _la;
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				kw_typeof();
				setState(455);
				dos_ptos();
				setState(456);
				comillas();
				setState(458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(457);
					nombre();
					}
					}
					setState(460); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOMBRE );
				setState(462);
				dos_ptos();
				setState(464); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(463);
					nombre();
					}
					}
					setState(466); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOMBRE );
				setState(468);
				comillas();
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(469);
					coma();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				kw_typeof();
				setState(473);
				dos_ptos();
				setState(474);
				ruta();
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(475);
					coma();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsedbyContext extends ParserRuleContext {
		public Kw_usedbyContext kw_usedby() {
			return getRuleContext(Kw_usedbyContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public SacorcheteContext sacorchete() {
			return getRuleContext(SacorcheteContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public SccorcheteContext sccorchete() {
			return getRuleContext(SccorcheteContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public UsedbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usedby; }
	}

	public final UsedbyContext usedby() throws RecognitionException {
		UsedbyContext _localctx = new UsedbyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_usedby);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			kw_usedby();
			setState(481);
			dos_ptos();
			setState(482);
			sacorchete();
			setState(483);
			ruta();
			setState(484);
			sccorchete();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(485);
				coma();
				}
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

	public static class IsListContext extends ParserRuleContext {
		public Kw_isListContext kw_isList() {
			return getRuleContext(Kw_isListContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public IsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isList; }
	}

	public final IsListContext isList() throws RecognitionException {
		IsListContext _localctx = new IsListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_isList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			kw_isList();
			setState(489);
			dos_ptos();
			setState(490);
			bool();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(491);
				coma();
				}
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

	public static class BoolContext extends ParserRuleContext {
		public Kw_trueContext kw_true() {
			return getRuleContext(Kw_trueContext.class,0);
		}
		public Kw_falseContext kw_false() {
			return getRuleContext(Kw_falseContext.class,0);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bool);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				kw_true();
				}
				break;
			case KW_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				kw_false();
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

	public static class MulMinContext extends ParserRuleContext {
		public Kw_mulminContext kw_mulmin() {
			return getRuleContext(Kw_mulminContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public DigitoContext digito() {
			return getRuleContext(DigitoContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public MulMinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulMin; }
	}

	public final MulMinContext mulMin() throws RecognitionException {
		MulMinContext _localctx = new MulMinContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mulMin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			kw_mulmin();
			setState(499);
			dos_ptos();
			setState(500);
			comillas();
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMBRE:
				{
				setState(501);
				nombre();
				}
				break;
			case DIGITO:
				{
				setState(502);
				digito();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(505);
			comillas();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(506);
				coma();
				}
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

	public static class MulMaxContext extends ParserRuleContext {
		public Kw_mulmaxContext kw_mulmax() {
			return getRuleContext(Kw_mulmaxContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public DigitoContext digito() {
			return getRuleContext(DigitoContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public MulMaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulMax; }
	}

	public final MulMaxContext mulMax() throws RecognitionException {
		MulMaxContext _localctx = new MulMaxContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mulMax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			kw_mulmax();
			setState(510);
			dos_ptos();
			setState(511);
			comillas();
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMBRE:
				{
				setState(512);
				nombre();
				}
				break;
			case DIGITO:
				{
				setState(513);
				digito();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(516);
			comillas();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(517);
				coma();
				}
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

	public static class LanguageDataContext extends ParserRuleContext {
		public LanguageDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageData; }
	}

	public final LanguageDataContext languageData() throws RecognitionException {
		LanguageDataContext _localctx = new LanguageDataContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_languageData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nombre_objContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public Nombre_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_obj; }
	}

	public final Nombre_objContext nombre_obj() throws RecognitionException {
		Nombre_objContext _localctx = new Nombre_objContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nombre_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			nombre();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SacorcheteContext extends ParserRuleContext {
		public TerminalNode SACORCHETE() { return getToken(PruebaParser.SACORCHETE, 0); }
		public SacorcheteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sacorchete; }
	}

	public final SacorcheteContext sacorchete() throws RecognitionException {
		SacorcheteContext _localctx = new SacorcheteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sacorchete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(SACORCHETE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SccorcheteContext extends ParserRuleContext {
		public TerminalNode SCCORCHETE() { return getToken(PruebaParser.SCCORCHETE, 0); }
		public SccorcheteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sccorchete; }
	}

	public final SccorcheteContext sccorchete() throws RecognitionException {
		SccorcheteContext _localctx = new SccorcheteContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sccorchete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(SCCORCHETE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public ArrobaContext arroba() {
			return getRuleContext(ArrobaContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			comillas();
			setState(529);
			arroba();
			setState(530);
			nombre();
			setState(531);
			comillas();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_trueContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(PruebaParser.KW_TRUE, 0); }
		public Kw_trueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_true; }
	}

	public final Kw_trueContext kw_true() throws RecognitionException {
		Kw_trueContext _localctx = new Kw_trueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_kw_true);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(KW_TRUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_falseContext extends ParserRuleContext {
		public TerminalNode KW_FALSE() { return getToken(PruebaParser.KW_FALSE, 0); }
		public Kw_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_false; }
	}

	public final Kw_falseContext kw_false() throws RecognitionException {
		Kw_falseContext _localctx = new Kw_falseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kw_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(KW_FALSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_isListContext extends ParserRuleContext {
		public TerminalNode KW_ISLIST() { return getToken(PruebaParser.KW_ISLIST, 0); }
		public Kw_isListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_isList; }
	}

	public final Kw_isListContext kw_isList() throws RecognitionException {
		Kw_isListContext _localctx = new Kw_isListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_kw_isList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(KW_ISLIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_contextContext extends ParserRuleContext {
		public TerminalNode KW_CONTEXT() { return getToken(PruebaParser.KW_CONTEXT, 0); }
		public Kw_contextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_context; }
	}

	public final Kw_contextContext kw_context() throws RecognitionException {
		Kw_contextContext _localctx = new Kw_contextContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_kw_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(KW_CONTEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_httpContext extends ParserRuleContext {
		public TerminalNode KW_HTTP() { return getToken(PruebaParser.KW_HTTP, 0); }
		public Kw_httpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_http; }
	}

	public final Kw_httpContext kw_http() throws RecognitionException {
		Kw_httpContext _localctx = new Kw_httpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kw_http);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(KW_HTTP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_wwwContext extends ParserRuleContext {
		public TerminalNode KW_WWW() { return getToken(PruebaParser.KW_WWW, 0); }
		public Kw_wwwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_www; }
	}

	public final Kw_wwwContext kw_www() throws RecognitionException {
		Kw_wwwContext _localctx = new Kw_wwwContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kw_www);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(KW_WWW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_idContext extends ParserRuleContext {
		public TerminalNode KW_ID() { return getToken(PruebaParser.KW_ID, 0); }
		public Kw_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_id; }
	}

	public final Kw_idContext kw_id() throws RecognitionException {
		Kw_idContext _localctx = new Kw_idContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_kw_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(KW_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_nameContext extends ParserRuleContext {
		public TerminalNode KW_NAME() { return getToken(PruebaParser.KW_NAME, 0); }
		public Kw_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_name; }
	}

	public final Kw_nameContext kw_name() throws RecognitionException {
		Kw_nameContext _localctx = new Kw_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_kw_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(KW_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_labelContext extends ParserRuleContext {
		public TerminalNode KW_LABEL() { return getToken(PruebaParser.KW_LABEL, 0); }
		public Kw_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_label; }
	}

	public final Kw_labelContext kw_label() throws RecognitionException {
		Kw_labelContext _localctx = new Kw_labelContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_kw_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(KW_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_propertiesContext extends ParserRuleContext {
		public TerminalNode KW_PROPERTIES() { return getToken(PruebaParser.KW_PROPERTIES, 0); }
		public Kw_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_properties; }
	}

	public final Kw_propertiesContext kw_properties() throws RecognitionException {
		Kw_propertiesContext _localctx = new Kw_propertiesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_kw_properties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(KW_PROPERTIES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_inheritsContext extends ParserRuleContext {
		public TerminalNode KW_INHERITS() { return getToken(PruebaParser.KW_INHERITS, 0); }
		public Kw_inheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inherits; }
	}

	public final Kw_inheritsContext kw_inherits() throws RecognitionException {
		Kw_inheritsContext _localctx = new Kw_inheritsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_kw_inherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(KW_INHERITS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_graphsContext extends ParserRuleContext {
		public TerminalNode KW_GRAPHS() { return getToken(PruebaParser.KW_GRAPHS, 0); }
		public Kw_graphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_graphs; }
	}

	public final Kw_graphsContext kw_graphs() throws RecognitionException {
		Kw_graphsContext _localctx = new Kw_graphsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_kw_graphs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(KW_GRAPHS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_reversenameContext extends ParserRuleContext {
		public TerminalNode KW_REVERSENAME() { return getToken(PruebaParser.KW_REVERSENAME, 0); }
		public Kw_reversenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_reversename; }
	}

	public final Kw_reversenameContext kw_reversename() throws RecognitionException {
		Kw_reversenameContext _localctx = new Kw_reversenameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_kw_reversename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(KW_REVERSENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_labelrnContext extends ParserRuleContext {
		public TerminalNode KW_LABELRN() { return getToken(PruebaParser.KW_LABELRN, 0); }
		public Kw_labelrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_labelrn; }
	}

	public final Kw_labelrnContext kw_labelrn() throws RecognitionException {
		Kw_labelrnContext _localctx = new Kw_labelrnContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_kw_labelrn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(KW_LABELRN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_fromContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(PruebaParser.KW_FROM, 0); }
		public Kw_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_from; }
	}

	public final Kw_fromContext kw_from() throws RecognitionException {
		Kw_fromContext _localctx = new Kw_fromContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_kw_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(KW_FROM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_toContext extends ParserRuleContext {
		public TerminalNode KW_TO() { return getToken(PruebaParser.KW_TO, 0); }
		public Kw_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_to; }
	}

	public final Kw_toContext kw_to() throws RecognitionException {
		Kw_toContext _localctx = new Kw_toContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_kw_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(KW_TO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_typeofContext extends ParserRuleContext {
		public TerminalNode KW_TYPEOF() { return getToken(PruebaParser.KW_TYPEOF, 0); }
		public Kw_typeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_typeof; }
	}

	public final Kw_typeofContext kw_typeof() throws RecognitionException {
		Kw_typeofContext _localctx = new Kw_typeofContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_kw_typeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(KW_TYPEOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_usedbyContext extends ParserRuleContext {
		public TerminalNode KW_USEDBY() { return getToken(PruebaParser.KW_USEDBY, 0); }
		public Kw_usedbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_usedby; }
	}

	public final Kw_usedbyContext kw_usedby() throws RecognitionException {
		Kw_usedbyContext _localctx = new Kw_usedbyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_kw_usedby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(KW_USEDBY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_mulmaxContext extends ParserRuleContext {
		public TerminalNode KW_MULMAX() { return getToken(PruebaParser.KW_MULMAX, 0); }
		public Kw_mulmaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_mulmax; }
	}

	public final Kw_mulmaxContext kw_mulmax() throws RecognitionException {
		Kw_mulmaxContext _localctx = new Kw_mulmaxContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_kw_mulmax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(KW_MULMAX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_mulminContext extends ParserRuleContext {
		public TerminalNode KW_MULMIN() { return getToken(PruebaParser.KW_MULMIN, 0); }
		public Kw_mulminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_mulmin; }
	}

	public final Kw_mulminContext kw_mulmin() throws RecognitionException {
		Kw_mulminContext _localctx = new Kw_mulminContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_kw_mulmin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(KW_MULMIN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PUNTO() { return getToken(PruebaParser.PUNTO, 0); }
		public PuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto; }
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
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

	public static class BarraContext extends ParserRuleContext {
		public TerminalNode BARRA() { return getToken(PruebaParser.BARRA, 0); }
		public BarraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barra; }
	}

	public final BarraContext barra() throws RecognitionException {
		BarraContext _localctx = new BarraContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_barra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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

	public static class AlmContext extends ParserRuleContext {
		public TerminalNode ALM() { return getToken(PruebaParser.ALM, 0); }
		public AlmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alm; }
	}

	public final AlmContext alm() throws RecognitionException {
		AlmContext _localctx = new AlmContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_alm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(ALM);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DOS_PTOS() { return getToken(PruebaParser.DOS_PTOS, 0); }
		public Dos_ptosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos_ptos; }
	}

	public final Dos_ptosContext dos_ptos() throws RecognitionException {
		Dos_ptosContext _localctx = new Dos_ptosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dos_ptos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(DOS_PTOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SallaveContext extends ParserRuleContext {
		public TerminalNode SALLAVE() { return getToken(PruebaParser.SALLAVE, 0); }
		public SallaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sallave; }
	}

	public final SallaveContext sallave() throws RecognitionException {
		SallaveContext _localctx = new SallaveContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_sallave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(SALLAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScllaveContext extends ParserRuleContext {
		public TerminalNode SCLLAVE() { return getToken(PruebaParser.SCLLAVE, 0); }
		public ScllaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scllave; }
	}

	public final ScllaveContext scllave() throws RecognitionException {
		ScllaveContext _localctx = new ScllaveContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_scllave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(SCLLAVE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMA() { return getToken(PruebaParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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

	public static class ComillasContext extends ParserRuleContext {
		public TerminalNode COMILLAS() { return getToken(PruebaParser.COMILLAS, 0); }
		public ComillasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comillas; }
	}

	public final ComillasContext comillas() throws RecognitionException {
		ComillasContext _localctx = new ComillasContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_comillas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(COMILLAS);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode BBAJA() { return getToken(PruebaParser.BBAJA, 0); }
		public BbajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbaja; }
	}

	public final BbajaContext bbaja() throws RecognitionException {
		BbajaContext _localctx = new BbajaContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_bbaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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

	public static class NombreContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(PruebaParser.NOMBRE, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(NOMBRE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitoContext extends ParserRuleContext {
		public TerminalNode DIGITO() { return getToken(PruebaParser.DIGITO, 0); }
		public DigitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digito; }
	}

	public final DigitoContext digito() throws RecognitionException {
		DigitoContext _localctx = new DigitoContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_digito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(DIGITO);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INTRO() { return getToken(PruebaParser.INTRO, 0); }
		public IntroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intro; }
	}

	public final IntroContext intro() throws RecognitionException {
		IntroContext _localctx = new IntroContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_intro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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

	public static class ArrobaContext extends ParserRuleContext {
		public TerminalNode ARROBA() { return getToken(PruebaParser.ARROBA, 0); }
		public ArrobaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arroba; }
	}

	public final ArrobaContext arroba() throws RecognitionException {
		ArrobaContext _localctx = new ArrobaContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_arroba);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(ARROBA);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u025a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\5\2\u008b\n\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3\u0095\n\3\r\3\16\3\u0096\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u00a3\n\4\r\4\16\4\u00a4\3\5\3\5\3\5\3"+
		"\5\3\5\6\5\u00ac\n\5\r\5\16\5\u00ad\5\5\u00b0\n\5\6\5\u00b2\n\5\r\5\16"+
		"\5\u00b3\3\5\3\5\3\6\3\6\6\6\u00ba\n\6\r\6\16\6\u00bb\3\6\3\6\5\6\u00c0"+
		"\n\6\3\7\3\7\3\7\5\7\u00c5\n\7\3\7\3\7\6\7\u00c9\n\7\r\7\16\7\u00ca\3"+
		"\7\5\7\u00ce\n\7\3\7\5\7\u00d1\n\7\3\7\5\7\u00d4\n\7\6\7\u00d6\n\7\r\7"+
		"\16\7\u00d7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e7"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f0\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\6\b\u00f8\n\b\r\b\16\b\u00f9\3\b\5\b\u00fd\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\6\b\u0105\n\b\r\b\16\b\u0106\3\b\5\b\u010a\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\6\b\u0114\n\b\r\b\16\b\u0115\3\b\3\b\5\b\u011a\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0125\n\b\5\b\u0127\n\b\3\t\3\t\3\t"+
		"\3\t\5\t\u012d\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0135\n\n\f\n\16\n\u0138"+
		"\13\n\3\n\3\n\3\13\3\13\6\13\u013e\n\13\r\13\16\13\u013f\3\13\3\13\5\13"+
		"\u0144\n\13\3\f\3\f\3\f\6\f\u0149\n\f\r\f\16\f\u014a\3\r\3\r\3\r\5\r\u0150"+
		"\n\r\3\r\5\r\u0153\n\r\3\r\5\r\u0156\n\r\3\16\3\16\3\16\3\16\5\16\u015c"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0164\n\17\3\20\3\20\3\20\3\20"+
		"\5\20\u016a\n\20\3\21\3\21\3\21\3\21\5\21\u0170\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0177\n\22\7\22\u0179\n\22\f\22\16\22\u017c\13\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\5\23\u0184\n\23\3\23\5\23\u0187\n\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0193\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u01a6\n\30\3\30\5\30\u01a9\n\30\3\30\5\30\u01ac\n\30\3\30\5\30\u01af"+
		"\n\30\3\30\5\30\u01b2\n\30\3\30\3\30\3\30\3\30\5\30\u01b8\n\30\3\30\5"+
		"\30\u01bb\n\30\3\30\5\30\u01be\n\30\3\30\3\30\5\30\u01c2\n\30\3\30\5\30"+
		"\u01c5\n\30\5\30\u01c7\n\30\3\31\3\31\3\31\3\31\6\31\u01cd\n\31\r\31\16"+
		"\31\u01ce\3\31\3\31\6\31\u01d3\n\31\r\31\16\31\u01d4\3\31\3\31\5\31\u01d9"+
		"\n\31\3\31\3\31\3\31\3\31\5\31\u01df\n\31\5\31\u01e1\n\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u01e9\n\32\3\33\3\33\3\33\3\33\5\33\u01ef\n\33"+
		"\3\34\3\34\5\34\u01f3\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u01fa\n\35\3"+
		"\35\3\35\5\35\u01fe\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0205\n\36\3\36"+
		"\3\36\5\36\u0209\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3D\2\2E\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\2\2\2\u0264\2\u0088\3\2\2\2\4\u008f\3\2\2\2\6\u00a2\3\2\2\2\b\u00a6"+
		"\3\2\2\2\n\u00b7\3\2\2\2\f\u00c1\3\2\2\2\16\u0126\3\2\2\2\20\u0128\3\2"+
		"\2\2\22\u0130\3\2\2\2\24\u013b\3\2\2\2\26\u0148\3\2\2\2\30\u014c\3\2\2"+
		"\2\32\u0157\3\2\2\2\34\u015d\3\2\2\2\36\u0165\3\2\2\2 \u016b\3\2\2\2\""+
		"\u0171\3\2\2\2$\u017f\3\2\2\2&\u018c\3\2\2\2(\u0194\3\2\2\2*\u0198\3\2"+
		"\2\2,\u019c\3\2\2\2.\u01c6\3\2\2\2\60\u01e0\3\2\2\2\62\u01e2\3\2\2\2\64"+
		"\u01ea\3\2\2\2\66\u01f2\3\2\2\28\u01f4\3\2\2\2:\u01ff\3\2\2\2<\u020a\3"+
		"\2\2\2>\u020c\3\2\2\2@\u020e\3\2\2\2B\u0210\3\2\2\2D\u0212\3\2\2\2F\u0217"+
		"\3\2\2\2H\u0219\3\2\2\2J\u021b\3\2\2\2L\u021d\3\2\2\2N\u021f\3\2\2\2P"+
		"\u0221\3\2\2\2R\u0223\3\2\2\2T\u0225\3\2\2\2V\u0227\3\2\2\2X\u0229\3\2"+
		"\2\2Z\u022b\3\2\2\2\\\u022d\3\2\2\2^\u022f\3\2\2\2`\u0231\3\2\2\2b\u0233"+
		"\3\2\2\2d\u0235\3\2\2\2f\u0237\3\2\2\2h\u0239\3\2\2\2j\u023b\3\2\2\2l"+
		"\u023d\3\2\2\2n\u023f\3\2\2\2p\u0241\3\2\2\2r\u0243\3\2\2\2t\u0245\3\2"+
		"\2\2v\u0247\3\2\2\2x\u0249\3\2\2\2z\u024b\3\2\2\2|\u024d\3\2\2\2~\u024f"+
		"\3\2\2\2\u0080\u0251\3\2\2\2\u0082\u0253\3\2\2\2\u0084\u0255\3\2\2\2\u0086"+
		"\u0257\3\2\2\2\u0088\u008a\5v<\2\u0089\u008b\5\4\3\2\u008a\u0089\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\5\20\t\2\u008d"+
		"\u008e\5x=\2\u008e\3\3\2\2\2\u008f\u0090\5v<\2\u0090\u0091\5L\'\2\u0091"+
		"\u0092\5t;\2\u0092\u0094\5v<\2\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\5x=\2\u0099\u009a\5z>\2\u009a\5\3\2\2\2\u009b\u00a3"+
		"\5t;\2\u009c\u00a3\5\b\5\2\u009d\u00a3\5\u0084C\2\u009e\u00a3\5\n\6\2"+
		"\u009f\u00a3\5\u0080A\2\u00a0\u00a3\5\f\7\2\u00a1\u00a3\5\16\b\2\u00a2"+
		"\u009b\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2"+
		"\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\7\3\2\2\2"+
		"\u00a6\u00b1\5|?\2\u00a7\u00af\5\u0080A\2\u00a8\u00ab\5~@\2\u00a9\u00ac"+
		"\5\u0080A\2\u00aa\u00ac\5\u0082B\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00a7\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5|?\2\u00b6\t\3\2\2\2\u00b7"+
		"\u00b9\5v<\2\u00b8\u00ba\5\6\4\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf"+
		"\5x=\2\u00be\u00c0\5z>\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\13\3\2\2\2\u00c1\u00c2\5|?\2\u00c2\u00c4\5N(\2\u00c3\u00c5\5P)\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d5\3\2\2\2\u00c6\u00c9\5\u0080"+
		"A\2\u00c7\u00c9\5\u0082B\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ce\5n8\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0"+
		"\3\2\2\2\u00cf\u00d1\5p9\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d4\5r:\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2"+
		"\2\u00d4\u00d6\3\2\2\2\u00d5\u00c8\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\5|?\2\u00da"+
		"\r\3\2\2\2\u00db\u00dc\5|?\2\u00dc\u00dd\5\u0086D\2\u00dd\u00de\5\u0080"+
		"A\2\u00de\u00df\5|?\2\u00df\u00e0\5t;\2\u00e0\u00e1\5|?\2\u00e1\u00e2"+
		"\5\u0080A\2\u00e2\u00e3\5t;\2\u00e3\u00e4\5\u0080A\2\u00e4\u00e6\5|?\2"+
		"\u00e5\u00e7\5z>\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u0127"+
		"\3\2\2\2\u00e8\u00e9\5|?\2\u00e9\u00ea\5\u0086D\2\u00ea\u00eb\5\u0080"+
		"A\2\u00eb\u00ec\5|?\2\u00ec\u00ed\5t;\2\u00ed\u00ef\5\f\7\2\u00ee\u00f0"+
		"\5z>\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u0127\3\2\2\2\u00f1"+
		"\u00f2\5|?\2\u00f2\u00f3\5\u0086D\2\u00f3\u00f4\5\u0080A\2\u00f4\u00f5"+
		"\5|?\2\u00f5\u00f7\5t;\2\u00f6\u00f8\5\b\5\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2"+
		"\2\2\u00fb\u00fd\5z>\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0127"+
		"\3\2\2\2\u00fe\u00ff\5|?\2\u00ff\u0100\5\u0086D\2\u0100\u0101\5\u0080"+
		"A\2\u0101\u0102\5|?\2\u0102\u0104\5t;\2\u0103\u0105\5\u0080A\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u010a\5z>\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2"+
		"\2\u010a\u0127\3\2\2\2\u010b\u010c\5|?\2\u010c\u010d\5\u0086D\2\u010d"+
		"\u010e\5\u0080A\2\u010e\u010f\5|?\2\u010f\u0110\5t;\2\u0110\u0111\5|?"+
		"\2\u0111\u0113\5\u0086D\2\u0112\u0114\5\u0080A\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0119\5|?\2\u0118\u011a\5z>\2\u0119\u0118\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u0127\3\2\2\2\u011b\u011c\5|?\2\u011c\u011d\5\u0086D\2"+
		"\u011d\u011e\5\u0080A\2\u011e\u011f\5|?\2\u011f\u0120\5t;\2\u0120\u0121"+
		"\5|?\2\u0121\u0122\5\u0082B\2\u0122\u0124\5|?\2\u0123\u0125\5z>\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u00db\3\2"+
		"\2\2\u0126\u00e8\3\2\2\2\u0126\u00f1\3\2\2\2\u0126\u00fe\3\2\2\2\u0126"+
		"\u010b\3\2\2\2\u0126\u011b\3\2\2\2\u0127\17\3\2\2\2\u0128\u0129\5\\/\2"+
		"\u0129\u012a\5t;\2\u012a\u012c\5@!\2\u012b\u012d\5\22\n\2\u012c\u012b"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5B\"\2\u012f"+
		"\21\3\2\2\2\u0130\u0131\5D#\2\u0131\u0132\5t;\2\u0132\u0136\5@!\2\u0133"+
		"\u0135\5\24\13\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013a\5B\"\2\u013a\23\3\2\2\2\u013b\u013d\5v<\2\u013c\u013e\5\26\f\2"+
		"\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\5x=\2\u0142\u0144\5z>\2\u0143"+
		"\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\25\3\2\2\2\u0145\u0149\5\30\r"+
		"\2\u0146\u0149\5$\23\2\u0147\u0149\5.\30\2\u0148\u0145\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\27\3\2\2\2\u014c\u014d\5\32\16\2\u014d\u014f\5\34"+
		"\17\2\u014e\u0150\5\36\20\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u0153\5 \21\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0155\3\2\2\2\u0154\u0156\5\"\22\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\31\3\2\2\2\u0157\u0158\5R*\2\u0158\u0159\5t;\2\u0159"+
		"\u015b\5\f\7\2\u015a\u015c\5z>\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2"+
		"\2\u015c\33\3\2\2\2\u015d\u015e\5T+\2\u015e\u015f\5t;\2\u015f\u0160\5"+
		"|?\2\u0160\u0161\5\u0080A\2\u0161\u0163\5|?\2\u0162\u0164\5z>\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\35\3\2\2\2\u0165\u0166\5V,\2"+
		"\u0166\u0167\5t;\2\u0167\u0169\5\n\6\2\u0168\u016a\5z>\2\u0169\u0168\3"+
		"\2\2\2\u0169\u016a\3\2\2\2\u016a\37\3\2\2\2\u016b\u016c\5Z.\2\u016c\u016d"+
		"\5t;\2\u016d\u016f\5\f\7\2\u016e\u0170\5z>\2\u016f\u016e\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170!\3\2\2\2\u0171\u0172\5X-\2\u0172\u0173\5t;\2\u0173"+
		"\u017a\5@!\2\u0174\u0176\5\f\7\2\u0175\u0177\5z>\2\u0176\u0175\3\2\2\2"+
		"\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017c"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\5B\"\2\u017e#\3\2\2\2\u017f\u0180\5\32\16\2"+
		"\u0180\u0181\5\34\17\2\u0181\u0183\5&\24\2\u0182\u0184\5\36\20\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0187\5("+
		"\25\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\5*\26\2\u0189\u018a\5,\27\2\u018a\u018b\5\"\22\2\u018b%\3\2\2\2"+
		"\u018c\u018d\5^\60\2\u018d\u018e\5t;\2\u018e\u018f\5|?\2\u018f\u0190\5"+
		"\u0080A\2\u0190\u0192\5|?\2\u0191\u0193\5z>\2\u0192\u0191\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\'\3\2\2\2\u0194\u0195\5`\61\2\u0195\u0196\5t;\2\u0196"+
		"\u0197\5\n\6\2\u0197)\3\2\2\2\u0198\u0199\5b\62\2\u0199\u019a\5t;\2\u019a"+
		"\u019b\5\f\7\2\u019b+\3\2\2\2\u019c\u019d\5d\63\2\u019d\u019e\5t;\2\u019e"+
		"\u019f\5\f\7\2\u019f-\3\2\2\2\u01a0\u01a1\5\32\16\2\u01a1\u01a2\5\34\17"+
		"\2\u01a2\u01a3\5\60\31\2\u01a3\u01a5\5\36\20\2\u01a4\u01a6\5\64\33\2\u01a5"+
		"\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\5:"+
		"\36\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u01ac\58\35\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2"+
		"\2\2\u01ad\u01af\5\62\32\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01b2\5<\37\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01c7\3\2\2\2\u01b3\u01b4\5\32\16\2\u01b4\u01b5\5\34\17\2\u01b5"+
		"\u01b7\5\60\31\2\u01b6\u01b8\5\64\33\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01bb\5:\36\2\u01ba\u01b9\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be\58\35\2\u01bd\u01bc\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\5\36\20\2\u01c0"+
		"\u01c2\5\62\32\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3"+
		"\2\2\2\u01c3\u01c5\5<\37\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01a0\3\2\2\2\u01c6\u01b3\3\2\2\2\u01c7/\3\2\2\2"+
		"\u01c8\u01c9\5f\64\2\u01c9\u01ca\5t;\2\u01ca\u01cc\5|?\2\u01cb\u01cd\5"+
		"\u0080A\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2"+
		"\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\5t;\2\u01d1\u01d3"+
		"\5\u0080A\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2\2"+
		"\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\5|?\2\u01d7\u01d9"+
		"\5z>\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01e1\3\2\2\2\u01da"+
		"\u01db\5f\64\2\u01db\u01dc\5t;\2\u01dc\u01de\5\f\7\2\u01dd\u01df\5z>\2"+
		"\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01c8"+
		"\3\2\2\2\u01e0\u01da\3\2\2\2\u01e1\61\3\2\2\2\u01e2\u01e3\5h\65\2\u01e3"+
		"\u01e4\5t;\2\u01e4\u01e5\5@!\2\u01e5\u01e6\5\f\7\2\u01e6\u01e8\5B\"\2"+
		"\u01e7\u01e9\5z>\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\63\3"+
		"\2\2\2\u01ea\u01eb\5J&\2\u01eb\u01ec\5t;\2\u01ec\u01ee\5\66\34\2\u01ed"+
		"\u01ef\5z>\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\65\3\2\2\2"+
		"\u01f0\u01f3\5F$\2\u01f1\u01f3\5H%\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3"+
		"\2\2\2\u01f3\67\3\2\2\2\u01f4\u01f5\5l\67\2\u01f5\u01f6\5t;\2\u01f6\u01f9"+
		"\5|?\2\u01f7\u01fa\5\u0080A\2\u01f8\u01fa\5\u0082B\2\u01f9\u01f7\3\2\2"+
		"\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\5|?\2\u01fc\u01fe"+
		"\5z>\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe9\3\2\2\2\u01ff\u0200"+
		"\5j\66\2\u0200\u0201\5t;\2\u0201\u0204\5|?\2\u0202\u0205\5\u0080A\2\u0203"+
		"\u0205\5\u0082B\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\u0208\5|?\2\u0207\u0209\5z>\2\u0208\u0207\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209;\3\2\2\2\u020a\u020b\3\2\2\2\u020b=\3\2\2\2\u020c"+
		"\u020d\5\u0080A\2\u020d?\3\2\2\2\u020e\u020f\7\5\2\2\u020fA\3\2\2\2\u0210"+
		"\u0211\7\6\2\2\u0211C\3\2\2\2\u0212\u0213\5|?\2\u0213\u0214\5\u0086D\2"+
		"\u0214\u0215\5\u0080A\2\u0215\u0216\5|?\2\u0216E\3\2\2\2\u0217\u0218\7"+
		"!\2\2\u0218G\3\2\2\2\u0219\u021a\7\"\2\2\u021aI\3\2\2\2\u021b\u021c\7"+
		" \2\2\u021cK\3\2\2\2\u021d\u021e\7\17\2\2\u021eM\3\2\2\2\u021f\u0220\7"+
		"\21\2\2\u0220O\3\2\2\2\u0221\u0222\7\20\2\2\u0222Q\3\2\2\2\u0223\u0224"+
		"\7\22\2\2\u0224S\3\2\2\2\u0225\u0226\7\23\2\2\u0226U\3\2\2\2\u0227\u0228"+
		"\7\31\2\2\u0228W\3\2\2\2\u0229\u022a\7\24\2\2\u022aY\3\2\2\2\u022b\u022c"+
		"\7\25\2\2\u022c[\3\2\2\2\u022d\u022e\7\26\2\2\u022e]\3\2\2\2\u022f\u0230"+
		"\7\27\2\2\u0230_\3\2\2\2\u0231\u0232\7\30\2\2\u0232a\3\2\2\2\u0233\u0234"+
		"\7\32\2\2\u0234c\3\2\2\2\u0235\u0236\7\33\2\2\u0236e\3\2\2\2\u0237\u0238"+
		"\7\34\2\2\u0238g\3\2\2\2\u0239\u023a\7\35\2\2\u023ai\3\2\2\2\u023b\u023c"+
		"\7\36\2\2\u023ck\3\2\2\2\u023d\u023e\7\37\2\2\u023em\3\2\2\2\u023f\u0240"+
		"\7\n\2\2\u0240o\3\2\2\2\u0241\u0242\7\13\2\2\u0242q\3\2\2\2\u0243\u0244"+
		"\7\f\2\2\u0244s\3\2\2\2\u0245\u0246\7\b\2\2\u0246u\3\2\2\2\u0247\u0248"+
		"\7\3\2\2\u0248w\3\2\2\2\u0249\u024a\7\4\2\2\u024ay\3\2\2\2\u024b\u024c"+
		"\7\7\2\2\u024c{\3\2\2\2\u024d\u024e\7\t\2\2\u024e}\3\2\2\2\u024f\u0250"+
		"\7\r\2\2\u0250\177\3\2\2\2\u0251\u0252\7#\2\2\u0252\u0081\3\2\2\2\u0253"+
		"\u0254\7$\2\2\u0254\u0083\3\2\2\2\u0255\u0256\7%\2\2\u0256\u0085\3\2\2"+
		"\2\u0257\u0258\7\16\2\2\u0258\u0087\3\2\2\2F\u008a\u0096\u00a2\u00a4\u00ab"+
		"\u00ad\u00af\u00b3\u00bb\u00bf\u00c4\u00c8\u00ca\u00cd\u00d0\u00d3\u00d7"+
		"\u00e6\u00ef\u00f9\u00fc\u0106\u0109\u0115\u0119\u0124\u0126\u012c\u0136"+
		"\u013f\u0143\u0148\u014a\u014f\u0152\u0155\u015b\u0163\u0169\u016f\u0176"+
		"\u017a\u0183\u0186\u0192\u01a5\u01a8\u01ab\u01ae\u01b1\u01b7\u01ba\u01bd"+
		"\u01c1\u01c4\u01c6\u01ce\u01d4\u01d8\u01de\u01e0\u01e8\u01ee\u01f2\u01f9"+
		"\u01fd\u0204\u0208";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}