public class MatrixChainMultiplication {

    public static int matrixChain(int[] p) {

        int n = p.length - 1;
        int[][] dp = new int[n + 1][n + 1];

        for (int length = 2; length <= n; length++) {

            for (int i = 1; i <= n - length + 1; i++) {

                int j = i + length - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {

                    int cost = dp[i][k] + dp[k + 1][j]
                        + p[i - 1] * p[k] * p[j];

                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        return dp[1][n];
    }

    public static void main(String[] args) {

        int[] dimensions = {10, 20, 30, 40, 30};

        int result = matrixChain(dimensions);

        System.out.println(
            "Minimum Multiplication Cost = " + result
        );
    }
}
