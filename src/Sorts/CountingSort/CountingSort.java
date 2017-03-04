package Sorts.CountingSort;

/**
 * Created by corycordell on 2/11/17.
 */
public class CountingSort {
    public static int[] sort(int[] ar, int[] ba, int k) {
        int[] ct = new int[k + 1];
        for (int i = 0; i < ar.length; i++)
            ct[ar[i]] = ct[ar[i]] + 1;

        for (int i = 1; i <= k ; i++)
            ct[i] = ct[i] + ct[i - 1];

        for (int i = ar.length - 1; i >= 0; i--) {
            ba[ct[ar[i]] - 1] = ar[i];
            ct[ar[i]] -= 1;
        }

        return ba;
    }
}
