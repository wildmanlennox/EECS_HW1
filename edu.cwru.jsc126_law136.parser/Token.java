package edu.cwru.jsc126_law136.parser;

public interface Token{

    TerminalSymbol getType();

    boolean matches(TerminalSymbol type);
    
}
