import java.util.Arrays;
import java.util.Random;

public class PerformanceAnalyzer {

    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearchRecursive(arr, left, mid - 1, target);
        return binarySearchRecursive(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 500000};
        Random rand = new Random();

        System.out.printf("%-12s %-25s %-25s%n", "Input Size", "Iterative Time (ns)", "Recursive Time (ns)");
        System.out.println("------------------------------------------------------------------");

        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = rand.nextInt(1000000);
            Arrays.sort(arr);

            int target = arr[n - 1]; // Worst case (last element)

            // Iterative Timing
            long startIter = System.nanoTime();
            binarySearchIterative(arr, target);
            long endIter = System.nanoTime();
            long timeIter = endIter - startIter;

            // Recursive Timing
            long startRec = System.nanoTime();
            binarySearchRecursive(arr, 0, n - 1, target);
            long endRec = System.nanoTime();
            long timeRec = endRec - startRec;

            System.out.printf("%-12d %-25d %-25d%n", n, timeIter, timeRec);
        }
    }
}
