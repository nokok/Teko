// Generated from Teko.g4 by ANTLR 4.8
package org.tekolang.frontend.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TekoParser}.
 */
public interface TekoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TekoParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(TekoParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(TekoParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(TekoParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(TekoParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#typeDefBody}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefBody(TekoParser.TypeDefBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#typeDefBody}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefBody(TekoParser.TypeDefBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TekoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TekoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#entryPointBlock}.
	 * @param ctx the parse tree
	 */
	void enterEntryPointBlock(TekoParser.EntryPointBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#entryPointBlock}.
	 * @param ctx the parse tree
	 */
	void exitEntryPointBlock(TekoParser.EntryPointBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#initBlock}.
	 * @param ctx the parse tree
	 */
	void enterInitBlock(TekoParser.InitBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#initBlock}.
	 * @param ctx the parse tree
	 */
	void exitInitBlock(TekoParser.InitBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TekoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TekoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(TekoParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(TekoParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(TekoParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(TekoParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(TekoParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(TekoParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TekoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TekoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(TekoParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#opExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(TekoParser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(TekoParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(TekoParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(TekoParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(TekoParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TekoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TekoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#nl}.
	 * @param ctx the parse tree
	 */
	void enterNl(TekoParser.NlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#nl}.
	 * @param ctx the parse tree
	 */
	void exitNl(TekoParser.NlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TekoParser#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(TekoParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TekoParser#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(TekoParser.NewLineContext ctx);
}
