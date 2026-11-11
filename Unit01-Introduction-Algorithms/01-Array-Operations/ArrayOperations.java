import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Display array
        System.out.print("Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        // Display sum
        System.out.println("\nSum = " + sum);

        // Search for an element
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position " + (position + 1));
        }
        sc.close();
    }
}
