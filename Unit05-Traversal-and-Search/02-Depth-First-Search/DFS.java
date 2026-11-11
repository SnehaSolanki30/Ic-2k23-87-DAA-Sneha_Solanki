import java.util.*;

public class DFS {

    public static void dfs(
        List<List<Integer>> graph,
        int vertex,
        boolean[] visited) {

        visited[vertex] = true;

        System.out.print(vertex + " ");

        for (int neighbour : graph.get(vertex)) {

            if (!visited[neighbour]) {
                dfs(graph, neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(5);

        boolean[] visited = new boolean[vertices];

        System.out.println("DFS Traversal:");

        dfs(graph, 0, visited);

        System.out.println();
    }
}
