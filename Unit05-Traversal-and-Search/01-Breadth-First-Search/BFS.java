import java.util.*;

public class BFS {

    public static void bfs(
        List<List<Integer>> graph, int start) {

        int vertices = graph.size();
        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {

            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbour : graph.get(current)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
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

        bfs(graph, 0);
    }
}
