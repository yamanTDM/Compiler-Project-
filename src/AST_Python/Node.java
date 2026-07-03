package AST_Python;

import Visitor.ASTVisitor;

public abstract class Node {
    private final int line;
    private final String name;
    public Node(int line, String name) {
        this.line = line;
        this.name = name;
    }

    public String getNodeName() {
        return name;
    }
    public int getLine() {
        return line;
    }

    public String print(String indent){
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        String GREEN  = "\u001B[32m";
        return indent + RED+ "line- " + this.line + " | " + GREEN + "name- " + this.name + " " + RESET;
    }

    @Override
    public String toString() {
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        String GREEN  = "\u001B[32m";
        return RED + "line- " + this.line + " | " + GREEN + "name- " + this.name + " "+ RESET;
    }
    public abstract <T> T accept(ASTVisitor<T> visitor);

}
