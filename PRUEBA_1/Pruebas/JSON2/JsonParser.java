// Generated from JsonParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SALLAVE=1, SCLLAVE=2, SACORCHETE=3, SCCORCHETE=4, COMA=5, DOS_PTOS=6, 
		COMILLAS=7, PUNTO=8, BARRA=9, ALM=10, BBAJA=11, ARROBA=12, KW_CONTEXT=13, 
		KW_WWW=14, KW_HTTP=15, KW_ID=16, KW_NAME=17, KW_PROPERTIES=18, KW_INHERITS=19, 
		KW_GRAPHS=20, KW_REVERSENAME=21, KW_LABELRN=22, KW_LANGUAGEDATA=23, KW_LANGUAGE=24, 
		KW_NUMBER=25, KW_WORDTYPE=26, KW_GENDER=27, KW_OPTIONAL=28, KW_LABEL=29, 
		KW_FROM=30, KW_TO=31, KW_TYPEOF=32, KW_USEDBY=33, KW_MULMAX=34, KW_MULMIN=35, 
		KW_ISLIST=36, KW_TRUE=37, KW_FALSE=38, NOMBRE=39, DIGITO=40, INTRO=41;
	public static final int
		RULE_init = 0, RULE_context = 1, RULE_descripcion = 2, RULE_cadena = 3, 
		RULE_ampli_info = 4, RULE_ampli_info_content = 5, RULE_contenido = 6, 
		RULE_otro_nombre = 7, RULE_ruta = 8, RULE_declaracion = 9, RULE_graphs = 10, 
		RULE_lista = 11, RULE_objetos = 12, RULE_prop = 13, RULE_pclass = 14, 
		RULE_id = 15, RULE_name = 16, RULE_label = 17, RULE_properties = 18, RULE_inherits = 19, 
		RULE_relationship = 20, RULE_reverse_name = 21, RULE_labelrn = 22, RULE_from = 23, 
		RULE_to = 24, RULE_property = 25, RULE_optional = 26, RULE_languageData = 27, 
		RULE_typeOf = 28, RULE_usedby = 29, RULE_isList = 30, RULE_bool = 31, 
		RULE_mulMin = 32, RULE_mulMax = 33, RULE_languageProperty = 34, RULE_language = 35, 
		RULE_gender = 36, RULE_number = 37, RULE_wordType = 38, RULE_nombre_obj = 39, 
		RULE_sacorchete = 40, RULE_sccorchete = 41, RULE_target = 42, RULE_kw = 43, 
		RULE_kw_true = 44, RULE_kw_false = 45, RULE_kw_isList = 46, RULE_kw_optional = 47, 
		RULE_kw_languageData = 48, RULE_kw_context = 49, RULE_kw_http = 50, RULE_kw_www = 51, 
		RULE_kw_id = 52, RULE_kw_name = 53, RULE_kw_label = 54, RULE_kw_properties = 55, 
		RULE_kw_inherits = 56, RULE_kw_graphs = 57, RULE_kw_reversename = 58, 
		RULE_kw_labelrn = 59, RULE_kw_from = 60, RULE_kw_to = 61, RULE_kw_typeof = 62, 
		RULE_kw_usedby = 63, RULE_kw_mulmax = 64, RULE_kw_mulmin = 65, RULE_kw_language = 66, 
		RULE_kw_number = 67, RULE_kw_gender = 68, RULE_kw_wordType = 69, RULE_punto = 70, 
		RULE_barra = 71, RULE_alm = 72, RULE_dos_ptos = 73, RULE_sallave = 74, 
		RULE_scllave = 75, RULE_coma = 76, RULE_comillas = 77, RULE_bbaja = 78, 
		RULE_nombre = 79, RULE_digito = 80, RULE_intro = 81, RULE_arroba = 82;
	public static final String[] ruleNames = {
		"init", "context", "descripcion", "cadena", "ampli_info", "ampli_info_content", 
		"contenido", "otro_nombre", "ruta", "declaracion", "graphs", "lista", 
		"objetos", "prop", "pclass", "id", "name", "label", "properties", "inherits", 
		"relationship", "reverse_name", "labelrn", "from", "to", "property", "optional", 
		"languageData", "typeOf", "usedby", "isList", "bool", "mulMin", "mulMax", 
		"languageProperty", "language", "gender", "number", "wordType", "nombre_obj", 
		"sacorchete", "sccorchete", "target", "kw", "kw_true", "kw_false", "kw_isList", 
		"kw_optional", "kw_languageData", "kw_context", "kw_http", "kw_www", "kw_id", 
		"kw_name", "kw_label", "kw_properties", "kw_inherits", "kw_graphs", "kw_reversename", 
		"kw_labelrn", "kw_from", "kw_to", "kw_typeof", "kw_usedby", "kw_mulmax", 
		"kw_mulmin", "kw_language", "kw_number", "kw_gender", "kw_wordType", "punto", 
		"barra", "alm", "dos_ptos", "sallave", "scllave", "coma", "comillas", 
		"bbaja", "nombre", "digito", "intro", "arroba"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "','", "':'", "'\"'", "'.'", "'/'", 
		"'#'", "'_'", "'@'", "'\"@context\":'", "'www.'", "'http://'", "'\"@id\":'", 
		"'\"name\":'", "'\"properties\":'", "'\"inherits\":'", "'\"graphs\":'", 
		"'\"reverseName\":'", "'\"labelReverseName\":'", "'\"languageData\":'", 
		"'\"language\":'", "'\"number\":'", "'\"wordType\":'", "'\"gender\":'", 
		"'\"optional\":'", "'\"label\":'", "'\"from\":'", "'\"to\":'", "'\"typeOf\":'", 
		"'\"usedby\":'", "'\"multiplicityMax\":'", "'\"multiplicityMin\":'", "'\"isList\":'", 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SALLAVE", "SCLLAVE", "SACORCHETE", "SCCORCHETE", "COMA", "DOS_PTOS", 
		"COMILLAS", "PUNTO", "BARRA", "ALM", "BBAJA", "ARROBA", "KW_CONTEXT", 
		"KW_WWW", "KW_HTTP", "KW_ID", "KW_NAME", "KW_PROPERTIES", "KW_INHERITS", 
		"KW_GRAPHS", "KW_REVERSENAME", "KW_LABELRN", "KW_LANGUAGEDATA", "KW_LANGUAGE", 
		"KW_NUMBER", "KW_WORDTYPE", "KW_GENDER", "KW_OPTIONAL", "KW_LABEL", "KW_FROM", 
		"KW_TO", "KW_TYPEOF", "KW_USEDBY", "KW_MULMAX", "KW_MULMIN", "KW_ISLIST", 
		"KW_TRUE", "KW_FALSE", "NOMBRE", "DIGITO", "INTRO"
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
	public String getGrammarFileName() { return "JsonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonParser(TokenStream input) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			sallave();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONTEXT) {
				{
				setState(167);
				context();
				}
			}

			setState(170);
			graphs();
			setState(171);
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
		public Kw_contextContext kw_context() {
			return getRuleContext(Kw_contextContext.class,0);
		}
		public SallaveContext sallave() {
			return getRuleContext(SallaveContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextContext context() throws RecognitionException {
		ContextContext _localctx = new ContextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_context);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			kw_context();
			setState(174);
			sallave();
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				descripcion();
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(176);
					coma();
					}
					break;
				}
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALLAVE) | (1L << COMA) | (1L << DOS_PTOS) | (1L << COMILLAS) | (1L << KW_CONTEXT) | (1L << KW_WWW) | (1L << KW_HTTP) | (1L << KW_ID) | (1L << KW_NAME) | (1L << KW_PROPERTIES) | (1L << KW_INHERITS) | (1L << KW_REVERSENAME) | (1L << KW_LABELRN) | (1L << KW_LANGUAGEDATA) | (1L << KW_LANGUAGE) | (1L << KW_NUMBER) | (1L << KW_WORDTYPE) | (1L << KW_GENDER) | (1L << KW_OPTIONAL) | (1L << KW_LABEL) | (1L << KW_FROM) | (1L << KW_TO) | (1L << KW_TYPEOF) | (1L << KW_USEDBY) | (1L << KW_MULMAX) | (1L << KW_MULMIN) | (1L << KW_ISLIST) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << NOMBRE) | (1L << INTRO))) != 0) );
			setState(183);
			scllave();
			setState(184);
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
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<KwContext> kw() {
			return getRuleContexts(KwContext.class);
		}
		public KwContext kw(int i) {
			return getRuleContext(KwContext.class,i);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public DescripcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descripcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitDescripcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescripcionContext descripcion() throws RecognitionException {
		DescripcionContext _localctx = new DescripcionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descripcion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(186);
						dos_ptos();
						}
						break;
					case 2:
						{
						setState(187);
						cadena();
						}
						break;
					case 3:
						{
						setState(188);
						intro();
						}
						break;
					case 4:
						{
						setState(189);
						ampli_info();
						}
						break;
					case 5:
						{
						setState(190);
						nombre();
						}
						break;
					case 6:
						{
						setState(191);
						ruta();
						}
						break;
					case 7:
						{
						setState(192);
						declaracion();
						}
						break;
					case 8:
						{
						setState(193);
						target();
						}
						break;
					case 9:
						{
						setState(194);
						kw();
						}
						break;
					case 10:
						{
						setState(195);
						comillas();
						}
						break;
					case 11:
						{
						setState(196);
						coma();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cadena);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			comillas();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRE) {
				{
				{
				setState(202);
				nombre();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BBAJA) {
					{
					setState(203);
					bbaja();
					setState(206); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(206);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case NOMBRE:
								{
								setState(204);
								nombre();
								}
								break;
							case DIGITO:
								{
								setState(205);
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
						setState(208); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
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
		public List<Ampli_info_contentContext> ampli_info_content() {
			return getRuleContexts(Ampli_info_contentContext.class);
		}
		public Ampli_info_contentContext ampli_info_content(int i) {
			return getRuleContext(Ampli_info_contentContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitAmpli_info(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ampli_infoContext ampli_info() throws RecognitionException {
		Ampli_infoContext _localctx = new Ampli_infoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ampli_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			sallave();
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(220);
					ampli_info_content();
					}
					break;
				case 2:
					{
					setState(221);
					descripcion();
					}
					break;
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALLAVE) | (1L << COMA) | (1L << DOS_PTOS) | (1L << COMILLAS) | (1L << KW_CONTEXT) | (1L << KW_WWW) | (1L << KW_HTTP) | (1L << KW_ID) | (1L << KW_NAME) | (1L << KW_PROPERTIES) | (1L << KW_INHERITS) | (1L << KW_REVERSENAME) | (1L << KW_LABELRN) | (1L << KW_LANGUAGEDATA) | (1L << KW_LANGUAGE) | (1L << KW_NUMBER) | (1L << KW_WORDTYPE) | (1L << KW_GENDER) | (1L << KW_OPTIONAL) | (1L << KW_LABEL) | (1L << KW_FROM) | (1L << KW_TO) | (1L << KW_TYPEOF) | (1L << KW_USEDBY) | (1L << KW_MULMAX) | (1L << KW_MULMIN) | (1L << KW_ISLIST) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << NOMBRE) | (1L << INTRO))) != 0) );
			setState(226);
			scllave();
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(227);
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

	public static class Ampli_info_contentContext extends ParserRuleContext {
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Ampli_info_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ampli_info_content; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitAmpli_info_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ampli_info_contentContext ampli_info_content() throws RecognitionException {
		Ampli_info_contentContext _localctx = new Ampli_info_contentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ampli_info_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230);
					contenido();
					setState(231);
					coma();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(235); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ContenidoContext extends ParserRuleContext {
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public Otro_nombreContext otro_nombre() {
			return getRuleContext(Otro_nombreContext.class,0);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitContenido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contenido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			comillas();
			setState(238);
			nombre();
			setState(239);
			comillas();
			setState(240);
			dos_ptos();
			setState(241);
			comillas();
			setState(242);
			otro_nombre();
			setState(243);
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

	public static class Otro_nombreContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public Otro_nombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otro_nombre; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitOtro_nombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Otro_nombreContext otro_nombre() throws RecognitionException {
		Otro_nombreContext _localctx = new Otro_nombreContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_otro_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitRuta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RutaContext ruta() throws RecognitionException {
		RutaContext _localctx = new RutaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruta);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			comillas();
			setState(248);
			kw_http();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WWW) {
				{
				setState(249);
				kw_www();
				}
			}

			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(254);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NOMBRE:
							{
							setState(252);
							nombre();
							}
							break;
						case DIGITO:
							{
							setState(253);
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
					setState(256); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO) {
					{
					setState(258);
					punto();
					}
				}

				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BARRA) {
					{
					setState(261);
					barra();
					}
				}

				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALM) {
					{
					setState(264);
					alm();
					}
				}

				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOMBRE || _la==DIGITO );
			setState(271);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracion);
		int _la;
		try {
			int _alt;
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				comillas();
				setState(274);
				arroba();
				setState(275);
				nombre();
				setState(276);
				comillas();
				setState(277);
				dos_ptos();
				setState(278);
				comillas();
				setState(279);
				nombre();
				setState(280);
				dos_ptos();
				setState(281);
				nombre();
				setState(282);
				comillas();
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(283);
					coma();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				comillas();
				setState(287);
				arroba();
				setState(288);
				nombre();
				setState(289);
				comillas();
				setState(290);
				dos_ptos();
				setState(291);
				ruta();
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(292);
					coma();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				comillas();
				setState(296);
				arroba();
				setState(297);
				nombre();
				setState(298);
				comillas();
				setState(299);
				dos_ptos();
				setState(301); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(300);
						cadena();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(303); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(305);
					coma();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				comillas();
				setState(309);
				arroba();
				setState(310);
				nombre();
				setState(311);
				comillas();
				setState(312);
				dos_ptos();
				setState(314); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(313);
						nombre();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(316); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(318);
					coma();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				comillas();
				setState(322);
				arroba();
				setState(323);
				nombre();
				setState(324);
				comillas();
				setState(325);
				dos_ptos();
				setState(326);
				comillas();
				setState(327);
				arroba();
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(328);
					nombre();
					}
					}
					setState(331); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOMBRE );
				setState(333);
				comillas();
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(334);
					coma();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				comillas();
				setState(338);
				arroba();
				setState(339);
				nombre();
				setState(340);
				comillas();
				setState(341);
				dos_ptos();
				setState(342);
				comillas();
				setState(343);
				digito();
				setState(344);
				comillas();
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(345);
					coma();
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

	public static class GraphsContext extends ParserRuleContext {
		public Kw_graphsContext kw_graphs() {
			return getRuleContext(Kw_graphsContext.class,0);
		}
		public SacorcheteContext sacorchete() {
			return getRuleContext(SacorcheteContext.class,0);
		}
		public SccorcheteContext sccorchete() {
			return getRuleContext(SccorcheteContext.class,0);
		}
		public List<ListaContext> lista() {
			return getRuleContexts(ListaContext.class);
		}
		public ListaContext lista(int i) {
			return getRuleContext(ListaContext.class,i);
		}
		public GraphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitGraphs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphsContext graphs() throws RecognitionException {
		GraphsContext _localctx = new GraphsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_graphs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			kw_graphs();
			setState(351);
			sacorchete();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALLAVE) {
				{
				{
				setState(352);
				lista();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
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

	public static class ListaContext extends ParserRuleContext {
		public List<SallaveContext> sallave() {
			return getRuleContexts(SallaveContext.class);
		}
		public SallaveContext sallave(int i) {
			return getRuleContext(SallaveContext.class,i);
		}
		public List<ScllaveContext> scllave() {
			return getRuleContexts(ScllaveContext.class);
		}
		public ScllaveContext scllave(int i) {
			return getRuleContext(ScllaveContext.class,i);
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
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public List<ObjetosContext> objetos() {
			return getRuleContexts(ObjetosContext.class);
		}
		public ObjetosContext objetos(int i) {
			return getRuleContext(ObjetosContext.class,i);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Kw_propertiesContext kw_properties() {
			return getRuleContext(Kw_propertiesContext.class,0);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lista);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				sallave();
				{
				setState(361);
				comillas();
				setState(362);
				nombre();
				setState(363);
				comillas();
				setState(364);
				dos_ptos();
				}
				setState(366);
				sallave();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMILLAS) {
					{
					{
					setState(367);
					objetos();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(373);
				scllave();
				setState(374);
				scllave();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(375);
					coma();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				sallave();
				{
				setState(379);
				kw_properties();
				}
				setState(380);
				sallave();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMILLAS) {
					{
					{
					setState(381);
					objetos();
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
				scllave();
				setState(388);
				scllave();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(389);
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

	public static class ObjetosContext extends ParserRuleContext {
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
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public ObjetosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitObjetos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetosContext objetos() throws RecognitionException {
		ObjetosContext _localctx = new ObjetosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objetos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			target();
			setState(395);
			dos_ptos();
			setState(396);
			sacorchete();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALLAVE || _la==COMILLAS) {
				{
				{
				setState(397);
				prop();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(398);
					coma();
					}
				}

				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
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

	public static class PropContext extends ParserRuleContext {
		public SallaveContext sallave() {
			return getRuleContext(SallaveContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public PclassContext pclass() {
			return getRuleContext(PclassContext.class,0);
		}
		public RelationshipContext relationship() {
			return getRuleContext(RelationshipContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public LanguagePropertyContext languageProperty() {
			return getRuleContext(LanguagePropertyContext.class,0);
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
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMILLAS) {
				{
				setState(408);
				comillas();
				setState(409);
				nombre();
				setState(410);
				comillas();
				setState(411);
				dos_ptos();
				}
			}

			setState(415);
			sallave();
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(416);
				pclass();
				}
				break;
			case 2:
				{
				setState(417);
				relationship();
				}
				break;
			case 3:
				{
				setState(418);
				property();
				}
				break;
			case 4:
				{
				setState(419);
				languageProperty();
				}
				break;
			}
			setState(422);
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

	public static class PclassContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<InheritsContext> inherits() {
			return getRuleContexts(InheritsContext.class);
		}
		public InheritsContext inherits(int i) {
			return getRuleContext(InheritsContext.class,i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public PclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitPclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PclassContext pclass() throws RecognitionException {
		PclassContext _localctx = new PclassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(429);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_ID:
					{
					setState(424);
					id();
					}
					break;
				case KW_NAME:
					{
					setState(425);
					name();
					}
					break;
				case KW_LABEL:
					{
					setState(426);
					label();
					}
					break;
				case KW_INHERITS:
					{
					setState(427);
					inherits();
					}
					break;
				case KW_PROPERTIES:
					{
					setState(428);
					properties();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(431); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ID) | (1L << KW_NAME) | (1L << KW_PROPERTIES) | (1L << KW_INHERITS) | (1L << KW_LABEL))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			kw_id();
			setState(434);
			ruta();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(435);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			kw_name();
			setState(439);
			comillas();
			setState(440);
			nombre();
			setState(441);
			comillas();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(442);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			kw_label();
			setState(446);
			ampli_info();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(447);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			kw_properties();
			setState(451);
			sacorchete();
			setState(456); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(452);
				ruta();
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(453);
					coma();
					}
				}

				}
				}
				setState(458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMILLAS );
			setState(460);
			sccorchete();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(461);
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
		public InheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherits; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitInherits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritsContext inherits() throws RecognitionException {
		InheritsContext _localctx = new InheritsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inherits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			kw_inherits();
			setState(469); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(465);
				ruta();
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(466);
					coma();
					}
					break;
				}
				}
				}
				setState(471); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMILLAS );
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(473);
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

	public static class RelationshipContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Reverse_nameContext> reverse_name() {
			return getRuleContexts(Reverse_nameContext.class);
		}
		public Reverse_nameContext reverse_name(int i) {
			return getRuleContext(Reverse_nameContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<LabelrnContext> labelrn() {
			return getRuleContexts(LabelrnContext.class);
		}
		public LabelrnContext labelrn(int i) {
			return getRuleContext(LabelrnContext.class,i);
		}
		public List<FromContext> from() {
			return getRuleContexts(FromContext.class);
		}
		public FromContext from(int i) {
			return getRuleContext(FromContext.class,i);
		}
		public List<ToContext> to() {
			return getRuleContexts(ToContext.class);
		}
		public ToContext to(int i) {
			return getRuleContext(ToContext.class,i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public RelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitRelationship(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipContext relationship() throws RecognitionException {
		RelationshipContext _localctx = new RelationshipContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relationship);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(484);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_ID:
					{
					setState(476);
					id();
					}
					break;
				case KW_NAME:
					{
					setState(477);
					name();
					}
					break;
				case KW_REVERSENAME:
					{
					setState(478);
					reverse_name();
					}
					break;
				case KW_LABEL:
					{
					setState(479);
					label();
					}
					break;
				case KW_LABELRN:
					{
					setState(480);
					labelrn();
					}
					break;
				case KW_FROM:
					{
					setState(481);
					from();
					}
					break;
				case KW_TO:
					{
					setState(482);
					to();
					}
					break;
				case KW_PROPERTIES:
					{
					setState(483);
					properties();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ID) | (1L << KW_NAME) | (1L << KW_PROPERTIES) | (1L << KW_REVERSENAME) | (1L << KW_LABELRN) | (1L << KW_LABEL) | (1L << KW_FROM) | (1L << KW_TO))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitReverse_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reverse_nameContext reverse_name() throws RecognitionException {
		Reverse_nameContext _localctx = new Reverse_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_reverse_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			kw_reversename();
			setState(489);
			comillas();
			setState(490);
			nombre();
			setState(491);
			comillas();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(492);
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
		public Ampli_infoContext ampli_info() {
			return getRuleContext(Ampli_infoContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public LabelrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelrn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitLabelrn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelrnContext labelrn() throws RecognitionException {
		LabelrnContext _localctx = new LabelrnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_labelrn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			kw_labelrn();
			setState(496);
			ampli_info();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(497);
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

	public static class FromContext extends ParserRuleContext {
		public Kw_fromContext kw_from() {
			return getRuleContext(Kw_fromContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			kw_from();
			setState(501);
			ruta();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(502);
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

	public static class ToContext extends ParserRuleContext {
		public Kw_toContext kw_to() {
			return getRuleContext(Kw_toContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			kw_to();
			setState(506);
			ruta();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(507);
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

	public static class PropertyContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TypeOfContext> typeOf() {
			return getRuleContexts(TypeOfContext.class);
		}
		public TypeOfContext typeOf(int i) {
			return getRuleContext(TypeOfContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<IsListContext> isList() {
			return getRuleContexts(IsListContext.class);
		}
		public IsListContext isList(int i) {
			return getRuleContext(IsListContext.class,i);
		}
		public List<OptionalContext> optional() {
			return getRuleContexts(OptionalContext.class);
		}
		public OptionalContext optional(int i) {
			return getRuleContext(OptionalContext.class,i);
		}
		public List<MulMaxContext> mulMax() {
			return getRuleContexts(MulMaxContext.class);
		}
		public MulMaxContext mulMax(int i) {
			return getRuleContext(MulMaxContext.class,i);
		}
		public List<MulMinContext> mulMin() {
			return getRuleContexts(MulMinContext.class);
		}
		public MulMinContext mulMin(int i) {
			return getRuleContext(MulMinContext.class,i);
		}
		public List<UsedbyContext> usedby() {
			return getRuleContexts(UsedbyContext.class);
		}
		public UsedbyContext usedby(int i) {
			return getRuleContext(UsedbyContext.class,i);
		}
		public List<LanguageDataContext> languageData() {
			return getRuleContexts(LanguageDataContext.class);
		}
		public LanguageDataContext languageData(int i) {
			return getRuleContext(LanguageDataContext.class,i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			id();
			setState(511);
			name();
			setState(520); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(520);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_TYPEOF:
					{
					setState(512);
					typeOf();
					}
					break;
				case KW_LABEL:
					{
					setState(513);
					label();
					}
					break;
				case KW_ISLIST:
					{
					setState(514);
					isList();
					}
					break;
				case KW_OPTIONAL:
					{
					setState(515);
					optional();
					}
					break;
				case KW_MULMAX:
					{
					setState(516);
					mulMax();
					}
					break;
				case KW_MULMIN:
					{
					setState(517);
					mulMin();
					}
					break;
				case KW_USEDBY:
					{
					setState(518);
					usedby();
					}
					break;
				case KW_LANGUAGEDATA:
					{
					setState(519);
					languageData();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_LANGUAGEDATA) | (1L << KW_OPTIONAL) | (1L << KW_LABEL) | (1L << KW_TYPEOF) | (1L << KW_USEDBY) | (1L << KW_MULMAX) | (1L << KW_MULMIN) | (1L << KW_ISLIST))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalContext extends ParserRuleContext {
		public Kw_optionalContext kw_optional() {
			return getRuleContext(Kw_optionalContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Ampli_infoContext ampli_info() {
			return getRuleContext(Ampli_infoContext.class,0);
		}
		public Kw_trueContext kw_true() {
			return getRuleContext(Kw_trueContext.class,0);
		}
		public Kw_falseContext kw_false() {
			return getRuleContext(Kw_falseContext.class,0);
		}
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_optional);
		int _la;
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				kw_optional();
				setState(525);
				nombre();
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(526);
					coma();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				kw_optional();
				setState(530);
				ampli_info();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(531);
					coma();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				kw_optional();
				setState(537);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_TRUE:
					{
					setState(535);
					kw_true();
					}
					break;
				case KW_FALSE:
					{
					setState(536);
					kw_false();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(539);
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

	public static class LanguageDataContext extends ParserRuleContext {
		public Kw_languageDataContext kw_languageData() {
			return getRuleContext(Kw_languageDataContext.class,0);
		}
		public Nombre_objContext nombre_obj() {
			return getRuleContext(Nombre_objContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Ampli_infoContext ampli_info() {
			return getRuleContext(Ampli_infoContext.class,0);
		}
		public LanguageDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageData; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitLanguageData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageDataContext languageData() throws RecognitionException {
		LanguageDataContext _localctx = new LanguageDataContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_languageData);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				kw_languageData();
				setState(545);
				nombre_obj();
				setState(546);
				coma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				kw_languageData();
				setState(549);
				ampli_info();
				setState(550);
				coma();
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
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitTypeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOfContext typeOf() throws RecognitionException {
		TypeOfContext _localctx = new TypeOfContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeOf);
		int _la;
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				kw_typeof();
				setState(555);
				comillas();
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(556);
					nombre();
					}
					}
					setState(559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOMBRE );
				setState(561);
				dos_ptos();
				setState(563); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(562);
					nombre();
					}
					}
					setState(565); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NOMBRE );
				setState(567);
				comillas();
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(568);
					coma();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				kw_typeof();
				setState(572);
				ruta();
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(573);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitUsedby(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsedbyContext usedby() throws RecognitionException {
		UsedbyContext _localctx = new UsedbyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_usedby);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			kw_usedby();
			setState(579);
			sacorchete();
			setState(580);
			ruta();
			setState(581);
			sccorchete();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(582);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitIsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsListContext isList() throws RecognitionException {
		IsListContext _localctx = new IsListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_isList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			kw_isList();
			setState(586);
			bool();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(587);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				kw_true();
				}
				break;
			case KW_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitMulMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulMinContext mulMin() throws RecognitionException {
		MulMinContext _localctx = new MulMinContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mulMin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			kw_mulmin();
			setState(595);
			comillas();
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMBRE:
				{
				setState(596);
				nombre();
				}
				break;
			case DIGITO:
				{
				setState(597);
				digito();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(600);
			comillas();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(601);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitMulMax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulMaxContext mulMax() throws RecognitionException {
		MulMaxContext _localctx = new MulMaxContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mulMax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			kw_mulmax();
			setState(605);
			comillas();
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMBRE:
				{
				setState(606);
				nombre();
				}
				break;
			case DIGITO:
				{
				setState(607);
				digito();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(610);
			comillas();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(611);
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

	public static class LanguagePropertyContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<LanguageContext> language() {
			return getRuleContexts(LanguageContext.class);
		}
		public LanguageContext language(int i) {
			return getRuleContext(LanguageContext.class,i);
		}
		public List<GenderContext> gender() {
			return getRuleContexts(GenderContext.class);
		}
		public GenderContext gender(int i) {
			return getRuleContext(GenderContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<WordTypeContext> wordType() {
			return getRuleContexts(WordTypeContext.class);
		}
		public WordTypeContext wordType(int i) {
			return getRuleContext(WordTypeContext.class,i);
		}
		public LanguagePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitLanguageProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguagePropertyContext languageProperty() throws RecognitionException {
		LanguagePropertyContext _localctx = new LanguagePropertyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_languageProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(619);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_ID:
					{
					setState(614);
					id();
					}
					break;
				case KW_LANGUAGE:
					{
					setState(615);
					language();
					}
					break;
				case KW_GENDER:
					{
					setState(616);
					gender();
					}
					break;
				case KW_NUMBER:
					{
					setState(617);
					number();
					}
					break;
				case KW_WORDTYPE:
					{
					setState(618);
					wordType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(621); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ID) | (1L << KW_LANGUAGE) | (1L << KW_NUMBER) | (1L << KW_WORDTYPE) | (1L << KW_GENDER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguageContext extends ParserRuleContext {
		public Kw_languageContext kw_language() {
			return getRuleContext(Kw_languageContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Ampli_infoContext ampli_info() {
			return getRuleContext(Ampli_infoContext.class,0);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_language);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				kw_language();
				setState(624);
				nombre();
				setState(625);
				coma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				kw_language();
				setState(628);
				ampli_info();
				setState(629);
				coma();
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

	public static class GenderContext extends ParserRuleContext {
		public Kw_genderContext kw_gender() {
			return getRuleContext(Kw_genderContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Ampli_infoContext ampli_info() {
			return getRuleContext(Ampli_infoContext.class,0);
		}
		public GenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gender; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitGender(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenderContext gender() throws RecognitionException {
		GenderContext _localctx = new GenderContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_gender);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				kw_gender();
				setState(634);
				nombre();
				setState(635);
				coma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				kw_gender();
				setState(638);
				ampli_info();
				setState(639);
				coma();
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

	public static class NumberContext extends ParserRuleContext {
		public Kw_numberContext kw_number() {
			return getRuleContext(Kw_numberContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Ampli_infoContext ampli_info() {
			return getRuleContext(Ampli_infoContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_number);
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				kw_number();
				setState(644);
				nombre();
				setState(645);
				coma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				kw_number();
				setState(648);
				ampli_info();
				setState(649);
				coma();
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

	public static class WordTypeContext extends ParserRuleContext {
		public Kw_wordTypeContext kw_wordType() {
			return getRuleContext(Kw_wordTypeContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Ampli_infoContext ampli_info() {
			return getRuleContext(Ampli_infoContext.class,0);
		}
		public WordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitWordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordTypeContext wordType() throws RecognitionException {
		WordTypeContext _localctx = new WordTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_wordType);
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				kw_wordType();
				setState(654);
				nombre();
				setState(655);
				coma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				kw_wordType();
				setState(658);
				ampli_info();
				setState(659);
				coma();
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

	public static class Nombre_objContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public Nombre_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_obj; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitNombre_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nombre_objContext nombre_obj() throws RecognitionException {
		Nombre_objContext _localctx = new Nombre_objContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nombre_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
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
		public TerminalNode SACORCHETE() { return getToken(JsonParser.SACORCHETE, 0); }
		public SacorcheteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sacorchete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitSacorchete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SacorcheteContext sacorchete() throws RecognitionException {
		SacorcheteContext _localctx = new SacorcheteContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sacorchete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
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
		public TerminalNode SCCORCHETE() { return getToken(JsonParser.SCCORCHETE, 0); }
		public SccorcheteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sccorchete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitSccorchete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SccorcheteContext sccorchete() throws RecognitionException {
		SccorcheteContext _localctx = new SccorcheteContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sccorchete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			comillas();
			setState(670);
			arroba();
			setState(671);
			nombre();
			setState(672);
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

	public static class KwContext extends ParserRuleContext {
		public Kw_contextContext kw_context() {
			return getRuleContext(Kw_contextContext.class,0);
		}
		public Kw_falseContext kw_false() {
			return getRuleContext(Kw_falseContext.class,0);
		}
		public Kw_fromContext kw_from() {
			return getRuleContext(Kw_fromContext.class,0);
		}
		public Kw_genderContext kw_gender() {
			return getRuleContext(Kw_genderContext.class,0);
		}
		public Kw_httpContext kw_http() {
			return getRuleContext(Kw_httpContext.class,0);
		}
		public Kw_idContext kw_id() {
			return getRuleContext(Kw_idContext.class,0);
		}
		public Kw_inheritsContext kw_inherits() {
			return getRuleContext(Kw_inheritsContext.class,0);
		}
		public Kw_isListContext kw_isList() {
			return getRuleContext(Kw_isListContext.class,0);
		}
		public Kw_labelContext kw_label() {
			return getRuleContext(Kw_labelContext.class,0);
		}
		public Kw_labelrnContext kw_labelrn() {
			return getRuleContext(Kw_labelrnContext.class,0);
		}
		public Kw_languageContext kw_language() {
			return getRuleContext(Kw_languageContext.class,0);
		}
		public Kw_mulmaxContext kw_mulmax() {
			return getRuleContext(Kw_mulmaxContext.class,0);
		}
		public Kw_mulminContext kw_mulmin() {
			return getRuleContext(Kw_mulminContext.class,0);
		}
		public Kw_nameContext kw_name() {
			return getRuleContext(Kw_nameContext.class,0);
		}
		public Kw_numberContext kw_number() {
			return getRuleContext(Kw_numberContext.class,0);
		}
		public Kw_propertiesContext kw_properties() {
			return getRuleContext(Kw_propertiesContext.class,0);
		}
		public Kw_reversenameContext kw_reversename() {
			return getRuleContext(Kw_reversenameContext.class,0);
		}
		public Kw_toContext kw_to() {
			return getRuleContext(Kw_toContext.class,0);
		}
		public Kw_trueContext kw_true() {
			return getRuleContext(Kw_trueContext.class,0);
		}
		public Kw_typeofContext kw_typeof() {
			return getRuleContext(Kw_typeofContext.class,0);
		}
		public Kw_usedbyContext kw_usedby() {
			return getRuleContext(Kw_usedbyContext.class,0);
		}
		public Kw_wordTypeContext kw_wordType() {
			return getRuleContext(Kw_wordTypeContext.class,0);
		}
		public Kw_wwwContext kw_www() {
			return getRuleContext(Kw_wwwContext.class,0);
		}
		public Kw_optionalContext kw_optional() {
			return getRuleContext(Kw_optionalContext.class,0);
		}
		public Kw_languageDataContext kw_languageData() {
			return getRuleContext(Kw_languageDataContext.class,0);
		}
		public KwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwContext kw() throws RecognitionException {
		KwContext _localctx = new KwContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONTEXT:
				{
				setState(674);
				kw_context();
				}
				break;
			case KW_FALSE:
				{
				setState(675);
				kw_false();
				}
				break;
			case KW_FROM:
				{
				setState(676);
				kw_from();
				}
				break;
			case KW_GENDER:
				{
				setState(677);
				kw_gender();
				}
				break;
			case KW_HTTP:
				{
				setState(678);
				kw_http();
				}
				break;
			case KW_ID:
				{
				setState(679);
				kw_id();
				}
				break;
			case KW_INHERITS:
				{
				setState(680);
				kw_inherits();
				}
				break;
			case KW_ISLIST:
				{
				setState(681);
				kw_isList();
				}
				break;
			case KW_LABEL:
				{
				setState(682);
				kw_label();
				}
				break;
			case KW_LABELRN:
				{
				setState(683);
				kw_labelrn();
				}
				break;
			case KW_LANGUAGE:
				{
				setState(684);
				kw_language();
				}
				break;
			case KW_MULMAX:
				{
				setState(685);
				kw_mulmax();
				}
				break;
			case KW_MULMIN:
				{
				setState(686);
				kw_mulmin();
				}
				break;
			case KW_NAME:
				{
				setState(687);
				kw_name();
				}
				break;
			case KW_NUMBER:
				{
				setState(688);
				kw_number();
				}
				break;
			case KW_PROPERTIES:
				{
				setState(689);
				kw_properties();
				}
				break;
			case KW_REVERSENAME:
				{
				setState(690);
				kw_reversename();
				}
				break;
			case KW_TO:
				{
				setState(691);
				kw_to();
				}
				break;
			case KW_TRUE:
				{
				setState(692);
				kw_true();
				}
				break;
			case KW_TYPEOF:
				{
				setState(693);
				kw_typeof();
				}
				break;
			case KW_USEDBY:
				{
				setState(694);
				kw_usedby();
				}
				break;
			case KW_WORDTYPE:
				{
				setState(695);
				kw_wordType();
				}
				break;
			case KW_WWW:
				{
				setState(696);
				kw_www();
				}
				break;
			case KW_OPTIONAL:
				{
				setState(697);
				kw_optional();
				}
				break;
			case KW_LANGUAGEDATA:
				{
				setState(698);
				kw_languageData();
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

	public static class Kw_trueContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(JsonParser.KW_TRUE, 0); }
		public Kw_trueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_true; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_true(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_trueContext kw_true() throws RecognitionException {
		Kw_trueContext _localctx = new Kw_trueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_kw_true);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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
		public TerminalNode KW_FALSE() { return getToken(JsonParser.KW_FALSE, 0); }
		public Kw_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_false; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_falseContext kw_false() throws RecognitionException {
		Kw_falseContext _localctx = new Kw_falseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_kw_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
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
		public TerminalNode KW_ISLIST() { return getToken(JsonParser.KW_ISLIST, 0); }
		public Kw_isListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_isList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_isList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_isListContext kw_isList() throws RecognitionException {
		Kw_isListContext _localctx = new Kw_isListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_kw_isList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
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

	public static class Kw_optionalContext extends ParserRuleContext {
		public TerminalNode KW_OPTIONAL() { return getToken(JsonParser.KW_OPTIONAL, 0); }
		public Kw_optionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_optional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_optional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_optionalContext kw_optional() throws RecognitionException {
		Kw_optionalContext _localctx = new Kw_optionalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_kw_optional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(KW_OPTIONAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_languageDataContext extends ParserRuleContext {
		public TerminalNode KW_LANGUAGEDATA() { return getToken(JsonParser.KW_LANGUAGEDATA, 0); }
		public Kw_languageDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_languageData; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_languageData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_languageDataContext kw_languageData() throws RecognitionException {
		Kw_languageDataContext _localctx = new Kw_languageDataContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_kw_languageData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(KW_LANGUAGEDATA);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode KW_CONTEXT() { return getToken(JsonParser.KW_CONTEXT, 0); }
		public Kw_contextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_context; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_context(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_contextContext kw_context() throws RecognitionException {
		Kw_contextContext _localctx = new Kw_contextContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_kw_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
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
		public TerminalNode KW_HTTP() { return getToken(JsonParser.KW_HTTP, 0); }
		public Kw_httpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_http; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_http(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_httpContext kw_http() throws RecognitionException {
		Kw_httpContext _localctx = new Kw_httpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_kw_http);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
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
		public TerminalNode KW_WWW() { return getToken(JsonParser.KW_WWW, 0); }
		public Kw_wwwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_www; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_www(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_wwwContext kw_www() throws RecognitionException {
		Kw_wwwContext _localctx = new Kw_wwwContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_kw_www);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
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
		public TerminalNode KW_ID() { return getToken(JsonParser.KW_ID, 0); }
		public Kw_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_idContext kw_id() throws RecognitionException {
		Kw_idContext _localctx = new Kw_idContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_kw_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
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
		public TerminalNode KW_NAME() { return getToken(JsonParser.KW_NAME, 0); }
		public Kw_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_nameContext kw_name() throws RecognitionException {
		Kw_nameContext _localctx = new Kw_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_kw_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
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
		public TerminalNode KW_LABEL() { return getToken(JsonParser.KW_LABEL, 0); }
		public Kw_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_labelContext kw_label() throws RecognitionException {
		Kw_labelContext _localctx = new Kw_labelContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_kw_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
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
		public TerminalNode KW_PROPERTIES() { return getToken(JsonParser.KW_PROPERTIES, 0); }
		public Kw_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_properties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_properties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_propertiesContext kw_properties() throws RecognitionException {
		Kw_propertiesContext _localctx = new Kw_propertiesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_kw_properties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
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
		public TerminalNode KW_INHERITS() { return getToken(JsonParser.KW_INHERITS, 0); }
		public Kw_inheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inherits; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_inherits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_inheritsContext kw_inherits() throws RecognitionException {
		Kw_inheritsContext _localctx = new Kw_inheritsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_kw_inherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
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
		public TerminalNode KW_GRAPHS() { return getToken(JsonParser.KW_GRAPHS, 0); }
		public Kw_graphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_graphs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_graphs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_graphsContext kw_graphs() throws RecognitionException {
		Kw_graphsContext _localctx = new Kw_graphsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_kw_graphs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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
		public TerminalNode KW_REVERSENAME() { return getToken(JsonParser.KW_REVERSENAME, 0); }
		public Kw_reversenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_reversename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_reversename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_reversenameContext kw_reversename() throws RecognitionException {
		Kw_reversenameContext _localctx = new Kw_reversenameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_kw_reversename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
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
		public TerminalNode KW_LABELRN() { return getToken(JsonParser.KW_LABELRN, 0); }
		public Kw_labelrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_labelrn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_labelrn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_labelrnContext kw_labelrn() throws RecognitionException {
		Kw_labelrnContext _localctx = new Kw_labelrnContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_kw_labelrn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
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
		public TerminalNode KW_FROM() { return getToken(JsonParser.KW_FROM, 0); }
		public Kw_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_from; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_fromContext kw_from() throws RecognitionException {
		Kw_fromContext _localctx = new Kw_fromContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_kw_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
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
		public TerminalNode KW_TO() { return getToken(JsonParser.KW_TO, 0); }
		public Kw_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_to; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_toContext kw_to() throws RecognitionException {
		Kw_toContext _localctx = new Kw_toContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_kw_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
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
		public TerminalNode KW_TYPEOF() { return getToken(JsonParser.KW_TYPEOF, 0); }
		public Kw_typeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_typeof; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_typeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_typeofContext kw_typeof() throws RecognitionException {
		Kw_typeofContext _localctx = new Kw_typeofContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_kw_typeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
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
		public TerminalNode KW_USEDBY() { return getToken(JsonParser.KW_USEDBY, 0); }
		public Kw_usedbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_usedby; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_usedby(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_usedbyContext kw_usedby() throws RecognitionException {
		Kw_usedbyContext _localctx = new Kw_usedbyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_kw_usedby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
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
		public TerminalNode KW_MULMAX() { return getToken(JsonParser.KW_MULMAX, 0); }
		public Kw_mulmaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_mulmax; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_mulmax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_mulmaxContext kw_mulmax() throws RecognitionException {
		Kw_mulmaxContext _localctx = new Kw_mulmaxContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_kw_mulmax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
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
		public TerminalNode KW_MULMIN() { return getToken(JsonParser.KW_MULMIN, 0); }
		public Kw_mulminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_mulmin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_mulmin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_mulminContext kw_mulmin() throws RecognitionException {
		Kw_mulminContext _localctx = new Kw_mulminContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_kw_mulmin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
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

	public static class Kw_languageContext extends ParserRuleContext {
		public TerminalNode KW_LANGUAGE() { return getToken(JsonParser.KW_LANGUAGE, 0); }
		public Kw_languageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_language; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_language(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_languageContext kw_language() throws RecognitionException {
		Kw_languageContext _localctx = new Kw_languageContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_kw_language);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(KW_LANGUAGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_numberContext extends ParserRuleContext {
		public TerminalNode KW_NUMBER() { return getToken(JsonParser.KW_NUMBER, 0); }
		public Kw_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_numberContext kw_number() throws RecognitionException {
		Kw_numberContext _localctx = new Kw_numberContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_kw_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(KW_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_genderContext extends ParserRuleContext {
		public TerminalNode KW_GENDER() { return getToken(JsonParser.KW_GENDER, 0); }
		public Kw_genderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_gender; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_gender(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_genderContext kw_gender() throws RecognitionException {
		Kw_genderContext _localctx = new Kw_genderContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_kw_gender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(KW_GENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kw_wordTypeContext extends ParserRuleContext {
		public TerminalNode KW_WORDTYPE() { return getToken(JsonParser.KW_WORDTYPE, 0); }
		public Kw_wordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_wordType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitKw_wordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_wordTypeContext kw_wordType() throws RecognitionException {
		Kw_wordTypeContext _localctx = new Kw_wordTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_kw_wordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(KW_WORDTYPE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PUNTO() { return getToken(JsonParser.PUNTO, 0); }
		public PuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitPunto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
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
		public TerminalNode BARRA() { return getToken(JsonParser.BARRA, 0); }
		public BarraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barra; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitBarra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarraContext barra() throws RecognitionException {
		BarraContext _localctx = new BarraContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_barra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
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
		public TerminalNode ALM() { return getToken(JsonParser.ALM, 0); }
		public AlmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitAlm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlmContext alm() throws RecognitionException {
		AlmContext _localctx = new AlmContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_alm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
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
		public TerminalNode DOS_PTOS() { return getToken(JsonParser.DOS_PTOS, 0); }
		public Dos_ptosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos_ptos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitDos_ptos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dos_ptosContext dos_ptos() throws RecognitionException {
		Dos_ptosContext _localctx = new Dos_ptosContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dos_ptos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
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
		public TerminalNode SALLAVE() { return getToken(JsonParser.SALLAVE, 0); }
		public SallaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sallave; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitSallave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SallaveContext sallave() throws RecognitionException {
		SallaveContext _localctx = new SallaveContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_sallave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
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
		public TerminalNode SCLLAVE() { return getToken(JsonParser.SCLLAVE, 0); }
		public ScllaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scllave; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitScllave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScllaveContext scllave() throws RecognitionException {
		ScllaveContext _localctx = new ScllaveContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_scllave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
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
		public TerminalNode COMA() { return getToken(JsonParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
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
		public TerminalNode COMILLAS() { return getToken(JsonParser.COMILLAS, 0); }
		public ComillasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comillas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitComillas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComillasContext comillas() throws RecognitionException {
		ComillasContext _localctx = new ComillasContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_comillas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
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
		public TerminalNode BBAJA() { return getToken(JsonParser.BBAJA, 0); }
		public BbajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbaja; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitBbaja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BbajaContext bbaja() throws RecognitionException {
		BbajaContext _localctx = new BbajaContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_bbaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
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
		public TerminalNode NOMBRE() { return getToken(JsonParser.NOMBRE, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitNombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
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
		public TerminalNode DIGITO() { return getToken(JsonParser.DIGITO, 0); }
		public DigitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digito; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitDigito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitoContext digito() throws RecognitionException {
		DigitoContext _localctx = new DigitoContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_digito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
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
		public TerminalNode INTRO() { return getToken(JsonParser.INTRO, 0); }
		public IntroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitIntro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntroContext intro() throws RecognitionException {
		IntroContext _localctx = new IntroContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_intro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
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
		public TerminalNode ARROBA() { return getToken(JsonParser.ARROBA, 0); }
		public ArrobaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arroba; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonParserVisitor ) return ((JsonParserVisitor<? extends T>)visitor).visitArroba(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrobaContext arroba() throws RecognitionException {
		ArrobaContext _localctx = new ArrobaContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_arroba);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u030e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\5\2\u00ab\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00b4\n\3\6\3\u00b6"+
		"\n\3\r\3\16\3\u00b7\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\6\4\u00c8\n\4\r\4\16\4\u00c9\3\5\3\5\3\5\3\5\3\5\6\5\u00d1\n\5"+
		"\r\5\16\5\u00d2\5\5\u00d5\n\5\7\5\u00d7\n\5\f\5\16\5\u00da\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\6\6\u00e1\n\6\r\6\16\6\u00e2\3\6\3\6\5\6\u00e7\n\6\3\7"+
		"\3\7\3\7\6\7\u00ec\n\7\r\7\16\7\u00ed\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\5\n\u00fd\n\n\3\n\3\n\6\n\u0101\n\n\r\n\16\n\u0102"+
		"\3\n\5\n\u0106\n\n\3\n\5\n\u0109\n\n\3\n\5\n\u010c\n\n\6\n\u010e\n\n\r"+
		"\n\16\n\u010f\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u011f\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0128\n"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u0130\n\13\r\13\16\13\u0131\3\13"+
		"\5\13\u0135\n\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u013d\n\13\r\13\16"+
		"\13\u013e\3\13\5\13\u0142\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\6\13\u014c\n\13\r\13\16\13\u014d\3\13\3\13\5\13\u0152\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u015d\n\13\5\13\u015f\n\13\3"+
		"\f\3\f\3\f\7\f\u0164\n\f\f\f\16\f\u0167\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0173\n\r\f\r\16\r\u0176\13\r\3\r\3\r\3\r\5\r\u017b"+
		"\n\r\3\r\3\r\3\r\3\r\7\r\u0181\n\r\f\r\16\r\u0184\13\r\3\r\3\r\3\r\5\r"+
		"\u0189\n\r\5\r\u018b\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0192\n\16\7\16"+
		"\u0194\n\16\f\16\16\16\u0197\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01a0\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u01a7\n\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\6\20\u01b0\n\20\r\20\16\20\u01b1\3\21\3\21\3\21"+
		"\5\21\u01b7\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u01be\n\22\3\23\3\23\3"+
		"\23\5\23\u01c3\n\23\3\24\3\24\3\24\3\24\5\24\u01c9\n\24\6\24\u01cb\n\24"+
		"\r\24\16\24\u01cc\3\24\3\24\5\24\u01d1\n\24\3\25\3\25\3\25\5\25\u01d6"+
		"\n\25\6\25\u01d8\n\25\r\25\16\25\u01d9\3\25\5\25\u01dd\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u01e7\n\26\r\26\16\26\u01e8\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u01f0\n\27\3\30\3\30\3\30\5\30\u01f5\n\30\3\31"+
		"\3\31\3\31\5\31\u01fa\n\31\3\32\3\32\3\32\5\32\u01ff\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u020b\n\33\r\33\16\33\u020c"+
		"\3\34\3\34\3\34\5\34\u0212\n\34\3\34\3\34\3\34\5\34\u0217\n\34\3\34\3"+
		"\34\3\34\5\34\u021c\n\34\3\34\5\34\u021f\n\34\5\34\u0221\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u022b\n\35\3\36\3\36\3\36\6\36\u0230"+
		"\n\36\r\36\16\36\u0231\3\36\3\36\6\36\u0236\n\36\r\36\16\36\u0237\3\36"+
		"\3\36\5\36\u023c\n\36\3\36\3\36\3\36\5\36\u0241\n\36\5\36\u0243\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u024a\n\37\3 \3 \3 \5 \u024f\n \3!\3!\5!"+
		"\u0253\n!\3\"\3\"\3\"\3\"\5\"\u0259\n\"\3\"\3\"\5\"\u025d\n\"\3#\3#\3"+
		"#\3#\5#\u0263\n#\3#\3#\5#\u0267\n#\3$\3$\3$\3$\3$\6$\u026e\n$\r$\16$\u026f"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\5%\u027a\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0284"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u028e\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u0298\n(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u02be\n-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3"+
		"K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\2\2U\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\2\2\2\u0347\2\u00a8\3\2\2\2\4\u00af\3\2\2\2\6\u00c7\3\2\2\2\b\u00cb\3"+
		"\2\2\2\n\u00dd\3\2\2\2\f\u00eb\3\2\2\2\16\u00ef\3\2\2\2\20\u00f7\3\2\2"+
		"\2\22\u00f9\3\2\2\2\24\u015e\3\2\2\2\26\u0160\3\2\2\2\30\u018a\3\2\2\2"+
		"\32\u018c\3\2\2\2\34\u019f\3\2\2\2\36\u01af\3\2\2\2 \u01b3\3\2\2\2\"\u01b8"+
		"\3\2\2\2$\u01bf\3\2\2\2&\u01c4\3\2\2\2(\u01d2\3\2\2\2*\u01e6\3\2\2\2,"+
		"\u01ea\3\2\2\2.\u01f1\3\2\2\2\60\u01f6\3\2\2\2\62\u01fb\3\2\2\2\64\u0200"+
		"\3\2\2\2\66\u0220\3\2\2\28\u022a\3\2\2\2:\u0242\3\2\2\2<\u0244\3\2\2\2"+
		">\u024b\3\2\2\2@\u0252\3\2\2\2B\u0254\3\2\2\2D\u025e\3\2\2\2F\u026d\3"+
		"\2\2\2H\u0279\3\2\2\2J\u0283\3\2\2\2L\u028d\3\2\2\2N\u0297\3\2\2\2P\u0299"+
		"\3\2\2\2R\u029b\3\2\2\2T\u029d\3\2\2\2V\u029f\3\2\2\2X\u02bd\3\2\2\2Z"+
		"\u02bf\3\2\2\2\\\u02c1\3\2\2\2^\u02c3\3\2\2\2`\u02c5\3\2\2\2b\u02c7\3"+
		"\2\2\2d\u02c9\3\2\2\2f\u02cb\3\2\2\2h\u02cd\3\2\2\2j\u02cf\3\2\2\2l\u02d1"+
		"\3\2\2\2n\u02d3\3\2\2\2p\u02d5\3\2\2\2r\u02d7\3\2\2\2t\u02d9\3\2\2\2v"+
		"\u02db\3\2\2\2x\u02dd\3\2\2\2z\u02df\3\2\2\2|\u02e1\3\2\2\2~\u02e3\3\2"+
		"\2\2\u0080\u02e5\3\2\2\2\u0082\u02e7\3\2\2\2\u0084\u02e9\3\2\2\2\u0086"+
		"\u02eb\3\2\2\2\u0088\u02ed\3\2\2\2\u008a\u02ef\3\2\2\2\u008c\u02f1\3\2"+
		"\2\2\u008e\u02f3\3\2\2\2\u0090\u02f5\3\2\2\2\u0092\u02f7\3\2\2\2\u0094"+
		"\u02f9\3\2\2\2\u0096\u02fb\3\2\2\2\u0098\u02fd\3\2\2\2\u009a\u02ff\3\2"+
		"\2\2\u009c\u0301\3\2\2\2\u009e\u0303\3\2\2\2\u00a0\u0305\3\2\2\2\u00a2"+
		"\u0307\3\2\2\2\u00a4\u0309\3\2\2\2\u00a6\u030b\3\2\2\2\u00a8\u00aa\5\u0096"+
		"L\2\u00a9\u00ab\5\4\3\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae\5\u0098M\2\u00ae\3\3\2"+
		"\2\2\u00af\u00b0\5d\63\2\u00b0\u00b5\5\u0096L\2\u00b1\u00b3\5\6\4\2\u00b2"+
		"\u00b4\5\u009aN\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5\u0098M\2\u00ba\u00bb"+
		"\5\u009aN\2\u00bb\5\3\2\2\2\u00bc\u00c8\5\u0094K\2\u00bd\u00c8\5\b\5\2"+
		"\u00be\u00c8\5\u00a4S\2\u00bf\u00c8\5\n\6\2\u00c0\u00c8\5\u00a0Q\2\u00c1"+
		"\u00c8\5\22\n\2\u00c2\u00c8\5\24\13\2\u00c3\u00c8\5V,\2\u00c4\u00c8\5"+
		"X-\2\u00c5\u00c8\5\u009cO\2\u00c6\u00c8\5\u009aN\2\u00c7\u00bc\3\2\2\2"+
		"\u00c7\u00bd\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c0"+
		"\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\7\3\2\2\2\u00cb\u00d8"+
		"\5\u009cO\2\u00cc\u00d4\5\u00a0Q\2\u00cd\u00d0\5\u009eP\2\u00ce\u00d1"+
		"\5\u00a0Q\2\u00cf\u00d1\5\u00a2R\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00cc\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\5\u009c"+
		"O\2\u00dc\t\3\2\2\2\u00dd\u00e0\5\u0096L\2\u00de\u00e1\5\f\7\2\u00df\u00e1"+
		"\5\6\4\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\5\u0098"+
		"M\2\u00e5\u00e7\5\u009aN\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\13\3\2\2\2\u00e8\u00e9\5\16\b\2\u00e9\u00ea\5\u009aN\2\u00ea\u00ec\3"+
		"\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\r\3\2\2\2\u00ef\u00f0\5\u009cO\2\u00f0\u00f1\5\u00a0"+
		"Q\2\u00f1\u00f2\5\u009cO\2\u00f2\u00f3\5\u0094K\2\u00f3\u00f4\5\u009c"+
		"O\2\u00f4\u00f5\5\20\t\2\u00f5\u00f6\5\u009cO\2\u00f6\17\3\2\2\2\u00f7"+
		"\u00f8\5\u00a0Q\2\u00f8\21\3\2\2\2\u00f9\u00fa\5\u009cO\2\u00fa\u00fc"+
		"\5f\64\2\u00fb\u00fd\5h\65\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u010d\3\2\2\2\u00fe\u0101\5\u00a0Q\2\u00ff\u0101\5\u00a2R\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0106\5\u008eH\2\u0105\u0104"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0109\5\u0090I"+
		"\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u010c"+
		"\5\u0092J\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2"+
		"\2\u010d\u0100\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\5\u009cO\2\u0112\23\3\2\2\2\u0113"+
		"\u0114\5\u009cO\2\u0114\u0115\5\u00a6T\2\u0115\u0116\5\u00a0Q\2\u0116"+
		"\u0117\5\u009cO\2\u0117\u0118\5\u0094K\2\u0118\u0119\5\u009cO\2\u0119"+
		"\u011a\5\u00a0Q\2\u011a\u011b\5\u0094K\2\u011b\u011c\5\u00a0Q\2\u011c"+
		"\u011e\5\u009cO\2\u011d\u011f\5\u009aN\2\u011e\u011d\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u015f\3\2\2\2\u0120\u0121\5\u009cO\2\u0121\u0122\5\u00a6"+
		"T\2\u0122\u0123\5\u00a0Q\2\u0123\u0124\5\u009cO\2\u0124\u0125\5\u0094"+
		"K\2\u0125\u0127\5\22\n\2\u0126\u0128\5\u009aN\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u015f\3\2\2\2\u0129\u012a\5\u009cO\2\u012a\u012b"+
		"\5\u00a6T\2\u012b\u012c\5\u00a0Q\2\u012c\u012d\5\u009cO\2\u012d\u012f"+
		"\5\u0094K\2\u012e\u0130\5\b\5\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2"+
		"\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135"+
		"\5\u009aN\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u015f\3\2\2"+
		"\2\u0136\u0137\5\u009cO\2\u0137\u0138\5\u00a6T\2\u0138\u0139\5\u00a0Q"+
		"\2\u0139\u013a\5\u009cO\2\u013a\u013c\5\u0094K\2\u013b\u013d\5\u00a0Q"+
		"\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0142\5\u009aN\2\u0141\u0140\3\2\2"+
		"\2\u0141\u0142\3\2\2\2\u0142\u015f\3\2\2\2\u0143\u0144\5\u009cO\2\u0144"+
		"\u0145\5\u00a6T\2\u0145\u0146\5\u00a0Q\2\u0146\u0147\5\u009cO\2\u0147"+
		"\u0148\5\u0094K\2\u0148\u0149\5\u009cO\2\u0149\u014b\5\u00a6T\2\u014a"+
		"\u014c\5\u00a0Q\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\5\u009cO"+
		"\2\u0150\u0152\5\u009aN\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u015f\3\2\2\2\u0153\u0154\5\u009cO\2\u0154\u0155\5\u00a6T\2\u0155\u0156"+
		"\5\u00a0Q\2\u0156\u0157\5\u009cO\2\u0157\u0158\5\u0094K\2\u0158\u0159"+
		"\5\u009cO\2\u0159\u015a\5\u00a2R\2\u015a\u015c\5\u009cO\2\u015b\u015d"+
		"\5\u009aN\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2"+
		"\2\u015e\u0113\3\2\2\2\u015e\u0120\3\2\2\2\u015e\u0129\3\2\2\2\u015e\u0136"+
		"\3\2\2\2\u015e\u0143\3\2\2\2\u015e\u0153\3\2\2\2\u015f\25\3\2\2\2\u0160"+
		"\u0161\5t;\2\u0161\u0165\5R*\2\u0162\u0164\5\30\r\2\u0163\u0162\3\2\2"+
		"\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\5T+\2\u0169\27\3\2\2\2\u016a"+
		"\u016b\5\u0096L\2\u016b\u016c\5\u009cO\2\u016c\u016d\5\u00a0Q\2\u016d"+
		"\u016e\5\u009cO\2\u016e\u016f\5\u0094K\2\u016f\u0170\3\2\2\2\u0170\u0174"+
		"\5\u0096L\2\u0171\u0173\5\32\16\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0178\5\u0098M\2\u0178\u017a\5\u0098M\2\u0179\u017b"+
		"\5\u009aN\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u018b\3\2\2"+
		"\2\u017c\u017d\5\u0096L\2\u017d\u017e\5p9\2\u017e\u0182\5\u0096L\2\u017f"+
		"\u0181\5\32\16\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3"+
		"\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0186\5\u0098M\2\u0186\u0188\5\u0098M\2\u0187\u0189\5\u009aN\2\u0188"+
		"\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u016a\3\2"+
		"\2\2\u018a\u017c\3\2\2\2\u018b\31\3\2\2\2\u018c\u018d\5V,\2\u018d\u018e"+
		"\5\u0094K\2\u018e\u0195\5R*\2\u018f\u0191\5\34\17\2\u0190\u0192\5\u009a"+
		"N\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u018f\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\5T+\2\u0199\33"+
		"\3\2\2\2\u019a\u019b\5\u009cO\2\u019b\u019c\5\u00a0Q\2\u019c\u019d\5\u009c"+
		"O\2\u019d\u019e\5\u0094K\2\u019e\u01a0\3\2\2\2\u019f\u019a\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a6\5\u0096L\2\u01a2\u01a7"+
		"\5\36\20\2\u01a3\u01a7\5*\26\2\u01a4\u01a7\5\64\33\2\u01a5\u01a7\5F$\2"+
		"\u01a6\u01a2\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\5\u0098M\2\u01a9\35\3\2\2\2\u01aa"+
		"\u01b0\5 \21\2\u01ab\u01b0\5\"\22\2\u01ac\u01b0\5$\23\2\u01ad\u01b0\5"+
		"(\25\2\u01ae\u01b0\5&\24\2\u01af\u01aa\3\2\2\2\u01af\u01ab\3\2\2\2\u01af"+
		"\u01ac\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\37\3\2\2\2\u01b3\u01b4"+
		"\5j\66\2\u01b4\u01b6\5\22\n\2\u01b5\u01b7\5\u009aN\2\u01b6\u01b5\3\2\2"+
		"\2\u01b6\u01b7\3\2\2\2\u01b7!\3\2\2\2\u01b8\u01b9\5l\67\2\u01b9\u01ba"+
		"\5\u009cO\2\u01ba\u01bb\5\u00a0Q\2\u01bb\u01bd\5\u009cO\2\u01bc\u01be"+
		"\5\u009aN\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be#\3\2\2\2\u01bf"+
		"\u01c0\5n8\2\u01c0\u01c2\5\n\6\2\u01c1\u01c3\5\u009aN\2\u01c2\u01c1\3"+
		"\2\2\2\u01c2\u01c3\3\2\2\2\u01c3%\3\2\2\2\u01c4\u01c5\5p9\2\u01c5\u01ca"+
		"\5R*\2\u01c6\u01c8\5\22\n\2\u01c7\u01c9\5\u009aN\2\u01c8\u01c7\3\2\2\2"+
		"\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\5T+\2\u01cf\u01d1\5\u009aN\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3"+
		"\2\2\2\u01d1\'\3\2\2\2\u01d2\u01d7\5r:\2\u01d3\u01d5\5\22\n\2\u01d4\u01d6"+
		"\5\u009aN\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2"+
		"\2\u01d7\u01d3\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01dd\5\u009aN\2\u01dc\u01db\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd)\3\2\2\2\u01de\u01e7\5 \21\2\u01df\u01e7"+
		"\5\"\22\2\u01e0\u01e7\5,\27\2\u01e1\u01e7\5$\23\2\u01e2\u01e7\5.\30\2"+
		"\u01e3\u01e7\5\60\31\2\u01e4\u01e7\5\62\32\2\u01e5\u01e7\5&\24\2\u01e6"+
		"\u01de\3\2\2\2\u01e6\u01df\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e1\3\2"+
		"\2\2\u01e6\u01e2\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9+\3\2\2\2\u01ea\u01eb\5v<\2\u01eb\u01ec\5\u009cO\2\u01ec\u01ed"+
		"\5\u00a0Q\2\u01ed\u01ef\5\u009cO\2\u01ee\u01f0\5\u009aN\2\u01ef\u01ee"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0-\3\2\2\2\u01f1\u01f2\5x=\2\u01f2\u01f4"+
		"\5\n\6\2\u01f3\u01f5\5\u009aN\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2"+
		"\2\u01f5/\3\2\2\2\u01f6\u01f7\5z>\2\u01f7\u01f9\5\22\n\2\u01f8\u01fa\5"+
		"\u009aN\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\61\3\2\2\2\u01fb"+
		"\u01fc\5|?\2\u01fc\u01fe\5\22\n\2\u01fd\u01ff\5\u009aN\2\u01fe\u01fd\3"+
		"\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\63\3\2\2\2\u0200\u0201\5 \21\2\u0201"+
		"\u020a\5\"\22\2\u0202\u020b\5:\36\2\u0203\u020b\5$\23\2\u0204\u020b\5"+
		"> \2\u0205\u020b\5\66\34\2\u0206\u020b\5D#\2\u0207\u020b\5B\"\2\u0208"+
		"\u020b\5<\37\2\u0209\u020b\58\35\2\u020a\u0202\3\2\2\2\u020a\u0203\3\2"+
		"\2\2\u020a\u0204\3\2\2\2\u020a\u0205\3\2\2\2\u020a\u0206\3\2\2\2\u020a"+
		"\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\65\3\2\2\2\u020e\u020f"+
		"\5`\61\2\u020f\u0211\5\u00a0Q\2\u0210\u0212\5\u009aN\2\u0211\u0210\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0221\3\2\2\2\u0213\u0214\5`\61\2\u0214"+
		"\u0216\5\n\6\2\u0215\u0217\5\u009aN\2\u0216\u0215\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u0221\3\2\2\2\u0218\u021b\5`\61\2\u0219\u021c\5Z.\2\u021a"+
		"\u021c\5\\/\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c\u021e\3\2"+
		"\2\2\u021d\u021f\5\u009aN\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u020e\3\2\2\2\u0220\u0213\3\2\2\2\u0220\u0218\3\2"+
		"\2\2\u0221\67\3\2\2\2\u0222\u0223\5b\62\2\u0223\u0224\5P)\2\u0224\u0225"+
		"\5\u009aN\2\u0225\u022b\3\2\2\2\u0226\u0227\5b\62\2\u0227\u0228\5\n\6"+
		"\2\u0228\u0229\5\u009aN\2\u0229\u022b\3\2\2\2\u022a\u0222\3\2\2\2\u022a"+
		"\u0226\3\2\2\2\u022b9\3\2\2\2\u022c\u022d\5~@\2\u022d\u022f\5\u009cO\2"+
		"\u022e\u0230\5\u00a0Q\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\5\u0094"+
		"K\2\u0234\u0236\5\u00a0Q\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\5\u009c"+
		"O\2\u023a\u023c\5\u009aN\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u0243\3\2\2\2\u023d\u023e\5~@\2\u023e\u0240\5\22\n\2\u023f\u0241\5\u009a"+
		"N\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242"+
		"\u022c\3\2\2\2\u0242\u023d\3\2\2\2\u0243;\3\2\2\2\u0244\u0245\5\u0080"+
		"A\2\u0245\u0246\5R*\2\u0246\u0247\5\22\n\2\u0247\u0249\5T+\2\u0248\u024a"+
		"\5\u009aN\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a=\3\2\2\2\u024b"+
		"\u024c\5^\60\2\u024c\u024e\5@!\2\u024d\u024f\5\u009aN\2\u024e\u024d\3"+
		"\2\2\2\u024e\u024f\3\2\2\2\u024f?\3\2\2\2\u0250\u0253\5Z.\2\u0251\u0253"+
		"\5\\/\2\u0252\u0250\3\2\2\2\u0252\u0251\3\2\2\2\u0253A\3\2\2\2\u0254\u0255"+
		"\5\u0084C\2\u0255\u0258\5\u009cO\2\u0256\u0259\5\u00a0Q\2\u0257\u0259"+
		"\5\u00a2R\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259\u025a\3\2\2"+
		"\2\u025a\u025c\5\u009cO\2\u025b\u025d\5\u009aN\2\u025c\u025b\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025dC\3\2\2\2\u025e\u025f\5\u0082B\2\u025f\u0262\5\u009c"+
		"O\2\u0260\u0263\5\u00a0Q\2\u0261\u0263\5\u00a2R\2\u0262\u0260\3\2\2\2"+
		"\u0262\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\5\u009cO\2\u0265"+
		"\u0267\5\u009aN\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267E\3\2\2"+
		"\2\u0268\u026e\5 \21\2\u0269\u026e\5H%\2\u026a\u026e\5J&\2\u026b\u026e"+
		"\5L\'\2\u026c\u026e\5N(\2\u026d\u0268\3\2\2\2\u026d\u0269\3\2\2\2\u026d"+
		"\u026a\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2"+
		"\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270G\3\2\2\2\u0271\u0272"+
		"\5\u0086D\2\u0272\u0273\5\u00a0Q\2\u0273\u0274\5\u009aN\2\u0274\u027a"+
		"\3\2\2\2\u0275\u0276\5\u0086D\2\u0276\u0277\5\n\6\2\u0277\u0278\5\u009a"+
		"N\2\u0278\u027a\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0275\3\2\2\2\u027a"+
		"I\3\2\2\2\u027b\u027c\5\u008aF\2\u027c\u027d\5\u00a0Q\2\u027d\u027e\5"+
		"\u009aN\2\u027e\u0284\3\2\2\2\u027f\u0280\5\u008aF\2\u0280\u0281\5\n\6"+
		"\2\u0281\u0282\5\u009aN\2\u0282\u0284\3\2\2\2\u0283\u027b\3\2\2\2\u0283"+
		"\u027f\3\2\2\2\u0284K\3\2\2\2\u0285\u0286\5\u0088E\2\u0286\u0287\5\u00a0"+
		"Q\2\u0287\u0288\5\u009aN\2\u0288\u028e\3\2\2\2\u0289\u028a\5\u0088E\2"+
		"\u028a\u028b\5\n\6\2\u028b\u028c\5\u009aN\2\u028c\u028e\3\2\2\2\u028d"+
		"\u0285\3\2\2\2\u028d\u0289\3\2\2\2\u028eM\3\2\2\2\u028f\u0290\5\u008c"+
		"G\2\u0290\u0291\5\u00a0Q\2\u0291\u0292\5\u009aN\2\u0292\u0298\3\2\2\2"+
		"\u0293\u0294\5\u008cG\2\u0294\u0295\5\n\6\2\u0295\u0296\5\u009aN\2\u0296"+
		"\u0298\3\2\2\2\u0297\u028f\3\2\2\2\u0297\u0293\3\2\2\2\u0298O\3\2\2\2"+
		"\u0299\u029a\5\u00a0Q\2\u029aQ\3\2\2\2\u029b\u029c\7\5\2\2\u029cS\3\2"+
		"\2\2\u029d\u029e\7\6\2\2\u029eU\3\2\2\2\u029f\u02a0\5\u009cO\2\u02a0\u02a1"+
		"\5\u00a6T\2\u02a1\u02a2\5\u00a0Q\2\u02a2\u02a3\5\u009cO\2\u02a3W\3\2\2"+
		"\2\u02a4\u02be\5d\63\2\u02a5\u02be\5\\/\2\u02a6\u02be\5z>\2\u02a7\u02be"+
		"\5\u008aF\2\u02a8\u02be\5f\64\2\u02a9\u02be\5j\66\2\u02aa\u02be\5r:\2"+
		"\u02ab\u02be\5^\60\2\u02ac\u02be\5n8\2\u02ad\u02be\5x=\2\u02ae\u02be\5"+
		"\u0086D\2\u02af\u02be\5\u0082B\2\u02b0\u02be\5\u0084C\2\u02b1\u02be\5"+
		"l\67\2\u02b2\u02be\5\u0088E\2\u02b3\u02be\5p9\2\u02b4\u02be\5v<\2\u02b5"+
		"\u02be\5|?\2\u02b6\u02be\5Z.\2\u02b7\u02be\5~@\2\u02b8\u02be\5\u0080A"+
		"\2\u02b9\u02be\5\u008cG\2\u02ba\u02be\5h\65\2\u02bb\u02be\5`\61\2\u02bc"+
		"\u02be\5b\62\2\u02bd\u02a4\3\2\2\2\u02bd\u02a5\3\2\2\2\u02bd\u02a6\3\2"+
		"\2\2\u02bd\u02a7\3\2\2\2\u02bd\u02a8\3\2\2\2\u02bd\u02a9\3\2\2\2\u02bd"+
		"\u02aa\3\2\2\2\u02bd\u02ab\3\2\2\2\u02bd\u02ac\3\2\2\2\u02bd\u02ad\3\2"+
		"\2\2\u02bd\u02ae\3\2\2\2\u02bd\u02af\3\2\2\2\u02bd\u02b0\3\2\2\2\u02bd"+
		"\u02b1\3\2\2\2\u02bd\u02b2\3\2\2\2\u02bd\u02b3\3\2\2\2\u02bd\u02b4\3\2"+
		"\2\2\u02bd\u02b5\3\2\2\2\u02bd\u02b6\3\2\2\2\u02bd\u02b7\3\2\2\2\u02bd"+
		"\u02b8\3\2\2\2\u02bd\u02b9\3\2\2\2\u02bd\u02ba\3\2\2\2\u02bd\u02bb\3\2"+
		"\2\2\u02bd\u02bc\3\2\2\2\u02beY\3\2\2\2\u02bf\u02c0\7\'\2\2\u02c0[\3\2"+
		"\2\2\u02c1\u02c2\7(\2\2\u02c2]\3\2\2\2\u02c3\u02c4\7&\2\2\u02c4_\3\2\2"+
		"\2\u02c5\u02c6\7\36\2\2\u02c6a\3\2\2\2\u02c7\u02c8\7\31\2\2\u02c8c\3\2"+
		"\2\2\u02c9\u02ca\7\17\2\2\u02cae\3\2\2\2\u02cb\u02cc\7\21\2\2\u02ccg\3"+
		"\2\2\2\u02cd\u02ce\7\20\2\2\u02cei\3\2\2\2\u02cf\u02d0\7\22\2\2\u02d0"+
		"k\3\2\2\2\u02d1\u02d2\7\23\2\2\u02d2m\3\2\2\2\u02d3\u02d4\7\37\2\2\u02d4"+
		"o\3\2\2\2\u02d5\u02d6\7\24\2\2\u02d6q\3\2\2\2\u02d7\u02d8\7\25\2\2\u02d8"+
		"s\3\2\2\2\u02d9\u02da\7\26\2\2\u02dau\3\2\2\2\u02db\u02dc\7\27\2\2\u02dc"+
		"w\3\2\2\2\u02dd\u02de\7\30\2\2\u02dey\3\2\2\2\u02df\u02e0\7 \2\2\u02e0"+
		"{\3\2\2\2\u02e1\u02e2\7!\2\2\u02e2}\3\2\2\2\u02e3\u02e4\7\"\2\2\u02e4"+
		"\177\3\2\2\2\u02e5\u02e6\7#\2\2\u02e6\u0081\3\2\2\2\u02e7\u02e8\7$\2\2"+
		"\u02e8\u0083\3\2\2\2\u02e9\u02ea\7%\2\2\u02ea\u0085\3\2\2\2\u02eb\u02ec"+
		"\7\32\2\2\u02ec\u0087\3\2\2\2\u02ed\u02ee\7\33\2\2\u02ee\u0089\3\2\2\2"+
		"\u02ef\u02f0\7\35\2\2\u02f0\u008b\3\2\2\2\u02f1\u02f2\7\34\2\2\u02f2\u008d"+
		"\3\2\2\2\u02f3\u02f4\7\n\2\2\u02f4\u008f\3\2\2\2\u02f5\u02f6\7\13\2\2"+
		"\u02f6\u0091\3\2\2\2\u02f7\u02f8\7\f\2\2\u02f8\u0093\3\2\2\2\u02f9\u02fa"+
		"\7\b\2\2\u02fa\u0095\3\2\2\2\u02fb\u02fc\7\3\2\2\u02fc\u0097\3\2\2\2\u02fd"+
		"\u02fe\7\4\2\2\u02fe\u0099\3\2\2\2\u02ff\u0300\7\7\2\2\u0300\u009b\3\2"+
		"\2\2\u0301\u0302\7\t\2\2\u0302\u009d\3\2\2\2\u0303\u0304\7\r\2\2\u0304"+
		"\u009f\3\2\2\2\u0305\u0306\7)\2\2\u0306\u00a1\3\2\2\2\u0307\u0308\7*\2"+
		"\2\u0308\u00a3\3\2\2\2\u0309\u030a\7+\2\2\u030a\u00a5\3\2\2\2\u030b\u030c"+
		"\7\16\2\2\u030c\u00a7\3\2\2\2V\u00aa\u00b3\u00b7\u00c7\u00c9\u00d0\u00d2"+
		"\u00d4\u00d8\u00e0\u00e2\u00e6\u00ed\u00fc\u0100\u0102\u0105\u0108\u010b"+
		"\u010f\u011e\u0127\u0131\u0134\u013e\u0141\u014d\u0151\u015c\u015e\u0165"+
		"\u0174\u017a\u0182\u0188\u018a\u0191\u0195\u019f\u01a6\u01af\u01b1\u01b6"+
		"\u01bd\u01c2\u01c8\u01cc\u01d0\u01d5\u01d9\u01dc\u01e6\u01e8\u01ef\u01f4"+
		"\u01f9\u01fe\u020a\u020c\u0211\u0216\u021b\u021e\u0220\u022a\u0231\u0237"+
		"\u023b\u0240\u0242\u0249\u024e\u0252\u0258\u025c\u0262\u0266\u026d\u026f"+
		"\u0279\u0283\u028d\u0297\u02bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}