// Generated from Teko.g4 by ANTLR 4.8
package org.tekolang.frontend.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TekoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TekoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TekoParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(TekoParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(TekoParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#typeDefBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefBody(TekoParser.TypeDefBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TekoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#entryPointBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryPointBlock(TekoParser.EntryPointBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#initBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitBlock(TekoParser.InitBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TekoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(TekoParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(TekoParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(TekoParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TekoParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(TekoParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(TekoParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(TekoParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TekoParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#nl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNl(TekoParser.NlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TekoParser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(TekoParser.NewLineContext ctx);
}
