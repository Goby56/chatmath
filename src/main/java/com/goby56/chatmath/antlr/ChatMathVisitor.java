// Generated from D:/Github/chatmath/src/main/java/com/goby56/chatmath/antlr\ChatMath.g4 by ANTLR 4.10.1
package com.goby56.chatmath.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChatMathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChatMathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(ChatMathParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ChatMathParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(ChatMathParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(ChatMathParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(ChatMathParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ChatMathParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(ChatMathParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ChatMathParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ChatMathParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#func_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_(ChatMathParser.Func_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(ChatMathParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatMathParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(ChatMathParser.RelopContext ctx);
}