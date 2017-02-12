package MergeSort;

/**
 * Created by corycordell on 1/28/17.
 */
public class MergeSort {
    public static void sort(int[] ar, int p, int r) {
        if(p < r) {
            int q =  (p + r) / 2;
            sort(ar, p, q);
            sort(ar, (q + 1), r);
            merge(ar, p, q, r);
        }
    }

    private static void merge(int[] ar, int p, int q, int r) {
        int x = q - p + 1;
        int y = r - q;
        int[] left = new int[x + 1];
        int[] right = new int[y + 1];
        left[x] = Integer.MAX_VALUE;
        right[y] = Integer.MAX_VALUE;

        for(int i = 0; i < x; i++) {
            left[i] = ar[p + i];
        }

        for(int i = 0; i < y; i++) {
            right[i] = ar[q + 1+ i];
        }

        int i = 0;
        int j = 0;
        for(int k = p; k <= r; k++) {
            if(i < left.length && left[i] <= right[j]) {
                ar[k] = left[i];
                i++;
            } else {
                ar[k] = right[j];
                j++;
            }
        }
    }
}
