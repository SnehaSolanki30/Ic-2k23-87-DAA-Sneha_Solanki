public class SubsetSum {

    static boolean found = false;

    static void findSubset(
        int[] arr,
        int index,
        int target,
        int sum,
        String result) {

        if (sum == target) {
            System.out.println("Subset: " + result);
            found = true;
            return;
        }

        if (index == arr.length || sum > target) {
            return;
        }

        // Include current element
        findSubset(
            arr,
            index + 1,
            target,
            sum + arr[index],
            result + arr[index] + " "
        );

        // Exclude current element
        findSubset(
            arr,
            index + 1,
            target,
            sum,
            result
        );
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 2};
        int target = 9;

        System.out.println("Target Sum = " + target);

        findSubset(arr, 0, target, 0, "");

        if (!found) {
            System.out.println("No subset found.");
        }
    }
}
