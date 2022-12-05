package graph;



public class mainGraph {
 public static void main(String[] args) {
   Graph graph = new Graph(5);

   graph.addVertex("A");
   graph.addVertex("B");
   graph.addVertex("C");
   graph.addVertex("D");
   graph.addVertex("E");

   graph.addEdge(0, 1, 8);
   graph.addEdge(0, 2, 5);
   graph.addEdge(1, 2, 1);
   graph.addEdge(1, 3, 2);
   graph.addEdge(2, 3, 3);
   graph.addEdge(3, 4, 4);
   graph.addEdge(4, 4, 0);
   
   
   graph.printEdge();
   graph.calculateGraph();
   graph.printGraph();
   
   graph.printGraph();
   
   // graph.removeEdge(2, 3);

   // graph.checkWeight(2, 3);

   graph.route(0, 4);

   // graph.printGraph();

    try {
      
    } catch (Exception e) {
      System.out.println("ERROR");
    }
    

 }   
}
