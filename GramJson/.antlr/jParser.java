// Generated from d:\gituni\Lenguajes\GramJson\jParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMA=1, PUNTO=2, DOS_PTOS=3, BARRA=4, BBAJA=5, GUION=6, ARROBA=7, ALM=8, 
		SALLAVE=9, SCLLAVE=10, SACORCHETE=11, SCCORCHETE=12, COMILLAS=13, NOMBRE=14, 
		DIGITO=15, KW_ID=16, KW_NAME=17, KW_PROPERTIES=18, KW_INHERITS=19, KW_REVERSENAME=20, 
		KW_LABELRN=21, KW_LANGUAGEDATA=22, KW_LANGUAGE=23, KW_NUMBER=24, KW_WORDTYPE=25, 
		KW_GENDER=26, KW_OPTIONAL=27, KW_LABEL=28, KW_FROM=29, KW_TO=30, KW_TYPEOF=31, 
		KW_USEDBY=32, KW_MULMAX=33, KW_MULMIN=34, KW_ISLIST=35, KW_TRUE=36, KW_FALSE=37, 
		INTRO=38;
	public static final int
		RULE_init = 0, RULE_obj = 1, RULE_array = 2, RULE_estr = 3, RULE_ruta = 4, 
		RULE_descripcion = 5, RULE_definicion = 6, RULE_reglas = 7, RULE_pclass = 8, 
		RULE_id = 9, RULE_name = 10, RULE_label = 11, RULE_properties = 12, RULE_inherits = 13, 
		RULE_ampli_info = 14, RULE_nombre = 15, RULE_nombre_obj = 16, RULE_nombre_array = 17, 
		RULE_nombre_est = 18, RULE_comillas = 19, RULE_sallave = 20, RULE_scllave = 21, 
		RULE_sacorchete = 22, RULE_sccorchete = 23, RULE_arroba = 24, RULE_coma = 25, 
		RULE_punto = 26, RULE_barra = 27, RULE_dos_ptos = 28, RULE_alm = 29, RULE_digito = 30, 
		RULE_bbaja = 31, RULE_guion = 32, RULE_kw_id = 33, RULE_kw_inherits = 34, 
		RULE_kw_label = 35, RULE_kw_name = 36, RULE_kw_properties = 37;
	public static final String[] ruleNames = {
		"init", "obj", "array", "estr", "ruta", "descripcion", "definicion", "reglas", 
		"pclass", "id", "name", "label", "properties", "inherits", "ampli_info", 
		"nombre", "nombre_obj", "nombre_array", "nombre_est", "comillas", "sallave", 
		"scllave", "sacorchete", "sccorchete", "arroba", "coma", "punto", "barra", 
		"dos_ptos", "alm", "digito", "bbaja", "guion", "kw_id", "kw_inherits", 
		"kw_label", "kw_name", "kw_properties"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", "':'", null, "'_'", "'-'", "'@'", "'#'", "'{'", "'}'", 
		"'['", "']'", "'\"'", null, null, "'\"@id\":'", "'\"name\":'", "'\"properties\":'", 
		"'\"inherits\":'", "'\"reverseName\":'", "'\"labelReverseName\":'", "'\"languageData\":'", 
		"'\"language\":'", "'\"number\":'", "'\"wordType\":'", "'\"gender\":'", 
		"'\"optional\":'", "'\"label\":'", "'\"from\":'", "'\"to\":'", "'\"typeOf\":'", 
		"'\"usedby\":'", "'\"multiplicityMax\":'", "'\"multiplicityMin\":'", "'\"isList\":'", 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMA", "PUNTO", "DOS_PTOS", "BARRA", "BBAJA", "GUION", "ARROBA", 
		"ALM", "SALLAVE", "SCLLAVE", "SACORCHETE", "SCCORCHETE", "COMILLAS", "NOMBRE", 
		"DIGITO", "KW_ID", "KW_NAME", "KW_PROPERTIES", "KW_INHERITS", "KW_REVERSENAME", 
		"KW_LABELRN", "KW_LANGUAGEDATA", "KW_LANGUAGE", "KW_NUMBER", "KW_WORDTYPE", 
		"KW_GENDER", "KW_OPTIONAL", "KW_LABEL", "KW_FROM", "KW_TO", "KW_TYPEOF", 
		"KW_USEDBY", "KW_MULMAX", "KW_MULMIN", "KW_ISLIST", "KW_TRUE", "KW_FALSE", 
		"INTRO"
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
	public String getGrammarFileName() { return "jParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
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
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
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
			setState(76);
			sallave();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALLAVE) | (1L << SACORCHETE) | (1L << COMILLAS))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(77);
					descripcion();
					}
					break;
				case 2:
					{
					setState(78);
					obj();
					}
					break;
				case 3:
					{
					setState(79);
					array();
					}
					break;
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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

	public static class ObjContext extends ParserRuleContext {
		public SallaveContext sallave() {
			return getRuleContext(SallaveContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public Nombre_objContext nombre_obj() {
			return getRuleContext(Nombre_objContext.class,0);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public List<EstrContext> estr() {
			return getRuleContexts(EstrContext.class);
		}
		public EstrContext estr(int i) {
			return getRuleContext(EstrContext.class,i);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMILLAS) {
				{
				setState(87);
				nombre_obj();
				}
			}

			setState(90);
			sallave();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALLAVE) | (1L << SACORCHETE) | (1L << COMILLAS) | (1L << KW_ID) | (1L << KW_NAME) | (1L << KW_PROPERTIES) | (1L << KW_INHERITS) | (1L << KW_LABEL))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(91);
					array();
					}
					break;
				case 2:
					{
					setState(92);
					obj();
					}
					break;
				case 3:
					{
					setState(93);
					estr();
					}
					break;
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			scllave();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(100);
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

	public static class ArrayContext extends ParserRuleContext {
		public SacorcheteContext sacorchete() {
			return getRuleContext(SacorcheteContext.class,0);
		}
		public SccorcheteContext sccorchete() {
			return getRuleContext(SccorcheteContext.class,0);
		}
		public Nombre_arrayContext nombre_array() {
			return getRuleContext(Nombre_arrayContext.class,0);
		}
		public List<EstrContext> estr() {
			return getRuleContexts(EstrContext.class);
		}
		public EstrContext estr(int i) {
			return getRuleContext(EstrContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMILLAS) {
				{
				setState(103);
				nombre_array();
				}
			}

			setState(106);
			sacorchete();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALLAVE) | (1L << SACORCHETE) | (1L << COMILLAS) | (1L << KW_ID) | (1L << KW_NAME) | (1L << KW_PROPERTIES) | (1L << KW_INHERITS) | (1L << KW_LABEL))) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(107);
					estr();
					}
					break;
				case 2:
					{
					setState(108);
					array();
					}
					break;
				case 3:
					{
					setState(109);
					obj();
					}
					break;
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			sccorchete();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(116);
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

	public static class EstrContext extends ParserRuleContext {
		public List<ReglasContext> reglas() {
			return getRuleContexts(ReglasContext.class);
		}
		public ReglasContext reglas(int i) {
			return getRuleContext(ReglasContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public EstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estr; }
	}

	public final EstrContext estr() throws RecognitionException {
		EstrContext _localctx = new EstrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119);
					reglas();
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(120);
						coma();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class RutaContext extends ParserRuleContext {
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
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
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public List<GuionContext> guion() {
			return getRuleContexts(GuionContext.class);
		}
		public GuionContext guion(int i) {
			return getRuleContext(GuionContext.class,i);
		}
		public List<Dos_ptosContext> dos_ptos() {
			return getRuleContexts(Dos_ptosContext.class);
		}
		public Dos_ptosContext dos_ptos(int i) {
			return getRuleContext(Dos_ptosContext.class,i);
		}
		public RutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruta; }
	}

	public final RutaContext ruta() throws RecognitionException {
		RutaContext _localctx = new RutaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ruta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUNTO) | (1L << DOS_PTOS) | (1L << BARRA) | (1L << BBAJA) | (1L << GUION) | (1L << ALM) | (1L << NOMBRE) | (1L << DIGITO))) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOMBRE:
					{
					setState(127);
					nombre();
					}
					break;
				case BARRA:
					{
					setState(128);
					barra();
					}
					break;
				case ALM:
					{
					setState(129);
					alm();
					}
					break;
				case DIGITO:
					{
					setState(130);
					digito();
					}
					break;
				case PUNTO:
					{
					setState(131);
					punto();
					}
					break;
				case BBAJA:
					{
					setState(132);
					bbaja();
					}
					break;
				case GUION:
					{
					setState(133);
					guion();
					}
					break;
				case DOS_PTOS:
					{
					setState(134);
					dos_ptos();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
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

	public static class DescripcionContext extends ParserRuleContext {
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
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public SallaveContext sallave() {
			return getRuleContext(SallaveContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public DescripcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descripcion; }
	}

	public final DescripcionContext descripcion() throws RecognitionException {
		DescripcionContext _localctx = new DescripcionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_descripcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			comillas();
			setState(141);
			arroba();
			setState(142);
			nombre();
			setState(143);
			comillas();
			setState(144);
			dos_ptos();
			setState(145);
			sallave();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMILLAS) {
				{
				{
				setState(146);
				definicion();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			scllave();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(153);
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

	public static class DefinicionContext extends ParserRuleContext {
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
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public ArrobaContext arroba() {
			return getRuleContext(ArrobaContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public SallaveContext sallave() {
			return getRuleContext(SallaveContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definicion);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				comillas();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARROBA) {
					{
					setState(157);
					arroba();
					}
				}

				setState(160);
				nombre();
				setState(161);
				comillas();
				setState(162);
				dos_ptos();
				setState(163);
				comillas();
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(164);
					nombre();
					}
					break;
				case 2:
					{
					setState(165);
					ruta();
					}
					break;
				}
				setState(168);
				comillas();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(169);
					coma();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				comillas();
				setState(173);
				nombre();
				setState(174);
				comillas();
				setState(175);
				dos_ptos();
				setState(176);
				sallave();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMILLAS) {
					{
					{
					setState(177);
					definicion();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				scllave();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(184);
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

	public static class ReglasContext extends ParserRuleContext {
		public PclassContext pclass() {
			return getRuleContext(PclassContext.class,0);
		}
		public ReglasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reglas; }
	}

	public final ReglasContext reglas() throws RecognitionException {
		ReglasContext _localctx = new ReglasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_reglas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(189);
			pclass();
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
	}

	public final PclassContext pclass() throws RecognitionException {
		PclassContext _localctx = new PclassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pclass);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(196);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_ID:
						{
						setState(191);
						id();
						}
						break;
					case KW_NAME:
						{
						setState(192);
						name();
						}
						break;
					case KW_LABEL:
						{
						setState(193);
						label();
						}
						break;
					case KW_INHERITS:
						{
						setState(194);
						inherits();
						}
						break;
					case KW_PROPERTIES:
						{
						setState(195);
						properties();
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
				setState(198); 
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

	public static class IdContext extends ParserRuleContext {
		public Kw_idContext kw_id() {
			return getRuleContext(Kw_idContext.class,0);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
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
		enterRule(_localctx, 18, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			kw_id();
			setState(201);
			comillas();
			setState(202);
			ruta();
			setState(203);
			comillas();
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(204);
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
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			kw_name();
			setState(208);
			comillas();
			setState(209);
			nombre();
			setState(210);
			comillas();
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(211);
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
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			kw_label();
			setState(215);
			ampli_info();
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(216);
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
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
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
		enterRule(_localctx, 24, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			kw_properties();
			setState(220);
			sacorchete();
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				comillas();
				setState(222);
				ruta();
				setState(223);
				comillas();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(224);
					coma();
					}
				}

				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMILLAS );
			setState(231);
			sccorchete();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(232);
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

	public static class InheritsContext extends ParserRuleContext {
		public Kw_inheritsContext kw_inherits() {
			return getRuleContext(Kw_inheritsContext.class,0);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
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
	}

	public final InheritsContext inherits() throws RecognitionException {
		InheritsContext _localctx = new InheritsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inherits);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			kw_inherits();
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(236);
					comillas();
					setState(237);
					ruta();
					setState(238);
					comillas();
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(239);
						coma();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(246);
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

	public static class Ampli_infoContext extends ParserRuleContext {
		public SallaveContext sallave() {
			return getRuleContext(SallaveContext.class,0);
		}
		public ScllaveContext scllave() {
			return getRuleContext(ScllaveContext.class,0);
		}
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public Ampli_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ampli_info; }
	}

	public final Ampli_infoContext ampli_info() throws RecognitionException {
		Ampli_infoContext _localctx = new Ampli_infoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ampli_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			sallave();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMILLAS) {
				{
				{
				setState(250);
				definicion();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
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

	public static class NombreContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(jParser.NOMBRE, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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

	public static class Nombre_objContext extends ParserRuleContext {
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
		public Dos_ptosContext dos_ptos() {
			return getRuleContext(Dos_ptosContext.class,0);
		}
		public Nombre_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_obj; }
	}

	public final Nombre_objContext nombre_obj() throws RecognitionException {
		Nombre_objContext _localctx = new Nombre_objContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nombre_obj);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				comillas();
				setState(261);
				arroba();
				setState(262);
				nombre();
				setState(263);
				comillas();
				setState(264);
				dos_ptos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				comillas();
				setState(267);
				nombre();
				setState(268);
				comillas();
				setState(269);
				dos_ptos();
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

	public static class Nombre_arrayContext extends ParserRuleContext {
		public Nombre_objContext nombre_obj() {
			return getRuleContext(Nombre_objContext.class,0);
		}
		public Nombre_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_array; }
	}

	public final Nombre_arrayContext nombre_array() throws RecognitionException {
		Nombre_arrayContext _localctx = new Nombre_arrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nombre_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			nombre_obj();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nombre_estContext extends ParserRuleContext {
		public Nombre_objContext nombre_obj() {
			return getRuleContext(Nombre_objContext.class,0);
		}
		public Nombre_estContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_est; }
	}

	public final Nombre_estContext nombre_est() throws RecognitionException {
		Nombre_estContext _localctx = new Nombre_estContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nombre_est);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			nombre_obj();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMILLAS() { return getToken(jParser.COMILLAS, 0); }
		public ComillasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comillas; }
	}

	public final ComillasContext comillas() throws RecognitionException {
		ComillasContext _localctx = new ComillasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comillas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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

	public static class SallaveContext extends ParserRuleContext {
		public TerminalNode SALLAVE() { return getToken(jParser.SALLAVE, 0); }
		public SallaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sallave; }
	}

	public final SallaveContext sallave() throws RecognitionException {
		SallaveContext _localctx = new SallaveContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sallave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		public TerminalNode SCLLAVE() { return getToken(jParser.SCLLAVE, 0); }
		public ScllaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scllave; }
	}

	public final ScllaveContext scllave() throws RecognitionException {
		ScllaveContext _localctx = new ScllaveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scllave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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

	public static class SacorcheteContext extends ParserRuleContext {
		public TerminalNode SACORCHETE() { return getToken(jParser.SACORCHETE, 0); }
		public SacorcheteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sacorchete; }
	}

	public final SacorcheteContext sacorchete() throws RecognitionException {
		SacorcheteContext _localctx = new SacorcheteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sacorchete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		public TerminalNode SCCORCHETE() { return getToken(jParser.SCCORCHETE, 0); }
		public SccorcheteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sccorchete; }
	}

	public final SccorcheteContext sccorchete() throws RecognitionException {
		SccorcheteContext _localctx = new SccorcheteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sccorchete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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

	public static class ArrobaContext extends ParserRuleContext {
		public TerminalNode ARROBA() { return getToken(jParser.ARROBA, 0); }
		public ArrobaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arroba; }
	}

	public final ArrobaContext arroba() throws RecognitionException {
		ArrobaContext _localctx = new ArrobaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arroba);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(jParser.COMA, 0); }
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
			setState(289);
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

	public static class PuntoContext extends ParserRuleContext {
		public TerminalNode PUNTO() { return getToken(jParser.PUNTO, 0); }
		public PuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto; }
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		public TerminalNode BARRA() { return getToken(jParser.BARRA, 0); }
		public BarraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barra; }
	}

	public final BarraContext barra() throws RecognitionException {
		BarraContext _localctx = new BarraContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_barra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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

	public static class Dos_ptosContext extends ParserRuleContext {
		public TerminalNode DOS_PTOS() { return getToken(jParser.DOS_PTOS, 0); }
		public Dos_ptosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos_ptos; }
	}

	public final Dos_ptosContext dos_ptos() throws RecognitionException {
		Dos_ptosContext _localctx = new Dos_ptosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dos_ptos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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

	public static class AlmContext extends ParserRuleContext {
		public TerminalNode ALM() { return getToken(jParser.ALM, 0); }
		public AlmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alm; }
	}

	public final AlmContext alm() throws RecognitionException {
		AlmContext _localctx = new AlmContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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

	public static class DigitoContext extends ParserRuleContext {
		public TerminalNode DIGITO() { return getToken(jParser.DIGITO, 0); }
		public DigitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digito; }
	}

	public final DigitoContext digito() throws RecognitionException {
		DigitoContext _localctx = new DigitoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_digito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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

	public static class BbajaContext extends ParserRuleContext {
		public TerminalNode BBAJA() { return getToken(jParser.BBAJA, 0); }
		public BbajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbaja; }
	}

	public final BbajaContext bbaja() throws RecognitionException {
		BbajaContext _localctx = new BbajaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bbaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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

	public static class GuionContext extends ParserRuleContext {
		public TerminalNode GUION() { return getToken(jParser.GUION, 0); }
		public GuionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guion; }
	}

	public final GuionContext guion() throws RecognitionException {
		GuionContext _localctx = new GuionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_guion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(GUION);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode KW_ID() { return getToken(jParser.KW_ID, 0); }
		public Kw_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_id; }
	}

	public final Kw_idContext kw_id() throws RecognitionException {
		Kw_idContext _localctx = new Kw_idContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_kw_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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

	public static class Kw_inheritsContext extends ParserRuleContext {
		public TerminalNode KW_INHERITS() { return getToken(jParser.KW_INHERITS, 0); }
		public Kw_inheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inherits; }
	}

	public final Kw_inheritsContext kw_inherits() throws RecognitionException {
		Kw_inheritsContext _localctx = new Kw_inheritsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_kw_inherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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

	public static class Kw_labelContext extends ParserRuleContext {
		public TerminalNode KW_LABEL() { return getToken(jParser.KW_LABEL, 0); }
		public Kw_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_label; }
	}

	public final Kw_labelContext kw_label() throws RecognitionException {
		Kw_labelContext _localctx = new Kw_labelContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kw_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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

	public static class Kw_nameContext extends ParserRuleContext {
		public TerminalNode KW_NAME() { return getToken(jParser.KW_NAME, 0); }
		public Kw_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_name; }
	}

	public final Kw_nameContext kw_name() throws RecognitionException {
		Kw_nameContext _localctx = new Kw_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_kw_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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

	public static class Kw_propertiesContext extends ParserRuleContext {
		public TerminalNode KW_PROPERTIES() { return getToken(jParser.KW_PROPERTIES, 0); }
		public Kw_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_properties; }
	}

	public final Kw_propertiesContext kw_properties() throws RecognitionException {
		Kw_propertiesContext _localctx = new Kw_propertiesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_kw_properties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\7\2S\n\2\f"+
		"\2\16\2V\13\2\3\2\3\2\3\3\5\3[\n\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3d"+
		"\13\3\3\3\3\3\5\3h\n\3\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\7\4q\n\4\f\4\16\4"+
		"t\13\4\3\4\3\4\5\4x\n\4\3\5\3\5\5\5|\n\5\6\5~\n\5\r\5\16\5\177\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u0096\n\7\f\7\16\7\u0099\13\7\3\7\3\7\5\7\u009d\n"+
		"\7\3\b\3\b\5\b\u00a1\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a9\n\b\3\b\3\b"+
		"\5\b\u00ad\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b5\n\b\f\b\16\b\u00b8\13"+
		"\b\3\b\3\b\5\b\u00bc\n\b\5\b\u00be\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\6\n"+
		"\u00c7\n\n\r\n\16\n\u00c8\3\13\3\13\3\13\3\13\3\13\5\13\u00d0\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00d7\n\f\3\r\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00e4\n\16\6\16\u00e6\n\16\r\16\16\16\u00e7\3\16"+
		"\3\16\5\16\u00ec\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00f3\n\17\6\17\u00f5"+
		"\n\17\r\17\16\17\u00f6\3\17\5\17\u00fa\n\17\3\20\3\20\7\20\u00fe\n\20"+
		"\f\20\16\20\u0101\13\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u0112\n\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJL\2\2\2\u0146\2N\3\2\2\2\4Z\3\2\2\2\6j\3\2"+
		"\2\2\b}\3\2\2\2\n\u008b\3\2\2\2\f\u008e\3\2\2\2\16\u00bd\3\2\2\2\20\u00bf"+
		"\3\2\2\2\22\u00c6\3\2\2\2\24\u00ca\3\2\2\2\26\u00d1\3\2\2\2\30\u00d8\3"+
		"\2\2\2\32\u00dd\3\2\2\2\34\u00ed\3\2\2\2\36\u00fb\3\2\2\2 \u0104\3\2\2"+
		"\2\"\u0111\3\2\2\2$\u0113\3\2\2\2&\u0115\3\2\2\2(\u0117\3\2\2\2*\u0119"+
		"\3\2\2\2,\u011b\3\2\2\2.\u011d\3\2\2\2\60\u011f\3\2\2\2\62\u0121\3\2\2"+
		"\2\64\u0123\3\2\2\2\66\u0125\3\2\2\28\u0127\3\2\2\2:\u0129\3\2\2\2<\u012b"+
		"\3\2\2\2>\u012d\3\2\2\2@\u012f\3\2\2\2B\u0131\3\2\2\2D\u0133\3\2\2\2F"+
		"\u0135\3\2\2\2H\u0137\3\2\2\2J\u0139\3\2\2\2L\u013b\3\2\2\2NT\5*\26\2"+
		"OS\5\f\7\2PS\5\4\3\2QS\5\6\4\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2"+
		"TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5,\27\2X\3\3\2\2\2Y[\5\"\22"+
		"\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\b\5*\26\2]a\5\6\4\2^a\5\4\3\2_a\5\b"+
		"\5\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2"+
		"\2\2db\3\2\2\2eg\5,\27\2fh\5\64\33\2gf\3\2\2\2gh\3\2\2\2h\5\3\2\2\2ik"+
		"\5$\23\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lr\5.\30\2mq\5\b\5\2nq\5\6\4\2o"+
		"q\5\4\3\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"su\3\2\2\2tr\3\2\2\2uw\5\60\31\2vx\5\64\33\2wv\3\2\2\2wx\3\2\2\2x\7\3"+
		"\2\2\2y{\5\20\t\2z|\5\64\33\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}y\3\2\2\2"+
		"~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\t\3\2\2\2\u0081\u008a"+
		"\5 \21\2\u0082\u008a\58\35\2\u0083\u008a\5<\37\2\u0084\u008a\5> \2\u0085"+
		"\u008a\5\66\34\2\u0086\u008a\5@!\2\u0087\u008a\5B\"\2\u0088\u008a\5:\36"+
		"\2\u0089\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0084"+
		"\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\13\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5(\25\2\u008f\u0090"+
		"\5\62\32\2\u0090\u0091\5 \21\2\u0091\u0092\5(\25\2\u0092\u0093\5:\36\2"+
		"\u0093\u0097\5*\26\2\u0094\u0096\5\16\b\2\u0095\u0094\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009c\5,\27\2\u009b\u009d\5\64\33\2\u009c\u009b\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\r\3\2\2\2\u009e\u00a0\5(\25\2\u009f\u00a1"+
		"\5\62\32\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2"+
		"\u00a2\u00a3\5 \21\2\u00a3\u00a4\5(\25\2\u00a4\u00a5\5:\36\2\u00a5\u00a8"+
		"\5(\25\2\u00a6\u00a9\5 \21\2\u00a7\u00a9\5\n\6\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\5(\25\2\u00ab\u00ad\5\64"+
		"\33\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00be\3\2\2\2\u00ae"+
		"\u00af\5(\25\2\u00af\u00b0\5 \21\2\u00b0\u00b1\5(\25\2\u00b1\u00b2\5:"+
		"\36\2\u00b2\u00b6\5*\26\2\u00b3\u00b5\5\16\b\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\5,\27\2\u00ba\u00bc\5\64\33\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u009e\3\2"+
		"\2\2\u00bd\u00ae\3\2\2\2\u00be\17\3\2\2\2\u00bf\u00c0\5\22\n\2\u00c0\21"+
		"\3\2\2\2\u00c1\u00c7\5\24\13\2\u00c2\u00c7\5\26\f\2\u00c3\u00c7\5\30\r"+
		"\2\u00c4\u00c7\5\34\17\2\u00c5\u00c7\5\32\16\2\u00c6\u00c1\3\2\2\2\u00c6"+
		"\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\23\3\2\2\2\u00ca\u00cb\5D#\2\u00cb\u00cc\5(\25\2\u00cc\u00cd\5\n\6\2"+
		"\u00cd\u00cf\5(\25\2\u00ce\u00d0\5\64\33\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\25\3\2\2\2\u00d1\u00d2\5J&\2\u00d2\u00d3\5(\25\2\u00d3"+
		"\u00d4\5 \21\2\u00d4\u00d6\5(\25\2\u00d5\u00d7\5\64\33\2\u00d6\u00d5\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d9\5H%\2\u00d9\u00db"+
		"\5\36\20\2\u00da\u00dc\5\64\33\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2"+
		"\2\u00dc\31\3\2\2\2\u00dd\u00de\5L\'\2\u00de\u00e5\5.\30\2\u00df\u00e0"+
		"\5(\25\2\u00e0\u00e1\5\n\6\2\u00e1\u00e3\5(\25\2\u00e2\u00e4\5\64\33\2"+
		"\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00df"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\5\60\31\2\u00ea\u00ec\5\64\33\2\u00eb\u00ea"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\33\3\2\2\2\u00ed\u00f4\5F$\2\u00ee"+
		"\u00ef\5(\25\2\u00ef\u00f0\5\n\6\2\u00f0\u00f2\5(\25\2\u00f1\u00f3\5\64"+
		"\33\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00ee\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\5\64\33\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\35\3\2\2\2\u00fb\u00ff\5*\26\2\u00fc\u00fe\5\16\b"+
		"\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5,\27\2\u0103"+
		"\37\3\2\2\2\u0104\u0105\7\20\2\2\u0105!\3\2\2\2\u0106\u0107\5(\25\2\u0107"+
		"\u0108\5\62\32\2\u0108\u0109\5 \21\2\u0109\u010a\5(\25\2\u010a\u010b\5"+
		":\36\2\u010b\u0112\3\2\2\2\u010c\u010d\5(\25\2\u010d\u010e\5 \21\2\u010e"+
		"\u010f\5(\25\2\u010f\u0110\5:\36\2\u0110\u0112\3\2\2\2\u0111\u0106\3\2"+
		"\2\2\u0111\u010c\3\2\2\2\u0112#\3\2\2\2\u0113\u0114\5\"\22\2\u0114%\3"+
		"\2\2\2\u0115\u0116\5\"\22\2\u0116\'\3\2\2\2\u0117\u0118\7\17\2\2\u0118"+
		")\3\2\2\2\u0119\u011a\7\13\2\2\u011a+\3\2\2\2\u011b\u011c\7\f\2\2\u011c"+
		"-\3\2\2\2\u011d\u011e\7\r\2\2\u011e/\3\2\2\2\u011f\u0120\7\16\2\2\u0120"+
		"\61\3\2\2\2\u0121\u0122\7\t\2\2\u0122\63\3\2\2\2\u0123\u0124\7\3\2\2\u0124"+
		"\65\3\2\2\2\u0125\u0126\7\4\2\2\u0126\67\3\2\2\2\u0127\u0128\7\6\2\2\u0128"+
		"9\3\2\2\2\u0129\u012a\7\5\2\2\u012a;\3\2\2\2\u012b\u012c\7\n\2\2\u012c"+
		"=\3\2\2\2\u012d\u012e\7\21\2\2\u012e?\3\2\2\2\u012f\u0130\7\7\2\2\u0130"+
		"A\3\2\2\2\u0131\u0132\7\b\2\2\u0132C\3\2\2\2\u0133\u0134\7\22\2\2\u0134"+
		"E\3\2\2\2\u0135\u0136\7\25\2\2\u0136G\3\2\2\2\u0137\u0138\7\36\2\2\u0138"+
		"I\3\2\2\2\u0139\u013a\7\23\2\2\u013aK\3\2\2\2\u013b\u013c\7\24\2\2\u013c"+
		"M\3\2\2\2%RTZ`bgjprw{\177\u0089\u008b\u0097\u009c\u00a0\u00a8\u00ac\u00b6"+
		"\u00bb\u00bd\u00c6\u00c8\u00cf\u00d6\u00db\u00e3\u00e7\u00eb\u00f2\u00f6"+
		"\u00f9\u00ff\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}