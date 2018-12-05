// Generated from c:\antlr\Lenguajes\GramJson\JSONParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TRUE=2, FALSE=3, TEXTO=4, ABRIR_LLAVE=5, CERRAR_LLAVE=6, ABRIR_CORCHETE=7, 
		CERRAR_CORCHETE=8, DOSPUNTOS=9, COMA=10;
	public static final int
		RULE_init = 0, RULE_objeto = 1, RULE_nombre_objeto = 2, RULE_cuerpo_objeto = 3, 
		RULE_atributo = 4, RULE_nombre_atributo = 5, RULE_valor_atributo = 6, 
		RULE_lista = 7, RULE_nombre_lista = 8, RULE_cuerpo_lista = 9, RULE_cadena = 10;
	public static final String[] ruleNames = {
		"init", "objeto", "nombre_objeto", "cuerpo_objeto", "atributo", "nombre_atributo", 
		"valor_atributo", "lista", "nombre_lista", "cuerpo_lista", "cadena"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'true'", "'false'", null, "'{'", "'}'", "'['", "']'", "':'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TRUE", "FALSE", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", 
		"CERRAR_CORCHETE", "DOSPUNTOS", "COMA"
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
	public String getGrammarFileName() { return "JSONParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<ObjetoContext> objeto() {
			return getRuleContexts(ObjetoContext.class);
		}
		public ObjetoContext objeto(int i) {
			return getRuleContext(ObjetoContext.class,i);
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0)) {
				{
				{
				setState(22);
				objeto();
				}
				}
				setState(27);
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

	public static class ObjetoContext extends ParserRuleContext {
		public Cuerpo_objetoContext cuerpo_objeto() {
			return getRuleContext(Cuerpo_objetoContext.class,0);
		}
		public Nombre_objetoContext nombre_objeto() {
			return getRuleContext(Nombre_objetoContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO))) != 0)) {
				{
				setState(28);
				nombre_objeto();
				setState(29);
				match(DOSPUNTOS);
				}
			}

			setState(33);
			cuerpo_objeto();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(34);
				match(COMA);
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

	public static class Nombre_objetoContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Nombre_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_objeto; }
	}

	public final Nombre_objetoContext nombre_objeto() throws RecognitionException {
		Nombre_objetoContext _localctx = new Nombre_objetoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nombre_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			cadena();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_objetoContext extends ParserRuleContext {
		public TerminalNode ABRIR_LLAVE() { return getToken(JSONParser.ABRIR_LLAVE, 0); }
		public TerminalNode CERRAR_LLAVE() { return getToken(JSONParser.CERRAR_LLAVE, 0); }
		public List<ObjetoContext> objeto() {
			return getRuleContexts(ObjetoContext.class);
		}
		public ObjetoContext objeto(int i) {
			return getRuleContext(ObjetoContext.class,i);
		}
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public List<ListaContext> lista() {
			return getRuleContexts(ListaContext.class);
		}
		public ListaContext lista(int i) {
			return getRuleContext(ListaContext.class,i);
		}
		public Cuerpo_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_objeto; }
	}

	public final Cuerpo_objetoContext cuerpo_objeto() throws RecognitionException {
		Cuerpo_objetoContext _localctx = new Cuerpo_objetoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cuerpo_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ABRIR_LLAVE);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(40);
					objeto();
					}
					break;
				case 2:
					{
					setState(41);
					atributo();
					}
					break;
				case 3:
					{
					setState(42);
					lista();
					}
					break;
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO) | (1L << ABRIR_LLAVE) | (1L << ABRIR_CORCHETE))) != 0) );
			setState(47);
			match(CERRAR_LLAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoContext extends ParserRuleContext {
		public Valor_atributoContext valor_atributo() {
			return getRuleContext(Valor_atributoContext.class,0);
		}
		public Nombre_atributoContext nombre_atributo() {
			return getRuleContext(Nombre_atributoContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atributo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(49);
				nombre_atributo();
				setState(50);
				match(DOSPUNTOS);
				}
				break;
			}
			setState(54);
			valor_atributo();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(55);
				match(COMA);
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

	public static class Nombre_atributoContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Nombre_atributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_atributo; }
	}

	public final Nombre_atributoContext nombre_atributo() throws RecognitionException {
		Nombre_atributoContext _localctx = new Nombre_atributoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nombre_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			cadena();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_atributoContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_atributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_atributo; }
	}

	public final Valor_atributoContext valor_atributo() throws RecognitionException {
		Valor_atributoContext _localctx = new Valor_atributoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valor_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			cadena();
			}
		}
		catch (RecognitionException re) {
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
		public Cuerpo_listaContext cuerpo_lista() {
			return getRuleContext(Cuerpo_listaContext.class,0);
		}
		public Nombre_listaContext nombre_lista() {
			return getRuleContext(Nombre_listaContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO))) != 0)) {
				{
				setState(62);
				nombre_lista();
				setState(63);
				match(DOSPUNTOS);
				}
			}

			setState(67);
			cuerpo_lista();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(68);
				match(COMA);
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

	public static class Nombre_listaContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Nombre_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_lista; }
	}

	public final Nombre_listaContext nombre_lista() throws RecognitionException {
		Nombre_listaContext _localctx = new Nombre_listaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nombre_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			cadena();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_listaContext extends ParserRuleContext {
		public TerminalNode ABRIR_CORCHETE() { return getToken(JSONParser.ABRIR_CORCHETE, 0); }
		public TerminalNode CERRAR_CORCHETE() { return getToken(JSONParser.CERRAR_CORCHETE, 0); }
		public List<ObjetoContext> objeto() {
			return getRuleContexts(ObjetoContext.class);
		}
		public ObjetoContext objeto(int i) {
			return getRuleContext(ObjetoContext.class,i);
		}
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public List<ListaContext> lista() {
			return getRuleContexts(ListaContext.class);
		}
		public ListaContext lista(int i) {
			return getRuleContext(ListaContext.class,i);
		}
		public Cuerpo_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_lista; }
	}

	public final Cuerpo_listaContext cuerpo_lista() throws RecognitionException {
		Cuerpo_listaContext _localctx = new Cuerpo_listaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cuerpo_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ABRIR_CORCHETE);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(74);
					objeto();
					}
					break;
				case 2:
					{
					setState(75);
					atributo();
					}
					break;
				case 3:
					{
					setState(76);
					lista();
					}
					break;
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO) | (1L << ABRIR_LLAVE) | (1L << ABRIR_CORCHETE))) != 0) );
			setState(81);
			match(CERRAR_CORCHETE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TEXTO() { return getToken(JSONParser.TEXTO, 0); }
		public TerminalNode TRUE() { return getToken(JSONParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JSONParser.FALSE, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fX\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\5"+
		"\3&\n\3\3\4\3\4\3\5\3\5\3\5\3\5\6\5.\n\5\r\5\16\5/\3\5\3\5\3\6\3\6\3\6"+
		"\5\6\67\n\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\tD\n\t\3\t"+
		"\3\t\5\tH\n\t\3\n\3\n\3\13\3\13\3\13\3\13\6\13P\n\13\r\13\16\13Q\3\13"+
		"\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\4\6\2Y\2\33"+
		"\3\2\2\2\4!\3\2\2\2\6\'\3\2\2\2\b)\3\2\2\2\n\66\3\2\2\2\f<\3\2\2\2\16"+
		">\3\2\2\2\20C\3\2\2\2\22I\3\2\2\2\24K\3\2\2\2\26U\3\2\2\2\30\32\5\4\3"+
		"\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2"+
		"\2\35\33\3\2\2\2\36\37\5\6\4\2\37 \7\13\2\2 \"\3\2\2\2!\36\3\2\2\2!\""+
		"\3\2\2\2\"#\3\2\2\2#%\5\b\5\2$&\7\f\2\2%$\3\2\2\2%&\3\2\2\2&\5\3\2\2\2"+
		"\'(\5\26\f\2(\7\3\2\2\2)-\7\7\2\2*.\5\4\3\2+.\5\n\6\2,.\5\20\t\2-*\3\2"+
		"\2\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2"+
		"\61\62\7\b\2\2\62\t\3\2\2\2\63\64\5\f\7\2\64\65\7\13\2\2\65\67\3\2\2\2"+
		"\66\63\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28:\5\16\b\29;\7\f\2\2:9\3\2\2"+
		"\2:;\3\2\2\2;\13\3\2\2\2<=\5\26\f\2=\r\3\2\2\2>?\5\26\f\2?\17\3\2\2\2"+
		"@A\5\22\n\2AB\7\13\2\2BD\3\2\2\2C@\3\2\2\2CD\3\2\2\2DE\3\2\2\2EG\5\24"+
		"\13\2FH\7\f\2\2GF\3\2\2\2GH\3\2\2\2H\21\3\2\2\2IJ\5\26\f\2J\23\3\2\2\2"+
		"KO\7\t\2\2LP\5\4\3\2MP\5\n\6\2NP\5\20\t\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2"+
		"\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\n\2\2T\25\3\2\2\2UV\t\2"+
		"\2\2V\27\3\2\2\2\r\33!%-/\66:CGOQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}