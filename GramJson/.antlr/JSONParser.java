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
		WS=1, GRAPHS=2, GRAPH=3, TREE=4, PROPERTIES=5, TRUE=6, FALSE=7, TEXTO=8, 
		ABRIR_LLAVE=9, CERRAR_LLAVE=10, ABRIR_CORCHETE=11, CERRAR_CORCHETE=12, 
		DOSPUNTOS=13, COMA=14;
	public static final int
		RULE_init = 0, RULE_objeto = 1, RULE_nombre_objeto = 2, RULE_cuerpo_objeto = 3, 
		RULE_atributo = 4, RULE_nombre_atributo = 5, RULE_valor_atributo = 6, 
		RULE_lista = 7, RULE_nombre_lista = 8, RULE_cuerpo_lista = 9, RULE_graphs = 10, 
		RULE_cuerpo_graphs = 11, RULE_graph = 12, RULE_cuerpo_graph = 13, RULE_properties = 14, 
		RULE_cuerpo_properties = 15, RULE_arbol = 16, RULE_cuerpo_tree = 17, RULE_cadena = 18;
	public static final String[] ruleNames = {
		"init", "objeto", "nombre_objeto", "cuerpo_objeto", "atributo", "nombre_atributo", 
		"valor_atributo", "lista", "nombre_lista", "cuerpo_lista", "graphs", "cuerpo_graphs", 
		"graph", "cuerpo_graph", "properties", "cuerpo_properties", "arbol", "cuerpo_tree", 
		"cadena"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'\"graphs\"'", "'\"@graph\"'", "'\"@tree\"'", "'\"properties\":['", 
		"'true'", "'false'", null, "'{'", "'}'", "'['", "']'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "GRAPHS", "GRAPH", "TREE", "PROPERTIES", "TRUE", "FALSE", 
		"TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", "CERRAR_CORCHETE", 
		"DOSPUNTOS", "COMA"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0)) {
				{
				{
				setState(38);
				objeto();
				}
				}
				setState(43);
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO))) != 0)) {
				{
				setState(44);
				nombre_objeto();
				setState(45);
				match(DOSPUNTOS);
				}
			}

			setState(49);
			cuerpo_objeto();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(50);
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
			setState(53);
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
			setState(55);
			match(ABRIR_LLAVE);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(56);
					objeto();
					}
					break;
				case 2:
					{
					setState(57);
					atributo();
					}
					break;
				case 3:
					{
					setState(58);
					lista();
					}
					break;
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPHS) | (1L << GRAPH) | (1L << TREE) | (1L << PROPERTIES) | (1L << TRUE) | (1L << FALSE) | (1L << TEXTO) | (1L << ABRIR_LLAVE) | (1L << ABRIR_CORCHETE))) != 0) );
			setState(63);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(65);
				nombre_atributo();
				setState(66);
				match(DOSPUNTOS);
				}
				break;
			}
			setState(70);
			valor_atributo();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(71);
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
			setState(74);
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
			setState(76);
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
		public Cuerpo_graphsContext cuerpo_graphs() {
			return getRuleContext(Cuerpo_graphsContext.class,0);
		}
		public GraphsContext graphs() {
			return getRuleContext(GraphsContext.class,0);
		}
		public Cuerpo_graphContext cuerpo_graph() {
			return getRuleContext(Cuerpo_graphContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public Cuerpo_propertiesContext cuerpo_properties() {
			return getRuleContext(Cuerpo_propertiesContext.class,0);
		}
		public Cuerpo_treeContext cuerpo_tree() {
			return getRuleContext(Cuerpo_treeContext.class,0);
		}
		public ArbolContext arbol() {
			return getRuleContext(ArbolContext.class,0);
		}
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case TEXTO:
			case ABRIR_CORCHETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO))) != 0)) {
					{
					setState(78);
					nombre_lista();
					setState(79);
					match(DOSPUNTOS);
					}
				}

				setState(83);
				cuerpo_lista();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(84);
					match(COMA);
					}
				}

				}
				break;
			case GRAPHS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(87);
				graphs();
				setState(88);
				match(DOSPUNTOS);
				}
				setState(90);
				cuerpo_graphs();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(91);
					match(COMA);
					}
				}

				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(94);
				graph();
				setState(95);
				match(DOSPUNTOS);
				}
				setState(97);
				cuerpo_graph();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(98);
					match(COMA);
					}
				}

				}
				break;
			case PROPERTIES:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				properties();
				setState(102);
				cuerpo_properties();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(103);
					match(COMA);
					}
				}

				}
				break;
			case TREE:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(106);
				arbol();
				setState(107);
				match(DOSPUNTOS);
				}
				setState(109);
				cuerpo_tree();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(110);
					match(COMA);
					}
				}

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
			setState(115);
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
			setState(117);
			match(ABRIR_CORCHETE);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(118);
					objeto();
					}
					break;
				case 2:
					{
					setState(119);
					atributo();
					}
					break;
				case 3:
					{
					setState(120);
					lista();
					}
					break;
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPHS) | (1L << GRAPH) | (1L << TREE) | (1L << PROPERTIES) | (1L << TRUE) | (1L << FALSE) | (1L << TEXTO) | (1L << ABRIR_LLAVE) | (1L << ABRIR_CORCHETE))) != 0) );
			setState(125);
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

	public static class GraphsContext extends ParserRuleContext {
		public TerminalNode GRAPHS() { return getToken(JSONParser.GRAPHS, 0); }
		public GraphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphs; }
	}

	public final GraphsContext graphs() throws RecognitionException {
		GraphsContext _localctx = new GraphsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_graphs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(GRAPHS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_graphsContext extends ParserRuleContext {
		public TerminalNode ABRIR_CORCHETE() { return getToken(JSONParser.ABRIR_CORCHETE, 0); }
		public TerminalNode CERRAR_CORCHETE() { return getToken(JSONParser.CERRAR_CORCHETE, 0); }
		public List<ObjetoContext> objeto() {
			return getRuleContexts(ObjetoContext.class);
		}
		public ObjetoContext objeto(int i) {
			return getRuleContext(ObjetoContext.class,i);
		}
		public Cuerpo_graphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_graphs; }
	}

	public final Cuerpo_graphsContext cuerpo_graphs() throws RecognitionException {
		Cuerpo_graphsContext _localctx = new Cuerpo_graphsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cuerpo_graphs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ABRIR_CORCHETE);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				objeto();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0) );
			setState(135);
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

	public static class GraphContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(JSONParser.GRAPH, 0); }
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(GRAPH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_graphContext extends ParserRuleContext {
		public TerminalNode ABRIR_CORCHETE() { return getToken(JSONParser.ABRIR_CORCHETE, 0); }
		public TerminalNode CERRAR_CORCHETE() { return getToken(JSONParser.CERRAR_CORCHETE, 0); }
		public List<ObjetoContext> objeto() {
			return getRuleContexts(ObjetoContext.class);
		}
		public ObjetoContext objeto(int i) {
			return getRuleContext(ObjetoContext.class,i);
		}
		public Cuerpo_graphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_graph; }
	}

	public final Cuerpo_graphContext cuerpo_graph() throws RecognitionException {
		Cuerpo_graphContext _localctx = new Cuerpo_graphContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cuerpo_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ABRIR_CORCHETE);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				objeto();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0) );
			setState(145);
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

	public static class PropertiesContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(JSONParser.PROPERTIES, 0); }
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_properties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(PROPERTIES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_propertiesContext extends ParserRuleContext {
		public TerminalNode CERRAR_CORCHETE() { return getToken(JSONParser.CERRAR_CORCHETE, 0); }
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public Cuerpo_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_properties; }
	}

	public final Cuerpo_propertiesContext cuerpo_properties() throws RecognitionException {
		Cuerpo_propertiesContext _localctx = new Cuerpo_propertiesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cuerpo_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				atributo();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO))) != 0) );
			setState(154);
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

	public static class ArbolContext extends ParserRuleContext {
		public TerminalNode TREE() { return getToken(JSONParser.TREE, 0); }
		public ArbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arbol; }
	}

	public final ArbolContext arbol() throws RecognitionException {
		ArbolContext _localctx = new ArbolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(TREE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_treeContext extends ParserRuleContext {
		public TerminalNode ABRIR_CORCHETE() { return getToken(JSONParser.ABRIR_CORCHETE, 0); }
		public TerminalNode CERRAR_CORCHETE() { return getToken(JSONParser.CERRAR_CORCHETE, 0); }
		public List<ObjetoContext> objeto() {
			return getRuleContexts(ObjetoContext.class);
		}
		public ObjetoContext objeto(int i) {
			return getRuleContext(ObjetoContext.class,i);
		}
		public Cuerpo_treeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_tree; }
	}

	public final Cuerpo_treeContext cuerpo_tree() throws RecognitionException {
		Cuerpo_treeContext _localctx = new Cuerpo_treeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cuerpo_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ABRIR_CORCHETE);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				objeto();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0) );
			setState(164);
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
		enterRule(_localctx, 36, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\5\3\62\n"+
		"\3\3\3\3\3\5\3\66\n\3\3\4\3\4\3\5\3\5\3\5\3\5\6\5>\n\5\r\5\16\5?\3\5\3"+
		"\5\3\6\3\6\3\6\5\6G\n\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5"+
		"\tT\n\t\3\t\3\t\5\tX\n\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tf\n\t\3\t\3\t\3\t\5\tk\n\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\5\tt\n"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\6\13|\n\13\r\13\16\13}\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\6\r\u0086\n\r\r\r\16\r\u0087\3\r\3\r\3\16\3\16\3\17\3\17\6"+
		"\17\u0090\n\17\r\17\16\17\u0091\3\17\3\17\3\20\3\20\3\21\6\21\u0099\n"+
		"\21\r\21\16\21\u009a\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u00a3\n\23\r\23"+
		"\16\23\u00a4\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\3\3\2\b\n\2\u00b0\2+\3\2\2\2\4\61\3\2\2\2\6\67\3\2"+
		"\2\2\b9\3\2\2\2\nF\3\2\2\2\fL\3\2\2\2\16N\3\2\2\2\20s\3\2\2\2\22u\3\2"+
		"\2\2\24w\3\2\2\2\26\u0081\3\2\2\2\30\u0083\3\2\2\2\32\u008b\3\2\2\2\34"+
		"\u008d\3\2\2\2\36\u0095\3\2\2\2 \u0098\3\2\2\2\"\u009e\3\2\2\2$\u00a0"+
		"\3\2\2\2&\u00a8\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2"+
		"\2\2,\3\3\2\2\2-+\3\2\2\2./\5\6\4\2/\60\7\17\2\2\60\62\3\2\2\2\61.\3\2"+
		"\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\65\5\b\5\2\64\66\7\20\2\2\65\64\3"+
		"\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\678\5&\24\28\7\3\2\2\29=\7\13\2\2:>"+
		"\5\4\3\2;>\5\n\6\2<>\5\20\t\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>?\3\2\2\2"+
		"?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\f\2\2B\t\3\2\2\2CD\5\f\7\2DE\7\17\2"+
		"\2EG\3\2\2\2FC\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\5\16\b\2IK\7\20\2\2JI\3\2"+
		"\2\2JK\3\2\2\2K\13\3\2\2\2LM\5&\24\2M\r\3\2\2\2NO\5&\24\2O\17\3\2\2\2"+
		"PQ\5\22\n\2QR\7\17\2\2RT\3\2\2\2SP\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\5\24"+
		"\13\2VX\7\20\2\2WV\3\2\2\2WX\3\2\2\2Xt\3\2\2\2YZ\5\26\f\2Z[\7\17\2\2["+
		"\\\3\2\2\2\\^\5\30\r\2]_\7\20\2\2^]\3\2\2\2^_\3\2\2\2_t\3\2\2\2`a\5\32"+
		"\16\2ab\7\17\2\2bc\3\2\2\2ce\5\34\17\2df\7\20\2\2ed\3\2\2\2ef\3\2\2\2"+
		"ft\3\2\2\2gh\5\36\20\2hj\5 \21\2ik\7\20\2\2ji\3\2\2\2jk\3\2\2\2kt\3\2"+
		"\2\2lm\5\"\22\2mn\7\17\2\2no\3\2\2\2oq\5$\23\2pr\7\20\2\2qp\3\2\2\2qr"+
		"\3\2\2\2rt\3\2\2\2sS\3\2\2\2sY\3\2\2\2s`\3\2\2\2sg\3\2\2\2sl\3\2\2\2t"+
		"\21\3\2\2\2uv\5&\24\2v\23\3\2\2\2w{\7\r\2\2x|\5\4\3\2y|\5\n\6\2z|\5\20"+
		"\t\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7\16\2\2\u0080\25\3\2\2\2\u0081\u0082\7\4\2\2\u0082"+
		"\27\3\2\2\2\u0083\u0085\7\r\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\7\16\2\2\u008a\31\3\2\2\2\u008b\u008c\7\5\2\2\u008c"+
		"\33\3\2\2\2\u008d\u008f\7\r\2\2\u008e\u0090\5\4\3\2\u008f\u008e\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\7\16\2\2\u0094\35\3\2\2\2\u0095\u0096\7\7\2\2\u0096"+
		"\37\3\2\2\2\u0097\u0099\5\n\6\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2"+
		"\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\7\16\2\2\u009d!\3\2\2\2\u009e\u009f\7\6\2\2\u009f#\3\2\2\2\u00a0\u00a2"+
		"\7\r\2\2\u00a1\u00a3\5\4\3\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\16"+
		"\2\2\u00a7%\3\2\2\2\u00a8\u00a9\t\2\2\2\u00a9\'\3\2\2\2\26+\61\65=?FJ"+
		"SW^ejqs{}\u0087\u0091\u009a\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}