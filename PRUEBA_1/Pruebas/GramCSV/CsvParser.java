// Generated from CsvParser.g4 by ANTLR 4.7.1
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
		COMA=1, INTRO=2, BARRA=3, JSON_EXTENSION=4, DOT_EXTENSION=5, SVG_EXTENSION=6, 
		FILE=7, TEXTO=8, CADENA=9, COMILLAS=10;
	public static final int
		RULE_init = 0, RULE_info = 1, RULE_row = 2, RULE_dir = 3, RULE_json_file = 4, 
		RULE_svg_file = 5, RULE_dot_file = 6, RULE_coma = 7, RULE_end = 8, RULE_filename = 9, 
		RULE_json_extension = 10, RULE_svg_extension = 11, RULE_dot_extension = 12, 
		RULE_rutafichero = 13, RULE_rutaficherosalida = 14, RULE_rutaficherografico = 15, 
		RULE_comillas = 16, RULE_columna = 17;
	public static final String[] ruleNames = {
		"init", "info", "row", "dir", "json_file", "svg_file", "dot_file", "coma", 
		"end", "filename", "json_extension", "svg_extension", "dot_extension", 
		"rutafichero", "rutaficherosalida", "rutaficherografico", "comillas", 
		"columna"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, "'.json'", "'.dot'", "'.svg'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMA", "INTRO", "BARRA", "JSON_EXTENSION", "DOT_EXTENSION", "SVG_EXTENSION", 
		"FILE", "TEXTO", "CADENA", "COMILLAS"
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
	public static class InitContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			info();
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				row();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMA) | (1L << INTRO) | (1L << TEXTO) | (1L << CADENA))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfoContext extends ParserRuleContext {
		public List<DirContext> dir() {
			return getRuleContexts(DirContext.class);
		}
		public DirContext dir(int i) {
			return getRuleContext(DirContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitInfo(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(42);
			dir();
			setState(43);
			coma();
			setState(44);
			dir();
			setState(45);
			coma();
			setState(46);
			dir();
			setState(47);
			coma();
			setState(48);
			dir();
			setState(49);
			end();
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

	public static class RowContext extends ParserRuleContext {
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public List<RutaficheroContext> rutafichero() {
			return getRuleContexts(RutaficheroContext.class);
		}
		public RutaficheroContext rutafichero(int i) {
			return getRuleContext(RutaficheroContext.class,i);
		}
		public List<RutaficherosalidaContext> rutaficherosalida() {
			return getRuleContexts(RutaficherosalidaContext.class);
		}
		public RutaficherosalidaContext rutaficherosalida(int i) {
			return getRuleContext(RutaficherosalidaContext.class,i);
		}
		public List<RutaficherograficoContext> rutaficherografico() {
			return getRuleContexts(RutaficherograficoContext.class);
		}
		public RutaficherograficoContext rutaficherografico(int i) {
			return getRuleContext(RutaficherograficoContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			columna();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(52);
				coma();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(53);
					rutafichero();
					}
					break;
				case 2:
					{
					setState(54);
					rutaficherosalida();
					}
					break;
				case 3:
					{
					setState(55);
					rutaficherografico();
					}
					break;
				case 4:
					{
					setState(56);
					columna();
					}
					break;
				}
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirContext extends ParserRuleContext {
		public List<TerminalNode> FILE() { return getTokens(CsvParser.FILE); }
		public TerminalNode FILE(int i) {
			return getToken(CsvParser.FILE, i);
		}
		public List<TerminalNode> BARRA() { return getTokens(CsvParser.BARRA); }
		public TerminalNode BARRA(int i) {
			return getToken(CsvParser.BARRA, i);
		}
		public DirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitDir(this);
		}
	}

	public final DirContext dir() throws RecognitionException {
		DirContext _localctx = new DirContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dir);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					match(FILE);
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BARRA) {
						{
						setState(67);
						match(BARRA);
						}
					}

					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Json_fileContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Json_extensionContext json_extension() {
			return getRuleContext(Json_extensionContext.class,0);
		}
		public Json_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterJson_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitJson_file(this);
		}
	}

	public final Json_fileContext json_file() throws RecognitionException {
		Json_fileContext _localctx = new Json_fileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_json_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(75);
				filename();
				setState(76);
				json_extension();
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

	public static class Svg_fileContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Svg_extensionContext svg_extension() {
			return getRuleContext(Svg_extensionContext.class,0);
		}
		public Svg_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svg_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterSvg_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitSvg_file(this);
		}
	}

	public final Svg_fileContext svg_file() throws RecognitionException {
		Svg_fileContext _localctx = new Svg_fileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_svg_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(80);
				filename();
				setState(81);
				svg_extension();
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

	public static class Dot_fileContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Dot_extensionContext dot_extension() {
			return getRuleContext(Dot_extensionContext.class,0);
		}
		public Dot_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterDot_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitDot_file(this);
		}
	}

	public final Dot_fileContext dot_file() throws RecognitionException {
		Dot_fileContext _localctx = new Dot_fileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dot_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(85);
				filename();
				setState(86);
				dot_extension();
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(CsvParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode INTRO() { return getToken(CsvParser.INTRO, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(CsvParser.FILE, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitFilename(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(FILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_extensionContext extends ParserRuleContext {
		public TerminalNode JSON_EXTENSION() { return getToken(CsvParser.JSON_EXTENSION, 0); }
		public Json_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterJson_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitJson_extension(this);
		}
	}

	public final Json_extensionContext json_extension() throws RecognitionException {
		Json_extensionContext _localctx = new Json_extensionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_json_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSON_EXTENSION) {
				{
				setState(96);
				match(JSON_EXTENSION);
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

	public static class Svg_extensionContext extends ParserRuleContext {
		public TerminalNode SVG_EXTENSION() { return getToken(CsvParser.SVG_EXTENSION, 0); }
		public Svg_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svg_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterSvg_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitSvg_extension(this);
		}
	}

	public final Svg_extensionContext svg_extension() throws RecognitionException {
		Svg_extensionContext _localctx = new Svg_extensionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_svg_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SVG_EXTENSION) {
				{
				setState(99);
				match(SVG_EXTENSION);
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

	public static class Dot_extensionContext extends ParserRuleContext {
		public TerminalNode DOT_EXTENSION() { return getToken(CsvParser.DOT_EXTENSION, 0); }
		public Dot_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterDot_extension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitDot_extension(this);
		}
	}

	public final Dot_extensionContext dot_extension() throws RecognitionException {
		Dot_extensionContext _localctx = new Dot_extensionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dot_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_EXTENSION) {
				{
				setState(102);
				match(DOT_EXTENSION);
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

	public static class RutaficheroContext extends ParserRuleContext {
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public Json_fileContext json_file() {
			return getRuleContext(Json_fileContext.class,0);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public RutaficheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutafichero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterRutafichero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitRutafichero(this);
		}
	}

	public final RutaficheroContext rutafichero() throws RecognitionException {
		RutaficheroContext _localctx = new RutaficheroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rutafichero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(105);
				comillas();
				}
				break;
			}
			setState(108);
			dir();
			setState(109);
			json_file();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMILLAS) {
				{
				setState(110);
				comillas();
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
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public Dot_fileContext dot_file() {
			return getRuleContext(Dot_fileContext.class,0);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public RutaficherosalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutaficherosalida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterRutaficherosalida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitRutaficherosalida(this);
		}
	}

	public final RutaficherosalidaContext rutaficherosalida() throws RecognitionException {
		RutaficherosalidaContext _localctx = new RutaficherosalidaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rutaficherosalida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(113);
				comillas();
				}
				break;
			}
			setState(116);
			dir();
			setState(117);
			dot_file();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMILLAS) {
				{
				setState(118);
				comillas();
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
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public Svg_fileContext svg_file() {
			return getRuleContext(Svg_fileContext.class,0);
		}
		public List<ComillasContext> comillas() {
			return getRuleContexts(ComillasContext.class);
		}
		public ComillasContext comillas(int i) {
			return getRuleContext(ComillasContext.class,i);
		}
		public RutaficherograficoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutaficherografico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterRutaficherografico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitRutaficherografico(this);
		}
	}

	public final RutaficherograficoContext rutaficherografico() throws RecognitionException {
		RutaficherograficoContext _localctx = new RutaficherograficoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rutaficherografico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(121);
				comillas();
				}
				break;
			}
			setState(124);
			dir();
			setState(125);
			svg_file();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMILLAS) {
				{
				setState(126);
				comillas();
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

	public static class ComillasContext extends ParserRuleContext {
		public TerminalNode COMILLAS() { return getToken(CsvParser.COMILLAS, 0); }
		public ComillasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comillas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterComillas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitComillas(this);
		}
	}

	public final ComillasContext comillas() throws RecognitionException {
		ComillasContext _localctx = new ComillasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comillas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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

	public static class ColumnaContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(CsvParser.TEXTO, 0); }
		public TerminalNode CADENA() { return getToken(CsvParser.CADENA, 0); }
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).enterColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvParserListener ) ((CsvParserListener)listener).exitColumna(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_columna);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(TEXTO);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(CADENA);
				}
				break;
			case COMA:
			case INTRO:
				enterOuterAlt(_localctx, 3);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\u008b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\6\2)\n\2\r\2\16\2*\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4"+
		"\3\5\3\5\5\5G\n\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\3\6\5\6Q\n\6\3\7\3\7"+
		"\3\7\5\7V\n\7\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\5\fd"+
		"\n\f\3\r\5\rg\n\r\3\16\5\16j\n\16\3\17\5\17m\n\17\3\17\3\17\3\17\5\17"+
		"r\n\17\3\20\5\20u\n\20\3\20\3\20\3\20\5\20z\n\20\3\21\5\21}\n\21\3\21"+
		"\3\21\3\21\5\21\u0082\n\21\3\22\3\22\3\23\3\23\3\23\5\23\u0089\n\23\3"+
		"\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\2\u008d\2&\3"+
		"\2\2\2\4,\3\2\2\2\6\65\3\2\2\2\bJ\3\2\2\2\nP\3\2\2\2\fU\3\2\2\2\16Z\3"+
		"\2\2\2\20\\\3\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26c\3\2\2\2\30f\3\2\2\2\32"+
		"i\3\2\2\2\34l\3\2\2\2\36t\3\2\2\2 |\3\2\2\2\"\u0083\3\2\2\2$\u0088\3\2"+
		"\2\2&(\5\4\3\2\')\5\6\4\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\3"+
		"\3\2\2\2,-\5\b\5\2-.\5\20\t\2./\5\b\5\2/\60\5\20\t\2\60\61\5\b\5\2\61"+
		"\62\5\20\t\2\62\63\5\b\5\2\63\64\5\22\n\2\64\5\3\2\2\2\65?\5$\23\2\66"+
		";\5\20\t\2\67<\5\34\17\28<\5\36\20\29<\5 \21\2:<\5$\23\2;\67\3\2\2\2;"+
		"8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<>\3\2\2\2=\66\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\5\22\n\2C\7\3\2\2\2DF\7\t\2\2EG\7\5"+
		"\2\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2HD\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2"+
		"\2\2K\t\3\2\2\2LJ\3\2\2\2MN\5\24\13\2NO\5\26\f\2OQ\3\2\2\2PM\3\2\2\2P"+
		"Q\3\2\2\2Q\13\3\2\2\2RS\5\24\13\2ST\5\30\r\2TV\3\2\2\2UR\3\2\2\2UV\3\2"+
		"\2\2V\r\3\2\2\2WX\5\24\13\2XY\5\32\16\2Y[\3\2\2\2ZW\3\2\2\2Z[\3\2\2\2"+
		"[\17\3\2\2\2\\]\7\3\2\2]\21\3\2\2\2^_\7\4\2\2_\23\3\2\2\2`a\7\t\2\2a\25"+
		"\3\2\2\2bd\7\6\2\2cb\3\2\2\2cd\3\2\2\2d\27\3\2\2\2eg\7\b\2\2fe\3\2\2\2"+
		"fg\3\2\2\2g\31\3\2\2\2hj\7\7\2\2ih\3\2\2\2ij\3\2\2\2j\33\3\2\2\2km\5\""+
		"\22\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\5\b\5\2oq\5\n\6\2pr\5\"\22\2qp\3"+
		"\2\2\2qr\3\2\2\2r\35\3\2\2\2su\5\"\22\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2"+
		"vw\5\b\5\2wy\5\16\b\2xz\5\"\22\2yx\3\2\2\2yz\3\2\2\2z\37\3\2\2\2{}\5\""+
		"\22\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\5\b\5\2\177\u0081\5\f\7\2\u0080"+
		"\u0082\5\"\22\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082!\3\2\2\2"+
		"\u0083\u0084\7\f\2\2\u0084#\3\2\2\2\u0085\u0089\7\n\2\2\u0086\u0089\7"+
		"\13\2\2\u0087\u0089\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089%\3\2\2\2\24*;?FJPUZcfilqty|\u0081\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}