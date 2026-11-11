import java.util.Scanner;
import java.util.Arrays;

public class IterativeBinarySearch {
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
        System.out.println("Enter elements (any order):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Binary Search requires sorted data
        Arrays.sort(arr);

        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        int found = -1;

        // Repeatedly search the left or right half
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                found = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found == -1) System.out.println("Element not found.");
        else System.out.println("Element found at sorted position " + (found + 1));

        sc.close();
    }
}
