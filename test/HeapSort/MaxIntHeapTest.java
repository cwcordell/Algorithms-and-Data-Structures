/**
 * Created by corycordell on 1/29/17.
 */
package HeapSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxIntHeapTest {

    @Test
    public void sort() throws Exception {
        int[] ar = {3,5,6,1,4,2};
        MaxIntHeap mih = new MaxIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{6,5,4,3,2,1}, mih.getSortedArray());
    }

    @Test
    public void sortOddCount() throws Exception {
        int[] ar = {5,3,6,1,4,2,0};
        MaxIntHeap mih = new MaxIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{6,5,4,3,2,1,0}, mih.getSortedArray());
    }

    @Test
    public void sortSorted() throws Exception {
        int[] ar = {1,2,3,4,5,6};
        MaxIntHeap mih = new MaxIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{6,5,4,3,2,1}, mih.getSortedArray());
    }

    @Test
    public void sortReverseSorted() throws Exception {
        int[] ar = {6,5,4,3,2,1};
        MaxIntHeap mih = new MaxIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{6,5,4,3,2,1}, mih.getSortedArray());
    }

    @Test
    public void sortPositiveAndNegativeInts() throws Exception {
        int[] ar = {-43,-1,-56,32,-97,0,434,-31,-99,4};
        MaxIntHeap mih = new MaxIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{434,32,4,0,-1,-31,-43,-56,-97,-99}, mih.getSortedArray());
    }

    @Test
    public void sortSingleValue() throws Exception {
        int[] ar = {22};
        MaxIntHeap mih = new MaxIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{22}, mih.getSortedArray());
    }

    @Test
    public void sortNoValue() throws Exception {
        int[] ar = {};
        MaxIntHeap mih = new MaxIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{}, mih.getSortedArray());
    }
}