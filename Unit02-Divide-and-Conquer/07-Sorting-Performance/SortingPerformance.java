import java.util.Random;

public class SortingPerformance {

    static void mergeSort(int a[], int l, int r) {
        if (l >= r) return;

        int m = (l + r) / 2;

        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);

        int[] t = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            t[k++] = a[i] <= a[j] ? a[i++] : a[j++];

        while (i <= m) t[k++] = a[i++];
        while (j <= r) t[k++] = a[j++];

        System.arraycopy(t, 0, a, l, t.length);
    }

    static void quickSort(int a[], int l, int r) {
        if (l >= r) return;

        int pivot = a[r], i = l - 1;

        for (int j = l; j < r; j++) {
            if (a[j] <= pivot) {
                i++;
                int t = a[i]; a[i] = a[j]; a[j] = t;
            }
        }

        int t = a[i + 1];
        a[i + 1] = a[r];
        a[r] = t;

        quickSort(a, l, i);
        quickSort(a, i + 2, r);
    }

    static void heapify(int a[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1, r = 2 * i + 2;

        if (l < n && a[l] > a[largest]) largest = l;
        if (r < n && a[r] > a[largest]) largest = r;

        if (largest != i) {
            int t = a[i]; a[i] = a[largest]; a[largest] = t;
            heapify(a, n, largest);
        }
    }

    static void heapSort(int a[]) {
        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a, n, i);

        for (int i = n - 1; i > 0; i--) {
            int t = a[0]; a[0] = a[i]; a[i] = t;
            heapify(a, i, 0);
        }
    }

    public static void main(String args[]) {

        int sizes[] = {1000, 5000, 10000};

        Random random = new Random(10);

        System.out.println("Size | Merge(ns) | Quick(ns) | Heap(ns)");

        for (int n : sizes) {

            int original[] = new int[n];

            for (int i = 0; i < n; i++)
                original[i] = random.nextInt(100000);

            int a[] = original.clone();
            int b[] = original.clone();
            int c[] = original.clone();

            long start = System.nanoTime();
            mergeSort(a, 0, n - 1);
            long mergeTime = System.nanoTime() - start;

            start = System.nanoTime();
            quickSort(b, 0, n - 1);
            long quickTime = System.nanoTime() - start;

            start = System.nanoTime();
            heapSort(c);
            long heapTime = System.nanoTime() - start;

            System.out.println(n + " | " + mergeTime
                    + " | " + quickTime + " | " + heapTime);
        }
    }
}
