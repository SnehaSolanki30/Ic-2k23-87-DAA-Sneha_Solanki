import java.util.Arrays;

public class MergeSort {

    static void merge(int a[], int low, int mid, int high) {

        int temp[] = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {

            if (a[i] < a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while (i <= mid)
            temp[k++] = a[i++];

        while (j <= high)
            temp[k++] = a[j++];

        for (i = low; i <= high; i++)
            a[i] = temp[i - low];
    }

    static void sort(int a[], int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            sort(a, low, mid);
            sort(a, mid + 1, high);

            merge(a, low, mid, high);
        }
    }

    public static void main(String args[]) {

        int a[] = {8, 3, 5, 1, 9, 2};

        sort(a, 0, a.length - 1);

        System.out.println("Sorted Array:");

        System.out.println(Arrays.toString(a));
    }
}
