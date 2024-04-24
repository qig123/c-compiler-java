package core.ast;

import java.util.List;
import java.util.ArrayList;

public class Exp {
    private NodeKind kind;
    private List<Exp> exps = new ArrayList<>();;
    private Exp left; // 二元表达式使用
    private Exp right;
    private int value;

    private int offset; // 赋值表达式使用

    // if 结构使用
    private Exp cond_exp;
    private Exp then_exp;
    private Exp else_exp;

    // if构建
    // public Exp(Exp c, Exp t, Exp e) {
    // this.cond_exp = c;
    // this.then_exp = t;
    // this.else_exp = e;
    // this.kind = NodeKind.ND_IF;
    // }

    public Exp(Exp left, Exp right, NodeKind kind) {
        this.left = left;
        this.right = right;
        this.kind = kind;
    }

    // 变量的构筑
    public Exp(NodeKind kind, int offset) {
        this.kind = kind;
        this.offset = offset;
    }

    public Exp(int value) {
        this.value = value;
        this.kind = NodeKind.ND_NUM;
    }

    public Exp() {

    }

    public Exp getLeft() {
        return left;
    }

    public Exp getRight() {
        return right;
    }

    public NodeKind getKind() {
        return kind;
    }

    public int getValue() {
        return value;
    }

    public int getOffset() {
        return offset;
    }

    public List<Exp> getExps() {
        return exps;
    }

    public void setExps(List<Exp> exps) {
        this.exps = exps;
    }

    public Exp getCond_exp() {
        return cond_exp;
    }

    public Exp getThen_exp() {
        return then_exp;
    }

    public Exp getElse_exp() {
        return else_exp;
    }

    public void setKind(NodeKind kind) {
        this.kind = kind;
    }

    public void setLeft(Exp left) {
        this.left = left;
    }

    public void setRight(Exp right) {
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setCond_exp(Exp cond_exp) {
        this.cond_exp = cond_exp;
    }

    public void setThen_exp(Exp then_exp) {
        this.then_exp = then_exp;
    }

    public void setElse_exp(Exp else_exp) {
        this.else_exp = else_exp;
    }

}
