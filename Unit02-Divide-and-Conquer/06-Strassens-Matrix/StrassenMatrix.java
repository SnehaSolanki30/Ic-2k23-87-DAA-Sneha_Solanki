import java.util.Scanner;

public class StrassensMatrix {

    static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }

    static int[][] sub(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];

        return C;
    }

    static int[][] multiply(int[][] A, int[][] B) {

        int n = A.length;
        int[][] C = new int[n][n];

        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int m = n / 2;

        int[][] A11 = new int[m][m];
        int[][] A12 = new int[m][m];
        int[][] A21 = new int[m][m];
        int[][] A22 = new int[m][m];

        int[][] B11 = new int[m][m];
        int[][] B12 = new int[m][m];
        int[][] B21 = new int[m][m];
        int[][] B22 = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {

                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + m];
                A21[i][j] = A[i + m][j];
                A22[i][j] = A[i + m][j + m];

                B11[i][j] = B[i][j];
                B12[i][j] = B[i][j + m];
                B21[i][j] = B[i + m][j];
                B22[i][j] = B[i + m][j + m];
            }
        }

        int[][] M1 = multiply(add(A11, A22), add(B11, B22));
        int[][] M2 = multiply(add(A21, A22), B11);
        int[][] M3 = multiply(A11, sub(B12, B22));
        int[][] M4 = multiply(A22, sub(B21, B11));
        int[][] M5 = multiply(add(A11, A12), B22);
        int[][] M6 = multiply(sub(A21, A11), add(B11, B12));
        int[][] M7 = multiply(sub(A12, A22), add(B21, B22));

        int[][] C11 = add(sub(add(M1, M4), M5), M7);
        int[][] C12 = add(M3, M5);
        int[][] C21 = add(M2, M4);
        int[][] C22 = add(sub(add(M1, M3), M2), M6);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {

                C[i][j] = C11[i][j];
                C[i][j + m] = C12[i][j];
                C[i + m][j] = C21[i][j];
                C[i + m][j + m] = C22[i][j];
            }
        }

        return C;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (power of 2): ");
        int n = sc.nextInt();

        if (n <= 0 || (n & (n - 1)) != 0) {
            System.out.println("Size must be a positive power of 2.");
            sc.close();
            return;
        }

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                B[i][j] = sc.nextInt();

        int[][] C = multiply(A, B);

        System.out.println("Result:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(C[i][j] + " ");

            System.out.println();
        }

        sc.close();
    }
}
