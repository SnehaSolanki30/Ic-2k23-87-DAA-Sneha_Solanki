import java.util.Arrays;
import java.util.Comparator;

public class KruskalsAlgorithm {

    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static int find(int parent[], int x) {

        if (parent[x] != x)
            parent[x] = find(parent, parent[x]);

        return parent[x];
    }

    static void union(int parent[], int a, int b) {

        int rootA = find(parent, a);
        int rootB = find(parent, b);

        parent[rootA] = rootB;
    }

    public static void main(String[] args) {

        int vertices = 4;

        Edge edges[] = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };

        Arrays.sort(edges, Comparator.comparingInt(e -> e.weight));

        int parent[] = new int[vertices];

        for (int i = 0; i < vertices; i++)
            parent[i] = i;

        int totalWeight = 0;
        int edgeCount = 0;

        System.out.println("Minimum Spanning Tree:");

        for (Edge e : edges) {

            int a = find(parent, e.src);
            int b = find(parent, e.dest);

            if (a != b) {

                union(parent, a, b);

                System.out.println(
                    e.src + " - " + e.dest +
                    " : " + e.weight
                );

                totalWeight += e.weight;
                edgeCount++;

                if (edgeCount == vertices - 1)
                    break;
            }
        }

        if (edgeCount != vertices - 1) {
            System.out.println("Graph is disconnected.");
        } else {
            System.out.println("Total Weight = " + totalWeight);
        }
    }
}
