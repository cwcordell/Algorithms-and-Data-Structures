package Sorts.InsertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by corycordell on 1/28/17.
 */
public class InsertionSortTest {
    @Test
    public void sort() throws Exception {
        int[] ar = {5,3,6,1,4,2};
        InsertionSort.sort(ar);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, ar);
    }

    @Test
    public void sortSorted() throws Exception {
        int[] ar = {1,2,3,4,5,6};
        InsertionSort.sort(ar);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, ar);
    }

    @Test
    public void sortReverseSorted() throws Exception {
        int[] ar = {6,5,4,3,2,1};
        InsertionSort.sort(ar);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, ar);
    }
}