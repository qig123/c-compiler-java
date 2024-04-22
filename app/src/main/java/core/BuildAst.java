package core;

import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import core.ast.Exp;
import core.ast.NodeKind;
import parser.ExprBaseVisitor;
import parser.ExprParser;
import parser.ExprParser.ExprContext;
import parser.ExprParser.Label_p0Context;
import parser.ExprParser.Label_p1Context;
import parser.ExprParser.MulContext;
import parser.ExprParser.StatContext;
import parser.ExprParser.UnaryContext;

public class BuildAst extends ExprBaseVisitor<Exp> {

    @Override
    public Exp visitStat(StatContext ctx) {
        return visit(ctx.expr());
    }
    // expr: mul (op = '+' mul | op = '-' mul)*;

    @Override
    public Exp visitExpr(ExprContext ctx) {
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
