import java.util.*;

public class DFSExample {
    // Graph represented as adjacency list
    // ArrayList of ArrayLists - each index is a node, 
    // and its ArrayList contains its neighbors
    private ArrayList<ArrayList<Integer>> graph;
    private boolean[] visited; // tracks which nodes we've seen
    
    public DFSExample(int vertices) {
        graph = new ArrayList<>();
        visited = new boolean[vertices];
        
        // Create empty lists for each vertex
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }
    
    // Add an edge between two nodes
    public void addEdge(int from, int to) {
        graph.get(from).add(to);
    }
    
    // The main DFS function - recursive approach
    public void dfs(int node) {
        // Step 1: Mark current node as visited
        visited[node] = true;
        System.out.print(node + " ");
        
        // Step 2: Visit all unvisited neighbors
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor); // Recursive call - go deeper!
            }
        }
        // Step 3: When we finish all neighbors, we automatically backtrack
    }
    
    public static void main(String[] args) {
        // Create a graph with 5 vertices (0 to 4)
        DFSExample g = new DFSExample(5);
        
        // Add edges to create this graph:
        //     0
        //    / \
        //   1   2
        //  /   / \
        // 3   4   (back to 1)
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 1);
        
        System.out.println("DFS starting from node 0:");
        g.dfs(0);
        // Output might be: 0 1 3 2 4
    }
}