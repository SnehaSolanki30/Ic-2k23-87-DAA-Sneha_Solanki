import java.util.*;

public class TopologicalSort {

    public static void topologicalSort(
        List<List<Integer>> graph) {

        int vertices = graph.size();

        int[] indegree = new int[vertices];

        // Calculate indegree
        for (int i = 0; i < vertices; i++) {

            for (int neighbour : graph.get(i)) {
                indegree[neighbour]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add vertices with indegree zero
        for (int i = 0; i < vertices; i++) {

            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;

        System.out.println("Topological Sorting:");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");
            count++;

            for (int neighbour : graph.get(current)) {

                indegree[neighbour]--;

                if (indegree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }

        if (count != vertices) {
            System.out.println(
                "\nGraph contains a cycle. Topological sorting is not possible."
            );
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);

        topologicalSort(graph);
    }
}
