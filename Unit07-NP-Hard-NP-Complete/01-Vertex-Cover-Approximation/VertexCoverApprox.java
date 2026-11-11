import java.util.*;

public class VertexCoverApprox {

    static class Edge {
        int u, v;

        Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }
    }

    public static void vertexCover(int vertices, Edge[] edges) {

        boolean[] selected = new boolean[vertices];

        System.out.println("Selected Edges:");

        for (Edge edge : edges) {

            // Select both endpoints if neither is covered
            if (!selected[edge.u] && !selected[edge.v]) {

                selected[edge.u] = true;
                selected[edge.v] = true;

                System.out.println(
                    edge.u + " - " + edge.v
                );
            }
        }

        System.out.print("Vertex Cover: ");

        int count = 0;

        for (int i = 0; i < vertices; i++) {

            if (selected[i]) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Cover Size = " + count);
    }

    public static void main(String[] args) {

        int vertices = 5;

        Edge[] edges = {
            new Edge(0, 1),
            new Edge(0, 2),
            new Edge(1, 2),
            new Edge(1, 3),
            new Edge(3, 4)
        };

        vertexCover(vertices, edges);
    }
}
