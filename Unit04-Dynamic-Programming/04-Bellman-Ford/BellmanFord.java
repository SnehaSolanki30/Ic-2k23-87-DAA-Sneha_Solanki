import java.util.Arrays;

public class BellmanFord {

    static class Edge {
        int source, destination, weight;

        Edge(int s, int d, int w) {
            source = s;
            destination = d;
            weight = w;
        }
    }

    public static void bellmanFord(
        int vertices, Edge[] edges, int source) {

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        // Relax all edges V-1 times
        for (int i = 1; i < vertices; i++) {

            boolean updated = false;

            for (Edge edge : edges) {

                if (distance[edge.source] != Integer.MAX_VALUE
                    && distance[edge.source] + edge.weight
                    < distance[edge.destination]) {

                    distance[edge.destination] =
                        distance[edge.source] + edge.weight;

                    updated = true;
                }
            }

            if (!updated) {
                break;
            }
        }

        // Check for negative weight cycle
        for (Edge edge : edges) {

            if (distance[edge.source] != Integer.MAX_VALUE
                && distance[edge.source] + edge.weight
                < distance[edge.destination]) {

                System.out.println(
                    "Negative Weight Cycle Detected"
                );
                return;
            }
        }

        System.out.println("Vertex\tDistance");

        for (int i = 0; i < vertices; i++) {

            System.out.print(i + "\t");

            if (distance[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        Edge[] edges = {
            new Edge(0, 1, -1),
            new Edge(0, 2, 4),
            new Edge(1, 2, 3),
            new Edge(1, 3, 2),
            new Edge(1, 4, 2),
            new Edge(3, 2, 5),
            new Edge(3, 1, 1),
            new Edge(4, 3, -3)
        };

        bellmanFord(vertices, edges, 0);
    }
}
