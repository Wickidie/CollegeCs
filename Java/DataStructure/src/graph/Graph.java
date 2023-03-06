package graph;

public class Graph {
    private int MAX_VERTEX;
    private int vertices;
    private int edges;
    private String vertex[];
    private int edge[][] = new int[7][3];
    private int weightGraph[][];

    public Graph(int MAX_VERTEX) {
        this.MAX_VERTEX = MAX_VERTEX; 
        vertex = new String[MAX_VERTEX];
        weightGraph = new int[MAX_VERTEX][MAX_VERTEX];
        init();
    }

    private void init() {
        for (int i = 0; i < MAX_VERTEX; i++) 
        {for (int j = 0; j < MAX_VERTEX; j++) {
                weightGraph[i][j] = -1;}}
    }

    public void addVertex(String name) {
        vertex[vertices] = name;
        vertices++;
    }

    public void addEdge(int from, int to, int weight) {
        edge[edges][0] = from;
        edge[edges][1] = to;
        edge[edges][2] = weight;
        edges++;
    }

    public void removeEdge(int from, int to) {
        weightGraph[from][to] = -1;
    }

    public void checkWeight(int from, int to){
        System.out.println(weightGraph[from][to]);
    }


    public void printEdge() {
        for (int i = 0; i < edge.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(edge[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void calculateGraph() {
        for (int i = 0; i < edge.length; i++) {
            weightGraph[edge[i][0]][edge[i][1]] = edge[i][2]; 
        }
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(weightGraph[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
