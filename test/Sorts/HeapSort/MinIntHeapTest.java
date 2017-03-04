package Sorts.HeapSort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by corycordell on 1/29/17.
 */
public class MinIntHeapTest {

    @Test
    public void sort() throws Exception {
        int[] ar = {3,5,6,1,4,2};
        MinIntHeap mih = new MinIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, mih.getSortedArray());
    }

    @Test
    public void sortOddCount() throws Exception {
        int[] ar = {5,3,6,1,4,2,0};
        MinIntHeap mih = new MinIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{0,1,2,3,4,5,6}, mih.getSortedArray());
    }

    @Test
    public void sortSorted() throws Exception {
        int[] ar = {1,2,3,4,5,6};
        MinIntHeap mih = new MinIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, mih.getSortedArray());
    }

    @Test
    public void sortReverseSorted() throws Exception {
        int[] ar = {6,5,4,3,2,1};
        MinIntHeap mih = new MinIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, mih.getSortedArray());
    }

    @Test
    public void sortNonConsecutive() throws Exception {
        int[] ar = {43,1,56,32,97,434,31,99,4};
        MinIntHeap mih = new MinIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{1, 4, 31, 32, 43, 56, 97, 99, 434}, mih.getSortedArray());
    }

    @Test
    public void sortNegativeInts() throws Exception {
        int[] ar = {-43,-1,-56,-32,-97,-434,-31,-99,-4};
        MinIntHeap mih = new MinIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{-434,-99,-97,-56,-43,-32,-31,-4,-1}, mih.getSortedArray());
    }

    @Test
    public void sortPositiveAndNegativeInts() throws Exception {
        int[] ar = {-43,-1,-56,32,-97,0,434,-31,-99,4};
        MinIntHeap mih = new MinIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{-99,-97,-56,-43,-31,-1,0,4,32,434}, mih.getSortedArray());
    }

    @Test
    public void sortSingleValue() throws Exception {
        int[] ar = {22};
        MinIntHeap mih = new MinIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{22}, mih.getSortedArray());
    }

    @Test
    public void sortNoValue() throws Exception {
        int[] ar = {};
        MinIntHeap mih = new MinIntHeap();
        mih.sortArray(ar);
        assertArrayEquals(new int[]{}, mih.getSortedArray());
    }
}