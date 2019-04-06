/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package P1.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * An implementation of Graph.
 * 
 * <p>PS2 instructions: you MUST use the provided rep.
 */
public class ConcreteEdgesGraph<String> implements Graph<String> {
    
    private final Set<String> vertices = new HashSet<>();
    private final List<Edge> edges = new ArrayList<>();
    
    // Abstraction function:
    //   TODO
    // Representation invariant:
    //   TODO
    // Safety from rep exposure:
    //   TODO
    
    // TODO constructor
   
    // TODO checkRep
    
    @Override public boolean add(String vertex) {
       if(vertices.contains(vertex)) {
    	   return false;
       }
       else {
    	   vertices.add(vertex);
    	  return true;
       }
    }
    
    @Override public int set(String source, String target, int weight) {
		
    }
    
    @Override public boolean remove(String vertex) {
    	int i;
        if(vertices.contains(vertex))
        {
        	
        	 // delate related edges
        	for(i=0;i<edges.size();i++)
        	{
        		if(edges.get(i).Source(String)||edges.get(i).Target(String)) {
        			edges.remove(edges.get(i));
        		}
        	}
        	vertices.remove(vertex);
        	return true;
        }
        else 
        {
        	return false;
        }
    }
    
    @Override public Set<String> vertices() {
        return Collections.unmodifiableSet(vertices);
    }
    
    @Override public Map<String, Integer> sources(String target) {
       return edges.stream()
    		   .filter(edge->edge.getTarget().equals(target))
    		   .collect(Collectors.toMap(Edge::getSource, Edge::getWeight));
       
    }
    
    @Override public Map<String, Integer> targets(String source) {
    	
    }
    
    // TODO toString()
    
}

/**
 * TODO specification
 * Immutable.
 * This class is internal to the rep of ConcreteEdgesGraph.
 * 
 * <p>PS2 instructions: the specification and implementation of this class is
 * up to you.
 */
class Edge<L> {
    
    // TODO fields
    private String source;
    private String target;
    private int weight;
    // Abstraction function:
    public Edge(String source,String target,int weight)
    {
    	this.source = source;
    	this.target=target;
    	this.weight=weight;
    	
    }
    //   TODO
    // Representation invariant:
    //   TODO
    // Safety from rep exposure:
    //   TODO
	
    
    // TODO constructor
    
    // TODO checkRep
   
    
		
		

    // TODO methods
    
    public Object Target(String source) {
		// TODO Auto-generated method stub
    	if(source==null)
    	{
    		return null;
    	}
    	else {
    		{
    			targetVertex.getTargets(getter);
    			
    		}
		}
		
	}


	public Object Source(String target) {
		// TODO Auto-generated method stub
		if(target==null)
		{
			return null;
		}
		else {
			targetVertex.getSources(getter);
		}
	}


// TODO toString()
   public String toString() {
	   String string = this.getSource()+"->"+this.getTarget()+":"+this.getWeight();
	   return string;
   }
}
