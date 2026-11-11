import java.util.*;

public class ConnectedComponents {

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

    public static void findComponents(
        List<List<Integer>> graph) {

        int vertices = graph.size();

        boolean[] visited = new boolean[vertices];

        int count = 0;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                count++;

                System.out.print("Component " + count + ": ");

                dfs(graph, i, visited);

                System.out.println();
            }
        }

        System.out.println(
            "Total Connected Components = " + count
        );
    }

    public static void main(String[] args) {

        int vertices = 7;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // First component
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(2).add(1);

        // Second component
        graph.get(3).add(4);
        graph.get(4).add(3);

        // Vertex 5 and 6 are isolated

        findComponents(graph);
    }
}
