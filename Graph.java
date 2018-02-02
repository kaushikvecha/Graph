package barebones.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {
	private HashMap<String, Vertex> vertices;
	private HashMap<Integer, Edge> edges;
	
	Graph(ArrayList<Vertex> vertices){
		this.vertices=new HashMap<String,Vertex>();
		this .edges=new HashMap<Integer,Edge>();
		for(Vertex v:vertices)
			this.vertices.put(v.getIdentifier(), v);
	}
	 public boolean addEdge(Vertex v1, Vertex v2, int weight){
	        if(v1.equals(v2)){
	            return false;   
	        }
	    
	        Edge e = new Edge(v1, v2, weight);
	        if(edges.containsKey(e.hashCode())){
	            return false;
	        }
	       
	        else if(v1.containsEdge(e) || v2.containsEdge(e)){
	            return false;
	        }
	            
	        edges.put(e.hashCode(), e);
	        v1.addEdge(e);
	        v2.addEdge(e);
	        return true;
	    }

	    public boolean containsEdge(Edge e){
	        if(e.getV1() == null || e.getV2() == null){
	            return false;
	        }
	        
	        return this.edges.containsKey(e.hashCode());
	    }

	    public Edge removeEdge(Edge e){
	       e.getV1().removeEdge(e);
	       e.getV2().removeEdge(e);
	       return this.edges.remove(e.hashCode());
	    }
	
	    public boolean containsVertex(Vertex vertex){
	        return this.vertices.get(vertex.getIdentifier()) != null;
	    }

	    public Vertex getVertex(String identifier){
	        return vertices.get(identifier);
	    }


	    public Vertex removeVertex(String identifier){
	        Vertex v = vertices.remove(identifier);
	        
	        while(v.getEdgeCount() > 0){
	            this.removeEdge(v.getEdge((0)));
	        }
	        
	        return v;
	    }

	    public Set<String> vertexKeys(){
	        return this.vertices.keySet();
	    }
	
	    public Set<Edge> getEdges(){
	        return new HashSet<Edge>(this.edges.values());
	    }
	    
	
}
