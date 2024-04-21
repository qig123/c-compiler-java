package core;

import parser.ExprBaseListener;
import parser.ExprParser;
import parser.ExprParser.Label_add_subContext;
import parser.ExprParser.Label_intContext;
import parser.ExprParser.Label_mul_divContext;
import parser.ExprParser.Label_statContext;

/*生成汇编代码 */
public class GenCoder extends ExprBaseListener {

    @Override
    public void enterLabel_stat(Label_statContext ctx) {
        System.out.println(".intel_syntax noprefix");
        System.out.println(".globl main");
        System.out.println("main:");
        super.enterLabel_stat(ctx);
    }

    @Override
    public void exitLabel_int(Label_intContext ctx) {
        System.out.println("  push " + Integer.valueOf(ctx.INT().getText()));
        super.exitLabel_int(ctx);
    }

    @Override
    public void exitLabel_stat(Label_statContext ctx) {
        System.out.println("  pop rax");
        System.out.println("  ret");
        super.exitLabel_stat(ctx);
    }

    // expr op = ('+' | '-') expr # label_add_sub
    @Override
    public void exitLabel_add_sub(Label_add_subContext ctx) {
        System.out.println("  pop rdi");
        System.out.println("  pop rax");
        if (ctx.op.getType() == ExprParser.ADD) {
            System.out.println("  add rax, rdi");
        } else {
            System.out.println("  sub rax, rdi");
        }
        System.out.println("  push rax");
        super.exitLabel_add_sub(ctx);
    }

    // expr op = ('*' | '/') expr # label_mul_div
    @Override
    public void exitLabel_mul_div(Label_mul_divContext ctx) {
        System.out.println("  pop rdi");
        System.out.println("  pop rax");
        if (ctx.op.getType() == ExprParser.MUL) {
            System.out.println("  imul rax, rdi");
        } else {
            System.out.println("  cqo");
            System.out.println("  idiv rdi");
        }
        System.out.println("  push rax");
        super.exitLabel_mul_div(ctx);
    }

}
