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
		GRAPH=1, TREE=2, PROPERTIES=3, KW_ID=4, KW_GENDER=5, KW_NUMBER=6, KW_WORD_TYPE=7, 
		KW_TYPE_OF=8, KW_ISLIST=9, KW_OPTIONAL=10, ESTADO_CONTEXT=11, BOOLEANO=12, 
		TEXTO=13, ABRIR_LLAVE=14, CERRAR_LLAVE=15, ABRIR_CORCHETE=16, CERRAR_CORCHETE=17, 
		DOSPUNTOS=18, COMA=19, WS=20, CERRARCONTEXT=21, INFO=22, KW_IS_LIST=23, 
		KW_MULTIPLICITY_MAX=24;
	public static final int
		RULE_init = 0, RULE_objeto = 1, RULE_nombre_objeto = 2, RULE_cuerpo_objeto = 3, 
		RULE_atributo = 4, RULE_nombre_atributo = 5, RULE_valor_atributo = 6, 
		RULE_lista = 7, RULE_nombre_lista = 8, RULE_cuerpo_lista = 9, RULE_graph = 10, 
		RULE_cuerpo_graph = 11, RULE_properties = 12, RULE_cuerpo_properties = 13, 
		RULE_arbol = 14, RULE_cuerpo_tree = 15, RULE_cadena = 16, RULE_kw_id = 17, 
		RULE_valor_id = 18, RULE_kw_geder = 19, RULE_valor_gender = 20, RULE_kw_number = 21, 
		RULE_valor_number = 22, RULE_kw_word_type = 23, RULE_valor_word_type = 24, 
		RULE_kw_type_of = 25, RULE_valor_type_of = 26, RULE_kw_is_list = 27, RULE_valor_is_list = 28, 
		RULE_kw_optional = 29, RULE_valor_optional = 30, RULE_kw_multiplicity_max = 31, 
		RULE_valor_multiplicity_max = 32, RULE_estado_context = 33;
	public static final String[] ruleNames = {
		"init", "objeto", "nombre_objeto", "cuerpo_objeto", "atributo", "nombre_atributo", 
		"valor_atributo", "lista", "nombre_lista", "cuerpo_lista", "graph", "cuerpo_graph", 
		"properties", "cuerpo_properties", "arbol", "cuerpo_tree", "cadena", "kw_id", 
		"valor_id", "kw_geder", "valor_gender", "kw_number", "valor_number", "kw_word_type", 
		"valor_word_type", "kw_type_of", "valor_type_of", "kw_is_list", "valor_is_list", 
		"kw_optional", "valor_optional", "kw_multiplicity_max", "valor_multiplicity_max", 
		"estado_context"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"@graph\"'", "'\"@tree\"'", null, "'\"@id\"'", "'\"gender\"'", 
		"'\"number\"'", "'\"wordType\"'", "'\"typeOf\"'", "'\"isList\"'", "'\"optional\"'", 
		"'\"@context\"'", null, null, "'{'", "'}'", "'['", "']'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GRAPH", "TREE", "PROPERTIES", "KW_ID", "KW_GENDER", "KW_NUMBER", 
		"KW_WORD_TYPE", "KW_TYPE_OF", "KW_ISLIST", "KW_OPTIONAL", "ESTADO_CONTEXT", 
		"BOOLEANO", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", 
		"CERRAR_CORCHETE", "DOSPUNTOS", "COMA", "WS", "CERRARCONTEXT", "INFO", 
		"KW_IS_LIST", "KW_MULTIPLICITY_MAX"
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0)) {
				{
				{
				setState(68);
				objeto();
				}
				}
				setState(73);
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
		public Estado_contextContext estado_context() {
			return getRuleContext(Estado_contextContext.class,0);
		}
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTADO_CONTEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				estado_context();
				}
				break;
			case BOOLEANO:
			case TEXTO:
			case ABRIR_LLAVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOOLEANO || _la==TEXTO) {
					{
					setState(75);
					nombre_objeto();
					setState(76);
					match(DOSPUNTOS);
					}
				}

				setState(80);
				cuerpo_objeto();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(81);
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
			setState(86);
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
			setState(88);
			match(ABRIR_LLAVE);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(89);
					objeto();
					}
					break;
				case 2:
					{
					setState(90);
					atributo();
					}
					break;
				case 3:
					{
					setState(91);
					lista();
					}
					break;
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << TREE) | (1L << PROPERTIES) | (1L << KW_ID) | (1L << KW_GENDER) | (1L << KW_NUMBER) | (1L << KW_WORD_TYPE) | (1L << KW_TYPE_OF) | (1L << KW_OPTIONAL) | (1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE) | (1L << ABRIR_CORCHETE) | (1L << KW_IS_LIST) | (1L << KW_MULTIPLICITY_MAX))) != 0) );
			setState(96);
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
		public Kw_idContext kw_id() {
			return getRuleContext(Kw_idContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public Valor_idContext valor_id() {
			return getRuleContext(Valor_idContext.class,0);
		}
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public Kw_gederContext kw_geder() {
			return getRuleContext(Kw_gederContext.class,0);
		}
		public Valor_genderContext valor_gender() {
			return getRuleContext(Valor_genderContext.class,0);
		}
		public Kw_numberContext kw_number() {
			return getRuleContext(Kw_numberContext.class,0);
		}
		public Valor_numberContext valor_number() {
			return getRuleContext(Valor_numberContext.class,0);
		}
		public Kw_word_typeContext kw_word_type() {
			return getRuleContext(Kw_word_typeContext.class,0);
		}
		public Valor_word_typeContext valor_word_type() {
			return getRuleContext(Valor_word_typeContext.class,0);
		}
		public Kw_type_ofContext kw_type_of() {
			return getRuleContext(Kw_type_ofContext.class,0);
		}
		public Valor_type_ofContext valor_type_of() {
			return getRuleContext(Valor_type_ofContext.class,0);
		}
		public Kw_is_listContext kw_is_list() {
			return getRuleContext(Kw_is_listContext.class,0);
		}
		public Valor_is_listContext valor_is_list() {
			return getRuleContext(Valor_is_listContext.class,0);
		}
		public Kw_optionalContext kw_optional() {
			return getRuleContext(Kw_optionalContext.class,0);
		}
		public Valor_optionalContext valor_optional() {
			return getRuleContext(Valor_optionalContext.class,0);
		}
		public Kw_multiplicity_maxContext kw_multiplicity_max() {
			return getRuleContext(Kw_multiplicity_maxContext.class,0);
		}
		public Valor_multiplicity_maxContext valor_multiplicity_max() {
			return getRuleContext(Valor_multiplicity_maxContext.class,0);
		}
		public Valor_atributoContext valor_atributo() {
			return getRuleContext(Valor_atributoContext.class,0);
		}
		public Nombre_atributoContext nombre_atributo() {
			return getRuleContext(Nombre_atributoContext.class,0);
		}
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				kw_id();
				setState(99);
				match(DOSPUNTOS);
				setState(100);
				valor_id();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(101);
					match(COMA);
					}
				}

				}
				break;
			case KW_GENDER:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				kw_geder();
				setState(105);
				match(DOSPUNTOS);
				setState(106);
				valor_gender();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(107);
					match(COMA);
					}
				}

				}
				break;
			case KW_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				kw_number();
				setState(111);
				match(DOSPUNTOS);
				setState(112);
				valor_number();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(113);
					match(COMA);
					}
				}

				}
				break;
			case KW_WORD_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				kw_word_type();
				setState(117);
				match(DOSPUNTOS);
				setState(118);
				valor_word_type();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(119);
					match(COMA);
					}
				}

				}
				break;
			case KW_TYPE_OF:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				kw_type_of();
				setState(123);
				match(DOSPUNTOS);
				setState(124);
				valor_type_of();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(125);
					match(COMA);
					}
				}

				}
				break;
			case KW_IS_LIST:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				kw_is_list();
				setState(129);
				match(DOSPUNTOS);
				setState(130);
				valor_is_list();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(131);
					match(COMA);
					}
				}

				}
				break;
			case KW_OPTIONAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				kw_optional();
				setState(135);
				match(DOSPUNTOS);
				setState(136);
				valor_optional();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(137);
					match(COMA);
					}
				}

				}
				break;
			case KW_MULTIPLICITY_MAX:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				kw_multiplicity_max();
				setState(141);
				match(DOSPUNTOS);
				setState(142);
				valor_multiplicity_max();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(143);
					match(COMA);
					}
				}

				}
				break;
			case BOOLEANO:
			case TEXTO:
				enterOuterAlt(_localctx, 9);
				{
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(146);
					nombre_atributo();
					setState(147);
					match(DOSPUNTOS);
					}
					break;
				}
				setState(151);
				valor_atributo();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(152);
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
			setState(157);
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
			setState(159);
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
		public Cuerpo_graphContext cuerpo_graph() {
			return getRuleContext(Cuerpo_graphContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
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
		public Cuerpo_listaContext cuerpo_lista() {
			return getRuleContext(Cuerpo_listaContext.class,0);
		}
		public Nombre_listaContext nombre_lista() {
			return getRuleContext(Nombre_listaContext.class,0);
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
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRAPH:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(161);
				graph();
				setState(162);
				match(DOSPUNTOS);
				}
				setState(164);
				cuerpo_graph();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(165);
					match(COMA);
					}
				}

				}
				break;
			case PROPERTIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				properties();
				setState(169);
				cuerpo_properties();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(170);
					match(COMA);
					}
				}

				}
				break;
			case TREE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(173);
				arbol();
				setState(174);
				match(DOSPUNTOS);
				}
				setState(176);
				cuerpo_tree();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(177);
					match(COMA);
					}
				}

				}
				break;
			case BOOLEANO:
			case TEXTO:
			case ABRIR_CORCHETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOOLEANO || _la==TEXTO) {
					{
					setState(180);
					nombre_lista();
					setState(181);
					match(DOSPUNTOS);
					}
				}

				setState(185);
				cuerpo_lista();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(186);
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
			setState(191);
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
			setState(193);
			match(ABRIR_CORCHETE);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(194);
					objeto();
					}
					break;
				case 2:
					{
					setState(195);
					atributo();
					}
					break;
				case 3:
					{
					setState(196);
					lista();
					}
					break;
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << TREE) | (1L << PROPERTIES) | (1L << KW_ID) | (1L << KW_GENDER) | (1L << KW_NUMBER) | (1L << KW_WORD_TYPE) | (1L << KW_TYPE_OF) | (1L << KW_OPTIONAL) | (1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE) | (1L << ABRIR_CORCHETE) | (1L << KW_IS_LIST) | (1L << KW_MULTIPLICITY_MAX))) != 0) );
			setState(201);
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
		enterRule(_localctx, 20, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 22, RULE_cuerpo_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ABRIR_CORCHETE);
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				objeto();
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0) );
			setState(211);
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
		enterRule(_localctx, 24, RULE_properties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		enterRule(_localctx, 26, RULE_cuerpo_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				atributo();
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ID) | (1L << KW_GENDER) | (1L << KW_NUMBER) | (1L << KW_WORD_TYPE) | (1L << KW_TYPE_OF) | (1L << KW_OPTIONAL) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << KW_IS_LIST) | (1L << KW_MULTIPLICITY_MAX))) != 0) );
			setState(220);
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
		enterRule(_localctx, 28, RULE_arbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 30, RULE_cuerpo_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ABRIR_CORCHETE);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				objeto();
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0) );
			setState(230);
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
		public TerminalNode BOOLEANO() { return getToken(JSONParser.BOOLEANO, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==BOOLEANO || _la==TEXTO) ) {
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

	public static class Kw_idContext extends ParserRuleContext {
		public TerminalNode KW_ID() { return getToken(JSONParser.KW_ID, 0); }
		public Kw_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_id; }
	}

	public final Kw_idContext kw_id() throws RecognitionException {
		Kw_idContext _localctx = new Kw_idContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_kw_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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

	public static class Valor_idContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_id; }
	}

	public final Valor_idContext valor_id() throws RecognitionException {
		Valor_idContext _localctx = new Valor_idContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valor_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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

	public static class Kw_gederContext extends ParserRuleContext {
		public TerminalNode KW_GENDER() { return getToken(JSONParser.KW_GENDER, 0); }
		public Kw_gederContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_geder; }
	}

	public final Kw_gederContext kw_geder() throws RecognitionException {
		Kw_gederContext _localctx = new Kw_gederContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_kw_geder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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

	public static class Valor_genderContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_genderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_gender; }
	}

	public final Valor_genderContext valor_gender() throws RecognitionException {
		Valor_genderContext _localctx = new Valor_genderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valor_gender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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

	public static class Kw_numberContext extends ParserRuleContext {
		public TerminalNode KW_NUMBER() { return getToken(JSONParser.KW_NUMBER, 0); }
		public Kw_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_number; }
	}

	public final Kw_numberContext kw_number() throws RecognitionException {
		Kw_numberContext _localctx = new Kw_numberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_kw_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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

	public static class Valor_numberContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_number; }
	}

	public final Valor_numberContext valor_number() throws RecognitionException {
		Valor_numberContext _localctx = new Valor_numberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_valor_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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

	public static class Kw_word_typeContext extends ParserRuleContext {
		public TerminalNode KW_WORD_TYPE() { return getToken(JSONParser.KW_WORD_TYPE, 0); }
		public Kw_word_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_word_type; }
	}

	public final Kw_word_typeContext kw_word_type() throws RecognitionException {
		Kw_word_typeContext _localctx = new Kw_word_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_kw_word_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(KW_WORD_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_word_typeContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_word_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_word_type; }
	}

	public final Valor_word_typeContext valor_word_type() throws RecognitionException {
		Valor_word_typeContext _localctx = new Valor_word_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valor_word_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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

	public static class Kw_type_ofContext extends ParserRuleContext {
		public TerminalNode KW_TYPE_OF() { return getToken(JSONParser.KW_TYPE_OF, 0); }
		public Kw_type_ofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_type_of; }
	}

	public final Kw_type_ofContext kw_type_of() throws RecognitionException {
		Kw_type_ofContext _localctx = new Kw_type_ofContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_kw_type_of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(KW_TYPE_OF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_type_ofContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_type_ofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_type_of; }
	}

	public final Valor_type_ofContext valor_type_of() throws RecognitionException {
		Valor_type_ofContext _localctx = new Valor_type_ofContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_valor_type_of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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

	public static class Kw_is_listContext extends ParserRuleContext {
		public TerminalNode KW_IS_LIST() { return getToken(JSONParser.KW_IS_LIST, 0); }
		public Kw_is_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_is_list; }
	}

	public final Kw_is_listContext kw_is_list() throws RecognitionException {
		Kw_is_listContext _localctx = new Kw_is_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_kw_is_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(KW_IS_LIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_is_listContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_is_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_is_list; }
	}

	public final Valor_is_listContext valor_is_list() throws RecognitionException {
		Valor_is_listContext _localctx = new Valor_is_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_valor_is_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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

	public static class Kw_optionalContext extends ParserRuleContext {
		public TerminalNode KW_OPTIONAL() { return getToken(JSONParser.KW_OPTIONAL, 0); }
		public Kw_optionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_optional; }
	}

	public final Kw_optionalContext kw_optional() throws RecognitionException {
		Kw_optionalContext _localctx = new Kw_optionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_kw_optional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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

	public static class Valor_optionalContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_optionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_optional; }
	}

	public final Valor_optionalContext valor_optional() throws RecognitionException {
		Valor_optionalContext _localctx = new Valor_optionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_valor_optional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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

	public static class Kw_multiplicity_maxContext extends ParserRuleContext {
		public TerminalNode KW_MULTIPLICITY_MAX() { return getToken(JSONParser.KW_MULTIPLICITY_MAX, 0); }
		public Kw_multiplicity_maxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_multiplicity_max; }
	}

	public final Kw_multiplicity_maxContext kw_multiplicity_max() throws RecognitionException {
		Kw_multiplicity_maxContext _localctx = new Kw_multiplicity_maxContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_kw_multiplicity_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(KW_MULTIPLICITY_MAX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_multiplicity_maxContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_multiplicity_maxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_multiplicity_max; }
	}

	public final Valor_multiplicity_maxContext valor_multiplicity_max() throws RecognitionException {
		Valor_multiplicity_maxContext _localctx = new Valor_multiplicity_maxContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_valor_multiplicity_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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

	public static class Estado_contextContext extends ParserRuleContext {
		public TerminalNode ESTADO_CONTEXT() { return getToken(JSONParser.ESTADO_CONTEXT, 0); }
		public TerminalNode CERRARCONTEXT() { return getToken(JSONParser.CERRARCONTEXT, 0); }
		public Estado_contextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado_context; }
	}

	public final Estado_contextContext estado_context() throws RecognitionException {
		Estado_contextContext _localctx = new Estado_contextContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_estado_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ESTADO_CONTEXT);
			setState(267);
			match(CERRARCONTEXT);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0110\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\5\3Q\n\3"+
		"\3\3\3\3\5\3U\n\3\5\3W\n\3\3\4\3\4\3\5\3\5\3\5\3\5\6\5_\n\5\r\5\16\5`"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6"+
		"\3\6\5\6u\n\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0087\n\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0093\n\6\3\6\3\6\3\6\5\6\u0098\n\6\3\6\3\6\5\6\u009c\n\6\5\6"+
		"\u009e\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00a9\n\t\3\t\3\t\3"+
		"\t\5\t\u00ae\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\t\3\t\3\t\5\t\u00ba"+
		"\n\t\3\t\3\t\5\t\u00be\n\t\5\t\u00c0\n\t\3\n\3\n\3\13\3\13\3\13\3\13\6"+
		"\13\u00c8\n\13\r\13\16\13\u00c9\3\13\3\13\3\f\3\f\3\r\3\r\6\r\u00d2\n"+
		"\r\r\r\16\r\u00d3\3\r\3\r\3\16\3\16\3\17\6\17\u00db\n\17\r\17\16\17\u00dc"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\6\21\u00e5\n\21\r\21\16\21\u00e6\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\3\2\16\17\2\u0114\2I\3\2\2\2"+
		"\4V\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\n\u009d\3\2\2\2\f\u009f\3\2\2\2\16\u00a1"+
		"\3\2\2\2\20\u00bf\3\2\2\2\22\u00c1\3\2\2\2\24\u00c3\3\2\2\2\26\u00cd\3"+
		"\2\2\2\30\u00cf\3\2\2\2\32\u00d7\3\2\2\2\34\u00da\3\2\2\2\36\u00e0\3\2"+
		"\2\2 \u00e2\3\2\2\2\"\u00ea\3\2\2\2$\u00ec\3\2\2\2&\u00ee\3\2\2\2(\u00f0"+
		"\3\2\2\2*\u00f2\3\2\2\2,\u00f4\3\2\2\2.\u00f6\3\2\2\2\60\u00f8\3\2\2\2"+
		"\62\u00fa\3\2\2\2\64\u00fc\3\2\2\2\66\u00fe\3\2\2\28\u0100\3\2\2\2:\u0102"+
		"\3\2\2\2<\u0104\3\2\2\2>\u0106\3\2\2\2@\u0108\3\2\2\2B\u010a\3\2\2\2D"+
		"\u010c\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3"+
		"\2\2\2KI\3\2\2\2LW\5D#\2MN\5\6\4\2NO\7\24\2\2OQ\3\2\2\2PM\3\2\2\2PQ\3"+
		"\2\2\2QR\3\2\2\2RT\5\b\5\2SU\7\25\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VL"+
		"\3\2\2\2VP\3\2\2\2W\5\3\2\2\2XY\5\"\22\2Y\7\3\2\2\2Z^\7\20\2\2[_\5\4\3"+
		"\2\\_\5\n\6\2]_\5\20\t\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3"+
		"\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\21\2\2c\t\3\2\2\2de\5$\23\2ef\7\24\2\2"+
		"fh\5&\24\2gi\7\25\2\2hg\3\2\2\2hi\3\2\2\2i\u009e\3\2\2\2jk\5(\25\2kl\7"+
		"\24\2\2ln\5*\26\2mo\7\25\2\2nm\3\2\2\2no\3\2\2\2o\u009e\3\2\2\2pq\5,\27"+
		"\2qr\7\24\2\2rt\5.\30\2su\7\25\2\2ts\3\2\2\2tu\3\2\2\2u\u009e\3\2\2\2"+
		"vw\5\60\31\2wx\7\24\2\2xz\5\62\32\2y{\7\25\2\2zy\3\2\2\2z{\3\2\2\2{\u009e"+
		"\3\2\2\2|}\5\64\33\2}~\7\24\2\2~\u0080\5\66\34\2\177\u0081\7\25\2\2\u0080"+
		"\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u009e\3\2\2\2\u0082\u0083\58\35"+
		"\2\u0083\u0084\7\24\2\2\u0084\u0086\5:\36\2\u0085\u0087\7\25\2\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u009e\3\2\2\2\u0088\u0089\5<"+
		"\37\2\u0089\u008a\7\24\2\2\u008a\u008c\5> \2\u008b\u008d\7\25\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u009e\3\2\2\2\u008e\u008f\5@"+
		"!\2\u008f\u0090\7\24\2\2\u0090\u0092\5B\"\2\u0091\u0093\7\25\2\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009e\3\2\2\2\u0094\u0095\5\f"+
		"\7\2\u0095\u0096\7\24\2\2\u0096\u0098\3\2\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\5\16\b\2\u009a\u009c\7"+
		"\25\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"d\3\2\2\2\u009dj\3\2\2\2\u009dp\3\2\2\2\u009dv\3\2\2\2\u009d|\3\2\2\2"+
		"\u009d\u0082\3\2\2\2\u009d\u0088\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0097"+
		"\3\2\2\2\u009e\13\3\2\2\2\u009f\u00a0\5\"\22\2\u00a0\r\3\2\2\2\u00a1\u00a2"+
		"\5\"\22\2\u00a2\17\3\2\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\24\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a9\7\25\2\2\u00a8\u00a7\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00c0\3\2\2\2\u00aa\u00ab\5\32\16\2\u00ab"+
		"\u00ad\5\34\17\2\u00ac\u00ae\7\25\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00c0\3\2\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\7\24\2"+
		"\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\5 \21\2\u00b3\u00b5\7\25\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c0\3\2\2\2\u00b6\u00b7\5\22"+
		"\n\2\u00b7\u00b8\7\24\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\5\24\13\2\u00bc\u00be\7"+
		"\25\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00a3\3\2\2\2\u00bf\u00aa\3\2\2\2\u00bf\u00af\3\2\2\2\u00bf\u00b9\3\2"+
		"\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\5\"\22\2\u00c2\23\3\2\2\2\u00c3\u00c7"+
		"\7\22\2\2\u00c4\u00c8\5\4\3\2\u00c5\u00c8\5\n\6\2\u00c6\u00c8\5\20\t\2"+
		"\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\7\23\2\2\u00cc\25\3\2\2\2\u00cd\u00ce\7\3\2\2\u00ce\27\3\2\2\2"+
		"\u00cf\u00d1\7\22\2\2\u00d0\u00d2\5\4\3\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\7\23\2\2\u00d6\31\3\2\2\2\u00d7\u00d8\7\5\2\2\u00d8\33\3\2\2\2"+
		"\u00d9\u00db\5\n\6\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\23\2\2"+
		"\u00df\35\3\2\2\2\u00e0\u00e1\7\4\2\2\u00e1\37\3\2\2\2\u00e2\u00e4\7\22"+
		"\2\2\u00e3\u00e5\5\4\3\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\23"+
		"\2\2\u00e9!\3\2\2\2\u00ea\u00eb\t\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7\6"+
		"\2\2\u00ed%\3\2\2\2\u00ee\u00ef\5\"\22\2\u00ef\'\3\2\2\2\u00f0\u00f1\7"+
		"\7\2\2\u00f1)\3\2\2\2\u00f2\u00f3\5\"\22\2\u00f3+\3\2\2\2\u00f4\u00f5"+
		"\7\b\2\2\u00f5-\3\2\2\2\u00f6\u00f7\5\"\22\2\u00f7/\3\2\2\2\u00f8\u00f9"+
		"\7\t\2\2\u00f9\61\3\2\2\2\u00fa\u00fb\5\"\22\2\u00fb\63\3\2\2\2\u00fc"+
		"\u00fd\7\n\2\2\u00fd\65\3\2\2\2\u00fe\u00ff\5\"\22\2\u00ff\67\3\2\2\2"+
		"\u0100\u0101\7\31\2\2\u01019\3\2\2\2\u0102\u0103\5\"\22\2\u0103;\3\2\2"+
		"\2\u0104\u0105\7\f\2\2\u0105=\3\2\2\2\u0106\u0107\5\"\22\2\u0107?\3\2"+
		"\2\2\u0108\u0109\7\32\2\2\u0109A\3\2\2\2\u010a\u010b\5\"\22\2\u010bC\3"+
		"\2\2\2\u010c\u010d\7\r\2\2\u010d\u010e\7\27\2\2\u010eE\3\2\2\2\36IPTV"+
		"^`hntz\u0080\u0086\u008c\u0092\u0097\u009b\u009d\u00a8\u00ad\u00b4\u00b9"+
		"\u00bd\u00bf\u00c7\u00c9\u00d3\u00dc\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}