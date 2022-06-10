// Generated from D:/Github/chatmath/src/main/java/com/goby56/chatmath/antlr\ChatMath.g4 by ANTLR 4.10.1
package com.goby56.chatmath.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatMathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COS=1, SIN=2, TAN=3, ACOS=4, ASIN=5, ATAN=6, LN=7, LOG=8, SQRT=9, LPAREN=10, 
		RPAREN=11, PLUS=12, MINUS=13, TIMES=14, DIV=15, GT=16, LT=17, EQ=18, COMMA=19, 
		POINT=20, POW=21, PI=22, EULER=23, I=24, VARIABLE=25, SCIENTIFIC_NUMBER=26, 
		WS=27;
	public static final int
		RULE_equation = 0, RULE_expression = 1, RULE_multiplyingExpression = 2, 
		RULE_powExpression = 3, RULE_signedAtom = 4, RULE_atom = 5, RULE_scientific = 6, 
		RULE_constant = 7, RULE_variable = 8, RULE_func_ = 9, RULE_funcname = 10, 
		RULE_relop = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"equation", "expression", "multiplyingExpression", "powExpression", "signedAtom", 
			"atom", "scientific", "constant", "variable", "func_", "funcname", "relop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", "'ln'", 
			"'log'", "'sqrt'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'='", "','", "'.'", "'^'", "'pi'", null, "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT", 
			"LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", "LT", "EQ", 
			"COMMA", "POINT", "POW", "PI", "EULER", "I", "VARIABLE", "SCIENTIFIC_NUMBER", 
			"WS"
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
	public String getGrammarFileName() { return "ChatMath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChatMathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EquationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			expression();
			setState(25);
			relop();
			setState(26);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ChatMathParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ChatMathParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ChatMathParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ChatMathParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			multiplyingExpression();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(30);
				multiplyingExpression();
				}
				}
				setState(35);
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<PowExpressionContext> powExpression() {
			return getRuleContexts(PowExpressionContext.class);
		}
		public PowExpressionContext powExpression(int i) {
			return getRuleContext(PowExpressionContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(ChatMathParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(ChatMathParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ChatMathParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ChatMathParser.DIV, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitMultiplyingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitMultiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplyingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			powExpression();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				{
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				powExpression();
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

	public static class PowExpressionContext extends ParserRuleContext {
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(ChatMathParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(ChatMathParser.POW, i);
		}
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitPowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_powExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			signedAtom();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(45);
				match(POW);
				setState(46);
				signedAtom();
				}
				}
				setState(51);
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

	public static class SignedAtomContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ChatMathParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ChatMathParser.MINUS, 0); }
		public Func_Context func_() {
			return getRuleContext(Func_Context.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterSignedAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitSignedAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitSignedAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_signedAtom);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(PLUS);
				setState(53);
				signedAtom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(MINUS);
				setState(55);
				signedAtom();
				}
				break;
			case COS:
			case SIN:
			case TAN:
			case ACOS:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				func_();
				}
				break;
			case LPAREN:
			case PI:
			case EULER:
			case I:
			case VARIABLE:
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				atom();
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

	public static class AtomContext extends ParserRuleContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ChatMathParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ChatMathParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				variable();
				}
				break;
			case PI:
			case EULER:
			case I:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(LPAREN);
				setState(64);
				expression();
				setState(65);
				match(RPAREN);
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

	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(ChatMathParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitScientific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(SCIENTIFIC_NUMBER);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(ChatMathParser.PI, 0); }
		public TerminalNode EULER() { return getToken(ChatMathParser.EULER, 0); }
		public TerminalNode I() { return getToken(ChatMathParser.I, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << EULER) | (1L << I))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ChatMathParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(VARIABLE);
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

	public static class Func_Context extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ChatMathParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ChatMathParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ChatMathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ChatMathParser.COMMA, i);
		}
		public Func_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterFunc_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitFunc_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitFunc_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_Context func_() throws RecognitionException {
		Func_Context _localctx = new Func_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			funcname();
			setState(76);
			match(LPAREN);
			setState(77);
			expression();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(78);
				match(COMMA);
				setState(79);
				expression();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(RPAREN);
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

	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(ChatMathParser.COS, 0); }
		public TerminalNode TAN() { return getToken(ChatMathParser.TAN, 0); }
		public TerminalNode SIN() { return getToken(ChatMathParser.SIN, 0); }
		public TerminalNode ACOS() { return getToken(ChatMathParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(ChatMathParser.ATAN, 0); }
		public TerminalNode ASIN() { return getToken(ChatMathParser.ASIN, 0); }
		public TerminalNode LOG() { return getToken(ChatMathParser.LOG, 0); }
		public TerminalNode LN() { return getToken(ChatMathParser.LN, 0); }
		public TerminalNode SQRT() { return getToken(ChatMathParser.SQRT, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COS) | (1L << SIN) | (1L << TAN) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << LN) | (1L << LOG) | (1L << SQRT))) != 0)) ) {
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ChatMathParser.EQ, 0); }
		public TerminalNode GT() { return getToken(ChatMathParser.GT, 0); }
		public TerminalNode LT() { return getToken(ChatMathParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatMathListener ) ((ChatMathListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatMathVisitor ) return ((ChatMathVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
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
		"\u0004\u0001\u001b\\\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002(\b\u0002\n\u0002\f\u0002+\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u00030\b\u0003\n\u0003\f\u00033\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004;\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005D\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\tQ\b\t\n\t\f\tT\t\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0005\u0001\u0000"+
		"\f\r\u0001\u0000\u000e\u000f\u0001\u0000\u0016\u0018\u0001\u0000\u0001"+
		"\t\u0001\u0000\u0010\u0012Y\u0000\u0018\u0001\u0000\u0000\u0000\u0002"+
		"\u001c\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006,\u0001"+
		"\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000"+
		"\fE\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010I\u0001"+
		"\u0000\u0000\u0000\u0012K\u0001\u0000\u0000\u0000\u0014W\u0001\u0000\u0000"+
		"\u0000\u0016Y\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000"+
		"\u0019\u001a\u0003\u0016\u000b\u0000\u001a\u001b\u0003\u0002\u0001\u0000"+
		"\u001b\u0001\u0001\u0000\u0000\u0000\u001c!\u0003\u0004\u0002\u0000\u001d"+
		"\u001e\u0007\u0000\u0000\u0000\u001e \u0003\u0004\u0002\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000$)\u0003\u0006\u0003\u0000%&\u0007\u0001\u0000"+
		"\u0000&(\u0003\u0006\u0003\u0000\'%\u0001\u0000\u0000\u0000(+\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0005"+
		"\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,1\u0003\b\u0004\u0000"+
		"-.\u0005\u0015\u0000\u0000.0\u0003\b\u0004\u0000/-\u0001\u0000\u0000\u0000"+
		"03\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u00002\u0007\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0005"+
		"\f\u0000\u00005;\u0003\b\u0004\u000067\u0005\r\u0000\u00007;\u0003\b\u0004"+
		"\u00008;\u0003\u0012\t\u00009;\u0003\n\u0005\u0000:4\u0001\u0000\u0000"+
		"\u0000:6\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000;\t\u0001\u0000\u0000\u0000<D\u0003\f\u0006\u0000=D\u0003"+
		"\u0010\b\u0000>D\u0003\u000e\u0007\u0000?@\u0005\n\u0000\u0000@A\u0003"+
		"\u0002\u0001\u0000AB\u0005\u000b\u0000\u0000BD\u0001\u0000\u0000\u0000"+
		"C<\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000"+
		"\u0000C?\u0001\u0000\u0000\u0000D\u000b\u0001\u0000\u0000\u0000EF\u0005"+
		"\u001a\u0000\u0000F\r\u0001\u0000\u0000\u0000GH\u0007\u0002\u0000\u0000"+
		"H\u000f\u0001\u0000\u0000\u0000IJ\u0005\u0019\u0000\u0000J\u0011\u0001"+
		"\u0000\u0000\u0000KL\u0003\u0014\n\u0000LM\u0005\n\u0000\u0000MR\u0003"+
		"\u0002\u0001\u0000NO\u0005\u0013\u0000\u0000OQ\u0003\u0002\u0001\u0000"+
		"PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000UV\u0005\u000b\u0000\u0000V\u0013\u0001\u0000\u0000\u0000"+
		"WX\u0007\u0003\u0000\u0000X\u0015\u0001\u0000\u0000\u0000YZ\u0007\u0004"+
		"\u0000\u0000Z\u0017\u0001\u0000\u0000\u0000\u0006!)1:CR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}