package QuickSort;

/**
 * Created by corycordell on 2/11/17.
 */
public class QuickSort {
    public static void sort(int[] ar, int p, int r) {
        if(p < r) {
            int q = partition(ar, p, r);
            if(p < q) sort(ar, p, q - 1);
            if(q < r) sort(ar, (q + 1), r);
        }
    }

    private static int partition(int[] ar, int p, int r) {
        int x = ar[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if(ar[j] <= x) {
                i++;
                exchange(ar, i, j);
            }
        }
        exchange(ar, i + 1, r);
        return i + 1;
    }

    private static void exchange(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
