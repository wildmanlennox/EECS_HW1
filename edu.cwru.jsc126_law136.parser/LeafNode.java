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
    
    private final Token token;
    
    //constructor
    private LeafNode (Token coin)
    {
        token = coin;
    }
    
    //token getter
    public Token getToken()
    {
        return token;
    }
    
    public LeafNode build()
    {
        if (token != null)
            return new LeafNode(token);
        else
            throw new NullPointerException(); 
    }
    
    public String toString()
    {
        return "[" + token.toString() + ",";
    }
    
    public List<Token> toList()
    {
        List<Token> leaf = new LinkedList<Token>();
        leaf.add(token);
        return leaf;
    }
    
}
