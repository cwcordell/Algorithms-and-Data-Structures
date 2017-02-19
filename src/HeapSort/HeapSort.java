package HeapSort;

/**
 * Created by corycordell on 2/5/17.
 */
public class HeapSort {
    private static int heapSize;

    public static void sort(int[] ar) {
        heapSize = ar.length - 1;
        buildMaxHeap(ar);

        for (int i = ar.length - 1; i > 0; i--) {
            exchange(ar, 0, i);
            heapSize--;
            maxHeapify(ar, 0);
        }
    }

    private static void buildMaxHeap(int[] ar) {
        for (int i = ar.length/2; i >= 0; i--) {
            maxHeapify(ar, i);
        }
    }

    private static void maxHeapify(int[] ar, int i) {
        int left = 2 * i + 1;
        int right = left + 1;
        int largest = i;

        if( left <= heapSize && ar[left] > ar[i] ) {
            largest = left;
        }

        if( right <= heapSize && ar[right] > ar[largest] ) {
            largest = right;
        }

        if( largest != i ) {
            exchange(ar, i, largest);
            maxHeapify(ar, largest);
        }
    }

    private static void exchange(int[] ar, int i, int largest) {
        int temp = ar[i];
        ar[i] = ar[largest];
        ar[largest] = temp;
    }
}
