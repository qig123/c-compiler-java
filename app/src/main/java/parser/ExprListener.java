// Generated from /home/guo/javaplay/w1/app/src/main/java/parser/Expr.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code label_stat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLabel_stat(ExprParser.Label_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_stat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLabel_stat(ExprParser.Label_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLabel_parens(ExprParser.Label_parensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLabel_parens(ExprParser.Label_parensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_mul_div}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLabel_mul_div(ExprParser.Label_mul_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_mul_div}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLabel_mul_div(ExprParser.Label_mul_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_add_sub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLabel_add_sub(ExprParser.Label_add_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_add_sub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLabel_add_sub(ExprParser.Label_add_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLabel_int(ExprParser.Label_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLabel_int(ExprParser.Label_intContext ctx);
}