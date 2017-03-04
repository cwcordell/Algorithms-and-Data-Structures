package Sorts.InsertionSort;

/**
 * Created by corycordell on 1/28/17.
 */
public class InsertionSort {
    public static void sort(int[] ar) {
        for(int j = 1; j < ar.length; j++) {
            int key = ar[j];
            int i = j - 1;
            while(i >= 0 && ar[i] > key) {
                ar[i + 1] = ar[i];
                i--;
            }
            ar[i + 1] = key;
        }
    }
}
