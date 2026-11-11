import java.util.*;

public class TSPApprox {

    static class Edge {
        int u, v, weight;

        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    static int find(int[] parent, int x) {

        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }

        return parent[x];
    }

    static void union(int[] parent, int[] rank, int x, int y) {

        int rootX = find(parent, x);
        int rootY = find(parent, y);

        if (rootX == rootY) {
            return;
        }

        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    public static void tspApprox(int[][] graph) {

        int n = graph.length;

        List<Edge> edges = new ArrayList<>();

        // Create all undirected edges
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (graph[i][j] < 0 ||
                    graph[i][j] != graph[j][i]) {
                    throw new IllegalArgumentException(
                        "Graph must be symmetric with non-negative weights."
                    );
                }

                edges.add(new Edge(i, j, graph[i][j]));
            }
        }

        // Sort edges by weight
        edges.sort(Comparator.comparingInt(e -> e.weight));

        int[] parent = new int[n];
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        List<List<Integer>> mst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mst.add(new ArrayList<>());
        }

        int count = 0;

        // Construct MST using Kruskal's algorithm
        for (Edge edge : edges) {

            int u = edge.u;
            int v = edge.v;

            if (find(parent, u) != find(parent, v)) {

                union(parent, rank, u, v);

                mst.get(u).add(v);
                mst.get(v).add(u);

                count++;

                if (count == n - 1) {
                    break;
                }
            }
        }

        if (count != n - 1) {
            System.out.println("Graph is not connected.");
            return;
        }

        boolean[] visited = new boolean[n];
        List<Integer> tour = new ArrayList<>();

        // Preorder traversal of MST
        preorder(0, mst, visited, tour);

        // Return to starting city
        tour.add(0);

        int totalCost = 0;

        System.out.println("Approximate TSP Tour:");

        for (int i = 0; i < tour.size(); i++) {

            System.out.print(tour.get(i));

            if (i < tour.size() - 1) {
                System.out.print(" -> ");
                totalCost += graph[tour.get(i)][tour.get(i + 1)];
            }
        }

        System.out.println();
        System.out.println("Approximate Tour Cost = " + totalCost);
    }

    static void preorder(
        int vertex,
        List<List<Integer>> mst,
        boolean[] visited,
        List<Integer> tour) {

        visited[vertex] = true;
        tour.add(vertex);

        for (int neighbour : mst.get(vertex)) {

            if (!visited[neighbour]) {
                preorder(neighbour, mst, visited, tour);
            }
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };

        tspApprox(graph);
    }
}
