package AST;

import Visitor.ASTVisitorJinja;

import java.util.List;

public abstract class Node {
    public int line;
    public String name;

    public Node(int line, String name ) {
        this.line = line;
        this.name = name;
    }

    public String getNodeName() {
        return name;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        String GREEN  = "\u001B[32m";
        return RED + "line" +this.line + "- "+ GREEN + this.name + " " + RESET;
    }

    public abstract List<Node> getChildrenSearch();
    public abstract <T> T accept(ASTVisitorJinja<T> visitor);

}

