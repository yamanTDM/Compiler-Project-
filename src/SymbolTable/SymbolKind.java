package SymbolTable;
public enum SymbolKind {
    FUNCTION,    // def foo(...)
    PARAMETER,   // formal parameter inside a function
    VARIABLE,    // assigned name  (simple or augmented)
    LOOP_VAR,    // loop variable in a comp_for / list comprehension
    BLOCK,        // {% block name %}
    TEMPLATE
    }