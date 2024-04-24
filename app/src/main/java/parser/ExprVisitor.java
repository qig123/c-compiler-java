// Generated from /home/guo/javaplay/w1/app/src/main/java/parser/Expr.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_expr0}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_expr0(ExprParser.Stat_expr0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_return_exp}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_return_exp(ExprParser.Stat_return_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_if}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_if(ExprParser.Stat_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ExprParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(ExprParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(ExprParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ExprParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(ExprParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ExprParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code label_p0}
	 * labeled alternative in {@link ExprParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_p0(ExprParser.Label_p0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code label_p1}
	 * labeled alternative in {@link ExprParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_p1(ExprParser.Label_p1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lable_ident}
	 * labeled alternative in {@link ExprParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLable_ident(ExprParser.Lable_identContext ctx);
}