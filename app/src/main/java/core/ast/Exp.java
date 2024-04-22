package core.ast;

public class Exp {
    private NodeKind kind;
    private Exp left;
    private Exp right;
    private int value;

    public Exp(Exp left, Exp right, NodeKind kind) {
        this.left = left;
        this.right = right;
        this.kind = kind;
    }

    public Exp(int value) {
        this.value = value;
        this.kind = NodeKind.ND_NUM;
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

}
