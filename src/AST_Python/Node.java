package AST_Python;

public abstract class Node {
    int line;
    String name;
    public Node(int line, String name) {
        this.line = line;
        this.name = name;
    }
    public String print(String indent){
        return indent + "line- " + this.line + " | name- " + this.name + " ";
    }

    @Override
    public String toString() {
        return "line- " + this.line + " | name- " + this.name + " ";
    }
}
