public class HamiltonianCycle {

    static int V = 5;

    static int[][] graph = {
        {0, 1, 0, 1, 0},
        {1, 0, 1, 1, 1},
        {0, 1, 0, 0, 1},
        {1, 1, 0, 0, 1},
        {0, 1, 1, 1, 0}
    };

    static int[] path = new int[V];

    static boolean isSafe(int vertex, int position) {

        // Check connection with previous vertex
        if (graph[path[position - 1]][vertex] == 0) {
            return false;
        }

        // Check whether vertex is already used
        for (int i = 0; i < position; i++) {
            if (path[i] == vertex) {
                return false;
            }
        }

        return true;
    }

    static boolean solveHamiltonian(int position) {

        // All vertices are included
        if (position == V) {

            // Check edge back to starting vertex
            return graph[path[position - 1]][path[0]] == 1;
        }

        for (int vertex = 1; vertex < V; vertex++) {

            if (isSafe(vertex, position)) {

                path[position] = vertex;

                if (solveHamiltonian(position + 1)) {
                    return true;
                }

                // Backtracking
                path[position] = -1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        for (int i = 0; i < V; i++) {
            path[i] = -1;
        }

        // Start from vertex 0
        path[0] = 0;

        if (solveHamiltonian(1)) {

            System.out.println("Hamiltonian Cycle:");

            for (int i = 0; i < V; i++) {
                System.out.print(path[i] + " -> ");
            }

            System.out.println(path[0]);

        } else {
            System.out.println("No Hamiltonian Cycle exists.");
        }
    }
}
