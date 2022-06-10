// Generated from D:/Github/chatmath/src/main/java/com/goby56/chatmath/antlr\ChatMath.g4 by ANTLR 4.10.1
package com.goby56.chatmath.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChatMathParser}.
 */
public interface ChatMathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(ChatMathParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(ChatMathParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ChatMathParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ChatMathParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(ChatMathParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(ChatMathParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(ChatMathParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(ChatMathParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(ChatMathParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(ChatMathParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ChatMathParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ChatMathParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(ChatMathParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(ChatMathParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ChatMathParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ChatMathParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ChatMathParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ChatMathParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#func_}.
	 * @param ctx the parse tree
	 */
	void enterFunc_(ChatMathParser.Func_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#func_}.
	 * @param ctx the parse tree
	 */
	void exitFunc_(ChatMathParser.Func_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(ChatMathParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(ChatMathParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatMathParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(ChatMathParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatMathParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(ChatMathParser.RelopContext ctx);
}