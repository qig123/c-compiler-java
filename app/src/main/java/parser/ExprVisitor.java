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
	 * Visit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
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
}