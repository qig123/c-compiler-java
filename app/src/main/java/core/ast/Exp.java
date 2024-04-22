package core.ast;

import java.util.List;
import java.util.ArrayList;

public class Exp {
    private NodeKind kind;
    private Exp left;
    private Exp right;
    private int value;
    private int offset;
    private List<Exp> exps = new ArrayList<>();;

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

}
