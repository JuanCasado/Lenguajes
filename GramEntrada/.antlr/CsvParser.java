// Generated from c:\antlr\Lenguajes\GramEntrada\CsvParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CsvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFICADOR=1, COMA=2, DOBLEPUNTO=3, PUNTO=4, INTRO=5, DISCO=6, BARRA=7, 
		EXTENSION=8, NOMBRECOSAS=9;
	public static final int
		RULE_fichero = 0, RULE_declaracion = 1, RULE_sentencias = 2, RULE_rutafichero = 3, 
		RULE_rutaficherosalida = 4, RULE_rutaficherografico = 5, RULE_carpeta = 6, 
		RULE_archivo = 7, RULE_nombre = 8, RULE_cosas = 9, RULE_intro = 10, RULE_coma = 11, 
		RULE_barra = 12, RULE_doblepunto = 13, RULE_disco = 14, RULE_punto = 15, 
		RULE_nombrearchivo = 16, RULE_nombrecarpeta = 17, RULE_extension = 18;
	public static final String[] ruleNames = {
		"fichero", "declaracion", "sentencias", "rutafichero", "rutaficherosalida", 
		"rutaficherografico", "carpeta", "archivo", "nombre", "cosas", "intro", 
		"coma", "barra", "doblepunto", "disco", "punto", "nombrearchivo", "nombrecarpeta", 
		"extension"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "'..'", "'.'", null, null, "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IDENTIFICADOR", "COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "DISCO", 
		"BARRA", "EXTENSION", "NOMBRECOSAS"
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
	public String getGrammarFileName() { return "CsvParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CsvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FicheroContext extends ParserRuleContext {
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFICADOR) | (1L << COMA) | (1L << INTRO))) != 0)) {
				{
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					declaracion();
					}
					break;
				case 2:
					{
					setState(39);
					sentencias();
					}
					break;
				}
				}
				setState(44);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public IntroContext intro() {
			return getRuleContext(IntroContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public List<CosasContext> cosas() {
			return getRuleContexts(CosasContext.class);
		}
		public CosasContext cosas(int i) {
			return getRuleContext(CosasContext.class,i);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR || _la==COMA) {
				{
				{
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFICADOR) {
					{
					{
					setState(45);
					cosas();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				coma();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			intro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public RutaficherosalidaContext rutaficherosalida() {
			return getRuleContext(RutaficherosalidaContext.class,0);
		}
		public RutaficherograficoContext rutaficherografico() {
			return getRuleContext(RutaficherograficoContext.class,0);
		}
		public IntroContext intro() {
			return getRuleContext(IntroContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			nombre();
			setState(60);
			coma();
			setState(61);
			rutafichero();
			setState(62);
			coma();
			setState(63);
			rutaficherosalida();
			setState(64);
			coma();
			setState(65);
			rutaficherografico();
			setState(66);
			intro();
			}
		}
		catch (RecognitionException re) {
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
		public DoblepuntoContext doblepunto() {
			return getRuleContext(DoblepuntoContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public DiscoContext disco() {
			return getRuleContext(DiscoContext.class,0);
		}
		public List<BarraContext> barra() {
			return getRuleContexts(BarraContext.class);
		}
		public BarraContext barra(int i) {
			return getRuleContext(BarraContext.class,i);
		}
		public List<CarpetaContext> carpeta() {
			return getRuleContexts(CarpetaContext.class);
		}
		public CarpetaContext carpeta(int i) {
			return getRuleContext(CarpetaContext.class,i);
		}
		public List<ArchivoContext> archivo() {
			return getRuleContexts(ArchivoContext.class);
		}
		public ArchivoContext archivo(int i) {
			return getRuleContext(ArchivoContext.class,i);
		}
		public RutaficheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutafichero; }
	}

	public final RutaficheroContext rutafichero() throws RecognitionException {
		RutaficheroContext _localctx = new RutaficheroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rutafichero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOBLEPUNTO:
				{
				setState(68);
				doblepunto();
				}
				break;
			case PUNTO:
				{
				setState(69);
				punto();
				}
				break;
			case DISCO:
				{
				setState(70);
				disco();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(73);
				barra();
				}
				break;
			}
			{
			setState(76);
			barra();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRECOSAS) {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(77);
					carpeta();
					}
					break;
				case 2:
					{
					setState(78);
					archivo();
					}
					break;
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RutaficherosalidaContext extends ParserRuleContext {
		public DoblepuntoContext doblepunto() {
			return getRuleContext(DoblepuntoContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public DiscoContext disco() {
			return getRuleContext(DiscoContext.class,0);
		}
		public List<BarraContext> barra() {
			return getRuleContexts(BarraContext.class);
		}
		public BarraContext barra(int i) {
			return getRuleContext(BarraContext.class,i);
		}
		public List<CarpetaContext> carpeta() {
			return getRuleContexts(CarpetaContext.class);
		}
		public CarpetaContext carpeta(int i) {
			return getRuleContext(CarpetaContext.class,i);
		}
		public List<ArchivoContext> archivo() {
			return getRuleContexts(ArchivoContext.class);
		}
		public ArchivoContext archivo(int i) {
			return getRuleContext(ArchivoContext.class,i);
		}
		public RutaficherosalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutaficherosalida; }
	}

	public final RutaficherosalidaContext rutaficherosalida() throws RecognitionException {
		RutaficherosalidaContext _localctx = new RutaficherosalidaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rutaficherosalida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOBLEPUNTO:
				{
				setState(84);
				doblepunto();
				}
				break;
			case PUNTO:
				{
				setState(85);
				punto();
				}
				break;
			case DISCO:
				{
				setState(86);
				disco();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(89);
				barra();
				}
				break;
			}
			{
			setState(92);
			barra();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRECOSAS) {
				{
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(93);
					carpeta();
					}
					break;
				case 2:
					{
					setState(94);
					archivo();
					}
					break;
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RutaficherograficoContext extends ParserRuleContext {
		public DoblepuntoContext doblepunto() {
			return getRuleContext(DoblepuntoContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public DiscoContext disco() {
			return getRuleContext(DiscoContext.class,0);
		}
		public List<BarraContext> barra() {
			return getRuleContexts(BarraContext.class);
		}
		public BarraContext barra(int i) {
			return getRuleContext(BarraContext.class,i);
		}
		public List<CarpetaContext> carpeta() {
			return getRuleContexts(CarpetaContext.class);
		}
		public CarpetaContext carpeta(int i) {
			return getRuleContext(CarpetaContext.class,i);
		}
		public List<ArchivoContext> archivo() {
			return getRuleContexts(ArchivoContext.class);
		}
		public ArchivoContext archivo(int i) {
			return getRuleContext(ArchivoContext.class,i);
		}
		public RutaficherograficoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutaficherografico; }
	}

	public final RutaficherograficoContext rutaficherografico() throws RecognitionException {
		RutaficherograficoContext _localctx = new RutaficherograficoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rutaficherografico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOBLEPUNTO:
				{
				setState(100);
				doblepunto();
				}
				break;
			case PUNTO:
				{
				setState(101);
				punto();
				}
				break;
			case DISCO:
				{
				setState(102);
				disco();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(105);
				barra();
				}
				break;
			}
			{
			setState(108);
			barra();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRECOSAS) {
				{
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(109);
					carpeta();
					}
					break;
				case 2:
					{
					setState(110);
					archivo();
					}
					break;
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CarpetaContext extends ParserRuleContext {
		public NombrecarpetaContext nombrecarpeta() {
			return getRuleContext(NombrecarpetaContext.class,0);
		}
		public CarpetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carpeta; }
	}

	public final CarpetaContext carpeta() throws RecognitionException {
		CarpetaContext _localctx = new CarpetaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_carpeta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			nombrecarpeta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArchivoContext extends ParserRuleContext {
		public NombrearchivoContext nombrearchivo() {
			return getRuleContext(NombrearchivoContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public ArchivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_archivo; }
	}

	public final ArchivoContext archivo() throws RecognitionException {
		ArchivoContext _localctx = new ArchivoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_archivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			nombrearchivo();
			setState(119);
			punto();
			setState(120);
			extension();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFICADOR() { return getToken(CsvParser.IDENTIFICADOR, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CosasContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CsvParser.IDENTIFICADOR, 0); }
		public CosasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cosas; }
	}

	public final CosasContext cosas() throws RecognitionException {
		CosasContext _localctx = new CosasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cosas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INTRO() { return getToken(CsvParser.INTRO, 0); }
		public IntroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intro; }
	}

	public final IntroContext intro() throws RecognitionException {
		IntroContext _localctx = new IntroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_intro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(CsvParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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

	public static class BarraContext extends ParserRuleContext {
		public TerminalNode BARRA() { return getToken(CsvParser.BARRA, 0); }
		public BarraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barra; }
	}

	public final BarraContext barra() throws RecognitionException {
		BarraContext _localctx = new BarraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_barra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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

	public static class DoblepuntoContext extends ParserRuleContext {
		public TerminalNode DOBLEPUNTO() { return getToken(CsvParser.DOBLEPUNTO, 0); }
		public DoblepuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doblepunto; }
	}

	public final DoblepuntoContext doblepunto() throws RecognitionException {
		DoblepuntoContext _localctx = new DoblepuntoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_doblepunto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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

	public static class DiscoContext extends ParserRuleContext {
		public TerminalNode DISCO() { return getToken(CsvParser.DISCO, 0); }
		public DiscoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disco; }
	}

	public final DiscoContext disco() throws RecognitionException {
		DiscoContext _localctx = new DiscoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_disco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DISCO);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PUNTO() { return getToken(CsvParser.PUNTO, 0); }
		public PuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto; }
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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

	public static class NombrearchivoContext extends ParserRuleContext {
		public TerminalNode NOMBRECOSAS() { return getToken(CsvParser.NOMBRECOSAS, 0); }
		public NombrearchivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrearchivo; }
	}

	public final NombrearchivoContext nombrearchivo() throws RecognitionException {
		NombrearchivoContext _localctx = new NombrearchivoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nombrearchivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(NOMBRECOSAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NombrecarpetaContext extends ParserRuleContext {
		public TerminalNode NOMBRECOSAS() { return getToken(CsvParser.NOMBRECOSAS, 0); }
		public NombrecarpetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrecarpeta; }
	}

	public final NombrecarpetaContext nombrecarpeta() throws RecognitionException {
		NombrecarpetaContext _localctx = new NombrecarpetaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nombrecarpeta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(NOMBRECOSAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionContext extends ParserRuleContext {
		public TerminalNode EXTENSION() { return getToken(CsvParser.EXTENSION, 0); }
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(EXTENSION);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\u0093\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\3\7\3\61\n\3\f"+
		"\3\16\3\64\13\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5J\n\5\3\5\5\5M\n\5\3\5\3\5\3\5\7\5"+
		"R\n\5\f\5\16\5U\13\5\3\6\3\6\3\6\5\6Z\n\6\3\6\5\6]\n\6\3\6\3\6\3\6\7\6"+
		"b\n\6\f\6\16\6e\13\6\3\7\3\7\3\7\5\7j\n\7\3\7\5\7m\n\7\3\7\3\7\3\7\7\7"+
		"r\n\7\f\7\16\7u\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2"+
		"\u0092\2,\3\2\2\2\48\3\2\2\2\6=\3\2\2\2\bI\3\2\2\2\nY\3\2\2\2\fi\3\2\2"+
		"\2\16v\3\2\2\2\20x\3\2\2\2\22|\3\2\2\2\24~\3\2\2\2\26\u0080\3\2\2\2\30"+
		"\u0082\3\2\2\2\32\u0084\3\2\2\2\34\u0086\3\2\2\2\36\u0088\3\2\2\2 \u008a"+
		"\3\2\2\2\"\u008c\3\2\2\2$\u008e\3\2\2\2&\u0090\3\2\2\2(+\5\4\3\2)+\5\6"+
		"\4\2*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2\2.,\3"+
		"\2\2\2/\61\5\24\13\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2"+
		"\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\67\5\30\r\2\66\62\3\2\2\2\67:\3\2"+
		"\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\5\26\f\2<\5\3\2\2\2="+
		">\5\22\n\2>?\5\30\r\2?@\5\b\5\2@A\5\30\r\2AB\5\n\6\2BC\5\30\r\2CD\5\f"+
		"\7\2DE\5\26\f\2E\7\3\2\2\2FJ\5\34\17\2GJ\5 \21\2HJ\5\36\20\2IF\3\2\2\2"+
		"IG\3\2\2\2IH\3\2\2\2JL\3\2\2\2KM\5\32\16\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2"+
		"\2NS\5\32\16\2OR\5\16\b\2PR\5\20\t\2QO\3\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2T\t\3\2\2\2US\3\2\2\2VZ\5\34\17\2WZ\5 \21\2XZ\5\36\20"+
		"\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\\\3\2\2\2[]\5\32\16\2\\[\3\2\2\2\\]"+
		"\3\2\2\2]^\3\2\2\2^c\5\32\16\2_b\5\16\b\2`b\5\20\t\2a_\3\2\2\2a`\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3\2\2\2ec\3\2\2\2fj\5\34\17\2gj\5"+
		" \21\2hj\5\36\20\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jl\3\2\2\2km\5\32\16\2"+
		"lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2ns\5\32\16\2or\5\16\b\2pr\5\20\t\2qo\3\2"+
		"\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\r\3\2\2\2us\3\2\2\2vw\5"+
		"$\23\2w\17\3\2\2\2xy\5\"\22\2yz\5 \21\2z{\5&\24\2{\21\3\2\2\2|}\7\3\2"+
		"\2}\23\3\2\2\2~\177\7\3\2\2\177\25\3\2\2\2\u0080\u0081\7\7\2\2\u0081\27"+
		"\3\2\2\2\u0082\u0083\7\4\2\2\u0083\31\3\2\2\2\u0084\u0085\7\t\2\2\u0085"+
		"\33\3\2\2\2\u0086\u0087\7\5\2\2\u0087\35\3\2\2\2\u0088\u0089\7\b\2\2\u0089"+
		"\37\3\2\2\2\u008a\u008b\7\6\2\2\u008b!\3\2\2\2\u008c\u008d\7\13\2\2\u008d"+
		"#\3\2\2\2\u008e\u008f\7\13\2\2\u008f%\3\2\2\2\u0090\u0091\7\n\2\2\u0091"+
		"\'\3\2\2\2\22*,\628ILQSY\\acilqs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}