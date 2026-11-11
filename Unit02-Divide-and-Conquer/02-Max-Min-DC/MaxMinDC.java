import java.util.Scanner;

public class MaxMinDC {

    static int[] findMinMax(int a[], int low, int high) {

        if (low == high)
            return new int[]{a[low], a[low]};

        if (high == low + 1) {
            int min = Math.min(a[low], a[high]);
            int max = Math.max(a[low], a[high]);
            return new int[]{min, max};
        }

        int mid = (low + high) / 2;

        int left[] = findMinMax(a, low, mid);
        int right[] = findMinMax(a, mid + 1, high);

        int min = Math.min(left[0], right[0]);
        int max = Math.max(left[1], right[1]);

        return new int[]{min, max};
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int result[] = findMinMax(a, 0, n - 1);

        System.out.println("Minimum = " + result[0]);
        System.out.println("Maximum = " + result[1]);

        sc.close();
    }
}
