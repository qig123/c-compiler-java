package core;

import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import core.ast.Exp;
import core.ast.NodeKind;
import parser.ExprBaseVisitor;
import parser.ExprParser;
import parser.ExprParser.AddContext;
import parser.ExprParser.EqualityContext;
import parser.ExprParser.ExprContext;
import parser.ExprParser.Label_p0Context;
import parser.ExprParser.Label_p1Context;
import parser.ExprParser.MulContext;
import parser.ExprParser.RelationalContext;
import parser.ExprParser.StatContext;
import parser.ExprParser.UnaryContext;

public class BuildAst extends ExprBaseVisitor<Exp> {

    @Override
    public Exp visitStat(StatContext ctx) {
        return visit(ctx.expr());
    }

    // expr: equality;
    @Override
    public Exp visitExpr(ExprContext ctx) {
        return visit(ctx.equality());
    }

    // equality: relational ('==' relational | '!=' relational)*;
    @Override
    public Exp visitEquality(EqualityContext ctx) {
        Exp ast = visit(ctx.relational(0));
        TerminalNodeImpl t = null;
        int i = 1;
        for (int j = 1; j < ctx.getChildCount(); j++) {
            Object obj = ctx.getChild(j);
            if (obj instanceof TerminalNodeImpl) {
                t = (TerminalNodeImpl) obj;
            } else {
                if (t.getSymbol().getType() == ExprParser.EQ) {
                    ast = new Exp(ast, visit(ctx.relational(i)), NodeKind.ND_EQ);
                } else {
                    ast = new Exp(ast, visit(ctx.relational(i)), NodeKind.ND_NE);
                }
                i++;
            }
        }
        return ast;
    }

    // relational: add ('<' add | '<=' add | '>' add | '>=' add)*;
    @Override
    public Exp visitRelational(RelationalContext ctx) {
        Exp ast = visit(ctx.add(0));
        TerminalNodeImpl t = null;
        int i = 1;
        for (int j = 1; j < ctx.getChildCount(); j++) {
            Object obj = ctx.getChild(j);
            if (obj instanceof TerminalNodeImpl) {
                t = (TerminalNodeImpl) obj;
            } else {
                if (t.getSymbol().getType() == ExprParser.LT) {
                    ast = new Exp(ast, visit(ctx.add(i)), NodeKind.ND_LESS);
                } else if (t.getSymbol().getType() == ExprParser.LE) {
                    ast = new Exp(ast, visit(ctx.add(i)), NodeKind.ND_LESS_EQ);
                } else if (t.getSymbol().getType() == ExprParser.ME) { // 大于等于
                    ast = new Exp(ast, visit(ctx.add(i)), NodeKind.ND_MORE_EQ);
                } else {
                    ast = new Exp(ast, visit(ctx.add(i)), NodeKind.ND_MORE);
                }
                i++;
            }
        }
        return ast;
    }

    // add: mul ( '+' mul | '-' mul)*;
    @Override
    public Exp visitAdd(AddContext ctx) {
        Exp ast = visit(ctx.mul(0));
        TerminalNodeImpl t = null;
        int i = 1;
        for (int j = 1; j < ctx.getChildCount(); j++) {
            Object obj = ctx.getChild(j);
            if (obj instanceof TerminalNodeImpl) {
                t = (TerminalNodeImpl) obj;
            } else {
                if (t.getSymbol().getType() == ExprParser.ADD) {
                    ast = new Exp(ast, visit(ctx.mul(i)), NodeKind.ND_ADD);
                } else {
                    ast = new Exp(ast, visit(ctx.mul(i)), NodeKind.ND_SUB);
                }
                i++;
            }
        }
        return ast;
    }

    // mul: unary ('*' unary | '/' unary)*;
    @Override
    public Exp visitMul(MulContext ctx) {
        Exp ast = visit(ctx.unary(0));
        TerminalNodeImpl t = null;
        int i = 1;
        for (int j = 1; j < ctx.getChildCount(); j++) {
            Object obj = ctx.getChild(j);
            if (obj instanceof TerminalNodeImpl) {
                t = (TerminalNodeImpl) obj;
            } else {
                if (t.getSymbol().getType() == ExprParser.MUL) {
                    ast = new Exp(ast, visit(ctx.unary(i)), NodeKind.ND_MUL);
                } else {
                    ast = new Exp(ast, visit(ctx.unary(i)), NodeKind.ND_DIV);
                }
                i++;
            }
        }
        return ast;
    }

    // unary: ('+' | '-')* primary;
    @Override
    public Exp visitUnary(UnaryContext ctx) {
        Exp ast = visit(ctx.primary());
        if (ctx.op == null) {
            return ast;
        } else {
            TerminalNodeImpl t = null;
            for (int j = 0; j < ctx.getChildCount(); j++) {
                Object obj = ctx.getChild(j);
                if (obj instanceof TerminalNodeImpl) {
                    t = (TerminalNodeImpl) obj;
                    if (t.getSymbol().getType() == ExprParser.ADD) {
                        ast = new Exp(new Exp(0), ast, NodeKind.ND_ADD);
                    } else {
                        ast = new Exp(new Exp(0), ast, NodeKind.ND_SUB);
                    }
                }
            }
            return ast;
        }
    }

    @Override
    public Exp visitLabel_p0(Label_p0Context ctx) {
        return new Exp(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Exp visitLabel_p1(Label_p1Context ctx) {
        return visit(ctx.expr());
    }

}
