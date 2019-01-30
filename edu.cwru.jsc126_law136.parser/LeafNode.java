/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cwru.jsc126_law136.parser;
import java.util.*;

/**
 *
 * @author wildm
 */
public final class LeafNode implements Node {
    
    private final Token = null;
    
    //constructor
    private LeafNode (Token coin)
    {
        Token = coin;
    }
    
    //token getter
    public Token getToken()
    {
        return Token;
    }
    
    public LeafNode build()
    {
        if (Token != null)
            return new LeafNode(Token);
        else
            throw new NullPointerException(); 
    }
    
    public String toString()
    {
        return "[" + Token.toString() + ",";
    }
    
    public List<Token> toList()
    {
        List<Token> leaf = new LinkedList<Token>();
        leaf.add(Token);
        return leaf;
    }
    
}
