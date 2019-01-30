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
public final class InternalNode implements Node {
    
    private final List<Node> children;
    
    //constructor
    public InternalNode(List<Node> kids)
    {
        children = kids;
    }
    
    //children getter
    public List<Node> getChildren()
    {
        return children;
    }
    
    public List<Token> toList()
    {
        List<Token> internal = new LinkedList<Token>();
        for (Node element: children)
            internal.add(element.toList());
    }
    
    private String output = null;
    //String for toString method
    public String toString()
    {
        if (output != null)
        {
            for (Node element: children)
                output += "[" + (element.toString()) + "]";
            
            return output;
        }
        //method previously invoked
        else
            return output;
    }    
}
