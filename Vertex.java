package barebones.graph;

import java.util.ArrayList;

public class Vertex {

    private ArrayList<Edge> edges;
    private String identifier;
    
    public Vertex(String identifier){
        this.identifier = identifier;
        this.edges = new ArrayList<Edge>();
    }
 
    public void addEdge(Edge e){
        if(this.edges.contains(e)){
            return;
        }
        
        this.edges.add(e);
    }
  
    public boolean containsEdge(Edge e){
        return this.edges.contains(e);
    }

    public Edge getEdge(int index){
        return this.edges.get(index);
    }
  
    Edge removeEdge(int index){
        return this.edges.remove(index);
    }
  
    public void removeEdge(Edge e){
        this.edges.remove(e);
    }
  
    public int getEdgeCount(){
        return this.edges.size();
    }
  
    public String getIdentifier(){
        return this.identifier;
    }
 
    public String toString(){
        return "Vertex " + identifier;
    }

    public int hashCode(){
        return this.identifier.hashCode();
    }
    
 
    public boolean equals(Object other){
        if(!(other instanceof Vertex)){
            return false;
        }
        
        Vertex v = (Vertex)other;
        return this.identifier.equals(v.identifier);
    }
  
    public ArrayList<Edge> getEdges(){
        return new ArrayList<Edge>(this.edges);
    }
    
}

