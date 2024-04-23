package core;

public class Var {
    private int offset;
    private String name;

    public Var(int offset, String name) {
        this.offset = offset;
        this.name = name;
    }

    public int getOffset() {
        return offset;
    }

    public String getName() {
        return name;
    }

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj) {
    // return true;
    // }
    // if (obj == null || getClass() != obj.getClass()) {
    // return false;
    // }
    // Var v = (Var) obj;
    // return name != null ? name.equals(v.name) : v.name == null;
    // }

}
