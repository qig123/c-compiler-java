package core;

import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import core.ast.Exp;
import core.ast.NodeKind;
import parser.ExprBaseVisitor;
import parser.ExprParser;
import parser.ExprParser.AddContext;
import parser.ExprParser.AssignContext;
import parser.ExprParser.EqualityContext;
import parser.ExprParser.ExprContext;
import parser.ExprParser.Label_p0Context;
import parser.ExprParser.Label_p1Context;
import parser.ExprParser.Lable_identContext;
import parser.ExprParser.MulContext;
import parser.ExprParser.ProgramContext;
import parser.ExprParser.RelationalContext;
import parser.ExprParser.StmtContext;
import parser.ExprParser.UnaryContext;
import java.util.ArrayList;

public class BuildAst extends ExprBaseVisitor<Exp> {
    private List<String> vars = new ArrayList<>();
    private int offset = 0; // 变量保存index;

    private void clearEnv() {
        vars.clear();
        offset = 0;
    }

    // program: stmt*;
    @Override
    public Exp visitProgram(ProgramContext ctx) {
        clearEnv();
        List<Exp> exps = new ArrayList<>();
        for (StmtContext stmtContext : ctx.stmt()) {
            exps.add(visit(stmtContext));
        }
        Exp exp = new Exp();
        exp.setExps(exps);
        return exp;
    }

    // stmt: expr ';'
    @Override
    public Exp visitStmt(StmtContext ctx) {
        return visit(ctx.expr());
    }

    // expr: assign;
    @Override
    public Exp visitExpr(ExprContext ctx) {
        return visit(ctx.assign());
    }

    // assign: equality ('=' assign)?;
    @Override
    public Exp visitAssign(AssignContext ctx) {
        Exp ast = visit(ctx.equality());
        for (int j = 1; j < ctx.getChildCount(); j++) {
            Object obj = ctx.getChild(j);
            if (obj instanceof TerminalNodeImpl) {
                // t = (TerminalNodeImpl) obj;
            } else {
                ast = new Exp(ast, visit(ctx.assign()), NodeKind.ND_ASSIGN);
            }
        }
        return ast;
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

    @Override
    public Exp visitLable_ident(Lable_identContext ctx) {
        Token t = ctx.start;
        String x = t.getText();
        char charAt = x.charAt(0);
        char b = 'a';
        int off = (charAt - b + 1) * 8;
        Exp e = new Exp(NodeKind.ND_LVAR, off);
        return e;

    }

}
