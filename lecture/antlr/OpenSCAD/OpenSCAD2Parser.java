// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OpenSCAD2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INCLUDE_DECL=20, USE_DECL=21, MODULE=22, FUNCTION=23, 
		IF=24, ELSE=25, TRUE=26, FALSE=27, UNDEF=28, LT=29, LE=30, GT=31, GE=32, 
		EQ=33, NE=34, AND=35, OR=36, NOT=37, CUBE=38, SPHERE=39, CYLINDER=40, 
		POLYHEDRON=41, SCALE=42, RESIZE=43, ROTATE=44, TRANSLATE=45, MIRROR=46, 
		MULTMATRIX=47, COLOR=48, MINKOWSKI=49, HULL=50, UNION=51, DIFFERENCE=52, 
		INTERSECTION=53, RENDER=54, MODIFIER=55, NUMBER=56, IDENTIFIER=57, STRING=58, 
		WHITESPACE=59, C_COMMENT=60, LINE_COMMENT=61;
	public static final int
		RULE_prog = 0, RULE_input = 1, RULE_unit = 2, RULE_definition = 3, RULE_statement = 4, 
		RULE_block = 5, RULE_primitive_solid = 6, RULE_for_loop = 7, RULE_intersection_for = 8, 
		RULE_assign = 9, RULE_ifelse = 10, RULE_assignment = 11, RULE_module_instantiation = 12, 
		RULE_module_definition = 13, RULE_function_definition = 14, RULE_expr = 15, 
		RULE_function_call = 16, RULE_arg_decl = 17, RULE_arg_call_list = 18, 
		RULE_arg_call = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "input", "unit", "definition", "statement", "block", "primitive_solid", 
			"for_loop", "intersection_for", "assign", "ifelse", "assignment", "module_instantiation", 
			"module_definition", "function_definition", "expr", "function_call", 
			"arg_decl", "arg_call_list", "arg_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "')'", "'for'", "'intersection_for'", 
			"'assign'", "'='", "','", "'?'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'['", "']'", null, null, "'module'", "'function'", "'if'", "'else'", 
			"'true'", "'false'", "'undef'", "'<'", "'<='", "'>'", "'>='", "'=='", 
			"'!='", "'&&'", "'||'", "'!'", "'cube'", "'sphere'", "'cylinder'", "'polyhedron'", 
			"'scale'", "'resize'", "'rotate'", "'translate'", "'mirror'", "'multmatrix'", 
			"'color'", "'minkowski'", "'hull'", "'union'", "'difference'", "'intersection'", 
			"'render'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INCLUDE_DECL", "USE_DECL", 
			"MODULE", "FUNCTION", "IF", "ELSE", "TRUE", "FALSE", "UNDEF", "LT", "LE", 
			"GT", "GE", "EQ", "NE", "AND", "OR", "NOT", "CUBE", "SPHERE", "CYLINDER", 
			"POLYHEDRON", "SCALE", "RESIZE", "ROTATE", "TRANSLATE", "MIRROR", "MULTMATRIX", 
			"COLOR", "MINKOWSKI", "HULL", "UNION", "DIFFERENCE", "INTERSECTION", 
			"RENDER", "MODIFIER", "NUMBER", "IDENTIFIER", "STRING", "WHITESPACE", 
			"C_COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OpenSCAD2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 216172507268383174L) != 0) {
				{
				{
				setState(40);
				input();
				}
				}
				setState(45);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public TerminalNode INCLUDE_DECL() { return getToken(OpenSCAD2Parser.INCLUDE_DECL, 0); }
		public TerminalNode USE_DECL() { return getToken(OpenSCAD2Parser.USE_DECL, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCLUDE_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(INCLUDE_DECL);
				}
				break;
			case USE_DECL:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(USE_DECL);
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case MODULE:
			case FUNCTION:
			case IF:
			case CUBE:
			case SPHERE:
			case CYLINDER:
			case POLYHEDRON:
			case SCALE:
			case RESIZE:
			case ROTATE:
			case TRANSLATE:
			case MIRROR:
			case MULTMATRIX:
			case COLOR:
			case MINKOWSKI:
			case HULL:
			case UNION:
			case DIFFERENCE:
			case INTERSECTION:
			case RENDER:
			case MODIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				unit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unit);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				definition();
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case IF:
			case CUBE:
			case SPHERE:
			case CYLINDER:
			case POLYHEDRON:
			case SCALE:
			case RESIZE:
			case ROTATE:
			case TRANSLATE:
			case MIRROR:
			case MULTMATRIX:
			case COLOR:
			case MINKOWSKI:
			case HULL:
			case UNION:
			case DIFFERENCE:
			case INTERSECTION:
			case RENDER:
			case MODIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public Module_definitionContext module_definition() {
			return getRuleContext(Module_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				module_definition();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				function_definition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Primitive_solidContext primitive_solid() {
			return getRuleContext(Primitive_solidContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Intersection_forContext intersection_for() {
			return getRuleContext(Intersection_forContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Module_instantiationContext module_instantiation() {
			return getRuleContext(Module_instantiationContext.class,0);
		}
		public TerminalNode MODIFIER() { return getToken(OpenSCAD2Parser.MODIFIER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				primitive_solid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				intersection_for();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				ifelse();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MODIFIER) {
					{
					setState(66);
					match(MODIFIER);
					}
				}

				setState(69);
				module_instantiation();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<UnitContext> unit() {
			return getRuleContexts(UnitContext.class);
		}
		public UnitContext unit(int i) {
			return getRuleContext(UnitContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__1);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 216172507265237446L) != 0) {
				{
				{
				setState(74);
				unit();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primitive_solidContext extends ParserRuleContext {
		public Arg_call_listContext arg_call_list() {
			return getRuleContext(Arg_call_listContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(OpenSCAD2Parser.CUBE, 0); }
		public TerminalNode SPHERE() { return getToken(OpenSCAD2Parser.SPHERE, 0); }
		public TerminalNode CYLINDER() { return getToken(OpenSCAD2Parser.CYLINDER, 0); }
		public TerminalNode POLYHEDRON() { return getToken(OpenSCAD2Parser.POLYHEDRON, 0); }
		public TerminalNode MODIFIER() { return getToken(OpenSCAD2Parser.MODIFIER, 0); }
		public Primitive_solidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_solid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterPrimitive_solid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitPrimitive_solid(this);
		}
	}

	public final Primitive_solidContext primitive_solid() throws RecognitionException {
		Primitive_solidContext _localctx = new Primitive_solidContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primitive_solid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(82);
				match(MODIFIER);
				}
			}

			setState(85);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
			match(T__3);
			setState(87);
			arg_call_list();
			setState(88);
			match(T__4);
			setState(89);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public Arg_call_listContext arg_call_list() {
			return getRuleContext(Arg_call_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__5);
			setState(92);
			match(T__3);
			setState(93);
			arg_call_list();
			setState(94);
			match(T__4);
			setState(95);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Intersection_forContext extends ParserRuleContext {
		public Arg_call_listContext arg_call_list() {
			return getRuleContext(Arg_call_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Intersection_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersection_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterIntersection_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitIntersection_for(this);
		}
	}

	public final Intersection_forContext intersection_for() throws RecognitionException {
		Intersection_forContext _localctx = new Intersection_forContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intersection_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__6);
			setState(98);
			match(T__3);
			setState(99);
			arg_call_list();
			setState(100);
			match(T__4);
			setState(101);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Arg_call_listContext arg_call_list() {
			return getRuleContext(Arg_call_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__7);
			setState(104);
			match(T__3);
			setState(105);
			arg_call_list();
			setState(106);
			match(T__4);
			setState(107);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(OpenSCAD2Parser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(OpenSCAD2Parser.ELSE, 0); }
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitIfelse(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IF);
			setState(110);
			match(T__3);
			setState(111);
			expr(0);
			setState(112);
			match(T__4);
			setState(113);
			statement();
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(114);
				match(ELSE);
				setState(115);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpenSCAD2Parser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENTIFIER);
			setState(119);
			match(T__8);
			setState(120);
			expr(0);
			setState(121);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_instantiationContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode UNION() { return getToken(OpenSCAD2Parser.UNION, 0); }
		public TerminalNode DIFFERENCE() { return getToken(OpenSCAD2Parser.DIFFERENCE, 0); }
		public TerminalNode INTERSECTION() { return getToken(OpenSCAD2Parser.INTERSECTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(OpenSCAD2Parser.IDENTIFIER, 0); }
		public TerminalNode RENDER() { return getToken(OpenSCAD2Parser.RENDER, 0); }
		public Arg_call_listContext arg_call_list() {
			return getRuleContext(Arg_call_listContext.class,0);
		}
		public TerminalNode SCALE() { return getToken(OpenSCAD2Parser.SCALE, 0); }
		public TerminalNode RESIZE() { return getToken(OpenSCAD2Parser.RESIZE, 0); }
		public TerminalNode ROTATE() { return getToken(OpenSCAD2Parser.ROTATE, 0); }
		public TerminalNode TRANSLATE() { return getToken(OpenSCAD2Parser.TRANSLATE, 0); }
		public TerminalNode MIRROR() { return getToken(OpenSCAD2Parser.MIRROR, 0); }
		public TerminalNode MULTMATRIX() { return getToken(OpenSCAD2Parser.MULTMATRIX, 0); }
		public TerminalNode COLOR() { return getToken(OpenSCAD2Parser.COLOR, 0); }
		public TerminalNode MINKOWSKI() { return getToken(OpenSCAD2Parser.MINKOWSKI, 0); }
		public TerminalNode HULL() { return getToken(OpenSCAD2Parser.HULL, 0); }
		public Module_instantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterModule_instantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitModule_instantiation(this);
		}
	}

	public final Module_instantiationContext module_instantiation() throws RecognitionException {
		Module_instantiationContext _localctx = new Module_instantiationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_module_instantiation);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 159877786771652608L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				match(T__3);
				setState(125);
				match(T__4);
				setState(126);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(RENDER);
				setState(128);
				match(T__3);
				setState(129);
				arg_call_list();
				setState(130);
				match(T__4);
				setState(131);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2247401767174144L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				match(T__3);
				setState(135);
				arg_call_list();
				setState(136);
				match(T__4);
				setState(137);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(IDENTIFIER);
				setState(140);
				match(T__3);
				setState(141);
				arg_call_list();
				setState(142);
				match(T__4);
				setState(143);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Module_definitionContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(OpenSCAD2Parser.MODULE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(OpenSCAD2Parser.IDENTIFIER, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public List<Arg_declContext> arg_decl() {
			return getRuleContexts(Arg_declContext.class);
		}
		public Arg_declContext arg_decl(int i) {
			return getRuleContext(Arg_declContext.class,i);
		}
		public Module_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterModule_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitModule_definition(this);
		}
	}

	public final Module_definitionContext module_definition() throws RecognitionException {
		Module_definitionContext _localctx = new Module_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_module_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(MODULE);
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(T__3);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(150);
				arg_decl();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(153);
				match(T__9);
				setState(154);
				arg_decl();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__4);
			setState(161);
			unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(OpenSCAD2Parser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(OpenSCAD2Parser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Arg_declContext> arg_decl() {
			return getRuleContexts(Arg_declContext.class);
		}
		public Arg_declContext arg_decl(int i) {
			return getRuleContext(Arg_declContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FUNCTION);
			setState(164);
			match(IDENTIFIER);
			setState(165);
			match(T__3);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(166);
				arg_decl();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(169);
				match(T__9);
				setState(170);
				arg_decl();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__4);
			setState(177);
			match(T__8);
			setState(178);
			expr(0);
			setState(179);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OpenSCAD2Parser.NOT, 0); }
		public TerminalNode TRUE() { return getToken(OpenSCAD2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OpenSCAD2Parser.FALSE, 0); }
		public TerminalNode UNDEF() { return getToken(OpenSCAD2Parser.UNDEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(OpenSCAD2Parser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(OpenSCAD2Parser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(OpenSCAD2Parser.NUMBER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode OR() { return getToken(OpenSCAD2Parser.OR, 0); }
		public TerminalNode AND() { return getToken(OpenSCAD2Parser.AND, 0); }
		public TerminalNode EQ() { return getToken(OpenSCAD2Parser.EQ, 0); }
		public TerminalNode NE() { return getToken(OpenSCAD2Parser.NE, 0); }
		public TerminalNode LT() { return getToken(OpenSCAD2Parser.LT, 0); }
		public TerminalNode LE() { return getToken(OpenSCAD2Parser.LE, 0); }
		public TerminalNode GE() { return getToken(OpenSCAD2Parser.GE, 0); }
		public TerminalNode GT() { return getToken(OpenSCAD2Parser.GT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				expr(14);
				}
				break;
			case 2:
				{
				setState(184);
				match(NOT);
				setState(185);
				expr(13);
				}
				break;
			case 3:
				{
				setState(186);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(187);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(188);
				match(UNDEF);
				}
				break;
			case 6:
				{
				setState(189);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(190);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(191);
				match(NUMBER);
				}
				break;
			case 9:
				{
				setState(192);
				match(T__17);
				setState(193);
				expr(0);
				setState(194);
				match(T__11);
				setState(195);
				expr(0);
				setState(196);
				match(T__18);
				}
				break;
			case 10:
				{
				setState(198);
				match(T__17);
				setState(199);
				expr(0);
				setState(200);
				match(T__11);
				setState(201);
				expr(0);
				setState(202);
				match(T__11);
				setState(203);
				expr(0);
				setState(204);
				match(T__18);
				}
				break;
			case 11:
				{
				setState(206);
				match(T__17);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 504403296174497808L) != 0) {
					{
					setState(207);
					expr(0);
					}
				}

				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(210);
						match(T__9);
						setState(211);
						expr(0);
						}
						} 
					}
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(217);
					match(T__9);
					}
				}

				setState(220);
				match(T__18);
				}
				break;
			case 12:
				{
				setState(221);
				match(T__3);
				setState(222);
				expr(0);
				setState(223);
				match(T__4);
				}
				break;
			case 13:
				{
				setState(225);
				match(IDENTIFIER);
				setState(226);
				match(T__17);
				setState(227);
				expr(0);
				setState(228);
				match(T__18);
				}
				break;
			case 14:
				{
				setState(230);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(234);
						match(T__10);
						setState(235);
						expr(0);
						setState(236);
						match(T__11);
						setState(237);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(240);
						match(OR);
						setState(241);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(243);
						match(AND);
						setState(244);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(246);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(249);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(252);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(253);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(255);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(256);
						expr(16);
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpenSCAD2Parser.IDENTIFIER, 0); }
		public Arg_call_listContext arg_call_list() {
			return getRuleContext(Arg_call_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IDENTIFIER);
			setState(263);
			match(T__3);
			setState(264);
			arg_call_list();
			setState(265);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_declContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpenSCAD2Parser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Arg_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterArg_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitArg_decl(this);
		}
	}

	public final Arg_declContext arg_decl() throws RecognitionException {
		Arg_declContext _localctx = new Arg_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arg_decl);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(IDENTIFIER);
				setState(269);
				match(T__8);
				setState(270);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_call_listContext extends ParserRuleContext {
		public List<Arg_callContext> arg_call() {
			return getRuleContexts(Arg_callContext.class);
		}
		public Arg_callContext arg_call(int i) {
			return getRuleContext(Arg_callContext.class,i);
		}
		public Arg_call_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterArg_call_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitArg_call_list(this);
		}
	}

	public final Arg_call_listContext arg_call_list() throws RecognitionException {
		Arg_call_listContext _localctx = new Arg_call_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_call_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 504403296174497808L) != 0) {
				{
				setState(273);
				arg_call();
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(276);
				match(T__9);
				setState(277);
				arg_call();
				}
				}
				setState(282);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_callContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(OpenSCAD2Parser.IDENTIFIER, 0); }
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).enterArg_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenSCAD2Listener ) ((OpenSCAD2Listener)listener).exitArg_call(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arg_call);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(IDENTIFIER);
				setState(285);
				match(T__8);
				setState(286);
				expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u0122\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003:\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004D\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0003\u0006T\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nu\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0092\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0098\b\r"+
		"\u0001\r\u0001\r\u0005\r\u009c\b\r\n\r\f\r\u009f\t\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a8\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ac\b\u000e\n\u000e\f\u000e"+
		"\u00af\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d1\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00d5\b\u000f\n\u000f\f\u000f\u00d8\t\u000f\u0001"+
		"\u000f\u0003\u000f\u00db\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00e8\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0102\b\u000f\n"+
		"\u000f\f\u000f\u0105\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0110\b\u0011\u0001\u0012\u0003\u0012\u0113\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0117\b\u0012\n\u0012\f\u0012\u011a\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0120\b\u0013\u0001"+
		"\u0013\u0000\u0001\u001e\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0007\u0001\u0000"+
		"&)\u0002\u00003599\u0001\u0000*2\u0001\u0000\r\u000e\u0001\u0000!\"\u0001"+
		"\u0000\u001d \u0001\u0000\u000f\u0011\u0140\u0000+\u0001\u0000\u0000\u0000"+
		"\u00021\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u00069"+
		"\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nI\u0001\u0000\u0000"+
		"\u0000\fS\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010"+
		"a\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014m\u0001"+
		"\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018\u0091\u0001\u0000"+
		"\u0000\u0000\u001a\u0093\u0001\u0000\u0000\u0000\u001c\u00a3\u0001\u0000"+
		"\u0000\u0000\u001e\u00e7\u0001\u0000\u0000\u0000 \u0106\u0001\u0000\u0000"+
		"\u0000\"\u010f\u0001\u0000\u0000\u0000$\u0112\u0001\u0000\u0000\u0000"+
		"&\u011f\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,\u0001\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000.2\u0005\u0014\u0000\u0000/2\u0005\u0015\u0000\u000002\u0003\u0004"+
		"\u0002\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001"+
		"\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000036\u0003\u0006\u0003"+
		"\u000046\u0003\b\u0004\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000"+
		"\u00006\u0005\u0001\u0000\u0000\u00007:\u0003\u001a\r\u00008:\u0003\u001c"+
		"\u000e\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0007"+
		"\u0001\u0000\u0000\u0000;H\u0003\n\u0005\u0000<H\u0003\f\u0006\u0000="+
		"H\u0003\u000e\u0007\u0000>H\u0003\u0010\b\u0000?H\u0003\u0012\t\u0000"+
		"@H\u0003\u0014\n\u0000AH\u0003\u0016\u000b\u0000BD\u00057\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EH\u0003\u0018\f\u0000FH\u0005\u0001\u0000\u0000G;\u0001\u0000\u0000"+
		"\u0000G<\u0001\u0000\u0000\u0000G=\u0001\u0000\u0000\u0000G>\u0001\u0000"+
		"\u0000\u0000G?\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000GA\u0001"+
		"\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"H\t\u0001\u0000\u0000\u0000IM\u0005\u0002\u0000\u0000JL\u0003\u0004\u0002"+
		"\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0003\u0000\u0000Q\u000b\u0001\u0000\u0000"+
		"\u0000RT\u00057\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0007\u0000\u0000\u0000VW\u0005\u0004"+
		"\u0000\u0000WX\u0003$\u0012\u0000XY\u0005\u0005\u0000\u0000YZ\u0005\u0001"+
		"\u0000\u0000Z\r\u0001\u0000\u0000\u0000[\\\u0005\u0006\u0000\u0000\\]"+
		"\u0005\u0004\u0000\u0000]^\u0003$\u0012\u0000^_\u0005\u0005\u0000\u0000"+
		"_`\u0003\b\u0004\u0000`\u000f\u0001\u0000\u0000\u0000ab\u0005\u0007\u0000"+
		"\u0000bc\u0005\u0004\u0000\u0000cd\u0003$\u0012\u0000de\u0005\u0005\u0000"+
		"\u0000ef\u0003\b\u0004\u0000f\u0011\u0001\u0000\u0000\u0000gh\u0005\b"+
		"\u0000\u0000hi\u0005\u0004\u0000\u0000ij\u0003$\u0012\u0000jk\u0005\u0005"+
		"\u0000\u0000kl\u0003\b\u0004\u0000l\u0013\u0001\u0000\u0000\u0000mn\u0005"+
		"\u0018\u0000\u0000no\u0005\u0004\u0000\u0000op\u0003\u001e\u000f\u0000"+
		"pq\u0005\u0005\u0000\u0000qt\u0003\b\u0004\u0000rs\u0005\u0019\u0000\u0000"+
		"su\u0003\b\u0004\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"u\u0015\u0001\u0000\u0000\u0000vw\u00059\u0000\u0000wx\u0005\t\u0000\u0000"+
		"xy\u0003\u001e\u000f\u0000yz\u0005\u0001\u0000\u0000z\u0017\u0001\u0000"+
		"\u0000\u0000{|\u0007\u0001\u0000\u0000|}\u0005\u0004\u0000\u0000}~\u0005"+
		"\u0005\u0000\u0000~\u0092\u0003\b\u0004\u0000\u007f\u0080\u00056\u0000"+
		"\u0000\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u0082\u0003$\u0012\u0000"+
		"\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0084\u0003\b\u0004\u0000\u0084"+
		"\u0092\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0002\u0000\u0000\u0086"+
		"\u0087\u0005\u0004\u0000\u0000\u0087\u0088\u0003$\u0012\u0000\u0088\u0089"+
		"\u0005\u0005\u0000\u0000\u0089\u008a\u0003\b\u0004\u0000\u008a\u0092\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u00059\u0000\u0000\u008c\u008d\u0005\u0004"+
		"\u0000\u0000\u008d\u008e\u0003$\u0012\u0000\u008e\u008f\u0005\u0005\u0000"+
		"\u0000\u008f\u0090\u0003\b\u0004\u0000\u0090\u0092\u0001\u0000\u0000\u0000"+
		"\u0091{\u0001\u0000\u0000\u0000\u0091\u007f\u0001\u0000\u0000\u0000\u0091"+
		"\u0085\u0001\u0000\u0000\u0000\u0091\u008b\u0001\u0000\u0000\u0000\u0092"+
		"\u0019\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0016\u0000\u0000\u0094"+
		"\u0095\u00059\u0000\u0000\u0095\u0097\u0005\u0004\u0000\u0000\u0096\u0098"+
		"\u0003\"\u0011\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u009d\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\n\u0000\u0000\u009a\u009c\u0003\"\u0011\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0005"+
		"\u0000\u0000\u00a1\u00a2\u0003\u0004\u0002\u0000\u00a2\u001b\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0005\u0017\u0000\u0000\u00a4\u00a5\u00059\u0000"+
		"\u0000\u00a5\u00a7\u0005\u0004\u0000\u0000\u00a6\u00a8\u0003\"\u0011\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ad\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\n\u0000\u0000\u00aa"+
		"\u00ac\u0003\"\u0011\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0005\u0000\u0000\u00b1\u00b2"+
		"\u0005\t\u0000\u0000\u00b2\u00b3\u0003\u001e\u000f\u0000\u00b3\u00b4\u0005"+
		"\u0001\u0000\u0000\u00b4\u001d\u0001\u0000\u0000\u0000\u00b5\u00b6\u0006"+
		"\u000f\uffff\uffff\u0000\u00b6\u00b7\u0007\u0003\u0000\u0000\u00b7\u00e8"+
		"\u0003\u001e\u000f\u000e\u00b8\u00b9\u0005%\u0000\u0000\u00b9\u00e8\u0003"+
		"\u001e\u000f\r\u00ba\u00e8\u0005\u001a\u0000\u0000\u00bb\u00e8\u0005\u001b"+
		"\u0000\u0000\u00bc\u00e8\u0005\u001c\u0000\u0000\u00bd\u00e8\u00059\u0000"+
		"\u0000\u00be\u00e8\u0005:\u0000\u0000\u00bf\u00e8\u00058\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0012\u0000\u0000\u00c1\u00c2\u0003\u001e\u000f\u0000\u00c2"+
		"\u00c3\u0005\f\u0000\u0000\u00c3\u00c4\u0003\u001e\u000f\u0000\u00c4\u00c5"+
		"\u0005\u0013\u0000\u0000\u00c5\u00e8\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0012\u0000\u0000\u00c7\u00c8\u0003\u001e\u000f\u0000\u00c8\u00c9"+
		"\u0005\f\u0000\u0000\u00c9\u00ca\u0003\u001e\u000f\u0000\u00ca\u00cb\u0005"+
		"\f\u0000\u0000\u00cb\u00cc\u0003\u001e\u000f\u0000\u00cc\u00cd\u0005\u0013"+
		"\u0000\u0000\u00cd\u00e8\u0001\u0000\u0000\u0000\u00ce\u00d0\u0005\u0012"+
		"\u0000\u0000\u00cf\u00d1\u0003\u001e\u000f\u0000\u00d0\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3\u00d5\u0003\u001e\u000f"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d9\u00db\u0005\n\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc\u00e8\u0005\u0013\u0000\u0000\u00dd\u00de\u0005\u0004\u0000\u0000"+
		"\u00de\u00df\u0003\u001e\u000f\u0000\u00df\u00e0\u0005\u0005\u0000\u0000"+
		"\u00e0\u00e8\u0001\u0000\u0000\u0000\u00e1\u00e2\u00059\u0000\u0000\u00e2"+
		"\u00e3\u0005\u0012\u0000\u0000\u00e3\u00e4\u0003\u001e\u000f\u0000\u00e4"+
		"\u00e5\u0005\u0013\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0003 \u0010\u0000\u00e7\u00b5\u0001\u0000\u0000\u0000\u00e7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ba\u0001\u0000\u0000\u0000\u00e7\u00bb"+
		"\u0001\u0000\u0000\u0000\u00e7\u00bc\u0001\u0000\u0000\u0000\u00e7\u00bd"+
		"\u0001\u0000\u0000\u0000\u00e7\u00be\u0001\u0000\u0000\u0000\u00e7\u00bf"+
		"\u0001\u0000\u0000\u0000\u00e7\u00c0\u0001\u0000\u0000\u0000\u00e7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ce\u0001\u0000\u0000\u0000\u00e7\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u0103\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\n\u0015\u0000\u0000\u00ea\u00eb\u0005\u000b\u0000\u0000\u00eb\u00ec\u0003"+
		"\u001e\u000f\u0000\u00ec\u00ed\u0005\f\u0000\u0000\u00ed\u00ee\u0003\u001e"+
		"\u000f\u0016\u00ee\u0102\u0001\u0000\u0000\u0000\u00ef\u00f0\n\u0014\u0000"+
		"\u0000\u00f0\u00f1\u0005$\u0000\u0000\u00f1\u0102\u0003\u001e\u000f\u0015"+
		"\u00f2\u00f3\n\u0013\u0000\u0000\u00f3\u00f4\u0005#\u0000\u0000\u00f4"+
		"\u0102\u0003\u001e\u000f\u0014\u00f5\u00f6\n\u0012\u0000\u0000\u00f6\u00f7"+
		"\u0007\u0004\u0000\u0000\u00f7\u0102\u0003\u001e\u000f\u0013\u00f8\u00f9"+
		"\n\u0011\u0000\u0000\u00f9\u00fa\u0007\u0005\u0000\u0000\u00fa\u0102\u0003"+
		"\u001e\u000f\u0012\u00fb\u00fc\n\u0010\u0000\u0000\u00fc\u00fd\u0007\u0003"+
		"\u0000\u0000\u00fd\u0102\u0003\u001e\u000f\u0011\u00fe\u00ff\n\u000f\u0000"+
		"\u0000\u00ff\u0100\u0007\u0006\u0000\u0000\u0100\u0102\u0003\u001e\u000f"+
		"\u0010\u0101\u00e9\u0001\u0000\u0000\u0000\u0101\u00ef\u0001\u0000\u0000"+
		"\u0000\u0101\u00f2\u0001\u0000\u0000\u0000\u0101\u00f5\u0001\u0000\u0000"+
		"\u0000\u0101\u00f8\u0001\u0000\u0000\u0000\u0101\u00fb\u0001\u0000\u0000"+
		"\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u001f\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u00059\u0000\u0000\u0107\u0108\u0005\u0004\u0000\u0000"+
		"\u0108\u0109\u0003$\u0012\u0000\u0109\u010a\u0005\u0005\u0000\u0000\u010a"+
		"!\u0001\u0000\u0000\u0000\u010b\u0110\u00059\u0000\u0000\u010c\u010d\u0005"+
		"9\u0000\u0000\u010d\u010e\u0005\t\u0000\u0000\u010e\u0110\u0003\u001e"+
		"\u000f\u0000\u010f\u010b\u0001\u0000\u0000\u0000\u010f\u010c\u0001\u0000"+
		"\u0000\u0000\u0110#\u0001\u0000\u0000\u0000\u0111\u0113\u0003&\u0013\u0000"+
		"\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0118\u0001\u0000\u0000\u0000\u0114\u0115\u0005\n\u0000\u0000\u0115"+
		"\u0117\u0003&\u0013\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119%\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011b\u0120\u0003\u001e\u000f\u0000\u011c\u011d\u0005"+
		"9\u0000\u0000\u011d\u011e\u0005\t\u0000\u0000\u011e\u0120\u0003\u001e"+
		"\u000f\u0000\u011f\u011b\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000"+
		"\u0000\u0000\u0120\'\u0001\u0000\u0000\u0000\u0018+159CGMSt\u0091\u0097"+
		"\u009d\u00a7\u00ad\u00d0\u00d6\u00da\u00e7\u0101\u0103\u010f\u0112\u0118"+
		"\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}