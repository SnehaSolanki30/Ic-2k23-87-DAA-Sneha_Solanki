import java.util.Arrays;

public class DijkstrasAlgorithm {

    static final int INF = 999999;

    public static void main(String[] args) {

        int graph[][] = {
            {0, 4, 0, 0, 0, 0},
            {4, 0, 8, 0, 0, 0},
            {0, 8, 0, 7, 0, 4},
            {0, 0, 7, 0, 9, 14},
            {0, 0, 0, 9, 0, 10},
            {0, 0, 4, 14, 10, 0}
        };

        int n = graph.length;

        int distance[] = new int[n];
        boolean visited[] = new boolean[n];

        Arrays.fill(distance, INF);

        int source = 0;
        distance[source] = 0;

        for (int count = 0; count < n - 1; count++) {

            int u = -1;

            for (int i = 0; i < n; i++) {
                if (!visited[i] &&
                    (u == -1 || distance[i] < distance[u])) {
                    u = i;
                }
            }

            if (u == -1 || distance[u] == INF)
                break;

            visited[u] = true;

            for (int v = 0; v < n; v++) {

                if (!visited[v] &&
                    graph[u][v] > 0 &&
                    distance[u] + graph[u][v] < distance[v]) {

                    distance[v] =
                        distance[u] + graph[u][v];
                }
            }
        }

        System.out.println("Shortest distances from vertex " + source);

        for (int i = 0; i < n; i++) {

            if (distance[i] == INF)
                System.out.println(i + " : Unreachable");
            else
                System.out.println(i + " : " + distance[i]);
        }
    }
}
