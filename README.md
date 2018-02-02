# Graph
Object oriented design of graph without duplicate edges and fast lookup of neighbours & fast lookup of vertices incident on edge!

Three Files 

1.Graph class which contains vertices and edges & addEdge(Vertex v1 , Vertex v2, int weight) method with other useful methods.

2.Vertex class with constructor a identifier for each vertex and edges of that vertex. containsEdge(e) method for fast lookup of edge and
  several other methods for operations.
  
3.Edge class with constructor to define edge with two vertices and weight of edge and methods for operations such as getting adjacent vertex of edge,getters,setters & compareTo for comapring weights. hashcode() method enables us to have unique edges in the graph.
