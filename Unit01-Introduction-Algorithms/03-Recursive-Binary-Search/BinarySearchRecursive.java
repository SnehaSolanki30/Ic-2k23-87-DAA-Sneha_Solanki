import java.util.Scanner;
import java.util.Arrays;

public class RecursiveBinarySearch {
    // This method searches a sorted array using recursion
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) return mid;
        if (arr[mid] < key) {
            return binarySearch(arr, mid + 1, high, key);
        }
        return binarySearch(arr, low, mid - 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, 0, n - 1, key);
        if (result == -1) System.out.println("Element not found.");
        else System.out.println("Element found at sorted position " + (result + 1));

        sc.close();
    }
}
