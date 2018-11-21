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
		OPEN_OBJ=1, CLOS_OBJ=2, OPEN_LIS=3, CLOS_LIS=4, END=5, NAME=6, COL=7, 
		TRASH=8;
	public static final int
		RULE_init = 0, RULE_obj = 1, RULE_lis = 2, RULE_prop = 3, RULE_col = 4, 
		RULE_name = 5, RULE_open_lis = 6, RULE_clos_lis = 7, RULE_open_obj = 8, 
		RULE_clos_obj = 9, RULE_end = 10;
	public static final String[] ruleNames = {
		"init", "obj", "lis", "prop", "col", "name", "open_lis", "clos_lis", "open_obj", 
		"clos_obj", "end"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "','", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_OBJ", "CLOS_OBJ", "OPEN_LIS", "CLOS_LIS", "END", "NAME", "COL", 
		"TRASH"
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
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitInit(this);
		}
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
			while (_la==OPEN_OBJ || _la==NAME) {
				{
				{
				setState(22);
				obj();
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

	public static class ObjContext extends ParserRuleContext {
		public Open_objContext open_obj() {
			return getRuleContext(Open_objContext.class,0);
		}
		public Clos_objContext clos_obj() {
			return getRuleContext(Clos_objContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ColContext col() {
			return getRuleContext(ColContext.class,0);
		}
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public List<LisContext> lis() {
			return getRuleContexts(LisContext.class);
		}
		public LisContext lis(int i) {
			return getRuleContext(LisContext.class,i);
		}
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(28);
				name();
				setState(29);
				col();
				}
			}

			setState(33);
			open_obj();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_OBJ) | (1L << OPEN_LIS) | (1L << NAME))) != 0)) {
				{
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(34);
					obj();
					}
					break;
				case 2:
					{
					setState(35);
					lis();
					}
					break;
				case 3:
					{
					setState(36);
					prop();
					}
					break;
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			clos_obj();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(43);
				end();
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

	public static class LisContext extends ParserRuleContext {
		public Open_lisContext open_lis() {
			return getRuleContext(Open_lisContext.class,0);
		}
		public Clos_lisContext clos_lis() {
			return getRuleContext(Clos_lisContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public ColContext col() {
			return getRuleContext(ColContext.class,0);
		}
		public List<LisContext> lis() {
			return getRuleContexts(LisContext.class);
		}
		public LisContext lis(int i) {
			return getRuleContext(LisContext.class,i);
		}
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public LisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterLis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitLis(this);
		}
	}

	public final LisContext lis() throws RecognitionException {
		LisContext _localctx = new LisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(46);
				name();
				setState(47);
				col();
				}
			}

			setState(51);
			open_lis();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_OBJ) | (1L << OPEN_LIS) | (1L << NAME))) != 0)) {
				{
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					{
					setState(52);
					name();
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==END) {
						{
						setState(53);
						end();
						}
					}

					}
					}
					break;
				case 2:
					{
					setState(56);
					lis();
					}
					break;
				case 3:
					{
					setState(57);
					obj();
					}
					break;
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			clos_lis();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(64);
				end();
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
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public ColContext col() {
			return getRuleContext(ColContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitProp(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			name();
			setState(68);
			col();
			setState(69);
			name();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(70);
				end();
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

	public static class ColContext extends ParserRuleContext {
		public TerminalNode COL() { return getToken(JsonParser.COL, 0); }
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitCol(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(COL);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> NAME() { return getTokens(JsonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JsonParser.NAME, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(75);
					match(NAME);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(78); 
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

	public static class Open_lisContext extends ParserRuleContext {
		public TerminalNode OPEN_LIS() { return getToken(JsonParser.OPEN_LIS, 0); }
		public Open_lisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_lis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterOpen_lis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitOpen_lis(this);
		}
	}

	public final Open_lisContext open_lis() throws RecognitionException {
		Open_lisContext _localctx = new Open_lisContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_open_lis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(OPEN_LIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Clos_lisContext extends ParserRuleContext {
		public TerminalNode CLOS_LIS() { return getToken(JsonParser.CLOS_LIS, 0); }
		public Clos_lisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clos_lis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterClos_lis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitClos_lis(this);
		}
	}

	public final Clos_lisContext clos_lis() throws RecognitionException {
		Clos_lisContext _localctx = new Clos_lisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_clos_lis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CLOS_LIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_objContext extends ParserRuleContext {
		public TerminalNode OPEN_OBJ() { return getToken(JsonParser.OPEN_OBJ, 0); }
		public Open_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterOpen_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitOpen_obj(this);
		}
	}

	public final Open_objContext open_obj() throws RecognitionException {
		Open_objContext _localctx = new Open_objContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_open_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(OPEN_OBJ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Clos_objContext extends ParserRuleContext {
		public TerminalNode CLOS_OBJ() { return getToken(JsonParser.CLOS_OBJ, 0); }
		public Clos_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clos_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterClos_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitClos_obj(this);
		}
	}

	public final Clos_objContext clos_obj() throws RecognitionException {
		Clos_objContext _localctx = new Clos_objContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_clos_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(CLOS_OBJ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(JsonParser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonParserListener ) ((JsonParserListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(END);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3"+
		"\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\5\4\64\n\4"+
		"\3\4\3\4\3\4\5\49\n\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\5\4D\n\4"+
		"\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\7\6\7O\n\7\r\7\16\7P\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2"+
		"\2_\2\33\3\2\2\2\4!\3\2\2\2\6\63\3\2\2\2\bE\3\2\2\2\nK\3\2\2\2\fN\3\2"+
		"\2\2\16R\3\2\2\2\20T\3\2\2\2\22V\3\2\2\2\24X\3\2\2\2\26Z\3\2\2\2\30\32"+
		"\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3"+
		"\3\2\2\2\35\33\3\2\2\2\36\37\5\f\7\2\37 \5\n\6\2 \"\3\2\2\2!\36\3\2\2"+
		"\2!\"\3\2\2\2\"#\3\2\2\2#)\5\22\n\2$(\5\4\3\2%(\5\6\4\2&(\5\b\5\2\'$\3"+
		"\2\2\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2"+
		"+)\3\2\2\2,.\5\24\13\2-/\5\26\f\2.-\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60\61"+
		"\5\f\7\2\61\62\5\n\6\2\62\64\3\2\2\2\63\60\3\2\2\2\63\64\3\2\2\2\64\65"+
		"\3\2\2\2\65>\5\16\b\2\668\5\f\7\2\679\5\26\f\28\67\3\2\2\289\3\2\2\29"+
		"=\3\2\2\2:=\5\6\4\2;=\5\4\3\2<\66\3\2\2\2<:\3\2\2\2<;\3\2\2\2=@\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AC\5\20\t\2BD\5\26\f\2CB\3\2"+
		"\2\2CD\3\2\2\2D\7\3\2\2\2EF\5\f\7\2FG\5\n\6\2GI\5\f\7\2HJ\5\26\f\2IH\3"+
		"\2\2\2IJ\3\2\2\2J\t\3\2\2\2KL\7\t\2\2L\13\3\2\2\2MO\7\b\2\2NM\3\2\2\2"+
		"OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RS\7\5\2\2S\17\3\2\2\2TU\7\6"+
		"\2\2U\21\3\2\2\2VW\7\3\2\2W\23\3\2\2\2XY\7\4\2\2Y\25\3\2\2\2Z[\7\7\2\2"+
		"[\27\3\2\2\2\16\33!\').\638<>CIP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}