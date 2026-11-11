public class BinarySearchDC {

    // Divide and Conquer Binary Search
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) return -1; // Base case: element not found

        int mid = low + (high - low) / 2; // Divide step

        if (arr[mid] == key) return mid; // Conquer step

        // Divide & Conquer into subarrays
        return (arr[mid] > key) 
            ? binarySearch(arr, low, mid - 1, key) 
            : binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int key = 44;

        int index = binarySearch(arr, 0, arr.length - 1, key);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
