package Sorts.BubbleSort;

/**
 * Created by corycordell on 1/29/17.
 */
public class BubbleSort {
    public static void sort(int[] ar) {
        int temp;
        for(int i = 0; i < ar.length; i++) {
            for(int j = ar.length - 1; j > i; j--) {
                if(ar[j] < ar[j-1]) {
                    temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                }
            }
        }
    }
}
