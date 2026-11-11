public class GraphColoring {

    static int V = 4;
    static int M = 3;

    static int[] color = new int[V];

    static int[][] graph = {
        {0, 1, 1, 1},
        {1, 0, 1, 0},
        {1, 1, 0, 1},
        {1, 0, 1, 0}
    };

    static boolean isSafe(int vertex, int c) {

        for (int i = 0; i < V; i++) {

            if (graph[vertex][i] == 1 && color[i] == c) {
                return false;
            }
        }

        return true;
    }

    static boolean graphColoring(int vertex) {

        if (vertex == V) {
            return true;
        }

        for (int c = 1; c <= M; c++) {

            if (isSafe(vertex, c)) {

                color[vertex] = c;

                if (graphColoring(vertex + 1)) {
                    return true;
                }

                // Backtracking
                color[vertex] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        if (graphColoring(0)) {

            System.out.println("Graph Coloring Solution:");

            for (int i = 0; i < V; i++) {
                System.out.println(
                    "Vertex " + i + " -> Color " + color[i]
                );
            }

        } else {
            System.out.println(
                "Graph cannot be colored using " + M + " colors."
            );
        }
    }
}
