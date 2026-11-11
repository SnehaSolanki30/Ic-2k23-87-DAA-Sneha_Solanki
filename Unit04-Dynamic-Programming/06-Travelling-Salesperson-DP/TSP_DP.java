import java.util.Arrays;

public class TSP_DP {

    static final int INF = 1000000000;

    public static int tsp(int[][] cost) {

        int n = cost.length;

        if (n == 0 || n > 20) {
            throw new IllegalArgumentException(
                "Number of cities must be between 1 and 20."
            );
        }

        int totalMasks = 1 << n;

        int[][] dp = new int[totalMasks][n];

        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        // Start from city 0
        dp[1][0] = 0;

        for (int mask = 1; mask < totalMasks; mask++) {

            for (int u = 0; u < n; u++) {

                if ((mask & (1 << u)) == 0 ||
                    dp[mask][u] == INF) {
                    continue;
                }

                for (int v = 0; v < n; v++) {

                    // Visit only unvisited cities
                    if ((mask & (1 << v)) == 0) {

                        int newMask = mask | (1 << v);

                        int newCost =
                            dp[mask][u] + cost[u][v];

                        dp[newMask][v] = Math.min(
                            dp[newMask][v],
                            newCost
                        );
                    }
                }
            }
        }

        // Return to starting city
        int fullMask = totalMasks - 1;
        int answer = INF;

        for (int i = 0; i < n; i++) {

            answer = Math.min(
                answer,
                dp[fullMask][i] + cost[i][0]
            );
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] cost = {
            {0,  10, 15, 20},
            {10, 0,  35, 25},
            {15, 35, 0,  30},
            {20, 25, 30, 0}
        };

        int result = tsp(cost);

        System.out.println(
            "Minimum Travelling Cost = " + result
        );
    }
}
