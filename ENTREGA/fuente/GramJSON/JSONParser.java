// Generated from ./fuente/GramJSON/JSONParser.g4 by ANTLR 4.7.1

package fuente.GramJSON;

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
		GRAPH=1, TREE=2, PROPERTIES=3, USEDBY=4, LANGUAGEDATA=5, KW_ID=6, KW_NAME=7, 
		KW_GENDER=8, KW_NUMBER=9, KW_WORD_TYPE=10, KW_TYPE_OF=11, KW_IS_LIST=12, 
		KW_OPTIONAL=13, KW_MULTIPLICITY_MAX=14, KW_MULTIPLICITY_MIN=15, KW_REVERSE_NAME=16, 
		KW_FROM=17, KW_TO=18, KW_INHERITS=19, LABEL=20, LABEL_REVERSENAME=21, 
		ESTADO_CONTEXT=22, BOOLEANO=23, TEXTO=24, ABRIR_LLAVE=25, CERRAR_LLAVE=26, 
		ABRIR_CORCHETE=27, CERRAR_CORCHETE=28, COMA=29, DOSPUNTOS=30, WS=31, CERRARCONTEXT=32, 
		INFO=33;
	public static final int
		RULE_init = 0, RULE_objeto = 1, RULE_nombre_objeto = 2, RULE_cuerpo_objeto = 3, 
		RULE_nombre_label = 4, RULE_label_clave = 5, RULE_label_valor = 6, RULE_contenido_label = 7, 
		RULE_cuerpo_label = 8, RULE_nombre_label_reversename = 9, RULE_label_reversename_clave = 10, 
		RULE_label_reversename_valor = 11, RULE_contenido_label_reversename = 12, 
		RULE_cuerpo_label_reversename = 13, RULE_atributo = 14, RULE_nombre_atributo = 15, 
		RULE_valor_atributo = 16, RULE_lista = 17, RULE_nombre_lista = 18, RULE_cuerpo_lista = 19, 
		RULE_graph = 20, RULE_cuerpo_graph = 21, RULE_properties = 22, RULE_valor_propertie = 23, 
		RULE_cuerpo_properties = 24, RULE_arbol = 25, RULE_cuerpo_tree = 26, RULE_usedby = 27, 
		RULE_valor_usedby = 28, RULE_cuerpo_usedby = 29, RULE_languajedata = 30, 
		RULE_cuerpo_languagedata = 31, RULE_cadena = 32, RULE_kw_id = 33, RULE_valor_id = 34, 
		RULE_kw_name = 35, RULE_valor_name = 36, RULE_kw_geder = 37, RULE_valor_gender = 38, 
		RULE_kw_number = 39, RULE_valor_number = 40, RULE_kw_word_type = 41, RULE_valor_word_type = 42, 
		RULE_kw_type_of = 43, RULE_valor_type_of = 44, RULE_kw_is_list = 45, RULE_valor_is_list = 46, 
		RULE_kw_optional = 47, RULE_valor_optional = 48, RULE_kw_multiplicity_max = 49, 
		RULE_valor_multiplicity_max = 50, RULE_kw_multiplicity_min = 51, RULE_valor_multiplicity_min = 52, 
		RULE_kw_reverse_name = 53, RULE_valor_reverse_name = 54, RULE_kw_from = 55, 
		RULE_valor_from = 56, RULE_kw_to = 57, RULE_kw_inherits = 58, RULE_valor_inherits = 59, 
		RULE_valor_to = 60, RULE_estado_context = 61;
	public static final String[] ruleNames = {
		"init", "objeto", "nombre_objeto", "cuerpo_objeto", "nombre_label", "label_clave", 
		"label_valor", "contenido_label", "cuerpo_label", "nombre_label_reversename", 
		"label_reversename_clave", "label_reversename_valor", "contenido_label_reversename", 
		"cuerpo_label_reversename", "atributo", "nombre_atributo", "valor_atributo", 
		"lista", "nombre_lista", "cuerpo_lista", "graph", "cuerpo_graph", "properties", 
		"valor_propertie", "cuerpo_properties", "arbol", "cuerpo_tree", "usedby", 
		"valor_usedby", "cuerpo_usedby", "languajedata", "cuerpo_languagedata", 
		"cadena", "kw_id", "valor_id", "kw_name", "valor_name", "kw_geder", "valor_gender", 
		"kw_number", "valor_number", "kw_word_type", "valor_word_type", "kw_type_of", 
		"valor_type_of", "kw_is_list", "valor_is_list", "kw_optional", "valor_optional", 
		"kw_multiplicity_max", "valor_multiplicity_max", "kw_multiplicity_min", 
		"valor_multiplicity_min", "kw_reverse_name", "valor_reverse_name", "kw_from", 
		"valor_from", "kw_to", "kw_inherits", "valor_inherits", "valor_to", "estado_context"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'\"@context\"'", 
		null, null, "'{'", "'}'", "'['", "']'", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GRAPH", "TREE", "PROPERTIES", "USEDBY", "LANGUAGEDATA", "KW_ID", 
		"KW_NAME", "KW_GENDER", "KW_NUMBER", "KW_WORD_TYPE", "KW_TYPE_OF", "KW_IS_LIST", 
		"KW_OPTIONAL", "KW_MULTIPLICITY_MAX", "KW_MULTIPLICITY_MIN", "KW_REVERSE_NAME", 
		"KW_FROM", "KW_TO", "KW_INHERITS", "LABEL", "LABEL_REVERSENAME", "ESTADO_CONTEXT", 
		"BOOLEANO", "TEXTO", "ABRIR_LLAVE", "CERRAR_LLAVE", "ABRIR_CORCHETE", 
		"CERRAR_CORCHETE", "COMA", "DOSPUNTOS", "WS", "CERRARCONTEXT", "INFO"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LABEL) | (1L << LABEL_REVERSENAME) | (1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0)) {
				{
				{
				setState(124);
				objeto();
				}
				}
				setState(129);
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
		public Cuerpo_labelContext cuerpo_label() {
			return getRuleContext(Cuerpo_labelContext.class,0);
		}
		public Nombre_labelContext nombre_label() {
			return getRuleContext(Nombre_labelContext.class,0);
		}
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public Cuerpo_label_reversenameContext cuerpo_label_reversename() {
			return getRuleContext(Cuerpo_label_reversenameContext.class,0);
		}
		public Nombre_label_reversenameContext nombre_label_reversename() {
			return getRuleContext(Nombre_label_reversenameContext.class,0);
		}
		public Cuerpo_objetoContext cuerpo_objeto() {
			return getRuleContext(Cuerpo_objetoContext.class,0);
		}
		public Nombre_objetoContext nombre_objeto() {
			return getRuleContext(Nombre_objetoContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitObjeto(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_objeto);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				estado_context();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL) {
					{
					setState(131);
					nombre_label();
					}
				}

				setState(134);
				cuerpo_label();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(135);
					match(COMA);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_REVERSENAME) {
					{
					setState(138);
					nombre_label_reversename();
					}
				}

				setState(141);
				cuerpo_label_reversename();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(142);
					match(COMA);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOOLEANO || _la==TEXTO) {
					{
					setState(145);
					nombre_objeto();
					setState(146);
					match(DOSPUNTOS);
					}
				}

				setState(150);
				cuerpo_objeto();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(151);
					match(COMA);
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

	public static class Nombre_objetoContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Nombre_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterNombre_objeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitNombre_objeto(this);
		}
	}

	public final Nombre_objetoContext nombre_objeto() throws RecognitionException {
		Nombre_objetoContext _localctx = new Nombre_objetoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nombre_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCuerpo_objeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCuerpo_objeto(this);
		}
	}

	public final Cuerpo_objetoContext cuerpo_objeto() throws RecognitionException {
		Cuerpo_objetoContext _localctx = new Cuerpo_objetoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cuerpo_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ABRIR_LLAVE);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(159);
					objeto();
					}
					break;
				case 2:
					{
					setState(160);
					atributo();
					}
					break;
				case 3:
					{
					setState(161);
					lista();
					}
					break;
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << TREE) | (1L << PROPERTIES) | (1L << USEDBY) | (1L << LANGUAGEDATA) | (1L << KW_ID) | (1L << KW_NAME) | (1L << KW_GENDER) | (1L << KW_NUMBER) | (1L << KW_WORD_TYPE) | (1L << KW_TYPE_OF) | (1L << KW_IS_LIST) | (1L << KW_OPTIONAL) | (1L << KW_MULTIPLICITY_MAX) | (1L << KW_MULTIPLICITY_MIN) | (1L << KW_REVERSE_NAME) | (1L << KW_FROM) | (1L << KW_TO) | (1L << KW_INHERITS) | (1L << LABEL) | (1L << LABEL_REVERSENAME) | (1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE) | (1L << ABRIR_CORCHETE))) != 0) );
			setState(166);
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

	public static class Nombre_labelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(JSONParser.LABEL, 0); }
		public Nombre_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterNombre_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitNombre_label(this);
		}
	}

	public final Nombre_labelContext nombre_label() throws RecognitionException {
		Nombre_labelContext _localctx = new Nombre_labelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nombre_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_claveContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Label_claveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_clave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterLabel_clave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitLabel_clave(this);
		}
	}

	public final Label_claveContext label_clave() throws RecognitionException {
		Label_claveContext _localctx = new Label_claveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label_clave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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

	public static class Label_valorContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Label_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterLabel_valor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitLabel_valor(this);
		}
	}

	public final Label_valorContext label_valor() throws RecognitionException {
		Label_valorContext _localctx = new Label_valorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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

	public static class Contenido_labelContext extends ParserRuleContext {
		public Label_claveContext label_clave() {
			return getRuleContext(Label_claveContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public Label_valorContext label_valor() {
			return getRuleContext(Label_valorContext.class,0);
		}
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public Contenido_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterContenido_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitContenido_label(this);
		}
	}

	public final Contenido_labelContext contenido_label() throws RecognitionException {
		Contenido_labelContext _localctx = new Contenido_labelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contenido_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			label_clave();
			setState(175);
			match(DOSPUNTOS);
			setState(176);
			label_valor();
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_labelContext extends ParserRuleContext {
		public TerminalNode ABRIR_LLAVE() { return getToken(JSONParser.ABRIR_LLAVE, 0); }
		public TerminalNode CERRAR_LLAVE() { return getToken(JSONParser.CERRAR_LLAVE, 0); }
		public List<Contenido_labelContext> contenido_label() {
			return getRuleContexts(Contenido_labelContext.class);
		}
		public Contenido_labelContext contenido_label(int i) {
			return getRuleContext(Contenido_labelContext.class,i);
		}
		public Cuerpo_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCuerpo_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCuerpo_label(this);
		}
	}

	public final Cuerpo_labelContext cuerpo_label() throws RecognitionException {
		Cuerpo_labelContext _localctx = new Cuerpo_labelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cuerpo_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ABRIR_LLAVE);
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				contenido_label();
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOOLEANO || _la==TEXTO );
			setState(186);
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

	public static class Nombre_label_reversenameContext extends ParserRuleContext {
		public TerminalNode LABEL_REVERSENAME() { return getToken(JSONParser.LABEL_REVERSENAME, 0); }
		public Nombre_label_reversenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_label_reversename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterNombre_label_reversename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitNombre_label_reversename(this);
		}
	}

	public final Nombre_label_reversenameContext nombre_label_reversename() throws RecognitionException {
		Nombre_label_reversenameContext _localctx = new Nombre_label_reversenameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nombre_label_reversename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LABEL_REVERSENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_reversename_claveContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Label_reversename_claveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_reversename_clave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterLabel_reversename_clave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitLabel_reversename_clave(this);
		}
	}

	public final Label_reversename_claveContext label_reversename_clave() throws RecognitionException {
		Label_reversename_claveContext _localctx = new Label_reversename_claveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_label_reversename_clave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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

	public static class Label_reversename_valorContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Label_reversename_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_reversename_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterLabel_reversename_valor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitLabel_reversename_valor(this);
		}
	}

	public final Label_reversename_valorContext label_reversename_valor() throws RecognitionException {
		Label_reversename_valorContext _localctx = new Label_reversename_valorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_label_reversename_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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

	public static class Contenido_label_reversenameContext extends ParserRuleContext {
		public Label_reversename_claveContext label_reversename_clave() {
			return getRuleContext(Label_reversename_claveContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public Label_reversename_valorContext label_reversename_valor() {
			return getRuleContext(Label_reversename_valorContext.class,0);
		}
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public Contenido_label_reversenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido_label_reversename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterContenido_label_reversename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitContenido_label_reversename(this);
		}
	}

	public final Contenido_label_reversenameContext contenido_label_reversename() throws RecognitionException {
		Contenido_label_reversenameContext _localctx = new Contenido_label_reversenameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contenido_label_reversename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			label_reversename_clave();
			setState(195);
			match(DOSPUNTOS);
			setState(196);
			label_reversename_valor();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(197);
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

	public static class Cuerpo_label_reversenameContext extends ParserRuleContext {
		public TerminalNode ABRIR_LLAVE() { return getToken(JSONParser.ABRIR_LLAVE, 0); }
		public TerminalNode CERRAR_LLAVE() { return getToken(JSONParser.CERRAR_LLAVE, 0); }
		public List<Contenido_label_reversenameContext> contenido_label_reversename() {
			return getRuleContexts(Contenido_label_reversenameContext.class);
		}
		public Contenido_label_reversenameContext contenido_label_reversename(int i) {
			return getRuleContext(Contenido_label_reversenameContext.class,i);
		}
		public Cuerpo_label_reversenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_label_reversename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCuerpo_label_reversename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCuerpo_label_reversename(this);
		}
	}

	public final Cuerpo_label_reversenameContext cuerpo_label_reversename() throws RecognitionException {
		Cuerpo_label_reversenameContext _localctx = new Cuerpo_label_reversenameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cuerpo_label_reversename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ABRIR_LLAVE);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				contenido_label_reversename();
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOOLEANO || _la==TEXTO );
			setState(206);
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
		public Valor_idContext valor_id() {
			return getRuleContext(Valor_idContext.class,0);
		}
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public Kw_nameContext kw_name() {
			return getRuleContext(Kw_nameContext.class,0);
		}
		public Valor_nameContext valor_name() {
			return getRuleContext(Valor_nameContext.class,0);
		}
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
		public Kw_multiplicity_minContext kw_multiplicity_min() {
			return getRuleContext(Kw_multiplicity_minContext.class,0);
		}
		public Valor_multiplicity_minContext valor_multiplicity_min() {
			return getRuleContext(Valor_multiplicity_minContext.class,0);
		}
		public Kw_reverse_nameContext kw_reverse_name() {
			return getRuleContext(Kw_reverse_nameContext.class,0);
		}
		public Valor_reverse_nameContext valor_reverse_name() {
			return getRuleContext(Valor_reverse_nameContext.class,0);
		}
		public Kw_fromContext kw_from() {
			return getRuleContext(Kw_fromContext.class,0);
		}
		public Valor_fromContext valor_from() {
			return getRuleContext(Valor_fromContext.class,0);
		}
		public Kw_toContext kw_to() {
			return getRuleContext(Kw_toContext.class,0);
		}
		public Valor_toContext valor_to() {
			return getRuleContext(Valor_toContext.class,0);
		}
		public Kw_inheritsContext kw_inherits() {
			return getRuleContext(Kw_inheritsContext.class,0);
		}
		public Valor_inheritsContext valor_inherits() {
			return getRuleContext(Valor_inheritsContext.class,0);
		}
		public Valor_atributoContext valor_atributo() {
			return getRuleContext(Valor_atributoContext.class,0);
		}
		public Nombre_atributoContext nombre_atributo() {
			return getRuleContext(Nombre_atributoContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitAtributo(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atributo);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				kw_id();
				setState(209);
				valor_id();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(210);
					match(COMA);
					}
				}

				}
				break;
			case KW_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				kw_name();
				setState(214);
				valor_name();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(215);
					match(COMA);
					}
				}

				}
				break;
			case KW_GENDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				kw_geder();
				setState(219);
				valor_gender();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(220);
					match(COMA);
					}
				}

				}
				break;
			case KW_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				kw_number();
				setState(224);
				valor_number();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(225);
					match(COMA);
					}
				}

				}
				break;
			case KW_WORD_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				kw_word_type();
				setState(229);
				valor_word_type();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(230);
					match(COMA);
					}
				}

				}
				break;
			case KW_TYPE_OF:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				kw_type_of();
				setState(234);
				valor_type_of();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(235);
					match(COMA);
					}
				}

				}
				break;
			case KW_IS_LIST:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				kw_is_list();
				setState(239);
				valor_is_list();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(240);
					match(COMA);
					}
				}

				}
				break;
			case KW_OPTIONAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				kw_optional();
				setState(244);
				valor_optional();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(245);
					match(COMA);
					}
				}

				}
				break;
			case KW_MULTIPLICITY_MAX:
				enterOuterAlt(_localctx, 9);
				{
				setState(248);
				kw_multiplicity_max();
				setState(249);
				valor_multiplicity_max();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(250);
					match(COMA);
					}
				}

				}
				break;
			case KW_MULTIPLICITY_MIN:
				enterOuterAlt(_localctx, 10);
				{
				setState(253);
				kw_multiplicity_min();
				setState(254);
				valor_multiplicity_min();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(255);
					match(COMA);
					}
				}

				}
				break;
			case KW_REVERSE_NAME:
				enterOuterAlt(_localctx, 11);
				{
				setState(258);
				kw_reverse_name();
				setState(259);
				valor_reverse_name();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(260);
					match(COMA);
					}
				}

				}
				break;
			case KW_FROM:
				enterOuterAlt(_localctx, 12);
				{
				setState(263);
				kw_from();
				setState(264);
				valor_from();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(265);
					match(COMA);
					}
				}

				}
				break;
			case KW_TO:
				enterOuterAlt(_localctx, 13);
				{
				setState(268);
				kw_to();
				setState(269);
				valor_to();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(270);
					match(COMA);
					}
				}

				}
				break;
			case KW_INHERITS:
				enterOuterAlt(_localctx, 14);
				{
				setState(273);
				kw_inherits();
				setState(274);
				valor_inherits();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(275);
					match(COMA);
					}
				}

				}
				break;
			case BOOLEANO:
			case TEXTO:
				enterOuterAlt(_localctx, 15);
				{
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(278);
					nombre_atributo();
					setState(279);
					match(DOSPUNTOS);
					}
					break;
				}
				setState(283);
				valor_atributo();
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(284);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterNombre_atributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitNombre_atributo(this);
		}
	}

	public final Nombre_atributoContext nombre_atributo() throws RecognitionException {
		Nombre_atributoContext _localctx = new Nombre_atributoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nombre_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_atributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_atributo(this);
		}
	}

	public final Valor_atributoContext valor_atributo() throws RecognitionException {
		Valor_atributoContext _localctx = new Valor_atributoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public Cuerpo_graphContext cuerpo_graph() {
			return getRuleContext(Cuerpo_graphContext.class,0);
		}
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public Cuerpo_propertiesContext cuerpo_properties() {
			return getRuleContext(Cuerpo_propertiesContext.class,0);
		}
		public ArbolContext arbol() {
			return getRuleContext(ArbolContext.class,0);
		}
		public Cuerpo_treeContext cuerpo_tree() {
			return getRuleContext(Cuerpo_treeContext.class,0);
		}
		public UsedbyContext usedby() {
			return getRuleContext(UsedbyContext.class,0);
		}
		public Cuerpo_usedbyContext cuerpo_usedby() {
			return getRuleContext(Cuerpo_usedbyContext.class,0);
		}
		public LanguajedataContext languajedata() {
			return getRuleContext(LanguajedataContext.class,0);
		}
		public Cuerpo_languagedataContext cuerpo_languagedata() {
			return getRuleContext(Cuerpo_languagedataContext.class,0);
		}
		public Cuerpo_listaContext cuerpo_lista() {
			return getRuleContext(Cuerpo_listaContext.class,0);
		}
		public Nombre_listaContext nombre_lista() {
			return getRuleContext(Nombre_listaContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(JSONParser.DOSPUNTOS, 0); }
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitLista(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lista);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRAPH:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				graph();
				setState(294);
				cuerpo_graph();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(295);
					match(COMA);
					}
				}

				}
				break;
			case PROPERTIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				properties();
				setState(299);
				cuerpo_properties();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(300);
					match(COMA);
					}
				}

				}
				break;
			case TREE:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				arbol();
				setState(304);
				cuerpo_tree();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(305);
					match(COMA);
					}
				}

				}
				break;
			case USEDBY:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				usedby();
				setState(309);
				cuerpo_usedby();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(310);
					match(COMA);
					}
				}

				}
				break;
			case LANGUAGEDATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				languajedata();
				setState(314);
				cuerpo_languagedata();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(315);
					match(COMA);
					}
				}

				}
				break;
			case BOOLEANO:
			case TEXTO:
			case ABRIR_CORCHETE:
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOOLEANO || _la==TEXTO) {
					{
					setState(318);
					nombre_lista();
					setState(319);
					match(DOSPUNTOS);
					}
				}

				setState(323);
				cuerpo_lista();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(324);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterNombre_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitNombre_lista(this);
		}
	}

	public final Nombre_listaContext nombre_lista() throws RecognitionException {
		Nombre_listaContext _localctx = new Nombre_listaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nombre_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCuerpo_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCuerpo_lista(this);
		}
	}

	public final Cuerpo_listaContext cuerpo_lista() throws RecognitionException {
		Cuerpo_listaContext _localctx = new Cuerpo_listaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cuerpo_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(ABRIR_CORCHETE);
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(332);
					objeto();
					}
					break;
				case 2:
					{
					setState(333);
					atributo();
					}
					break;
				case 3:
					{
					setState(334);
					lista();
					}
					break;
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << TREE) | (1L << PROPERTIES) | (1L << USEDBY) | (1L << LANGUAGEDATA) | (1L << KW_ID) | (1L << KW_NAME) | (1L << KW_GENDER) | (1L << KW_NUMBER) | (1L << KW_WORD_TYPE) | (1L << KW_TYPE_OF) | (1L << KW_IS_LIST) | (1L << KW_OPTIONAL) | (1L << KW_MULTIPLICITY_MAX) | (1L << KW_MULTIPLICITY_MIN) | (1L << KW_REVERSE_NAME) | (1L << KW_FROM) | (1L << KW_TO) | (1L << KW_INHERITS) | (1L << LABEL) | (1L << LABEL_REVERSENAME) | (1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE) | (1L << ABRIR_CORCHETE))) != 0) );
			setState(339);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitGraph(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCuerpo_graph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCuerpo_graph(this);
		}
	}

	public final Cuerpo_graphContext cuerpo_graph() throws RecognitionException {
		Cuerpo_graphContext _localctx = new Cuerpo_graphContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cuerpo_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ABRIR_CORCHETE);
			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(344);
				objeto();
				}
				}
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LABEL) | (1L << LABEL_REVERSENAME) | (1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0) );
			setState(349);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitProperties(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_properties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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

	public static class Valor_propertieContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_propertieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_propertie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_propertie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_propertie(this);
		}
	}

	public final Valor_propertieContext valor_propertie() throws RecognitionException {
		Valor_propertieContext _localctx = new Valor_propertieContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valor_propertie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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

	public static class Cuerpo_propertiesContext extends ParserRuleContext {
		public TerminalNode CERRAR_CORCHETE() { return getToken(JSONParser.CERRAR_CORCHETE, 0); }
		public List<Valor_propertieContext> valor_propertie() {
			return getRuleContexts(Valor_propertieContext.class);
		}
		public Valor_propertieContext valor_propertie(int i) {
			return getRuleContext(Valor_propertieContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(JSONParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(JSONParser.COMA, i);
		}
		public Cuerpo_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCuerpo_properties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCuerpo_properties(this);
		}
	}

	public final Cuerpo_propertiesContext cuerpo_properties() throws RecognitionException {
		Cuerpo_propertiesContext _localctx = new Cuerpo_propertiesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cuerpo_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(355);
				valor_propertie();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(356);
					match(COMA);
					}
				}

				}
				}
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOOLEANO || _la==TEXTO );
			setState(363);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterArbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitArbol(this);
		}
	}

	public final ArbolContext arbol() throws RecognitionException {
		ArbolContext _localctx = new ArbolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCuerpo_tree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCuerpo_tree(this);
		}
	}

	public final Cuerpo_treeContext cuerpo_tree() throws RecognitionException {
		Cuerpo_treeContext _localctx = new Cuerpo_treeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cuerpo_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(ABRIR_CORCHETE);
			setState(369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				objeto();
				}
				}
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LABEL) | (1L << LABEL_REVERSENAME) | (1L << ESTADO_CONTEXT) | (1L << BOOLEANO) | (1L << TEXTO) | (1L << ABRIR_LLAVE))) != 0) );
			setState(373);
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

	public static class UsedbyContext extends ParserRuleContext {
		public TerminalNode USEDBY() { return getToken(JSONParser.USEDBY, 0); }
		public UsedbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usedby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterUsedby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitUsedby(this);
		}
	}

	public final UsedbyContext usedby() throws RecognitionException {
		UsedbyContext _localctx = new UsedbyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_usedby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(USEDBY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_usedbyContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode COMA() { return getToken(JSONParser.COMA, 0); }
		public Valor_usedbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_usedby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_usedby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_usedby(this);
		}
	}

	public final Valor_usedbyContext valor_usedby() throws RecognitionException {
		Valor_usedbyContext _localctx = new Valor_usedbyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_valor_usedby);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			cadena();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(378);
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

	public static class Cuerpo_usedbyContext extends ParserRuleContext {
		public TerminalNode ABRIR_CORCHETE() { return getToken(JSONParser.ABRIR_CORCHETE, 0); }
		public TerminalNode CERRAR_CORCHETE() { return getToken(JSONParser.CERRAR_CORCHETE, 0); }
		public List<Valor_usedbyContext> valor_usedby() {
			return getRuleContexts(Valor_usedbyContext.class);
		}
		public Valor_usedbyContext valor_usedby(int i) {
			return getRuleContext(Valor_usedbyContext.class,i);
		}
		public Cuerpo_usedbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_usedby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCuerpo_usedby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCuerpo_usedby(this);
		}
	}

	public final Cuerpo_usedbyContext cuerpo_usedby() throws RecognitionException {
		Cuerpo_usedbyContext _localctx = new Cuerpo_usedbyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cuerpo_usedby);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ABRIR_CORCHETE);
			setState(383); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(382);
				valor_usedby();
				}
				}
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOOLEANO || _la==TEXTO );
			setState(387);
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

	public static class LanguajedataContext extends ParserRuleContext {
		public TerminalNode LANGUAGEDATA() { return getToken(JSONParser.LANGUAGEDATA, 0); }
		public LanguajedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languajedata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterLanguajedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitLanguajedata(this);
		}
	}

	public final LanguajedataContext languajedata() throws RecognitionException {
		LanguajedataContext _localctx = new LanguajedataContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_languajedata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(LANGUAGEDATA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_languagedataContext extends ParserRuleContext {
		public TerminalNode ABRIR_CORCHETE() { return getToken(JSONParser.ABRIR_CORCHETE, 0); }
		public TerminalNode CERRAR_CORCHETE() { return getToken(JSONParser.CERRAR_CORCHETE, 0); }
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public Cuerpo_languagedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_languagedata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCuerpo_languagedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCuerpo_languagedata(this);
		}
	}

	public final Cuerpo_languagedataContext cuerpo_languagedata() throws RecognitionException {
		Cuerpo_languagedataContext _localctx = new Cuerpo_languagedataContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cuerpo_languagedata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(ABRIR_CORCHETE);
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				atributo();
				}
				}
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ID) | (1L << KW_NAME) | (1L << KW_GENDER) | (1L << KW_NUMBER) | (1L << KW_WORD_TYPE) | (1L << KW_TYPE_OF) | (1L << KW_IS_LIST) | (1L << KW_OPTIONAL) | (1L << KW_MULTIPLICITY_MAX) | (1L << KW_MULTIPLICITY_MIN) | (1L << KW_REVERSE_NAME) | (1L << KW_FROM) | (1L << KW_TO) | (1L << KW_INHERITS) | (1L << BOOLEANO) | (1L << TEXTO))) != 0) );
			setState(397);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitCadena(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_id(this);
		}
	}

	public final Kw_idContext kw_id() throws RecognitionException {
		Kw_idContext _localctx = new Kw_idContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_kw_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_id(this);
		}
	}

	public final Valor_idContext valor_id() throws RecognitionException {
		Valor_idContext _localctx = new Valor_idContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_valor_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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

	public static class Kw_nameContext extends ParserRuleContext {
		public TerminalNode KW_NAME() { return getToken(JSONParser.KW_NAME, 0); }
		public Kw_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_name(this);
		}
	}

	public final Kw_nameContext kw_name() throws RecognitionException {
		Kw_nameContext _localctx = new Kw_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kw_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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

	public static class Valor_nameContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_name(this);
		}
	}

	public final Valor_nameContext valor_name() throws RecognitionException {
		Valor_nameContext _localctx = new Valor_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_valor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_geder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_geder(this);
		}
	}

	public final Kw_gederContext kw_geder() throws RecognitionException {
		Kw_gederContext _localctx = new Kw_gederContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_kw_geder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_gender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_gender(this);
		}
	}

	public final Valor_genderContext valor_gender() throws RecognitionException {
		Valor_genderContext _localctx = new Valor_genderContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_valor_gender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_number(this);
		}
	}

	public final Kw_numberContext kw_number() throws RecognitionException {
		Kw_numberContext _localctx = new Kw_numberContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kw_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_number(this);
		}
	}

	public final Valor_numberContext valor_number() throws RecognitionException {
		Valor_numberContext _localctx = new Valor_numberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_valor_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_word_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_word_type(this);
		}
	}

	public final Kw_word_typeContext kw_word_type() throws RecognitionException {
		Kw_word_typeContext _localctx = new Kw_word_typeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_kw_word_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_word_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_word_type(this);
		}
	}

	public final Valor_word_typeContext valor_word_type() throws RecognitionException {
		Valor_word_typeContext _localctx = new Valor_word_typeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_valor_word_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_type_of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_type_of(this);
		}
	}

	public final Kw_type_ofContext kw_type_of() throws RecognitionException {
		Kw_type_ofContext _localctx = new Kw_type_ofContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_kw_type_of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_type_of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_type_of(this);
		}
	}

	public final Valor_type_ofContext valor_type_of() throws RecognitionException {
		Valor_type_ofContext _localctx = new Valor_type_ofContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_valor_type_of);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_is_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_is_list(this);
		}
	}

	public final Kw_is_listContext kw_is_list() throws RecognitionException {
		Kw_is_listContext _localctx = new Kw_is_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_kw_is_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_is_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_is_list(this);
		}
	}

	public final Valor_is_listContext valor_is_list() throws RecognitionException {
		Valor_is_listContext _localctx = new Valor_is_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_valor_is_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_optional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_optional(this);
		}
	}

	public final Kw_optionalContext kw_optional() throws RecognitionException {
		Kw_optionalContext _localctx = new Kw_optionalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_kw_optional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_optional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_optional(this);
		}
	}

	public final Valor_optionalContext valor_optional() throws RecognitionException {
		Valor_optionalContext _localctx = new Valor_optionalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_valor_optional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_multiplicity_max(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_multiplicity_max(this);
		}
	}

	public final Kw_multiplicity_maxContext kw_multiplicity_max() throws RecognitionException {
		Kw_multiplicity_maxContext _localctx = new Kw_multiplicity_maxContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_kw_multiplicity_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_multiplicity_max(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_multiplicity_max(this);
		}
	}

	public final Valor_multiplicity_maxContext valor_multiplicity_max() throws RecognitionException {
		Valor_multiplicity_maxContext _localctx = new Valor_multiplicity_maxContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_valor_multiplicity_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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

	public static class Kw_multiplicity_minContext extends ParserRuleContext {
		public TerminalNode KW_MULTIPLICITY_MIN() { return getToken(JSONParser.KW_MULTIPLICITY_MIN, 0); }
		public Kw_multiplicity_minContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_multiplicity_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_multiplicity_min(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_multiplicity_min(this);
		}
	}

	public final Kw_multiplicity_minContext kw_multiplicity_min() throws RecognitionException {
		Kw_multiplicity_minContext _localctx = new Kw_multiplicity_minContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_kw_multiplicity_min);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(KW_MULTIPLICITY_MIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_multiplicity_minContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_multiplicity_minContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_multiplicity_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_multiplicity_min(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_multiplicity_min(this);
		}
	}

	public final Valor_multiplicity_minContext valor_multiplicity_min() throws RecognitionException {
		Valor_multiplicity_minContext _localctx = new Valor_multiplicity_minContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_valor_multiplicity_min);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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

	public static class Kw_reverse_nameContext extends ParserRuleContext {
		public TerminalNode KW_REVERSE_NAME() { return getToken(JSONParser.KW_REVERSE_NAME, 0); }
		public Kw_reverse_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_reverse_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_reverse_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_reverse_name(this);
		}
	}

	public final Kw_reverse_nameContext kw_reverse_name() throws RecognitionException {
		Kw_reverse_nameContext _localctx = new Kw_reverse_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_kw_reverse_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(KW_REVERSE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_reverse_nameContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_reverse_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_reverse_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_reverse_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_reverse_name(this);
		}
	}

	public final Valor_reverse_nameContext valor_reverse_name() throws RecognitionException {
		Valor_reverse_nameContext _localctx = new Valor_reverse_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_valor_reverse_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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

	public static class Kw_fromContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(JSONParser.KW_FROM, 0); }
		public Kw_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_from(this);
		}
	}

	public final Kw_fromContext kw_from() throws RecognitionException {
		Kw_fromContext _localctx = new Kw_fromContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_kw_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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

	public static class Valor_fromContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_from(this);
		}
	}

	public final Valor_fromContext valor_from() throws RecognitionException {
		Valor_fromContext _localctx = new Valor_fromContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_valor_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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

	public static class Kw_toContext extends ParserRuleContext {
		public TerminalNode KW_TO() { return getToken(JSONParser.KW_TO, 0); }
		public Kw_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_to(this);
		}
	}

	public final Kw_toContext kw_to() throws RecognitionException {
		Kw_toContext _localctx = new Kw_toContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_kw_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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

	public static class Kw_inheritsContext extends ParserRuleContext {
		public TerminalNode KW_INHERITS() { return getToken(JSONParser.KW_INHERITS, 0); }
		public Kw_inheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inherits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterKw_inherits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitKw_inherits(this);
		}
	}

	public final Kw_inheritsContext kw_inherits() throws RecognitionException {
		Kw_inheritsContext _localctx = new Kw_inheritsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_kw_inherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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

	public static class Valor_inheritsContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_inheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_inherits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_inherits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_inherits(this);
		}
	}

	public final Valor_inheritsContext valor_inherits() throws RecognitionException {
		Valor_inheritsContext _localctx = new Valor_inheritsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_valor_inherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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

	public static class Valor_toContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Valor_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValor_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValor_to(this);
		}
	}

	public final Valor_toContext valor_to() throws RecognitionException {
		Valor_toContext _localctx = new Valor_toContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_valor_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterEstado_context(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitEstado_context(this);
		}
	}

	public final Estado_contextContext estado_context() throws RecognitionException {
		Estado_contextContext _localctx = new Estado_contextContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_estado_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(ESTADO_CONTEXT);
			setState(458);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u01cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\3\3\3\5\3\u0087\n"+
		"\3\3\3\3\3\5\3\u008b\n\3\3\3\5\3\u008e\n\3\3\3\3\3\5\3\u0092\n\3\3\3\3"+
		"\3\3\3\5\3\u0097\n\3\3\3\3\3\5\3\u009b\n\3\5\3\u009d\n\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\6\5\u00a5\n\5\r\5\16\5\u00a6\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\n\3\n\6\n\u00b9\n\n\r\n\16\n\u00ba"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00c9\n\16"+
		"\3\17\3\17\6\17\u00cd\n\17\r\17\16\17\u00ce\3\17\3\17\3\20\3\20\3\20\5"+
		"\20\u00d6\n\20\3\20\3\20\3\20\5\20\u00db\n\20\3\20\3\20\3\20\5\20\u00e0"+
		"\n\20\3\20\3\20\3\20\5\20\u00e5\n\20\3\20\3\20\3\20\5\20\u00ea\n\20\3"+
		"\20\3\20\3\20\5\20\u00ef\n\20\3\20\3\20\3\20\5\20\u00f4\n\20\3\20\3\20"+
		"\3\20\5\20\u00f9\n\20\3\20\3\20\3\20\5\20\u00fe\n\20\3\20\3\20\3\20\5"+
		"\20\u0103\n\20\3\20\3\20\3\20\5\20\u0108\n\20\3\20\3\20\3\20\5\20\u010d"+
		"\n\20\3\20\3\20\3\20\5\20\u0112\n\20\3\20\3\20\3\20\5\20\u0117\n\20\3"+
		"\20\3\20\3\20\5\20\u011c\n\20\3\20\3\20\5\20\u0120\n\20\5\20\u0122\n\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u012b\n\23\3\23\3\23\3\23\5\23"+
		"\u0130\n\23\3\23\3\23\3\23\5\23\u0135\n\23\3\23\3\23\3\23\5\23\u013a\n"+
		"\23\3\23\3\23\3\23\5\23\u013f\n\23\3\23\3\23\3\23\5\23\u0144\n\23\3\23"+
		"\3\23\5\23\u0148\n\23\5\23\u014a\n\23\3\24\3\24\3\25\3\25\3\25\3\25\6"+
		"\25\u0152\n\25\r\25\16\25\u0153\3\25\3\25\3\26\3\26\3\27\3\27\6\27\u015c"+
		"\n\27\r\27\16\27\u015d\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u0168"+
		"\n\32\6\32\u016a\n\32\r\32\16\32\u016b\3\32\3\32\3\33\3\33\3\34\3\34\6"+
		"\34\u0174\n\34\r\34\16\34\u0175\3\34\3\34\3\35\3\35\3\36\3\36\5\36\u017e"+
		"\n\36\3\37\3\37\6\37\u0182\n\37\r\37\16\37\u0183\3\37\3\37\3 \3 \3!\3"+
		"!\6!\u018c\n!\r!\16!\u018d\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\2\2@\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|\2\3\3\2\31\32\2\u01d5\2\u0081\3\2\2\2\4\u009c\3\2\2\2\6\u009e\3"+
		"\2\2\2\b\u00a0\3\2\2\2\n\u00aa\3\2\2\2\f\u00ac\3\2\2\2\16\u00ae\3\2\2"+
		"\2\20\u00b0\3\2\2\2\22\u00b6\3\2\2\2\24\u00be\3\2\2\2\26\u00c0\3\2\2\2"+
		"\30\u00c2\3\2\2\2\32\u00c4\3\2\2\2\34\u00ca\3\2\2\2\36\u0121\3\2\2\2 "+
		"\u0123\3\2\2\2\"\u0125\3\2\2\2$\u0149\3\2\2\2&\u014b\3\2\2\2(\u014d\3"+
		"\2\2\2*\u0157\3\2\2\2,\u0159\3\2\2\2.\u0161\3\2\2\2\60\u0163\3\2\2\2\62"+
		"\u0169\3\2\2\2\64\u016f\3\2\2\2\66\u0171\3\2\2\28\u0179\3\2\2\2:\u017b"+
		"\3\2\2\2<\u017f\3\2\2\2>\u0187\3\2\2\2@\u0189\3\2\2\2B\u0191\3\2\2\2D"+
		"\u0193\3\2\2\2F\u0195\3\2\2\2H\u0197\3\2\2\2J\u0199\3\2\2\2L\u019b\3\2"+
		"\2\2N\u019d\3\2\2\2P\u019f\3\2\2\2R\u01a1\3\2\2\2T\u01a3\3\2\2\2V\u01a5"+
		"\3\2\2\2X\u01a7\3\2\2\2Z\u01a9\3\2\2\2\\\u01ab\3\2\2\2^\u01ad\3\2\2\2"+
		"`\u01af\3\2\2\2b\u01b1\3\2\2\2d\u01b3\3\2\2\2f\u01b5\3\2\2\2h\u01b7\3"+
		"\2\2\2j\u01b9\3\2\2\2l\u01bb\3\2\2\2n\u01bd\3\2\2\2p\u01bf\3\2\2\2r\u01c1"+
		"\3\2\2\2t\u01c3\3\2\2\2v\u01c5\3\2\2\2x\u01c7\3\2\2\2z\u01c9\3\2\2\2|"+
		"\u01cb\3\2\2\2~\u0080\5\4\3\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\3\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u009d\5|?\2\u0085\u0087\5\n\6\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2"+
		"\2\u0087\u0088\3\2\2\2\u0088\u008a\5\22\n\2\u0089\u008b\7\37\2\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u009d\3\2\2\2\u008c\u008e\5\24"+
		"\13\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\5\34\17\2\u0090\u0092\7\37\2\2\u0091\u0090\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u009d\3\2\2\2\u0093\u0094\5\6\4\2\u0094\u0095\7 \2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009a\5\b\5\2\u0099\u009b\7\37\2\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u0084\3\2\2\2\u009c\u0086\3\2"+
		"\2\2\u009c\u008d\3\2\2\2\u009c\u0096\3\2\2\2\u009d\5\3\2\2\2\u009e\u009f"+
		"\5B\"\2\u009f\7\3\2\2\2\u00a0\u00a4\7\33\2\2\u00a1\u00a5\5\4\3\2\u00a2"+
		"\u00a5\5\36\20\2\u00a3\u00a5\5$\23\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\34\2\2\u00a9\t\3\2\2"+
		"\2\u00aa\u00ab\7\26\2\2\u00ab\13\3\2\2\2\u00ac\u00ad\5B\"\2\u00ad\r\3"+
		"\2\2\2\u00ae\u00af\5B\"\2\u00af\17\3\2\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2"+
		"\7 \2\2\u00b2\u00b4\5\16\b\2\u00b3\u00b5\7\37\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\21\3\2\2\2\u00b6\u00b8\7\33\2\2\u00b7\u00b9"+
		"\5\20\t\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\34\2\2\u00bd\23"+
		"\3\2\2\2\u00be\u00bf\7\27\2\2\u00bf\25\3\2\2\2\u00c0\u00c1\5B\"\2\u00c1"+
		"\27\3\2\2\2\u00c2\u00c3\5B\"\2\u00c3\31\3\2\2\2\u00c4\u00c5\5\26\f\2\u00c5"+
		"\u00c6\7 \2\2\u00c6\u00c8\5\30\r\2\u00c7\u00c9\7\37\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\33\3\2\2\2\u00ca\u00cc\7\33\2\2\u00cb"+
		"\u00cd\5\32\16\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\34\2\2\u00d1"+
		"\35\3\2\2\2\u00d2\u00d3\5D#\2\u00d3\u00d5\5F$\2\u00d4\u00d6\7\37\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u0122\3\2\2\2\u00d7\u00d8\5H"+
		"%\2\u00d8\u00da\5J&\2\u00d9\u00db\7\37\2\2\u00da\u00d9\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u0122\3\2\2\2\u00dc\u00dd\5L\'\2\u00dd\u00df\5N(\2\u00de"+
		"\u00e0\7\37\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u0122\3"+
		"\2\2\2\u00e1\u00e2\5P)\2\u00e2\u00e4\5R*\2\u00e3\u00e5\7\37\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u0122\3\2\2\2\u00e6\u00e7\5T"+
		"+\2\u00e7\u00e9\5V,\2\u00e8\u00ea\7\37\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u0122\3\2\2\2\u00eb\u00ec\5X-\2\u00ec\u00ee\5Z.\2\u00ed"+
		"\u00ef\7\37\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u0122\3"+
		"\2\2\2\u00f0\u00f1\5\\/\2\u00f1\u00f3\5^\60\2\u00f2\u00f4\7\37\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u0122\3\2\2\2\u00f5\u00f6\5`"+
		"\61\2\u00f6\u00f8\5b\62\2\u00f7\u00f9\7\37\2\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u0122\3\2\2\2\u00fa\u00fb\5d\63\2\u00fb\u00fd\5f"+
		"\64\2\u00fc\u00fe\7\37\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0122\3\2\2\2\u00ff\u0100\5h\65\2\u0100\u0102\5j\66\2\u0101\u0103\7\37"+
		"\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0122\3\2\2\2\u0104"+
		"\u0105\5l\67\2\u0105\u0107\5n8\2\u0106\u0108\7\37\2\2\u0107\u0106\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0122\3\2\2\2\u0109\u010a\5p9\2\u010a\u010c"+
		"\5r:\2\u010b\u010d\7\37\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0122\3\2\2\2\u010e\u010f\5t;\2\u010f\u0111\5z>\2\u0110\u0112\7\37\2"+
		"\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0122\3\2\2\2\u0113\u0114"+
		"\5v<\2\u0114\u0116\5x=\2\u0115\u0117\7\37\2\2\u0116\u0115\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0122\3\2\2\2\u0118\u0119\5 \21\2\u0119\u011a\7 "+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\5\"\22\2\u011e\u0120\7\37\2\2\u011f\u011e\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u00d2\3\2\2\2\u0121"+
		"\u00d7\3\2\2\2\u0121\u00dc\3\2\2\2\u0121\u00e1\3\2\2\2\u0121\u00e6\3\2"+
		"\2\2\u0121\u00eb\3\2\2\2\u0121\u00f0\3\2\2\2\u0121\u00f5\3\2\2\2\u0121"+
		"\u00fa\3\2\2\2\u0121\u00ff\3\2\2\2\u0121\u0104\3\2\2\2\u0121\u0109\3\2"+
		"\2\2\u0121\u010e\3\2\2\2\u0121\u0113\3\2\2\2\u0121\u011b\3\2\2\2\u0122"+
		"\37\3\2\2\2\u0123\u0124\5B\"\2\u0124!\3\2\2\2\u0125\u0126\5B\"\2\u0126"+
		"#\3\2\2\2\u0127\u0128\5*\26\2\u0128\u012a\5,\27\2\u0129\u012b\7\37\2\2"+
		"\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u014a\3\2\2\2\u012c\u012d"+
		"\5.\30\2\u012d\u012f\5\62\32\2\u012e\u0130\7\37\2\2\u012f\u012e\3\2\2"+
		"\2\u012f\u0130\3\2\2\2\u0130\u014a\3\2\2\2\u0131\u0132\5\64\33\2\u0132"+
		"\u0134\5\66\34\2\u0133\u0135\7\37\2\2\u0134\u0133\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u014a\3\2\2\2\u0136\u0137\58\35\2\u0137\u0139\5<\37\2\u0138"+
		"\u013a\7\37\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u014a\3"+
		"\2\2\2\u013b\u013c\5> \2\u013c\u013e\5@!\2\u013d\u013f\7\37\2\2\u013e"+
		"\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u014a\3\2\2\2\u0140\u0141\5&"+
		"\24\2\u0141\u0142\7 \2\2\u0142\u0144\3\2\2\2\u0143\u0140\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\5(\25\2\u0146\u0148\7\37"+
		"\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0127\3\2\2\2\u0149\u012c\3\2\2\2\u0149\u0131\3\2\2\2\u0149\u0136\3\2"+
		"\2\2\u0149\u013b\3\2\2\2\u0149\u0143\3\2\2\2\u014a%\3\2\2\2\u014b\u014c"+
		"\5B\"\2\u014c\'\3\2\2\2\u014d\u0151\7\35\2\2\u014e\u0152\5\4\3\2\u014f"+
		"\u0152\5\36\20\2\u0150\u0152\5$\23\2\u0151\u014e\3\2\2\2\u0151\u014f\3"+
		"\2\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\36\2\2\u0156)\3\2\2\2"+
		"\u0157\u0158\7\3\2\2\u0158+\3\2\2\2\u0159\u015b\7\35\2\2\u015a\u015c\5"+
		"\4\3\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\36\2\2\u0160-\3\2\2\2"+
		"\u0161\u0162\7\5\2\2\u0162/\3\2\2\2\u0163\u0164\5B\"\2\u0164\61\3\2\2"+
		"\2\u0165\u0167\5\60\31\2\u0166\u0168\7\37\2\2\u0167\u0166\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0165\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\7\36\2\2\u016e\63\3\2\2\2\u016f\u0170\7\4\2\2\u0170\65\3\2\2\2"+
		"\u0171\u0173\7\35\2\2\u0172\u0174\5\4\3\2\u0173\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0178\7\36\2\2\u0178\67\3\2\2\2\u0179\u017a\7\6\2\2\u017a9\3\2\2\2\u017b"+
		"\u017d\5B\"\2\u017c\u017e\7\37\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e;\3\2\2\2\u017f\u0181\7\35\2\2\u0180\u0182\5:\36\2\u0181\u0180"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\7\36\2\2\u0186=\3\2\2\2\u0187\u0188\7\7\2\2"+
		"\u0188?\3\2\2\2\u0189\u018b\7\35\2\2\u018a\u018c\5\36\20\2\u018b\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0190\7\36\2\2\u0190A\3\2\2\2\u0191\u0192\t\2\2\2"+
		"\u0192C\3\2\2\2\u0193\u0194\7\b\2\2\u0194E\3\2\2\2\u0195\u0196\5B\"\2"+
		"\u0196G\3\2\2\2\u0197\u0198\7\t\2\2\u0198I\3\2\2\2\u0199\u019a\5B\"\2"+
		"\u019aK\3\2\2\2\u019b\u019c\7\n\2\2\u019cM\3\2\2\2\u019d\u019e\5B\"\2"+
		"\u019eO\3\2\2\2\u019f\u01a0\7\13\2\2\u01a0Q\3\2\2\2\u01a1\u01a2\5B\"\2"+
		"\u01a2S\3\2\2\2\u01a3\u01a4\7\f\2\2\u01a4U\3\2\2\2\u01a5\u01a6\5B\"\2"+
		"\u01a6W\3\2\2\2\u01a7\u01a8\7\r\2\2\u01a8Y\3\2\2\2\u01a9\u01aa\5B\"\2"+
		"\u01aa[\3\2\2\2\u01ab\u01ac\7\16\2\2\u01ac]\3\2\2\2\u01ad\u01ae\5B\"\2"+
		"\u01ae_\3\2\2\2\u01af\u01b0\7\17\2\2\u01b0a\3\2\2\2\u01b1\u01b2\5B\"\2"+
		"\u01b2c\3\2\2\2\u01b3\u01b4\7\20\2\2\u01b4e\3\2\2\2\u01b5\u01b6\5B\"\2"+
		"\u01b6g\3\2\2\2\u01b7\u01b8\7\21\2\2\u01b8i\3\2\2\2\u01b9\u01ba\5B\"\2"+
		"\u01bak\3\2\2\2\u01bb\u01bc\7\22\2\2\u01bcm\3\2\2\2\u01bd\u01be\5B\"\2"+
		"\u01beo\3\2\2\2\u01bf\u01c0\7\23\2\2\u01c0q\3\2\2\2\u01c1\u01c2\5B\"\2"+
		"\u01c2s\3\2\2\2\u01c3\u01c4\7\24\2\2\u01c4u\3\2\2\2\u01c5\u01c6\7\25\2"+
		"\2\u01c6w\3\2\2\2\u01c7\u01c8\5B\"\2\u01c8y\3\2\2\2\u01c9\u01ca\5B\"\2"+
		"\u01ca{\3\2\2\2\u01cb\u01cc\7\30\2\2\u01cc\u01cd\7\"\2\2\u01cd}\3\2\2"+
		"\2\62\u0081\u0086\u008a\u008d\u0091\u0096\u009a\u009c\u00a4\u00a6\u00b4"+
		"\u00ba\u00c8\u00ce\u00d5\u00da\u00df\u00e4\u00e9\u00ee\u00f3\u00f8\u00fd"+
		"\u0102\u0107\u010c\u0111\u0116\u011b\u011f\u0121\u012a\u012f\u0134\u0139"+
		"\u013e\u0143\u0147\u0149\u0151\u0153\u015d\u0167\u016b\u0175\u017d\u0183"+
		"\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}