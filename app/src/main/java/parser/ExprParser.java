// Generated from /home/guo/javaplay/w1/app/src/main/java/parser/Expr.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IDENT=5, INT=6, WS=7, MUL=8, DIV=9, ADD=10, 
		SUB=11, EQ=12, NE=13, LT=14, LE=15, MT=16, ME=17;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_expr = 2, RULE_assign = 3, RULE_equality = 4, 
		RULE_relational = 5, RULE_add = 6, RULE_mul = 7, RULE_unary = 8, RULE_primary = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "expr", "assign", "equality", "relational", "add", 
			"mul", "unary", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", null, null, null, "'*'", "'/'", "'+'", 
			"'-'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "IDENT", "INT", "WS", "MUL", "DIV", "ADD", 
			"SUB", "EQ", "NE", "LT", "LE", "MT", "ME"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3176L) != 0)) {
				{
				{
				setState(20);
				stmt();
				}
				}
				setState(25);
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
	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			expr();
			setState(27);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			assign();
			}
		}
		catch (RecognitionException re) {
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
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			equality();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(32);
				match(T__1);
				setState(33);
				assign();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ParserRuleContext {
		public List<RelationalContext> relational() {
			return getRuleContexts(RelationalContext.class);
		}
		public RelationalContext relational(int i) {
			return getRuleContext(RelationalContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(ExprParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ExprParser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(ExprParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(ExprParser.NE, i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			relational();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NE) {
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(37);
					match(EQ);
					setState(38);
					relational();
					}
					break;
				case NE:
					{
					setState(39);
					match(NE);
					setState(40);
					relational();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class RelationalContext extends ParserRuleContext {
		public List<AddContext> add() {
			return getRuleContexts(AddContext.class);
		}
		public AddContext add(int i) {
			return getRuleContext(AddContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ExprParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ExprParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(ExprParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(ExprParser.LE, i);
		}
		public List<TerminalNode> MT() { return getTokens(ExprParser.MT); }
		public TerminalNode MT(int i) {
			return getToken(ExprParser.MT, i);
		}
		public List<TerminalNode> ME() { return getTokens(ExprParser.ME); }
		public TerminalNode ME(int i) {
			return getToken(ExprParser.ME, i);
		}
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			add();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(47);
					match(LT);
					setState(48);
					add();
					}
					break;
				case LE:
					{
					setState(49);
					match(LE);
					setState(50);
					add();
					}
					break;
				case MT:
					{
					setState(51);
					match(MT);
					setState(52);
					add();
					}
					break;
				case ME:
					{
					setState(53);
					match(ME);
					setState(54);
					add();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59);
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
	public static class AddContext extends ParserRuleContext {
		public List<MulContext> mul() {
			return getRuleContexts(MulContext.class);
		}
		public MulContext mul(int i) {
			return getRuleContext(MulContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(ExprParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ExprParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ExprParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ExprParser.SUB, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			mul();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(61);
					match(ADD);
					setState(62);
					mul();
					}
					break;
				case SUB:
					{
					setState(63);
					match(SUB);
					setState(64);
					mul();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(69);
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
	public static class MulContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ExprParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ExprParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ExprParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ExprParser.DIV, i);
		}
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			unary();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(71);
					match(MUL);
					setState(72);
					unary();
					}
					break;
				case DIV:
					{
					setState(73);
					match(DIV);
					setState(74);
					unary();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
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
	public static class UnaryContext extends ParserRuleContext {
		public Token op;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> ADD() { return getTokens(ExprParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ExprParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ExprParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ExprParser.SUB, i);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(80);
					((UnaryContext)_localctx).op = match(ADD);
					}
					break;
				case SUB:
					{
					setState(81);
					((UnaryContext)_localctx).op = match(SUB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			primary();
			}
		}
		catch (RecognitionException re) {
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
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_p0Context extends PrimaryContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public Label_p0Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLabel_p0(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_p1Context extends PrimaryContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Label_p1Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLabel_p1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lable_identContext extends PrimaryContext {
		public TerminalNode IDENT() { return getToken(ExprParser.IDENT, 0); }
		public Lable_identContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLable_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primary);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new Label_p0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(INT);
				}
				break;
			case T__2:
				_localctx = new Label_p1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__2);
				setState(91);
				expr();
				setState(92);
				match(T__3);
				}
				break;
			case IDENT:
				_localctx = new Lable_identContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(IDENT);
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
		"\u0004\u0001\u0011b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003#\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"*\b\u0004\n\u0004\f\u0004-\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u00058\b\u0005\n\u0005\f\u0005;\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006B\b\u0006\n\u0006\f\u0006"+
		"E\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007L\b\u0007\n\u0007\f\u0007O\t\u0007\u0001\b\u0001\b\u0005\b"+
		"S\b\b\n\b\f\bV\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t`\b\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0000\u0000g\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001d\u0001\u0000\u0000\u0000"+
		"\u0006\u001f\u0001\u0000\u0000\u0000\b$\u0001\u0000\u0000\u0000\n.\u0001"+
		"\u0000\u0000\u0000\f<\u0001\u0000\u0000\u0000\u000eF\u0001\u0000\u0000"+
		"\u0000\u0010T\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014"+
		"\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0004\u0002\u0000\u001b"+
		"\u001c\u0005\u0001\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0003\u0006\u0003\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0003\b\u0004\u0000 !\u0005\u0002\u0000\u0000!#\u0003\u0006\u0003\u0000"+
		"\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0007\u0001\u0000"+
		"\u0000\u0000$+\u0003\n\u0005\u0000%&\u0005\f\u0000\u0000&*\u0003\n\u0005"+
		"\u0000\'(\u0005\r\u0000\u0000(*\u0003\n\u0005\u0000)%\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,\t\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000.9\u0003\f\u0006\u0000/0\u0005\u000e\u0000\u000008\u0003"+
		"\f\u0006\u000012\u0005\u000f\u0000\u000028\u0003\f\u0006\u000034\u0005"+
		"\u0010\u0000\u000048\u0003\f\u0006\u000056\u0005\u0011\u0000\u000068\u0003"+
		"\f\u0006\u00007/\u0001\u0000\u0000\u000071\u0001\u0000\u0000\u000073\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u000b\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<C\u0003\u000e\u0007\u0000=>\u0005"+
		"\n\u0000\u0000>B\u0003\u000e\u0007\u0000?@\u0005\u000b\u0000\u0000@B\u0003"+
		"\u000e\u0007\u0000A=\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\r\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FM\u0003\u0010"+
		"\b\u0000GH\u0005\b\u0000\u0000HL\u0003\u0010\b\u0000IJ\u0005\t\u0000\u0000"+
		"JL\u0003\u0010\b\u0000KG\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000N\u000f\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PS\u0005"+
		"\n\u0000\u0000QS\u0005\u000b\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000WX\u0003\u0012\t\u0000X\u0011\u0001\u0000\u0000\u0000Y`\u0005\u0006"+
		"\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0003\u0004\u0002\u0000\\]\u0005"+
		"\u0004\u0000\u0000]`\u0001\u0000\u0000\u0000^`\u0005\u0005\u0000\u0000"+
		"_Y\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`\u0013\u0001\u0000\u0000\u0000\r\u0017\")+79ACKMRT_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}